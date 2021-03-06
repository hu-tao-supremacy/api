// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/participant/service.proto

package app.onepass.apis;

/**
 * Protobuf type {@code hts.participant.EventsResponse}
 */
public final class EventsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:hts.participant.EventsResponse)
    EventsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EventsResponse.newBuilder() to construct.
  private EventsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EventsResponse() {
    event_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EventsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EventsResponse(
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
              event_ = new java.util.ArrayList<app.onepass.apis.Event>();
              mutable_bitField0_ |= 0x00000001;
            }
            event_.add(
                input.readMessage(app.onepass.apis.Event.parser(), extensionRegistry));
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
        event_ = java.util.Collections.unmodifiableList(event_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return app.onepass.apis.ParticipantProto.internal_static_hts_participant_EventsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return app.onepass.apis.ParticipantProto.internal_static_hts_participant_EventsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            app.onepass.apis.EventsResponse.class, app.onepass.apis.EventsResponse.Builder.class);
  }

  public static final int EVENT_FIELD_NUMBER = 1;
  private java.util.List<app.onepass.apis.Event> event_;
  /**
   * <code>repeated .hts.common.Event event = 1 [json_name = "event"];</code>
   */
  @java.lang.Override
  public java.util.List<app.onepass.apis.Event> getEventList() {
    return event_;
  }
  /**
   * <code>repeated .hts.common.Event event = 1 [json_name = "event"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends app.onepass.apis.EventOrBuilder> 
      getEventOrBuilderList() {
    return event_;
  }
  /**
   * <code>repeated .hts.common.Event event = 1 [json_name = "event"];</code>
   */
  @java.lang.Override
  public int getEventCount() {
    return event_.size();
  }
  /**
   * <code>repeated .hts.common.Event event = 1 [json_name = "event"];</code>
   */
  @java.lang.Override
  public app.onepass.apis.Event getEvent(int index) {
    return event_.get(index);
  }
  /**
   * <code>repeated .hts.common.Event event = 1 [json_name = "event"];</code>
   */
  @java.lang.Override
  public app.onepass.apis.EventOrBuilder getEventOrBuilder(
      int index) {
    return event_.get(index);
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
    for (int i = 0; i < event_.size(); i++) {
      output.writeMessage(1, event_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < event_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, event_.get(i));
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
    if (!(obj instanceof app.onepass.apis.EventsResponse)) {
      return super.equals(obj);
    }
    app.onepass.apis.EventsResponse other = (app.onepass.apis.EventsResponse) obj;

    if (!getEventList()
        .equals(other.getEventList())) return false;
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
    if (getEventCount() > 0) {
      hash = (37 * hash) + EVENT_FIELD_NUMBER;
      hash = (53 * hash) + getEventList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static app.onepass.apis.EventsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.EventsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.EventsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.EventsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.EventsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.EventsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.EventsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.onepass.apis.EventsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.onepass.apis.EventsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static app.onepass.apis.EventsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.onepass.apis.EventsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.onepass.apis.EventsResponse parseFrom(
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
  public static Builder newBuilder(app.onepass.apis.EventsResponse prototype) {
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
   * Protobuf type {@code hts.participant.EventsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:hts.participant.EventsResponse)
      app.onepass.apis.EventsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return app.onepass.apis.ParticipantProto.internal_static_hts_participant_EventsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return app.onepass.apis.ParticipantProto.internal_static_hts_participant_EventsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              app.onepass.apis.EventsResponse.class, app.onepass.apis.EventsResponse.Builder.class);
    }

    // Construct using app.onepass.apis.EventsResponse.newBuilder()
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
        getEventFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (eventBuilder_ == null) {
        event_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        eventBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return app.onepass.apis.ParticipantProto.internal_static_hts_participant_EventsResponse_descriptor;
    }

    @java.lang.Override
    public app.onepass.apis.EventsResponse getDefaultInstanceForType() {
      return app.onepass.apis.EventsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public app.onepass.apis.EventsResponse build() {
      app.onepass.apis.EventsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public app.onepass.apis.EventsResponse buildPartial() {
      app.onepass.apis.EventsResponse result = new app.onepass.apis.EventsResponse(this);
      int from_bitField0_ = bitField0_;
      if (eventBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          event_ = java.util.Collections.unmodifiableList(event_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.event_ = event_;
      } else {
        result.event_ = eventBuilder_.build();
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
      if (other instanceof app.onepass.apis.EventsResponse) {
        return mergeFrom((app.onepass.apis.EventsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(app.onepass.apis.EventsResponse other) {
      if (other == app.onepass.apis.EventsResponse.getDefaultInstance()) return this;
      if (eventBuilder_ == null) {
        if (!other.event_.isEmpty()) {
          if (event_.isEmpty()) {
            event_ = other.event_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEventIsMutable();
            event_.addAll(other.event_);
          }
          onChanged();
        }
      } else {
        if (!other.event_.isEmpty()) {
          if (eventBuilder_.isEmpty()) {
            eventBuilder_.dispose();
            eventBuilder_ = null;
            event_ = other.event_;
            bitField0_ = (bitField0_ & ~0x00000001);
            eventBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEventFieldBuilder() : null;
          } else {
            eventBuilder_.addAllMessages(other.event_);
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
      app.onepass.apis.EventsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (app.onepass.apis.EventsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<app.onepass.apis.Event> event_ =
      java.util.Collections.emptyList();
    private void ensureEventIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        event_ = new java.util.ArrayList<app.onepass.apis.Event>(event_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        app.onepass.apis.Event, app.onepass.apis.Event.Builder, app.onepass.apis.EventOrBuilder> eventBuilder_;

    /**
     * <code>repeated .hts.common.Event event = 1 [json_name = "event"];</code>
     */
    public java.util.List<app.onepass.apis.Event> getEventList() {
      if (eventBuilder_ == null) {
        return java.util.Collections.unmodifiableList(event_);
      } else {
        return eventBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .hts.common.Event event = 1 [json_name = "event"];</code>
     */
    public int getEventCount() {
      if (eventBuilder_ == null) {
        return event_.size();
      } else {
        return eventBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .hts.common.Event event = 1 [json_name = "event"];</code>
     */
    public app.onepass.apis.Event getEvent(int index) {
      if (eventBuilder_ == null) {
        return event_.get(index);
      } else {
        return eventBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .hts.common.Event event = 1 [json_name = "event"];</code>
     */
    public Builder setEvent(
        int index, app.onepass.apis.Event value) {
      if (eventBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventIsMutable();
        event_.set(index, value);
        onChanged();
      } else {
        eventBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.Event event = 1 [json_name = "event"];</code>
     */
    public Builder setEvent(
        int index, app.onepass.apis.Event.Builder builderForValue) {
      if (eventBuilder_ == null) {
        ensureEventIsMutable();
        event_.set(index, builderForValue.build());
        onChanged();
      } else {
        eventBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.Event event = 1 [json_name = "event"];</code>
     */
    public Builder addEvent(app.onepass.apis.Event value) {
      if (eventBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventIsMutable();
        event_.add(value);
        onChanged();
      } else {
        eventBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.Event event = 1 [json_name = "event"];</code>
     */
    public Builder addEvent(
        int index, app.onepass.apis.Event value) {
      if (eventBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventIsMutable();
        event_.add(index, value);
        onChanged();
      } else {
        eventBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.Event event = 1 [json_name = "event"];</code>
     */
    public Builder addEvent(
        app.onepass.apis.Event.Builder builderForValue) {
      if (eventBuilder_ == null) {
        ensureEventIsMutable();
        event_.add(builderForValue.build());
        onChanged();
      } else {
        eventBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.Event event = 1 [json_name = "event"];</code>
     */
    public Builder addEvent(
        int index, app.onepass.apis.Event.Builder builderForValue) {
      if (eventBuilder_ == null) {
        ensureEventIsMutable();
        event_.add(index, builderForValue.build());
        onChanged();
      } else {
        eventBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.Event event = 1 [json_name = "event"];</code>
     */
    public Builder addAllEvent(
        java.lang.Iterable<? extends app.onepass.apis.Event> values) {
      if (eventBuilder_ == null) {
        ensureEventIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, event_);
        onChanged();
      } else {
        eventBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.Event event = 1 [json_name = "event"];</code>
     */
    public Builder clearEvent() {
      if (eventBuilder_ == null) {
        event_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        eventBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.Event event = 1 [json_name = "event"];</code>
     */
    public Builder removeEvent(int index) {
      if (eventBuilder_ == null) {
        ensureEventIsMutable();
        event_.remove(index);
        onChanged();
      } else {
        eventBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.Event event = 1 [json_name = "event"];</code>
     */
    public app.onepass.apis.Event.Builder getEventBuilder(
        int index) {
      return getEventFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .hts.common.Event event = 1 [json_name = "event"];</code>
     */
    public app.onepass.apis.EventOrBuilder getEventOrBuilder(
        int index) {
      if (eventBuilder_ == null) {
        return event_.get(index);  } else {
        return eventBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .hts.common.Event event = 1 [json_name = "event"];</code>
     */
    public java.util.List<? extends app.onepass.apis.EventOrBuilder> 
         getEventOrBuilderList() {
      if (eventBuilder_ != null) {
        return eventBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(event_);
      }
    }
    /**
     * <code>repeated .hts.common.Event event = 1 [json_name = "event"];</code>
     */
    public app.onepass.apis.Event.Builder addEventBuilder() {
      return getEventFieldBuilder().addBuilder(
          app.onepass.apis.Event.getDefaultInstance());
    }
    /**
     * <code>repeated .hts.common.Event event = 1 [json_name = "event"];</code>
     */
    public app.onepass.apis.Event.Builder addEventBuilder(
        int index) {
      return getEventFieldBuilder().addBuilder(
          index, app.onepass.apis.Event.getDefaultInstance());
    }
    /**
     * <code>repeated .hts.common.Event event = 1 [json_name = "event"];</code>
     */
    public java.util.List<app.onepass.apis.Event.Builder> 
         getEventBuilderList() {
      return getEventFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        app.onepass.apis.Event, app.onepass.apis.Event.Builder, app.onepass.apis.EventOrBuilder> 
        getEventFieldBuilder() {
      if (eventBuilder_ == null) {
        eventBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            app.onepass.apis.Event, app.onepass.apis.Event.Builder, app.onepass.apis.EventOrBuilder>(
                event_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        event_ = null;
      }
      return eventBuilder_;
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


    // @@protoc_insertion_point(builder_scope:hts.participant.EventsResponse)
  }

  // @@protoc_insertion_point(class_scope:hts.participant.EventsResponse)
  private static final app.onepass.apis.EventsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new app.onepass.apis.EventsResponse();
  }

  public static app.onepass.apis.EventsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventsResponse>
      PARSER = new com.google.protobuf.AbstractParser<EventsResponse>() {
    @java.lang.Override
    public EventsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EventsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EventsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public app.onepass.apis.EventsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

