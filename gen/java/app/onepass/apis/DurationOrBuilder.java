// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/organizer/service.proto

package app.onepass.apis;

public interface DurationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:hts.facility.Duration)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.protobuf.Timestamp start = 1 [json_name = "start"];</code>
   * @return Whether the start field is set.
   */
  boolean hasStart();
  /**
   * <code>.google.protobuf.Timestamp start = 1 [json_name = "start"];</code>
   * @return The start.
   */
  com.google.protobuf.Timestamp getStart();
  /**
   * <code>.google.protobuf.Timestamp start = 1 [json_name = "start"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp finish = 2 [json_name = "finish"];</code>
   * @return Whether the finish field is set.
   */
  boolean hasFinish();
  /**
   * <code>.google.protobuf.Timestamp finish = 2 [json_name = "finish"];</code>
   * @return The finish.
   */
  com.google.protobuf.Timestamp getFinish();
  /**
   * <code>.google.protobuf.Timestamp finish = 2 [json_name = "finish"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getFinishOrBuilder();
}
