// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/participant/service.proto

package app.onepass.apis;

public interface TagsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:hts.participant.TagsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .hts.common.Tag tags = 1 [json_name = "tags"];</code>
   */
  java.util.List<app.onepass.apis.Tag> 
      getTagsList();
  /**
   * <code>repeated .hts.common.Tag tags = 1 [json_name = "tags"];</code>
   */
  app.onepass.apis.Tag getTags(int index);
  /**
   * <code>repeated .hts.common.Tag tags = 1 [json_name = "tags"];</code>
   */
  int getTagsCount();
  /**
   * <code>repeated .hts.common.Tag tags = 1 [json_name = "tags"];</code>
   */
  java.util.List<? extends app.onepass.apis.TagOrBuilder> 
      getTagsOrBuilderList();
  /**
   * <code>repeated .hts.common.Tag tags = 1 [json_name = "tags"];</code>
   */
  app.onepass.apis.TagOrBuilder getTagsOrBuilder(
      int index);
}
