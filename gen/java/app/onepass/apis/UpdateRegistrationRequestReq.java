// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/organizer/service.proto

package app.onepass.apis;

/**
 * Protobuf type {@code hts.organizer.UpdateRegistrationRequestReq}
 */
public final class UpdateRegistrationRequestReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:hts.organizer.UpdateRegistrationRequestReq)
    UpdateRegistrationRequestReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateRegistrationRequestReq.newBuilder() to construct.
  private UpdateRegistrationRequestReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateRegistrationRequestReq() {
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateRegistrationRequestReq();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateRegistrationRequestReq(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {

            userId_ = input.readInt64();
            break;
          }
          case 16: {

            registeredUserId_ = input.readInt64();
            break;
          }
          case 24: {

            registeredEventId_ = input.readInt64();
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            status_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return app.onepass.apis.OrganizerProto.internal_static_hts_organizer_UpdateRegistrationRequestReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return app.onepass.apis.OrganizerProto.internal_static_hts_organizer_UpdateRegistrationRequestReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            app.onepass.apis.UpdateRegistrationRequestReq.class, app.onepass.apis.UpdateRegistrationRequestReq.Builder.class);
  }

  public static final int USER_ID_FIELD_NUMBER = 1;
  private long userId_;
  /**
   * <code>int64 user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  @java.lang.Override
  public long getUserId() {
    return userId_;
  }

  public static final int REGISTERED_USER_ID_FIELD_NUMBER = 2;
  private long registeredUserId_;
  /**
   * <code>int64 registered_user_id = 2 [json_name = "registeredUserId"];</code>
   * @return The registeredUserId.
   */
  @java.lang.Override
  public long getRegisteredUserId() {
    return registeredUserId_;
  }

  public static final int REGISTERED_EVENT_ID_FIELD_NUMBER = 3;
  private long registeredEventId_;
  /**
   * <code>int64 registered_event_id = 3 [json_name = "registeredEventId"];</code>
   * @return The registeredEventId.
   */
  @java.lang.Override
  public long getRegisteredEventId() {
    return registeredEventId_;
  }

  public static final int STATUS_FIELD_NUMBER = 4;
  private int status_;
  /**
   * <code>.hts.common.Status status = 4 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.hts.common.Status status = 4 [json_name = "status"];</code>
   * @return The status.
   */
  @java.lang.Override public app.onepass.apis.Status getStatus() {
    @SuppressWarnings("deprecation")
    app.onepass.apis.Status result = app.onepass.apis.Status.valueOf(status_);
    return result == null ? app.onepass.apis.Status.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (userId_ != 0L) {
      output.writeInt64(1, userId_);
    }
    if (registeredUserId_ != 0L) {
      output.writeInt64(2, registeredUserId_);
    }
    if (registeredEventId_ != 0L) {
      output.writeInt64(3, registeredEventId_);
    }
    if (status_ != app.onepass.apis.Status.PENDING.getNumber()) {
      output.writeEnum(4, status_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (userId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, userId_);
    }
    if (registeredUserId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, registeredUserId_);
    }
    if (registeredEventId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, registeredEventId_);
    }
    if (status_ != app.onepass.apis.Status.PENDING.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, status_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof app.onepass.apis.UpdateRegistrationRequestReq)) {
      return super.equals(obj);
    }
    app.onepass.apis.UpdateRegistrationRequestReq other = (app.onepass.apis.UpdateRegistrationRequestReq) obj;

    if (getUserId()
        != other.getUserId()) return false;
    if (getRegisteredUserId()
        != other.getRegisteredUserId()) return false;
    if (getRegisteredEventId()
        != other.getRegisteredEventId()) return false;
    if (status_ != other.status_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUserId());
    hash = (37 * hash) + REGISTERED_USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRegisteredUserId());
    hash = (37 * hash) + REGISTERED_EVENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRegisteredEventId());
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static app.onepass.apis.UpdateRegistrationRequestReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.UpdateRegistrationRequestReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.UpdateRegistrationRequestReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.UpdateRegistrationRequestReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.UpdateRegistrationRequestReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.UpdateRegistrationRequestReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.UpdateRegistrationRequestReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.onepass.apis.UpdateRegistrationRequestReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.onepass.apis.UpdateRegistrationRequestReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static app.onepass.apis.UpdateRegistrationRequestReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.onepass.apis.UpdateRegistrationRequestReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.onepass.apis.UpdateRegistrationRequestReq parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(app.onepass.apis.UpdateRegistrationRequestReq prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code hts.organizer.UpdateRegistrationRequestReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:hts.organizer.UpdateRegistrationRequestReq)
      app.onepass.apis.UpdateRegistrationRequestReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return app.onepass.apis.OrganizerProto.internal_static_hts_organizer_UpdateRegistrationRequestReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return app.onepass.apis.OrganizerProto.internal_static_hts_organizer_UpdateRegistrationRequestReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              app.onepass.apis.UpdateRegistrationRequestReq.class, app.onepass.apis.UpdateRegistrationRequestReq.Builder.class);
    }

    // Construct using app.onepass.apis.UpdateRegistrationRequestReq.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      userId_ = 0L;

      registeredUserId_ = 0L;

      registeredEventId_ = 0L;

      status_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return app.onepass.apis.OrganizerProto.internal_static_hts_organizer_UpdateRegistrationRequestReq_descriptor;
    }

    @java.lang.Override
    public app.onepass.apis.UpdateRegistrationRequestReq getDefaultInstanceForType() {
      return app.onepass.apis.UpdateRegistrationRequestReq.getDefaultInstance();
    }

    @java.lang.Override
    public app.onepass.apis.UpdateRegistrationRequestReq build() {
      app.onepass.apis.UpdateRegistrationRequestReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public app.onepass.apis.UpdateRegistrationRequestReq buildPartial() {
      app.onepass.apis.UpdateRegistrationRequestReq result = new app.onepass.apis.UpdateRegistrationRequestReq(this);
      result.userId_ = userId_;
      result.registeredUserId_ = registeredUserId_;
      result.registeredEventId_ = registeredEventId_;
      result.status_ = status_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof app.onepass.apis.UpdateRegistrationRequestReq) {
        return mergeFrom((app.onepass.apis.UpdateRegistrationRequestReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(app.onepass.apis.UpdateRegistrationRequestReq other) {
      if (other == app.onepass.apis.UpdateRegistrationRequestReq.getDefaultInstance()) return this;
      if (other.getUserId() != 0L) {
        setUserId(other.getUserId());
      }
      if (other.getRegisteredUserId() != 0L) {
        setRegisteredUserId(other.getRegisteredUserId());
      }
      if (other.getRegisteredEventId() != 0L) {
        setRegisteredEventId(other.getRegisteredEventId());
      }
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      app.onepass.apis.UpdateRegistrationRequestReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (app.onepass.apis.UpdateRegistrationRequestReq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long userId_ ;
    /**
     * <code>int64 user_id = 1 [json_name = "userId"];</code>
     * @return The userId.
     */
    @java.lang.Override
    public long getUserId() {
      return userId_;
    }
    /**
     * <code>int64 user_id = 1 [json_name = "userId"];</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(long value) {
      
      userId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 user_id = 1 [json_name = "userId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      
      userId_ = 0L;
      onChanged();
      return this;
    }

    private long registeredUserId_ ;
    /**
     * <code>int64 registered_user_id = 2 [json_name = "registeredUserId"];</code>
     * @return The registeredUserId.
     */
    @java.lang.Override
    public long getRegisteredUserId() {
      return registeredUserId_;
    }
    /**
     * <code>int64 registered_user_id = 2 [json_name = "registeredUserId"];</code>
     * @param value The registeredUserId to set.
     * @return This builder for chaining.
     */
    public Builder setRegisteredUserId(long value) {
      
      registeredUserId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 registered_user_id = 2 [json_name = "registeredUserId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRegisteredUserId() {
      
      registeredUserId_ = 0L;
      onChanged();
      return this;
    }

    private long registeredEventId_ ;
    /**
     * <code>int64 registered_event_id = 3 [json_name = "registeredEventId"];</code>
     * @return The registeredEventId.
     */
    @java.lang.Override
    public long getRegisteredEventId() {
      return registeredEventId_;
    }
    /**
     * <code>int64 registered_event_id = 3 [json_name = "registeredEventId"];</code>
     * @param value The registeredEventId to set.
     * @return This builder for chaining.
     */
    public Builder setRegisteredEventId(long value) {
      
      registeredEventId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 registered_event_id = 3 [json_name = "registeredEventId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRegisteredEventId() {
      
      registeredEventId_ = 0L;
      onChanged();
      return this;
    }

    private int status_ = 0;
    /**
     * <code>.hts.common.Status status = 4 [json_name = "status"];</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.hts.common.Status status = 4 [json_name = "status"];</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.hts.common.Status status = 4 [json_name = "status"];</code>
     * @return The status.
     */
    @java.lang.Override
    public app.onepass.apis.Status getStatus() {
      @SuppressWarnings("deprecation")
      app.onepass.apis.Status result = app.onepass.apis.Status.valueOf(status_);
      return result == null ? app.onepass.apis.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.hts.common.Status status = 4 [json_name = "status"];</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(app.onepass.apis.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.hts.common.Status status = 4 [json_name = "status"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:hts.organizer.UpdateRegistrationRequestReq)
  }

  // @@protoc_insertion_point(class_scope:hts.organizer.UpdateRegistrationRequestReq)
  private static final app.onepass.apis.UpdateRegistrationRequestReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new app.onepass.apis.UpdateRegistrationRequestReq();
  }

  public static app.onepass.apis.UpdateRegistrationRequestReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateRegistrationRequestReq>
      PARSER = new com.google.protobuf.AbstractParser<UpdateRegistrationRequestReq>() {
    @java.lang.Override
    public UpdateRegistrationRequestReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateRegistrationRequestReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateRegistrationRequestReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateRegistrationRequestReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public app.onepass.apis.UpdateRegistrationRequestReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
