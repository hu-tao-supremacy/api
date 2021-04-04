// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/account/service.proto

package app.onepass.apis;

public interface CreateUserRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:hts.account.CreateUserRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string first_name = 1 [json_name = "firstName"];</code>
   * @return The firstName.
   */
  java.lang.String getFirstName();
  /**
   * <code>string first_name = 1 [json_name = "firstName"];</code>
   * @return The bytes for firstName.
   */
  com.google.protobuf.ByteString
      getFirstNameBytes();

  /**
   * <code>string last_name = 2 [json_name = "lastName"];</code>
   * @return The lastName.
   */
  java.lang.String getLastName();
  /**
   * <code>string last_name = 2 [json_name = "lastName"];</code>
   * @return The bytes for lastName.
   */
  com.google.protobuf.ByteString
      getLastNameBytes();

  /**
   * <code>string chula_id = 3 [json_name = "chulaId"];</code>
   * @return The chulaId.
   */
  java.lang.String getChulaId();
  /**
   * <code>string chula_id = 3 [json_name = "chulaId"];</code>
   * @return The bytes for chulaId.
   */
  com.google.protobuf.ByteString
      getChulaIdBytes();

  /**
   * <code>string email = 4 [json_name = "email"];</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <code>string email = 4 [json_name = "email"];</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <code>string is_chula_student = 5 [json_name = "isChulaStudent"];</code>
   * @return The isChulaStudent.
   */
  java.lang.String getIsChulaStudent();
  /**
   * <code>string is_chula_student = 5 [json_name = "isChulaStudent"];</code>
   * @return The bytes for isChulaStudent.
   */
  com.google.protobuf.ByteString
      getIsChulaStudentBytes();
}
