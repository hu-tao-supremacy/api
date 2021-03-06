// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/organizer/service.proto

package app.onepass.apis;

public interface RemoveQuestionsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:hts.organizer.RemoveQuestionsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  int getUserId();

  /**
   * <code>repeated int32 question_ids = 2 [json_name = "questionIds"];</code>
   * @return A list containing the questionIds.
   */
  java.util.List<java.lang.Integer> getQuestionIdsList();
  /**
   * <code>repeated int32 question_ids = 2 [json_name = "questionIds"];</code>
   * @return The count of questionIds.
   */
  int getQuestionIdsCount();
  /**
   * <code>repeated int32 question_ids = 2 [json_name = "questionIds"];</code>
   * @param index The index of the element to return.
   * @return The questionIds at the given index.
   */
  int getQuestionIds(int index);
}
