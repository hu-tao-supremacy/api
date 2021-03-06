// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/account/service.proto

package app.onepass.apis;

/**
 * Protobuf type {@code hts.account.SetInterestedEventsRequest}
 */
public final class SetInterestedEventsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:hts.account.SetInterestedEventsRequest)
    SetInterestedEventsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetInterestedEventsRequest.newBuilder() to construct.
  private SetInterestedEventsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetInterestedEventsRequest() {
    eventIds_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SetInterestedEventsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SetInterestedEventsRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {

            userId_ = input.readInt32();
            break;
          }
          case 16: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              eventIds_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            eventIds_.addInt(input.readInt32());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              eventIds_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              eventIds_.addInt(input.readInt32());
            }
            input.popLimit(limit);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        eventIds_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return app.onepass.apis.AccountProto.internal_static_hts_account_SetInterestedEventsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return app.onepass.apis.AccountProto.internal_static_hts_account_SetInterestedEventsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            app.onepass.apis.SetInterestedEventsRequest.class, app.onepass.apis.SetInterestedEventsRequest.Builder.class);
  }

  public static final int USER_ID_FIELD_NUMBER = 1;
  private int userId_;
  /**
   * <code>int32 user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  @java.lang.Override
  public int getUserId() {
    return userId_;
  }

  public static final int EVENT_IDS_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.IntList eventIds_;
  /**
   * <code>repeated int32 event_ids = 2 [json_name = "eventIds"];</code>
   * @return A list containing the eventIds.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getEventIdsList() {
    return eventIds_;
  }
  /**
   * <code>repeated int32 event_ids = 2 [json_name = "eventIds"];</code>
   * @return The count of eventIds.
   */
  public int getEventIdsCount() {
    return eventIds_.size();
  }
  /**
   * <code>repeated int32 event_ids = 2 [json_name = "eventIds"];</code>
   * @param index The index of the element to return.
   * @return The eventIds at the given index.
   */
  public int getEventIds(int index) {
    return eventIds_.getInt(index);
  }
  private int eventIdsMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (userId_ != 0) {
      output.writeInt32(1, userId_);
    }
    if (getEventIdsList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(eventIdsMemoizedSerializedSize);
    }
    for (int i = 0; i < eventIds_.size(); i++) {
      output.writeInt32NoTag(eventIds_.getInt(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (userId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, userId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < eventIds_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(eventIds_.getInt(i));
      }
      size += dataSize;
      if (!getEventIdsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      eventIdsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof app.onepass.apis.SetInterestedEventsRequest)) {
      return super.equals(obj);
    }
    app.onepass.apis.SetInterestedEventsRequest other = (app.onepass.apis.SetInterestedEventsRequest) obj;

    if (getUserId()
        != other.getUserId()) return false;
    if (!getEventIdsList()
        .equals(other.getEventIdsList())) return false;
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
    hash = (53 * hash) + getUserId();
    if (getEventIdsCount() > 0) {
      hash = (37 * hash) + EVENT_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getEventIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static app.onepass.apis.SetInterestedEventsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.SetInterestedEventsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.SetInterestedEventsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.SetInterestedEventsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.SetInterestedEventsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.SetInterestedEventsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.SetInterestedEventsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.onepass.apis.SetInterestedEventsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.onepass.apis.SetInterestedEventsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static app.onepass.apis.SetInterestedEventsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.onepass.apis.SetInterestedEventsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.onepass.apis.SetInterestedEventsRequest parseFrom(
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
  public static Builder newBuilder(app.onepass.apis.SetInterestedEventsRequest prototype) {
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
   * Protobuf type {@code hts.account.SetInterestedEventsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:hts.account.SetInterestedEventsRequest)
      app.onepass.apis.SetInterestedEventsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return app.onepass.apis.AccountProto.internal_static_hts_account_SetInterestedEventsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return app.onepass.apis.AccountProto.internal_static_hts_account_SetInterestedEventsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              app.onepass.apis.SetInterestedEventsRequest.class, app.onepass.apis.SetInterestedEventsRequest.Builder.class);
    }

    // Construct using app.onepass.apis.SetInterestedEventsRequest.newBuilder()
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
      userId_ = 0;

      eventIds_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return app.onepass.apis.AccountProto.internal_static_hts_account_SetInterestedEventsRequest_descriptor;
    }

    @java.lang.Override
    public app.onepass.apis.SetInterestedEventsRequest getDefaultInstanceForType() {
      return app.onepass.apis.SetInterestedEventsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public app.onepass.apis.SetInterestedEventsRequest build() {
      app.onepass.apis.SetInterestedEventsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public app.onepass.apis.SetInterestedEventsRequest buildPartial() {
      app.onepass.apis.SetInterestedEventsRequest result = new app.onepass.apis.SetInterestedEventsRequest(this);
      int from_bitField0_ = bitField0_;
      result.userId_ = userId_;
      if (((bitField0_ & 0x00000001) != 0)) {
        eventIds_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.eventIds_ = eventIds_;
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
      if (other instanceof app.onepass.apis.SetInterestedEventsRequest) {
        return mergeFrom((app.onepass.apis.SetInterestedEventsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(app.onepass.apis.SetInterestedEventsRequest other) {
      if (other == app.onepass.apis.SetInterestedEventsRequest.getDefaultInstance()) return this;
      if (other.getUserId() != 0) {
        setUserId(other.getUserId());
      }
      if (!other.eventIds_.isEmpty()) {
        if (eventIds_.isEmpty()) {
          eventIds_ = other.eventIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureEventIdsIsMutable();
          eventIds_.addAll(other.eventIds_);
        }
        onChanged();
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
      app.onepass.apis.SetInterestedEventsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (app.onepass.apis.SetInterestedEventsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int userId_ ;
    /**
     * <code>int32 user_id = 1 [json_name = "userId"];</code>
     * @return The userId.
     */
    @java.lang.Override
    public int getUserId() {
      return userId_;
    }
    /**
     * <code>int32 user_id = 1 [json_name = "userId"];</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(int value) {
      
      userId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 user_id = 1 [json_name = "userId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      
      userId_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList eventIds_ = emptyIntList();
    private void ensureEventIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        eventIds_ = mutableCopy(eventIds_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int32 event_ids = 2 [json_name = "eventIds"];</code>
     * @return A list containing the eventIds.
     */
    public java.util.List<java.lang.Integer>
        getEventIdsList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(eventIds_) : eventIds_;
    }
    /**
     * <code>repeated int32 event_ids = 2 [json_name = "eventIds"];</code>
     * @return The count of eventIds.
     */
    public int getEventIdsCount() {
      return eventIds_.size();
    }
    /**
     * <code>repeated int32 event_ids = 2 [json_name = "eventIds"];</code>
     * @param index The index of the element to return.
     * @return The eventIds at the given index.
     */
    public int getEventIds(int index) {
      return eventIds_.getInt(index);
    }
    /**
     * <code>repeated int32 event_ids = 2 [json_name = "eventIds"];</code>
     * @param index The index to set the value at.
     * @param value The eventIds to set.
     * @return This builder for chaining.
     */
    public Builder setEventIds(
        int index, int value) {
      ensureEventIdsIsMutable();
      eventIds_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 event_ids = 2 [json_name = "eventIds"];</code>
     * @param value The eventIds to add.
     * @return This builder for chaining.
     */
    public Builder addEventIds(int value) {
      ensureEventIdsIsMutable();
      eventIds_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 event_ids = 2 [json_name = "eventIds"];</code>
     * @param values The eventIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllEventIds(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureEventIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, eventIds_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 event_ids = 2 [json_name = "eventIds"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEventIds() {
      eventIds_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
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


    // @@protoc_insertion_point(builder_scope:hts.account.SetInterestedEventsRequest)
  }

  // @@protoc_insertion_point(class_scope:hts.account.SetInterestedEventsRequest)
  private static final app.onepass.apis.SetInterestedEventsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new app.onepass.apis.SetInterestedEventsRequest();
  }

  public static app.onepass.apis.SetInterestedEventsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetInterestedEventsRequest>
      PARSER = new com.google.protobuf.AbstractParser<SetInterestedEventsRequest>() {
    @java.lang.Override
    public SetInterestedEventsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SetInterestedEventsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SetInterestedEventsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetInterestedEventsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public app.onepass.apis.SetInterestedEventsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

