// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/organizer/service.proto

package app.onepass.apis;

public interface GetQuestionsByGroupIdResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:hts.organizer.GetQuestionsByGroupIdResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.hts.common.Question question = 1 [json_name = "question"];</code>
   * @return Whether the question field is set.
   */
  boolean hasQuestion();
  /**
   * <code>.hts.common.Question question = 1 [json_name = "question"];</code>
   * @return The question.
   */
  app.onepass.apis.Question getQuestion();
  /**
   * <code>.hts.common.Question question = 1 [json_name = "question"];</code>
   */
  app.onepass.apis.QuestionOrBuilder getQuestionOrBuilder();
}