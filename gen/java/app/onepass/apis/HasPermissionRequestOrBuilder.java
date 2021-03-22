// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/account/service.proto

package app.onepass.apis;

public interface HasPermissionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:hts.account.HasPermissionRequest)
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
   * <code>.hts.common.Permission permission_name = 3 [json_name = "permissionName"];</code>
   * @return The enum numeric value on the wire for permissionName.
   */
  int getPermissionNameValue();
  /**
   * <code>.hts.common.Permission permission_name = 3 [json_name = "permissionName"];</code>
   * @return The permissionName.
   */
  app.onepass.apis.Permission getPermissionName();
}