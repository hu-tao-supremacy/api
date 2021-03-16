// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/organizer/service.proto

package app.onepass.apis;

public interface UpdateUsersInOrganizationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:hts.organizer.UpdateUsersInOrganizationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  long getUserId();

  /**
   * <code>repeated int64 user_ids = 2 [json_name = "userIds", packed = true];</code>
   * @return A list containing the userIds.
   */
  java.util.List<java.lang.Long> getUserIdsList();
  /**
   * <code>repeated int64 user_ids = 2 [json_name = "userIds", packed = true];</code>
   * @return The count of userIds.
   */
  int getUserIdsCount();
  /**
   * <code>repeated int64 user_ids = 2 [json_name = "userIds", packed = true];</code>
   * @param index The index of the element to return.
   * @return The userIds at the given index.
   */
  long getUserIds(int index);

  /**
   * <code>int64 organization_id = 3 [json_name = "organizationId"];</code>
   * @return The organizationId.
   */
  long getOrganizationId();
}
