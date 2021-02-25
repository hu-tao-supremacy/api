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
    internal_static_hts_participant_GetFeedbackForEventResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_participant_GetFeedbackForEventResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_participant_EventsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_participant_EventsResponse_fieldAccessorTable;

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
      "e/protobuf/empty.proto\"I\n\021GenerateQRRequ" +
      "est\0224\n\nuser_event\030\001 \001(\0132\025.hts.common.Use" +
      "rEventR\tuserEvent\",\n\017GetEventRequest\022\031\n\010" +
      "event_id\030\001 \001(\003R\007eventId\"(\n\022StringInputRe" +
      "quest\022\022\n\004text\030\001 \001(\tR\004text\"e\n\024UserWithEve" +
      "ntRequest\022$\n\004user\030\001 \001(\0132\020.hts.common.Use" +
      "rR\004user\022\'\n\005event\030\002 \001(\0132\021.hts.common.Even" +
      "tR\005event\"t\n\025CreateFeedbackRequest\022$\n\004use" +
      "r\030\001 \001(\0132\020.hts.common.UserR\004user\0225\n\010feedb" +
      "ack\030\002 \001(\0132\031.hts.common.EventFeedbackR\010fe" +
      "edback\"(\n\022GenerateQRResponse\022\022\n\004data\030\001 \001" +
      "(\tR\004data\"_\n\033GetFeedbackForEventResponse\022" +
      "@\n\016event_feedback\030\001 \003(\0132\031.hts.common.Eve" +
      "ntFeedbackR\reventFeedback\"9\n\016EventsRespo" +
      "nse\022\'\n\005event\030\001 \003(\0132\021.hts.common.EventR\005e" +
      "vent2\326\010\n\022ParticipantService\0229\n\020IsEventAv" +
      "ailable\022\021.hts.common.Event\032\022.hts.common." +
      "Result\022F\n\tJoinEvent\022%.hts.participant.Us" +
      "erWithEventRequest\032\022.hts.common.Result\022H" +
      "\n\013CancelEvent\022%.hts.participant.UserWith" +
      "EventRequest\032\022.hts.common.Result\022L\n\016Crea" +
      "teFeedback\022&.hts.participant.CreateFeedb" +
      "ackRequest\032\022.hts.common.Result\022N\n\021HasSub" +
      "mitFeedback\022%.hts.participant.UserWithEv" +
      "entRequest\032\022.hts.common.Result\022?\n\016Remove" +
      "Feedback\022\031.hts.common.EventFeedback\032\022.ht" +
      "s.common.Result\022W\n\024GetFeedbackFromEvent\022" +
      "\021.hts.common.Event\032,.hts.participant.Get" +
      "FeedbackForEventResponse\022a\n\027GetUserFeedb" +
      "ackForEvent\022%.hts.participant.UserWithEv" +
      "entRequest\032\037.hts.participant.EventsRespo" +
      "nse\022Z\n\022SearchEventsByName\022#.hts.particip" +
      "ant.StringInputRequest\032\037.hts.participant" +
      ".EventsResponse\022Y\n\021SearchEventsByTag\022#.h" +
      "ts.participant.StringInputRequest\032\037.hts." +
      "participant.EventsResponse\022H\n\nGenerateQR" +
      "\022\025.hts.common.UserEvent\032#.hts.participan" +
      "t.GenerateQRResponse\022?\n\010GetEvent\022 .hts.p" +
      "articipant.GetEventRequest\032\021.hts.common." +
      "Event\022M\n\022GetSuggestedEvents\022\026.google.pro" +
      "tobuf.Empty\032\037.hts.participant.EventsResp" +
      "onse\022G\n\014GetAllEvents\022\026.google.protobuf.E" +
      "mpty\032\037.hts.participant.EventsResponseBL\n" +
      "\020app.onepass.apisB\020ParticipantProtoP\001Z$o" +
      "nepass.app/facility/hts/participantb\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          app.onepass.apis.CommonProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
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
    internal_static_hts_participant_GetFeedbackForEventResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_hts_participant_GetFeedbackForEventResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_participant_GetFeedbackForEventResponse_descriptor,
        new java.lang.String[] { "EventFeedback", });
    internal_static_hts_participant_EventsResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_hts_participant_EventsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_participant_EventsResponse_descriptor,
        new java.lang.String[] { "Event", });
    app.onepass.apis.CommonProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
