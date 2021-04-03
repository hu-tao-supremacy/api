// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/organizer/service.proto

package app.onepass.apis;

public interface CreateOrganizationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:hts.organizer.CreateOrganizationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  int getUserId();

  /**
   * <code>.hts.common.Organization organization = 2 [json_name = "organization"];</code>
   * @return Whether the organization field is set.
   */
  boolean hasOrganization();
  /**
   * <code>.hts.common.Organization organization = 2 [json_name = "organization"];</code>
   * @return The organization.
   */
  app.onepass.apis.Organization getOrganization();
  /**
   * <code>.hts.common.Organization organization = 2 [json_name = "organization"];</code>
   */
  app.onepass.apis.OrganizationOrBuilder getOrganizationOrBuilder();
}
