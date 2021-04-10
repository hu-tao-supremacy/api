// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/participant/service.proto

package app.onepass.apis;

/**
 * Protobuf type {@code hts.participant.GetEventsByTagIdsRequest}
 */
public final class GetEventsByTagIdsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:hts.participant.GetEventsByTagIdsRequest)
    GetEventsByTagIdsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetEventsByTagIdsRequest.newBuilder() to construct.
  private GetEventsByTagIdsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetEventsByTagIdsRequest() {
    tagIds_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetEventsByTagIdsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetEventsByTagIdsRequest(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              tagIds_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            tagIds_.addInt(input.readInt32());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              tagIds_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              tagIds_.addInt(input.readInt32());
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
        tagIds_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return app.onepass.apis.ParticipantProto.internal_static_hts_participant_GetEventsByTagIdsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return app.onepass.apis.ParticipantProto.internal_static_hts_participant_GetEventsByTagIdsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            app.onepass.apis.GetEventsByTagIdsRequest.class, app.onepass.apis.GetEventsByTagIdsRequest.Builder.class);
  }

  public static final int TAG_IDS_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.IntList tagIds_;
  /**
   * <code>repeated int32 tag_ids = 1 [json_name = "tagIds"];</code>
   * @return A list containing the tagIds.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getTagIdsList() {
    return tagIds_;
  }
  /**
   * <code>repeated int32 tag_ids = 1 [json_name = "tagIds"];</code>
   * @return The count of tagIds.
   */
  public int getTagIdsCount() {
    return tagIds_.size();
  }
  /**
   * <code>repeated int32 tag_ids = 1 [json_name = "tagIds"];</code>
   * @param index The index of the element to return.
   * @return The tagIds at the given index.
   */
  public int getTagIds(int index) {
    return tagIds_.getInt(index);
  }
  private int tagIdsMemoizedSerializedSize = -1;

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
    if (getTagIdsList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(tagIdsMemoizedSerializedSize);
    }
    for (int i = 0; i < tagIds_.size(); i++) {
      output.writeInt32NoTag(tagIds_.getInt(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < tagIds_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(tagIds_.getInt(i));
      }
      size += dataSize;
      if (!getTagIdsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      tagIdsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof app.onepass.apis.GetEventsByTagIdsRequest)) {
      return super.equals(obj);
    }
    app.onepass.apis.GetEventsByTagIdsRequest other = (app.onepass.apis.GetEventsByTagIdsRequest) obj;

    if (!getTagIdsList()
        .equals(other.getTagIdsList())) return false;
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
    if (getTagIdsCount() > 0) {
      hash = (37 * hash) + TAG_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getTagIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static app.onepass.apis.GetEventsByTagIdsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.GetEventsByTagIdsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.GetEventsByTagIdsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.GetEventsByTagIdsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.GetEventsByTagIdsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.GetEventsByTagIdsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.GetEventsByTagIdsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.onepass.apis.GetEventsByTagIdsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.onepass.apis.GetEventsByTagIdsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static app.onepass.apis.GetEventsByTagIdsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.onepass.apis.GetEventsByTagIdsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.onepass.apis.GetEventsByTagIdsRequest parseFrom(
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
  public static Builder newBuilder(app.onepass.apis.GetEventsByTagIdsRequest prototype) {
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
   * Protobuf type {@code hts.participant.GetEventsByTagIdsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:hts.participant.GetEventsByTagIdsRequest)
      app.onepass.apis.GetEventsByTagIdsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return app.onepass.apis.ParticipantProto.internal_static_hts_participant_GetEventsByTagIdsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return app.onepass.apis.ParticipantProto.internal_static_hts_participant_GetEventsByTagIdsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              app.onepass.apis.GetEventsByTagIdsRequest.class, app.onepass.apis.GetEventsByTagIdsRequest.Builder.class);
    }

    // Construct using app.onepass.apis.GetEventsByTagIdsRequest.newBuilder()
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
      tagIds_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return app.onepass.apis.ParticipantProto.internal_static_hts_participant_GetEventsByTagIdsRequest_descriptor;
    }

    @java.lang.Override
    public app.onepass.apis.GetEventsByTagIdsRequest getDefaultInstanceForType() {
      return app.onepass.apis.GetEventsByTagIdsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public app.onepass.apis.GetEventsByTagIdsRequest build() {
      app.onepass.apis.GetEventsByTagIdsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public app.onepass.apis.GetEventsByTagIdsRequest buildPartial() {
      app.onepass.apis.GetEventsByTagIdsRequest result = new app.onepass.apis.GetEventsByTagIdsRequest(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        tagIds_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.tagIds_ = tagIds_;
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
      if (other instanceof app.onepass.apis.GetEventsByTagIdsRequest) {
        return mergeFrom((app.onepass.apis.GetEventsByTagIdsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(app.onepass.apis.GetEventsByTagIdsRequest other) {
      if (other == app.onepass.apis.GetEventsByTagIdsRequest.getDefaultInstance()) return this;
      if (!other.tagIds_.isEmpty()) {
        if (tagIds_.isEmpty()) {
          tagIds_ = other.tagIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureTagIdsIsMutable();
          tagIds_.addAll(other.tagIds_);
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
      app.onepass.apis.GetEventsByTagIdsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (app.onepass.apis.GetEventsByTagIdsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.IntList tagIds_ = emptyIntList();
    private void ensureTagIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        tagIds_ = mutableCopy(tagIds_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int32 tag_ids = 1 [json_name = "tagIds"];</code>
     * @return A list containing the tagIds.
     */
    public java.util.List<java.lang.Integer>
        getTagIdsList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(tagIds_) : tagIds_;
    }
    /**
     * <code>repeated int32 tag_ids = 1 [json_name = "tagIds"];</code>
     * @return The count of tagIds.
     */
    public int getTagIdsCount() {
      return tagIds_.size();
    }
    /**
     * <code>repeated int32 tag_ids = 1 [json_name = "tagIds"];</code>
     * @param index The index of the element to return.
     * @return The tagIds at the given index.
     */
    public int getTagIds(int index) {
      return tagIds_.getInt(index);
    }
    /**
     * <code>repeated int32 tag_ids = 1 [json_name = "tagIds"];</code>
     * @param index The index to set the value at.
     * @param value The tagIds to set.
     * @return This builder for chaining.
     */
    public Builder setTagIds(
        int index, int value) {
      ensureTagIdsIsMutable();
      tagIds_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 tag_ids = 1 [json_name = "tagIds"];</code>
     * @param value The tagIds to add.
     * @return This builder for chaining.
     */
    public Builder addTagIds(int value) {
      ensureTagIdsIsMutable();
      tagIds_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 tag_ids = 1 [json_name = "tagIds"];</code>
     * @param values The tagIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllTagIds(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureTagIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, tagIds_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 tag_ids = 1 [json_name = "tagIds"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTagIds() {
      tagIds_ = emptyIntList();
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


    // @@protoc_insertion_point(builder_scope:hts.participant.GetEventsByTagIdsRequest)
  }

  // @@protoc_insertion_point(class_scope:hts.participant.GetEventsByTagIdsRequest)
  private static final app.onepass.apis.GetEventsByTagIdsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new app.onepass.apis.GetEventsByTagIdsRequest();
  }

  public static app.onepass.apis.GetEventsByTagIdsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetEventsByTagIdsRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetEventsByTagIdsRequest>() {
    @java.lang.Override
    public GetEventsByTagIdsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetEventsByTagIdsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetEventsByTagIdsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetEventsByTagIdsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public app.onepass.apis.GetEventsByTagIdsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
