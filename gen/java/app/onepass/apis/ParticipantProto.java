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
    internal_static_hts_participant_GetEventByIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_participant_GetEventByIdRequest_fieldAccessorTable;
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
    internal_static_hts_participant_SubmitAnswerForPostEventQuestionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_participant_SubmitAnswerForPostEventQuestionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_participant_SubmitAnswerForPostEventQuestionRequest_Answer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_participant_SubmitAnswerForPostEventQuestionRequest_Answer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_participant_SubmitAnswerForPostEventQuestionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_participant_SubmitAnswerForPostEventQuestionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_participant_GenerateQRResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_participant_GenerateQRResponse_fieldAccessorTable;
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
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_participant_GetEventsByTagIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_participant_GetEventsByTagIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_participant_GetEventsByOrganizationIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_participant_GetEventsByOrganizationIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_participant_GetEventsByFacilityIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_participant_GetEventsByFacilityIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_participant_GenerateQRRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_participant_GenerateQRRequest_fieldAccessorTable;

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
      "p.proto\"0\n\023GetEventByIdRequest\022\031\n\010event_" +
      "id\030\001 \001(\003R\007eventId\"(\n\022StringInputRequest\022" +
      "\022\n\004text\030\001 \001(\tR\004text\"J\n\024UserWithEventRequ" +
      "est\022\027\n\007user_id\030\001 \001(\003R\006userId\022\031\n\010event_id" +
      "\030\002 \001(\003R\007eventId\"\351\001\n\'SubmitAnswerForPostE" +
      "ventQuestionRequest\022Y\n\007answers\030\001 \003(\0132?.h" +
      "ts.participant.SubmitAnswerForPostEventQ" +
      "uestionRequest.AnswerR\007answers\022\"\n\ruser_e" +
      "vent_id\030\002 \001(\003R\013userEventId\032?\n\006Answer\022\037\n\013" +
      "question_id\030\001 \001(\003R\nquestionId\022\024\n\005value\030\002" +
      " \001(\tR\005value\"X\n(SubmitAnswerForPostEventQ" +
      "uestionResponse\022,\n\007answers\030\001 \003(\0132\022.hts.c" +
      "ommon.AnswerR\007answers\"(\n\022GenerateQRRespo" +
      "nse\022\022\n\004data\030\001 \001(\tR\004data\"9\n\016EventsRespons" +
      "e\022\'\n\005event\030\001 \003(\0132\021.hts.common.EventR\005eve" +
      "nt\"d\n\027IsEventAvailableRequest\022\031\n\010event_i" +
      "d\030\001 \001(\003R\007eventId\022.\n\004date\030\002 \001(\0132\032.google." +
      "protobuf.TimestampR\004date\"z\n\030GetUpcomingE" +
      "ventsRequest\0220\n\005start\030\001 \001(\0132\032.google.pro" +
      "tobuf.TimestampR\005start\022,\n\003end\030\002 \001(\0132\032.go" +
      "ogle.protobuf.TimestampR\003end\"0\n\027GetEvent" +
      "sByTagIdRequest\022\025\n\006tag_id\030\001 \001(\003R\005tagId\"K" +
      "\n GetEventsByOrganizationIdRequest\022\'\n\017or" +
      "ganization_id\030\001 \001(\003R\016organizationId\"?\n\034G" +
      "etEventsByFacilityIdRequest\022\037\n\013facility_" +
      "id\030\001 \001(\003R\nfacilityId\"k\n\021GenerateQRReques" +
      "t\022\"\n\ruser_event_id\030\001 \001(\003R\013userEventId\022\027\n" +
      "\007user_id\030\002 \001(\003R\006userId\022\031\n\010event_id\030\003 \001(\003" +
      "R\007eventId2\327\n\n\022ParticipantService\022X\n\020IsEv" +
      "entAvailable\022(.hts.participant.IsEventAv" +
      "ailableRequest\032\032.google.protobuf.BoolVal" +
      "ue\022E\n\tJoinEvent\022%.hts.participant.UserWi" +
      "thEventRequest\032\021.hts.common.Event\022G\n\013Can" +
      "celEvent\022%.hts.participant.UserWithEvent" +
      "Request\032\021.hts.common.Event\022\227\001\n SubmitAns" +
      "werForPostEventQuestion\0228.hts.participan" +
      "t.SubmitAnswerForPostEventQuestionReques" +
      "t\0329.hts.participant.SubmitAnswerForPostE" +
      "ventQuestionResponse\022G\n\014GetEventById\022$.h" +
      "ts.participant.GetEventByIdRequest\032\021.hts" +
      ".common.Event\022G\n\014GetAllEvents\022\026.google.p" +
      "rotobuf.Empty\032\037.hts.participant.EventsRe" +
      "sponse\022M\n\022GetSuggestedEvents\022\026.google.pr" +
      "otobuf.Empty\032\037.hts.participant.EventsRes" +
      "ponse\022_\n\021GetUpcomingEvents\022).hts.partici" +
      "pant.GetUpcomingEventsRequest\032\037.hts.part" +
      "icipant.EventsResponse\022_\n\027GetEventsByStr" +
      "ingOfName\022#.hts.participant.StringInputR" +
      "equest\032\037.hts.participant.EventsResponse\022" +
      "]\n\020GetEventsByTagId\022(.hts.participant.Ge" +
      "tEventsByTagIdRequest\032\037.hts.participant." +
      "EventsResponse\022o\n\031GetEventsByOrganizatio" +
      "nId\0221.hts.participant.GetEventsByOrganiz" +
      "ationIdRequest\032\037.hts.participant.EventsR" +
      "esponse\022g\n\025GetEventsByFacilityId\022-.hts.p" +
      "articipant.GetEventsByFacilityIdRequest\032" +
      "\037.hts.participant.EventsResponse\022N\n\017GetE" +
      "ventsByDate\022\032.google.protobuf.Timestamp\032" +
      "\037.hts.participant.EventsResponse\022U\n\nGene" +
      "rateQR\022\".hts.participant.GenerateQRReque" +
      "st\032#.hts.participant.GenerateQRResponse\022" +
      ":\n\004Ping\022\026.google.protobuf.Empty\032\032.google" +
      ".protobuf.BoolValueBL\n\020app.onepass.apisB" +
      "\020ParticipantProtoP\001Z$onepass.app/facilit" +
      "y/hts/participantb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          app.onepass.apis.CommonProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_hts_participant_GetEventByIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hts_participant_GetEventByIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_participant_GetEventByIdRequest_descriptor,
        new java.lang.String[] { "EventId", });
    internal_static_hts_participant_StringInputRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_hts_participant_StringInputRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_participant_StringInputRequest_descriptor,
        new java.lang.String[] { "Text", });
    internal_static_hts_participant_UserWithEventRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_hts_participant_UserWithEventRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_participant_UserWithEventRequest_descriptor,
        new java.lang.String[] { "UserId", "EventId", });
    internal_static_hts_participant_SubmitAnswerForPostEventQuestionRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_hts_participant_SubmitAnswerForPostEventQuestionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_participant_SubmitAnswerForPostEventQuestionRequest_descriptor,
        new java.lang.String[] { "Answers", "UserEventId", });
    internal_static_hts_participant_SubmitAnswerForPostEventQuestionRequest_Answer_descriptor =
      internal_static_hts_participant_SubmitAnswerForPostEventQuestionRequest_descriptor.getNestedTypes().get(0);
    internal_static_hts_participant_SubmitAnswerForPostEventQuestionRequest_Answer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_participant_SubmitAnswerForPostEventQuestionRequest_Answer_descriptor,
        new java.lang.String[] { "QuestionId", "Value", });
    internal_static_hts_participant_SubmitAnswerForPostEventQuestionResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_hts_participant_SubmitAnswerForPostEventQuestionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_participant_SubmitAnswerForPostEventQuestionResponse_descriptor,
        new java.lang.String[] { "Answers", });
    internal_static_hts_participant_GenerateQRResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_hts_participant_GenerateQRResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_participant_GenerateQRResponse_descriptor,
        new java.lang.String[] { "Data", });
    internal_static_hts_participant_EventsResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_hts_participant_EventsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_participant_EventsResponse_descriptor,
        new java.lang.String[] { "Event", });
    internal_static_hts_participant_IsEventAvailableRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_hts_participant_IsEventAvailableRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_participant_IsEventAvailableRequest_descriptor,
        new java.lang.String[] { "EventId", "Date", });
    internal_static_hts_participant_GetUpcomingEventsRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_hts_participant_GetUpcomingEventsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_participant_GetUpcomingEventsRequest_descriptor,
        new java.lang.String[] { "Start", "End", });
    internal_static_hts_participant_GetEventsByTagIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_hts_participant_GetEventsByTagIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_participant_GetEventsByTagIdRequest_descriptor,
        new java.lang.String[] { "TagId", });
    internal_static_hts_participant_GetEventsByOrganizationIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_hts_participant_GetEventsByOrganizationIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_participant_GetEventsByOrganizationIdRequest_descriptor,
        new java.lang.String[] { "OrganizationId", });
    internal_static_hts_participant_GetEventsByFacilityIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_hts_participant_GetEventsByFacilityIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_participant_GetEventsByFacilityIdRequest_descriptor,
        new java.lang.String[] { "FacilityId", });
    internal_static_hts_participant_GenerateQRRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_hts_participant_GenerateQRRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_participant_GenerateQRRequest_descriptor,
        new java.lang.String[] { "UserEventId", "UserId", "EventId", });
    app.onepass.apis.CommonProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
