// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/participant/service.proto

package app.onepass.apis;

public interface GetAnswersByQuestionIdResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:hts.participant.GetAnswersByQuestionIdResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .hts.common.Answer answers = 1 [json_name = "answers"];</code>
   */
  java.util.List<app.onepass.apis.Answer> 
      getAnswersList();
  /**
   * <code>repeated .hts.common.Answer answers = 1 [json_name = "answers"];</code>
   */
  app.onepass.apis.Answer getAnswers(int index);
  /**
   * <code>repeated .hts.common.Answer answers = 1 [json_name = "answers"];</code>
   */
  int getAnswersCount();
  /**
   * <code>repeated .hts.common.Answer answers = 1 [json_name = "answers"];</code>
   */
  java.util.List<? extends app.onepass.apis.AnswerOrBuilder> 
      getAnswersOrBuilderList();
  /**
   * <code>repeated .hts.common.Answer answers = 1 [json_name = "answers"];</code>
   */
  app.onepass.apis.AnswerOrBuilder getAnswersOrBuilder(
      int index);
}
