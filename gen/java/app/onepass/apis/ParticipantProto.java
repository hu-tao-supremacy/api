// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/participant/service.proto

package app.onepass.apis;

public final class ParticipantProto {
  private ParticipantProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_participant_GenerateQRRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_participant_GenerateQRRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_participant_GetEventRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_participant_GetEventRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_participant_StringInputRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_participant_StringInputRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_participant_UserWithEventRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_participant_UserWithEventRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_participant_CreateFeedbackRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_participant_CreateFeedbackRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_participant_GenerateQRResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_participant_GenerateQRResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_participant_GetFeedbacksFromEventResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_participant_GetFeedbacksFromEventResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_participant_EventsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_participant_EventsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_participant_IsEventAvailableRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_participant_IsEventAvailableRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_participant_GetUpcomingEventsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_participant_GetUpcomingEventsRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035hts/participant/service.proto\022\017hts.par" +
      "ticipant\032\027hts/common/common.proto\032\033googl" +
      "e/protobuf/empty.proto\032\036google/protobuf/" +
      "wrappers.proto\032\037google/protobuf/timestam" +
      "p.proto\"I\n\021GenerateQRRequest\0224\n\nuser_eve" +
      "nt\030\001 \001(\0132\025.hts.common.UserEventR\tuserEve" +
      "nt\",\n\017GetEventRequest\022\031\n\010event_id\030\001 \001(\003R" +
      "\007eventId\"(\n\022StringInputRequest\022\022\n\004text\030\001" +
      " \001(\tR\004text\"e\n\024UserWithEventRequest\022$\n\004us" +
      "er\030\001 \001(\0132\020.hts.common.UserR\004user\022\'\n\005even" +
      "t\030\002 \001(\0132\021.hts.common.EventR\005event\"t\n\025Cre" +
      "ateFeedbackRequest\022$\n\004user\030\001 \001(\0132\020.hts.c" +
      "ommon.UserR\004user\0225\n\010feedback\030\002 \001(\0132\031.hts" +
      ".common.EventFeedbackR\010feedback\"(\n\022Gener" +
      "ateQRResponse\022\022\n\004data\030\001 \001(\tR\004data\"a\n\035Get" +
      "FeedbacksFromEventResponse\022@\n\016event_feed" +
      "back\030\001 \003(\0132\031.hts.common.EventFeedbackR\re" +
      "ventFeedback\"9\n\016EventsResponse\022\'\n\005event\030" +
      "\001 \003(\0132\021.hts.common.EventR\005event\"r\n\027IsEve" +
      "ntAvailableRequest\022\'\n\005event\030\001 \001(\0132\021.hts." +
      "common.EventR\005event\022.\n\004date\030\002 \001(\0132\032.goog" +
      "le.protobuf.TimestampR\004date\"z\n\030GetUpcomi" +
      "ngEventsRequest\0220\n\005start\030\001 \001(\0132\032.google." +
      "protobuf.TimestampR\005start\022,\n\003end\030\002 \001(\0132\032" +
      ".google.protobuf.TimestampR\003end2\256\013\n\022Part" +
      "icipantService\022X\n\020IsEventAvailable\022(.hts" +
      ".participant.IsEventAvailableRequest\032\032.g" +
      "oogle.protobuf.BoolValue\022E\n\tJoinEvent\022%." +
      "hts.participant.UserWithEventRequest\032\021.h" +
      "ts.common.Event\022G\n\013CancelEvent\022%.hts.par" +
      "ticipant.UserWithEventRequest\032\021.hts.comm" +
      "on.Event\022S\n\016CreateFeedback\022&.hts.partici" +
      "pant.CreateFeedbackRequest\032\031.hts.common." +
      "EventFeedback\022F\n\016RemoveFeedback\022\031.hts.co" +
      "mmon.EventFeedback\032\031.hts.common.EventFee" +
      "dback\022Z\n\025GetFeedbacksFromEvent\022\021.hts.com" +
      "mon.Event\032..hts.participant.GetFeedbacks" +
      "FromEventResponse\022\\\n\030GetUserFeedbackFrom" +
      "Event\022%.hts.participant.UserWithEventReq" +
      "uest\032\031.hts.common.EventFeedback\022?\n\010GetEv" +
      "ent\022 .hts.participant.GetEventRequest\032\021." +
      "hts.common.Event\022G\n\014GetAllEvents\022\026.googl" +
      "e.protobuf.Empty\032\037.hts.participant.Event" +
      "sResponse\022M\n\022GetSuggestedEvents\022\026.google" +
      ".protobuf.Empty\032\037.hts.participant.Events" +
      "Response\022_\n\027GetEventsByStringOfName\022#.ht" +
      "s.participant.StringInputRequest\032\037.hts.p" +
      "articipant.EventsResponse\022B\n\016GetEventsBy" +
      "Tag\022\017.hts.common.Tag\032\037.hts.participant.E" +
      "ventsResponse\022T\n\027GetEventsByOrganization" +
      "\022\030.hts.common.Organization\032\037.hts.partici" +
      "pant.EventsResponse\022L\n\023GetEventsByFacili" +
      "ty\022\024.hts.common.Facility\032\037.hts.participa" +
      "nt.EventsResponse\022N\n\017GetEventsByDate\022\032.g" +
      "oogle.protobuf.Timestamp\032\037.hts.participa" +
      "nt.EventsResponse\022_\n\021GetUpcomingEvents\022)" +
      ".hts.participant.GetUpcomingEventsReques" +
      "t\032\037.hts.participant.EventsResponse\022H\n\nGe" +
      "nerateQR\022\025.hts.common.UserEvent\032#.hts.pa" +
      "rticipant.GenerateQRResponse\022:\n\004Ping\022\026.g" +
      "oogle.protobuf.Empty\032\032.google.protobuf.B" +
      "oolValueBL\n\020app.onepass.apisB\020Participan" +
      "tProtoP\001Z$onepass.app/facility/hts/parti" +
      "cipantb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          app.onepass.apis.CommonProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_hts_participant_GenerateQRRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hts_participant_GenerateQRRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_participant_GenerateQRRequest_descriptor,
        new java.lang.String[] { "UserEvent", });
    internal_static_hts_participant_GetEventRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_hts_participant_GetEventRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_participant_GetEventRequest_descriptor,
        new java.lang.String[] { "EventId", });
    internal_static_hts_participant_StringInputRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_hts_participant_StringInputRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_participant_StringInputRequest_descriptor,
        new java.lang.String[] { "Text", });
    internal_static_hts_participant_UserWithEventRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_hts_participant_UserWithEventRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_participant_UserWithEventRequest_descriptor,
        new java.lang.String[] { "User", "Event", });
    internal_static_hts_participant_CreateFeedbackRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_hts_participant_CreateFeedbackRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_participant_CreateFeedbackRequest_descriptor,
        new java.lang.String[] { "User", "Feedback", });
    internal_static_hts_participant_GenerateQRResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_hts_participant_GenerateQRResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_participant_GenerateQRResponse_descriptor,
        new java.lang.String[] { "Data", });
    internal_static_hts_participant_GetFeedbacksFromEventResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_hts_participant_GetFeedbacksFromEventResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_participant_GetFeedbacksFromEventResponse_descriptor,
        new java.lang.String[] { "EventFeedback", });
    internal_static_hts_participant_EventsResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_hts_participant_EventsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_participant_EventsResponse_descriptor,
        new java.lang.String[] { "Event", });
    internal_static_hts_participant_IsEventAvailableRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_hts_participant_IsEventAvailableRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_participant_IsEventAvailableRequest_descriptor,
        new java.lang.String[] { "Event", "Date", });
    internal_static_hts_participant_GetUpcomingEventsRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_hts_participant_GetUpcomingEventsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_participant_GetUpcomingEventsRequest_descriptor,
        new java.lang.String[] { "Start", "End", });
    app.onepass.apis.CommonProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
