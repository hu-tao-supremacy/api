// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/organizer/service.proto

package app.onepass.apis;

public interface QuestionGroupListResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:hts.organizer.QuestionGroupListResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .hts.common.QuestionGroup question_groups = 1 [json_name = "questionGroups"];</code>
   */
  java.util.List<app.onepass.apis.QuestionGroup> 
      getQuestionGroupsList();
  /**
   * <code>repeated .hts.common.QuestionGroup question_groups = 1 [json_name = "questionGroups"];</code>
   */
  app.onepass.apis.QuestionGroup getQuestionGroups(int index);
  /**
   * <code>repeated .hts.common.QuestionGroup question_groups = 1 [json_name = "questionGroups"];</code>
   */
  int getQuestionGroupsCount();
  /**
   * <code>repeated .hts.common.QuestionGroup question_groups = 1 [json_name = "questionGroups"];</code>
   */
  java.util.List<? extends app.onepass.apis.QuestionGroupOrBuilder> 
      getQuestionGroupsOrBuilderList();
  /**
   * <code>repeated .hts.common.QuestionGroup question_groups = 1 [json_name = "questionGroups"];</code>
   */
  app.onepass.apis.QuestionGroupOrBuilder getQuestionGroupsOrBuilder(
      int index);
}
