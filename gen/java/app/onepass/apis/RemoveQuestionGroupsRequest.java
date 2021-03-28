// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/organizer/service.proto

package app.onepass.apis;

/**
 * Protobuf type {@code hts.organizer.RemoveQuestionGroupsRequest}
 */
public final class RemoveQuestionGroupsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:hts.organizer.RemoveQuestionGroupsRequest)
    RemoveQuestionGroupsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RemoveQuestionGroupsRequest.newBuilder() to construct.
  private RemoveQuestionGroupsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RemoveQuestionGroupsRequest() {
    questionGroupIds_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RemoveQuestionGroupsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RemoveQuestionGroupsRequest(
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

            userId_ = input.readInt64();
            break;
          }
          case 16: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              questionGroupIds_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            questionGroupIds_.addLong(input.readInt64());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              questionGroupIds_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              questionGroupIds_.addLong(input.readInt64());
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
        questionGroupIds_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return app.onepass.apis.OrganizerProto.internal_static_hts_organizer_RemoveQuestionGroupsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return app.onepass.apis.OrganizerProto.internal_static_hts_organizer_RemoveQuestionGroupsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            app.onepass.apis.RemoveQuestionGroupsRequest.class, app.onepass.apis.RemoveQuestionGroupsRequest.Builder.class);
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

  public static final int QUESTION_GROUP_IDS_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.LongList questionGroupIds_;
  /**
   * <code>repeated int64 question_group_ids = 2 [json_name = "questionGroupIds"];</code>
   * @return A list containing the questionGroupIds.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getQuestionGroupIdsList() {
    return questionGroupIds_;
  }
  /**
   * <code>repeated int64 question_group_ids = 2 [json_name = "questionGroupIds"];</code>
   * @return The count of questionGroupIds.
   */
  public int getQuestionGroupIdsCount() {
    return questionGroupIds_.size();
  }
  /**
   * <code>repeated int64 question_group_ids = 2 [json_name = "questionGroupIds"];</code>
   * @param index The index of the element to return.
   * @return The questionGroupIds at the given index.
   */
  public long getQuestionGroupIds(int index) {
    return questionGroupIds_.getLong(index);
  }
  private int questionGroupIdsMemoizedSerializedSize = -1;

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
    if (userId_ != 0L) {
      output.writeInt64(1, userId_);
    }
    if (getQuestionGroupIdsList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(questionGroupIdsMemoizedSerializedSize);
    }
    for (int i = 0; i < questionGroupIds_.size(); i++) {
      output.writeInt64NoTag(questionGroupIds_.getLong(i));
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
    {
      int dataSize = 0;
      for (int i = 0; i < questionGroupIds_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(questionGroupIds_.getLong(i));
      }
      size += dataSize;
      if (!getQuestionGroupIdsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      questionGroupIdsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof app.onepass.apis.RemoveQuestionGroupsRequest)) {
      return super.equals(obj);
    }
    app.onepass.apis.RemoveQuestionGroupsRequest other = (app.onepass.apis.RemoveQuestionGroupsRequest) obj;

    if (getUserId()
        != other.getUserId()) return false;
    if (!getQuestionGroupIdsList()
        .equals(other.getQuestionGroupIdsList())) return false;
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
    if (getQuestionGroupIdsCount() > 0) {
      hash = (37 * hash) + QUESTION_GROUP_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getQuestionGroupIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static app.onepass.apis.RemoveQuestionGroupsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.RemoveQuestionGroupsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.RemoveQuestionGroupsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.RemoveQuestionGroupsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.RemoveQuestionGroupsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.RemoveQuestionGroupsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.RemoveQuestionGroupsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.onepass.apis.RemoveQuestionGroupsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.onepass.apis.RemoveQuestionGroupsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static app.onepass.apis.RemoveQuestionGroupsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.onepass.apis.RemoveQuestionGroupsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.onepass.apis.RemoveQuestionGroupsRequest parseFrom(
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
  public static Builder newBuilder(app.onepass.apis.RemoveQuestionGroupsRequest prototype) {
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
   * Protobuf type {@code hts.organizer.RemoveQuestionGroupsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:hts.organizer.RemoveQuestionGroupsRequest)
      app.onepass.apis.RemoveQuestionGroupsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return app.onepass.apis.OrganizerProto.internal_static_hts_organizer_RemoveQuestionGroupsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return app.onepass.apis.OrganizerProto.internal_static_hts_organizer_RemoveQuestionGroupsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              app.onepass.apis.RemoveQuestionGroupsRequest.class, app.onepass.apis.RemoveQuestionGroupsRequest.Builder.class);
    }

    // Construct using app.onepass.apis.RemoveQuestionGroupsRequest.newBuilder()
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

      questionGroupIds_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return app.onepass.apis.OrganizerProto.internal_static_hts_organizer_RemoveQuestionGroupsRequest_descriptor;
    }

    @java.lang.Override
    public app.onepass.apis.RemoveQuestionGroupsRequest getDefaultInstanceForType() {
      return app.onepass.apis.RemoveQuestionGroupsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public app.onepass.apis.RemoveQuestionGroupsRequest build() {
      app.onepass.apis.RemoveQuestionGroupsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public app.onepass.apis.RemoveQuestionGroupsRequest buildPartial() {
      app.onepass.apis.RemoveQuestionGroupsRequest result = new app.onepass.apis.RemoveQuestionGroupsRequest(this);
      int from_bitField0_ = bitField0_;
      result.userId_ = userId_;
      if (((bitField0_ & 0x00000001) != 0)) {
        questionGroupIds_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.questionGroupIds_ = questionGroupIds_;
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
      if (other instanceof app.onepass.apis.RemoveQuestionGroupsRequest) {
        return mergeFrom((app.onepass.apis.RemoveQuestionGroupsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(app.onepass.apis.RemoveQuestionGroupsRequest other) {
      if (other == app.onepass.apis.RemoveQuestionGroupsRequest.getDefaultInstance()) return this;
      if (other.getUserId() != 0L) {
        setUserId(other.getUserId());
      }
      if (!other.questionGroupIds_.isEmpty()) {
        if (questionGroupIds_.isEmpty()) {
          questionGroupIds_ = other.questionGroupIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureQuestionGroupIdsIsMutable();
          questionGroupIds_.addAll(other.questionGroupIds_);
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
      app.onepass.apis.RemoveQuestionGroupsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (app.onepass.apis.RemoveQuestionGroupsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

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

    private com.google.protobuf.Internal.LongList questionGroupIds_ = emptyLongList();
    private void ensureQuestionGroupIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        questionGroupIds_ = mutableCopy(questionGroupIds_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int64 question_group_ids = 2 [json_name = "questionGroupIds"];</code>
     * @return A list containing the questionGroupIds.
     */
    public java.util.List<java.lang.Long>
        getQuestionGroupIdsList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(questionGroupIds_) : questionGroupIds_;
    }
    /**
     * <code>repeated int64 question_group_ids = 2 [json_name = "questionGroupIds"];</code>
     * @return The count of questionGroupIds.
     */
    public int getQuestionGroupIdsCount() {
      return questionGroupIds_.size();
    }
    /**
     * <code>repeated int64 question_group_ids = 2 [json_name = "questionGroupIds"];</code>
     * @param index The index of the element to return.
     * @return The questionGroupIds at the given index.
     */
    public long getQuestionGroupIds(int index) {
      return questionGroupIds_.getLong(index);
    }
    /**
     * <code>repeated int64 question_group_ids = 2 [json_name = "questionGroupIds"];</code>
     * @param index The index to set the value at.
     * @param value The questionGroupIds to set.
     * @return This builder for chaining.
     */
    public Builder setQuestionGroupIds(
        int index, long value) {
      ensureQuestionGroupIdsIsMutable();
      questionGroupIds_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 question_group_ids = 2 [json_name = "questionGroupIds"];</code>
     * @param value The questionGroupIds to add.
     * @return This builder for chaining.
     */
    public Builder addQuestionGroupIds(long value) {
      ensureQuestionGroupIdsIsMutable();
      questionGroupIds_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 question_group_ids = 2 [json_name = "questionGroupIds"];</code>
     * @param values The questionGroupIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllQuestionGroupIds(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureQuestionGroupIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, questionGroupIds_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 question_group_ids = 2 [json_name = "questionGroupIds"];</code>
     * @return This builder for chaining.
     */
    public Builder clearQuestionGroupIds() {
      questionGroupIds_ = emptyLongList();
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


    // @@protoc_insertion_point(builder_scope:hts.organizer.RemoveQuestionGroupsRequest)
  }

  // @@protoc_insertion_point(class_scope:hts.organizer.RemoveQuestionGroupsRequest)
  private static final app.onepass.apis.RemoveQuestionGroupsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new app.onepass.apis.RemoveQuestionGroupsRequest();
  }

  public static app.onepass.apis.RemoveQuestionGroupsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RemoveQuestionGroupsRequest>
      PARSER = new com.google.protobuf.AbstractParser<RemoveQuestionGroupsRequest>() {
    @java.lang.Override
    public RemoveQuestionGroupsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RemoveQuestionGroupsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RemoveQuestionGroupsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RemoveQuestionGroupsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public app.onepass.apis.RemoveQuestionGroupsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
