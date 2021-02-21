// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/common/common.proto

package app.onepass.apis;

/**
 * Protobuf type {@code hts.common.OperatingHour}
 */
public final class OperatingHour extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:hts.common.OperatingHour)
    OperatingHourOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OperatingHour.newBuilder() to construct.
  private OperatingHour(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OperatingHour() {
    day_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OperatingHour();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OperatingHour(
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

            startHour_ = input.readInt64();
            break;
          }
          case 16: {

            finishHour_ = input.readInt64();
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            day_ = rawValue;
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
    return app.onepass.apis.CommonProto.internal_static_hts_common_OperatingHour_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return app.onepass.apis.CommonProto.internal_static_hts_common_OperatingHour_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            app.onepass.apis.OperatingHour.class, app.onepass.apis.OperatingHour.Builder.class);
  }

  public static final int START_HOUR_FIELD_NUMBER = 1;
  private long startHour_;
  /**
   * <code>int64 start_hour = 1 [json_name = "startHour"];</code>
   * @return The startHour.
   */
  @java.lang.Override
  public long getStartHour() {
    return startHour_;
  }

  public static final int FINISH_HOUR_FIELD_NUMBER = 2;
  private long finishHour_;
  /**
   * <code>int64 finish_hour = 2 [json_name = "finishHour"];</code>
   * @return The finishHour.
   */
  @java.lang.Override
  public long getFinishHour() {
    return finishHour_;
  }

  public static final int DAY_FIELD_NUMBER = 3;
  private int day_;
  /**
   * <code>.hts.common.DayOfWeek day = 3 [json_name = "day"];</code>
   * @return The enum numeric value on the wire for day.
   */
  @java.lang.Override public int getDayValue() {
    return day_;
  }
  /**
   * <code>.hts.common.DayOfWeek day = 3 [json_name = "day"];</code>
   * @return The day.
   */
  @java.lang.Override public app.onepass.apis.DayOfWeek getDay() {
    @SuppressWarnings("deprecation")
    app.onepass.apis.DayOfWeek result = app.onepass.apis.DayOfWeek.valueOf(day_);
    return result == null ? app.onepass.apis.DayOfWeek.UNRECOGNIZED : result;
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
    if (startHour_ != 0L) {
      output.writeInt64(1, startHour_);
    }
    if (finishHour_ != 0L) {
      output.writeInt64(2, finishHour_);
    }
    if (day_ != app.onepass.apis.DayOfWeek.MON.getNumber()) {
      output.writeEnum(3, day_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (startHour_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, startHour_);
    }
    if (finishHour_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, finishHour_);
    }
    if (day_ != app.onepass.apis.DayOfWeek.MON.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, day_);
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
    if (!(obj instanceof app.onepass.apis.OperatingHour)) {
      return super.equals(obj);
    }
    app.onepass.apis.OperatingHour other = (app.onepass.apis.OperatingHour) obj;

    if (getStartHour()
        != other.getStartHour()) return false;
    if (getFinishHour()
        != other.getFinishHour()) return false;
    if (day_ != other.day_) return false;
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
    hash = (37 * hash) + START_HOUR_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStartHour());
    hash = (37 * hash) + FINISH_HOUR_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFinishHour());
    hash = (37 * hash) + DAY_FIELD_NUMBER;
    hash = (53 * hash) + day_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static app.onepass.apis.OperatingHour parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.OperatingHour parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.OperatingHour parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.OperatingHour parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.OperatingHour parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.onepass.apis.OperatingHour parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.onepass.apis.OperatingHour parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.onepass.apis.OperatingHour parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.onepass.apis.OperatingHour parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static app.onepass.apis.OperatingHour parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.onepass.apis.OperatingHour parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.onepass.apis.OperatingHour parseFrom(
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
  public static Builder newBuilder(app.onepass.apis.OperatingHour prototype) {
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
   * Protobuf type {@code hts.common.OperatingHour}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:hts.common.OperatingHour)
      app.onepass.apis.OperatingHourOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return app.onepass.apis.CommonProto.internal_static_hts_common_OperatingHour_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return app.onepass.apis.CommonProto.internal_static_hts_common_OperatingHour_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              app.onepass.apis.OperatingHour.class, app.onepass.apis.OperatingHour.Builder.class);
    }

    // Construct using app.onepass.apis.OperatingHour.newBuilder()
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
      startHour_ = 0L;

      finishHour_ = 0L;

      day_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return app.onepass.apis.CommonProto.internal_static_hts_common_OperatingHour_descriptor;
    }

    @java.lang.Override
    public app.onepass.apis.OperatingHour getDefaultInstanceForType() {
      return app.onepass.apis.OperatingHour.getDefaultInstance();
    }

    @java.lang.Override
    public app.onepass.apis.OperatingHour build() {
      app.onepass.apis.OperatingHour result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public app.onepass.apis.OperatingHour buildPartial() {
      app.onepass.apis.OperatingHour result = new app.onepass.apis.OperatingHour(this);
      result.startHour_ = startHour_;
      result.finishHour_ = finishHour_;
      result.day_ = day_;
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
      if (other instanceof app.onepass.apis.OperatingHour) {
        return mergeFrom((app.onepass.apis.OperatingHour)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(app.onepass.apis.OperatingHour other) {
      if (other == app.onepass.apis.OperatingHour.getDefaultInstance()) return this;
      if (other.getStartHour() != 0L) {
        setStartHour(other.getStartHour());
      }
      if (other.getFinishHour() != 0L) {
        setFinishHour(other.getFinishHour());
      }
      if (other.day_ != 0) {
        setDayValue(other.getDayValue());
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
      app.onepass.apis.OperatingHour parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (app.onepass.apis.OperatingHour) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long startHour_ ;
    /**
     * <code>int64 start_hour = 1 [json_name = "startHour"];</code>
     * @return The startHour.
     */
    @java.lang.Override
    public long getStartHour() {
      return startHour_;
    }
    /**
     * <code>int64 start_hour = 1 [json_name = "startHour"];</code>
     * @param value The startHour to set.
     * @return This builder for chaining.
     */
    public Builder setStartHour(long value) {
      
      startHour_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 start_hour = 1 [json_name = "startHour"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStartHour() {
      
      startHour_ = 0L;
      onChanged();
      return this;
    }

    private long finishHour_ ;
    /**
     * <code>int64 finish_hour = 2 [json_name = "finishHour"];</code>
     * @return The finishHour.
     */
    @java.lang.Override
    public long getFinishHour() {
      return finishHour_;
    }
    /**
     * <code>int64 finish_hour = 2 [json_name = "finishHour"];</code>
     * @param value The finishHour to set.
     * @return This builder for chaining.
     */
    public Builder setFinishHour(long value) {
      
      finishHour_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 finish_hour = 2 [json_name = "finishHour"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFinishHour() {
      
      finishHour_ = 0L;
      onChanged();
      return this;
    }

    private int day_ = 0;
    /**
     * <code>.hts.common.DayOfWeek day = 3 [json_name = "day"];</code>
     * @return The enum numeric value on the wire for day.
     */
    @java.lang.Override public int getDayValue() {
      return day_;
    }
    /**
     * <code>.hts.common.DayOfWeek day = 3 [json_name = "day"];</code>
     * @param value The enum numeric value on the wire for day to set.
     * @return This builder for chaining.
     */
    public Builder setDayValue(int value) {
      
      day_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.hts.common.DayOfWeek day = 3 [json_name = "day"];</code>
     * @return The day.
     */
    @java.lang.Override
    public app.onepass.apis.DayOfWeek getDay() {
      @SuppressWarnings("deprecation")
      app.onepass.apis.DayOfWeek result = app.onepass.apis.DayOfWeek.valueOf(day_);
      return result == null ? app.onepass.apis.DayOfWeek.UNRECOGNIZED : result;
    }
    /**
     * <code>.hts.common.DayOfWeek day = 3 [json_name = "day"];</code>
     * @param value The day to set.
     * @return This builder for chaining.
     */
    public Builder setDay(app.onepass.apis.DayOfWeek value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      day_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.hts.common.DayOfWeek day = 3 [json_name = "day"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDay() {
      
      day_ = 0;
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


    // @@protoc_insertion_point(builder_scope:hts.common.OperatingHour)
  }

  // @@protoc_insertion_point(class_scope:hts.common.OperatingHour)
  private static final app.onepass.apis.OperatingHour DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new app.onepass.apis.OperatingHour();
  }

  public static app.onepass.apis.OperatingHour getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OperatingHour>
      PARSER = new com.google.protobuf.AbstractParser<OperatingHour>() {
    @java.lang.Override
    public OperatingHour parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OperatingHour(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OperatingHour> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OperatingHour> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public app.onepass.apis.OperatingHour getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

