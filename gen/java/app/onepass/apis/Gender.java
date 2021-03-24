// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/common/common.proto

package app.onepass.apis;

/**
 * Protobuf enum {@code hts.common.Gender}
 */
public enum Gender
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>MALE = 0;</code>
   */
  MALE(0),
  /**
   * <code>FEMALE = 1;</code>
   */
  FEMALE(1),
  /**
   * <code>NOT_SPECIFIED = 2;</code>
   */
  NOT_SPECIFIED(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>MALE = 0;</code>
   */
  public static final int MALE_VALUE = 0;
  /**
   * <code>FEMALE = 1;</code>
   */
  public static final int FEMALE_VALUE = 1;
  /**
   * <code>NOT_SPECIFIED = 2;</code>
   */
  public static final int NOT_SPECIFIED_VALUE = 2;


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
  public static Gender valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Gender forNumber(int value) {
    switch (value) {
      case 0: return MALE;
      case 1: return FEMALE;
      case 2: return NOT_SPECIFIED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Gender>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Gender> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Gender>() {
          public Gender findValueByNumber(int number) {
            return Gender.forNumber(number);
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
    return app.onepass.apis.CommonProto.getDescriptor().getEnumTypes().get(3);
  }

  private static final Gender[] VALUES = values();

  public static Gender valueOf(
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

  private Gender(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:hts.common.Gender)
}

