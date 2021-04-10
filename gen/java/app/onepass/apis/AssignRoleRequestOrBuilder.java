// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/account/service.proto

package app.onepass.apis;

public interface AssignRoleRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:hts.account.AssignRoleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  int getUserId();

  /**
   * <code>int32 organization_id = 2 [json_name = "organizationId"];</code>
   * @return The organizationId.
   */
  int getOrganizationId();

  /**
   * <code>.hts.account.Role role = 3 [json_name = "role"];</code>
   * @return The enum numeric value on the wire for role.
   */
  int getRoleValue();
  /**
   * <code>.hts.account.Role role = 3 [json_name = "role"];</code>
   * @return The role.
   */
  app.onepass.apis.Role getRole();
}
