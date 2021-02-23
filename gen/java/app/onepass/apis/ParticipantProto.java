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
    internal_static_hts_participant_IsEventAvailableRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_participant_IsEventAvailableRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_participant_JoinEventRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_participant_JoinEventRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_participant_CancelEventRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_participant_CancelEventRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_participant_CreateFeedbackRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_participant_CreateFeedbackRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_participant_RemoveFeedbackRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_participant_RemoveFeedbackRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_participant_SearchEventsByNameRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_participant_SearchEventsByNameRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_participant_SearchEventsByNameRespond_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_participant_SearchEventsByNameRespond_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_participant_GenerateQRRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_participant_GenerateQRRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_participant_GenerateQRRespond_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_participant_GenerateQRRespond_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_participant_GetEventRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_participant_GetEventRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035hts/participant/service.proto\022\017hts.par" +
      "ticipant\032\027hts/common/common.proto\"B\n\027IsE" +
      "ventAvailableRequest\022\'\n\005event\030\001 \001(\0132\021.ht" +
      "s.common.EventR\005event\"a\n\020JoinEventReques" +
      "t\022$\n\004user\030\001 \001(\0132\020.hts.common.UserR\004user\022" +
      "\'\n\005event\030\002 \001(\0132\021.hts.common.EventR\005event" +
      "\"c\n\022CancelEventRequest\022$\n\004user\030\001 \001(\0132\020.h" +
      "ts.common.UserR\004user\022\'\n\005event\030\002 \001(\0132\021.ht" +
      "s.common.EventR\005event\"t\n\025CreateFeedbackR" +
      "equest\022$\n\004user\030\001 \001(\0132\020.hts.common.UserR\004" +
      "user\0225\n\010feedback\030\002 \001(\0132\031.hts.common.Even" +
      "tFeedbackR\010feedback\"N\n\025RemoveFeedbackReq" +
      "uest\0225\n\010feedback\030\001 \001(\0132\031.hts.common.Even" +
      "tFeedbackR\010feedback\"/\n\031SearchEventsByNam" +
      "eRequest\022\022\n\004name\030\001 \001(\tR\004name\"F\n\031SearchEv" +
      "entsByNameRespond\022)\n\006events\030\001 \003(\0132\021.hts." +
      "common.EventR\006events\"I\n\021GenerateQRReques" +
      "t\0224\n\nuser_event\030\001 \001(\0132\025.hts.common.UserE" +
      "ventR\tuserEvent\"\'\n\021GenerateQRRespond\022\022\n\004" +
      "data\030\001 \001(\tR\004data\",\n\017GetEventRequest\022\031\n\010e" +
      "vent_id\030\001 \001(\003R\007eventId2\223\005\n\022ParticipantSe" +
      "rvice\022P\n\020IsEventAvailable\022(.hts.particip" +
      "ant.IsEventAvailableRequest\032\022.hts.common" +
      ".Result\022B\n\tJoinEvent\022!.hts.participant.J" +
      "oinEventRequest\032\022.hts.common.Result\022F\n\013C" +
      "ancelEvent\022#.hts.participant.CancelEvent" +
      "Request\032\022.hts.common.Result\022L\n\016CreateFee" +
      "dback\022&.hts.participant.CreateFeedbackRe" +
      "quest\032\022.hts.common.Result\022L\n\016RemoveFeedb" +
      "ack\022&.hts.participant.RemoveFeedbackRequ" +
      "est\032\022.hts.common.Result\022l\n\022SearchEventsB" +
      "yName\022*.hts.participant.SearchEventsByNa" +
      "meRequest\032*.hts.participant.SearchEvents" +
      "ByNameRespond\022T\n\nGenerateQR\022\".hts.partic" +
      "ipant.GenerateQRRequest\032\".hts.participan" +
      "t.GenerateQRRespond\022?\n\010GetEvent\022 .hts.pa" +
      "rticipant.GetEventRequest\032\021.hts.common.E" +
      "ventBL\n\020app.onepass.apisB\020ParticipantPro" +
      "toP\001Z$onepass.app/facility/hts/participa" +
      "ntb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          app.onepass.apis.CommonProto.getDescriptor(),
        });
    internal_static_hts_participant_IsEventAvailableRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hts_participant_IsEventAvailableRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_participant_IsEventAvailableRequest_descriptor,
        new java.lang.String[] { "Event", });
    internal_static_hts_participant_JoinEventRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_hts_participant_JoinEventRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_participant_JoinEventRequest_descriptor,
        new java.lang.String[] { "User", "Event", });
    internal_static_hts_participant_CancelEventRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_hts_participant_CancelEventRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_participant_CancelEventRequest_descriptor,
        new java.lang.String[] { "User", "Event", });
    internal_static_hts_participant_CreateFeedbackRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_hts_participant_CreateFeedbackRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_participant_CreateFeedbackRequest_descriptor,
        new java.lang.String[] { "User", "Feedback", });
    internal_static_hts_participant_RemoveFeedbackRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_hts_participant_RemoveFeedbackRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_participant_RemoveFeedbackRequest_descriptor,
        new java.lang.String[] { "Feedback", });
    internal_static_hts_participant_SearchEventsByNameRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_hts_participant_SearchEventsByNameRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_participant_SearchEventsByNameRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_hts_participant_SearchEventsByNameRespond_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_hts_participant_SearchEventsByNameRespond_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_participant_SearchEventsByNameRespond_descriptor,
        new java.lang.String[] { "Events", });
    internal_static_hts_participant_GenerateQRRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_hts_participant_GenerateQRRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_participant_GenerateQRRequest_descriptor,
        new java.lang.String[] { "UserEvent", });
    internal_static_hts_participant_GenerateQRRespond_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_hts_participant_GenerateQRRespond_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_participant_GenerateQRRespond_descriptor,
        new java.lang.String[] { "Data", });
    internal_static_hts_participant_GetEventRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_hts_participant_GetEventRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_participant_GetEventRequest_descriptor,
        new java.lang.String[] { "EventId", });
    app.onepass.apis.CommonProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
