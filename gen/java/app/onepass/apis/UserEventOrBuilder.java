// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/common/common.proto

package app.onepass.apis;

public interface UserEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:hts.common.UserEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>int64 user_id = 2 [json_name = "userId"];</code>
   * @return The userId.
   */
  long getUserId();

  /**
   * <code>int64 event_id = 3 [json_name = "eventId"];</code>
   * @return The eventId.
   */
  long getEventId();
}