// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/account/service.proto

package app.onepass.apis;

/**
 * Protobuf type {@code hts.account.RemoveRoleRequest}
 */
public final class RemoveRoleRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:hts.account.RemoveRoleRequest)
    RemoveRoleRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RemoveRoleRequest.newBuilder() to construct.
  private RemoveRoleRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RemoveRoleRequest() {
    role_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RemoveRoleRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RemoveRoleRequest(
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

            role_ = rawValue;
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
    return app.onepass.apis.AccountProto.internal_static_hts_account_RemoveRoleRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return app.onepass.apis.AccountProto.internal_static_hts_account_RemoveRoleRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            app.onepass.apis.RemoveRoleRequest.class, app.onepass.apis.RemoveRoleRequest.Builder.class);
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

  public static final int ROLE_FIELD_NUMBER = 3;
  private int role_;
  /**
   * <code>.hts.account.Role role = 3 [json_name = "role"];</code>
   * @return The enum numeric value on the wire for role.
   */
  @java.lang.Override public int getRoleValue() {
    return role_;
  }
  /**
   * <code>.hts.account.Role role = 3 [json_name = "role"];</code>
   * @return The role.
   */
  @java.lang.Override public app.onepass.apis.Role getRole() {
    @SuppressWarnings("deprecation")
    app.onepass.apis.Role result = app.onepass.apis.Role.valueOf(role_);
    return result == null ? app.onepass.apis.Role.UNRECOGNIZED : result;
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
    if (role_ != app.onepass.apis.Role.ROLE_UNSPECIFIED.getNumber()) {
      output.writeEnum(3, role_);
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
    if (role_ != app.onepass.apis.Role.ROLE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, role_);
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
    if (!(obj instanceof app.onepass.apis.RemoveRoleRequest)) {
      return super.equals(obj);
    }
    app.onepass.apis.RemoveRoleRequest other = (app.onepass.apis.RemoveRoleRequest) obj;

    if (getUserId()
        != other.getUserId()) return false;
    if (getOrganizationId()
        != other.getOrganizationId()) return false;
    if (role_ != other.role_) return false;
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
    hash = (37 * hash) + ROLE_FIELD_NUMBER;
    hash = (53 * hash) + role_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static app.onepass.apis.RemoveRoleRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.RemoveRoleRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.RemoveRoleRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.RemoveRoleRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.RemoveRoleRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.RemoveRoleRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.RemoveRoleRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.onepass.apis.RemoveRoleRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.onepass.apis.RemoveRoleRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static app.onepass.apis.RemoveRoleRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.onepass.apis.RemoveRoleRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.onepass.apis.RemoveRoleRequest parseFrom(
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
  public static Builder newBuilder(app.onepass.apis.RemoveRoleRequest prototype) {
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
   * Protobuf type {@code hts.account.RemoveRoleRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:hts.account.RemoveRoleRequest)
      app.onepass.apis.RemoveRoleRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return app.onepass.apis.AccountProto.internal_static_hts_account_RemoveRoleRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return app.onepass.apis.AccountProto.internal_static_hts_account_RemoveRoleRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              app.onepass.apis.RemoveRoleRequest.class, app.onepass.apis.RemoveRoleRequest.Builder.class);
    }

    // Construct using app.onepass.apis.RemoveRoleRequest.newBuilder()
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

      role_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return app.onepass.apis.AccountProto.internal_static_hts_account_RemoveRoleRequest_descriptor;
    }

    @java.lang.Override
    public app.onepass.apis.RemoveRoleRequest getDefaultInstanceForType() {
      return app.onepass.apis.RemoveRoleRequest.getDefaultInstance();
    }

    @java.lang.Override
    public app.onepass.apis.RemoveRoleRequest build() {
      app.onepass.apis.RemoveRoleRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public app.onepass.apis.RemoveRoleRequest buildPartial() {
      app.onepass.apis.RemoveRoleRequest result = new app.onepass.apis.RemoveRoleRequest(this);
      result.userId_ = userId_;
      result.organizationId_ = organizationId_;
      result.role_ = role_;
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
      if (other instanceof app.onepass.apis.RemoveRoleRequest) {
        return mergeFrom((app.onepass.apis.RemoveRoleRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(app.onepass.apis.RemoveRoleRequest other) {
      if (other == app.onepass.apis.RemoveRoleRequest.getDefaultInstance()) return this;
      if (other.getUserId() != 0) {
        setUserId(other.getUserId());
      }
      if (other.getOrganizationId() != 0) {
        setOrganizationId(other.getOrganizationId());
      }
      if (other.role_ != 0) {
        setRoleValue(other.getRoleValue());
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
      app.onepass.apis.RemoveRoleRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (app.onepass.apis.RemoveRoleRequest) e.getUnfinishedMessage();
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

    private int role_ = 0;
    /**
     * <code>.hts.account.Role role = 3 [json_name = "role"];</code>
     * @return The enum numeric value on the wire for role.
     */
    @java.lang.Override public int getRoleValue() {
      return role_;
    }
    /**
     * <code>.hts.account.Role role = 3 [json_name = "role"];</code>
     * @param value The enum numeric value on the wire for role to set.
     * @return This builder for chaining.
     */
    public Builder setRoleValue(int value) {
      
      role_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.hts.account.Role role = 3 [json_name = "role"];</code>
     * @return The role.
     */
    @java.lang.Override
    public app.onepass.apis.Role getRole() {
      @SuppressWarnings("deprecation")
      app.onepass.apis.Role result = app.onepass.apis.Role.valueOf(role_);
      return result == null ? app.onepass.apis.Role.UNRECOGNIZED : result;
    }
    /**
     * <code>.hts.account.Role role = 3 [json_name = "role"];</code>
     * @param value The role to set.
     * @return This builder for chaining.
     */
    public Builder setRole(app.onepass.apis.Role value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      role_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.hts.account.Role role = 3 [json_name = "role"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRole() {
      
      role_ = 0;
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


    // @@protoc_insertion_point(builder_scope:hts.account.RemoveRoleRequest)
  }

  // @@protoc_insertion_point(class_scope:hts.account.RemoveRoleRequest)
  private static final app.onepass.apis.RemoveRoleRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new app.onepass.apis.RemoveRoleRequest();
  }

  public static app.onepass.apis.RemoveRoleRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RemoveRoleRequest>
      PARSER = new com.google.protobuf.AbstractParser<RemoveRoleRequest>() {
    @java.lang.Override
    public RemoveRoleRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RemoveRoleRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RemoveRoleRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RemoveRoleRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public app.onepass.apis.RemoveRoleRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

