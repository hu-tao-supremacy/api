// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/participant/service.proto

package app.onepass.apis;

/**
 * Protobuf type {@code hts.participant.GetEventsByFacilityIdRequest}
 */
public final class GetEventsByFacilityIdRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:hts.participant.GetEventsByFacilityIdRequest)
    GetEventsByFacilityIdRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetEventsByFacilityIdRequest.newBuilder() to construct.
  private GetEventsByFacilityIdRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetEventsByFacilityIdRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetEventsByFacilityIdRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetEventsByFacilityIdRequest(
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

            facilityId_ = input.readInt64();
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
    return app.onepass.apis.ParticipantProto.internal_static_hts_participant_GetEventsByFacilityIdRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return app.onepass.apis.ParticipantProto.internal_static_hts_participant_GetEventsByFacilityIdRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            app.onepass.apis.GetEventsByFacilityIdRequest.class, app.onepass.apis.GetEventsByFacilityIdRequest.Builder.class);
  }

  public static final int FACILITY_ID_FIELD_NUMBER = 1;
  private long facilityId_;
  /**
   * <code>int64 facility_id = 1 [json_name = "facilityId"];</code>
   * @return The facilityId.
   */
  @java.lang.Override
  public long getFacilityId() {
    return facilityId_;
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
    if (facilityId_ != 0L) {
      output.writeInt64(1, facilityId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (facilityId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, facilityId_);
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
    if (!(obj instanceof app.onepass.apis.GetEventsByFacilityIdRequest)) {
      return super.equals(obj);
    }
    app.onepass.apis.GetEventsByFacilityIdRequest other = (app.onepass.apis.GetEventsByFacilityIdRequest) obj;

    if (getFacilityId()
        != other.getFacilityId()) return false;
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
    hash = (37 * hash) + FACILITY_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFacilityId());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static app.onepass.apis.GetEventsByFacilityIdRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.GetEventsByFacilityIdRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.GetEventsByFacilityIdRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.GetEventsByFacilityIdRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.GetEventsByFacilityIdRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.GetEventsByFacilityIdRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.GetEventsByFacilityIdRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.onepass.apis.GetEventsByFacilityIdRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.onepass.apis.GetEventsByFacilityIdRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static app.onepass.apis.GetEventsByFacilityIdRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.onepass.apis.GetEventsByFacilityIdRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.onepass.apis.GetEventsByFacilityIdRequest parseFrom(
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
  public static Builder newBuilder(app.onepass.apis.GetEventsByFacilityIdRequest prototype) {
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
   * Protobuf type {@code hts.participant.GetEventsByFacilityIdRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:hts.participant.GetEventsByFacilityIdRequest)
      app.onepass.apis.GetEventsByFacilityIdRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return app.onepass.apis.ParticipantProto.internal_static_hts_participant_GetEventsByFacilityIdRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return app.onepass.apis.ParticipantProto.internal_static_hts_participant_GetEventsByFacilityIdRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              app.onepass.apis.GetEventsByFacilityIdRequest.class, app.onepass.apis.GetEventsByFacilityIdRequest.Builder.class);
    }

    // Construct using app.onepass.apis.GetEventsByFacilityIdRequest.newBuilder()
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
      facilityId_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return app.onepass.apis.ParticipantProto.internal_static_hts_participant_GetEventsByFacilityIdRequest_descriptor;
    }

    @java.lang.Override
    public app.onepass.apis.GetEventsByFacilityIdRequest getDefaultInstanceForType() {
      return app.onepass.apis.GetEventsByFacilityIdRequest.getDefaultInstance();
    }

    @java.lang.Override
    public app.onepass.apis.GetEventsByFacilityIdRequest build() {
      app.onepass.apis.GetEventsByFacilityIdRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public app.onepass.apis.GetEventsByFacilityIdRequest buildPartial() {
      app.onepass.apis.GetEventsByFacilityIdRequest result = new app.onepass.apis.GetEventsByFacilityIdRequest(this);
      result.facilityId_ = facilityId_;
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
      if (other instanceof app.onepass.apis.GetEventsByFacilityIdRequest) {
        return mergeFrom((app.onepass.apis.GetEventsByFacilityIdRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(app.onepass.apis.GetEventsByFacilityIdRequest other) {
      if (other == app.onepass.apis.GetEventsByFacilityIdRequest.getDefaultInstance()) return this;
      if (other.getFacilityId() != 0L) {
        setFacilityId(other.getFacilityId());
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
      app.onepass.apis.GetEventsByFacilityIdRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (app.onepass.apis.GetEventsByFacilityIdRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long facilityId_ ;
    /**
     * <code>int64 facility_id = 1 [json_name = "facilityId"];</code>
     * @return The facilityId.
     */
    @java.lang.Override
    public long getFacilityId() {
      return facilityId_;
    }
    /**
     * <code>int64 facility_id = 1 [json_name = "facilityId"];</code>
     * @param value The facilityId to set.
     * @return This builder for chaining.
     */
    public Builder setFacilityId(long value) {
      
      facilityId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 facility_id = 1 [json_name = "facilityId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFacilityId() {
      
      facilityId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:hts.participant.GetEventsByFacilityIdRequest)
  }

  // @@protoc_insertion_point(class_scope:hts.participant.GetEventsByFacilityIdRequest)
  private static final app.onepass.apis.GetEventsByFacilityIdRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new app.onepass.apis.GetEventsByFacilityIdRequest();
  }

  public static app.onepass.apis.GetEventsByFacilityIdRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetEventsByFacilityIdRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetEventsByFacilityIdRequest>() {
    @java.lang.Override
    public GetEventsByFacilityIdRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetEventsByFacilityIdRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetEventsByFacilityIdRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetEventsByFacilityIdRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public app.onepass.apis.GetEventsByFacilityIdRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

