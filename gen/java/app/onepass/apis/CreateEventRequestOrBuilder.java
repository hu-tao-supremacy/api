// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/organizer/service.proto

package app.onepass.apis;

public interface CreateEventRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:hts.organizer.CreateEventRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  int getUserId();

  /**
   * <code>.hts.common.Event event = 2 [json_name = "event"];</code>
   * @return Whether the event field is set.
   */
  boolean hasEvent();
  /**
   * <code>.hts.common.Event event = 2 [json_name = "event"];</code>
   * @return The event.
   */
  app.onepass.apis.Event getEvent();
  /**
   * <code>.hts.common.Event event = 2 [json_name = "event"];</code>
   */
  app.onepass.apis.EventOrBuilder getEventOrBuilder();
}
