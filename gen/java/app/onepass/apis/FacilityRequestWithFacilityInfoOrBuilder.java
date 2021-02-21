// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/facility/service.proto

package app.onepass.apis;

public interface FacilityRequestWithFacilityInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:hts.facility.FacilityRequestWithFacilityInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>int64 event_id = 2 [json_name = "eventId"];</code>
   * @return The eventId.
   */
  long getEventId();

  /**
   * <code>int64 facility_id = 3 [json_name = "facilityId"];</code>
   * @return The facilityId.
   */
  long getFacilityId();

  /**
   * <code>int64 organization_id = 4 [json_name = "organizationId"];</code>
   * @return The organizationId.
   */
  long getOrganizationId();

  /**
   * <code>.hts.common.Status status = 5 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.hts.common.Status status = 5 [json_name = "status"];</code>
   * @return The status.
   */
  app.onepass.apis.Status getStatus();

  /**
   * <code>.google.protobuf.StringValue reject_reason = 6 [json_name = "rejectReason"];</code>
   * @return Whether the rejectReason field is set.
   */
  boolean hasRejectReason();
  /**
   * <code>.google.protobuf.StringValue reject_reason = 6 [json_name = "rejectReason"];</code>
   * @return The rejectReason.
   */
  com.google.protobuf.StringValue getRejectReason();
  /**
   * <code>.google.protobuf.StringValue reject_reason = 6 [json_name = "rejectReason"];</code>
   */
  com.google.protobuf.StringValueOrBuilder getRejectReasonOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp start = 7 [json_name = "start"];</code>
   * @return Whether the start field is set.
   */
  boolean hasStart();
  /**
   * <code>.google.protobuf.Timestamp start = 7 [json_name = "start"];</code>
   * @return The start.
   */
  com.google.protobuf.Timestamp getStart();
  /**
   * <code>.google.protobuf.Timestamp start = 7 [json_name = "start"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp finish = 8 [json_name = "finish"];</code>
   * @return Whether the finish field is set.
   */
  boolean hasFinish();
  /**
   * <code>.google.protobuf.Timestamp finish = 8 [json_name = "finish"];</code>
   * @return The finish.
   */
  com.google.protobuf.Timestamp getFinish();
  /**
   * <code>.google.protobuf.Timestamp finish = 8 [json_name = "finish"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getFinishOrBuilder();

  /**
   * <code>string facility_name = 9 [json_name = "facilityName"];</code>
   * @return The facilityName.
   */
  java.lang.String getFacilityName();
  /**
   * <code>string facility_name = 9 [json_name = "facilityName"];</code>
   * @return The bytes for facilityName.
   */
  com.google.protobuf.ByteString
      getFacilityNameBytes();

  /**
   * <code>double latitude = 10 [json_name = "latitude"];</code>
   * @return The latitude.
   */
  double getLatitude();

  /**
   * <code>double longitude = 11 [json_name = "longitude"];</code>
   * @return The longitude.
   */
  double getLongitude();

  /**
   * <code>string operating_hours = 12 [json_name = "operatingHours"];</code>
   * @return The operatingHours.
   */
  java.lang.String getOperatingHours();
  /**
   * <code>string operating_hours = 12 [json_name = "operatingHours"];</code>
   * @return The bytes for operatingHours.
   */
  com.google.protobuf.ByteString
      getOperatingHoursBytes();

  /**
   * <code>string description = 13 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 13 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();
}
