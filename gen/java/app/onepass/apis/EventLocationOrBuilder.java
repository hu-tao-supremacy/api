// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/common/common.proto

package app.onepass.apis;

public interface EventLocationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:hts.common.EventLocation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>double latitude = 3 [json_name = "latitude"];</code>
   * @return The latitude.
   */
  double getLatitude();

  /**
   * <code>double longitude = 4 [json_name = "longitude"];</code>
   * @return The longitude.
   */
  double getLongitude();
}
