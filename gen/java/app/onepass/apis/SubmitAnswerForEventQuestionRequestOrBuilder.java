// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/participant/service.proto

package app.onepass.apis;

public interface SubmitAnswerForEventQuestionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:hts.participant.SubmitAnswerForEventQuestionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .hts.participant.SubmitAnswerForEventQuestionRequest.Answer answers = 1 [json_name = "answers"];</code>
   */
  java.util.List<app.onepass.apis.SubmitAnswerForEventQuestionRequest.Answer> 
      getAnswersList();
  /**
   * <code>repeated .hts.participant.SubmitAnswerForEventQuestionRequest.Answer answers = 1 [json_name = "answers"];</code>
   */
  app.onepass.apis.SubmitAnswerForEventQuestionRequest.Answer getAnswers(int index);
  /**
   * <code>repeated .hts.participant.SubmitAnswerForEventQuestionRequest.Answer answers = 1 [json_name = "answers"];</code>
   */
  int getAnswersCount();
  /**
   * <code>repeated .hts.participant.SubmitAnswerForEventQuestionRequest.Answer answers = 1 [json_name = "answers"];</code>
   */
  java.util.List<? extends app.onepass.apis.SubmitAnswerForEventQuestionRequest.AnswerOrBuilder> 
      getAnswersOrBuilderList();
  /**
   * <code>repeated .hts.participant.SubmitAnswerForEventQuestionRequest.Answer answers = 1 [json_name = "answers"];</code>
   */
  app.onepass.apis.SubmitAnswerForEventQuestionRequest.AnswerOrBuilder getAnswersOrBuilder(
      int index);

  /**
   * <code>int32 user_event_id = 2 [json_name = "userEventId"];</code>
   * @return The userEventId.
   */
  int getUserEventId();

  /**
   * <code>.hts.common.QuestionGroupType type = 3 [json_name = "type"];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.hts.common.QuestionGroupType type = 3 [json_name = "type"];</code>
   * @return The type.
   */
  app.onepass.apis.QuestionGroupType getType();
}