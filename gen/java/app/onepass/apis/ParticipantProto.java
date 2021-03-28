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
    internal_static_hts_participant_GenerateQRRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_participant_GenerateQRRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_participant_GetTagsFromEventIdResonse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_participant_GetTagsFromEventIdResonse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_participant_GetApprovedUserFromEventIdResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_participant_GetApprovedUserFromEventIdResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_participant_GetRatingFromEventIdResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_participant_GetRatingFromEventIdResponse_fieldAccessorTable;

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
      "ogle.protobuf.TimestampR\003end\"k\n\021Generate" +
      "QRRequest\022\"\n\ruser_event_id\030\001 \001(\003R\013userEv" +
      "entId\022\027\n\007user_id\030\002 \001(\003R\006userId\022\031\n\010event_" +
      "id\030\003 \001(\003R\007eventId\"@\n\031GetTagsFromEventIdR" +
      "esonse\022#\n\004tags\030\001 \003(\0132\017.hts.common.TagR\004t" +
      "ags\"L\n\"GetApprovedUserFromEventIdRespons" +
      "e\022&\n\005users\030\001 \003(\0132\020.hts.common.UserR\005user" +
      "s\"6\n\034GetRatingFromEventIdResponse\022\026\n\006res" +
      "ult\030\001 \003(\003R\006result2\302\r\n\022ParticipantService" +
      "\022X\n\020IsEventAvailable\022(.hts.participant.I" +
      "sEventAvailableRequest\032\032.google.protobuf" +
      ".BoolValue\022I\n\tJoinEvent\022%.hts.participan" +
      "t.UserWithEventRequest\032\025.hts.common.User" +
      "Event\022G\n\013CancelEvent\022%.hts.participant.U" +
      "serWithEventRequest\032\021.hts.common.Event\022\227" +
      "\001\n SubmitAnswerForPostEventQuestion\0228.ht" +
      "s.participant.SubmitAnswerForPostEventQu" +
      "estionRequest\0329.hts.participant.SubmitAn" +
      "swerForPostEventQuestionResponse\022G\n\014GetE" +
      "ventById\022$.hts.participant.GetEventByIdR" +
      "equest\032\021.hts.common.Event\022G\n\014GetAllEvent" +
      "s\022\026.google.protobuf.Empty\032\037.hts.particip" +
      "ant.EventsResponse\022M\n\022GetSuggestedEvents" +
      "\022\026.google.protobuf.Empty\032\037.hts.participa" +
      "nt.EventsResponse\022_\n\021GetUpcomingEvents\022)" +
      ".hts.participant.GetUpcomingEventsReques" +
      "t\032\037.hts.participant.EventsResponse\022_\n\027Ge" +
      "tEventsByStringOfName\022#.hts.participant." +
      "StringInputRequest\032\037.hts.participant.Eve" +
      "ntsResponse\022U\n\020GetEventsByTagId\022 .hts.co" +
      "mmon.GetObjectByIdRequest\032\037.hts.particip" +
      "ant.EventsResponse\022^\n\031GetEventsByOrganiz" +
      "ationId\022 .hts.common.GetObjectByIdReques" +
      "t\032\037.hts.participant.EventsResponse\022Z\n\025Ge" +
      "tEventsByFacilityId\022 .hts.common.GetObje" +
      "ctByIdRequest\032\037.hts.participant.EventsRe" +
      "sponse\022N\n\017GetEventsByDate\022\032.google.proto" +
      "buf.Timestamp\032\037.hts.participant.EventsRe" +
      "sponse\022I\n\017GetLocationById\022 .hts.common.G" +
      "etObjectByIdRequest\032\024.hts.common.Locatio" +
      "n\022b\n\022GetTagsFromEventId\022 .hts.common.Get" +
      "ObjectByIdRequest\032*.hts.participant.GetT" +
      "agsFromEventIdResonse\022g\n\024GetRatingFromEv" +
      "entId\022 .hts.common.GetObjectByIdRequest\032" +
      "-.hts.participant.GetRatingFromEventIdRe" +
      "sponse\022s\n\032GetApprovedUserFromEventId\022 .h" +
      "ts.common.GetObjectByIdRequest\0323.hts.par" +
      "ticipant.GetApprovedUserFromEventIdRespo" +
      "nse\022U\n\nGenerateQR\022\".hts.participant.Gene" +
      "rateQRRequest\032#.hts.participant.Generate" +
      "QRResponse\022:\n\004Ping\022\026.google.protobuf.Emp" +
      "ty\032\032.google.protobuf.BoolValueBL\n\020app.on" +
      "epass.apisB\020ParticipantProtoP\001Z$onepass." +
      "app/facility/hts/participantb\006proto3"
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
    internal_static_hts_participant_GenerateQRRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_hts_participant_GenerateQRRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_participant_GenerateQRRequest_descriptor,
        new java.lang.String[] { "UserEventId", "UserId", "EventId", });
    internal_static_hts_participant_GetTagsFromEventIdResonse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_hts_participant_GetTagsFromEventIdResonse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_participant_GetTagsFromEventIdResonse_descriptor,
        new java.lang.String[] { "Tags", });
    internal_static_hts_participant_GetApprovedUserFromEventIdResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_hts_participant_GetApprovedUserFromEventIdResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_participant_GetApprovedUserFromEventIdResponse_descriptor,
        new java.lang.String[] { "Users", });
    internal_static_hts_participant_GetRatingFromEventIdResponse_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_hts_participant_GetRatingFromEventIdResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_participant_GetRatingFromEventIdResponse_descriptor,
        new java.lang.String[] { "Result", });
    app.onepass.apis.CommonProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
