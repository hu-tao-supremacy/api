// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/organizer/service.proto

package app.onepass.apis;

public interface UpdateRegistrationRequestReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:hts.facility.UpdateRegistrationRequestReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  long getUserId();

  /**
   * <code>int64 registered_user_id = 2 [json_name = "registeredUserId"];</code>
   * @return The registeredUserId.
   */
  long getRegisteredUserId();

  /**
   * <code>int64 registered_event_id = 3 [json_name = "registeredEventId"];</code>
   * @return The registeredEventId.
   */
  long getRegisteredEventId();

  /**
   * <code>.hts.common.Status status = 4 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.hts.common.Status status = 4 [json_name = "status"];</code>
   * @return The status.
   */
  app.onepass.apis.Status getStatus();
}
