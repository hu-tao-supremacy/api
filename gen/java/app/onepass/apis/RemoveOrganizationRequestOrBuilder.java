// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/organizer/service.proto

package app.onepass.apis;

public interface RemoveOrganizationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:hts.organizer.RemoveOrganizationRequest)
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
}