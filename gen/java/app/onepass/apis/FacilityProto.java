// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/facility/service.proto

package app.onepass.apis;

public final class FacilityProto {
  private FacilityProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_facility_FacilityRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_facility_FacilityRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_facility_Facility_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_facility_Facility_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_facility_FacilityRequestWithFacilityInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_facility_FacilityRequestWithFacilityInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_facility_GetFacilityListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_facility_GetFacilityListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_facility_GetFacilityListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_facility_GetFacilityListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_facility_GetFacilityRequestListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_facility_GetFacilityRequestListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_facility_GetFacilityRequestListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_facility_GetFacilityRequestListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_facility_GetFacilityRequestsStatusRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_facility_GetFacilityRequestsStatusRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_facility_GetFacilityRequestsStatusResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_facility_GetFacilityRequestsStatusResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_facility_GetAvailableFacilityListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_facility_GetAvailableFacilityListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_facility_GetAvailableTimeOfFacilityRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_facility_GetAvailableTimeOfFacilityRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_facility_GetAvailableTimeOfFacilityResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_facility_GetAvailableTimeOfFacilityResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_facility_GetAvailableTimeOfFacilityResponse_Day_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_facility_GetAvailableTimeOfFacilityResponse_Day_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_facility_RequestFacilityRequestRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_facility_RequestFacilityRequestRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_facility_ApproveFacilityRequestRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_facility_ApproveFacilityRequestRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_facility_RejectFacilityRequestRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_facility_RejectFacilityRequestRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_facility_GetFacilityInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_facility_GetFacilityInfoRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032hts/facility/service.proto\022\014hts.facili" +
      "ty\032\027hts/common/common.proto\032\033google/prot" +
      "obuf/empty.proto\032\037google/protobuf/timest" +
      "amp.proto\"\211\002\n\017FacilityRequest\022\016\n\002id\030\001 \001(" +
      "\003R\002id\022\031\n\010event_id\030\002 \001(\003R\007eventId\022\037\n\013faci" +
      "lity_id\030\003 \001(\003R\nfacilityId\022\037\n\013is_approved" +
      "\030\004 \001(\003R\nisApproved\022#\n\rreject_reason\030\005 \001(" +
      "\003R\014rejectReason\0220\n\005start\030\006 \001(\0132\032.google." +
      "protobuf.TimestampR\005start\0222\n\006finish\030\007 \001(" +
      "\0132\032.google.protobuf.TimestampR\006finish\"\334\001" +
      "\n\010Facility\022\016\n\002id\030\001 \001(\003R\002id\022\'\n\017organizati" +
      "on_id\030\002 \001(\003R\016organizationId\022\022\n\004name\030\003 \001(" +
      "\tR\004name\022\032\n\010latitude\030\004 \001(\003R\010latitude\022\034\n\tl" +
      "ongitude\030\005 \001(\003R\tlongitude\022\'\n\017operating_h" +
      "ours\030\006 \001(\tR\016operatingHours\022 \n\013descriptio" +
      "n\030\007 \001(\tR\013description\"\354\003\n\037FacilityRequest" +
      "WithFacilityInfo\022\016\n\002id\030\001 \001(\003R\002id\022\031\n\010even" +
      "t_id\030\002 \001(\003R\007eventId\022\037\n\013facility_id\030\003 \001(\003" +
      "R\nfacilityId\022\'\n\017organization_id\030\004 \001(\003R\016o" +
      "rganizationId\022\037\n\013is_approved\030\005 \001(\003R\nisAp" +
      "proved\022#\n\rreject_reason\030\006 \001(\003R\014rejectRea" +
      "son\0220\n\005start\030\007 \001(\0132\032.google.protobuf.Tim" +
      "estampR\005start\0222\n\006finish\030\010 \001(\0132\032.google.p" +
      "rotobuf.TimestampR\006finish\022#\n\rfacility_na" +
      "me\030\t \001(\tR\014facilityName\022\032\n\010latitude\030\n \001(\003" +
      "R\010latitude\022\034\n\tlongitude\030\013 \001(\003R\tlongitude" +
      "\022\'\n\017operating_hours\030\014 \001(\tR\016operatingHour" +
      "s\022 \n\013description\030\r \001(\tR\013description\"A\n\026G" +
      "etFacilityListRequest\022\'\n\017organization_id" +
      "\030\001 \001(\003R\016organizationId\"Q\n\027GetFacilityLis" +
      "tResponse\0226\n\nfacilities\030\001 \003(\0132\026.hts.faci" +
      "lity.FacilityR\nfacilities\"H\n\035GetFacility" +
      "RequestListRequest\022\'\n\017organization_id\030\001 " +
      "\001(\003R\016organizationId\"[\n\036GetFacilityReques" +
      "tListResponse\0229\n\010requests\030\001 \003(\0132\035.hts.fa" +
      "cility.FacilityRequestR\010requests\"=\n GetF" +
      "acilityRequestsStatusRequest\022\031\n\010event_id" +
      "\030\001 \001(\003R\007eventId\"n\n!GetFacilityRequestsSt" +
      "atusResponse\022I\n\010requests\030\001 \003(\0132-.hts.fac" +
      "ility.FacilityRequestWithFacilityInfoR\010r" +
      "equests\"Z\n GetAvailableFacilityListRespo" +
      "nse\0226\n\nfacilities\030\001 \003(\0132\026.hts.facility.F" +
      "acilityR\nfacilities\"\244\001\n!GetAvailableTime" +
      "OfFacilityRequest\022\037\n\013facility_id\030\001 \001(\003R\n" +
      "facilityId\0220\n\005start\030\002 \001(\0132\032.google.proto" +
      "buf.TimestampR\005start\022,\n\003end\030\003 \001(\0132\032.goog" +
      "le.protobuf.TimestampR\003end\"\215\001\n\"GetAvaila" +
      "bleTimeOfFacilityResponse\022F\n\003day\030\001 \003(\01324" +
      ".hts.facility.GetAvailableTimeOfFacility" +
      "Response.DayR\003day\032\037\n\003Day\022\030\n\005items\030\001 \003(\010B" +
      "\002\020\001R\005items\"\273\001\n\035RequestFacilityRequestReq" +
      "uest\022\031\n\010event_id\030\001 \001(\003R\007eventId\022\037\n\013facil" +
      "ity_id\030\002 \001(\003R\nfacilityId\0220\n\005start\030\003 \001(\0132" +
      "\032.google.protobuf.TimestampR\005start\022,\n\003en" +
      "d\030\004 \001(\0132\032.google.protobuf.TimestampR\003end" +
      "\">\n\035ApproveFacilityRequestRequest\022\035\n\nreq" +
      "uest_id\030\001 \001(\003R\trequestId\"U\n\034RejectFacili" +
      "tyRequestRequest\022\035\n\nrequest_id\030\001 \001(\003R\tre" +
      "questId\022\026\n\006reason\030\002 \001(\tR\006reason\"9\n\026GetFa" +
      "cilityInfoRequest\022\037\n\013facility_id\030\001 \001(\003R\n" +
      "facilityId2\264\007\n\017FacilityService\022^\n\017GetFac" +
      "ilityList\022$.hts.facility.GetFacilityList" +
      "Request\032%.hts.facility.GetFacilityListRe" +
      "sponse\022s\n\026GetFacilityRequestList\022+.hts.f" +
      "acility.GetFacilityRequestListRequest\032,." +
      "hts.facility.GetFacilityRequestListRespo" +
      "nse\022|\n\031GetFacilityRequestsStatus\022..hts.f" +
      "acility.GetFacilityRequestsStatusRequest" +
      "\032/.hts.facility.GetFacilityRequestsStatu" +
      "sResponse\022b\n\030GetAvailableFacilityList\022\026." +
      "google.protobuf.Empty\032..hts.facility.Get" +
      "AvailableFacilityListResponse\022\177\n\032GetAvai" +
      "lableTimeOfFacility\022/.hts.facility.GetAv" +
      "ailableTimeOfFacilityRequest\0320.hts.facil" +
      "ity.GetAvailableTimeOfFacilityResponse\022d" +
      "\n\026RequestFacilityRequest\022+.hts.facility." +
      "RequestFacilityRequestRequest\032\035.hts.faci" +
      "lity.FacilityRequest\022Y\n\026ApproveFacilityR" +
      "equest\022+.hts.facility.ApproveFacilityReq" +
      "uestRequest\032\022.hts.common.Result\022W\n\025Rejec" +
      "tFacilityRequest\022*.hts.facility.RejectFa" +
      "cilityRequestRequest\032\022.hts.common.Result" +
      "\022O\n\017GetFacilityInfo\022$.hts.facility.GetFa" +
      "cilityInfoRequest\032\026.hts.facility.Facilit" +
      "yBF\n\020app.onepass.apisB\rFacilityProtoP\001Z!" +
      "onepass.app/facility/hts/facilityb\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          app.onepass.apis.CommonProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_hts_facility_FacilityRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hts_facility_FacilityRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_facility_FacilityRequest_descriptor,
        new java.lang.String[] { "Id", "EventId", "FacilityId", "IsApproved", "RejectReason", "Start", "Finish", });
    internal_static_hts_facility_Facility_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_hts_facility_Facility_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_facility_Facility_descriptor,
        new java.lang.String[] { "Id", "OrganizationId", "Name", "Latitude", "Longitude", "OperatingHours", "Description", });
    internal_static_hts_facility_FacilityRequestWithFacilityInfo_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_hts_facility_FacilityRequestWithFacilityInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_facility_FacilityRequestWithFacilityInfo_descriptor,
        new java.lang.String[] { "Id", "EventId", "FacilityId", "OrganizationId", "IsApproved", "RejectReason", "Start", "Finish", "FacilityName", "Latitude", "Longitude", "OperatingHours", "Description", });
    internal_static_hts_facility_GetFacilityListRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_hts_facility_GetFacilityListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_facility_GetFacilityListRequest_descriptor,
        new java.lang.String[] { "OrganizationId", });
    internal_static_hts_facility_GetFacilityListResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_hts_facility_GetFacilityListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_facility_GetFacilityListResponse_descriptor,
        new java.lang.String[] { "Facilities", });
    internal_static_hts_facility_GetFacilityRequestListRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_hts_facility_GetFacilityRequestListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_facility_GetFacilityRequestListRequest_descriptor,
        new java.lang.String[] { "OrganizationId", });
    internal_static_hts_facility_GetFacilityRequestListResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_hts_facility_GetFacilityRequestListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_facility_GetFacilityRequestListResponse_descriptor,
        new java.lang.String[] { "Requests", });
    internal_static_hts_facility_GetFacilityRequestsStatusRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_hts_facility_GetFacilityRequestsStatusRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_facility_GetFacilityRequestsStatusRequest_descriptor,
        new java.lang.String[] { "EventId", });
    internal_static_hts_facility_GetFacilityRequestsStatusResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_hts_facility_GetFacilityRequestsStatusResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_facility_GetFacilityRequestsStatusResponse_descriptor,
        new java.lang.String[] { "Requests", });
    internal_static_hts_facility_GetAvailableFacilityListResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_hts_facility_GetAvailableFacilityListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_facility_GetAvailableFacilityListResponse_descriptor,
        new java.lang.String[] { "Facilities", });
    internal_static_hts_facility_GetAvailableTimeOfFacilityRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_hts_facility_GetAvailableTimeOfFacilityRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_facility_GetAvailableTimeOfFacilityRequest_descriptor,
        new java.lang.String[] { "FacilityId", "Start", "End", });
    internal_static_hts_facility_GetAvailableTimeOfFacilityResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_hts_facility_GetAvailableTimeOfFacilityResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_facility_GetAvailableTimeOfFacilityResponse_descriptor,
        new java.lang.String[] { "Day", });
    internal_static_hts_facility_GetAvailableTimeOfFacilityResponse_Day_descriptor =
      internal_static_hts_facility_GetAvailableTimeOfFacilityResponse_descriptor.getNestedTypes().get(0);
    internal_static_hts_facility_GetAvailableTimeOfFacilityResponse_Day_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_facility_GetAvailableTimeOfFacilityResponse_Day_descriptor,
        new java.lang.String[] { "Items", });
    internal_static_hts_facility_RequestFacilityRequestRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_hts_facility_RequestFacilityRequestRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_facility_RequestFacilityRequestRequest_descriptor,
        new java.lang.String[] { "EventId", "FacilityId", "Start", "End", });
    internal_static_hts_facility_ApproveFacilityRequestRequest_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_hts_facility_ApproveFacilityRequestRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_facility_ApproveFacilityRequestRequest_descriptor,
        new java.lang.String[] { "RequestId", });
    internal_static_hts_facility_RejectFacilityRequestRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_hts_facility_RejectFacilityRequestRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_facility_RejectFacilityRequestRequest_descriptor,
        new java.lang.String[] { "RequestId", "Reason", });
    internal_static_hts_facility_GetFacilityInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_hts_facility_GetFacilityInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_facility_GetFacilityInfoRequest_descriptor,
        new java.lang.String[] { "FacilityId", });
    app.onepass.apis.CommonProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
