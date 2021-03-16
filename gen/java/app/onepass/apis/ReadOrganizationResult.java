// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/organizer/service.proto

package app.onepass.apis;

/**
 * Protobuf type {@code hts.organizer.ReadOrganizationResult}
 */
public final class ReadOrganizationResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:hts.organizer.ReadOrganizationResult)
    ReadOrganizationResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReadOrganizationResult.newBuilder() to construct.
  private ReadOrganizationResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReadOrganizationResult() {
    organizations_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReadOrganizationResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ReadOrganizationResult(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              organizations_ = new java.util.ArrayList<app.onepass.apis.Organization>();
              mutable_bitField0_ |= 0x00000001;
            }
            organizations_.add(
                input.readMessage(app.onepass.apis.Organization.parser(), extensionRegistry));
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
        organizations_ = java.util.Collections.unmodifiableList(organizations_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return app.onepass.apis.OrganizerProto.internal_static_hts_organizer_ReadOrganizationResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return app.onepass.apis.OrganizerProto.internal_static_hts_organizer_ReadOrganizationResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            app.onepass.apis.ReadOrganizationResult.class, app.onepass.apis.ReadOrganizationResult.Builder.class);
  }

  public static final int ORGANIZATIONS_FIELD_NUMBER = 1;
  private java.util.List<app.onepass.apis.Organization> organizations_;
  /**
   * <code>repeated .hts.common.Organization organizations = 1 [json_name = "organizations"];</code>
   */
  @java.lang.Override
  public java.util.List<app.onepass.apis.Organization> getOrganizationsList() {
    return organizations_;
  }
  /**
   * <code>repeated .hts.common.Organization organizations = 1 [json_name = "organizations"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends app.onepass.apis.OrganizationOrBuilder> 
      getOrganizationsOrBuilderList() {
    return organizations_;
  }
  /**
   * <code>repeated .hts.common.Organization organizations = 1 [json_name = "organizations"];</code>
   */
  @java.lang.Override
  public int getOrganizationsCount() {
    return organizations_.size();
  }
  /**
   * <code>repeated .hts.common.Organization organizations = 1 [json_name = "organizations"];</code>
   */
  @java.lang.Override
  public app.onepass.apis.Organization getOrganizations(int index) {
    return organizations_.get(index);
  }
  /**
   * <code>repeated .hts.common.Organization organizations = 1 [json_name = "organizations"];</code>
   */
  @java.lang.Override
  public app.onepass.apis.OrganizationOrBuilder getOrganizationsOrBuilder(
      int index) {
    return organizations_.get(index);
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
    for (int i = 0; i < organizations_.size(); i++) {
      output.writeMessage(1, organizations_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < organizations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, organizations_.get(i));
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
    if (!(obj instanceof app.onepass.apis.ReadOrganizationResult)) {
      return super.equals(obj);
    }
    app.onepass.apis.ReadOrganizationResult other = (app.onepass.apis.ReadOrganizationResult) obj;

    if (!getOrganizationsList()
        .equals(other.getOrganizationsList())) return false;
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
    if (getOrganizationsCount() > 0) {
      hash = (37 * hash) + ORGANIZATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getOrganizationsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static app.onepass.apis.ReadOrganizationResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.ReadOrganizationResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.ReadOrganizationResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.ReadOrganizationResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.ReadOrganizationResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.ReadOrganizationResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.ReadOrganizationResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.onepass.apis.ReadOrganizationResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.onepass.apis.ReadOrganizationResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static app.onepass.apis.ReadOrganizationResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.onepass.apis.ReadOrganizationResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.onepass.apis.ReadOrganizationResult parseFrom(
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
  public static Builder newBuilder(app.onepass.apis.ReadOrganizationResult prototype) {
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
   * Protobuf type {@code hts.organizer.ReadOrganizationResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:hts.organizer.ReadOrganizationResult)
      app.onepass.apis.ReadOrganizationResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return app.onepass.apis.OrganizerProto.internal_static_hts_organizer_ReadOrganizationResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return app.onepass.apis.OrganizerProto.internal_static_hts_organizer_ReadOrganizationResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              app.onepass.apis.ReadOrganizationResult.class, app.onepass.apis.ReadOrganizationResult.Builder.class);
    }

    // Construct using app.onepass.apis.ReadOrganizationResult.newBuilder()
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
        getOrganizationsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (organizationsBuilder_ == null) {
        organizations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        organizationsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return app.onepass.apis.OrganizerProto.internal_static_hts_organizer_ReadOrganizationResult_descriptor;
    }

    @java.lang.Override
    public app.onepass.apis.ReadOrganizationResult getDefaultInstanceForType() {
      return app.onepass.apis.ReadOrganizationResult.getDefaultInstance();
    }

    @java.lang.Override
    public app.onepass.apis.ReadOrganizationResult build() {
      app.onepass.apis.ReadOrganizationResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public app.onepass.apis.ReadOrganizationResult buildPartial() {
      app.onepass.apis.ReadOrganizationResult result = new app.onepass.apis.ReadOrganizationResult(this);
      int from_bitField0_ = bitField0_;
      if (organizationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          organizations_ = java.util.Collections.unmodifiableList(organizations_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.organizations_ = organizations_;
      } else {
        result.organizations_ = organizationsBuilder_.build();
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
      if (other instanceof app.onepass.apis.ReadOrganizationResult) {
        return mergeFrom((app.onepass.apis.ReadOrganizationResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(app.onepass.apis.ReadOrganizationResult other) {
      if (other == app.onepass.apis.ReadOrganizationResult.getDefaultInstance()) return this;
      if (organizationsBuilder_ == null) {
        if (!other.organizations_.isEmpty()) {
          if (organizations_.isEmpty()) {
            organizations_ = other.organizations_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOrganizationsIsMutable();
            organizations_.addAll(other.organizations_);
          }
          onChanged();
        }
      } else {
        if (!other.organizations_.isEmpty()) {
          if (organizationsBuilder_.isEmpty()) {
            organizationsBuilder_.dispose();
            organizationsBuilder_ = null;
            organizations_ = other.organizations_;
            bitField0_ = (bitField0_ & ~0x00000001);
            organizationsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOrganizationsFieldBuilder() : null;
          } else {
            organizationsBuilder_.addAllMessages(other.organizations_);
          }
        }
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
      app.onepass.apis.ReadOrganizationResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (app.onepass.apis.ReadOrganizationResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<app.onepass.apis.Organization> organizations_ =
      java.util.Collections.emptyList();
    private void ensureOrganizationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        organizations_ = new java.util.ArrayList<app.onepass.apis.Organization>(organizations_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        app.onepass.apis.Organization, app.onepass.apis.Organization.Builder, app.onepass.apis.OrganizationOrBuilder> organizationsBuilder_;

    /**
     * <code>repeated .hts.common.Organization organizations = 1 [json_name = "organizations"];</code>
     */
    public java.util.List<app.onepass.apis.Organization> getOrganizationsList() {
      if (organizationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(organizations_);
      } else {
        return organizationsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .hts.common.Organization organizations = 1 [json_name = "organizations"];</code>
     */
    public int getOrganizationsCount() {
      if (organizationsBuilder_ == null) {
        return organizations_.size();
      } else {
        return organizationsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .hts.common.Organization organizations = 1 [json_name = "organizations"];</code>
     */
    public app.onepass.apis.Organization getOrganizations(int index) {
      if (organizationsBuilder_ == null) {
        return organizations_.get(index);
      } else {
        return organizationsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .hts.common.Organization organizations = 1 [json_name = "organizations"];</code>
     */
    public Builder setOrganizations(
        int index, app.onepass.apis.Organization value) {
      if (organizationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrganizationsIsMutable();
        organizations_.set(index, value);
        onChanged();
      } else {
        organizationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.Organization organizations = 1 [json_name = "organizations"];</code>
     */
    public Builder setOrganizations(
        int index, app.onepass.apis.Organization.Builder builderForValue) {
      if (organizationsBuilder_ == null) {
        ensureOrganizationsIsMutable();
        organizations_.set(index, builderForValue.build());
        onChanged();
      } else {
        organizationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.Organization organizations = 1 [json_name = "organizations"];</code>
     */
    public Builder addOrganizations(app.onepass.apis.Organization value) {
      if (organizationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrganizationsIsMutable();
        organizations_.add(value);
        onChanged();
      } else {
        organizationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.Organization organizations = 1 [json_name = "organizations"];</code>
     */
    public Builder addOrganizations(
        int index, app.onepass.apis.Organization value) {
      if (organizationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrganizationsIsMutable();
        organizations_.add(index, value);
        onChanged();
      } else {
        organizationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.Organization organizations = 1 [json_name = "organizations"];</code>
     */
    public Builder addOrganizations(
        app.onepass.apis.Organization.Builder builderForValue) {
      if (organizationsBuilder_ == null) {
        ensureOrganizationsIsMutable();
        organizations_.add(builderForValue.build());
        onChanged();
      } else {
        organizationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.Organization organizations = 1 [json_name = "organizations"];</code>
     */
    public Builder addOrganizations(
        int index, app.onepass.apis.Organization.Builder builderForValue) {
      if (organizationsBuilder_ == null) {
        ensureOrganizationsIsMutable();
        organizations_.add(index, builderForValue.build());
        onChanged();
      } else {
        organizationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.Organization organizations = 1 [json_name = "organizations"];</code>
     */
    public Builder addAllOrganizations(
        java.lang.Iterable<? extends app.onepass.apis.Organization> values) {
      if (organizationsBuilder_ == null) {
        ensureOrganizationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, organizations_);
        onChanged();
      } else {
        organizationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.Organization organizations = 1 [json_name = "organizations"];</code>
     */
    public Builder clearOrganizations() {
      if (organizationsBuilder_ == null) {
        organizations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        organizationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.Organization organizations = 1 [json_name = "organizations"];</code>
     */
    public Builder removeOrganizations(int index) {
      if (organizationsBuilder_ == null) {
        ensureOrganizationsIsMutable();
        organizations_.remove(index);
        onChanged();
      } else {
        organizationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.Organization organizations = 1 [json_name = "organizations"];</code>
     */
    public app.onepass.apis.Organization.Builder getOrganizationsBuilder(
        int index) {
      return getOrganizationsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .hts.common.Organization organizations = 1 [json_name = "organizations"];</code>
     */
    public app.onepass.apis.OrganizationOrBuilder getOrganizationsOrBuilder(
        int index) {
      if (organizationsBuilder_ == null) {
        return organizations_.get(index);  } else {
        return organizationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .hts.common.Organization organizations = 1 [json_name = "organizations"];</code>
     */
    public java.util.List<? extends app.onepass.apis.OrganizationOrBuilder> 
         getOrganizationsOrBuilderList() {
      if (organizationsBuilder_ != null) {
        return organizationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(organizations_);
      }
    }
    /**
     * <code>repeated .hts.common.Organization organizations = 1 [json_name = "organizations"];</code>
     */
    public app.onepass.apis.Organization.Builder addOrganizationsBuilder() {
      return getOrganizationsFieldBuilder().addBuilder(
          app.onepass.apis.Organization.getDefaultInstance());
    }
    /**
     * <code>repeated .hts.common.Organization organizations = 1 [json_name = "organizations"];</code>
     */
    public app.onepass.apis.Organization.Builder addOrganizationsBuilder(
        int index) {
      return getOrganizationsFieldBuilder().addBuilder(
          index, app.onepass.apis.Organization.getDefaultInstance());
    }
    /**
     * <code>repeated .hts.common.Organization organizations = 1 [json_name = "organizations"];</code>
     */
    public java.util.List<app.onepass.apis.Organization.Builder> 
         getOrganizationsBuilderList() {
      return getOrganizationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        app.onepass.apis.Organization, app.onepass.apis.Organization.Builder, app.onepass.apis.OrganizationOrBuilder> 
        getOrganizationsFieldBuilder() {
      if (organizationsBuilder_ == null) {
        organizationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            app.onepass.apis.Organization, app.onepass.apis.Organization.Builder, app.onepass.apis.OrganizationOrBuilder>(
                organizations_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        organizations_ = null;
      }
      return organizationsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:hts.organizer.ReadOrganizationResult)
  }

  // @@protoc_insertion_point(class_scope:hts.organizer.ReadOrganizationResult)
  private static final app.onepass.apis.ReadOrganizationResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new app.onepass.apis.ReadOrganizationResult();
  }

  public static app.onepass.apis.ReadOrganizationResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReadOrganizationResult>
      PARSER = new com.google.protobuf.AbstractParser<ReadOrganizationResult>() {
    @java.lang.Override
    public ReadOrganizationResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReadOrganizationResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReadOrganizationResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReadOrganizationResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public app.onepass.apis.ReadOrganizationResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
