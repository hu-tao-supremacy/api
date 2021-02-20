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
    internal_static_hts_facility_CreateFacilityRequestRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_facility_CreateFacilityRequestRequest_fieldAccessorTable;
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
      "amp.proto\032\036google/protobuf/wrappers.prot" +
      "o\"\225\004\n\037FacilityRequestWithFacilityInfo\022\016\n" +
      "\002id\030\001 \001(\003R\002id\022\031\n\010event_id\030\002 \001(\003R\007eventId" +
      "\022\037\n\013facility_id\030\003 \001(\003R\nfacilityId\022\'\n\017org" +
      "anization_id\030\004 \001(\003R\016organizationId\022*\n\006st" +
      "atus\030\005 \001(\0162\022.hts.common.StatusR\006status\022A" +
      "\n\rreject_reason\030\006 \001(\0132\034.google.protobuf." +
      "StringValueR\014rejectReason\0220\n\005start\030\007 \001(\013" +
      "2\032.google.protobuf.TimestampR\005start\0222\n\006f" +
      "inish\030\010 \001(\0132\032.google.protobuf.TimestampR" +
      "\006finish\022#\n\rfacility_name\030\t \001(\tR\014facility" +
      "Name\022\032\n\010latitude\030\n \001(\003R\010latitude\022\034\n\tlong" +
      "itude\030\013 \001(\003R\tlongitude\022\'\n\017operating_hour" +
      "s\030\014 \001(\tR\016operatingHours\022 \n\013description\030\r" +
      " \001(\tR\013description\"A\n\026GetFacilityListRequ" +
      "est\022\'\n\017organization_id\030\001 \001(\003R\016organizati" +
      "onId\"O\n\027GetFacilityListResponse\0224\n\nfacil" +
      "ities\030\001 \003(\0132\024.hts.common.FacilityR\nfacil" +
      "ities\"H\n\035GetFacilityRequestListRequest\022\'" +
      "\n\017organization_id\030\001 \001(\003R\016organizationId\"" +
      "k\n\036GetFacilityRequestListResponse\022I\n\010req" +
      "uests\030\001 \003(\0132-.hts.facility.FacilityReque" +
      "stWithFacilityInfoR\010requests\"=\n GetFacil" +
      "ityRequestsStatusRequest\022\031\n\010event_id\030\001 \001" +
      "(\003R\007eventId\"n\n!GetFacilityRequestsStatus" +
      "Response\022I\n\010requests\030\001 \003(\0132-.hts.facilit" +
      "y.FacilityRequestWithFacilityInfoR\010reque" +
      "sts\"X\n GetAvailableFacilityListResponse\022" +
      "4\n\nfacilities\030\001 \003(\0132\024.hts.common.Facilit" +
      "yR\nfacilities\"\244\001\n!GetAvailableTimeOfFaci" +
      "lityRequest\022\037\n\013facility_id\030\001 \001(\003R\nfacili" +
      "tyId\0220\n\005start\030\002 \001(\0132\032.google.protobuf.Ti" +
      "mestampR\005start\022,\n\003end\030\003 \001(\0132\032.google.pro" +
      "tobuf.TimestampR\003end\"\215\001\n\"GetAvailableTim" +
      "eOfFacilityResponse\022F\n\003day\030\001 \003(\01324.hts.f" +
      "acility.GetAvailableTimeOfFacilityRespon" +
      "se.DayR\003day\032\037\n\003Day\022\030\n\005items\030\001 \003(\010B\002\020\001R\005i" +
      "tems\"\374\001\n\034CreateFacilityRequestRequest\022\027\n" +
      "\007user_id\030\001 \001(\003R\006userId\022\'\n\017organization_i" +
      "d\030\002 \001(\003R\016organizationId\022\031\n\010event_id\030\003 \001(" +
      "\003R\007eventId\022\037\n\013facility_id\030\004 \001(\003R\nfacilit" +
      "yId\0220\n\005start\030\005 \001(\0132\032.google.protobuf.Tim" +
      "estampR\005start\022,\n\003end\030\006 \001(\0132\032.google.prot" +
      "obuf.TimestampR\003end\"\200\001\n\035ApproveFacilityR" +
      "equestRequest\022\027\n\007user_id\030\001 \001(\003R\006userId\022\'" +
      "\n\017organization_id\030\002 \001(\003R\016organizationId\022" +
      "\035\n\nrequest_id\030\003 \001(\003R\trequestId\"\265\001\n\034Rejec" +
      "tFacilityRequestRequest\022\027\n\007user_id\030\001 \001(\003" +
      "R\006userId\022\'\n\017organization_id\030\002 \001(\003R\016organ" +
      "izationId\022\035\n\nrequest_id\030\003 \001(\003R\trequestId" +
      "\0224\n\006reason\030\004 \001(\0132\034.google.protobuf.Strin" +
      "gValueR\006reason\"9\n\026GetFacilityInfoRequest" +
      "\022\037\n\013facility_id\030\001 \001(\003R\nfacilityId2\256\007\n\017Fa" +
      "cilityService\022^\n\017GetFacilityList\022$.hts.f" +
      "acility.GetFacilityListRequest\032%.hts.fac" +
      "ility.GetFacilityListResponse\022s\n\026GetFaci" +
      "lityRequestList\022+.hts.facility.GetFacili" +
      "tyRequestListRequest\032,.hts.facility.GetF" +
      "acilityRequestListResponse\022|\n\031GetFacilit" +
      "yRequestsStatus\022..hts.facility.GetFacili" +
      "tyRequestsStatusRequest\032/.hts.facility.G" +
      "etFacilityRequestsStatusResponse\022b\n\030GetA" +
      "vailableFacilityList\022\026.google.protobuf.E" +
      "mpty\032..hts.facility.GetAvailableFacility" +
      "ListResponse\022\177\n\032GetAvailableTimeOfFacili" +
      "ty\022/.hts.facility.GetAvailableTimeOfFaci" +
      "lityRequest\0320.hts.facility.GetAvailableT" +
      "imeOfFacilityResponse\022`\n\025CreateFacilityR" +
      "equest\022*.hts.facility.CreateFacilityRequ" +
      "estRequest\032\033.hts.common.FacilityRequest\022" +
      "Y\n\026ApproveFacilityRequest\022+.hts.facility" +
      ".ApproveFacilityRequestRequest\032\022.hts.com" +
      "mon.Result\022W\n\025RejectFacilityRequest\022*.ht" +
      "s.facility.RejectFacilityRequestRequest\032" +
      "\022.hts.common.Result\022M\n\017GetFacilityInfo\022$" +
      ".hts.facility.GetFacilityInfoRequest\032\024.h" +
      "ts.common.FacilityBF\n\020app.onepass.apisB\r" +
      "FacilityProtoP\001Z!onepass.app/facility/ht" +
      "s/facilityb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          app.onepass.apis.CommonProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_hts_facility_FacilityRequestWithFacilityInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hts_facility_FacilityRequestWithFacilityInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_facility_FacilityRequestWithFacilityInfo_descriptor,
        new java.lang.String[] { "Id", "EventId", "FacilityId", "OrganizationId", "Status", "RejectReason", "Start", "Finish", "FacilityName", "Latitude", "Longitude", "OperatingHours", "Description", });
    internal_static_hts_facility_GetFacilityListRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_hts_facility_GetFacilityListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_facility_GetFacilityListRequest_descriptor,
        new java.lang.String[] { "OrganizationId", });
    internal_static_hts_facility_GetFacilityListResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_hts_facility_GetFacilityListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_facility_GetFacilityListResponse_descriptor,
        new java.lang.String[] { "Facilities", });
    internal_static_hts_facility_GetFacilityRequestListRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_hts_facility_GetFacilityRequestListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_facility_GetFacilityRequestListRequest_descriptor,
        new java.lang.String[] { "OrganizationId", });
    internal_static_hts_facility_GetFacilityRequestListResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_hts_facility_GetFacilityRequestListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_facility_GetFacilityRequestListResponse_descriptor,
        new java.lang.String[] { "Requests", });
    internal_static_hts_facility_GetFacilityRequestsStatusRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_hts_facility_GetFacilityRequestsStatusRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_facility_GetFacilityRequestsStatusRequest_descriptor,
        new java.lang.String[] { "EventId", });
    internal_static_hts_facility_GetFacilityRequestsStatusResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_hts_facility_GetFacilityRequestsStatusResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_facility_GetFacilityRequestsStatusResponse_descriptor,
        new java.lang.String[] { "Requests", });
    internal_static_hts_facility_GetAvailableFacilityListResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_hts_facility_GetAvailableFacilityListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_facility_GetAvailableFacilityListResponse_descriptor,
        new java.lang.String[] { "Facilities", });
    internal_static_hts_facility_GetAvailableTimeOfFacilityRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_hts_facility_GetAvailableTimeOfFacilityRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_facility_GetAvailableTimeOfFacilityRequest_descriptor,
        new java.lang.String[] { "FacilityId", "Start", "End", });
    internal_static_hts_facility_GetAvailableTimeOfFacilityResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
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
    internal_static_hts_facility_CreateFacilityRequestRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_hts_facility_CreateFacilityRequestRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_facility_CreateFacilityRequestRequest_descriptor,
        new java.lang.String[] { "UserId", "OrganizationId", "EventId", "FacilityId", "Start", "End", });
    internal_static_hts_facility_ApproveFacilityRequestRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_hts_facility_ApproveFacilityRequestRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_facility_ApproveFacilityRequestRequest_descriptor,
        new java.lang.String[] { "UserId", "OrganizationId", "RequestId", });
    internal_static_hts_facility_RejectFacilityRequestRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_hts_facility_RejectFacilityRequestRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_facility_RejectFacilityRequestRequest_descriptor,
        new java.lang.String[] { "UserId", "OrganizationId", "RequestId", "Reason", });
    internal_static_hts_facility_GetFacilityInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_hts_facility_GetFacilityInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_facility_GetFacilityInfoRequest_descriptor,
        new java.lang.String[] { "FacilityId", });
    app.onepass.apis.CommonProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
