// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/participant/service.proto

package app.onepass.apis;

public interface SubmitAnswerForPostEventQuestionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:hts.participant.SubmitAnswerForPostEventQuestionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .hts.participant.SubmitAnswerForPostEventQuestionRequest.Answer answers = 1 [json_name = "answers"];</code>
   */
  java.util.List<app.onepass.apis.SubmitAnswerForPostEventQuestionRequest.Answer> 
      getAnswersList();
  /**
   * <code>repeated .hts.participant.SubmitAnswerForPostEventQuestionRequest.Answer answers = 1 [json_name = "answers"];</code>
   */
  app.onepass.apis.SubmitAnswerForPostEventQuestionRequest.Answer getAnswers(int index);
  /**
   * <code>repeated .hts.participant.SubmitAnswerForPostEventQuestionRequest.Answer answers = 1 [json_name = "answers"];</code>
   */
  int getAnswersCount();
  /**
   * <code>repeated .hts.participant.SubmitAnswerForPostEventQuestionRequest.Answer answers = 1 [json_name = "answers"];</code>
   */
  java.util.List<? extends app.onepass.apis.SubmitAnswerForPostEventQuestionRequest.AnswerOrBuilder> 
      getAnswersOrBuilderList();
  /**
   * <code>repeated .hts.participant.SubmitAnswerForPostEventQuestionRequest.Answer answers = 1 [json_name = "answers"];</code>
   */
  app.onepass.apis.SubmitAnswerForPostEventQuestionRequest.AnswerOrBuilder getAnswersOrBuilder(
      int index);

  /**
   * <code>int32 user_event_id = 2 [json_name = "userEventId"];</code>
   * @return The userEventId.
   */
  int getUserEventId();
}
