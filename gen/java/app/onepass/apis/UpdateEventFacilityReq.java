// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/organizer/service.proto

package app.onepass.apis;

/**
 * Protobuf type {@code hts.facility.UpdateEventFacilityReq}
 */
public final class UpdateEventFacilityReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:hts.facility.UpdateEventFacilityReq)
    UpdateEventFacilityReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateEventFacilityReq.newBuilder() to construct.
  private UpdateEventFacilityReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateEventFacilityReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateEventFacilityReq();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateEventFacilityReq(
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
          case 18: {
            app.onepass.apis.Facility.Builder subBuilder = null;
            if (facility_ != null) {
              subBuilder = facility_.toBuilder();
            }
            facility_ = input.readMessage(app.onepass.apis.Facility.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(facility_);
              facility_ = subBuilder.buildPartial();
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
    return app.onepass.apis.FacilityProto.internal_static_hts_facility_UpdateEventFacilityReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return app.onepass.apis.FacilityProto.internal_static_hts_facility_UpdateEventFacilityReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            app.onepass.apis.UpdateEventFacilityReq.class, app.onepass.apis.UpdateEventFacilityReq.Builder.class);
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

  public static final int FACILITY_FIELD_NUMBER = 2;
  private app.onepass.apis.Facility facility_;
  /**
   * <code>.hts.common.Facility facility = 2 [json_name = "facility"];</code>
   * @return Whether the facility field is set.
   */
  @java.lang.Override
  public boolean hasFacility() {
    return facility_ != null;
  }
  /**
   * <code>.hts.common.Facility facility = 2 [json_name = "facility"];</code>
   * @return The facility.
   */
  @java.lang.Override
  public app.onepass.apis.Facility getFacility() {
    return facility_ == null ? app.onepass.apis.Facility.getDefaultInstance() : facility_;
  }
  /**
   * <code>.hts.common.Facility facility = 2 [json_name = "facility"];</code>
   */
  @java.lang.Override
  public app.onepass.apis.FacilityOrBuilder getFacilityOrBuilder() {
    return getFacility();
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
    if (facility_ != null) {
      output.writeMessage(2, getFacility());
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
    if (facility_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getFacility());
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
    if (!(obj instanceof app.onepass.apis.UpdateEventFacilityReq)) {
      return super.equals(obj);
    }
    app.onepass.apis.UpdateEventFacilityReq other = (app.onepass.apis.UpdateEventFacilityReq) obj;

    if (getUserId()
        != other.getUserId()) return false;
    if (hasFacility() != other.hasFacility()) return false;
    if (hasFacility()) {
      if (!getFacility()
          .equals(other.getFacility())) return false;
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
    if (hasFacility()) {
      hash = (37 * hash) + FACILITY_FIELD_NUMBER;
      hash = (53 * hash) + getFacility().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static app.onepass.apis.UpdateEventFacilityReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.UpdateEventFacilityReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.UpdateEventFacilityReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.UpdateEventFacilityReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.UpdateEventFacilityReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.UpdateEventFacilityReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.UpdateEventFacilityReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.onepass.apis.UpdateEventFacilityReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.onepass.apis.UpdateEventFacilityReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static app.onepass.apis.UpdateEventFacilityReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.onepass.apis.UpdateEventFacilityReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.onepass.apis.UpdateEventFacilityReq parseFrom(
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
  public static Builder newBuilder(app.onepass.apis.UpdateEventFacilityReq prototype) {
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
   * Protobuf type {@code hts.facility.UpdateEventFacilityReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:hts.facility.UpdateEventFacilityReq)
      app.onepass.apis.UpdateEventFacilityReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return app.onepass.apis.FacilityProto.internal_static_hts_facility_UpdateEventFacilityReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return app.onepass.apis.FacilityProto.internal_static_hts_facility_UpdateEventFacilityReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              app.onepass.apis.UpdateEventFacilityReq.class, app.onepass.apis.UpdateEventFacilityReq.Builder.class);
    }

    // Construct using app.onepass.apis.UpdateEventFacilityReq.newBuilder()
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

      if (facilityBuilder_ == null) {
        facility_ = null;
      } else {
        facility_ = null;
        facilityBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return app.onepass.apis.FacilityProto.internal_static_hts_facility_UpdateEventFacilityReq_descriptor;
    }

    @java.lang.Override
    public app.onepass.apis.UpdateEventFacilityReq getDefaultInstanceForType() {
      return app.onepass.apis.UpdateEventFacilityReq.getDefaultInstance();
    }

    @java.lang.Override
    public app.onepass.apis.UpdateEventFacilityReq build() {
      app.onepass.apis.UpdateEventFacilityReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public app.onepass.apis.UpdateEventFacilityReq buildPartial() {
      app.onepass.apis.UpdateEventFacilityReq result = new app.onepass.apis.UpdateEventFacilityReq(this);
      result.userId_ = userId_;
      if (facilityBuilder_ == null) {
        result.facility_ = facility_;
      } else {
        result.facility_ = facilityBuilder_.build();
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
      if (other instanceof app.onepass.apis.UpdateEventFacilityReq) {
        return mergeFrom((app.onepass.apis.UpdateEventFacilityReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(app.onepass.apis.UpdateEventFacilityReq other) {
      if (other == app.onepass.apis.UpdateEventFacilityReq.getDefaultInstance()) return this;
      if (other.getUserId() != 0L) {
        setUserId(other.getUserId());
      }
      if (other.hasFacility()) {
        mergeFacility(other.getFacility());
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
      app.onepass.apis.UpdateEventFacilityReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (app.onepass.apis.UpdateEventFacilityReq) e.getUnfinishedMessage();
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

    private app.onepass.apis.Facility facility_;
    private com.google.protobuf.SingleFieldBuilderV3<
        app.onepass.apis.Facility, app.onepass.apis.Facility.Builder, app.onepass.apis.FacilityOrBuilder> facilityBuilder_;
    /**
     * <code>.hts.common.Facility facility = 2 [json_name = "facility"];</code>
     * @return Whether the facility field is set.
     */
    public boolean hasFacility() {
      return facilityBuilder_ != null || facility_ != null;
    }
    /**
     * <code>.hts.common.Facility facility = 2 [json_name = "facility"];</code>
     * @return The facility.
     */
    public app.onepass.apis.Facility getFacility() {
      if (facilityBuilder_ == null) {
        return facility_ == null ? app.onepass.apis.Facility.getDefaultInstance() : facility_;
      } else {
        return facilityBuilder_.getMessage();
      }
    }
    /**
     * <code>.hts.common.Facility facility = 2 [json_name = "facility"];</code>
     */
    public Builder setFacility(app.onepass.apis.Facility value) {
      if (facilityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        facility_ = value;
        onChanged();
      } else {
        facilityBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.hts.common.Facility facility = 2 [json_name = "facility"];</code>
     */
    public Builder setFacility(
        app.onepass.apis.Facility.Builder builderForValue) {
      if (facilityBuilder_ == null) {
        facility_ = builderForValue.build();
        onChanged();
      } else {
        facilityBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.hts.common.Facility facility = 2 [json_name = "facility"];</code>
     */
    public Builder mergeFacility(app.onepass.apis.Facility value) {
      if (facilityBuilder_ == null) {
        if (facility_ != null) {
          facility_ =
            app.onepass.apis.Facility.newBuilder(facility_).mergeFrom(value).buildPartial();
        } else {
          facility_ = value;
        }
        onChanged();
      } else {
        facilityBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.hts.common.Facility facility = 2 [json_name = "facility"];</code>
     */
    public Builder clearFacility() {
      if (facilityBuilder_ == null) {
        facility_ = null;
        onChanged();
      } else {
        facility_ = null;
        facilityBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.hts.common.Facility facility = 2 [json_name = "facility"];</code>
     */
    public app.onepass.apis.Facility.Builder getFacilityBuilder() {
      
      onChanged();
      return getFacilityFieldBuilder().getBuilder();
    }
    /**
     * <code>.hts.common.Facility facility = 2 [json_name = "facility"];</code>
     */
    public app.onepass.apis.FacilityOrBuilder getFacilityOrBuilder() {
      if (facilityBuilder_ != null) {
        return facilityBuilder_.getMessageOrBuilder();
      } else {
        return facility_ == null ?
            app.onepass.apis.Facility.getDefaultInstance() : facility_;
      }
    }
    /**
     * <code>.hts.common.Facility facility = 2 [json_name = "facility"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        app.onepass.apis.Facility, app.onepass.apis.Facility.Builder, app.onepass.apis.FacilityOrBuilder> 
        getFacilityFieldBuilder() {
      if (facilityBuilder_ == null) {
        facilityBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            app.onepass.apis.Facility, app.onepass.apis.Facility.Builder, app.onepass.apis.FacilityOrBuilder>(
                getFacility(),
                getParentForChildren(),
                isClean());
        facility_ = null;
      }
      return facilityBuilder_;
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


    // @@protoc_insertion_point(builder_scope:hts.facility.UpdateEventFacilityReq)
  }

  // @@protoc_insertion_point(class_scope:hts.facility.UpdateEventFacilityReq)
  private static final app.onepass.apis.UpdateEventFacilityReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new app.onepass.apis.UpdateEventFacilityReq();
  }

  public static app.onepass.apis.UpdateEventFacilityReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateEventFacilityReq>
      PARSER = new com.google.protobuf.AbstractParser<UpdateEventFacilityReq>() {
    @java.lang.Override
    public UpdateEventFacilityReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateEventFacilityReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateEventFacilityReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateEventFacilityReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public app.onepass.apis.UpdateEventFacilityReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

