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
    internal_static_hts_account_UpdateAccountInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_account_UpdateAccountInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_account_UpdateAccountInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_account_UpdateAccountInfoResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_account_GenerateJWTRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_account_GenerateJWTRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hts_account_InvalidateJWTRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hts_account_InvalidateJWTRequest_fieldAccessorTable;
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
      "uf/empty.proto\";\n\026IsAuthenticatedRequest" +
      "\022!\n\014access_token\030\001 \001(\tR\013accessToken\"@\n\030U" +
      "pdateAccountInfoRequest\022$\n\004user\030\001 \001(\0132\020." +
      "hts.common.UserR\004user\"A\n\031UpdateAccountIn" +
      "foResponse\022$\n\004user\030\001 \001(\0132\020.hts.common.Us" +
      "erR\004user\":\n\022GenerateJWTRequest\022$\n\004user\030\001" +
      " \001(\0132\020.hts.common.UserR\004user\"9\n\024Invalida" +
      "teJWTRequest\022!\n\014access_token\030\001 \001(\tR\013acce" +
      "ssToken\"\231\001\n\024HasPermissionRequest\022\027\n\007user" +
      "_id\030\001 \001(\003R\006userId\022\'\n\017organization_id\030\002 \001" +
      "(\003R\016organizationId\022?\n\017permission_name\030\003 " +
      "\001(\0162\026.hts.common.PermissionR\016permissionN" +
      "ame2\310\003\n\016AccountService\022J\n\017IsAuthenticate" +
      "d\022#.hts.account.IsAuthenticatedRequest\032\022" +
      ".hts.common.Result\022b\n\021UpdateAccountInfo\022" +
      "%.hts.account.UpdateAccountInfoRequest\032&" +
      ".hts.account.UpdateAccountInfoResponse\022B" +
      "\n\013GenerateJWT\022\037.hts.account.GenerateJWTR" +
      "equest\032\022.hts.common.Result\022F\n\rInvalidate" +
      "JWT\022!.hts.account.InvalidateJWTRequest\032\022" +
      ".hts.common.Result\022F\n\rHasPermission\022!.ht" +
      "s.account.HasPermissionRequest\032\022.hts.com" +
      "mon.Result\0222\n\004Ping\022\026.google.protobuf.Emp" +
      "ty\032\022.hts.common.ResultBD\n\020app.onepass.ap" +
      "isB\014AccountProtoP\001Z onepass.app/facility" +
      "/hts/accountb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          app.onepass.apis.CommonProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    internal_static_hts_account_IsAuthenticatedRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hts_account_IsAuthenticatedRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_account_IsAuthenticatedRequest_descriptor,
        new java.lang.String[] { "AccessToken", });
    internal_static_hts_account_UpdateAccountInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_hts_account_UpdateAccountInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_account_UpdateAccountInfoRequest_descriptor,
        new java.lang.String[] { "User", });
    internal_static_hts_account_UpdateAccountInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_hts_account_UpdateAccountInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_account_UpdateAccountInfoResponse_descriptor,
        new java.lang.String[] { "User", });
    internal_static_hts_account_GenerateJWTRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_hts_account_GenerateJWTRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_account_GenerateJWTRequest_descriptor,
        new java.lang.String[] { "User", });
    internal_static_hts_account_InvalidateJWTRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_hts_account_InvalidateJWTRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_account_InvalidateJWTRequest_descriptor,
        new java.lang.String[] { "AccessToken", });
    internal_static_hts_account_HasPermissionRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_hts_account_HasPermissionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hts_account_HasPermissionRequest_descriptor,
        new java.lang.String[] { "UserId", "OrganizationId", "PermissionName", });
    app.onepass.apis.CommonProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
