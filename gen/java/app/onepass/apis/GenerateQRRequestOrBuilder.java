// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/participant/service.proto

package app.onepass.apis;

public interface GenerateQRRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:hts.participant.GenerateQRRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.hts.common.UserEvent user_event = 1 [json_name = "userEvent"];</code>
   * @return Whether the userEvent field is set.
   */
  boolean hasUserEvent();
  /**
   * <code>.hts.common.UserEvent user_event = 1 [json_name = "userEvent"];</code>
   * @return The userEvent.
   */
  app.onepass.apis.UserEvent getUserEvent();
  /**
   * <code>.hts.common.UserEvent user_event = 1 [json_name = "userEvent"];</code>
   */
  app.onepass.apis.UserEventOrBuilder getUserEventOrBuilder();
}