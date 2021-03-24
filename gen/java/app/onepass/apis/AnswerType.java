// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/common/common.proto

package app.onepass.apis;

/**
 * Protobuf enum {@code hts.common.AnswerType}
 */
public enum AnswerType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SCALE = 0;</code>
   */
  SCALE(0),
  /**
   * <code>TEXT = 1;</code>
   */
  TEXT(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>SCALE = 0;</code>
   */
  public static final int SCALE_VALUE = 0;
  /**
   * <code>TEXT = 1;</code>
   */
  public static final int TEXT_VALUE = 1;


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
  public static AnswerType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AnswerType forNumber(int value) {
    switch (value) {
      case 0: return SCALE;
      case 1: return TEXT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AnswerType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AnswerType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AnswerType>() {
          public AnswerType findValueByNumber(int number) {
            return AnswerType.forNumber(number);
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
    return app.onepass.apis.CommonProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final AnswerType[] VALUES = values();

  public static AnswerType valueOf(
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

  private AnswerType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:hts.common.AnswerType)
}
