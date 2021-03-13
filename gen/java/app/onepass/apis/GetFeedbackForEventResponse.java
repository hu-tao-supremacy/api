// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/participant/service.proto

package app.onepass.apis;

/**
 * Protobuf type {@code hts.participant.GetFeedbackForEventResponse}
 */
public final class GetFeedbackForEventResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:hts.participant.GetFeedbackForEventResponse)
    GetFeedbackForEventResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetFeedbackForEventResponse.newBuilder() to construct.
  private GetFeedbackForEventResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetFeedbackForEventResponse() {
    eventFeedback_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetFeedbackForEventResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetFeedbackForEventResponse(
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
              eventFeedback_ = new java.util.ArrayList<app.onepass.apis.EventFeedback>();
              mutable_bitField0_ |= 0x00000001;
            }
            eventFeedback_.add(
                input.readMessage(app.onepass.apis.EventFeedback.parser(), extensionRegistry));
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
        eventFeedback_ = java.util.Collections.unmodifiableList(eventFeedback_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return app.onepass.apis.ParticipantProto.internal_static_hts_participant_GetFeedbackForEventResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return app.onepass.apis.ParticipantProto.internal_static_hts_participant_GetFeedbackForEventResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            app.onepass.apis.GetFeedbackForEventResponse.class, app.onepass.apis.GetFeedbackForEventResponse.Builder.class);
  }

  public static final int EVENT_FEEDBACK_FIELD_NUMBER = 1;
  private java.util.List<app.onepass.apis.EventFeedback> eventFeedback_;
  /**
   * <code>repeated .hts.common.EventFeedback event_feedback = 1 [json_name = "eventFeedback"];</code>
   */
  @java.lang.Override
  public java.util.List<app.onepass.apis.EventFeedback> getEventFeedbackList() {
    return eventFeedback_;
  }
  /**
   * <code>repeated .hts.common.EventFeedback event_feedback = 1 [json_name = "eventFeedback"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends app.onepass.apis.EventFeedbackOrBuilder> 
      getEventFeedbackOrBuilderList() {
    return eventFeedback_;
  }
  /**
   * <code>repeated .hts.common.EventFeedback event_feedback = 1 [json_name = "eventFeedback"];</code>
   */
  @java.lang.Override
  public int getEventFeedbackCount() {
    return eventFeedback_.size();
  }
  /**
   * <code>repeated .hts.common.EventFeedback event_feedback = 1 [json_name = "eventFeedback"];</code>
   */
  @java.lang.Override
  public app.onepass.apis.EventFeedback getEventFeedback(int index) {
    return eventFeedback_.get(index);
  }
  /**
   * <code>repeated .hts.common.EventFeedback event_feedback = 1 [json_name = "eventFeedback"];</code>
   */
  @java.lang.Override
  public app.onepass.apis.EventFeedbackOrBuilder getEventFeedbackOrBuilder(
      int index) {
    return eventFeedback_.get(index);
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
    for (int i = 0; i < eventFeedback_.size(); i++) {
      output.writeMessage(1, eventFeedback_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < eventFeedback_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, eventFeedback_.get(i));
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
    if (!(obj instanceof app.onepass.apis.GetFeedbackForEventResponse)) {
      return super.equals(obj);
    }
    app.onepass.apis.GetFeedbackForEventResponse other = (app.onepass.apis.GetFeedbackForEventResponse) obj;

    if (!getEventFeedbackList()
        .equals(other.getEventFeedbackList())) return false;
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
    if (getEventFeedbackCount() > 0) {
      hash = (37 * hash) + EVENT_FEEDBACK_FIELD_NUMBER;
      hash = (53 * hash) + getEventFeedbackList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static app.onepass.apis.GetFeedbackForEventResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.GetFeedbackForEventResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.GetFeedbackForEventResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.GetFeedbackForEventResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.GetFeedbackForEventResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.GetFeedbackForEventResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.GetFeedbackForEventResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.onepass.apis.GetFeedbackForEventResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.onepass.apis.GetFeedbackForEventResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static app.onepass.apis.GetFeedbackForEventResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.onepass.apis.GetFeedbackForEventResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.onepass.apis.GetFeedbackForEventResponse parseFrom(
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
  public static Builder newBuilder(app.onepass.apis.GetFeedbackForEventResponse prototype) {
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
   * Protobuf type {@code hts.participant.GetFeedbackForEventResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:hts.participant.GetFeedbackForEventResponse)
      app.onepass.apis.GetFeedbackForEventResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return app.onepass.apis.ParticipantProto.internal_static_hts_participant_GetFeedbackForEventResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return app.onepass.apis.ParticipantProto.internal_static_hts_participant_GetFeedbackForEventResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              app.onepass.apis.GetFeedbackForEventResponse.class, app.onepass.apis.GetFeedbackForEventResponse.Builder.class);
    }

    // Construct using app.onepass.apis.GetFeedbackForEventResponse.newBuilder()
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
        getEventFeedbackFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (eventFeedbackBuilder_ == null) {
        eventFeedback_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        eventFeedbackBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return app.onepass.apis.ParticipantProto.internal_static_hts_participant_GetFeedbackForEventResponse_descriptor;
    }

    @java.lang.Override
    public app.onepass.apis.GetFeedbackForEventResponse getDefaultInstanceForType() {
      return app.onepass.apis.GetFeedbackForEventResponse.getDefaultInstance();
    }

    @java.lang.Override
    public app.onepass.apis.GetFeedbackForEventResponse build() {
      app.onepass.apis.GetFeedbackForEventResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public app.onepass.apis.GetFeedbackForEventResponse buildPartial() {
      app.onepass.apis.GetFeedbackForEventResponse result = new app.onepass.apis.GetFeedbackForEventResponse(this);
      int from_bitField0_ = bitField0_;
      if (eventFeedbackBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          eventFeedback_ = java.util.Collections.unmodifiableList(eventFeedback_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.eventFeedback_ = eventFeedback_;
      } else {
        result.eventFeedback_ = eventFeedbackBuilder_.build();
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
      if (other instanceof app.onepass.apis.GetFeedbackForEventResponse) {
        return mergeFrom((app.onepass.apis.GetFeedbackForEventResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(app.onepass.apis.GetFeedbackForEventResponse other) {
      if (other == app.onepass.apis.GetFeedbackForEventResponse.getDefaultInstance()) return this;
      if (eventFeedbackBuilder_ == null) {
        if (!other.eventFeedback_.isEmpty()) {
          if (eventFeedback_.isEmpty()) {
            eventFeedback_ = other.eventFeedback_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEventFeedbackIsMutable();
            eventFeedback_.addAll(other.eventFeedback_);
          }
          onChanged();
        }
      } else {
        if (!other.eventFeedback_.isEmpty()) {
          if (eventFeedbackBuilder_.isEmpty()) {
            eventFeedbackBuilder_.dispose();
            eventFeedbackBuilder_ = null;
            eventFeedback_ = other.eventFeedback_;
            bitField0_ = (bitField0_ & ~0x00000001);
            eventFeedbackBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEventFeedbackFieldBuilder() : null;
          } else {
            eventFeedbackBuilder_.addAllMessages(other.eventFeedback_);
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
      app.onepass.apis.GetFeedbackForEventResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (app.onepass.apis.GetFeedbackForEventResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<app.onepass.apis.EventFeedback> eventFeedback_ =
      java.util.Collections.emptyList();
    private void ensureEventFeedbackIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        eventFeedback_ = new java.util.ArrayList<app.onepass.apis.EventFeedback>(eventFeedback_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        app.onepass.apis.EventFeedback, app.onepass.apis.EventFeedback.Builder, app.onepass.apis.EventFeedbackOrBuilder> eventFeedbackBuilder_;

    /**
     * <code>repeated .hts.common.EventFeedback event_feedback = 1 [json_name = "eventFeedback"];</code>
     */
    public java.util.List<app.onepass.apis.EventFeedback> getEventFeedbackList() {
      if (eventFeedbackBuilder_ == null) {
        return java.util.Collections.unmodifiableList(eventFeedback_);
      } else {
        return eventFeedbackBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .hts.common.EventFeedback event_feedback = 1 [json_name = "eventFeedback"];</code>
     */
    public int getEventFeedbackCount() {
      if (eventFeedbackBuilder_ == null) {
        return eventFeedback_.size();
      } else {
        return eventFeedbackBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .hts.common.EventFeedback event_feedback = 1 [json_name = "eventFeedback"];</code>
     */
    public app.onepass.apis.EventFeedback getEventFeedback(int index) {
      if (eventFeedbackBuilder_ == null) {
        return eventFeedback_.get(index);
      } else {
        return eventFeedbackBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .hts.common.EventFeedback event_feedback = 1 [json_name = "eventFeedback"];</code>
     */
    public Builder setEventFeedback(
        int index, app.onepass.apis.EventFeedback value) {
      if (eventFeedbackBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventFeedbackIsMutable();
        eventFeedback_.set(index, value);
        onChanged();
      } else {
        eventFeedbackBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.EventFeedback event_feedback = 1 [json_name = "eventFeedback"];</code>
     */
    public Builder setEventFeedback(
        int index, app.onepass.apis.EventFeedback.Builder builderForValue) {
      if (eventFeedbackBuilder_ == null) {
        ensureEventFeedbackIsMutable();
        eventFeedback_.set(index, builderForValue.build());
        onChanged();
      } else {
        eventFeedbackBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.EventFeedback event_feedback = 1 [json_name = "eventFeedback"];</code>
     */
    public Builder addEventFeedback(app.onepass.apis.EventFeedback value) {
      if (eventFeedbackBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventFeedbackIsMutable();
        eventFeedback_.add(value);
        onChanged();
      } else {
        eventFeedbackBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.EventFeedback event_feedback = 1 [json_name = "eventFeedback"];</code>
     */
    public Builder addEventFeedback(
        int index, app.onepass.apis.EventFeedback value) {
      if (eventFeedbackBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventFeedbackIsMutable();
        eventFeedback_.add(index, value);
        onChanged();
      } else {
        eventFeedbackBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.EventFeedback event_feedback = 1 [json_name = "eventFeedback"];</code>
     */
    public Builder addEventFeedback(
        app.onepass.apis.EventFeedback.Builder builderForValue) {
      if (eventFeedbackBuilder_ == null) {
        ensureEventFeedbackIsMutable();
        eventFeedback_.add(builderForValue.build());
        onChanged();
      } else {
        eventFeedbackBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.EventFeedback event_feedback = 1 [json_name = "eventFeedback"];</code>
     */
    public Builder addEventFeedback(
        int index, app.onepass.apis.EventFeedback.Builder builderForValue) {
      if (eventFeedbackBuilder_ == null) {
        ensureEventFeedbackIsMutable();
        eventFeedback_.add(index, builderForValue.build());
        onChanged();
      } else {
        eventFeedbackBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.EventFeedback event_feedback = 1 [json_name = "eventFeedback"];</code>
     */
    public Builder addAllEventFeedback(
        java.lang.Iterable<? extends app.onepass.apis.EventFeedback> values) {
      if (eventFeedbackBuilder_ == null) {
        ensureEventFeedbackIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, eventFeedback_);
        onChanged();
      } else {
        eventFeedbackBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.EventFeedback event_feedback = 1 [json_name = "eventFeedback"];</code>
     */
    public Builder clearEventFeedback() {
      if (eventFeedbackBuilder_ == null) {
        eventFeedback_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        eventFeedbackBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.EventFeedback event_feedback = 1 [json_name = "eventFeedback"];</code>
     */
    public Builder removeEventFeedback(int index) {
      if (eventFeedbackBuilder_ == null) {
        ensureEventFeedbackIsMutable();
        eventFeedback_.remove(index);
        onChanged();
      } else {
        eventFeedbackBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.EventFeedback event_feedback = 1 [json_name = "eventFeedback"];</code>
     */
    public app.onepass.apis.EventFeedback.Builder getEventFeedbackBuilder(
        int index) {
      return getEventFeedbackFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .hts.common.EventFeedback event_feedback = 1 [json_name = "eventFeedback"];</code>
     */
    public app.onepass.apis.EventFeedbackOrBuilder getEventFeedbackOrBuilder(
        int index) {
      if (eventFeedbackBuilder_ == null) {
        return eventFeedback_.get(index);  } else {
        return eventFeedbackBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .hts.common.EventFeedback event_feedback = 1 [json_name = "eventFeedback"];</code>
     */
    public java.util.List<? extends app.onepass.apis.EventFeedbackOrBuilder> 
         getEventFeedbackOrBuilderList() {
      if (eventFeedbackBuilder_ != null) {
        return eventFeedbackBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(eventFeedback_);
      }
    }
    /**
     * <code>repeated .hts.common.EventFeedback event_feedback = 1 [json_name = "eventFeedback"];</code>
     */
    public app.onepass.apis.EventFeedback.Builder addEventFeedbackBuilder() {
      return getEventFeedbackFieldBuilder().addBuilder(
          app.onepass.apis.EventFeedback.getDefaultInstance());
    }
    /**
     * <code>repeated .hts.common.EventFeedback event_feedback = 1 [json_name = "eventFeedback"];</code>
     */
    public app.onepass.apis.EventFeedback.Builder addEventFeedbackBuilder(
        int index) {
      return getEventFeedbackFieldBuilder().addBuilder(
          index, app.onepass.apis.EventFeedback.getDefaultInstance());
    }
    /**
     * <code>repeated .hts.common.EventFeedback event_feedback = 1 [json_name = "eventFeedback"];</code>
     */
    public java.util.List<app.onepass.apis.EventFeedback.Builder> 
         getEventFeedbackBuilderList() {
      return getEventFeedbackFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        app.onepass.apis.EventFeedback, app.onepass.apis.EventFeedback.Builder, app.onepass.apis.EventFeedbackOrBuilder> 
        getEventFeedbackFieldBuilder() {
      if (eventFeedbackBuilder_ == null) {
        eventFeedbackBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            app.onepass.apis.EventFeedback, app.onepass.apis.EventFeedback.Builder, app.onepass.apis.EventFeedbackOrBuilder>(
                eventFeedback_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        eventFeedback_ = null;
      }
      return eventFeedbackBuilder_;
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


    // @@protoc_insertion_point(builder_scope:hts.participant.GetFeedbackForEventResponse)
  }

  // @@protoc_insertion_point(class_scope:hts.participant.GetFeedbackForEventResponse)
  private static final app.onepass.apis.GetFeedbackForEventResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new app.onepass.apis.GetFeedbackForEventResponse();
  }

  public static app.onepass.apis.GetFeedbackForEventResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetFeedbackForEventResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetFeedbackForEventResponse>() {
    @java.lang.Override
    public GetFeedbackForEventResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetFeedbackForEventResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetFeedbackForEventResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetFeedbackForEventResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public app.onepass.apis.GetFeedbackForEventResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
