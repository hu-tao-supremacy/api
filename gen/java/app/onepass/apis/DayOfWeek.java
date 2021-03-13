// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/common/common.proto

package app.onepass.apis;

/**
 * Protobuf enum {@code hts.common.DayOfWeek}
 */
public enum DayOfWeek
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SUN = 0;</code>
   */
  SUN(0),
  /**
   * <code>MON = 1;</code>
   */
  MON(1),
  /**
   * <code>TUE = 2;</code>
   */
  TUE(2),
  /**
   * <code>WED = 3;</code>
   */
  WED(3),
  /**
   * <code>THU = 4;</code>
   */
  THU(4),
  /**
   * <code>FRI = 5;</code>
   */
  FRI(5),
  /**
   * <code>SAT = 6;</code>
   */
  SAT(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>SUN = 0;</code>
   */
  public static final int SUN_VALUE = 0;
  /**
   * <code>MON = 1;</code>
   */
  public static final int MON_VALUE = 1;
  /**
   * <code>TUE = 2;</code>
   */
  public static final int TUE_VALUE = 2;
  /**
   * <code>WED = 3;</code>
   */
  public static final int WED_VALUE = 3;
  /**
   * <code>THU = 4;</code>
   */
  public static final int THU_VALUE = 4;
  /**
   * <code>FRI = 5;</code>
   */
  public static final int FRI_VALUE = 5;
  /**
   * <code>SAT = 6;</code>
   */
  public static final int SAT_VALUE = 6;


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
      case 0: return SUN;
      case 1: return MON;
      case 2: return TUE;
      case 3: return WED;
      case 4: return THU;
      case 5: return FRI;
      case 6: return SAT;
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
