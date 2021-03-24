// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/common/common.proto

package app.onepass.apis;

/**
 * Protobuf enum {@code hts.common.QuestionType}
 */
public enum QuestionType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>PRE_EVENT = 0;</code>
   */
  PRE_EVENT(0),
  /**
   * <code>POST_EVENT = 1;</code>
   */
  POST_EVENT(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>PRE_EVENT = 0;</code>
   */
  public static final int PRE_EVENT_VALUE = 0;
  /**
   * <code>POST_EVENT = 1;</code>
   */
  public static final int POST_EVENT_VALUE = 1;


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
  public static QuestionType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static QuestionType forNumber(int value) {
    switch (value) {
      case 0: return PRE_EVENT;
      case 1: return POST_EVENT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<QuestionType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      QuestionType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<QuestionType>() {
          public QuestionType findValueByNumber(int number) {
            return QuestionType.forNumber(number);
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
    return app.onepass.apis.CommonProto.getDescriptor().getEnumTypes().get(2);
  }

  private static final QuestionType[] VALUES = values();

  public static QuestionType valueOf(
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

  private QuestionType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:hts.common.QuestionType)
}

