// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/participant/service.proto

package app.onepass.apis;

/**
 * Protobuf type {@code hts.participant.GetUserEventsByEventIdResponse}
 */
public final class GetUserEventsByEventIdResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:hts.participant.GetUserEventsByEventIdResponse)
    GetUserEventsByEventIdResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetUserEventsByEventIdResponse.newBuilder() to construct.
  private GetUserEventsByEventIdResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetUserEventsByEventIdResponse() {
    userEvents_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetUserEventsByEventIdResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetUserEventsByEventIdResponse(
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
              userEvents_ = new java.util.ArrayList<app.onepass.apis.UserEvent>();
              mutable_bitField0_ |= 0x00000001;
            }
            userEvents_.add(
                input.readMessage(app.onepass.apis.UserEvent.parser(), extensionRegistry));
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
        userEvents_ = java.util.Collections.unmodifiableList(userEvents_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return app.onepass.apis.ParticipantProto.internal_static_hts_participant_GetUserEventsByEventIdResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return app.onepass.apis.ParticipantProto.internal_static_hts_participant_GetUserEventsByEventIdResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            app.onepass.apis.GetUserEventsByEventIdResponse.class, app.onepass.apis.GetUserEventsByEventIdResponse.Builder.class);
  }

  public static final int USER_EVENTS_FIELD_NUMBER = 1;
  private java.util.List<app.onepass.apis.UserEvent> userEvents_;
  /**
   * <code>repeated .hts.common.UserEvent user_events = 1 [json_name = "userEvents"];</code>
   */
  @java.lang.Override
  public java.util.List<app.onepass.apis.UserEvent> getUserEventsList() {
    return userEvents_;
  }
  /**
   * <code>repeated .hts.common.UserEvent user_events = 1 [json_name = "userEvents"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends app.onepass.apis.UserEventOrBuilder> 
      getUserEventsOrBuilderList() {
    return userEvents_;
  }
  /**
   * <code>repeated .hts.common.UserEvent user_events = 1 [json_name = "userEvents"];</code>
   */
  @java.lang.Override
  public int getUserEventsCount() {
    return userEvents_.size();
  }
  /**
   * <code>repeated .hts.common.UserEvent user_events = 1 [json_name = "userEvents"];</code>
   */
  @java.lang.Override
  public app.onepass.apis.UserEvent getUserEvents(int index) {
    return userEvents_.get(index);
  }
  /**
   * <code>repeated .hts.common.UserEvent user_events = 1 [json_name = "userEvents"];</code>
   */
  @java.lang.Override
  public app.onepass.apis.UserEventOrBuilder getUserEventsOrBuilder(
      int index) {
    return userEvents_.get(index);
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
    for (int i = 0; i < userEvents_.size(); i++) {
      output.writeMessage(1, userEvents_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < userEvents_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, userEvents_.get(i));
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
    if (!(obj instanceof app.onepass.apis.GetUserEventsByEventIdResponse)) {
      return super.equals(obj);
    }
    app.onepass.apis.GetUserEventsByEventIdResponse other = (app.onepass.apis.GetUserEventsByEventIdResponse) obj;

    if (!getUserEventsList()
        .equals(other.getUserEventsList())) return false;
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
    if (getUserEventsCount() > 0) {
      hash = (37 * hash) + USER_EVENTS_FIELD_NUMBER;
      hash = (53 * hash) + getUserEventsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static app.onepass.apis.GetUserEventsByEventIdResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.GetUserEventsByEventIdResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.GetUserEventsByEventIdResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.GetUserEventsByEventIdResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.GetUserEventsByEventIdResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.GetUserEventsByEventIdResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.GetUserEventsByEventIdResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.onepass.apis.GetUserEventsByEventIdResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.onepass.apis.GetUserEventsByEventIdResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static app.onepass.apis.GetUserEventsByEventIdResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.onepass.apis.GetUserEventsByEventIdResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.onepass.apis.GetUserEventsByEventIdResponse parseFrom(
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
  public static Builder newBuilder(app.onepass.apis.GetUserEventsByEventIdResponse prototype) {
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
   * Protobuf type {@code hts.participant.GetUserEventsByEventIdResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:hts.participant.GetUserEventsByEventIdResponse)
      app.onepass.apis.GetUserEventsByEventIdResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return app.onepass.apis.ParticipantProto.internal_static_hts_participant_GetUserEventsByEventIdResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return app.onepass.apis.ParticipantProto.internal_static_hts_participant_GetUserEventsByEventIdResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              app.onepass.apis.GetUserEventsByEventIdResponse.class, app.onepass.apis.GetUserEventsByEventIdResponse.Builder.class);
    }

    // Construct using app.onepass.apis.GetUserEventsByEventIdResponse.newBuilder()
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
        getUserEventsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (userEventsBuilder_ == null) {
        userEvents_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        userEventsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return app.onepass.apis.ParticipantProto.internal_static_hts_participant_GetUserEventsByEventIdResponse_descriptor;
    }

    @java.lang.Override
    public app.onepass.apis.GetUserEventsByEventIdResponse getDefaultInstanceForType() {
      return app.onepass.apis.GetUserEventsByEventIdResponse.getDefaultInstance();
    }

    @java.lang.Override
    public app.onepass.apis.GetUserEventsByEventIdResponse build() {
      app.onepass.apis.GetUserEventsByEventIdResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public app.onepass.apis.GetUserEventsByEventIdResponse buildPartial() {
      app.onepass.apis.GetUserEventsByEventIdResponse result = new app.onepass.apis.GetUserEventsByEventIdResponse(this);
      int from_bitField0_ = bitField0_;
      if (userEventsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          userEvents_ = java.util.Collections.unmodifiableList(userEvents_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.userEvents_ = userEvents_;
      } else {
        result.userEvents_ = userEventsBuilder_.build();
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
      if (other instanceof app.onepass.apis.GetUserEventsByEventIdResponse) {
        return mergeFrom((app.onepass.apis.GetUserEventsByEventIdResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(app.onepass.apis.GetUserEventsByEventIdResponse other) {
      if (other == app.onepass.apis.GetUserEventsByEventIdResponse.getDefaultInstance()) return this;
      if (userEventsBuilder_ == null) {
        if (!other.userEvents_.isEmpty()) {
          if (userEvents_.isEmpty()) {
            userEvents_ = other.userEvents_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUserEventsIsMutable();
            userEvents_.addAll(other.userEvents_);
          }
          onChanged();
        }
      } else {
        if (!other.userEvents_.isEmpty()) {
          if (userEventsBuilder_.isEmpty()) {
            userEventsBuilder_.dispose();
            userEventsBuilder_ = null;
            userEvents_ = other.userEvents_;
            bitField0_ = (bitField0_ & ~0x00000001);
            userEventsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getUserEventsFieldBuilder() : null;
          } else {
            userEventsBuilder_.addAllMessages(other.userEvents_);
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
      app.onepass.apis.GetUserEventsByEventIdResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (app.onepass.apis.GetUserEventsByEventIdResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<app.onepass.apis.UserEvent> userEvents_ =
      java.util.Collections.emptyList();
    private void ensureUserEventsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        userEvents_ = new java.util.ArrayList<app.onepass.apis.UserEvent>(userEvents_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        app.onepass.apis.UserEvent, app.onepass.apis.UserEvent.Builder, app.onepass.apis.UserEventOrBuilder> userEventsBuilder_;

    /**
     * <code>repeated .hts.common.UserEvent user_events = 1 [json_name = "userEvents"];</code>
     */
    public java.util.List<app.onepass.apis.UserEvent> getUserEventsList() {
      if (userEventsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(userEvents_);
      } else {
        return userEventsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .hts.common.UserEvent user_events = 1 [json_name = "userEvents"];</code>
     */
    public int getUserEventsCount() {
      if (userEventsBuilder_ == null) {
        return userEvents_.size();
      } else {
        return userEventsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .hts.common.UserEvent user_events = 1 [json_name = "userEvents"];</code>
     */
    public app.onepass.apis.UserEvent getUserEvents(int index) {
      if (userEventsBuilder_ == null) {
        return userEvents_.get(index);
      } else {
        return userEventsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .hts.common.UserEvent user_events = 1 [json_name = "userEvents"];</code>
     */
    public Builder setUserEvents(
        int index, app.onepass.apis.UserEvent value) {
      if (userEventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserEventsIsMutable();
        userEvents_.set(index, value);
        onChanged();
      } else {
        userEventsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.UserEvent user_events = 1 [json_name = "userEvents"];</code>
     */
    public Builder setUserEvents(
        int index, app.onepass.apis.UserEvent.Builder builderForValue) {
      if (userEventsBuilder_ == null) {
        ensureUserEventsIsMutable();
        userEvents_.set(index, builderForValue.build());
        onChanged();
      } else {
        userEventsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.UserEvent user_events = 1 [json_name = "userEvents"];</code>
     */
    public Builder addUserEvents(app.onepass.apis.UserEvent value) {
      if (userEventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserEventsIsMutable();
        userEvents_.add(value);
        onChanged();
      } else {
        userEventsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.UserEvent user_events = 1 [json_name = "userEvents"];</code>
     */
    public Builder addUserEvents(
        int index, app.onepass.apis.UserEvent value) {
      if (userEventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserEventsIsMutable();
        userEvents_.add(index, value);
        onChanged();
      } else {
        userEventsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.UserEvent user_events = 1 [json_name = "userEvents"];</code>
     */
    public Builder addUserEvents(
        app.onepass.apis.UserEvent.Builder builderForValue) {
      if (userEventsBuilder_ == null) {
        ensureUserEventsIsMutable();
        userEvents_.add(builderForValue.build());
        onChanged();
      } else {
        userEventsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.UserEvent user_events = 1 [json_name = "userEvents"];</code>
     */
    public Builder addUserEvents(
        int index, app.onepass.apis.UserEvent.Builder builderForValue) {
      if (userEventsBuilder_ == null) {
        ensureUserEventsIsMutable();
        userEvents_.add(index, builderForValue.build());
        onChanged();
      } else {
        userEventsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.UserEvent user_events = 1 [json_name = "userEvents"];</code>
     */
    public Builder addAllUserEvents(
        java.lang.Iterable<? extends app.onepass.apis.UserEvent> values) {
      if (userEventsBuilder_ == null) {
        ensureUserEventsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, userEvents_);
        onChanged();
      } else {
        userEventsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.UserEvent user_events = 1 [json_name = "userEvents"];</code>
     */
    public Builder clearUserEvents() {
      if (userEventsBuilder_ == null) {
        userEvents_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        userEventsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.UserEvent user_events = 1 [json_name = "userEvents"];</code>
     */
    public Builder removeUserEvents(int index) {
      if (userEventsBuilder_ == null) {
        ensureUserEventsIsMutable();
        userEvents_.remove(index);
        onChanged();
      } else {
        userEventsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.UserEvent user_events = 1 [json_name = "userEvents"];</code>
     */
    public app.onepass.apis.UserEvent.Builder getUserEventsBuilder(
        int index) {
      return getUserEventsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .hts.common.UserEvent user_events = 1 [json_name = "userEvents"];</code>
     */
    public app.onepass.apis.UserEventOrBuilder getUserEventsOrBuilder(
        int index) {
      if (userEventsBuilder_ == null) {
        return userEvents_.get(index);  } else {
        return userEventsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .hts.common.UserEvent user_events = 1 [json_name = "userEvents"];</code>
     */
    public java.util.List<? extends app.onepass.apis.UserEventOrBuilder> 
         getUserEventsOrBuilderList() {
      if (userEventsBuilder_ != null) {
        return userEventsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(userEvents_);
      }
    }
    /**
     * <code>repeated .hts.common.UserEvent user_events = 1 [json_name = "userEvents"];</code>
     */
    public app.onepass.apis.UserEvent.Builder addUserEventsBuilder() {
      return getUserEventsFieldBuilder().addBuilder(
          app.onepass.apis.UserEvent.getDefaultInstance());
    }
    /**
     * <code>repeated .hts.common.UserEvent user_events = 1 [json_name = "userEvents"];</code>
     */
    public app.onepass.apis.UserEvent.Builder addUserEventsBuilder(
        int index) {
      return getUserEventsFieldBuilder().addBuilder(
          index, app.onepass.apis.UserEvent.getDefaultInstance());
    }
    /**
     * <code>repeated .hts.common.UserEvent user_events = 1 [json_name = "userEvents"];</code>
     */
    public java.util.List<app.onepass.apis.UserEvent.Builder> 
         getUserEventsBuilderList() {
      return getUserEventsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        app.onepass.apis.UserEvent, app.onepass.apis.UserEvent.Builder, app.onepass.apis.UserEventOrBuilder> 
        getUserEventsFieldBuilder() {
      if (userEventsBuilder_ == null) {
        userEventsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            app.onepass.apis.UserEvent, app.onepass.apis.UserEvent.Builder, app.onepass.apis.UserEventOrBuilder>(
                userEvents_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        userEvents_ = null;
      }
      return userEventsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:hts.participant.GetUserEventsByEventIdResponse)
  }

  // @@protoc_insertion_point(class_scope:hts.participant.GetUserEventsByEventIdResponse)
  private static final app.onepass.apis.GetUserEventsByEventIdResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new app.onepass.apis.GetUserEventsByEventIdResponse();
  }

  public static app.onepass.apis.GetUserEventsByEventIdResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetUserEventsByEventIdResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetUserEventsByEventIdResponse>() {
    @java.lang.Override
    public GetUserEventsByEventIdResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetUserEventsByEventIdResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetUserEventsByEventIdResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetUserEventsByEventIdResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public app.onepass.apis.GetUserEventsByEventIdResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

