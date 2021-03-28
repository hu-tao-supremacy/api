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
      ".proto\"C\n\022AccessTokenPayload\022\027\n\007user_id\030" +
      "\001 \001(\003R\006userId\022\024\n\005email\030\002 \001(\tR\005email\";\n\026I" +
      "sAuthenticatedRequest\022!\n\014access_token\030\001 " +
      "\001(\tR\013accessToken\"5\n\032GenerateAccessTokenR" +
      "equest\022\027\n\007user_id\030\001 \001(\003R\006userId\"@\n\033Gener" +
      "ateAccessTokenResponse\022!\n\014access_token\030\001" +
      " \001(\tR\013accessToken\"\231\001\n\024HasPermissionReque" +
      "st\022\027\n\007user_id\030\001 \001(\003R\006userId\022\'\n\017organizat" +
      "ion_id\030\002 \001(\003R\016organizationId\022?\n\017permissi" +
      "on_name\030\003 \001(\0162\026.hts.common.PermissionR\016p" +
      "ermissionName2\333\003\n\016AccountService\022F\n\020GetU" +
      "serByChulaId\022 .hts.common.GetObjectByIdR" +
      "equest\032\020.hts.common.User\022R\n\017IsAuthentica" +
      "ted\022#.hts.account.IsAuthenticatedRequest" +
      "\032\032.google.protobuf.BoolValue\0227\n\021UpdateAc" +
      "countInfo\022\020.hts.common.User\032\020.hts.common" +
      ".User\022h\n\023GenerateAccessToken\022\'.hts.accou" +
      "nt.GenerateAccessTokenRequest\032(.hts.acco" +
      "unt.GenerateAccessTokenResponse\022N\n\rHasPe" +
      "rmission\022!.hts.account.HasPermissionRequ" +
      "est\032\032.google.protobuf.BoolValue\022:\n\004Ping\022" +
      "\026.google.protobuf.Empty\032\032.google.protobu" +
      "f.BoolValueBD\n\020app.onepass.apisB\014Account" +
      "ProtoP\001Z onepass.app/facility/hts/accoun" +
      "tb\006proto3"
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
        new java.lang.String[] { "UserId", "Email", });
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
    app.onepass.apis.CommonProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
