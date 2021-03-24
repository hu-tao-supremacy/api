// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/common/common.proto

package app.onepass.apis;

public final class CommonProto {
  private CommonProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_common_OperatingHour_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_common_OperatingHour_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_common_Result_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_common_Result_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_common_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_common_User_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_common_Organization_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_common_Organization_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_common_QuestionGroup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_common_QuestionGroup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_common_Question_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_common_Question_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_common_UserOrganization_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_common_UserOrganization_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_common_Event_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_common_Event_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_common_Answer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_common_Answer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_common_UserEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_common_UserEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_common_EventDuration_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_common_EventDuration_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_common_Tag_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_common_Tag_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_common_EventTag_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_common_EventTag_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_common_OrganizationPermission_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_common_OrganizationPermission_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_common_UserPermission_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_common_UserPermission_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_common_UserInterest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_common_UserInterest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_common_FacilityRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_common_FacilityRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_common_Facility_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_common_Facility_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027hts/common/common.proto\022\nhts.common\032\037g" +
      "oogle/protobuf/timestamp.proto\032\036google/p" +
      "rotobuf/wrappers.proto\"x\n\rOperatingHour\022" +
      "\035\n\nstart_hour\030\001 \001(\003R\tstartHour\022\037\n\013finish" +
      "_hour\030\002 \001(\003R\nfinishHour\022\'\n\003day\030\003 \001(\0162\025.h" +
      "ts.common.DayOfWeekR\003day\"?\n\006Result\022\023\n\005is" +
      "_ok\030\001 \001(\010R\004isOk\022 \n\013description\030\002 \001(\tR\013de" +
      "scription\"\260\003\n\004User\022\016\n\002id\030\001 \001(\003R\002id\022\035\n\nfi" +
      "rst_name\030\002 \001(\tR\tfirstName\022\033\n\tlast_name\030\003" +
      " \001(\tR\010lastName\022\024\n\005email\030\004 \001(\tR\005email\0228\n\010" +
      "nickname\030\005 \001(\0132\034.google.protobuf.StringV" +
      "alueR\010nickname\0227\n\010chula_id\030\006 \001(\0132\034.googl" +
      "e.protobuf.StringValueR\007chulaId\022(\n\020is_ch" +
      "ula_student\030\007 \001(\010R\016isChulaStudent\022*\n\006gen" +
      "der\030\010 \001(\0162\022.hts.common.GenderR\006gender\0226\n" +
      "\007address\030\t \001(\0132\034.google.protobuf.StringV" +
      "alueR\007address\022E\n\017profile_picture\030\n \001(\0132\034" +
      ".google.protobuf.StringValueR\016profilePic" +
      "ture\"\240\010\n\014Organization\022\016\n\002id\030\001 \001(\003R\002id\022\022\n" +
      "\004name\030\002 \001(\tR\004name\022\037\n\013is_verified\030\003 \001(\010R\n" +
      "isVerified\022@\n\014abbreviation\030\004 \001(\0132\034.googl" +
      "e.protobuf.StringValueR\014abbreviation\0226\n\007" +
      "advisor\030\005 \001(\0132\034.google.protobuf.StringVa" +
      "lueR\007advisor\022K\n\022associated_faculty\030\006 \001(\013" +
      "2\034.google.protobuf.StringValueR\021associat" +
      "edFaculty\022>\n\013description\030\007 \001(\0132\034.google." +
      "protobuf.StringValueR\013description\022A\n\rfac" +
      "ebook_page\030\010 \001(\0132\034.google.protobuf.Strin" +
      "gValueR\014facebookPage\022:\n\tinstagram\030\t \001(\0132" +
      "\034.google.protobuf.StringValueR\tinstagram" +
      "\022P\n\025line_official_account\030\n \001(\0132\034.google" +
      ".protobuf.StringValueR\023lineOfficialAccou" +
      "nt\0222\n\005email\030\013 \001(\0132\034.google.protobuf.Stri" +
      "ngValueR\005email\022H\n\021contact_full_name\030\014 \001(" +
      "\0132\034.google.protobuf.StringValueR\017contact" +
      "FullName\022A\n\rcontact_email\030\r \001(\0132\034.google" +
      ".protobuf.StringValueR\014contactEmail\022N\n\024c" +
      "ontact_phone_number\030\016 \001(\0132\034.google.proto" +
      "buf.StringValueR\022contactPhoneNumber\022D\n\017c" +
      "ontact_line_id\030\017 \001(\0132\034.google.protobuf.S" +
      "tringValueR\rcontactLineId\022L\n\023profile_pic" +
      "ture_url\030\020 \001(\0132\034.google.protobuf.StringV" +
      "alueR\021profilePictureUrl\022N\n\024profile_pictu" +
      "re_hash\030\021 \001(\0132\034.google.protobuf.StringVa" +
      "lueR\022profilePictureHash\"\224\001\n\rQuestionGrou" +
      "p\022\016\n\002id\030\001 \001(\003R\002id\022\031\n\010event_id\030\002 \001(\003R\007eve" +
      "ntId\022,\n\004type\030\003 \001(\0162\030.hts.common.Question" +
      "TypeR\004type\022\024\n\005order\030\004 \001(\003R\005order\022\024\n\005titl" +
      "e\030\005 \001(\tR\005title\"\350\001\n\010Question\022\016\n\002id\030\001 \001(\003R" +
      "\002id\022*\n\021question_group_id\030\002 \001(\003R\017question" +
      "GroupId\022\024\n\005order\030\003 \001(\003R\005order\0227\n\013answer_" +
      "type\030\004 \001(\0162\026.hts.common.AnswerTypeR\nansw" +
      "erType\022\037\n\013is_optional\030\005 \001(\010R\nisOptional\022" +
      "\024\n\005title\030\006 \001(\tR\005title\022\032\n\010subtitle\030\007 \001(\tR" +
      "\010subtitle\"d\n\020UserOrganization\022\016\n\002id\030\001 \001(" +
      "\003R\002id\022\027\n\007user_id\030\002 \001(\003R\006userId\022\'\n\017organi" +
      "zation_id\030\003 \001(\003R\016organizationId\"\207\010\n\005Even" +
      "t\022\016\n\002id\030\001 \001(\003R\002id\022\'\n\017organization_id\030\002 \001" +
      "(\003R\016organizationId\022<\n\013location_id\030\003 \001(\0132" +
      "\033.google.protobuf.Int64ValueR\nlocationId" +
      "\022 \n\013description\030\004 \001(\tR\013description\022\022\n\004na" +
      "me\030\005 \001(\tR\004name\022D\n\017cover_image_url\030\006 \001(\0132" +
      "\034.google.protobuf.StringValueR\rcoverImag" +
      "eUrl\022F\n\020cover_image_hash\030\007 \001(\0132\034.google." +
      "protobuf.StringValueR\016coverImageHash\022F\n\020" +
      "poster_image_url\030\010 \001(\0132\034.google.protobuf" +
      ".StringValueR\016posterImageUrl\022H\n\021poster_i" +
      "mage_hash\030\t \001(\0132\034.google.protobuf.String" +
      "ValueR\017posterImageHash\022\030\n\007contact\030\n \001(\tR" +
      "\007contact\022H\n\021profile_image_url\030\013 \001(\0132\034.go" +
      "ogle.protobuf.StringValueR\017profileImageU" +
      "rl\022J\n\022profile_image_hash\030\014 \001(\0132\034.google." +
      "protobuf.StringValueR\020profileImageHash\022%" +
      "\n\016attendee_limit\030\r \001(\003R\rattendeeLimit\022#\n" +
      "\rlocation_name\030\016 \001(\tR\014locationName\022$\n\016go" +
      "ogle_map_url\030\017 \001(\tR\014googleMapUrl\022O\n\024loca" +
      "tion_description\030\020 \001(\0132\034.google.protobuf" +
      ".StringValueR\023locationDescription\022]\n\034tra" +
      "vel_information_image_url\030\021 \001(\0132\034.google" +
      ".protobuf.StringValueR\031travelInformation" +
      "ImageUrl\022_\n\035travel_information_image_has" +
      "h\030\022 \001(\0132\034.google.protobuf.StringValueR\032t" +
      "ravelInformationImageHash\"s\n\006Answer\022\016\n\002i" +
      "d\030\001 \001(\003R\002id\022\"\n\ruser_event_id\030\002 \001(\003R\013user" +
      "EventId\022\037\n\013question_id\030\003 \001(\003R\nquestionId" +
      "\022\024\n\005value\030\004 \001(\tR\005value\"\310\001\n\tUserEvent\022\016\n\002" +
      "id\030\001 \001(\003R\002id\022\027\n\007user_id\030\002 \001(\003R\006userId\022\031\n" +
      "\010event_id\030\003 \001(\003R\007eventId\0223\n\006rating\030\004 \001(\013" +
      "2\033.google.protobuf.Int64ValueR\006rating\022\026\n" +
      "\006ticket\030\005 \001(\tR\006ticket\022*\n\006status\030\006 \001(\0162\022." +
      "hts.common.StatusR\006status\"\240\001\n\rEventDurat" +
      "ion\022\016\n\002id\030\001 \001(\003R\002id\022\031\n\010event_id\030\002 \001(\003R\007e" +
      "ventId\0220\n\005start\030\003 \001(\0132\032.google.protobuf." +
      "TimestampR\005start\0222\n\006finish\030\004 \001(\0132\032.googl" +
      "e.protobuf.TimestampR\006finish\")\n\003Tag\022\016\n\002i" +
      "d\030\001 \001(\003R\002id\022\022\n\004name\030\002 \001(\tR\004name\"L\n\010Event" +
      "Tag\022\016\n\002id\030\001 \001(\003R\002id\022\031\n\010event_id\030\002 \001(\003R\007e" +
      "ventId\022\025\n\006tag_id\030\003 \001(\003R\005tagId\"\211\001\n\026Organi" +
      "zationPermission\022\016\n\002id\030\001 \001(\003R\002id\022\'\n\017orga" +
      "nization_id\030\002 \001(\003R\016organizationId\0226\n\nper" +
      "mission\030\003 \001(\0162\026.hts.common.PermissionR\np" +
      "ermission\"w\n\016UserPermission\022\016\n\002id\030\001 \001(\003R" +
      "\002id\022\027\n\007user_id\030\002 \001(\003R\006userId\022<\n\032organiza" +
      "tion_permission_id\030\003 \001(\003R\030organizationPe" +
      "rmissionId\"M\n\014UserInterest\022\016\n\002id\030\001 \001(\003R\002" +
      "id\022\026\n\006userId\030\002 \001(\003R\006userId\022\025\n\006tag_id\030\003 \001" +
      "(\003R\005tagId\"\262\002\n\017FacilityRequest\022\016\n\002id\030\001 \001(" +
      "\003R\002id\022\031\n\010event_id\030\002 \001(\003R\007eventId\022\037\n\013faci" +
      "lity_id\030\003 \001(\003R\nfacilityId\022*\n\006status\030\004 \001(" +
      "\0162\022.hts.common.StatusR\006status\022A\n\rreject_" +
      "reason\030\005 \001(\0132\034.google.protobuf.StringVal" +
      "ueR\014rejectReason\0220\n\005start\030\006 \001(\0132\032.google" +
      ".protobuf.TimestampR\005start\0222\n\006finish\030\007 \001" +
      "(\0132\032.google.protobuf.TimestampR\006finish\"\367" +
      "\001\n\010Facility\022\016\n\002id\030\001 \001(\003R\002id\022\'\n\017organizat" +
      "ion_id\030\002 \001(\003R\016organizationId\022\022\n\004name\030\003 \001" +
      "(\tR\004name\022\032\n\010latitude\030\004 \001(\001R\010latitude\022\034\n\t" +
      "longitude\030\005 \001(\001R\tlongitude\022B\n\017operating_" +
      "hours\030\006 \003(\0132\031.hts.common.OperatingHourR\016" +
      "operatingHours\022 \n\013description\030\007 \001(\tR\013des" +
      "cription*J\n\tDayOfWeek\022\007\n\003SUN\020\000\022\007\n\003MON\020\001\022" +
      "\007\n\003TUE\020\002\022\007\n\003WED\020\003\022\007\n\003THU\020\004\022\007\n\003FRI\020\005\022\007\n\003S" +
      "AT\020\006*!\n\nAnswerType\022\t\n\005SCALE\020\000\022\010\n\004TEXT\020\001*" +
      "-\n\014QuestionType\022\r\n\tPRE_EVENT\020\000\022\016\n\nPOST_E" +
      "VENT\020\001*1\n\006Gender\022\010\n\004MALE\020\000\022\n\n\006FEMALE\020\001\022\021" +
      "\n\rNOT_SPECIFIED\020\002*1\n\006Status\022\013\n\007PENDING\020\000" +
      "\022\014\n\010APPROVED\020\001\022\014\n\010REJECTED\020\002*\246\002\n\nPermiss" +
      "ion\022\027\n\023ORGANIZATION_UPDATE\020\000\022\027\n\023ORGANIZA" +
      "TION_REMOVE\020\001\022\033\n\027ORGANIZATION_MEMBER_ADD" +
      "\020\002\022\036\n\032ORGANIZATION_MEMBER_REMOVE\020\003\022\020\n\014EV" +
      "ENT_CREATE\020\004\022\020\n\014EVENT_UPDATE\020\005\022\020\n\014EVENT_" +
      "REMOVE\020\006\022\016\n\nTAG_CREATE\020\007\022\016\n\nTAG_REMOVE\020\010" +
      "\022\024\n\020EVENT_TAG_UPDATE\020\t\022\023\n\017FACILITY_CREAT" +
      "E\020\n\022\023\n\017FACILITY_UPDATE\020\013\022\023\n\017FACILITY_REM" +
      "OVE\020\014BB\n\020app.onepass.apisB\013CommonProtoP\001" +
      "Z\037onepass.app/facility/hts/commonb\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_hts_common_OperatingHour_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hts_common_OperatingHour_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_common_OperatingHour_descriptor,
        new java.lang.String[] { "StartHour", "FinishHour", "Day", });
    internal_static_hts_common_Result_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_hts_common_Result_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_common_Result_descriptor,
        new java.lang.String[] { "IsOk", "Description", });
    internal_static_hts_common_User_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_hts_common_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_common_User_descriptor,
        new java.lang.String[] { "Id", "FirstName", "LastName", "Email", "Nickname", "ChulaId", "IsChulaStudent", "Gender", "Address", "ProfilePicture", });
    internal_static_hts_common_Organization_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_hts_common_Organization_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_common_Organization_descriptor,
        new java.lang.String[] { "Id", "Name", "IsVerified", "Abbreviation", "Advisor", "AssociatedFaculty", "Description", "FacebookPage", "Instagram", "LineOfficialAccount", "Email", "ContactFullName", "ContactEmail", "ContactPhoneNumber", "ContactLineId", "ProfilePictureUrl", "ProfilePictureHash", });
    internal_static_hts_common_QuestionGroup_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_hts_common_QuestionGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_common_QuestionGroup_descriptor,
        new java.lang.String[] { "Id", "EventId", "Type", "Order", "Title", });
    internal_static_hts_common_Question_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_hts_common_Question_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_common_Question_descriptor,
        new java.lang.String[] { "Id", "QuestionGroupId", "Order", "AnswerType", "IsOptional", "Title", "Subtitle", });
    internal_static_hts_common_UserOrganization_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_hts_common_UserOrganization_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_common_UserOrganization_descriptor,
        new java.lang.String[] { "Id", "UserId", "OrganizationId", });
    internal_static_hts_common_Event_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_hts_common_Event_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_common_Event_descriptor,
        new java.lang.String[] { "Id", "OrganizationId", "LocationId", "Description", "Name", "CoverImageUrl", "CoverImageHash", "PosterImageUrl", "PosterImageHash", "Contact", "ProfileImageUrl", "ProfileImageHash", "AttendeeLimit", "LocationName", "GoogleMapUrl", "LocationDescription", "TravelInformationImageUrl", "TravelInformationImageHash", });
    internal_static_hts_common_Answer_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_hts_common_Answer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_common_Answer_descriptor,
        new java.lang.String[] { "Id", "UserEventId", "QuestionId", "Value", });
    internal_static_hts_common_UserEvent_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_hts_common_UserEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_common_UserEvent_descriptor,
        new java.lang.String[] { "Id", "UserId", "EventId", "Rating", "Ticket", "Status", });
    internal_static_hts_common_EventDuration_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_hts_common_EventDuration_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_common_EventDuration_descriptor,
        new java.lang.String[] { "Id", "EventId", "Start", "Finish", });
    internal_static_hts_common_Tag_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_hts_common_Tag_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_common_Tag_descriptor,
        new java.lang.String[] { "Id", "Name", });
    internal_static_hts_common_EventTag_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_hts_common_EventTag_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_common_EventTag_descriptor,
        new java.lang.String[] { "Id", "EventId", "TagId", });
    internal_static_hts_common_OrganizationPermission_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_hts_common_OrganizationPermission_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_common_OrganizationPermission_descriptor,
        new java.lang.String[] { "Id", "OrganizationId", "Permission", });
    internal_static_hts_common_UserPermission_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_hts_common_UserPermission_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_common_UserPermission_descriptor,
        new java.lang.String[] { "Id", "UserId", "OrganizationPermissionId", });
    internal_static_hts_common_UserInterest_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_hts_common_UserInterest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_common_UserInterest_descriptor,
        new java.lang.String[] { "Id", "UserId", "TagId", });
    internal_static_hts_common_FacilityRequest_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_hts_common_FacilityRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_common_FacilityRequest_descriptor,
        new java.lang.String[] { "Id", "EventId", "FacilityId", "Status", "RejectReason", "Start", "Finish", });
    internal_static_hts_common_Facility_descriptor =
      getDescriptor().getMessageTypes().get(17);
    internal_static_hts_common_Facility_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_common_Facility_descriptor,
        new java.lang.String[] { "Id", "OrganizationId", "Name", "Latitude", "Longitude", "OperatingHours", "Description", });
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
