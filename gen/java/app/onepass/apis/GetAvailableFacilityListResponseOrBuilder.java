// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/facility/service.proto

package app.onepass.apis;

public interface GetAvailableFacilityListResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:hts.facility.GetAvailableFacilityListResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .hts.facility.Facility facilities = 1 [json_name = "facilities"];</code>
   */
  java.util.List<app.onepass.apis.Facility> 
      getFacilitiesList();
  /**
   * <code>repeated .hts.facility.Facility facilities = 1 [json_name = "facilities"];</code>
   */
  app.onepass.apis.Facility getFacilities(int index);
  /**
   * <code>repeated .hts.facility.Facility facilities = 1 [json_name = "facilities"];</code>
   */
  int getFacilitiesCount();
  /**
   * <code>repeated .hts.facility.Facility facilities = 1 [json_name = "facilities"];</code>
   */
  java.util.List<? extends app.onepass.apis.FacilityOrBuilder> 
      getFacilitiesOrBuilderList();
  /**
   * <code>repeated .hts.facility.Facility facilities = 1 [json_name = "facilities"];</code>
   */
  app.onepass.apis.FacilityOrBuilder getFacilitiesOrBuilder(
      int index);
}