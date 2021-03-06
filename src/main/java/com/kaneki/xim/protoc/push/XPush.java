// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: push/push.proto

package com.kaneki.xim.protoc.push;

public final class XPush {
  private XPush() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registry.add(com.kaneki.xim.protoc.push.XPush.kickOutPush);
  }
  /**
   * Protobuf enum {@code PushType}
   */
  public enum PushType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>PUSH_TYPE_KICK_OUT = 0;</code>
     */
    PUSH_TYPE_KICK_OUT(0, 0),
    ;

    /**
     * <code>PUSH_TYPE_KICK_OUT = 0;</code>
     */
    public static final int PUSH_TYPE_KICK_OUT_VALUE = 0;


    public final int getNumber() { return value; }

    public static PushType valueOf(int value) {
      switch (value) {
        case 0: return PUSH_TYPE_KICK_OUT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PushType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<PushType>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PushType>() {
            public PushType findValueByNumber(int number) {
              return PushType.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.kaneki.xim.protoc.push.XPush.getDescriptor().getEnumTypes().get(0);
    }

    private static final PushType[] VALUES = values();

    public static PushType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private PushType(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:PushType)
  }

  public interface PushOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Push)
      com.google.protobuf.GeneratedMessage.
          ExtendableMessageOrBuilder<Push> {

    /**
     * <code>required .PushType type = 1;</code>
     */
    boolean hasType();
    /**
     * <code>required .PushType type = 1;</code>
     */
    com.kaneki.xim.protoc.push.XPush.PushType getType();
  }
  /**
   * Protobuf type {@code Push}
   */
  public static final class Push extends
      com.google.protobuf.GeneratedMessage.ExtendableMessage<
        Push> implements
      // @@protoc_insertion_point(message_implements:Push)
      PushOrBuilder {
    // Use Push.newBuilder() to construct.
    private Push(com.google.protobuf.GeneratedMessage.ExtendableBuilder<com.kaneki.xim.protoc.push.XPush.Push, ?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Push(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Push defaultInstance;
    public static Push getDefaultInstance() {
      return defaultInstance;
    }

    public Push getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Push(
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
            case 8: {
              int rawValue = input.readEnum();
              com.kaneki.xim.protoc.push.XPush.PushType value = com.kaneki.xim.protoc.push.XPush.PushType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                type_ = value;
              }
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
      return com.kaneki.xim.protoc.push.XPush.internal_static_Push_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kaneki.xim.protoc.push.XPush.internal_static_Push_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kaneki.xim.protoc.push.XPush.Push.class, com.kaneki.xim.protoc.push.XPush.Push.Builder.class);
    }

    public static com.google.protobuf.Parser<Push> PARSER =
        new com.google.protobuf.AbstractParser<Push>() {
      public Push parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Push(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Push> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private com.kaneki.xim.protoc.push.XPush.PushType type_;
    /**
     * <code>required .PushType type = 1;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .PushType type = 1;</code>
     */
    public com.kaneki.xim.protoc.push.XPush.PushType getType() {
      return type_;
    }

    private void initFields() {
      type_ = com.kaneki.xim.protoc.push.XPush.PushType.PUSH_TYPE_KICK_OUT;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!extensionsAreInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      com.google.protobuf.GeneratedMessage
        .ExtendableMessage<com.kaneki.xim.protoc.push.XPush.Push>.ExtensionWriter extensionWriter =
          newExtensionWriter();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeEnum(1, type_.getNumber());
      }
      extensionWriter.writeUntil(536870912, output);
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, type_.getNumber());
      }
      size += extensionsSerializedSize();
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

    public static com.kaneki.xim.protoc.push.XPush.Push parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.kaneki.xim.protoc.push.XPush.Push parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.kaneki.xim.protoc.push.XPush.Push parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.kaneki.xim.protoc.push.XPush.Push parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.kaneki.xim.protoc.push.XPush.Push parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.kaneki.xim.protoc.push.XPush.Push parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.kaneki.xim.protoc.push.XPush.Push parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.kaneki.xim.protoc.push.XPush.Push parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.kaneki.xim.protoc.push.XPush.Push parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.kaneki.xim.protoc.push.XPush.Push parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.kaneki.xim.protoc.push.XPush.Push prototype) {
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
     * Protobuf type {@code Push}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.ExtendableBuilder<
          com.kaneki.xim.protoc.push.XPush.Push, Builder> implements
        // @@protoc_insertion_point(builder_implements:Push)
        com.kaneki.xim.protoc.push.XPush.PushOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.kaneki.xim.protoc.push.XPush.internal_static_Push_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.kaneki.xim.protoc.push.XPush.internal_static_Push_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.kaneki.xim.protoc.push.XPush.Push.class, com.kaneki.xim.protoc.push.XPush.Push.Builder.class);
      }

      // Construct using com.kaneki.xim.protoc.push.XPush.Push.newBuilder()
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
        type_ = com.kaneki.xim.protoc.push.XPush.PushType.PUSH_TYPE_KICK_OUT;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.kaneki.xim.protoc.push.XPush.internal_static_Push_descriptor;
      }

      public com.kaneki.xim.protoc.push.XPush.Push getDefaultInstanceForType() {
        return com.kaneki.xim.protoc.push.XPush.Push.getDefaultInstance();
      }

      public com.kaneki.xim.protoc.push.XPush.Push build() {
        com.kaneki.xim.protoc.push.XPush.Push result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.kaneki.xim.protoc.push.XPush.Push buildPartial() {
        com.kaneki.xim.protoc.push.XPush.Push result = new com.kaneki.xim.protoc.push.XPush.Push(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.kaneki.xim.protoc.push.XPush.Push) {
          return mergeFrom((com.kaneki.xim.protoc.push.XPush.Push)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.kaneki.xim.protoc.push.XPush.Push other) {
        if (other == com.kaneki.xim.protoc.push.XPush.Push.getDefaultInstance()) return this;
        if (other.hasType()) {
          setType(other.getType());
        }
        this.mergeExtensionFields(other);
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasType()) {
          
          return false;
        }
        if (!extensionsAreInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.kaneki.xim.protoc.push.XPush.Push parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.kaneki.xim.protoc.push.XPush.Push) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.kaneki.xim.protoc.push.XPush.PushType type_ = com.kaneki.xim.protoc.push.XPush.PushType.PUSH_TYPE_KICK_OUT;
      /**
       * <code>required .PushType type = 1;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .PushType type = 1;</code>
       */
      public com.kaneki.xim.protoc.push.XPush.PushType getType() {
        return type_;
      }
      /**
       * <code>required .PushType type = 1;</code>
       */
      public Builder setType(com.kaneki.xim.protoc.push.XPush.PushType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required .PushType type = 1;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = com.kaneki.xim.protoc.push.XPush.PushType.PUSH_TYPE_KICK_OUT;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Push)
    }

    static {
      defaultInstance = new Push(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:Push)
  }

  public static final int KICKOUTPUSH_FIELD_NUMBER = 100;
  /**
   * <code>extend .Push { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.kaneki.xim.protoc.push.XPush.Push,
      com.kaneki.xim.protoc.push.XKickOutPush.KickOutPush> kickOutPush = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        com.kaneki.xim.protoc.push.XKickOutPush.KickOutPush.class,
        com.kaneki.xim.protoc.push.XKickOutPush.KickOutPush.getDefaultInstance());
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Push_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Push_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017push/push.proto\032\030push/kick_out_push.pr" +
      "oto\")\n\004Push\022\027\n\004type\030\001 \002(\0162\t.PushType*\010\010d" +
      "\020\200\200\200\200\002*\"\n\010PushType\022\026\n\022PUSH_TYPE_KICK_OUT" +
      "\020\000:(\n\013kickOutPush\022\005.Push\030d \001(\0132\014.KickOut" +
      "PushB#\n\032com.kaneki.xim.protoc.pushB\005XPus" +
      "h"
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
          com.kaneki.xim.protoc.push.XKickOutPush.getDescriptor(),
        }, assigner);
    internal_static_Push_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Push_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Push_descriptor,
        new java.lang.String[] { "Type", });
    kickOutPush.internalInit(descriptor.getExtensions().get(0));
    com.kaneki.xim.protoc.push.XKickOutPush.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
