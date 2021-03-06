// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/organizer/service.proto

package app.onepass.apis;

/**
 * Protobuf type {@code hts.organizer.EventDurationListResponse}
 */
public final class EventDurationListResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:hts.organizer.EventDurationListResponse)
    EventDurationListResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EventDurationListResponse.newBuilder() to construct.
  private EventDurationListResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EventDurationListResponse() {
    eventDurations_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EventDurationListResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EventDurationListResponse(
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
              eventDurations_ = new java.util.ArrayList<app.onepass.apis.EventDuration>();
              mutable_bitField0_ |= 0x00000001;
            }
            eventDurations_.add(
                input.readMessage(app.onepass.apis.EventDuration.parser(), extensionRegistry));
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
        eventDurations_ = java.util.Collections.unmodifiableList(eventDurations_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return app.onepass.apis.OrganizerProto.internal_static_hts_organizer_EventDurationListResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return app.onepass.apis.OrganizerProto.internal_static_hts_organizer_EventDurationListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            app.onepass.apis.EventDurationListResponse.class, app.onepass.apis.EventDurationListResponse.Builder.class);
  }

  public static final int EVENT_DURATIONS_FIELD_NUMBER = 1;
  private java.util.List<app.onepass.apis.EventDuration> eventDurations_;
  /**
   * <code>repeated .hts.common.EventDuration event_durations = 1 [json_name = "eventDurations"];</code>
   */
  @java.lang.Override
  public java.util.List<app.onepass.apis.EventDuration> getEventDurationsList() {
    return eventDurations_;
  }
  /**
   * <code>repeated .hts.common.EventDuration event_durations = 1 [json_name = "eventDurations"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends app.onepass.apis.EventDurationOrBuilder> 
      getEventDurationsOrBuilderList() {
    return eventDurations_;
  }
  /**
   * <code>repeated .hts.common.EventDuration event_durations = 1 [json_name = "eventDurations"];</code>
   */
  @java.lang.Override
  public int getEventDurationsCount() {
    return eventDurations_.size();
  }
  /**
   * <code>repeated .hts.common.EventDuration event_durations = 1 [json_name = "eventDurations"];</code>
   */
  @java.lang.Override
  public app.onepass.apis.EventDuration getEventDurations(int index) {
    return eventDurations_.get(index);
  }
  /**
   * <code>repeated .hts.common.EventDuration event_durations = 1 [json_name = "eventDurations"];</code>
   */
  @java.lang.Override
  public app.onepass.apis.EventDurationOrBuilder getEventDurationsOrBuilder(
      int index) {
    return eventDurations_.get(index);
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
    for (int i = 0; i < eventDurations_.size(); i++) {
      output.writeMessage(1, eventDurations_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < eventDurations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, eventDurations_.get(i));
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
    if (!(obj instanceof app.onepass.apis.EventDurationListResponse)) {
      return super.equals(obj);
    }
    app.onepass.apis.EventDurationListResponse other = (app.onepass.apis.EventDurationListResponse) obj;

    if (!getEventDurationsList()
        .equals(other.getEventDurationsList())) return false;
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
    if (getEventDurationsCount() > 0) {
      hash = (37 * hash) + EVENT_DURATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getEventDurationsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static app.onepass.apis.EventDurationListResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.EventDurationListResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.EventDurationListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.EventDurationListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.EventDurationListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.EventDurationListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.EventDurationListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.onepass.apis.EventDurationListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.onepass.apis.EventDurationListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static app.onepass.apis.EventDurationListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.onepass.apis.EventDurationListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.onepass.apis.EventDurationListResponse parseFrom(
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
  public static Builder newBuilder(app.onepass.apis.EventDurationListResponse prototype) {
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
   * Protobuf type {@code hts.organizer.EventDurationListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:hts.organizer.EventDurationListResponse)
      app.onepass.apis.EventDurationListResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return app.onepass.apis.OrganizerProto.internal_static_hts_organizer_EventDurationListResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return app.onepass.apis.OrganizerProto.internal_static_hts_organizer_EventDurationListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              app.onepass.apis.EventDurationListResponse.class, app.onepass.apis.EventDurationListResponse.Builder.class);
    }

    // Construct using app.onepass.apis.EventDurationListResponse.newBuilder()
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
        getEventDurationsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (eventDurationsBuilder_ == null) {
        eventDurations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        eventDurationsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return app.onepass.apis.OrganizerProto.internal_static_hts_organizer_EventDurationListResponse_descriptor;
    }

    @java.lang.Override
    public app.onepass.apis.EventDurationListResponse getDefaultInstanceForType() {
      return app.onepass.apis.EventDurationListResponse.getDefaultInstance();
    }

    @java.lang.Override
    public app.onepass.apis.EventDurationListResponse build() {
      app.onepass.apis.EventDurationListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public app.onepass.apis.EventDurationListResponse buildPartial() {
      app.onepass.apis.EventDurationListResponse result = new app.onepass.apis.EventDurationListResponse(this);
      int from_bitField0_ = bitField0_;
      if (eventDurationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          eventDurations_ = java.util.Collections.unmodifiableList(eventDurations_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.eventDurations_ = eventDurations_;
      } else {
        result.eventDurations_ = eventDurationsBuilder_.build();
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
      if (other instanceof app.onepass.apis.EventDurationListResponse) {
        return mergeFrom((app.onepass.apis.EventDurationListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(app.onepass.apis.EventDurationListResponse other) {
      if (other == app.onepass.apis.EventDurationListResponse.getDefaultInstance()) return this;
      if (eventDurationsBuilder_ == null) {
        if (!other.eventDurations_.isEmpty()) {
          if (eventDurations_.isEmpty()) {
            eventDurations_ = other.eventDurations_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEventDurationsIsMutable();
            eventDurations_.addAll(other.eventDurations_);
          }
          onChanged();
        }
      } else {
        if (!other.eventDurations_.isEmpty()) {
          if (eventDurationsBuilder_.isEmpty()) {
            eventDurationsBuilder_.dispose();
            eventDurationsBuilder_ = null;
            eventDurations_ = other.eventDurations_;
            bitField0_ = (bitField0_ & ~0x00000001);
            eventDurationsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEventDurationsFieldBuilder() : null;
          } else {
            eventDurationsBuilder_.addAllMessages(other.eventDurations_);
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
      app.onepass.apis.EventDurationListResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (app.onepass.apis.EventDurationListResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<app.onepass.apis.EventDuration> eventDurations_ =
      java.util.Collections.emptyList();
    private void ensureEventDurationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        eventDurations_ = new java.util.ArrayList<app.onepass.apis.EventDuration>(eventDurations_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        app.onepass.apis.EventDuration, app.onepass.apis.EventDuration.Builder, app.onepass.apis.EventDurationOrBuilder> eventDurationsBuilder_;

    /**
     * <code>repeated .hts.common.EventDuration event_durations = 1 [json_name = "eventDurations"];</code>
     */
    public java.util.List<app.onepass.apis.EventDuration> getEventDurationsList() {
      if (eventDurationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(eventDurations_);
      } else {
        return eventDurationsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .hts.common.EventDuration event_durations = 1 [json_name = "eventDurations"];</code>
     */
    public int getEventDurationsCount() {
      if (eventDurationsBuilder_ == null) {
        return eventDurations_.size();
      } else {
        return eventDurationsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .hts.common.EventDuration event_durations = 1 [json_name = "eventDurations"];</code>
     */
    public app.onepass.apis.EventDuration getEventDurations(int index) {
      if (eventDurationsBuilder_ == null) {
        return eventDurations_.get(index);
      } else {
        return eventDurationsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .hts.common.EventDuration event_durations = 1 [json_name = "eventDurations"];</code>
     */
    public Builder setEventDurations(
        int index, app.onepass.apis.EventDuration value) {
      if (eventDurationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventDurationsIsMutable();
        eventDurations_.set(index, value);
        onChanged();
      } else {
        eventDurationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.EventDuration event_durations = 1 [json_name = "eventDurations"];</code>
     */
    public Builder setEventDurations(
        int index, app.onepass.apis.EventDuration.Builder builderForValue) {
      if (eventDurationsBuilder_ == null) {
        ensureEventDurationsIsMutable();
        eventDurations_.set(index, builderForValue.build());
        onChanged();
      } else {
        eventDurationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.EventDuration event_durations = 1 [json_name = "eventDurations"];</code>
     */
    public Builder addEventDurations(app.onepass.apis.EventDuration value) {
      if (eventDurationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventDurationsIsMutable();
        eventDurations_.add(value);
        onChanged();
      } else {
        eventDurationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.EventDuration event_durations = 1 [json_name = "eventDurations"];</code>
     */
    public Builder addEventDurations(
        int index, app.onepass.apis.EventDuration value) {
      if (eventDurationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventDurationsIsMutable();
        eventDurations_.add(index, value);
        onChanged();
      } else {
        eventDurationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.EventDuration event_durations = 1 [json_name = "eventDurations"];</code>
     */
    public Builder addEventDurations(
        app.onepass.apis.EventDuration.Builder builderForValue) {
      if (eventDurationsBuilder_ == null) {
        ensureEventDurationsIsMutable();
        eventDurations_.add(builderForValue.build());
        onChanged();
      } else {
        eventDurationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.EventDuration event_durations = 1 [json_name = "eventDurations"];</code>
     */
    public Builder addEventDurations(
        int index, app.onepass.apis.EventDuration.Builder builderForValue) {
      if (eventDurationsBuilder_ == null) {
        ensureEventDurationsIsMutable();
        eventDurations_.add(index, builderForValue.build());
        onChanged();
      } else {
        eventDurationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.EventDuration event_durations = 1 [json_name = "eventDurations"];</code>
     */
    public Builder addAllEventDurations(
        java.lang.Iterable<? extends app.onepass.apis.EventDuration> values) {
      if (eventDurationsBuilder_ == null) {
        ensureEventDurationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, eventDurations_);
        onChanged();
      } else {
        eventDurationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.EventDuration event_durations = 1 [json_name = "eventDurations"];</code>
     */
    public Builder clearEventDurations() {
      if (eventDurationsBuilder_ == null) {
        eventDurations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        eventDurationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.EventDuration event_durations = 1 [json_name = "eventDurations"];</code>
     */
    public Builder removeEventDurations(int index) {
      if (eventDurationsBuilder_ == null) {
        ensureEventDurationsIsMutable();
        eventDurations_.remove(index);
        onChanged();
      } else {
        eventDurationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .hts.common.EventDuration event_durations = 1 [json_name = "eventDurations"];</code>
     */
    public app.onepass.apis.EventDuration.Builder getEventDurationsBuilder(
        int index) {
      return getEventDurationsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .hts.common.EventDuration event_durations = 1 [json_name = "eventDurations"];</code>
     */
    public app.onepass.apis.EventDurationOrBuilder getEventDurationsOrBuilder(
        int index) {
      if (eventDurationsBuilder_ == null) {
        return eventDurations_.get(index);  } else {
        return eventDurationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .hts.common.EventDuration event_durations = 1 [json_name = "eventDurations"];</code>
     */
    public java.util.List<? extends app.onepass.apis.EventDurationOrBuilder> 
         getEventDurationsOrBuilderList() {
      if (eventDurationsBuilder_ != null) {
        return eventDurationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(eventDurations_);
      }
    }
    /**
     * <code>repeated .hts.common.EventDuration event_durations = 1 [json_name = "eventDurations"];</code>
     */
    public app.onepass.apis.EventDuration.Builder addEventDurationsBuilder() {
      return getEventDurationsFieldBuilder().addBuilder(
          app.onepass.apis.EventDuration.getDefaultInstance());
    }
    /**
     * <code>repeated .hts.common.EventDuration event_durations = 1 [json_name = "eventDurations"];</code>
     */
    public app.onepass.apis.EventDuration.Builder addEventDurationsBuilder(
        int index) {
      return getEventDurationsFieldBuilder().addBuilder(
          index, app.onepass.apis.EventDuration.getDefaultInstance());
    }
    /**
     * <code>repeated .hts.common.EventDuration event_durations = 1 [json_name = "eventDurations"];</code>
     */
    public java.util.List<app.onepass.apis.EventDuration.Builder> 
         getEventDurationsBuilderList() {
      return getEventDurationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        app.onepass.apis.EventDuration, app.onepass.apis.EventDuration.Builder, app.onepass.apis.EventDurationOrBuilder> 
        getEventDurationsFieldBuilder() {
      if (eventDurationsBuilder_ == null) {
        eventDurationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            app.onepass.apis.EventDuration, app.onepass.apis.EventDuration.Builder, app.onepass.apis.EventDurationOrBuilder>(
                eventDurations_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        eventDurations_ = null;
      }
      return eventDurationsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:hts.organizer.EventDurationListResponse)
  }

  // @@protoc_insertion_point(class_scope:hts.organizer.EventDurationListResponse)
  private static final app.onepass.apis.EventDurationListResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new app.onepass.apis.EventDurationListResponse();
  }

  public static app.onepass.apis.EventDurationListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventDurationListResponse>
      PARSER = new com.google.protobuf.AbstractParser<EventDurationListResponse>() {
    @java.lang.Override
    public EventDurationListResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EventDurationListResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EventDurationListResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventDurationListResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public app.onepass.apis.EventDurationListResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

