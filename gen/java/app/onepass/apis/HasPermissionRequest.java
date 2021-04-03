// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/account/service.proto

package app.onepass.apis;

/**
 * Protobuf type {@code hts.account.HasPermissionRequest}
 */
public final class HasPermissionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:hts.account.HasPermissionRequest)
    HasPermissionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HasPermissionRequest.newBuilder() to construct.
  private HasPermissionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HasPermissionRequest() {
    permissionName_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HasPermissionRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HasPermissionRequest(
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

            userId_ = input.readInt32();
            break;
          }
          case 16: {

            organizationId_ = input.readInt32();
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            permissionName_ = rawValue;
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
    return app.onepass.apis.AccountProto.internal_static_hts_account_HasPermissionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return app.onepass.apis.AccountProto.internal_static_hts_account_HasPermissionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            app.onepass.apis.HasPermissionRequest.class, app.onepass.apis.HasPermissionRequest.Builder.class);
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

  public static final int ORGANIZATION_ID_FIELD_NUMBER = 2;
  private int organizationId_;
  /**
   * <code>int32 organization_id = 2 [json_name = "organizationId"];</code>
   * @return The organizationId.
   */
  @java.lang.Override
  public int getOrganizationId() {
    return organizationId_;
  }

  public static final int PERMISSION_NAME_FIELD_NUMBER = 3;
  private int permissionName_;
  /**
   * <code>.hts.common.Permission permission_name = 3 [json_name = "permissionName"];</code>
   * @return The enum numeric value on the wire for permissionName.
   */
  @java.lang.Override public int getPermissionNameValue() {
    return permissionName_;
  }
  /**
   * <code>.hts.common.Permission permission_name = 3 [json_name = "permissionName"];</code>
   * @return The permissionName.
   */
  @java.lang.Override public app.onepass.apis.Permission getPermissionName() {
    @SuppressWarnings("deprecation")
    app.onepass.apis.Permission result = app.onepass.apis.Permission.valueOf(permissionName_);
    return result == null ? app.onepass.apis.Permission.UNRECOGNIZED : result;
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
    if (userId_ != 0) {
      output.writeInt32(1, userId_);
    }
    if (organizationId_ != 0) {
      output.writeInt32(2, organizationId_);
    }
    if (permissionName_ != app.onepass.apis.Permission.PERMISSION_UNSPECIFIED.getNumber()) {
      output.writeEnum(3, permissionName_);
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
    if (organizationId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, organizationId_);
    }
    if (permissionName_ != app.onepass.apis.Permission.PERMISSION_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, permissionName_);
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
    if (!(obj instanceof app.onepass.apis.HasPermissionRequest)) {
      return super.equals(obj);
    }
    app.onepass.apis.HasPermissionRequest other = (app.onepass.apis.HasPermissionRequest) obj;

    if (getUserId()
        != other.getUserId()) return false;
    if (getOrganizationId()
        != other.getOrganizationId()) return false;
    if (permissionName_ != other.permissionName_) return false;
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
    hash = (37 * hash) + ORGANIZATION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getOrganizationId();
    hash = (37 * hash) + PERMISSION_NAME_FIELD_NUMBER;
    hash = (53 * hash) + permissionName_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static app.onepass.apis.HasPermissionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.HasPermissionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.HasPermissionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.HasPermissionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.HasPermissionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.HasPermissionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.HasPermissionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.onepass.apis.HasPermissionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.onepass.apis.HasPermissionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static app.onepass.apis.HasPermissionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.onepass.apis.HasPermissionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.onepass.apis.HasPermissionRequest parseFrom(
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
  public static Builder newBuilder(app.onepass.apis.HasPermissionRequest prototype) {
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
   * Protobuf type {@code hts.account.HasPermissionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:hts.account.HasPermissionRequest)
      app.onepass.apis.HasPermissionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return app.onepass.apis.AccountProto.internal_static_hts_account_HasPermissionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return app.onepass.apis.AccountProto.internal_static_hts_account_HasPermissionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              app.onepass.apis.HasPermissionRequest.class, app.onepass.apis.HasPermissionRequest.Builder.class);
    }

    // Construct using app.onepass.apis.HasPermissionRequest.newBuilder()
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

      organizationId_ = 0;

      permissionName_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return app.onepass.apis.AccountProto.internal_static_hts_account_HasPermissionRequest_descriptor;
    }

    @java.lang.Override
    public app.onepass.apis.HasPermissionRequest getDefaultInstanceForType() {
      return app.onepass.apis.HasPermissionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public app.onepass.apis.HasPermissionRequest build() {
      app.onepass.apis.HasPermissionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public app.onepass.apis.HasPermissionRequest buildPartial() {
      app.onepass.apis.HasPermissionRequest result = new app.onepass.apis.HasPermissionRequest(this);
      result.userId_ = userId_;
      result.organizationId_ = organizationId_;
      result.permissionName_ = permissionName_;
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
      if (other instanceof app.onepass.apis.HasPermissionRequest) {
        return mergeFrom((app.onepass.apis.HasPermissionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(app.onepass.apis.HasPermissionRequest other) {
      if (other == app.onepass.apis.HasPermissionRequest.getDefaultInstance()) return this;
      if (other.getUserId() != 0) {
        setUserId(other.getUserId());
      }
      if (other.getOrganizationId() != 0) {
        setOrganizationId(other.getOrganizationId());
      }
      if (other.permissionName_ != 0) {
        setPermissionNameValue(other.getPermissionNameValue());
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
      app.onepass.apis.HasPermissionRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (app.onepass.apis.HasPermissionRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

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

    private int organizationId_ ;
    /**
     * <code>int32 organization_id = 2 [json_name = "organizationId"];</code>
     * @return The organizationId.
     */
    @java.lang.Override
    public int getOrganizationId() {
      return organizationId_;
    }
    /**
     * <code>int32 organization_id = 2 [json_name = "organizationId"];</code>
     * @param value The organizationId to set.
     * @return This builder for chaining.
     */
    public Builder setOrganizationId(int value) {
      
      organizationId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 organization_id = 2 [json_name = "organizationId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOrganizationId() {
      
      organizationId_ = 0;
      onChanged();
      return this;
    }

    private int permissionName_ = 0;
    /**
     * <code>.hts.common.Permission permission_name = 3 [json_name = "permissionName"];</code>
     * @return The enum numeric value on the wire for permissionName.
     */
    @java.lang.Override public int getPermissionNameValue() {
      return permissionName_;
    }
    /**
     * <code>.hts.common.Permission permission_name = 3 [json_name = "permissionName"];</code>
     * @param value The enum numeric value on the wire for permissionName to set.
     * @return This builder for chaining.
     */
    public Builder setPermissionNameValue(int value) {
      
      permissionName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.hts.common.Permission permission_name = 3 [json_name = "permissionName"];</code>
     * @return The permissionName.
     */
    @java.lang.Override
    public app.onepass.apis.Permission getPermissionName() {
      @SuppressWarnings("deprecation")
      app.onepass.apis.Permission result = app.onepass.apis.Permission.valueOf(permissionName_);
      return result == null ? app.onepass.apis.Permission.UNRECOGNIZED : result;
    }
    /**
     * <code>.hts.common.Permission permission_name = 3 [json_name = "permissionName"];</code>
     * @param value The permissionName to set.
     * @return This builder for chaining.
     */
    public Builder setPermissionName(app.onepass.apis.Permission value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      permissionName_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.hts.common.Permission permission_name = 3 [json_name = "permissionName"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPermissionName() {
      
      permissionName_ = 0;
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


    // @@protoc_insertion_point(builder_scope:hts.account.HasPermissionRequest)
  }

  // @@protoc_insertion_point(class_scope:hts.account.HasPermissionRequest)
  private static final app.onepass.apis.HasPermissionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new app.onepass.apis.HasPermissionRequest();
  }

  public static app.onepass.apis.HasPermissionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HasPermissionRequest>
      PARSER = new com.google.protobuf.AbstractParser<HasPermissionRequest>() {
    @java.lang.Override
    public HasPermissionRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HasPermissionRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HasPermissionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HasPermissionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public app.onepass.apis.HasPermissionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

