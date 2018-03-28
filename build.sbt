name := """starproj"""

version := "1.0"

scalaVersion := "2.11.11"

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-java8-compat" % "0.8.0",
  "com.typesafe.akka" %% "akka-actor" % "2.5.11",
  "com.typesafe.akka" %% "akka-slf4j" % "2.5.11",

  "ch.qos.logback" % "logback-classic" % "1.2.3",

  "com.typesafe.akka" %% "akka-testkit" % "2.5.11" % "test",
  "com.typesafe.akka" %% "akka-remote" % "2.5.11",
  "com.typesafe.akka" %% "akka-contrib" % "2.5.11",
  "com.typesafe.akka" %% "akka-cluster" % "2.5.11",
  "com.typesafe.akka" %% "akka-persistence" % "2.5.11",
  "com.typesafe.akka" %% "akka-agent" % "2.5.11",
  "com.typesafe.akka" %% "akka-http-experimental" % "2.4.11.2",
  "junit" % "junit" % "4.12" % "test",
  "com.syncthemall" % "boilerpipe" % "1.2.2",
  
  "com.google.protobuf" % "protobuf-java" % "3.5.1",
  "org.scala-lang" % "scala-library" % "2.11.11",
  "org.scala-lang" % "scala-reflect" % "2.11.11",
  "org.slf4j" % "slf4j-api" % "1.7.25",
  
  "com.novocode" % "junit-interface" % "0.11" % "test")
  


fork in run := true