// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/common/common.proto

package app.onepass.apis;

public interface EventTagOrBuilder extends
    // @@protoc_insertion_point(interface_extends:hts.common.EventTag)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>int64 event_id = 2 [json_name = "eventId"];</code>
   * @return The eventId.
   */
  long getEventId();

  /**
   * <code>int64 tag_id = 3 [json_name = "tagId"];</code>
   * @return The tagId.
   */
  long getTagId();
}