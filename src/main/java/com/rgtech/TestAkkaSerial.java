package com.rgtech;

import java.io.File;

import com.rgtech.bean.PbCustomer.Customer;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

import akka.actor.AbstractLoggingActor;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.serialization.Serialization;
import akka.serialization.SerializationExtension;
import akka.serialization.Serializer;

public class TestAkkaSerial {
	private static final Config config = ConfigFactory.parseFile(new File("serial.conf"));

	public static class ServerActor extends AbstractLoggingActor {

		private final Serializer serializer;

		public ServerActor(Serializer serializer) {
			this.serializer = serializer;
		}

		public Receive createReceive() {
			return receiveBuilder().match(byte[].class, message -> {
				Customer customer = (Customer) serializer.fromBinary((byte[]) message, Customer.class);
				sender().tell(serializer.toBinary(Customer.newBuilder().setAge(customer.getAge() + 1)
						.setTel("10000000000").setUsername(customer.getUsername()).build()), self());
			}).matchAny(o -> {
				log().error("received unknown message: {}", o);
				sender().tell(o, self());
			}).build();
		}
	}

	public static class ClientActor extends AbstractLoggingActor {
		private final Serializer serializer;
		private final ActorRef server;

		public ClientActor(Serializer serializer, ActorRef server) {
			this.serializer = serializer;
			this.server = server;
		}

		public Receive createReceive() {
			return receiveBuilder().matchEquals("start", d -> {
				for (int i = 0; i < 10; i++) {
					server.tell(
							serializer.toBinary(
									Customer.newBuilder().setUsername("Yang").setTel("136666666").setAge(i).build()),
							self());
					server.tell("msg", self());
				}
			}).match(byte[].class, message -> {
				Customer back = (Customer) serializer.fromBinary((byte[]) message, Customer.class);
				log().info("receive back proto msg :{}", back);
			}).matchAny(o -> {
				log().error("received unknown message: {}", o);
				unhandled(o);
			}).build();
		}
	}

	public static void main(String[] args) throws Exception {
		ActorSystem system = ActorSystem.create("example", config);
		Serialization serialization = SerializationExtension.get(system);
		final Serializer serializer = serialization.serializerFor(Customer.class);
		final ActorRef server = system.actorOf(Props.create(ServerActor.class, serializer), "server");
		final ActorRef client = system.actorOf(Props.create(ClientActor.class, serializer, server), "client");
		client.tell("start", ActorRef.noSender());
		system.whenTerminated();
	}
}