// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/facility/service.proto

package app.onepass.apis;

/**
 * Protobuf type {@code hts.facility.CreateFacilityRequestRequest}
 */
public final class CreateFacilityRequestRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:hts.facility.CreateFacilityRequestRequest)
    CreateFacilityRequestRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateFacilityRequestRequest.newBuilder() to construct.
  private CreateFacilityRequestRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateFacilityRequestRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateFacilityRequestRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateFacilityRequestRequest(
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

            eventId_ = input.readInt64();
            break;
          }
          case 24: {

            facilityId_ = input.readInt64();
            break;
          }
          case 34: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (start_ != null) {
              subBuilder = start_.toBuilder();
            }
            start_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(start_);
              start_ = subBuilder.buildPartial();
            }

            break;
          }
          case 42: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (end_ != null) {
              subBuilder = end_.toBuilder();
            }
            end_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(end_);
              end_ = subBuilder.buildPartial();
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
    return app.onepass.apis.FacilityProto.internal_static_hts_facility_CreateFacilityRequestRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return app.onepass.apis.FacilityProto.internal_static_hts_facility_CreateFacilityRequestRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            app.onepass.apis.CreateFacilityRequestRequest.class, app.onepass.apis.CreateFacilityRequestRequest.Builder.class);
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

  public static final int EVENT_ID_FIELD_NUMBER = 2;
  private long eventId_;
  /**
   * <code>int64 event_id = 2 [json_name = "eventId"];</code>
   * @return The eventId.
   */
  @java.lang.Override
  public long getEventId() {
    return eventId_;
  }

  public static final int FACILITY_ID_FIELD_NUMBER = 3;
  private long facilityId_;
  /**
   * <code>int64 facility_id = 3 [json_name = "facilityId"];</code>
   * @return The facilityId.
   */
  @java.lang.Override
  public long getFacilityId() {
    return facilityId_;
  }

  public static final int START_FIELD_NUMBER = 4;
  private com.google.protobuf.Timestamp start_;
  /**
   * <code>.google.protobuf.Timestamp start = 4 [json_name = "start"];</code>
   * @return Whether the start field is set.
   */
  @java.lang.Override
  public boolean hasStart() {
    return start_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp start = 4 [json_name = "start"];</code>
   * @return The start.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getStart() {
    return start_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : start_;
  }
  /**
   * <code>.google.protobuf.Timestamp start = 4 [json_name = "start"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getStartOrBuilder() {
    return getStart();
  }

  public static final int END_FIELD_NUMBER = 5;
  private com.google.protobuf.Timestamp end_;
  /**
   * <code>.google.protobuf.Timestamp end = 5 [json_name = "end"];</code>
   * @return Whether the end field is set.
   */
  @java.lang.Override
  public boolean hasEnd() {
    return end_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp end = 5 [json_name = "end"];</code>
   * @return The end.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getEnd() {
    return end_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : end_;
  }
  /**
   * <code>.google.protobuf.Timestamp end = 5 [json_name = "end"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getEndOrBuilder() {
    return getEnd();
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
    if (eventId_ != 0L) {
      output.writeInt64(2, eventId_);
    }
    if (facilityId_ != 0L) {
      output.writeInt64(3, facilityId_);
    }
    if (start_ != null) {
      output.writeMessage(4, getStart());
    }
    if (end_ != null) {
      output.writeMessage(5, getEnd());
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
    if (eventId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, eventId_);
    }
    if (facilityId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, facilityId_);
    }
    if (start_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getStart());
    }
    if (end_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getEnd());
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
    if (!(obj instanceof app.onepass.apis.CreateFacilityRequestRequest)) {
      return super.equals(obj);
    }
    app.onepass.apis.CreateFacilityRequestRequest other = (app.onepass.apis.CreateFacilityRequestRequest) obj;

    if (getUserId()
        != other.getUserId()) return false;
    if (getEventId()
        != other.getEventId()) return false;
    if (getFacilityId()
        != other.getFacilityId()) return false;
    if (hasStart() != other.hasStart()) return false;
    if (hasStart()) {
      if (!getStart()
          .equals(other.getStart())) return false;
    }
    if (hasEnd() != other.hasEnd()) return false;
    if (hasEnd()) {
      if (!getEnd()
          .equals(other.getEnd())) return false;
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
    hash = (37 * hash) + EVENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEventId());
    hash = (37 * hash) + FACILITY_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFacilityId());
    if (hasStart()) {
      hash = (37 * hash) + START_FIELD_NUMBER;
      hash = (53 * hash) + getStart().hashCode();
    }
    if (hasEnd()) {
      hash = (37 * hash) + END_FIELD_NUMBER;
      hash = (53 * hash) + getEnd().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static app.onepass.apis.CreateFacilityRequestRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.CreateFacilityRequestRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.CreateFacilityRequestRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.CreateFacilityRequestRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.CreateFacilityRequestRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.CreateFacilityRequestRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.CreateFacilityRequestRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.onepass.apis.CreateFacilityRequestRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.onepass.apis.CreateFacilityRequestRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static app.onepass.apis.CreateFacilityRequestRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.onepass.apis.CreateFacilityRequestRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.onepass.apis.CreateFacilityRequestRequest parseFrom(
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
  public static Builder newBuilder(app.onepass.apis.CreateFacilityRequestRequest prototype) {
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
   * Protobuf type {@code hts.facility.CreateFacilityRequestRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:hts.facility.CreateFacilityRequestRequest)
      app.onepass.apis.CreateFacilityRequestRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return app.onepass.apis.FacilityProto.internal_static_hts_facility_CreateFacilityRequestRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return app.onepass.apis.FacilityProto.internal_static_hts_facility_CreateFacilityRequestRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              app.onepass.apis.CreateFacilityRequestRequest.class, app.onepass.apis.CreateFacilityRequestRequest.Builder.class);
    }

    // Construct using app.onepass.apis.CreateFacilityRequestRequest.newBuilder()
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

      eventId_ = 0L;

      facilityId_ = 0L;

      if (startBuilder_ == null) {
        start_ = null;
      } else {
        start_ = null;
        startBuilder_ = null;
      }
      if (endBuilder_ == null) {
        end_ = null;
      } else {
        end_ = null;
        endBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return app.onepass.apis.FacilityProto.internal_static_hts_facility_CreateFacilityRequestRequest_descriptor;
    }

    @java.lang.Override
    public app.onepass.apis.CreateFacilityRequestRequest getDefaultInstanceForType() {
      return app.onepass.apis.CreateFacilityRequestRequest.getDefaultInstance();
    }

    @java.lang.Override
    public app.onepass.apis.CreateFacilityRequestRequest build() {
      app.onepass.apis.CreateFacilityRequestRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public app.onepass.apis.CreateFacilityRequestRequest buildPartial() {
      app.onepass.apis.CreateFacilityRequestRequest result = new app.onepass.apis.CreateFacilityRequestRequest(this);
      result.userId_ = userId_;
      result.eventId_ = eventId_;
      result.facilityId_ = facilityId_;
      if (startBuilder_ == null) {
        result.start_ = start_;
      } else {
        result.start_ = startBuilder_.build();
      }
      if (endBuilder_ == null) {
        result.end_ = end_;
      } else {
        result.end_ = endBuilder_.build();
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
      if (other instanceof app.onepass.apis.CreateFacilityRequestRequest) {
        return mergeFrom((app.onepass.apis.CreateFacilityRequestRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(app.onepass.apis.CreateFacilityRequestRequest other) {
      if (other == app.onepass.apis.CreateFacilityRequestRequest.getDefaultInstance()) return this;
      if (other.getUserId() != 0L) {
        setUserId(other.getUserId());
      }
      if (other.getEventId() != 0L) {
        setEventId(other.getEventId());
      }
      if (other.getFacilityId() != 0L) {
        setFacilityId(other.getFacilityId());
      }
      if (other.hasStart()) {
        mergeStart(other.getStart());
      }
      if (other.hasEnd()) {
        mergeEnd(other.getEnd());
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
      app.onepass.apis.CreateFacilityRequestRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (app.onepass.apis.CreateFacilityRequestRequest) e.getUnfinishedMessage();
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

    private long eventId_ ;
    /**
     * <code>int64 event_id = 2 [json_name = "eventId"];</code>
     * @return The eventId.
     */
    @java.lang.Override
    public long getEventId() {
      return eventId_;
    }
    /**
     * <code>int64 event_id = 2 [json_name = "eventId"];</code>
     * @param value The eventId to set.
     * @return This builder for chaining.
     */
    public Builder setEventId(long value) {
      
      eventId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 event_id = 2 [json_name = "eventId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEventId() {
      
      eventId_ = 0L;
      onChanged();
      return this;
    }

    private long facilityId_ ;
    /**
     * <code>int64 facility_id = 3 [json_name = "facilityId"];</code>
     * @return The facilityId.
     */
    @java.lang.Override
    public long getFacilityId() {
      return facilityId_;
    }
    /**
     * <code>int64 facility_id = 3 [json_name = "facilityId"];</code>
     * @param value The facilityId to set.
     * @return This builder for chaining.
     */
    public Builder setFacilityId(long value) {
      
      facilityId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 facility_id = 3 [json_name = "facilityId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFacilityId() {
      
      facilityId_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp start_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> startBuilder_;
    /**
     * <code>.google.protobuf.Timestamp start = 4 [json_name = "start"];</code>
     * @return Whether the start field is set.
     */
    public boolean hasStart() {
      return startBuilder_ != null || start_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp start = 4 [json_name = "start"];</code>
     * @return The start.
     */
    public com.google.protobuf.Timestamp getStart() {
      if (startBuilder_ == null) {
        return start_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : start_;
      } else {
        return startBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp start = 4 [json_name = "start"];</code>
     */
    public Builder setStart(com.google.protobuf.Timestamp value) {
      if (startBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        start_ = value;
        onChanged();
      } else {
        startBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp start = 4 [json_name = "start"];</code>
     */
    public Builder setStart(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (startBuilder_ == null) {
        start_ = builderForValue.build();
        onChanged();
      } else {
        startBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp start = 4 [json_name = "start"];</code>
     */
    public Builder mergeStart(com.google.protobuf.Timestamp value) {
      if (startBuilder_ == null) {
        if (start_ != null) {
          start_ =
            com.google.protobuf.Timestamp.newBuilder(start_).mergeFrom(value).buildPartial();
        } else {
          start_ = value;
        }
        onChanged();
      } else {
        startBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp start = 4 [json_name = "start"];</code>
     */
    public Builder clearStart() {
      if (startBuilder_ == null) {
        start_ = null;
        onChanged();
      } else {
        start_ = null;
        startBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp start = 4 [json_name = "start"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getStartBuilder() {
      
      onChanged();
      return getStartFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp start = 4 [json_name = "start"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getStartOrBuilder() {
      if (startBuilder_ != null) {
        return startBuilder_.getMessageOrBuilder();
      } else {
        return start_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : start_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp start = 4 [json_name = "start"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getStartFieldBuilder() {
      if (startBuilder_ == null) {
        startBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getStart(),
                getParentForChildren(),
                isClean());
        start_ = null;
      }
      return startBuilder_;
    }

    private com.google.protobuf.Timestamp end_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> endBuilder_;
    /**
     * <code>.google.protobuf.Timestamp end = 5 [json_name = "end"];</code>
     * @return Whether the end field is set.
     */
    public boolean hasEnd() {
      return endBuilder_ != null || end_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp end = 5 [json_name = "end"];</code>
     * @return The end.
     */
    public com.google.protobuf.Timestamp getEnd() {
      if (endBuilder_ == null) {
        return end_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : end_;
      } else {
        return endBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp end = 5 [json_name = "end"];</code>
     */
    public Builder setEnd(com.google.protobuf.Timestamp value) {
      if (endBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        end_ = value;
        onChanged();
      } else {
        endBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp end = 5 [json_name = "end"];</code>
     */
    public Builder setEnd(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (endBuilder_ == null) {
        end_ = builderForValue.build();
        onChanged();
      } else {
        endBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp end = 5 [json_name = "end"];</code>
     */
    public Builder mergeEnd(com.google.protobuf.Timestamp value) {
      if (endBuilder_ == null) {
        if (end_ != null) {
          end_ =
            com.google.protobuf.Timestamp.newBuilder(end_).mergeFrom(value).buildPartial();
        } else {
          end_ = value;
        }
        onChanged();
      } else {
        endBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp end = 5 [json_name = "end"];</code>
     */
    public Builder clearEnd() {
      if (endBuilder_ == null) {
        end_ = null;
        onChanged();
      } else {
        end_ = null;
        endBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp end = 5 [json_name = "end"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getEndBuilder() {
      
      onChanged();
      return getEndFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp end = 5 [json_name = "end"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getEndOrBuilder() {
      if (endBuilder_ != null) {
        return endBuilder_.getMessageOrBuilder();
      } else {
        return end_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : end_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp end = 5 [json_name = "end"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getEndFieldBuilder() {
      if (endBuilder_ == null) {
        endBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getEnd(),
                getParentForChildren(),
                isClean());
        end_ = null;
      }
      return endBuilder_;
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


    // @@protoc_insertion_point(builder_scope:hts.facility.CreateFacilityRequestRequest)
  }

  // @@protoc_insertion_point(class_scope:hts.facility.CreateFacilityRequestRequest)
  private static final app.onepass.apis.CreateFacilityRequestRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new app.onepass.apis.CreateFacilityRequestRequest();
  }

  public static app.onepass.apis.CreateFacilityRequestRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateFacilityRequestRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateFacilityRequestRequest>() {
    @java.lang.Override
    public CreateFacilityRequestRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateFacilityRequestRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateFacilityRequestRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateFacilityRequestRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public app.onepass.apis.CreateFacilityRequestRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

