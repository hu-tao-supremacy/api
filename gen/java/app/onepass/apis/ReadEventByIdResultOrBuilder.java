// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/organizer/service.proto

package app.onepass.apis;

public interface ReadEventByIdResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:hts.organizer.ReadEventByIdResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.hts.common.Event event = 1 [json_name = "event"];</code>
   * @return Whether the event field is set.
   */
  boolean hasEvent();
  /**
   * <code>.hts.common.Event event = 1 [json_name = "event"];</code>
   * @return The event.
   */
  app.onepass.apis.Event getEvent();
  /**
   * <code>.hts.common.Event event = 1 [json_name = "event"];</code>
   */
  app.onepass.apis.EventOrBuilder getEventOrBuilder();
}
