// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/facility/service.proto

package app.onepass.apis;

/**
 * Protobuf type {@code hts.facility.Facility}
 */
public final class Facility extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:hts.facility.Facility)
    FacilityOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Facility.newBuilder() to construct.
  private Facility(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Facility() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Facility();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Facility(
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

            organizationId_ = input.readInt64();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 32: {

            latitude_ = input.readInt64();
            break;
          }
          case 40: {

            longitude_ = input.readInt64();
            break;
          }
          case 50: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (operatingHours_ != null) {
              subBuilder = operatingHours_.toBuilder();
            }
            operatingHours_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(operatingHours_);
              operatingHours_ = subBuilder.buildPartial();
            }

            break;
          }
          case 58: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (description_ != null) {
              subBuilder = description_.toBuilder();
            }
            description_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(description_);
              description_ = subBuilder.buildPartial();
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
    return app.onepass.apis.FacilityProto.internal_static_hts_facility_Facility_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return app.onepass.apis.FacilityProto.internal_static_hts_facility_Facility_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            app.onepass.apis.Facility.class, app.onepass.apis.Facility.Builder.class);
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

  public static final int NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LATITUDE_FIELD_NUMBER = 4;
  private long latitude_;
  /**
   * <code>int64 latitude = 4 [json_name = "latitude"];</code>
   * @return The latitude.
   */
  @java.lang.Override
  public long getLatitude() {
    return latitude_;
  }

  public static final int LONGITUDE_FIELD_NUMBER = 5;
  private long longitude_;
  /**
   * <code>int64 longitude = 5 [json_name = "longitude"];</code>
   * @return The longitude.
   */
  @java.lang.Override
  public long getLongitude() {
    return longitude_;
  }

  public static final int OPERATING_HOURS_FIELD_NUMBER = 6;
  private com.google.protobuf.StringValue operatingHours_;
  /**
   * <code>.google.protobuf.StringValue operating_hours = 6 [json_name = "operatingHours"];</code>
   * @return Whether the operatingHours field is set.
   */
  @java.lang.Override
  public boolean hasOperatingHours() {
    return operatingHours_ != null;
  }
  /**
   * <code>.google.protobuf.StringValue operating_hours = 6 [json_name = "operatingHours"];</code>
   * @return The operatingHours.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getOperatingHours() {
    return operatingHours_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : operatingHours_;
  }
  /**
   * <code>.google.protobuf.StringValue operating_hours = 6 [json_name = "operatingHours"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getOperatingHoursOrBuilder() {
    return getOperatingHours();
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 7;
  private com.google.protobuf.StringValue description_;
  /**
   * <code>.google.protobuf.StringValue description = 7 [json_name = "description"];</code>
   * @return Whether the description field is set.
   */
  @java.lang.Override
  public boolean hasDescription() {
    return description_ != null;
  }
  /**
   * <code>.google.protobuf.StringValue description = 7 [json_name = "description"];</code>
   * @return The description.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getDescription() {
    return description_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : description_;
  }
  /**
   * <code>.google.protobuf.StringValue description = 7 [json_name = "description"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getDescriptionOrBuilder() {
    return getDescription();
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
    if (organizationId_ != 0L) {
      output.writeInt64(2, organizationId_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, name_);
    }
    if (latitude_ != 0L) {
      output.writeInt64(4, latitude_);
    }
    if (longitude_ != 0L) {
      output.writeInt64(5, longitude_);
    }
    if (operatingHours_ != null) {
      output.writeMessage(6, getOperatingHours());
    }
    if (description_ != null) {
      output.writeMessage(7, getDescription());
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
    if (organizationId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, organizationId_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, name_);
    }
    if (latitude_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, latitude_);
    }
    if (longitude_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, longitude_);
    }
    if (operatingHours_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, getOperatingHours());
    }
    if (description_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(7, getDescription());
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
    if (!(obj instanceof app.onepass.apis.Facility)) {
      return super.equals(obj);
    }
    app.onepass.apis.Facility other = (app.onepass.apis.Facility) obj;

    if (getId()
        != other.getId()) return false;
    if (getOrganizationId()
        != other.getOrganizationId()) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (getLatitude()
        != other.getLatitude()) return false;
    if (getLongitude()
        != other.getLongitude()) return false;
    if (hasOperatingHours() != other.hasOperatingHours()) return false;
    if (hasOperatingHours()) {
      if (!getOperatingHours()
          .equals(other.getOperatingHours())) return false;
    }
    if (hasDescription() != other.hasDescription()) return false;
    if (hasDescription()) {
      if (!getDescription()
          .equals(other.getDescription())) return false;
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
    hash = (37 * hash) + ORGANIZATION_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getOrganizationId());
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + LATITUDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLatitude());
    hash = (37 * hash) + LONGITUDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLongitude());
    if (hasOperatingHours()) {
      hash = (37 * hash) + OPERATING_HOURS_FIELD_NUMBER;
      hash = (53 * hash) + getOperatingHours().hashCode();
    }
    if (hasDescription()) {
      hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
      hash = (53 * hash) + getDescription().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static app.onepass.apis.Facility parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.Facility parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.Facility parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.Facility parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.Facility parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.Facility parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.Facility parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.onepass.apis.Facility parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.onepass.apis.Facility parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static app.onepass.apis.Facility parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.onepass.apis.Facility parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.onepass.apis.Facility parseFrom(
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
  public static Builder newBuilder(app.onepass.apis.Facility prototype) {
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
   * Protobuf type {@code hts.facility.Facility}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:hts.facility.Facility)
      app.onepass.apis.FacilityOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return app.onepass.apis.FacilityProto.internal_static_hts_facility_Facility_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return app.onepass.apis.FacilityProto.internal_static_hts_facility_Facility_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              app.onepass.apis.Facility.class, app.onepass.apis.Facility.Builder.class);
    }

    // Construct using app.onepass.apis.Facility.newBuilder()
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

      organizationId_ = 0L;

      name_ = "";

      latitude_ = 0L;

      longitude_ = 0L;

      if (operatingHoursBuilder_ == null) {
        operatingHours_ = null;
      } else {
        operatingHours_ = null;
        operatingHoursBuilder_ = null;
      }
      if (descriptionBuilder_ == null) {
        description_ = null;
      } else {
        description_ = null;
        descriptionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return app.onepass.apis.FacilityProto.internal_static_hts_facility_Facility_descriptor;
    }

    @java.lang.Override
    public app.onepass.apis.Facility getDefaultInstanceForType() {
      return app.onepass.apis.Facility.getDefaultInstance();
    }

    @java.lang.Override
    public app.onepass.apis.Facility build() {
      app.onepass.apis.Facility result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public app.onepass.apis.Facility buildPartial() {
      app.onepass.apis.Facility result = new app.onepass.apis.Facility(this);
      result.id_ = id_;
      result.organizationId_ = organizationId_;
      result.name_ = name_;
      result.latitude_ = latitude_;
      result.longitude_ = longitude_;
      if (operatingHoursBuilder_ == null) {
        result.operatingHours_ = operatingHours_;
      } else {
        result.operatingHours_ = operatingHoursBuilder_.build();
      }
      if (descriptionBuilder_ == null) {
        result.description_ = description_;
      } else {
        result.description_ = descriptionBuilder_.build();
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
      if (other instanceof app.onepass.apis.Facility) {
        return mergeFrom((app.onepass.apis.Facility)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(app.onepass.apis.Facility other) {
      if (other == app.onepass.apis.Facility.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (other.getOrganizationId() != 0L) {
        setOrganizationId(other.getOrganizationId());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getLatitude() != 0L) {
        setLatitude(other.getLatitude());
      }
      if (other.getLongitude() != 0L) {
        setLongitude(other.getLongitude());
      }
      if (other.hasOperatingHours()) {
        mergeOperatingHours(other.getOperatingHours());
      }
      if (other.hasDescription()) {
        mergeDescription(other.getDescription());
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
      app.onepass.apis.Facility parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (app.onepass.apis.Facility) e.getUnfinishedMessage();
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

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 3 [json_name = "name"];</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 3 [json_name = "name"];</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 3 [json_name = "name"];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 3 [json_name = "name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 3 [json_name = "name"];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private long latitude_ ;
    /**
     * <code>int64 latitude = 4 [json_name = "latitude"];</code>
     * @return The latitude.
     */
    @java.lang.Override
    public long getLatitude() {
      return latitude_;
    }
    /**
     * <code>int64 latitude = 4 [json_name = "latitude"];</code>
     * @param value The latitude to set.
     * @return This builder for chaining.
     */
    public Builder setLatitude(long value) {
      
      latitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 latitude = 4 [json_name = "latitude"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLatitude() {
      
      latitude_ = 0L;
      onChanged();
      return this;
    }

    private long longitude_ ;
    /**
     * <code>int64 longitude = 5 [json_name = "longitude"];</code>
     * @return The longitude.
     */
    @java.lang.Override
    public long getLongitude() {
      return longitude_;
    }
    /**
     * <code>int64 longitude = 5 [json_name = "longitude"];</code>
     * @param value The longitude to set.
     * @return This builder for chaining.
     */
    public Builder setLongitude(long value) {
      
      longitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 longitude = 5 [json_name = "longitude"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLongitude() {
      
      longitude_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.StringValue operatingHours_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> operatingHoursBuilder_;
    /**
     * <code>.google.protobuf.StringValue operating_hours = 6 [json_name = "operatingHours"];</code>
     * @return Whether the operatingHours field is set.
     */
    public boolean hasOperatingHours() {
      return operatingHoursBuilder_ != null || operatingHours_ != null;
    }
    /**
     * <code>.google.protobuf.StringValue operating_hours = 6 [json_name = "operatingHours"];</code>
     * @return The operatingHours.
     */
    public com.google.protobuf.StringValue getOperatingHours() {
      if (operatingHoursBuilder_ == null) {
        return operatingHours_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : operatingHours_;
      } else {
        return operatingHoursBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.StringValue operating_hours = 6 [json_name = "operatingHours"];</code>
     */
    public Builder setOperatingHours(com.google.protobuf.StringValue value) {
      if (operatingHoursBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        operatingHours_ = value;
        onChanged();
      } else {
        operatingHoursBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue operating_hours = 6 [json_name = "operatingHours"];</code>
     */
    public Builder setOperatingHours(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (operatingHoursBuilder_ == null) {
        operatingHours_ = builderForValue.build();
        onChanged();
      } else {
        operatingHoursBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue operating_hours = 6 [json_name = "operatingHours"];</code>
     */
    public Builder mergeOperatingHours(com.google.protobuf.StringValue value) {
      if (operatingHoursBuilder_ == null) {
        if (operatingHours_ != null) {
          operatingHours_ =
            com.google.protobuf.StringValue.newBuilder(operatingHours_).mergeFrom(value).buildPartial();
        } else {
          operatingHours_ = value;
        }
        onChanged();
      } else {
        operatingHoursBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue operating_hours = 6 [json_name = "operatingHours"];</code>
     */
    public Builder clearOperatingHours() {
      if (operatingHoursBuilder_ == null) {
        operatingHours_ = null;
        onChanged();
      } else {
        operatingHours_ = null;
        operatingHoursBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue operating_hours = 6 [json_name = "operatingHours"];</code>
     */
    public com.google.protobuf.StringValue.Builder getOperatingHoursBuilder() {
      
      onChanged();
      return getOperatingHoursFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.StringValue operating_hours = 6 [json_name = "operatingHours"];</code>
     */
    public com.google.protobuf.StringValueOrBuilder getOperatingHoursOrBuilder() {
      if (operatingHoursBuilder_ != null) {
        return operatingHoursBuilder_.getMessageOrBuilder();
      } else {
        return operatingHours_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : operatingHours_;
      }
    }
    /**
     * <code>.google.protobuf.StringValue operating_hours = 6 [json_name = "operatingHours"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getOperatingHoursFieldBuilder() {
      if (operatingHoursBuilder_ == null) {
        operatingHoursBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getOperatingHours(),
                getParentForChildren(),
                isClean());
        operatingHours_ = null;
      }
      return operatingHoursBuilder_;
    }

    private com.google.protobuf.StringValue description_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> descriptionBuilder_;
    /**
     * <code>.google.protobuf.StringValue description = 7 [json_name = "description"];</code>
     * @return Whether the description field is set.
     */
    public boolean hasDescription() {
      return descriptionBuilder_ != null || description_ != null;
    }
    /**
     * <code>.google.protobuf.StringValue description = 7 [json_name = "description"];</code>
     * @return The description.
     */
    public com.google.protobuf.StringValue getDescription() {
      if (descriptionBuilder_ == null) {
        return description_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : description_;
      } else {
        return descriptionBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.StringValue description = 7 [json_name = "description"];</code>
     */
    public Builder setDescription(com.google.protobuf.StringValue value) {
      if (descriptionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        description_ = value;
        onChanged();
      } else {
        descriptionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue description = 7 [json_name = "description"];</code>
     */
    public Builder setDescription(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (descriptionBuilder_ == null) {
        description_ = builderForValue.build();
        onChanged();
      } else {
        descriptionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue description = 7 [json_name = "description"];</code>
     */
    public Builder mergeDescription(com.google.protobuf.StringValue value) {
      if (descriptionBuilder_ == null) {
        if (description_ != null) {
          description_ =
            com.google.protobuf.StringValue.newBuilder(description_).mergeFrom(value).buildPartial();
        } else {
          description_ = value;
        }
        onChanged();
      } else {
        descriptionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue description = 7 [json_name = "description"];</code>
     */
    public Builder clearDescription() {
      if (descriptionBuilder_ == null) {
        description_ = null;
        onChanged();
      } else {
        description_ = null;
        descriptionBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue description = 7 [json_name = "description"];</code>
     */
    public com.google.protobuf.StringValue.Builder getDescriptionBuilder() {
      
      onChanged();
      return getDescriptionFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.StringValue description = 7 [json_name = "description"];</code>
     */
    public com.google.protobuf.StringValueOrBuilder getDescriptionOrBuilder() {
      if (descriptionBuilder_ != null) {
        return descriptionBuilder_.getMessageOrBuilder();
      } else {
        return description_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : description_;
      }
    }
    /**
     * <code>.google.protobuf.StringValue description = 7 [json_name = "description"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getDescriptionFieldBuilder() {
      if (descriptionBuilder_ == null) {
        descriptionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getDescription(),
                getParentForChildren(),
                isClean());
        description_ = null;
      }
      return descriptionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:hts.facility.Facility)
  }

  // @@protoc_insertion_point(class_scope:hts.facility.Facility)
  private static final app.onepass.apis.Facility DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new app.onepass.apis.Facility();
  }

  public static app.onepass.apis.Facility getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Facility>
      PARSER = new com.google.protobuf.AbstractParser<Facility>() {
    @java.lang.Override
    public Facility parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Facility(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Facility> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Facility> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public app.onepass.apis.Facility getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

