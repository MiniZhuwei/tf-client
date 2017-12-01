// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/worker.proto

package org.tensorflow.distruntime;

/**
 * Protobuf type {@code tensorflow.CreateWorkerSessionRequest}
 */
public  final class CreateWorkerSessionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.CreateWorkerSessionRequest)
    CreateWorkerSessionRequestOrBuilder {
  // Use CreateWorkerSessionRequest.newBuilder() to construct.
  private CreateWorkerSessionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateWorkerSessionRequest() {
    sessionHandle_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CreateWorkerSessionRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            sessionHandle_ = s;
            break;
          }
          case 18: {
            org.tensorflow.distruntime.ServerDef.Builder subBuilder = null;
            if (serverDef_ != null) {
              subBuilder = serverDef_.toBuilder();
            }
            serverDef_ = input.readMessage(org.tensorflow.distruntime.ServerDef.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(serverDef_);
              serverDef_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.distruntime.WorkerProtos.internal_static_tensorflow_CreateWorkerSessionRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.distruntime.WorkerProtos.internal_static_tensorflow_CreateWorkerSessionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.distruntime.CreateWorkerSessionRequest.class, org.tensorflow.distruntime.CreateWorkerSessionRequest.Builder.class);
  }

  public static final int SESSION_HANDLE_FIELD_NUMBER = 1;
  private volatile java.lang.Object sessionHandle_;
  /**
   * <pre>
   * Sessions are identified by a given handle.
   * </pre>
   *
   * <code>optional string session_handle = 1;</code>
   */
  public java.lang.String getSessionHandle() {
    java.lang.Object ref = sessionHandle_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sessionHandle_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Sessions are identified by a given handle.
   * </pre>
   *
   * <code>optional string session_handle = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSessionHandleBytes() {
    java.lang.Object ref = sessionHandle_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sessionHandle_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SERVER_DEF_FIELD_NUMBER = 2;
  private org.tensorflow.distruntime.ServerDef serverDef_;
  /**
   * <pre>
   * Defines the configuration of a TensorFlow worker.
   * </pre>
   *
   * <code>optional .tensorflow.ServerDef server_def = 2;</code>
   */
  public boolean hasServerDef() {
    return serverDef_ != null;
  }
  /**
   * <pre>
   * Defines the configuration of a TensorFlow worker.
   * </pre>
   *
   * <code>optional .tensorflow.ServerDef server_def = 2;</code>
   */
  public org.tensorflow.distruntime.ServerDef getServerDef() {
    return serverDef_ == null ? org.tensorflow.distruntime.ServerDef.getDefaultInstance() : serverDef_;
  }
  /**
   * <pre>
   * Defines the configuration of a TensorFlow worker.
   * </pre>
   *
   * <code>optional .tensorflow.ServerDef server_def = 2;</code>
   */
  public org.tensorflow.distruntime.ServerDefOrBuilder getServerDefOrBuilder() {
    return getServerDef();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getSessionHandleBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sessionHandle_);
    }
    if (serverDef_ != null) {
      output.writeMessage(2, getServerDef());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSessionHandleBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sessionHandle_);
    }
    if (serverDef_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getServerDef());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.tensorflow.distruntime.CreateWorkerSessionRequest)) {
      return super.equals(obj);
    }
    org.tensorflow.distruntime.CreateWorkerSessionRequest other = (org.tensorflow.distruntime.CreateWorkerSessionRequest) obj;

    boolean result = true;
    result = result && getSessionHandle()
        .equals(other.getSessionHandle());
    result = result && (hasServerDef() == other.hasServerDef());
    if (hasServerDef()) {
      result = result && getServerDef()
          .equals(other.getServerDef());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + SESSION_HANDLE_FIELD_NUMBER;
    hash = (53 * hash) + getSessionHandle().hashCode();
    if (hasServerDef()) {
      hash = (37 * hash) + SERVER_DEF_FIELD_NUMBER;
      hash = (53 * hash) + getServerDef().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.distruntime.CreateWorkerSessionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.CreateWorkerSessionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.CreateWorkerSessionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.CreateWorkerSessionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.CreateWorkerSessionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.CreateWorkerSessionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.distruntime.CreateWorkerSessionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.CreateWorkerSessionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.distruntime.CreateWorkerSessionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.CreateWorkerSessionRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.tensorflow.distruntime.CreateWorkerSessionRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code tensorflow.CreateWorkerSessionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.CreateWorkerSessionRequest)
      org.tensorflow.distruntime.CreateWorkerSessionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.distruntime.WorkerProtos.internal_static_tensorflow_CreateWorkerSessionRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.distruntime.WorkerProtos.internal_static_tensorflow_CreateWorkerSessionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.distruntime.CreateWorkerSessionRequest.class, org.tensorflow.distruntime.CreateWorkerSessionRequest.Builder.class);
    }

    // Construct using org.tensorflow.distruntime.CreateWorkerSessionRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      sessionHandle_ = "";

      if (serverDefBuilder_ == null) {
        serverDef_ = null;
      } else {
        serverDef_ = null;
        serverDefBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.distruntime.WorkerProtos.internal_static_tensorflow_CreateWorkerSessionRequest_descriptor;
    }

    public org.tensorflow.distruntime.CreateWorkerSessionRequest getDefaultInstanceForType() {
      return org.tensorflow.distruntime.CreateWorkerSessionRequest.getDefaultInstance();
    }

    public org.tensorflow.distruntime.CreateWorkerSessionRequest build() {
      org.tensorflow.distruntime.CreateWorkerSessionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.tensorflow.distruntime.CreateWorkerSessionRequest buildPartial() {
      org.tensorflow.distruntime.CreateWorkerSessionRequest result = new org.tensorflow.distruntime.CreateWorkerSessionRequest(this);
      result.sessionHandle_ = sessionHandle_;
      if (serverDefBuilder_ == null) {
        result.serverDef_ = serverDef_;
      } else {
        result.serverDef_ = serverDefBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.tensorflow.distruntime.CreateWorkerSessionRequest) {
        return mergeFrom((org.tensorflow.distruntime.CreateWorkerSessionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.distruntime.CreateWorkerSessionRequest other) {
      if (other == org.tensorflow.distruntime.CreateWorkerSessionRequest.getDefaultInstance()) return this;
      if (!other.getSessionHandle().isEmpty()) {
        sessionHandle_ = other.sessionHandle_;
        onChanged();
      }
      if (other.hasServerDef()) {
        mergeServerDef(other.getServerDef());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.tensorflow.distruntime.CreateWorkerSessionRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.distruntime.CreateWorkerSessionRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object sessionHandle_ = "";
    /**
     * <pre>
     * Sessions are identified by a given handle.
     * </pre>
     *
     * <code>optional string session_handle = 1;</code>
     */
    public java.lang.String getSessionHandle() {
      java.lang.Object ref = sessionHandle_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sessionHandle_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Sessions are identified by a given handle.
     * </pre>
     *
     * <code>optional string session_handle = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSessionHandleBytes() {
      java.lang.Object ref = sessionHandle_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sessionHandle_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Sessions are identified by a given handle.
     * </pre>
     *
     * <code>optional string session_handle = 1;</code>
     */
    public Builder setSessionHandle(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sessionHandle_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Sessions are identified by a given handle.
     * </pre>
     *
     * <code>optional string session_handle = 1;</code>
     */
    public Builder clearSessionHandle() {
      
      sessionHandle_ = getDefaultInstance().getSessionHandle();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Sessions are identified by a given handle.
     * </pre>
     *
     * <code>optional string session_handle = 1;</code>
     */
    public Builder setSessionHandleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sessionHandle_ = value;
      onChanged();
      return this;
    }

    private org.tensorflow.distruntime.ServerDef serverDef_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.distruntime.ServerDef, org.tensorflow.distruntime.ServerDef.Builder, org.tensorflow.distruntime.ServerDefOrBuilder> serverDefBuilder_;
    /**
     * <pre>
     * Defines the configuration of a TensorFlow worker.
     * </pre>
     *
     * <code>optional .tensorflow.ServerDef server_def = 2;</code>
     */
    public boolean hasServerDef() {
      return serverDefBuilder_ != null || serverDef_ != null;
    }
    /**
     * <pre>
     * Defines the configuration of a TensorFlow worker.
     * </pre>
     *
     * <code>optional .tensorflow.ServerDef server_def = 2;</code>
     */
    public org.tensorflow.distruntime.ServerDef getServerDef() {
      if (serverDefBuilder_ == null) {
        return serverDef_ == null ? org.tensorflow.distruntime.ServerDef.getDefaultInstance() : serverDef_;
      } else {
        return serverDefBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Defines the configuration of a TensorFlow worker.
     * </pre>
     *
     * <code>optional .tensorflow.ServerDef server_def = 2;</code>
     */
    public Builder setServerDef(org.tensorflow.distruntime.ServerDef value) {
      if (serverDefBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        serverDef_ = value;
        onChanged();
      } else {
        serverDefBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Defines the configuration of a TensorFlow worker.
     * </pre>
     *
     * <code>optional .tensorflow.ServerDef server_def = 2;</code>
     */
    public Builder setServerDef(
        org.tensorflow.distruntime.ServerDef.Builder builderForValue) {
      if (serverDefBuilder_ == null) {
        serverDef_ = builderForValue.build();
        onChanged();
      } else {
        serverDefBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Defines the configuration of a TensorFlow worker.
     * </pre>
     *
     * <code>optional .tensorflow.ServerDef server_def = 2;</code>
     */
    public Builder mergeServerDef(org.tensorflow.distruntime.ServerDef value) {
      if (serverDefBuilder_ == null) {
        if (serverDef_ != null) {
          serverDef_ =
            org.tensorflow.distruntime.ServerDef.newBuilder(serverDef_).mergeFrom(value).buildPartial();
        } else {
          serverDef_ = value;
        }
        onChanged();
      } else {
        serverDefBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Defines the configuration of a TensorFlow worker.
     * </pre>
     *
     * <code>optional .tensorflow.ServerDef server_def = 2;</code>
     */
    public Builder clearServerDef() {
      if (serverDefBuilder_ == null) {
        serverDef_ = null;
        onChanged();
      } else {
        serverDef_ = null;
        serverDefBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Defines the configuration of a TensorFlow worker.
     * </pre>
     *
     * <code>optional .tensorflow.ServerDef server_def = 2;</code>
     */
    public org.tensorflow.distruntime.ServerDef.Builder getServerDefBuilder() {
      
      onChanged();
      return getServerDefFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Defines the configuration of a TensorFlow worker.
     * </pre>
     *
     * <code>optional .tensorflow.ServerDef server_def = 2;</code>
     */
    public org.tensorflow.distruntime.ServerDefOrBuilder getServerDefOrBuilder() {
      if (serverDefBuilder_ != null) {
        return serverDefBuilder_.getMessageOrBuilder();
      } else {
        return serverDef_ == null ?
            org.tensorflow.distruntime.ServerDef.getDefaultInstance() : serverDef_;
      }
    }
    /**
     * <pre>
     * Defines the configuration of a TensorFlow worker.
     * </pre>
     *
     * <code>optional .tensorflow.ServerDef server_def = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.distruntime.ServerDef, org.tensorflow.distruntime.ServerDef.Builder, org.tensorflow.distruntime.ServerDefOrBuilder> 
        getServerDefFieldBuilder() {
      if (serverDefBuilder_ == null) {
        serverDefBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.distruntime.ServerDef, org.tensorflow.distruntime.ServerDef.Builder, org.tensorflow.distruntime.ServerDefOrBuilder>(
                getServerDef(),
                getParentForChildren(),
                isClean());
        serverDef_ = null;
      }
      return serverDefBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:tensorflow.CreateWorkerSessionRequest)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.CreateWorkerSessionRequest)
  private static final org.tensorflow.distruntime.CreateWorkerSessionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.distruntime.CreateWorkerSessionRequest();
  }

  public static org.tensorflow.distruntime.CreateWorkerSessionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateWorkerSessionRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateWorkerSessionRequest>() {
    public CreateWorkerSessionRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CreateWorkerSessionRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateWorkerSessionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateWorkerSessionRequest> getParserForType() {
    return PARSER;
  }

  public org.tensorflow.distruntime.CreateWorkerSessionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
