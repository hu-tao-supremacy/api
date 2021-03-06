// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/common/common.proto

package app.onepass.apis;

/**
 * Protobuf enum {@code hts.common.DayOfWeek}
 */
public enum DayOfWeek
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>DAY_OF_WEEK_UNSPECIFIED = 0;</code>
   */
  DAY_OF_WEEK_UNSPECIFIED(0),
  /**
   * <code>SUN = 1;</code>
   */
  SUN(1),
  /**
   * <code>MON = 2;</code>
   */
  MON(2),
  /**
   * <code>TUE = 3;</code>
   */
  TUE(3),
  /**
   * <code>WED = 4;</code>
   */
  WED(4),
  /**
   * <code>THU = 5;</code>
   */
  THU(5),
  /**
   * <code>FRI = 6;</code>
   */
  FRI(6),
  /**
   * <code>SAT = 7;</code>
   */
  SAT(7),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>DAY_OF_WEEK_UNSPECIFIED = 0;</code>
   */
  public static final int DAY_OF_WEEK_UNSPECIFIED_VALUE = 0;
  /**
   * <code>SUN = 1;</code>
   */
  public static final int SUN_VALUE = 1;
  /**
   * <code>MON = 2;</code>
   */
  public static final int MON_VALUE = 2;
  /**
   * <code>TUE = 3;</code>
   */
  public static final int TUE_VALUE = 3;
  /**
   * <code>WED = 4;</code>
   */
  public static final int WED_VALUE = 4;
  /**
   * <code>THU = 5;</code>
   */
  public static final int THU_VALUE = 5;
  /**
   * <code>FRI = 6;</code>
   */
  public static final int FRI_VALUE = 6;
  /**
   * <code>SAT = 7;</code>
   */
  public static final int SAT_VALUE = 7;


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
  public static DayOfWeek valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DayOfWeek forNumber(int value) {
    switch (value) {
      case 0: return DAY_OF_WEEK_UNSPECIFIED;
      case 1: return SUN;
      case 2: return MON;
      case 3: return TUE;
      case 4: return WED;
      case 5: return THU;
      case 6: return FRI;
      case 7: return SAT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DayOfWeek>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DayOfWeek> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DayOfWeek>() {
          public DayOfWeek findValueByNumber(int number) {
            return DayOfWeek.forNumber(number);
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
    return app.onepass.apis.CommonProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final DayOfWeek[] VALUES = values();

  public static DayOfWeek valueOf(
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

  private DayOfWeek(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:hts.common.DayOfWeek)
}

