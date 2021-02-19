// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/facility/service.proto

package app.onepass.apis;

/**
 * Protobuf type {@code hts.facility.FacilityRequest}
 */
public final class FacilityRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:hts.facility.FacilityRequest)
    FacilityRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FacilityRequest.newBuilder() to construct.
  private FacilityRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FacilityRequest() {
    status_ = 0;
    rejectReason_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FacilityRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FacilityRequest(
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

            id_ = input.readInt64();
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
          case 32: {
            int rawValue = input.readEnum();

            status_ = rawValue;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            rejectReason_ = s;
            break;
          }
          case 50: {
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
          case 58: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (finish_ != null) {
              subBuilder = finish_.toBuilder();
            }
            finish_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(finish_);
              finish_ = subBuilder.buildPartial();
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
    return app.onepass.apis.FacilityProto.internal_static_hts_facility_FacilityRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return app.onepass.apis.FacilityProto.internal_static_hts_facility_FacilityRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            app.onepass.apis.FacilityRequest.class, app.onepass.apis.FacilityRequest.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <code>int64 id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
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

  public static final int STATUS_FIELD_NUMBER = 4;
  private int status_;
  /**
   * <code>.hts.facility.RequestStatus status = 4 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.hts.facility.RequestStatus status = 4 [json_name = "status"];</code>
   * @return The status.
   */
  @java.lang.Override public app.onepass.apis.RequestStatus getStatus() {
    @SuppressWarnings("deprecation")
    app.onepass.apis.RequestStatus result = app.onepass.apis.RequestStatus.valueOf(status_);
    return result == null ? app.onepass.apis.RequestStatus.UNRECOGNIZED : result;
  }

  public static final int REJECT_REASON_FIELD_NUMBER = 5;
  private volatile java.lang.Object rejectReason_;
  /**
   * <code>string reject_reason = 5 [json_name = "rejectReason"];</code>
   * @return The rejectReason.
   */
  @java.lang.Override
  public java.lang.String getRejectReason() {
    java.lang.Object ref = rejectReason_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rejectReason_ = s;
      return s;
    }
  }
  /**
   * <code>string reject_reason = 5 [json_name = "rejectReason"];</code>
   * @return The bytes for rejectReason.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRejectReasonBytes() {
    java.lang.Object ref = rejectReason_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      rejectReason_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int START_FIELD_NUMBER = 6;
  private com.google.protobuf.Timestamp start_;
  /**
   * <code>.google.protobuf.Timestamp start = 6 [json_name = "start"];</code>
   * @return Whether the start field is set.
   */
  @java.lang.Override
  public boolean hasStart() {
    return start_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp start = 6 [json_name = "start"];</code>
   * @return The start.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getStart() {
    return start_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : start_;
  }
  /**
   * <code>.google.protobuf.Timestamp start = 6 [json_name = "start"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getStartOrBuilder() {
    return getStart();
  }

  public static final int FINISH_FIELD_NUMBER = 7;
  private com.google.protobuf.Timestamp finish_;
  /**
   * <code>.google.protobuf.Timestamp finish = 7 [json_name = "finish"];</code>
   * @return Whether the finish field is set.
   */
  @java.lang.Override
  public boolean hasFinish() {
    return finish_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp finish = 7 [json_name = "finish"];</code>
   * @return The finish.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getFinish() {
    return finish_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : finish_;
  }
  /**
   * <code>.google.protobuf.Timestamp finish = 7 [json_name = "finish"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getFinishOrBuilder() {
    return getFinish();
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
    if (id_ != 0L) {
      output.writeInt64(1, id_);
    }
    if (eventId_ != 0L) {
      output.writeInt64(2, eventId_);
    }
    if (facilityId_ != 0L) {
      output.writeInt64(3, facilityId_);
    }
    if (status_ != app.onepass.apis.RequestStatus.PENDING.getNumber()) {
      output.writeEnum(4, status_);
    }
    if (!getRejectReasonBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, rejectReason_);
    }
    if (start_ != null) {
      output.writeMessage(6, getStart());
    }
    if (finish_ != null) {
      output.writeMessage(7, getFinish());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, id_);
    }
    if (eventId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, eventId_);
    }
    if (facilityId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, facilityId_);
    }
    if (status_ != app.onepass.apis.RequestStatus.PENDING.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, status_);
    }
    if (!getRejectReasonBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, rejectReason_);
    }
    if (start_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, getStart());
    }
    if (finish_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(7, getFinish());
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
    if (!(obj instanceof app.onepass.apis.FacilityRequest)) {
      return super.equals(obj);
    }
    app.onepass.apis.FacilityRequest other = (app.onepass.apis.FacilityRequest) obj;

    if (getId()
        != other.getId()) return false;
    if (getEventId()
        != other.getEventId()) return false;
    if (getFacilityId()
        != other.getFacilityId()) return false;
    if (status_ != other.status_) return false;
    if (!getRejectReason()
        .equals(other.getRejectReason())) return false;
    if (hasStart() != other.hasStart()) return false;
    if (hasStart()) {
      if (!getStart()
          .equals(other.getStart())) return false;
    }
    if (hasFinish() != other.hasFinish()) return false;
    if (hasFinish()) {
      if (!getFinish()
          .equals(other.getFinish())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + EVENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEventId());
    hash = (37 * hash) + FACILITY_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFacilityId());
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (37 * hash) + REJECT_REASON_FIELD_NUMBER;
    hash = (53 * hash) + getRejectReason().hashCode();
    if (hasStart()) {
      hash = (37 * hash) + START_FIELD_NUMBER;
      hash = (53 * hash) + getStart().hashCode();
    }
    if (hasFinish()) {
      hash = (37 * hash) + FINISH_FIELD_NUMBER;
      hash = (53 * hash) + getFinish().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static app.onepass.apis.FacilityRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.FacilityRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.FacilityRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.FacilityRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.FacilityRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.FacilityRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.FacilityRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.onepass.apis.FacilityRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.onepass.apis.FacilityRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static app.onepass.apis.FacilityRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.onepass.apis.FacilityRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.onepass.apis.FacilityRequest parseFrom(
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
  public static Builder newBuilder(app.onepass.apis.FacilityRequest prototype) {
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
   * Protobuf type {@code hts.facility.FacilityRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:hts.facility.FacilityRequest)
      app.onepass.apis.FacilityRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return app.onepass.apis.FacilityProto.internal_static_hts_facility_FacilityRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return app.onepass.apis.FacilityProto.internal_static_hts_facility_FacilityRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              app.onepass.apis.FacilityRequest.class, app.onepass.apis.FacilityRequest.Builder.class);
    }

    // Construct using app.onepass.apis.FacilityRequest.newBuilder()
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
      id_ = 0L;

      eventId_ = 0L;

      facilityId_ = 0L;

      status_ = 0;

      rejectReason_ = "";

      if (startBuilder_ == null) {
        start_ = null;
      } else {
        start_ = null;
        startBuilder_ = null;
      }
      if (finishBuilder_ == null) {
        finish_ = null;
      } else {
        finish_ = null;
        finishBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return app.onepass.apis.FacilityProto.internal_static_hts_facility_FacilityRequest_descriptor;
    }

    @java.lang.Override
    public app.onepass.apis.FacilityRequest getDefaultInstanceForType() {
      return app.onepass.apis.FacilityRequest.getDefaultInstance();
    }

    @java.lang.Override
    public app.onepass.apis.FacilityRequest build() {
      app.onepass.apis.FacilityRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public app.onepass.apis.FacilityRequest buildPartial() {
      app.onepass.apis.FacilityRequest result = new app.onepass.apis.FacilityRequest(this);
      result.id_ = id_;
      result.eventId_ = eventId_;
      result.facilityId_ = facilityId_;
      result.status_ = status_;
      result.rejectReason_ = rejectReason_;
      if (startBuilder_ == null) {
        result.start_ = start_;
      } else {
        result.start_ = startBuilder_.build();
      }
      if (finishBuilder_ == null) {
        result.finish_ = finish_;
      } else {
        result.finish_ = finishBuilder_.build();
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
      if (other instanceof app.onepass.apis.FacilityRequest) {
        return mergeFrom((app.onepass.apis.FacilityRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(app.onepass.apis.FacilityRequest other) {
      if (other == app.onepass.apis.FacilityRequest.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (other.getEventId() != 0L) {
        setEventId(other.getEventId());
      }
      if (other.getFacilityId() != 0L) {
        setFacilityId(other.getFacilityId());
      }
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (!other.getRejectReason().isEmpty()) {
        rejectReason_ = other.rejectReason_;
        onChanged();
      }
      if (other.hasStart()) {
        mergeStart(other.getStart());
      }
      if (other.hasFinish()) {
        mergeFinish(other.getFinish());
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
      app.onepass.apis.FacilityRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (app.onepass.apis.FacilityRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long id_ ;
    /**
     * <code>int64 id = 1 [json_name = "id"];</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <code>int64 id = 1 [json_name = "id"];</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 id = 1 [json_name = "id"];</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0L;
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

    private int status_ = 0;
    /**
     * <code>.hts.facility.RequestStatus status = 4 [json_name = "status"];</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.hts.facility.RequestStatus status = 4 [json_name = "status"];</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.hts.facility.RequestStatus status = 4 [json_name = "status"];</code>
     * @return The status.
     */
    @java.lang.Override
    public app.onepass.apis.RequestStatus getStatus() {
      @SuppressWarnings("deprecation")
      app.onepass.apis.RequestStatus result = app.onepass.apis.RequestStatus.valueOf(status_);
      return result == null ? app.onepass.apis.RequestStatus.UNRECOGNIZED : result;
    }
    /**
     * <code>.hts.facility.RequestStatus status = 4 [json_name = "status"];</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(app.onepass.apis.RequestStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.hts.facility.RequestStatus status = 4 [json_name = "status"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object rejectReason_ = "";
    /**
     * <code>string reject_reason = 5 [json_name = "rejectReason"];</code>
     * @return The rejectReason.
     */
    public java.lang.String getRejectReason() {
      java.lang.Object ref = rejectReason_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rejectReason_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string reject_reason = 5 [json_name = "rejectReason"];</code>
     * @return The bytes for rejectReason.
     */
    public com.google.protobuf.ByteString
        getRejectReasonBytes() {
      java.lang.Object ref = rejectReason_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rejectReason_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string reject_reason = 5 [json_name = "rejectReason"];</code>
     * @param value The rejectReason to set.
     * @return This builder for chaining.
     */
    public Builder setRejectReason(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      rejectReason_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string reject_reason = 5 [json_name = "rejectReason"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRejectReason() {
      
      rejectReason_ = getDefaultInstance().getRejectReason();
      onChanged();
      return this;
    }
    /**
     * <code>string reject_reason = 5 [json_name = "rejectReason"];</code>
     * @param value The bytes for rejectReason to set.
     * @return This builder for chaining.
     */
    public Builder setRejectReasonBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      rejectReason_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp start_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> startBuilder_;
    /**
     * <code>.google.protobuf.Timestamp start = 6 [json_name = "start"];</code>
     * @return Whether the start field is set.
     */
    public boolean hasStart() {
      return startBuilder_ != null || start_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp start = 6 [json_name = "start"];</code>
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
     * <code>.google.protobuf.Timestamp start = 6 [json_name = "start"];</code>
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
     * <code>.google.protobuf.Timestamp start = 6 [json_name = "start"];</code>
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
     * <code>.google.protobuf.Timestamp start = 6 [json_name = "start"];</code>
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
     * <code>.google.protobuf.Timestamp start = 6 [json_name = "start"];</code>
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
     * <code>.google.protobuf.Timestamp start = 6 [json_name = "start"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getStartBuilder() {
      
      onChanged();
      return getStartFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp start = 6 [json_name = "start"];</code>
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
     * <code>.google.protobuf.Timestamp start = 6 [json_name = "start"];</code>
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

    private com.google.protobuf.Timestamp finish_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> finishBuilder_;
    /**
     * <code>.google.protobuf.Timestamp finish = 7 [json_name = "finish"];</code>
     * @return Whether the finish field is set.
     */
    public boolean hasFinish() {
      return finishBuilder_ != null || finish_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp finish = 7 [json_name = "finish"];</code>
     * @return The finish.
     */
    public com.google.protobuf.Timestamp getFinish() {
      if (finishBuilder_ == null) {
        return finish_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : finish_;
      } else {
        return finishBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp finish = 7 [json_name = "finish"];</code>
     */
    public Builder setFinish(com.google.protobuf.Timestamp value) {
      if (finishBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        finish_ = value;
        onChanged();
      } else {
        finishBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp finish = 7 [json_name = "finish"];</code>
     */
    public Builder setFinish(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (finishBuilder_ == null) {
        finish_ = builderForValue.build();
        onChanged();
      } else {
        finishBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp finish = 7 [json_name = "finish"];</code>
     */
    public Builder mergeFinish(com.google.protobuf.Timestamp value) {
      if (finishBuilder_ == null) {
        if (finish_ != null) {
          finish_ =
            com.google.protobuf.Timestamp.newBuilder(finish_).mergeFrom(value).buildPartial();
        } else {
          finish_ = value;
        }
        onChanged();
      } else {
        finishBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp finish = 7 [json_name = "finish"];</code>
     */
    public Builder clearFinish() {
      if (finishBuilder_ == null) {
        finish_ = null;
        onChanged();
      } else {
        finish_ = null;
        finishBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp finish = 7 [json_name = "finish"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getFinishBuilder() {
      
      onChanged();
      return getFinishFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp finish = 7 [json_name = "finish"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getFinishOrBuilder() {
      if (finishBuilder_ != null) {
        return finishBuilder_.getMessageOrBuilder();
      } else {
        return finish_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : finish_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp finish = 7 [json_name = "finish"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getFinishFieldBuilder() {
      if (finishBuilder_ == null) {
        finishBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getFinish(),
                getParentForChildren(),
                isClean());
        finish_ = null;
      }
      return finishBuilder_;
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


    // @@protoc_insertion_point(builder_scope:hts.facility.FacilityRequest)
  }

  // @@protoc_insertion_point(class_scope:hts.facility.FacilityRequest)
  private static final app.onepass.apis.FacilityRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new app.onepass.apis.FacilityRequest();
  }

  public static app.onepass.apis.FacilityRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FacilityRequest>
      PARSER = new com.google.protobuf.AbstractParser<FacilityRequest>() {
    @java.lang.Override
    public FacilityRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FacilityRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FacilityRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FacilityRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public app.onepass.apis.FacilityRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
