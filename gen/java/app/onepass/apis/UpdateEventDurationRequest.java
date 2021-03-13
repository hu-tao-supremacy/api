// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/organizer/service.proto

package app.onepass.apis;

/**
 * Protobuf type {@code hts.organizer.UpdateEventDurationRequest}
 */
public final class UpdateEventDurationRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:hts.organizer.UpdateEventDurationRequest)
    UpdateEventDurationRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateEventDurationRequest.newBuilder() to construct.
  private UpdateEventDurationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateEventDurationRequest() {
    duration_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateEventDurationRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateEventDurationRequest(
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
          case 8: {

            userId_ = input.readInt64();
            break;
          }
          case 16: {

            eventId_ = input.readInt64();
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              duration_ = new java.util.ArrayList<app.onepass.apis.Duration>();
              mutable_bitField0_ |= 0x00000001;
            }
            duration_.add(
                input.readMessage(app.onepass.apis.Duration.parser(), extensionRegistry));
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
        duration_ = java.util.Collections.unmodifiableList(duration_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return app.onepass.apis.OrganizerProto.internal_static_hts_organizer_UpdateEventDurationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return app.onepass.apis.OrganizerProto.internal_static_hts_organizer_UpdateEventDurationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            app.onepass.apis.UpdateEventDurationRequest.class, app.onepass.apis.UpdateEventDurationRequest.Builder.class);
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

  public static final int EVENT_ID_FIELD_NUMBER = 2;
  private long eventId_;
  /**
   * <code>int64 event_id = 2 [json_name = "eventId"];</code>
   * @return The eventId.
   */
  @java.lang.Override
  public long getEventId() {
    return eventId_;
  }

  public static final int DURATION_FIELD_NUMBER = 3;
  private java.util.List<app.onepass.apis.Duration> duration_;
  /**
   * <code>repeated .hts.organizer.Duration duration = 3 [json_name = "duration"];</code>
   */
  @java.lang.Override
  public java.util.List<app.onepass.apis.Duration> getDurationList() {
    return duration_;
  }
  /**
   * <code>repeated .hts.organizer.Duration duration = 3 [json_name = "duration"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends app.onepass.apis.DurationOrBuilder> 
      getDurationOrBuilderList() {
    return duration_;
  }
  /**
   * <code>repeated .hts.organizer.Duration duration = 3 [json_name = "duration"];</code>
   */
  @java.lang.Override
  public int getDurationCount() {
    return duration_.size();
  }
  /**
   * <code>repeated .hts.organizer.Duration duration = 3 [json_name = "duration"];</code>
   */
  @java.lang.Override
  public app.onepass.apis.Duration getDuration(int index) {
    return duration_.get(index);
  }
  /**
   * <code>repeated .hts.organizer.Duration duration = 3 [json_name = "duration"];</code>
   */
  @java.lang.Override
  public app.onepass.apis.DurationOrBuilder getDurationOrBuilder(
      int index) {
    return duration_.get(index);
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
    if (eventId_ != 0L) {
      output.writeInt64(2, eventId_);
    }
    for (int i = 0; i < duration_.size(); i++) {
      output.writeMessage(3, duration_.get(i));
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
    if (eventId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, eventId_);
    }
    for (int i = 0; i < duration_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, duration_.get(i));
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
    if (!(obj instanceof app.onepass.apis.UpdateEventDurationRequest)) {
      return super.equals(obj);
    }
    app.onepass.apis.UpdateEventDurationRequest other = (app.onepass.apis.UpdateEventDurationRequest) obj;

    if (getUserId()
        != other.getUserId()) return false;
    if (getEventId()
        != other.getEventId()) return false;
    if (!getDurationList()
        .equals(other.getDurationList())) return false;
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
    hash = (37 * hash) + EVENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEventId());
    if (getDurationCount() > 0) {
      hash = (37 * hash) + DURATION_FIELD_NUMBER;
      hash = (53 * hash) + getDurationList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static app.onepass.apis.UpdateEventDurationRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.UpdateEventDurationRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.UpdateEventDurationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.UpdateEventDurationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.UpdateEventDurationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.UpdateEventDurationRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.UpdateEventDurationRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.onepass.apis.UpdateEventDurationRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.onepass.apis.UpdateEventDurationRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static app.onepass.apis.UpdateEventDurationRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.onepass.apis.UpdateEventDurationRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.onepass.apis.UpdateEventDurationRequest parseFrom(
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
  public static Builder newBuilder(app.onepass.apis.UpdateEventDurationRequest prototype) {
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
   * Protobuf type {@code hts.organizer.UpdateEventDurationRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:hts.organizer.UpdateEventDurationRequest)
      app.onepass.apis.UpdateEventDurationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return app.onepass.apis.OrganizerProto.internal_static_hts_organizer_UpdateEventDurationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return app.onepass.apis.OrganizerProto.internal_static_hts_organizer_UpdateEventDurationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              app.onepass.apis.UpdateEventDurationRequest.class, app.onepass.apis.UpdateEventDurationRequest.Builder.class);
    }

    // Construct using app.onepass.apis.UpdateEventDurationRequest.newBuilder()
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
        getDurationFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      userId_ = 0L;

      eventId_ = 0L;

      if (durationBuilder_ == null) {
        duration_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        durationBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return app.onepass.apis.OrganizerProto.internal_static_hts_organizer_UpdateEventDurationRequest_descriptor;
    }

    @java.lang.Override
    public app.onepass.apis.UpdateEventDurationRequest getDefaultInstanceForType() {
      return app.onepass.apis.UpdateEventDurationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public app.onepass.apis.UpdateEventDurationRequest build() {
      app.onepass.apis.UpdateEventDurationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public app.onepass.apis.UpdateEventDurationRequest buildPartial() {
      app.onepass.apis.UpdateEventDurationRequest result = new app.onepass.apis.UpdateEventDurationRequest(this);
      int from_bitField0_ = bitField0_;
      result.userId_ = userId_;
      result.eventId_ = eventId_;
      if (durationBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          duration_ = java.util.Collections.unmodifiableList(duration_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.duration_ = duration_;
      } else {
        result.duration_ = durationBuilder_.build();
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
      if (other instanceof app.onepass.apis.UpdateEventDurationRequest) {
        return mergeFrom((app.onepass.apis.UpdateEventDurationRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(app.onepass.apis.UpdateEventDurationRequest other) {
      if (other == app.onepass.apis.UpdateEventDurationRequest.getDefaultInstance()) return this;
      if (other.getUserId() != 0L) {
        setUserId(other.getUserId());
      }
      if (other.getEventId() != 0L) {
        setEventId(other.getEventId());
      }
      if (durationBuilder_ == null) {
        if (!other.duration_.isEmpty()) {
          if (duration_.isEmpty()) {
            duration_ = other.duration_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDurationIsMutable();
            duration_.addAll(other.duration_);
          }
          onChanged();
        }
      } else {
        if (!other.duration_.isEmpty()) {
          if (durationBuilder_.isEmpty()) {
            durationBuilder_.dispose();
            durationBuilder_ = null;
            duration_ = other.duration_;
            bitField0_ = (bitField0_ & ~0x00000001);
            durationBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDurationFieldBuilder() : null;
          } else {
            durationBuilder_.addAllMessages(other.duration_);
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
      app.onepass.apis.UpdateEventDurationRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (app.onepass.apis.UpdateEventDurationRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

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

    private long eventId_ ;
    /**
     * <code>int64 event_id = 2 [json_name = "eventId"];</code>
     * @return The eventId.
     */
    @java.lang.Override
    public long getEventId() {
      return eventId_;
    }
    /**
     * <code>int64 event_id = 2 [json_name = "eventId"];</code>
     * @param value The eventId to set.
     * @return This builder for chaining.
     */
    public Builder setEventId(long value) {
      
      eventId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 event_id = 2 [json_name = "eventId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEventId() {
      
      eventId_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<app.onepass.apis.Duration> duration_ =
      java.util.Collections.emptyList();
    private void ensureDurationIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        duration_ = new java.util.ArrayList<app.onepass.apis.Duration>(duration_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        app.onepass.apis.Duration, app.onepass.apis.Duration.Builder, app.onepass.apis.DurationOrBuilder> durationBuilder_;

    /**
     * <code>repeated .hts.organizer.Duration duration = 3 [json_name = "duration"];</code>
     */
    public java.util.List<app.onepass.apis.Duration> getDurationList() {
      if (durationBuilder_ == null) {
        return java.util.Collections.unmodifiableList(duration_);
      } else {
        return durationBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .hts.organizer.Duration duration = 3 [json_name = "duration"];</code>
     */
    public int getDurationCount() {
      if (durationBuilder_ == null) {
        return duration_.size();
      } else {
        return durationBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .hts.organizer.Duration duration = 3 [json_name = "duration"];</code>
     */
    public app.onepass.apis.Duration getDuration(int index) {
      if (durationBuilder_ == null) {
        return duration_.get(index);
      } else {
        return durationBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .hts.organizer.Duration duration = 3 [json_name = "duration"];</code>
     */
    public Builder setDuration(
        int index, app.onepass.apis.Duration value) {
      if (durationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDurationIsMutable();
        duration_.set(index, value);
        onChanged();
      } else {
        durationBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .hts.organizer.Duration duration = 3 [json_name = "duration"];</code>
     */
    public Builder setDuration(
        int index, app.onepass.apis.Duration.Builder builderForValue) {
      if (durationBuilder_ == null) {
        ensureDurationIsMutable();
        duration_.set(index, builderForValue.build());
        onChanged();
      } else {
        durationBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .hts.organizer.Duration duration = 3 [json_name = "duration"];</code>
     */
    public Builder addDuration(app.onepass.apis.Duration value) {
      if (durationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDurationIsMutable();
        duration_.add(value);
        onChanged();
      } else {
        durationBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .hts.organizer.Duration duration = 3 [json_name = "duration"];</code>
     */
    public Builder addDuration(
        int index, app.onepass.apis.Duration value) {
      if (durationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDurationIsMutable();
        duration_.add(index, value);
        onChanged();
      } else {
        durationBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .hts.organizer.Duration duration = 3 [json_name = "duration"];</code>
     */
    public Builder addDuration(
        app.onepass.apis.Duration.Builder builderForValue) {
      if (durationBuilder_ == null) {
        ensureDurationIsMutable();
        duration_.add(builderForValue.build());
        onChanged();
      } else {
        durationBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .hts.organizer.Duration duration = 3 [json_name = "duration"];</code>
     */
    public Builder addDuration(
        int index, app.onepass.apis.Duration.Builder builderForValue) {
      if (durationBuilder_ == null) {
        ensureDurationIsMutable();
        duration_.add(index, builderForValue.build());
        onChanged();
      } else {
        durationBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .hts.organizer.Duration duration = 3 [json_name = "duration"];</code>
     */
    public Builder addAllDuration(
        java.lang.Iterable<? extends app.onepass.apis.Duration> values) {
      if (durationBuilder_ == null) {
        ensureDurationIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, duration_);
        onChanged();
      } else {
        durationBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .hts.organizer.Duration duration = 3 [json_name = "duration"];</code>
     */
    public Builder clearDuration() {
      if (durationBuilder_ == null) {
        duration_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        durationBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .hts.organizer.Duration duration = 3 [json_name = "duration"];</code>
     */
    public Builder removeDuration(int index) {
      if (durationBuilder_ == null) {
        ensureDurationIsMutable();
        duration_.remove(index);
        onChanged();
      } else {
        durationBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .hts.organizer.Duration duration = 3 [json_name = "duration"];</code>
     */
    public app.onepass.apis.Duration.Builder getDurationBuilder(
        int index) {
      return getDurationFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .hts.organizer.Duration duration = 3 [json_name = "duration"];</code>
     */
    public app.onepass.apis.DurationOrBuilder getDurationOrBuilder(
        int index) {
      if (durationBuilder_ == null) {
        return duration_.get(index);  } else {
        return durationBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .hts.organizer.Duration duration = 3 [json_name = "duration"];</code>
     */
    public java.util.List<? extends app.onepass.apis.DurationOrBuilder> 
         getDurationOrBuilderList() {
      if (durationBuilder_ != null) {
        return durationBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(duration_);
      }
    }
    /**
     * <code>repeated .hts.organizer.Duration duration = 3 [json_name = "duration"];</code>
     */
    public app.onepass.apis.Duration.Builder addDurationBuilder() {
      return getDurationFieldBuilder().addBuilder(
          app.onepass.apis.Duration.getDefaultInstance());
    }
    /**
     * <code>repeated .hts.organizer.Duration duration = 3 [json_name = "duration"];</code>
     */
    public app.onepass.apis.Duration.Builder addDurationBuilder(
        int index) {
      return getDurationFieldBuilder().addBuilder(
          index, app.onepass.apis.Duration.getDefaultInstance());
    }
    /**
     * <code>repeated .hts.organizer.Duration duration = 3 [json_name = "duration"];</code>
     */
    public java.util.List<app.onepass.apis.Duration.Builder> 
         getDurationBuilderList() {
      return getDurationFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        app.onepass.apis.Duration, app.onepass.apis.Duration.Builder, app.onepass.apis.DurationOrBuilder> 
        getDurationFieldBuilder() {
      if (durationBuilder_ == null) {
        durationBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            app.onepass.apis.Duration, app.onepass.apis.Duration.Builder, app.onepass.apis.DurationOrBuilder>(
                duration_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        duration_ = null;
      }
      return durationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:hts.organizer.UpdateEventDurationRequest)
  }

  // @@protoc_insertion_point(class_scope:hts.organizer.UpdateEventDurationRequest)
  private static final app.onepass.apis.UpdateEventDurationRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new app.onepass.apis.UpdateEventDurationRequest();
  }

  public static app.onepass.apis.UpdateEventDurationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateEventDurationRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateEventDurationRequest>() {
    @java.lang.Override
    public UpdateEventDurationRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateEventDurationRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateEventDurationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateEventDurationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public app.onepass.apis.UpdateEventDurationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
