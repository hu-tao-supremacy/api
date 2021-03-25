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
    internal_static_hts_account_IsAuthenticatedRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_account_IsAuthenticatedRequest_fieldAccessorTable;
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
      ".proto\";\n\026IsAuthenticatedRequest\022!\n\014acce" +
      "ss_token\030\001 \001(\tR\013accessToken\"@\n\033GenerateA" +
      "ccessTokenResponse\022!\n\014access_token\030\001 \001(\t" +
      "R\013accessToken\"\231\001\n\024HasPermissionRequest\022\027" +
      "\n\007user_id\030\001 \001(\003R\006userId\022\'\n\017organization_" +
      "id\030\002 \001(\003R\016organizationId\022?\n\017permission_n" +
      "ame\030\003 \001(\0162\026.hts.common.PermissionR\016permi" +
      "ssionName2\374\002\n\016AccountService\022R\n\017IsAuthen" +
      "ticated\022#.hts.account.IsAuthenticatedReq" +
      "uest\032\032.google.protobuf.BoolValue\0227\n\021Upda" +
      "teAccountInfo\022\020.hts.common.User\032\020.hts.co" +
      "mmon.User\022Q\n\023GenerateAccessToken\022\020.hts.c" +
      "ommon.User\032(.hts.account.GenerateAccessT" +
      "okenResponse\022N\n\rHasPermission\022!.hts.acco" +
      "unt.HasPermissionRequest\032\032.google.protob" +
      "uf.BoolValue\022:\n\004Ping\022\026.google.protobuf.E" +
      "mpty\032\032.google.protobuf.BoolValueBD\n\020app." +
      "onepass.apisB\014AccountProtoP\001Z onepass.ap" +
      "p/facility/hts/accountb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          app.onepass.apis.CommonProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_hts_account_IsAuthenticatedRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hts_account_IsAuthenticatedRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_account_IsAuthenticatedRequest_descriptor,
        new java.lang.String[] { "AccessToken", });
    internal_static_hts_account_GenerateAccessTokenResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_hts_account_GenerateAccessTokenResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_account_GenerateAccessTokenResponse_descriptor,
        new java.lang.String[] { "AccessToken", });
    internal_static_hts_account_HasPermissionRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
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
