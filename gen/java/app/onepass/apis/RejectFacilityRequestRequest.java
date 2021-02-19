// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/facility/service.proto

package app.onepass.apis;

/**
 * Protobuf type {@code hts.facility.RejectFacilityRequestRequest}
 */
public final class RejectFacilityRequestRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:hts.facility.RejectFacilityRequestRequest)
    RejectFacilityRequestRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RejectFacilityRequestRequest.newBuilder() to construct.
  private RejectFacilityRequestRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RejectFacilityRequestRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RejectFacilityRequestRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RejectFacilityRequestRequest(
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

            organizationId_ = input.readInt64();
            break;
          }
          case 24: {

            requestId_ = input.readInt64();
            break;
          }
          case 34: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (reason_ != null) {
              subBuilder = reason_.toBuilder();
            }
            reason_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(reason_);
              reason_ = subBuilder.buildPartial();
            }

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
    return app.onepass.apis.FacilityProto.internal_static_hts_facility_RejectFacilityRequestRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return app.onepass.apis.FacilityProto.internal_static_hts_facility_RejectFacilityRequestRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            app.onepass.apis.RejectFacilityRequestRequest.class, app.onepass.apis.RejectFacilityRequestRequest.Builder.class);
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

  public static final int ORGANIZATION_ID_FIELD_NUMBER = 2;
  private long organizationId_;
  /**
   * <code>int64 organization_id = 2 [json_name = "organizationId"];</code>
   * @return The organizationId.
   */
  @java.lang.Override
  public long getOrganizationId() {
    return organizationId_;
  }

  public static final int REQUEST_ID_FIELD_NUMBER = 3;
  private long requestId_;
  /**
   * <code>int64 request_id = 3 [json_name = "requestId"];</code>
   * @return The requestId.
   */
  @java.lang.Override
  public long getRequestId() {
    return requestId_;
  }

  public static final int REASON_FIELD_NUMBER = 4;
  private com.google.protobuf.StringValue reason_;
  /**
   * <code>.google.protobuf.StringValue reason = 4 [json_name = "reason"];</code>
   * @return Whether the reason field is set.
   */
  @java.lang.Override
  public boolean hasReason() {
    return reason_ != null;
  }
  /**
   * <code>.google.protobuf.StringValue reason = 4 [json_name = "reason"];</code>
   * @return The reason.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getReason() {
    return reason_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : reason_;
  }
  /**
   * <code>.google.protobuf.StringValue reason = 4 [json_name = "reason"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getReasonOrBuilder() {
    return getReason();
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
    if (organizationId_ != 0L) {
      output.writeInt64(2, organizationId_);
    }
    if (requestId_ != 0L) {
      output.writeInt64(3, requestId_);
    }
    if (reason_ != null) {
      output.writeMessage(4, getReason());
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
    if (organizationId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, organizationId_);
    }
    if (requestId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, requestId_);
    }
    if (reason_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getReason());
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
    if (!(obj instanceof app.onepass.apis.RejectFacilityRequestRequest)) {
      return super.equals(obj);
    }
    app.onepass.apis.RejectFacilityRequestRequest other = (app.onepass.apis.RejectFacilityRequestRequest) obj;

    if (getUserId()
        != other.getUserId()) return false;
    if (getOrganizationId()
        != other.getOrganizationId()) return false;
    if (getRequestId()
        != other.getRequestId()) return false;
    if (hasReason() != other.hasReason()) return false;
    if (hasReason()) {
      if (!getReason()
          .equals(other.getReason())) return false;
    }
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
    hash = (37 * hash) + ORGANIZATION_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getOrganizationId());
    hash = (37 * hash) + REQUEST_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRequestId());
    if (hasReason()) {
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + getReason().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static app.onepass.apis.RejectFacilityRequestRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.RejectFacilityRequestRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.RejectFacilityRequestRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.RejectFacilityRequestRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.RejectFacilityRequestRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.RejectFacilityRequestRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.RejectFacilityRequestRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.onepass.apis.RejectFacilityRequestRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.onepass.apis.RejectFacilityRequestRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static app.onepass.apis.RejectFacilityRequestRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.onepass.apis.RejectFacilityRequestRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.onepass.apis.RejectFacilityRequestRequest parseFrom(
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
  public static Builder newBuilder(app.onepass.apis.RejectFacilityRequestRequest prototype) {
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
   * Protobuf type {@code hts.facility.RejectFacilityRequestRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:hts.facility.RejectFacilityRequestRequest)
      app.onepass.apis.RejectFacilityRequestRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return app.onepass.apis.FacilityProto.internal_static_hts_facility_RejectFacilityRequestRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return app.onepass.apis.FacilityProto.internal_static_hts_facility_RejectFacilityRequestRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              app.onepass.apis.RejectFacilityRequestRequest.class, app.onepass.apis.RejectFacilityRequestRequest.Builder.class);
    }

    // Construct using app.onepass.apis.RejectFacilityRequestRequest.newBuilder()
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

      organizationId_ = 0L;

      requestId_ = 0L;

      if (reasonBuilder_ == null) {
        reason_ = null;
      } else {
        reason_ = null;
        reasonBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return app.onepass.apis.FacilityProto.internal_static_hts_facility_RejectFacilityRequestRequest_descriptor;
    }

    @java.lang.Override
    public app.onepass.apis.RejectFacilityRequestRequest getDefaultInstanceForType() {
      return app.onepass.apis.RejectFacilityRequestRequest.getDefaultInstance();
    }

    @java.lang.Override
    public app.onepass.apis.RejectFacilityRequestRequest build() {
      app.onepass.apis.RejectFacilityRequestRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public app.onepass.apis.RejectFacilityRequestRequest buildPartial() {
      app.onepass.apis.RejectFacilityRequestRequest result = new app.onepass.apis.RejectFacilityRequestRequest(this);
      result.userId_ = userId_;
      result.organizationId_ = organizationId_;
      result.requestId_ = requestId_;
      if (reasonBuilder_ == null) {
        result.reason_ = reason_;
      } else {
        result.reason_ = reasonBuilder_.build();
      }
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
      if (other instanceof app.onepass.apis.RejectFacilityRequestRequest) {
        return mergeFrom((app.onepass.apis.RejectFacilityRequestRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(app.onepass.apis.RejectFacilityRequestRequest other) {
      if (other == app.onepass.apis.RejectFacilityRequestRequest.getDefaultInstance()) return this;
      if (other.getUserId() != 0L) {
        setUserId(other.getUserId());
      }
      if (other.getOrganizationId() != 0L) {
        setOrganizationId(other.getOrganizationId());
      }
      if (other.getRequestId() != 0L) {
        setRequestId(other.getRequestId());
      }
      if (other.hasReason()) {
        mergeReason(other.getReason());
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
      app.onepass.apis.RejectFacilityRequestRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (app.onepass.apis.RejectFacilityRequestRequest) e.getUnfinishedMessage();
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

    private long organizationId_ ;
    /**
     * <code>int64 organization_id = 2 [json_name = "organizationId"];</code>
     * @return The organizationId.
     */
    @java.lang.Override
    public long getOrganizationId() {
      return organizationId_;
    }
    /**
     * <code>int64 organization_id = 2 [json_name = "organizationId"];</code>
     * @param value The organizationId to set.
     * @return This builder for chaining.
     */
    public Builder setOrganizationId(long value) {
      
      organizationId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 organization_id = 2 [json_name = "organizationId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOrganizationId() {
      
      organizationId_ = 0L;
      onChanged();
      return this;
    }

    private long requestId_ ;
    /**
     * <code>int64 request_id = 3 [json_name = "requestId"];</code>
     * @return The requestId.
     */
    @java.lang.Override
    public long getRequestId() {
      return requestId_;
    }
    /**
     * <code>int64 request_id = 3 [json_name = "requestId"];</code>
     * @param value The requestId to set.
     * @return This builder for chaining.
     */
    public Builder setRequestId(long value) {
      
      requestId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 request_id = 3 [json_name = "requestId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRequestId() {
      
      requestId_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.StringValue reason_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> reasonBuilder_;
    /**
     * <code>.google.protobuf.StringValue reason = 4 [json_name = "reason"];</code>
     * @return Whether the reason field is set.
     */
    public boolean hasReason() {
      return reasonBuilder_ != null || reason_ != null;
    }
    /**
     * <code>.google.protobuf.StringValue reason = 4 [json_name = "reason"];</code>
     * @return The reason.
     */
    public com.google.protobuf.StringValue getReason() {
      if (reasonBuilder_ == null) {
        return reason_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : reason_;
      } else {
        return reasonBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.StringValue reason = 4 [json_name = "reason"];</code>
     */
    public Builder setReason(com.google.protobuf.StringValue value) {
      if (reasonBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        reason_ = value;
        onChanged();
      } else {
        reasonBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue reason = 4 [json_name = "reason"];</code>
     */
    public Builder setReason(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (reasonBuilder_ == null) {
        reason_ = builderForValue.build();
        onChanged();
      } else {
        reasonBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue reason = 4 [json_name = "reason"];</code>
     */
    public Builder mergeReason(com.google.protobuf.StringValue value) {
      if (reasonBuilder_ == null) {
        if (reason_ != null) {
          reason_ =
            com.google.protobuf.StringValue.newBuilder(reason_).mergeFrom(value).buildPartial();
        } else {
          reason_ = value;
        }
        onChanged();
      } else {
        reasonBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue reason = 4 [json_name = "reason"];</code>
     */
    public Builder clearReason() {
      if (reasonBuilder_ == null) {
        reason_ = null;
        onChanged();
      } else {
        reason_ = null;
        reasonBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue reason = 4 [json_name = "reason"];</code>
     */
    public com.google.protobuf.StringValue.Builder getReasonBuilder() {
      
      onChanged();
      return getReasonFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.StringValue reason = 4 [json_name = "reason"];</code>
     */
    public com.google.protobuf.StringValueOrBuilder getReasonOrBuilder() {
      if (reasonBuilder_ != null) {
        return reasonBuilder_.getMessageOrBuilder();
      } else {
        return reason_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : reason_;
      }
    }
    /**
     * <code>.google.protobuf.StringValue reason = 4 [json_name = "reason"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getReasonFieldBuilder() {
      if (reasonBuilder_ == null) {
        reasonBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getReason(),
                getParentForChildren(),
                isClean());
        reason_ = null;
      }
      return reasonBuilder_;
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


    // @@protoc_insertion_point(builder_scope:hts.facility.RejectFacilityRequestRequest)
  }

  // @@protoc_insertion_point(class_scope:hts.facility.RejectFacilityRequestRequest)
  private static final app.onepass.apis.RejectFacilityRequestRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new app.onepass.apis.RejectFacilityRequestRequest();
  }

  public static app.onepass.apis.RejectFacilityRequestRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RejectFacilityRequestRequest>
      PARSER = new com.google.protobuf.AbstractParser<RejectFacilityRequestRequest>() {
    @java.lang.Override
    public RejectFacilityRequestRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RejectFacilityRequestRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RejectFacilityRequestRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RejectFacilityRequestRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public app.onepass.apis.RejectFacilityRequestRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

