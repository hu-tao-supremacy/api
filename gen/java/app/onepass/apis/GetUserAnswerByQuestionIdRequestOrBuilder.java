// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/participant/service.proto

package app.onepass.apis;

public interface GetUserAnswerByQuestionIdRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:hts.participant.GetUserAnswerByQuestionIdRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  int getUserId();

  /**
   * <code>int32 question_id = 2 [json_name = "questionId"];</code>
   * @return The questionId.
   */
  int getQuestionId();
}
