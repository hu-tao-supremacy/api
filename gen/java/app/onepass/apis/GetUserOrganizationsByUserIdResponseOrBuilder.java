// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/account/service.proto

package app.onepass.apis;

public interface GetUserOrganizationsByUserIdResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:hts.account.GetUserOrganizationsByUserIdResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .hts.common.UserOrganization user_organizations = 1 [json_name = "userOrganizations"];</code>
   */
  java.util.List<app.onepass.apis.UserOrganization> 
      getUserOrganizationsList();
  /**
   * <code>repeated .hts.common.UserOrganization user_organizations = 1 [json_name = "userOrganizations"];</code>
   */
  app.onepass.apis.UserOrganization getUserOrganizations(int index);
  /**
   * <code>repeated .hts.common.UserOrganization user_organizations = 1 [json_name = "userOrganizations"];</code>
   */
  int getUserOrganizationsCount();
  /**
   * <code>repeated .hts.common.UserOrganization user_organizations = 1 [json_name = "userOrganizations"];</code>
   */
  java.util.List<? extends app.onepass.apis.UserOrganizationOrBuilder> 
      getUserOrganizationsOrBuilderList();
  /**
   * <code>repeated .hts.common.UserOrganization user_organizations = 1 [json_name = "userOrganizations"];</code>
   */
  app.onepass.apis.UserOrganizationOrBuilder getUserOrganizationsOrBuilder(
      int index);
}
