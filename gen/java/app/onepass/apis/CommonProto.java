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
    internal_static_hts_common_Location_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_common_Location_fieldAccessorTable;
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
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_common_GetObjectByIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_common_GetObjectByIdRequest_fieldAccessorTable;

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
      "\035\n\nstart_hour\030\001 \001(\005R\tstartHour\022\037\n\013finish" +
      "_hour\030\002 \001(\005R\nfinishHour\022\'\n\003day\030\003 \001(\0162\025.h" +
      "ts.common.DayOfWeekR\003day\"\204\006\n\004User\022\016\n\002id\030" +
      "\001 \001(\005R\002id\022\035\n\nfirst_name\030\002 \001(\tR\tfirstName" +
      "\022\033\n\tlast_name\030\003 \001(\tR\010lastName\022\024\n\005email\030\004" +
      " \001(\tR\005email\0228\n\010nickname\030\005 \001(\0132\034.google.p" +
      "rotobuf.StringValueR\010nickname\0227\n\010chula_i" +
      "d\030\006 \001(\0132\034.google.protobuf.StringValueR\007c" +
      "hulaId\022(\n\020is_chula_student\030\007 \001(\010R\016isChul" +
      "aStudent\022*\n\006gender\030\010 \001(\0162\022.hts.common.Ge" +
      "nderR\006gender\0226\n\007address\030\t \001(\0132\034.google.p" +
      "rotobuf.StringValueR\007address\022L\n\023profile_" +
      "picture_url\030\n \001(\0132\034.google.protobuf.Stri" +
      "ngValueR\021profilePictureUrl\022\033\n\tdid_setup\030" +
      "\013 \001(\010R\010didSetup\0228\n\010district\030\014 \001(\0132\034.goog" +
      "le.protobuf.StringValueR\010district\0227\n\010zip" +
      "_code\030\r \001(\0132\034.google.protobuf.StringValu" +
      "eR\007zipCode\022?\n\014phone_number\030\016 \001(\0132\034.googl" +
      "e.protobuf.StringValueR\013phoneNumber\0228\n\010p" +
      "rovince\030\017 \001(\0132\034.google.protobuf.StringVa" +
      "lueR\010province\022@\n\racademic_year\030\020 \001(\0132\033.g" +
      "oogle.protobuf.Int32ValueR\014academicYear\"" +
      "\240\010\n\014Organization\022\016\n\002id\030\001 \001(\005R\002id\022\022\n\004name" +
      "\030\002 \001(\tR\004name\022\037\n\013is_verified\030\003 \001(\010R\nisVer" +
      "ified\022@\n\014abbreviation\030\004 \001(\0132\034.google.pro" +
      "tobuf.StringValueR\014abbreviation\0226\n\007advis" +
      "or\030\005 \001(\0132\034.google.protobuf.StringValueR\007" +
      "advisor\022K\n\022associated_faculty\030\006 \001(\0132\034.go" +
      "ogle.protobuf.StringValueR\021associatedFac" +
      "ulty\022>\n\013description\030\007 \001(\0132\034.google.proto" +
      "buf.StringValueR\013description\022A\n\rfacebook" +
      "_page\030\010 \001(\0132\034.google.protobuf.StringValu" +
      "eR\014facebookPage\022:\n\tinstagram\030\t \001(\0132\034.goo" +
      "gle.protobuf.StringValueR\tinstagram\022P\n\025l" +
      "ine_official_account\030\n \001(\0132\034.google.prot" +
      "obuf.StringValueR\023lineOfficialAccount\0222\n" +
      "\005email\030\013 \001(\0132\034.google.protobuf.StringVal" +
      "ueR\005email\022H\n\021contact_full_name\030\014 \001(\0132\034.g" +
      "oogle.protobuf.StringValueR\017contactFullN" +
      "ame\022A\n\rcontact_email\030\r \001(\0132\034.google.prot" +
      "obuf.StringValueR\014contactEmail\022N\n\024contac" +
      "t_phone_number\030\016 \001(\0132\034.google.protobuf.S" +
      "tringValueR\022contactPhoneNumber\022D\n\017contac" +
      "t_line_id\030\017 \001(\0132\034.google.protobuf.String" +
      "ValueR\rcontactLineId\022L\n\023profile_picture_" +
      "url\030\020 \001(\0132\034.google.protobuf.StringValueR" +
      "\021profilePictureUrl\022N\n\024profile_picture_ha" +
      "sh\030\021 \001(\0132\034.google.protobuf.StringValueR\022" +
      "profilePictureHash\"\225\001\n\rQuestionGroup\022\016\n\002" +
      "id\030\001 \001(\005R\002id\022\031\n\010event_id\030\002 \001(\005R\007eventId\022" +
      "1\n\004type\030\003 \001(\0162\035.hts.common.QuestionGroup" +
      "TypeR\004type\022\020\n\003seq\030\004 \001(\005R\003seq\022\024\n\005title\030\005 " +
      "\001(\tR\005title\"\344\001\n\010Question\022\016\n\002id\030\001 \001(\005R\002id\022" +
      "*\n\021question_group_id\030\002 \001(\005R\017questionGrou" +
      "pId\022\020\n\003seq\030\003 \001(\005R\003seq\0227\n\013answer_type\030\004 \001" +
      "(\0162\026.hts.common.AnswerTypeR\nanswerType\022\037" +
      "\n\013is_optional\030\005 \001(\010R\nisOptional\022\024\n\005title" +
      "\030\006 \001(\tR\005title\022\032\n\010subtitle\030\007 \001(\tR\010subtitl" +
      "e\"d\n\020UserOrganization\022\016\n\002id\030\001 \001(\005R\002id\022\027\n" +
      "\007user_id\030\002 \001(\005R\006userId\022\'\n\017organization_i" +
      "d\030\003 \001(\005R\016organizationId\"\311\005\n\005Event\022\016\n\002id\030" +
      "\001 \001(\005R\002id\022\'\n\017organization_id\030\002 \001(\005R\016orga" +
      "nizationId\022<\n\013location_id\030\003 \001(\0132\033.google" +
      ".protobuf.Int32ValueR\nlocationId\022 \n\013desc" +
      "ription\030\004 \001(\tR\013description\022\022\n\004name\030\005 \001(\t" +
      "R\004name\022D\n\017cover_image_url\030\006 \001(\0132\034.google" +
      ".protobuf.StringValueR\rcoverImageUrl\022F\n\020" +
      "cover_image_hash\030\007 \001(\0132\034.google.protobuf" +
      ".StringValueR\016coverImageHash\022F\n\020poster_i" +
      "mage_url\030\010 \001(\0132\034.google.protobuf.StringV" +
      "alueR\016posterImageUrl\022H\n\021poster_image_has" +
      "h\030\t \001(\0132\034.google.protobuf.StringValueR\017p" +
      "osterImageHash\0226\n\007contact\030\n \001(\0132\034.google" +
      ".protobuf.StringValueR\007contact\022H\n\021profil" +
      "e_image_url\030\013 \001(\0132\034.google.protobuf.Stri" +
      "ngValueR\017profileImageUrl\022J\n\022profile_imag" +
      "e_hash\030\014 \001(\0132\034.google.protobuf.StringVal" +
      "ueR\020profileImageHash\022%\n\016attendee_limit\030\r" +
      " \001(\005R\rattendeeLimit\"\324\002\n\010Location\022\016\n\002id\030\001" +
      " \001(\005R\002id\022\022\n\004name\030\002 \001(\tR\004name\022$\n\016google_m" +
      "ap_url\030\003 \001(\tR\014googleMapUrl\022>\n\013descriptio" +
      "n\030\004 \001(\0132\034.google.protobuf.StringValueR\013d" +
      "escription\022]\n\034travel_information_image_u" +
      "rl\030\005 \001(\0132\034.google.protobuf.StringValueR\031" +
      "travelInformationImageUrl\022_\n\035travel_info" +
      "rmation_image_hash\030\006 \001(\0132\034.google.protob" +
      "uf.StringValueR\032travelInformationImageHa" +
      "sh\"s\n\006Answer\022\016\n\002id\030\001 \001(\005R\002id\022\"\n\ruser_eve" +
      "nt_id\030\002 \001(\005R\013userEventId\022\037\n\013question_id\030" +
      "\003 \001(\005R\nquestionId\022\024\n\005value\030\004 \001(\tR\005value\"" +
      "\334\002\n\tUserEvent\022\016\n\002id\030\001 \001(\005R\002id\022\027\n\007user_id" +
      "\030\002 \001(\005R\006userId\022\031\n\010event_id\030\003 \001(\005R\007eventI" +
      "d\0223\n\006rating\030\004 \001(\0132\033.google.protobuf.Int3" +
      "2ValueR\006rating\0224\n\006ticket\030\005 \001(\0132\034.google." +
      "protobuf.StringValueR\006ticket\0224\n\006status\030\006" +
      " \001(\0162\034.hts.common.UserEvent.StatusR\006stat" +
      "us\022\037\n\013is_internal\030\007 \001(\010R\nisInternal\"I\n\006S" +
      "tatus\022\026\n\022STATUS_UNSPECIFIED\020\000\022\013\n\007PENDING" +
      "\020\001\022\014\n\010APPROVED\020\002\022\014\n\010REJECTED\020\003\"\240\001\n\rEvent" +
      "Duration\022\016\n\002id\030\001 \001(\005R\002id\022\031\n\010event_id\030\002 \001" +
      "(\005R\007eventId\0220\n\005start\030\003 \001(\0132\032.google.prot" +
      "obuf.TimestampR\005start\0222\n\006finish\030\004 \001(\0132\032." +
      "google.protobuf.TimestampR\006finish\")\n\003Tag" +
      "\022\016\n\002id\030\001 \001(\005R\002id\022\022\n\004name\030\002 \001(\tR\004name\"L\n\010" +
      "EventTag\022\016\n\002id\030\001 \001(\005R\002id\022\031\n\010event_id\030\002 \001" +
      "(\005R\007eventId\022\025\n\006tag_id\030\003 \001(\005R\005tagId\"\211\001\n\026O" +
      "rganizationPermission\022\016\n\002id\030\001 \001(\005R\002id\022\'\n" +
      "\017organization_id\030\002 \001(\005R\016organizationId\0226" +
      "\n\npermission\030\003 \001(\0162\026.hts.common.Permissi" +
      "onR\npermission\"z\n\016UserPermission\022\016\n\002id\030\001" +
      " \001(\005R\002id\022\027\n\007user_id\030\002 \001(\005R\006userId\022?\n\017per" +
      "mission_name\030\003 \001(\0162\026.hts.common.Permissi" +
      "onR\016permissionName\"M\n\014UserInterest\022\016\n\002id" +
      "\030\001 \001(\005R\002id\022\026\n\006userId\030\002 \001(\005R\006userId\022\025\n\006ta" +
      "g_id\030\003 \001(\005R\005tagId\"\215\003\n\017FacilityRequest\022\016\n" +
      "\002id\030\001 \001(\005R\002id\022\031\n\010event_id\030\002 \001(\005R\007eventId" +
      "\022\037\n\013facility_id\030\003 \001(\005R\nfacilityId\022:\n\006sta" +
      "tus\030\004 \001(\0162\".hts.common.FacilityRequest.S" +
      "tatusR\006status\022A\n\rreject_reason\030\005 \001(\0132\034.g" +
      "oogle.protobuf.StringValueR\014rejectReason" +
      "\0220\n\005start\030\006 \001(\0132\032.google.protobuf.Timest" +
      "ampR\005start\0222\n\006finish\030\007 \001(\0132\032.google.prot" +
      "obuf.TimestampR\006finish\"I\n\006Status\022\026\n\022STAT" +
      "US_UNSPECIFIED\020\000\022\013\n\007PENDING\020\001\022\014\n\010APPROVE" +
      "D\020\002\022\014\n\010REJECTED\020\003\"\367\001\n\010Facility\022\016\n\002id\030\001 \001" +
      "(\005R\002id\022\'\n\017organization_id\030\002 \001(\005R\016organiz" +
      "ationId\022\022\n\004name\030\003 \001(\tR\004name\022\032\n\010latitude\030" +
      "\004 \001(\001R\010latitude\022\034\n\tlongitude\030\005 \001(\001R\tlong" +
      "itude\022B\n\017operating_hours\030\006 \003(\0132\031.hts.com" +
      "mon.OperatingHourR\016operatingHours\022 \n\013des" +
      "cription\030\007 \001(\tR\013description\"&\n\024GetObject" +
      "ByIdRequest\022\016\n\002id\030\001 \001(\005R\002id*g\n\tDayOfWeek" +
      "\022\033\n\027DAY_OF_WEEK_UNSPECIFIED\020\000\022\007\n\003SUN\020\001\022\007" +
      "\n\003MON\020\002\022\007\n\003TUE\020\003\022\007\n\003WED\020\004\022\007\n\003THU\020\005\022\007\n\003FR" +
      "I\020\006\022\007\n\003SAT\020\007*>\n\nAnswerType\022\033\n\027ANSWER_TYP" +
      "E_UNSPECIFIED\020\000\022\t\n\005SCALE\020\001\022\010\n\004TEXT\020\002*W\n\021" +
      "QuestionGroupType\022#\n\037QUESTION_GROUP_TYPE" +
      "_UNSPECIFIED\020\000\022\r\n\tPRE_EVENT\020\001\022\016\n\nPOST_EV" +
      "ENT\020\002*6\n\006Gender\022\026\n\022GENDER_UNSPECIFIED\020\000\022" +
      "\005\n\001M\020\001\022\005\n\001F\020\002\022\006\n\002NS\020\003*\302\002\n\nPermission\022\032\n\026" +
      "PERMISSION_UNSPECIFIED\020\000\022\027\n\023ORGANIZATION" +
      "_UPDATE\020\001\022\027\n\023ORGANIZATION_REMOVE\020\002\022\033\n\027OR" +
      "GANIZATION_MEMBER_ADD\020\003\022\036\n\032ORGANIZATION_" +
      "MEMBER_REMOVE\020\004\022\020\n\014EVENT_CREATE\020\005\022\020\n\014EVE" +
      "NT_UPDATE\020\006\022\020\n\014EVENT_REMOVE\020\007\022\016\n\nTAG_CRE" +
      "ATE\020\010\022\016\n\nTAG_REMOVE\020\t\022\024\n\020EVENT_TAG_UPDAT" +
      "E\020\n\022\023\n\017FACILITY_CREATE\020\013\022\023\n\017FACILITY_UPD" +
      "ATE\020\014\022\023\n\017FACILITY_REMOVE\020\rBB\n\020app.onepas" +
      "s.apisB\013CommonProtoP\001Z\037onepass.app/facil" +
      "ity/hts/commonb\006proto3"
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
    internal_static_hts_common_User_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_hts_common_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_common_User_descriptor,
        new java.lang.String[] { "Id", "FirstName", "LastName", "Email", "Nickname", "ChulaId", "IsChulaStudent", "Gender", "Address", "ProfilePictureUrl", "DidSetup", "District", "ZipCode", "PhoneNumber", "Province", "AcademicYear", });
    internal_static_hts_common_Organization_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_hts_common_Organization_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_common_Organization_descriptor,
        new java.lang.String[] { "Id", "Name", "IsVerified", "Abbreviation", "Advisor", "AssociatedFaculty", "Description", "FacebookPage", "Instagram", "LineOfficialAccount", "Email", "ContactFullName", "ContactEmail", "ContactPhoneNumber", "ContactLineId", "ProfilePictureUrl", "ProfilePictureHash", });
    internal_static_hts_common_QuestionGroup_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_hts_common_QuestionGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_common_QuestionGroup_descriptor,
        new java.lang.String[] { "Id", "EventId", "Type", "Seq", "Title", });
    internal_static_hts_common_Question_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_hts_common_Question_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_common_Question_descriptor,
        new java.lang.String[] { "Id", "QuestionGroupId", "Seq", "AnswerType", "IsOptional", "Title", "Subtitle", });
    internal_static_hts_common_UserOrganization_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_hts_common_UserOrganization_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_common_UserOrganization_descriptor,
        new java.lang.String[] { "Id", "UserId", "OrganizationId", });
    internal_static_hts_common_Event_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_hts_common_Event_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_common_Event_descriptor,
        new java.lang.String[] { "Id", "OrganizationId", "LocationId", "Description", "Name", "CoverImageUrl", "CoverImageHash", "PosterImageUrl", "PosterImageHash", "Contact", "ProfileImageUrl", "ProfileImageHash", "AttendeeLimit", });
    internal_static_hts_common_Location_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_hts_common_Location_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_common_Location_descriptor,
        new java.lang.String[] { "Id", "Name", "GoogleMapUrl", "Description", "TravelInformationImageUrl", "TravelInformationImageHash", });
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
        new java.lang.String[] { "Id", "UserId", "EventId", "Rating", "Ticket", "Status", "IsInternal", });
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
        new java.lang.String[] { "Id", "UserId", "PermissionName", });
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
    internal_static_hts_common_GetObjectByIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(18);
    internal_static_hts_common_GetObjectByIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_common_GetObjectByIdRequest_descriptor,
        new java.lang.String[] { "Id", });
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
