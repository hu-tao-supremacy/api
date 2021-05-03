// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/participant/service.proto

package app.onepass.apis;

public interface GetPastEventsFromTagsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:hts.participant.GetPastEventsFromTagsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated int32 tag_id = 1 [json_name = "tagId"];</code>
   * @return A list containing the tagId.
   */
  java.util.List<java.lang.Integer> getTagIdList();
  /**
   * <code>repeated int32 tag_id = 1 [json_name = "tagId"];</code>
   * @return The count of tagId.
   */
  int getTagIdCount();
  /**
   * <code>repeated int32 tag_id = 1 [json_name = "tagId"];</code>
   * @param index The index of the element to return.
   * @return The tagId at the given index.
   */
  int getTagId(int index);

  /**
   * <code>int32 number_of_events = 2 [json_name = "numberOfEvents"];</code>
   * @return The numberOfEvents.
   */
  int getNumberOfEvents();
}
