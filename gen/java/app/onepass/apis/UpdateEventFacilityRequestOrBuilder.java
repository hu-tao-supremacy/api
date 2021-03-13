// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/organizer/service.proto

package app.onepass.apis;

public interface UpdateEventFacilityRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:hts.organizer.UpdateEventFacilityRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  long getUserId();

  /**
   * <code>.hts.common.Facility facility = 2 [json_name = "facility"];</code>
   * @return Whether the facility field is set.
   */
  boolean hasFacility();
  /**
   * <code>.hts.common.Facility facility = 2 [json_name = "facility"];</code>
   * @return The facility.
   */
  app.onepass.apis.Facility getFacility();
  /**
   * <code>.hts.common.Facility facility = 2 [json_name = "facility"];</code>
   */
  app.onepass.apis.FacilityOrBuilder getFacilityOrBuilder();
}