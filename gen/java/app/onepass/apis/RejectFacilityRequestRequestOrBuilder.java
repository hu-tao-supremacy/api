// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/facility/service.proto

package app.onepass.apis;

public interface RejectFacilityRequestRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:hts.facility.RejectFacilityRequestRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 request_id = 1 [json_name = "requestId"];</code>
   * @return The requestId.
   */
  long getRequestId();

  /**
   * <code>string reason = 2 [json_name = "reason"];</code>
   * @return The reason.
   */
  java.lang.String getReason();
  /**
   * <code>string reason = 2 [json_name = "reason"];</code>
   * @return The bytes for reason.
   */
  com.google.protobuf.ByteString
      getReasonBytes();
}
