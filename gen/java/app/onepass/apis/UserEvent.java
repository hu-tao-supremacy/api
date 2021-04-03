// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/common/common.proto

package app.onepass.apis;

/**
 * Protobuf type {@code hts.common.UserEvent}
 */
public final class UserEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:hts.common.UserEvent)
    UserEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserEvent.newBuilder() to construct.
  private UserEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserEvent() {
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UserEvent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UserEvent(
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

            id_ = input.readInt32();
            break;
          }
          case 16: {

            userId_ = input.readInt32();
            break;
          }
          case 24: {

            eventId_ = input.readInt32();
            break;
          }
          case 34: {
            com.google.protobuf.Int32Value.Builder subBuilder = null;
            if (rating_ != null) {
              subBuilder = rating_.toBuilder();
            }
            rating_ = input.readMessage(com.google.protobuf.Int32Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(rating_);
              rating_ = subBuilder.buildPartial();
            }

            break;
          }
          case 42: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (ticket_ != null) {
              subBuilder = ticket_.toBuilder();
            }
            ticket_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(ticket_);
              ticket_ = subBuilder.buildPartial();
            }

            break;
          }
          case 48: {
            int rawValue = input.readEnum();

            status_ = rawValue;
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
    return app.onepass.apis.CommonProto.internal_static_hts_common_UserEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return app.onepass.apis.CommonProto.internal_static_hts_common_UserEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            app.onepass.apis.UserEvent.class, app.onepass.apis.UserEvent.Builder.class);
  }

  /**
   * Protobuf enum {@code hts.common.UserEvent.Status}
   */
  public enum Status
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>STATUS_UNSPECIFIED = 0;</code>
     */
    STATUS_UNSPECIFIED(0),
    /**
     * <code>PENDING = 1;</code>
     */
    PENDING(1),
    /**
     * <code>APPROVED = 2;</code>
     */
    APPROVED(2),
    /**
     * <code>REJECTED = 3;</code>
     */
    REJECTED(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>STATUS_UNSPECIFIED = 0;</code>
     */
    public static final int STATUS_UNSPECIFIED_VALUE = 0;
    /**
     * <code>PENDING = 1;</code>
     */
    public static final int PENDING_VALUE = 1;
    /**
     * <code>APPROVED = 2;</code>
     */
    public static final int APPROVED_VALUE = 2;
    /**
     * <code>REJECTED = 3;</code>
     */
    public static final int REJECTED_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Status valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Status forNumber(int value) {
      switch (value) {
        case 0: return STATUS_UNSPECIFIED;
        case 1: return PENDING;
        case 2: return APPROVED;
        case 3: return REJECTED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Status>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Status> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Status>() {
            public Status findValueByNumber(int number) {
              return Status.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return app.onepass.apis.UserEvent.getDescriptor().getEnumTypes().get(0);
    }

    private static final Status[] VALUES = values();

    public static Status valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Status(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:hts.common.UserEvent.Status)
  }

  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <code>int32 id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  @java.lang.Override
  public int getId() {
    return id_;
  }

  public static final int USER_ID_FIELD_NUMBER = 2;
  private int userId_;
  /**
   * <code>int32 user_id = 2 [json_name = "userId"];</code>
   * @return The userId.
   */
  @java.lang.Override
  public int getUserId() {
    return userId_;
  }

  public static final int EVENT_ID_FIELD_NUMBER = 3;
  private int eventId_;
  /**
   * <code>int32 event_id = 3 [json_name = "eventId"];</code>
   * @return The eventId.
   */
  @java.lang.Override
  public int getEventId() {
    return eventId_;
  }

  public static final int RATING_FIELD_NUMBER = 4;
  private com.google.protobuf.Int32Value rating_;
  /**
   * <code>.google.protobuf.Int32Value rating = 4 [json_name = "rating"];</code>
   * @return Whether the rating field is set.
   */
  @java.lang.Override
  public boolean hasRating() {
    return rating_ != null;
  }
  /**
   * <code>.google.protobuf.Int32Value rating = 4 [json_name = "rating"];</code>
   * @return The rating.
   */
  @java.lang.Override
  public com.google.protobuf.Int32Value getRating() {
    return rating_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : rating_;
  }
  /**
   * <code>.google.protobuf.Int32Value rating = 4 [json_name = "rating"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.Int32ValueOrBuilder getRatingOrBuilder() {
    return getRating();
  }

  public static final int TICKET_FIELD_NUMBER = 5;
  private com.google.protobuf.StringValue ticket_;
  /**
   * <code>.google.protobuf.StringValue ticket = 5 [json_name = "ticket"];</code>
   * @return Whether the ticket field is set.
   */
  @java.lang.Override
  public boolean hasTicket() {
    return ticket_ != null;
  }
  /**
   * <code>.google.protobuf.StringValue ticket = 5 [json_name = "ticket"];</code>
   * @return The ticket.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getTicket() {
    return ticket_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : ticket_;
  }
  /**
   * <code>.google.protobuf.StringValue ticket = 5 [json_name = "ticket"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getTicketOrBuilder() {
    return getTicket();
  }

  public static final int STATUS_FIELD_NUMBER = 6;
  private int status_;
  /**
   * <code>.hts.common.UserEvent.Status status = 6 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.hts.common.UserEvent.Status status = 6 [json_name = "status"];</code>
   * @return The status.
   */
  @java.lang.Override public app.onepass.apis.UserEvent.Status getStatus() {
    @SuppressWarnings("deprecation")
    app.onepass.apis.UserEvent.Status result = app.onepass.apis.UserEvent.Status.valueOf(status_);
    return result == null ? app.onepass.apis.UserEvent.Status.UNRECOGNIZED : result;
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
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    if (userId_ != 0) {
      output.writeInt32(2, userId_);
    }
    if (eventId_ != 0) {
      output.writeInt32(3, eventId_);
    }
    if (rating_ != null) {
      output.writeMessage(4, getRating());
    }
    if (ticket_ != null) {
      output.writeMessage(5, getTicket());
    }
    if (status_ != app.onepass.apis.UserEvent.Status.STATUS_UNSPECIFIED.getNumber()) {
      output.writeEnum(6, status_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (userId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, userId_);
    }
    if (eventId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, eventId_);
    }
    if (rating_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getRating());
    }
    if (ticket_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getTicket());
    }
    if (status_ != app.onepass.apis.UserEvent.Status.STATUS_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(6, status_);
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
    if (!(obj instanceof app.onepass.apis.UserEvent)) {
      return super.equals(obj);
    }
    app.onepass.apis.UserEvent other = (app.onepass.apis.UserEvent) obj;

    if (getId()
        != other.getId()) return false;
    if (getUserId()
        != other.getUserId()) return false;
    if (getEventId()
        != other.getEventId()) return false;
    if (hasRating() != other.hasRating()) return false;
    if (hasRating()) {
      if (!getRating()
          .equals(other.getRating())) return false;
    }
    if (hasTicket() != other.hasTicket()) return false;
    if (hasTicket()) {
      if (!getTicket()
          .equals(other.getTicket())) return false;
    }
    if (status_ != other.status_) return false;
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
    hash = (53 * hash) + getId();
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId();
    hash = (37 * hash) + EVENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getEventId();
    if (hasRating()) {
      hash = (37 * hash) + RATING_FIELD_NUMBER;
      hash = (53 * hash) + getRating().hashCode();
    }
    if (hasTicket()) {
      hash = (37 * hash) + TICKET_FIELD_NUMBER;
      hash = (53 * hash) + getTicket().hashCode();
    }
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static app.onepass.apis.UserEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.UserEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.UserEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.UserEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.UserEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.UserEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.UserEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.onepass.apis.UserEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.onepass.apis.UserEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static app.onepass.apis.UserEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.onepass.apis.UserEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.onepass.apis.UserEvent parseFrom(
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
  public static Builder newBuilder(app.onepass.apis.UserEvent prototype) {
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
   * Protobuf type {@code hts.common.UserEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:hts.common.UserEvent)
      app.onepass.apis.UserEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return app.onepass.apis.CommonProto.internal_static_hts_common_UserEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return app.onepass.apis.CommonProto.internal_static_hts_common_UserEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              app.onepass.apis.UserEvent.class, app.onepass.apis.UserEvent.Builder.class);
    }

    // Construct using app.onepass.apis.UserEvent.newBuilder()
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
      id_ = 0;

      userId_ = 0;

      eventId_ = 0;

      if (ratingBuilder_ == null) {
        rating_ = null;
      } else {
        rating_ = null;
        ratingBuilder_ = null;
      }
      if (ticketBuilder_ == null) {
        ticket_ = null;
      } else {
        ticket_ = null;
        ticketBuilder_ = null;
      }
      status_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return app.onepass.apis.CommonProto.internal_static_hts_common_UserEvent_descriptor;
    }

    @java.lang.Override
    public app.onepass.apis.UserEvent getDefaultInstanceForType() {
      return app.onepass.apis.UserEvent.getDefaultInstance();
    }

    @java.lang.Override
    public app.onepass.apis.UserEvent build() {
      app.onepass.apis.UserEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public app.onepass.apis.UserEvent buildPartial() {
      app.onepass.apis.UserEvent result = new app.onepass.apis.UserEvent(this);
      result.id_ = id_;
      result.userId_ = userId_;
      result.eventId_ = eventId_;
      if (ratingBuilder_ == null) {
        result.rating_ = rating_;
      } else {
        result.rating_ = ratingBuilder_.build();
      }
      if (ticketBuilder_ == null) {
        result.ticket_ = ticket_;
      } else {
        result.ticket_ = ticketBuilder_.build();
      }
      result.status_ = status_;
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
      if (other instanceof app.onepass.apis.UserEvent) {
        return mergeFrom((app.onepass.apis.UserEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(app.onepass.apis.UserEvent other) {
      if (other == app.onepass.apis.UserEvent.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (other.getUserId() != 0) {
        setUserId(other.getUserId());
      }
      if (other.getEventId() != 0) {
        setEventId(other.getEventId());
      }
      if (other.hasRating()) {
        mergeRating(other.getRating());
      }
      if (other.hasTicket()) {
        mergeTicket(other.getTicket());
      }
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
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
      app.onepass.apis.UserEvent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (app.onepass.apis.UserEvent) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int id_ ;
    /**
     * <code>int32 id = 1 [json_name = "id"];</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 1 [json_name = "id"];</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 1 [json_name = "id"];</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private int userId_ ;
    /**
     * <code>int32 user_id = 2 [json_name = "userId"];</code>
     * @return The userId.
     */
    @java.lang.Override
    public int getUserId() {
      return userId_;
    }
    /**
     * <code>int32 user_id = 2 [json_name = "userId"];</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(int value) {
      
      userId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 user_id = 2 [json_name = "userId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      
      userId_ = 0;
      onChanged();
      return this;
    }

    private int eventId_ ;
    /**
     * <code>int32 event_id = 3 [json_name = "eventId"];</code>
     * @return The eventId.
     */
    @java.lang.Override
    public int getEventId() {
      return eventId_;
    }
    /**
     * <code>int32 event_id = 3 [json_name = "eventId"];</code>
     * @param value The eventId to set.
     * @return This builder for chaining.
     */
    public Builder setEventId(int value) {
      
      eventId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 event_id = 3 [json_name = "eventId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEventId() {
      
      eventId_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Int32Value rating_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder> ratingBuilder_;
    /**
     * <code>.google.protobuf.Int32Value rating = 4 [json_name = "rating"];</code>
     * @return Whether the rating field is set.
     */
    public boolean hasRating() {
      return ratingBuilder_ != null || rating_ != null;
    }
    /**
     * <code>.google.protobuf.Int32Value rating = 4 [json_name = "rating"];</code>
     * @return The rating.
     */
    public com.google.protobuf.Int32Value getRating() {
      if (ratingBuilder_ == null) {
        return rating_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : rating_;
      } else {
        return ratingBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Int32Value rating = 4 [json_name = "rating"];</code>
     */
    public Builder setRating(com.google.protobuf.Int32Value value) {
      if (ratingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        rating_ = value;
        onChanged();
      } else {
        ratingBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int32Value rating = 4 [json_name = "rating"];</code>
     */
    public Builder setRating(
        com.google.protobuf.Int32Value.Builder builderForValue) {
      if (ratingBuilder_ == null) {
        rating_ = builderForValue.build();
        onChanged();
      } else {
        ratingBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int32Value rating = 4 [json_name = "rating"];</code>
     */
    public Builder mergeRating(com.google.protobuf.Int32Value value) {
      if (ratingBuilder_ == null) {
        if (rating_ != null) {
          rating_ =
            com.google.protobuf.Int32Value.newBuilder(rating_).mergeFrom(value).buildPartial();
        } else {
          rating_ = value;
        }
        onChanged();
      } else {
        ratingBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int32Value rating = 4 [json_name = "rating"];</code>
     */
    public Builder clearRating() {
      if (ratingBuilder_ == null) {
        rating_ = null;
        onChanged();
      } else {
        rating_ = null;
        ratingBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int32Value rating = 4 [json_name = "rating"];</code>
     */
    public com.google.protobuf.Int32Value.Builder getRatingBuilder() {
      
      onChanged();
      return getRatingFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Int32Value rating = 4 [json_name = "rating"];</code>
     */
    public com.google.protobuf.Int32ValueOrBuilder getRatingOrBuilder() {
      if (ratingBuilder_ != null) {
        return ratingBuilder_.getMessageOrBuilder();
      } else {
        return rating_ == null ?
            com.google.protobuf.Int32Value.getDefaultInstance() : rating_;
      }
    }
    /**
     * <code>.google.protobuf.Int32Value rating = 4 [json_name = "rating"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder> 
        getRatingFieldBuilder() {
      if (ratingBuilder_ == null) {
        ratingBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder>(
                getRating(),
                getParentForChildren(),
                isClean());
        rating_ = null;
      }
      return ratingBuilder_;
    }

    private com.google.protobuf.StringValue ticket_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> ticketBuilder_;
    /**
     * <code>.google.protobuf.StringValue ticket = 5 [json_name = "ticket"];</code>
     * @return Whether the ticket field is set.
     */
    public boolean hasTicket() {
      return ticketBuilder_ != null || ticket_ != null;
    }
    /**
     * <code>.google.protobuf.StringValue ticket = 5 [json_name = "ticket"];</code>
     * @return The ticket.
     */
    public com.google.protobuf.StringValue getTicket() {
      if (ticketBuilder_ == null) {
        return ticket_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : ticket_;
      } else {
        return ticketBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.StringValue ticket = 5 [json_name = "ticket"];</code>
     */
    public Builder setTicket(com.google.protobuf.StringValue value) {
      if (ticketBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ticket_ = value;
        onChanged();
      } else {
        ticketBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue ticket = 5 [json_name = "ticket"];</code>
     */
    public Builder setTicket(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (ticketBuilder_ == null) {
        ticket_ = builderForValue.build();
        onChanged();
      } else {
        ticketBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue ticket = 5 [json_name = "ticket"];</code>
     */
    public Builder mergeTicket(com.google.protobuf.StringValue value) {
      if (ticketBuilder_ == null) {
        if (ticket_ != null) {
          ticket_ =
            com.google.protobuf.StringValue.newBuilder(ticket_).mergeFrom(value).buildPartial();
        } else {
          ticket_ = value;
        }
        onChanged();
      } else {
        ticketBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue ticket = 5 [json_name = "ticket"];</code>
     */
    public Builder clearTicket() {
      if (ticketBuilder_ == null) {
        ticket_ = null;
        onChanged();
      } else {
        ticket_ = null;
        ticketBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue ticket = 5 [json_name = "ticket"];</code>
     */
    public com.google.protobuf.StringValue.Builder getTicketBuilder() {
      
      onChanged();
      return getTicketFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.StringValue ticket = 5 [json_name = "ticket"];</code>
     */
    public com.google.protobuf.StringValueOrBuilder getTicketOrBuilder() {
      if (ticketBuilder_ != null) {
        return ticketBuilder_.getMessageOrBuilder();
      } else {
        return ticket_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : ticket_;
      }
    }
    /**
     * <code>.google.protobuf.StringValue ticket = 5 [json_name = "ticket"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getTicketFieldBuilder() {
      if (ticketBuilder_ == null) {
        ticketBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getTicket(),
                getParentForChildren(),
                isClean());
        ticket_ = null;
      }
      return ticketBuilder_;
    }

    private int status_ = 0;
    /**
     * <code>.hts.common.UserEvent.Status status = 6 [json_name = "status"];</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.hts.common.UserEvent.Status status = 6 [json_name = "status"];</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.hts.common.UserEvent.Status status = 6 [json_name = "status"];</code>
     * @return The status.
     */
    @java.lang.Override
    public app.onepass.apis.UserEvent.Status getStatus() {
      @SuppressWarnings("deprecation")
      app.onepass.apis.UserEvent.Status result = app.onepass.apis.UserEvent.Status.valueOf(status_);
      return result == null ? app.onepass.apis.UserEvent.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.hts.common.UserEvent.Status status = 6 [json_name = "status"];</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(app.onepass.apis.UserEvent.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.hts.common.UserEvent.Status status = 6 [json_name = "status"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
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


    // @@protoc_insertion_point(builder_scope:hts.common.UserEvent)
  }

  // @@protoc_insertion_point(class_scope:hts.common.UserEvent)
  private static final app.onepass.apis.UserEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new app.onepass.apis.UserEvent();
  }

  public static app.onepass.apis.UserEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserEvent>
      PARSER = new com.google.protobuf.AbstractParser<UserEvent>() {
    @java.lang.Override
    public UserEvent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UserEvent(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UserEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public app.onepass.apis.UserEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

