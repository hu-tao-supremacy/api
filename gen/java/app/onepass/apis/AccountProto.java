// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hts/account/service.proto

package app.onepass.apis;

public final class AccountProto {
  private AccountProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_account_AccessTokenPayload_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_account_AccessTokenPayload_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_account_IsAuthenticatedRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_account_IsAuthenticatedRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_account_GenerateAccessTokenRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_account_GenerateAccessTokenRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_account_GenerateAccessTokenResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_account_GenerateAccessTokenResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_account_HasPermissionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_account_HasPermissionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_account_CreateUserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_account_CreateUserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_account_GetUserByChulaIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_account_GetUserByChulaIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_account_GetUserByEmailRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_account_GetUserByEmailRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_account_AssignRoleRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_account_AssignRoleRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_account_RemoveRoleRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_account_RemoveRoleRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_account_SetInterestedTagsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_account_SetInterestedTagsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_account_SetInterestedEventsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_account_SetInterestedEventsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_account_GetUserOrganizationsByUserIdResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_account_GetUserOrganizationsByUserIdResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_account_GetUserOrganizationsByOrganizationIdResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_account_GetUserOrganizationsByOrganizationIdResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031hts/account/service.proto\022\013hts.account" +
      "\032\027hts/common/common.proto\032\033google/protob" +
      "uf/empty.proto\032\036google/protobuf/wrappers" +
      ".proto\"-\n\022AccessTokenPayload\022\027\n\007user_id\030" +
      "\001 \001(\005R\006userId\";\n\026IsAuthenticatedRequest\022" +
      "!\n\014access_token\030\001 \001(\tR\013accessToken\"5\n\032Ge" +
      "nerateAccessTokenRequest\022\027\n\007user_id\030\001 \001(" +
      "\005R\006userId\"@\n\033GenerateAccessTokenResponse" +
      "\022!\n\014access_token\030\001 \001(\tR\013accessToken\"\231\001\n\024" +
      "HasPermissionRequest\022\027\n\007user_id\030\001 \001(\005R\006u" +
      "serId\022\'\n\017organization_id\030\002 \001(\005R\016organiza" +
      "tionId\022?\n\017permission_name\030\003 \001(\0162\026.hts.co" +
      "mmon.PermissionR\016permissionName\"\252\001\n\021Crea" +
      "teUserRequest\022\035\n\nfirst_name\030\001 \001(\tR\tfirst" +
      "Name\022\033\n\tlast_name\030\002 \001(\tR\010lastName\022\031\n\010chu" +
      "la_id\030\003 \001(\tR\007chulaId\022\024\n\005email\030\004 \001(\tR\005ema" +
      "il\022(\n\020is_chula_student\030\005 \001(\010R\016isChulaStu" +
      "dent\")\n\027GetUserByChulaIdRequest\022\016\n\002id\030\001 " +
      "\001(\tR\002id\"-\n\025GetUserByEmailRequest\022\024\n\005emai" +
      "l\030\001 \001(\tR\005email\"|\n\021AssignRoleRequest\022\027\n\007u" +
      "ser_id\030\001 \001(\005R\006userId\022\'\n\017organization_id\030" +
      "\002 \001(\005R\016organizationId\022%\n\004role\030\003 \001(\0162\021.ht" +
      "s.account.RoleR\004role\"|\n\021RemoveRoleReques" +
      "t\022\027\n\007user_id\030\001 \001(\005R\006userId\022\'\n\017organizati" +
      "on_id\030\002 \001(\005R\016organizationId\022%\n\004role\030\003 \001(" +
      "\0162\021.hts.account.RoleR\004role\"L\n\030SetInteres" +
      "tedTagsRequest\022\027\n\007user_id\030\001 \001(\005R\006userId\022" +
      "\027\n\007tag_ids\030\002 \003(\005R\006tagIds\"R\n\032SetIntereste" +
      "dEventsRequest\022\027\n\007user_id\030\001 \001(\005R\006userId\022" +
      "\033\n\tevent_ids\030\002 \003(\005R\010eventIds\"s\n$GetUserO" +
      "rganizationsByUserIdResponse\022K\n\022user_org" +
      "anizations\030\001 \003(\0132\034.hts.common.UserOrgani" +
      "zationR\021userOrganizations\"{\n,GetUserOrga" +
      "nizationsByOrganizationIdResponse\022K\n\022use" +
      "r_organizations\030\001 \003(\0132\034.hts.common.UserO" +
      "rganizationR\021userOrganizations*f\n\004Role\022\024" +
      "\n\020ROLE_UNSPECIFIED\020\000\022\026\n\022ORGANIZATION_OWN" +
      "ER\020\001\022\027\n\023ORGANIZATION_EDITOR\020\002\022\027\n\023ORGANIZ" +
      "ATION_MEMBER\020\0032\331\t\n\016AccountService\022>\n\nCre" +
      "ateUser\022\036.hts.account.CreateUserRequest\032" +
      "\020.hts.common.User\022J\n\020GetUserByChulaId\022$." +
      "hts.account.GetUserByChulaIdRequest\032\020.ht" +
      "s.common.User\022F\n\016GetUserByEmail\022\".hts.ac" +
      "count.GetUserByEmailRequest\032\020.hts.common" +
      ".User\022R\n\017IsAuthenticated\022#.hts.account.I" +
      "sAuthenticatedRequest\032\032.google.protobuf." +
      "BoolValue\0227\n\021UpdateAccountInfo\022\020.hts.com" +
      "mon.User\032\020.hts.common.User\022L\n\021SetInteres" +
      "tedTags\022%.hts.account.SetInterestedTagsR" +
      "equest\032\020.hts.common.User\022P\n\023SetIntereste" +
      "dEvents\022\'.hts.account.SetInterestedEvent" +
      "sRequest\032\020.hts.common.User\022A\n\013GetUserByI" +
      "d\022 .hts.common.GetObjectByIdRequest\032\020.ht" +
      "s.common.User\022h\n\023GenerateAccessToken\022\'.h" +
      "ts.account.GenerateAccessTokenRequest\032(." +
      "hts.account.GenerateAccessTokenResponse\022" +
      "N\n\rHasPermission\022!.hts.account.HasPermis" +
      "sionRequest\032\032.google.protobuf.BoolValue\022" +
      "H\n\nAssignRole\022\036.hts.account.AssignRoleRe" +
      "quest\032\032.google.protobuf.BoolValue\022H\n\nRem" +
      "oveRole\022\036.hts.account.RemoveRoleRequest\032" +
      "\032.google.protobuf.BoolValue\022s\n\034GetUserOr" +
      "ganizationsByUserId\022 .hts.common.GetObje" +
      "ctByIdRequest\0321.hts.account.GetUserOrgan" +
      "izationsByUserIdResponse\022\203\001\n$GetUserOrga" +
      "nizationsByOrganizationId\022 .hts.common.G" +
      "etObjectByIdRequest\0329.hts.account.GetUse" +
      "rOrganizationsByOrganizationIdResponse\022:" +
      "\n\004Ping\022\026.google.protobuf.Empty\032\032.google." +
      "protobuf.BoolValueBD\n\020app.onepass.apisB\014" +
      "AccountProtoP\001Z onepass.app/facility/hts" +
      "/accountb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          app.onepass.apis.CommonProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_hts_account_AccessTokenPayload_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hts_account_AccessTokenPayload_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_account_AccessTokenPayload_descriptor,
        new java.lang.String[] { "UserId", });
    internal_static_hts_account_IsAuthenticatedRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_hts_account_IsAuthenticatedRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_account_IsAuthenticatedRequest_descriptor,
        new java.lang.String[] { "AccessToken", });
    internal_static_hts_account_GenerateAccessTokenRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_hts_account_GenerateAccessTokenRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_account_GenerateAccessTokenRequest_descriptor,
        new java.lang.String[] { "UserId", });
    internal_static_hts_account_GenerateAccessTokenResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_hts_account_GenerateAccessTokenResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_account_GenerateAccessTokenResponse_descriptor,
        new java.lang.String[] { "AccessToken", });
    internal_static_hts_account_HasPermissionRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_hts_account_HasPermissionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_account_HasPermissionRequest_descriptor,
        new java.lang.String[] { "UserId", "OrganizationId", "PermissionName", });
    internal_static_hts_account_CreateUserRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_hts_account_CreateUserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_account_CreateUserRequest_descriptor,
        new java.lang.String[] { "FirstName", "LastName", "ChulaId", "Email", "IsChulaStudent", });
    internal_static_hts_account_GetUserByChulaIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_hts_account_GetUserByChulaIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_account_GetUserByChulaIdRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_hts_account_GetUserByEmailRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_hts_account_GetUserByEmailRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_account_GetUserByEmailRequest_descriptor,
        new java.lang.String[] { "Email", });
    internal_static_hts_account_AssignRoleRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_hts_account_AssignRoleRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_account_AssignRoleRequest_descriptor,
        new java.lang.String[] { "UserId", "OrganizationId", "Role", });
    internal_static_hts_account_RemoveRoleRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_hts_account_RemoveRoleRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_account_RemoveRoleRequest_descriptor,
        new java.lang.String[] { "UserId", "OrganizationId", "Role", });
    internal_static_hts_account_SetInterestedTagsRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_hts_account_SetInterestedTagsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_account_SetInterestedTagsRequest_descriptor,
        new java.lang.String[] { "UserId", "TagIds", });
    internal_static_hts_account_SetInterestedEventsRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_hts_account_SetInterestedEventsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_account_SetInterestedEventsRequest_descriptor,
        new java.lang.String[] { "UserId", "EventIds", });
    internal_static_hts_account_GetUserOrganizationsByUserIdResponse_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_hts_account_GetUserOrganizationsByUserIdResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_account_GetUserOrganizationsByUserIdResponse_descriptor,
        new java.lang.String[] { "UserOrganizations", });
    internal_static_hts_account_GetUserOrganizationsByOrganizationIdResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_hts_account_GetUserOrganizationsByOrganizationIdResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_account_GetUserOrganizationsByOrganizationIdResponse_descriptor,
        new java.lang.String[] { "UserOrganizations", });
    app.onepass.apis.CommonProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
