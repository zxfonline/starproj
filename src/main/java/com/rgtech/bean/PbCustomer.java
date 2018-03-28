// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/java/protos/Customer.proto

package com.rgtech.bean;

public final class PbCustomer {
  private PbCustomer() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface CustomerOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Customer)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string username = 1;</code>
     */
    boolean hasUsername();
    /**
     * <code>required string username = 1;</code>
     */
    java.lang.String getUsername();
    /**
     * <code>required string username = 1;</code>
     */
    com.google.protobuf.ByteString
        getUsernameBytes();

    /**
     * <code>required int32 age = 2;</code>
     */
    boolean hasAge();
    /**
     * <code>required int32 age = 2;</code>
     */
    int getAge();

    /**
     * <code>optional string tel = 3;</code>
     */
    boolean hasTel();
    /**
     * <code>optional string tel = 3;</code>
     */
    java.lang.String getTel();
    /**
     * <code>optional string tel = 3;</code>
     */
    com.google.protobuf.ByteString
        getTelBytes();
  }
  /**
   * Protobuf type {@code Customer}
   */
  public static final class Customer extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Customer)
      CustomerOrBuilder {
    // Use Customer.newBuilder() to construct.
    private Customer(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Customer(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Customer defaultInstance;
    public static Customer getDefaultInstance() {
      return defaultInstance;
    }

    public Customer getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Customer(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              username_ = bs;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              age_ = input.readInt32();
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              tel_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.rgtech.bean.PbCustomer.internal_static_Customer_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.rgtech.bean.PbCustomer.internal_static_Customer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.rgtech.bean.PbCustomer.Customer.class, com.rgtech.bean.PbCustomer.Customer.Builder.class);
    }

    public static com.google.protobuf.Parser<Customer> PARSER =
        new com.google.protobuf.AbstractParser<Customer>() {
      public Customer parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Customer(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Customer> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int USERNAME_FIELD_NUMBER = 1;
    private java.lang.Object username_;
    /**
     * <code>required string username = 1;</code>
     */
    public boolean hasUsername() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string username = 1;</code>
     */
    public java.lang.String getUsername() {
      java.lang.Object ref = username_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          username_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string username = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      java.lang.Object ref = username_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int AGE_FIELD_NUMBER = 2;
    private int age_;
    /**
     * <code>required int32 age = 2;</code>
     */
    public boolean hasAge() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 age = 2;</code>
     */
    public int getAge() {
      return age_;
    }

    public static final int TEL_FIELD_NUMBER = 3;
    private java.lang.Object tel_;
    /**
     * <code>optional string tel = 3;</code>
     */
    public boolean hasTel() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string tel = 3;</code>
     */
    public java.lang.String getTel() {
      java.lang.Object ref = tel_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          tel_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string tel = 3;</code>
     */
    public com.google.protobuf.ByteString
        getTelBytes() {
      java.lang.Object ref = tel_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tel_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      username_ = "";
      age_ = 0;
      tel_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasUsername()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasAge()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getUsernameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, age_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getTelBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getUsernameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, age_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getTelBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.rgtech.bean.PbCustomer.Customer parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.rgtech.bean.PbCustomer.Customer parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.rgtech.bean.PbCustomer.Customer parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.rgtech.bean.PbCustomer.Customer parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.rgtech.bean.PbCustomer.Customer parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.rgtech.bean.PbCustomer.Customer parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.rgtech.bean.PbCustomer.Customer parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.rgtech.bean.PbCustomer.Customer parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.rgtech.bean.PbCustomer.Customer parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.rgtech.bean.PbCustomer.Customer parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.rgtech.bean.PbCustomer.Customer prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Customer}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Customer)
        com.rgtech.bean.PbCustomer.CustomerOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.rgtech.bean.PbCustomer.internal_static_Customer_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.rgtech.bean.PbCustomer.internal_static_Customer_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.rgtech.bean.PbCustomer.Customer.class, com.rgtech.bean.PbCustomer.Customer.Builder.class);
      }

      // Construct using com.rgtech.bean.PbCustomer.Customer.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        username_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        age_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        tel_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.rgtech.bean.PbCustomer.internal_static_Customer_descriptor;
      }

      public com.rgtech.bean.PbCustomer.Customer getDefaultInstanceForType() {
        return com.rgtech.bean.PbCustomer.Customer.getDefaultInstance();
      }

      public com.rgtech.bean.PbCustomer.Customer build() {
        com.rgtech.bean.PbCustomer.Customer result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.rgtech.bean.PbCustomer.Customer buildPartial() {
        com.rgtech.bean.PbCustomer.Customer result = new com.rgtech.bean.PbCustomer.Customer(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.username_ = username_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.age_ = age_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.tel_ = tel_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.rgtech.bean.PbCustomer.Customer) {
          return mergeFrom((com.rgtech.bean.PbCustomer.Customer)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.rgtech.bean.PbCustomer.Customer other) {
        if (other == com.rgtech.bean.PbCustomer.Customer.getDefaultInstance()) return this;
        if (other.hasUsername()) {
          bitField0_ |= 0x00000001;
          username_ = other.username_;
          onChanged();
        }
        if (other.hasAge()) {
          setAge(other.getAge());
        }
        if (other.hasTel()) {
          bitField0_ |= 0x00000004;
          tel_ = other.tel_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasUsername()) {
          
          return false;
        }
        if (!hasAge()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.rgtech.bean.PbCustomer.Customer parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.rgtech.bean.PbCustomer.Customer) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object username_ = "";
      /**
       * <code>required string username = 1;</code>
       */
      public boolean hasUsername() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string username = 1;</code>
       */
      public java.lang.String getUsername() {
        java.lang.Object ref = username_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            username_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string username = 1;</code>
       */
      public com.google.protobuf.ByteString
          getUsernameBytes() {
        java.lang.Object ref = username_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          username_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string username = 1;</code>
       */
      public Builder setUsername(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        username_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string username = 1;</code>
       */
      public Builder clearUsername() {
        bitField0_ = (bitField0_ & ~0x00000001);
        username_ = getDefaultInstance().getUsername();
        onChanged();
        return this;
      }
      /**
       * <code>required string username = 1;</code>
       */
      public Builder setUsernameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        username_ = value;
        onChanged();
        return this;
      }

      private int age_ ;
      /**
       * <code>required int32 age = 2;</code>
       */
      public boolean hasAge() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 age = 2;</code>
       */
      public int getAge() {
        return age_;
      }
      /**
       * <code>required int32 age = 2;</code>
       */
      public Builder setAge(int value) {
        bitField0_ |= 0x00000002;
        age_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 age = 2;</code>
       */
      public Builder clearAge() {
        bitField0_ = (bitField0_ & ~0x00000002);
        age_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object tel_ = "";
      /**
       * <code>optional string tel = 3;</code>
       */
      public boolean hasTel() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string tel = 3;</code>
       */
      public java.lang.String getTel() {
        java.lang.Object ref = tel_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            tel_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string tel = 3;</code>
       */
      public com.google.protobuf.ByteString
          getTelBytes() {
        java.lang.Object ref = tel_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          tel_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string tel = 3;</code>
       */
      public Builder setTel(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        tel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string tel = 3;</code>
       */
      public Builder clearTel() {
        bitField0_ = (bitField0_ & ~0x00000004);
        tel_ = getDefaultInstance().getTel();
        onChanged();
        return this;
      }
      /**
       * <code>optional string tel = 3;</code>
       */
      public Builder setTelBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        tel_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Customer)
    }

    static {
      defaultInstance = new Customer(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:Customer)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Customer_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Customer_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#src/main/java/protos/Customer.proto\"6\n" +
      "\010Customer\022\020\n\010username\030\001 \002(\t\022\013\n\003age\030\002 \002(\005" +
      "\022\013\n\003tel\030\003 \001(\tB\035\n\017com.rgtech.beanB\nPbCust" +
      "omer"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_Customer_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Customer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Customer_descriptor,
        new java.lang.String[] { "Username", "Age", "Tel", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
