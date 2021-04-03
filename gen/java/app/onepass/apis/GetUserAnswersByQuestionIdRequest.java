// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/participant/service.proto

package app.onepass.apis;

/**
 * Protobuf type {@code hts.participant.GetUserAnswersByQuestionIdRequest}
 */
public final class GetUserAnswersByQuestionIdRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:hts.participant.GetUserAnswersByQuestionIdRequest)
    GetUserAnswersByQuestionIdRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetUserAnswersByQuestionIdRequest.newBuilder() to construct.
  private GetUserAnswersByQuestionIdRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetUserAnswersByQuestionIdRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetUserAnswersByQuestionIdRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetUserAnswersByQuestionIdRequest(
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

            questionId_ = input.readInt32();
            break;
          }
          case 16: {

            userId_ = input.readInt32();
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
    return app.onepass.apis.ParticipantProto.internal_static_hts_participant_GetUserAnswersByQuestionIdRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return app.onepass.apis.ParticipantProto.internal_static_hts_participant_GetUserAnswersByQuestionIdRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            app.onepass.apis.GetUserAnswersByQuestionIdRequest.class, app.onepass.apis.GetUserAnswersByQuestionIdRequest.Builder.class);
  }

  public static final int QUESTION_ID_FIELD_NUMBER = 1;
  private int questionId_;
  /**
   * <code>int32 question_id = 1 [json_name = "questionId"];</code>
   * @return The questionId.
   */
  @java.lang.Override
  public int getQuestionId() {
    return questionId_;
  }

  public static final int USER_ID_FIELD_NUMBER = 2;
  private int userId_;
  /**
   * <code>int32 user_id = 2 [json_name = "userId"];</code>
   * @return The userId.
   */
  @java.lang.Override
  public int getUserId() {
    return userId_;
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
    if (questionId_ != 0) {
      output.writeInt32(1, questionId_);
    }
    if (userId_ != 0) {
      output.writeInt32(2, userId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (questionId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, questionId_);
    }
    if (userId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, userId_);
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
    if (!(obj instanceof app.onepass.apis.GetUserAnswersByQuestionIdRequest)) {
      return super.equals(obj);
    }
    app.onepass.apis.GetUserAnswersByQuestionIdRequest other = (app.onepass.apis.GetUserAnswersByQuestionIdRequest) obj;

    if (getQuestionId()
        != other.getQuestionId()) return false;
    if (getUserId()
        != other.getUserId()) return false;
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
    hash = (37 * hash) + QUESTION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getQuestionId();
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static app.onepass.apis.GetUserAnswersByQuestionIdRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.GetUserAnswersByQuestionIdRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.GetUserAnswersByQuestionIdRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.GetUserAnswersByQuestionIdRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.GetUserAnswersByQuestionIdRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.GetUserAnswersByQuestionIdRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.GetUserAnswersByQuestionIdRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.onepass.apis.GetUserAnswersByQuestionIdRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.onepass.apis.GetUserAnswersByQuestionIdRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static app.onepass.apis.GetUserAnswersByQuestionIdRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.onepass.apis.GetUserAnswersByQuestionIdRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.onepass.apis.GetUserAnswersByQuestionIdRequest parseFrom(
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
  public static Builder newBuilder(app.onepass.apis.GetUserAnswersByQuestionIdRequest prototype) {
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
   * Protobuf type {@code hts.participant.GetUserAnswersByQuestionIdRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:hts.participant.GetUserAnswersByQuestionIdRequest)
      app.onepass.apis.GetUserAnswersByQuestionIdRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return app.onepass.apis.ParticipantProto.internal_static_hts_participant_GetUserAnswersByQuestionIdRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return app.onepass.apis.ParticipantProto.internal_static_hts_participant_GetUserAnswersByQuestionIdRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              app.onepass.apis.GetUserAnswersByQuestionIdRequest.class, app.onepass.apis.GetUserAnswersByQuestionIdRequest.Builder.class);
    }

    // Construct using app.onepass.apis.GetUserAnswersByQuestionIdRequest.newBuilder()
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
      questionId_ = 0;

      userId_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return app.onepass.apis.ParticipantProto.internal_static_hts_participant_GetUserAnswersByQuestionIdRequest_descriptor;
    }

    @java.lang.Override
    public app.onepass.apis.GetUserAnswersByQuestionIdRequest getDefaultInstanceForType() {
      return app.onepass.apis.GetUserAnswersByQuestionIdRequest.getDefaultInstance();
    }

    @java.lang.Override
    public app.onepass.apis.GetUserAnswersByQuestionIdRequest build() {
      app.onepass.apis.GetUserAnswersByQuestionIdRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public app.onepass.apis.GetUserAnswersByQuestionIdRequest buildPartial() {
      app.onepass.apis.GetUserAnswersByQuestionIdRequest result = new app.onepass.apis.GetUserAnswersByQuestionIdRequest(this);
      result.questionId_ = questionId_;
      result.userId_ = userId_;
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
      if (other instanceof app.onepass.apis.GetUserAnswersByQuestionIdRequest) {
        return mergeFrom((app.onepass.apis.GetUserAnswersByQuestionIdRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(app.onepass.apis.GetUserAnswersByQuestionIdRequest other) {
      if (other == app.onepass.apis.GetUserAnswersByQuestionIdRequest.getDefaultInstance()) return this;
      if (other.getQuestionId() != 0) {
        setQuestionId(other.getQuestionId());
      }
      if (other.getUserId() != 0) {
        setUserId(other.getUserId());
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
      app.onepass.apis.GetUserAnswersByQuestionIdRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (app.onepass.apis.GetUserAnswersByQuestionIdRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int questionId_ ;
    /**
     * <code>int32 question_id = 1 [json_name = "questionId"];</code>
     * @return The questionId.
     */
    @java.lang.Override
    public int getQuestionId() {
      return questionId_;
    }
    /**
     * <code>int32 question_id = 1 [json_name = "questionId"];</code>
     * @param value The questionId to set.
     * @return This builder for chaining.
     */
    public Builder setQuestionId(int value) {
      
      questionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 question_id = 1 [json_name = "questionId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearQuestionId() {
      
      questionId_ = 0;
      onChanged();
      return this;
    }

    private int userId_ ;
    /**
     * <code>int32 user_id = 2 [json_name = "userId"];</code>
     * @return The userId.
     */
    @java.lang.Override
    public int getUserId() {
      return userId_;
    }
    /**
     * <code>int32 user_id = 2 [json_name = "userId"];</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(int value) {
      
      userId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 user_id = 2 [json_name = "userId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      
      userId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:hts.participant.GetUserAnswersByQuestionIdRequest)
  }

  // @@protoc_insertion_point(class_scope:hts.participant.GetUserAnswersByQuestionIdRequest)
  private static final app.onepass.apis.GetUserAnswersByQuestionIdRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new app.onepass.apis.GetUserAnswersByQuestionIdRequest();
  }

  public static app.onepass.apis.GetUserAnswersByQuestionIdRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetUserAnswersByQuestionIdRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetUserAnswersByQuestionIdRequest>() {
    @java.lang.Override
    public GetUserAnswersByQuestionIdRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetUserAnswersByQuestionIdRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetUserAnswersByQuestionIdRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetUserAnswersByQuestionIdRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public app.onepass.apis.GetUserAnswersByQuestionIdRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

