// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/facility/service.proto

package app.onepass.apis;

public interface RejectFacilityRequestRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:hts.facility.RejectFacilityRequestRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  long getUserId();

  /**
   * <code>int64 organization_id = 2 [json_name = "organizationId"];</code>
   * @return The organizationId.
   */
  long getOrganizationId();

  /**
   * <code>int64 request_id = 3 [json_name = "requestId"];</code>
   * @return The requestId.
   */
  long getRequestId();

  /**
   * <code>.google.protobuf.StringValue reason = 4 [json_name = "reason"];</code>
   * @return Whether the reason field is set.
   */
  boolean hasReason();
  /**
   * <code>.google.protobuf.StringValue reason = 4 [json_name = "reason"];</code>
   * @return The reason.
   */
  com.google.protobuf.StringValue getReason();
  /**
   * <code>.google.protobuf.StringValue reason = 4 [json_name = "reason"];</code>
   */
  com.google.protobuf.StringValueOrBuilder getReasonOrBuilder();
}
