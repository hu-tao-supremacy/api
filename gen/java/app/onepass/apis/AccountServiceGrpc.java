package app.onepass.apis;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: hts/account/service.proto")
public final class AccountServiceGrpc {

  private AccountServiceGrpc() {}

  public static final String SERVICE_NAME = "hts.account.AccountService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.CreateUserRequest,
      app.onepass.apis.User> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUser",
      requestType = app.onepass.apis.CreateUserRequest.class,
      responseType = app.onepass.apis.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.CreateUserRequest,
      app.onepass.apis.User> getCreateUserMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.CreateUserRequest, app.onepass.apis.User> getCreateUserMethod;
    if ((getCreateUserMethod = AccountServiceGrpc.getCreateUserMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getCreateUserMethod = AccountServiceGrpc.getCreateUserMethod) == null) {
          AccountServiceGrpc.getCreateUserMethod = getCreateUserMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.CreateUserRequest, app.onepass.apis.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.CreateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.User.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("CreateUser"))
              .build();
        }
      }
    }
    return getCreateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.SearchUserRequest,
      app.onepass.apis.SearchUserResponse> getSearchUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchUser",
      requestType = app.onepass.apis.SearchUserRequest.class,
      responseType = app.onepass.apis.SearchUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.SearchUserRequest,
      app.onepass.apis.SearchUserResponse> getSearchUserMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.SearchUserRequest, app.onepass.apis.SearchUserResponse> getSearchUserMethod;
    if ((getSearchUserMethod = AccountServiceGrpc.getSearchUserMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getSearchUserMethod = AccountServiceGrpc.getSearchUserMethod) == null) {
          AccountServiceGrpc.getSearchUserMethod = getSearchUserMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.SearchUserRequest, app.onepass.apis.SearchUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.SearchUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.SearchUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("SearchUser"))
              .build();
        }
      }
    }
    return getSearchUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GetUserByChulaIdRequest,
      app.onepass.apis.User> getGetUserByChulaIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserByChulaId",
      requestType = app.onepass.apis.GetUserByChulaIdRequest.class,
      responseType = app.onepass.apis.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GetUserByChulaIdRequest,
      app.onepass.apis.User> getGetUserByChulaIdMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GetUserByChulaIdRequest, app.onepass.apis.User> getGetUserByChulaIdMethod;
    if ((getGetUserByChulaIdMethod = AccountServiceGrpc.getGetUserByChulaIdMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getGetUserByChulaIdMethod = AccountServiceGrpc.getGetUserByChulaIdMethod) == null) {
          AccountServiceGrpc.getGetUserByChulaIdMethod = getGetUserByChulaIdMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GetUserByChulaIdRequest, app.onepass.apis.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserByChulaId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetUserByChulaIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.User.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("GetUserByChulaId"))
              .build();
        }
      }
    }
    return getGetUserByChulaIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GetUserByEmailRequest,
      app.onepass.apis.User> getGetUserByEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserByEmail",
      requestType = app.onepass.apis.GetUserByEmailRequest.class,
      responseType = app.onepass.apis.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GetUserByEmailRequest,
      app.onepass.apis.User> getGetUserByEmailMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GetUserByEmailRequest, app.onepass.apis.User> getGetUserByEmailMethod;
    if ((getGetUserByEmailMethod = AccountServiceGrpc.getGetUserByEmailMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getGetUserByEmailMethod = AccountServiceGrpc.getGetUserByEmailMethod) == null) {
          AccountServiceGrpc.getGetUserByEmailMethod = getGetUserByEmailMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GetUserByEmailRequest, app.onepass.apis.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserByEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetUserByEmailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.User.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("GetUserByEmail"))
              .build();
        }
      }
    }
    return getGetUserByEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.IsAuthenticatedRequest,
      com.google.protobuf.BoolValue> getIsAuthenticatedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsAuthenticated",
      requestType = app.onepass.apis.IsAuthenticatedRequest.class,
      responseType = com.google.protobuf.BoolValue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.IsAuthenticatedRequest,
      com.google.protobuf.BoolValue> getIsAuthenticatedMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.IsAuthenticatedRequest, com.google.protobuf.BoolValue> getIsAuthenticatedMethod;
    if ((getIsAuthenticatedMethod = AccountServiceGrpc.getIsAuthenticatedMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getIsAuthenticatedMethod = AccountServiceGrpc.getIsAuthenticatedMethod) == null) {
          AccountServiceGrpc.getIsAuthenticatedMethod = getIsAuthenticatedMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.IsAuthenticatedRequest, com.google.protobuf.BoolValue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsAuthenticated"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.IsAuthenticatedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.BoolValue.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("IsAuthenticated"))
              .build();
        }
      }
    }
    return getIsAuthenticatedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.User,
      app.onepass.apis.User> getUpdateAccountInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAccountInfo",
      requestType = app.onepass.apis.User.class,
      responseType = app.onepass.apis.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.User,
      app.onepass.apis.User> getUpdateAccountInfoMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.User, app.onepass.apis.User> getUpdateAccountInfoMethod;
    if ((getUpdateAccountInfoMethod = AccountServiceGrpc.getUpdateAccountInfoMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getUpdateAccountInfoMethod = AccountServiceGrpc.getUpdateAccountInfoMethod) == null) {
          AccountServiceGrpc.getUpdateAccountInfoMethod = getUpdateAccountInfoMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.User, app.onepass.apis.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAccountInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.User.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.User.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("UpdateAccountInfo"))
              .build();
        }
      }
    }
    return getUpdateAccountInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.SetInterestedTagsRequest,
      app.onepass.apis.User> getSetInterestedTagsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetInterestedTags",
      requestType = app.onepass.apis.SetInterestedTagsRequest.class,
      responseType = app.onepass.apis.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.SetInterestedTagsRequest,
      app.onepass.apis.User> getSetInterestedTagsMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.SetInterestedTagsRequest, app.onepass.apis.User> getSetInterestedTagsMethod;
    if ((getSetInterestedTagsMethod = AccountServiceGrpc.getSetInterestedTagsMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getSetInterestedTagsMethod = AccountServiceGrpc.getSetInterestedTagsMethod) == null) {
          AccountServiceGrpc.getSetInterestedTagsMethod = getSetInterestedTagsMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.SetInterestedTagsRequest, app.onepass.apis.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetInterestedTags"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.SetInterestedTagsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.User.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("SetInterestedTags"))
              .build();
        }
      }
    }
    return getSetInterestedTagsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.SetInterestedEventsRequest,
      app.onepass.apis.User> getSetInterestedEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetInterestedEvents",
      requestType = app.onepass.apis.SetInterestedEventsRequest.class,
      responseType = app.onepass.apis.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.SetInterestedEventsRequest,
      app.onepass.apis.User> getSetInterestedEventsMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.SetInterestedEventsRequest, app.onepass.apis.User> getSetInterestedEventsMethod;
    if ((getSetInterestedEventsMethod = AccountServiceGrpc.getSetInterestedEventsMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getSetInterestedEventsMethod = AccountServiceGrpc.getSetInterestedEventsMethod) == null) {
          AccountServiceGrpc.getSetInterestedEventsMethod = getSetInterestedEventsMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.SetInterestedEventsRequest, app.onepass.apis.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetInterestedEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.SetInterestedEventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.User.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("SetInterestedEvents"))
              .build();
        }
      }
    }
    return getSetInterestedEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest,
      app.onepass.apis.User> getGetUserByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserById",
      requestType = app.onepass.apis.GetObjectByIdRequest.class,
      responseType = app.onepass.apis.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest,
      app.onepass.apis.User> getGetUserByIdMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest, app.onepass.apis.User> getGetUserByIdMethod;
    if ((getGetUserByIdMethod = AccountServiceGrpc.getGetUserByIdMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getGetUserByIdMethod = AccountServiceGrpc.getGetUserByIdMethod) == null) {
          AccountServiceGrpc.getGetUserByIdMethod = getGetUserByIdMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GetObjectByIdRequest, app.onepass.apis.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetObjectByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.User.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("GetUserById"))
              .build();
        }
      }
    }
    return getGetUserByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GenerateAccessTokenRequest,
      app.onepass.apis.GenerateAccessTokenResponse> getGenerateAccessTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateAccessToken",
      requestType = app.onepass.apis.GenerateAccessTokenRequest.class,
      responseType = app.onepass.apis.GenerateAccessTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GenerateAccessTokenRequest,
      app.onepass.apis.GenerateAccessTokenResponse> getGenerateAccessTokenMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GenerateAccessTokenRequest, app.onepass.apis.GenerateAccessTokenResponse> getGenerateAccessTokenMethod;
    if ((getGenerateAccessTokenMethod = AccountServiceGrpc.getGenerateAccessTokenMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getGenerateAccessTokenMethod = AccountServiceGrpc.getGenerateAccessTokenMethod) == null) {
          AccountServiceGrpc.getGenerateAccessTokenMethod = getGenerateAccessTokenMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GenerateAccessTokenRequest, app.onepass.apis.GenerateAccessTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateAccessToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GenerateAccessTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GenerateAccessTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("GenerateAccessToken"))
              .build();
        }
      }
    }
    return getGenerateAccessTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.HasPermissionRequest,
      com.google.protobuf.BoolValue> getHasPermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HasPermission",
      requestType = app.onepass.apis.HasPermissionRequest.class,
      responseType = com.google.protobuf.BoolValue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.HasPermissionRequest,
      com.google.protobuf.BoolValue> getHasPermissionMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.HasPermissionRequest, com.google.protobuf.BoolValue> getHasPermissionMethod;
    if ((getHasPermissionMethod = AccountServiceGrpc.getHasPermissionMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getHasPermissionMethod = AccountServiceGrpc.getHasPermissionMethod) == null) {
          AccountServiceGrpc.getHasPermissionMethod = getHasPermissionMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.HasPermissionRequest, com.google.protobuf.BoolValue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HasPermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.HasPermissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.BoolValue.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("HasPermission"))
              .build();
        }
      }
    }
    return getHasPermissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.AssignRoleRequest,
      com.google.protobuf.BoolValue> getAssignRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignRole",
      requestType = app.onepass.apis.AssignRoleRequest.class,
      responseType = com.google.protobuf.BoolValue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.AssignRoleRequest,
      com.google.protobuf.BoolValue> getAssignRoleMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.AssignRoleRequest, com.google.protobuf.BoolValue> getAssignRoleMethod;
    if ((getAssignRoleMethod = AccountServiceGrpc.getAssignRoleMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getAssignRoleMethod = AccountServiceGrpc.getAssignRoleMethod) == null) {
          AccountServiceGrpc.getAssignRoleMethod = getAssignRoleMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.AssignRoleRequest, com.google.protobuf.BoolValue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.AssignRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.BoolValue.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("AssignRole"))
              .build();
        }
      }
    }
    return getAssignRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.RemoveRoleRequest,
      com.google.protobuf.BoolValue> getRemoveRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveRole",
      requestType = app.onepass.apis.RemoveRoleRequest.class,
      responseType = com.google.protobuf.BoolValue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.RemoveRoleRequest,
      com.google.protobuf.BoolValue> getRemoveRoleMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.RemoveRoleRequest, com.google.protobuf.BoolValue> getRemoveRoleMethod;
    if ((getRemoveRoleMethod = AccountServiceGrpc.getRemoveRoleMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getRemoveRoleMethod = AccountServiceGrpc.getRemoveRoleMethod) == null) {
          AccountServiceGrpc.getRemoveRoleMethod = getRemoveRoleMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.RemoveRoleRequest, com.google.protobuf.BoolValue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.RemoveRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.BoolValue.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("RemoveRole"))
              .build();
        }
      }
    }
    return getRemoveRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest,
      app.onepass.apis.GetUserOrganizationsByUserIdResponse> getGetUserOrganizationsByUserIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserOrganizationsByUserId",
      requestType = app.onepass.apis.GetObjectByIdRequest.class,
      responseType = app.onepass.apis.GetUserOrganizationsByUserIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest,
      app.onepass.apis.GetUserOrganizationsByUserIdResponse> getGetUserOrganizationsByUserIdMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest, app.onepass.apis.GetUserOrganizationsByUserIdResponse> getGetUserOrganizationsByUserIdMethod;
    if ((getGetUserOrganizationsByUserIdMethod = AccountServiceGrpc.getGetUserOrganizationsByUserIdMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getGetUserOrganizationsByUserIdMethod = AccountServiceGrpc.getGetUserOrganizationsByUserIdMethod) == null) {
          AccountServiceGrpc.getGetUserOrganizationsByUserIdMethod = getGetUserOrganizationsByUserIdMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GetObjectByIdRequest, app.onepass.apis.GetUserOrganizationsByUserIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserOrganizationsByUserId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetObjectByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetUserOrganizationsByUserIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("GetUserOrganizationsByUserId"))
              .build();
        }
      }
    }
    return getGetUserOrganizationsByUserIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest,
      app.onepass.apis.GetUserOrganizationsByOrganizationIdResponse> getGetUserOrganizationsByOrganizationIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserOrganizationsByOrganizationId",
      requestType = app.onepass.apis.GetObjectByIdRequest.class,
      responseType = app.onepass.apis.GetUserOrganizationsByOrganizationIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest,
      app.onepass.apis.GetUserOrganizationsByOrganizationIdResponse> getGetUserOrganizationsByOrganizationIdMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest, app.onepass.apis.GetUserOrganizationsByOrganizationIdResponse> getGetUserOrganizationsByOrganizationIdMethod;
    if ((getGetUserOrganizationsByOrganizationIdMethod = AccountServiceGrpc.getGetUserOrganizationsByOrganizationIdMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getGetUserOrganizationsByOrganizationIdMethod = AccountServiceGrpc.getGetUserOrganizationsByOrganizationIdMethod) == null) {
          AccountServiceGrpc.getGetUserOrganizationsByOrganizationIdMethod = getGetUserOrganizationsByOrganizationIdMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GetObjectByIdRequest, app.onepass.apis.GetUserOrganizationsByOrganizationIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserOrganizationsByOrganizationId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetObjectByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetUserOrganizationsByOrganizationIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("GetUserOrganizationsByOrganizationId"))
              .build();
        }
      }
    }
    return getGetUserOrganizationsByOrganizationIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.BoolValue> getPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ping",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.google.protobuf.BoolValue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.BoolValue> getPingMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.google.protobuf.BoolValue> getPingMethod;
    if ((getPingMethod = AccountServiceGrpc.getPingMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getPingMethod = AccountServiceGrpc.getPingMethod) == null) {
          AccountServiceGrpc.getPingMethod = getPingMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.BoolValue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.BoolValue.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("Ping"))
              .build();
        }
      }
    }
    return getPingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccountServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountServiceStub>() {
        @java.lang.Override
        public AccountServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountServiceStub(channel, callOptions);
        }
      };
    return AccountServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountServiceBlockingStub>() {
        @java.lang.Override
        public AccountServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountServiceBlockingStub(channel, callOptions);
        }
      };
    return AccountServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccountServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountServiceFutureStub>() {
        @java.lang.Override
        public AccountServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountServiceFutureStub(channel, callOptions);
        }
      };
    return AccountServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AccountServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createUser(app.onepass.apis.CreateUserRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    /**
     */
    public void searchUser(app.onepass.apis.SearchUserRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.SearchUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchUserMethod(), responseObserver);
    }

    /**
     */
    public void getUserByChulaId(app.onepass.apis.GetUserByChulaIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserByChulaIdMethod(), responseObserver);
    }

    /**
     */
    public void getUserByEmail(app.onepass.apis.GetUserByEmailRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserByEmailMethod(), responseObserver);
    }

    /**
     */
    public void isAuthenticated(app.onepass.apis.IsAuthenticatedRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsAuthenticatedMethod(), responseObserver);
    }

    /**
     */
    public void updateAccountInfo(app.onepass.apis.User request,
        io.grpc.stub.StreamObserver<app.onepass.apis.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAccountInfoMethod(), responseObserver);
    }

    /**
     */
    public void setInterestedTags(app.onepass.apis.SetInterestedTagsRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetInterestedTagsMethod(), responseObserver);
    }

    /**
     */
    public void setInterestedEvents(app.onepass.apis.SetInterestedEventsRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetInterestedEventsMethod(), responseObserver);
    }

    /**
     */
    public void getUserById(app.onepass.apis.GetObjectByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserByIdMethod(), responseObserver);
    }

    /**
     */
    public void generateAccessToken(app.onepass.apis.GenerateAccessTokenRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GenerateAccessTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateAccessTokenMethod(), responseObserver);
    }

    /**
     */
    public void hasPermission(app.onepass.apis.HasPermissionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHasPermissionMethod(), responseObserver);
    }

    /**
     */
    public void assignRole(app.onepass.apis.AssignRoleRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignRoleMethod(), responseObserver);
    }

    /**
     */
    public void removeRole(app.onepass.apis.RemoveRoleRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveRoleMethod(), responseObserver);
    }

    /**
     */
    public void getUserOrganizationsByUserId(app.onepass.apis.GetObjectByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GetUserOrganizationsByUserIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserOrganizationsByUserIdMethod(), responseObserver);
    }

    /**
     */
    public void getUserOrganizationsByOrganizationId(app.onepass.apis.GetObjectByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GetUserOrganizationsByOrganizationIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserOrganizationsByOrganizationIdMethod(), responseObserver);
    }

    /**
     */
    public void ping(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.CreateUserRequest,
                app.onepass.apis.User>(
                  this, METHODID_CREATE_USER)))
          .addMethod(
            getSearchUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.SearchUserRequest,
                app.onepass.apis.SearchUserResponse>(
                  this, METHODID_SEARCH_USER)))
          .addMethod(
            getGetUserByChulaIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GetUserByChulaIdRequest,
                app.onepass.apis.User>(
                  this, METHODID_GET_USER_BY_CHULA_ID)))
          .addMethod(
            getGetUserByEmailMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GetUserByEmailRequest,
                app.onepass.apis.User>(
                  this, METHODID_GET_USER_BY_EMAIL)))
          .addMethod(
            getIsAuthenticatedMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.IsAuthenticatedRequest,
                com.google.protobuf.BoolValue>(
                  this, METHODID_IS_AUTHENTICATED)))
          .addMethod(
            getUpdateAccountInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.User,
                app.onepass.apis.User>(
                  this, METHODID_UPDATE_ACCOUNT_INFO)))
          .addMethod(
            getSetInterestedTagsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.SetInterestedTagsRequest,
                app.onepass.apis.User>(
                  this, METHODID_SET_INTERESTED_TAGS)))
          .addMethod(
            getSetInterestedEventsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.SetInterestedEventsRequest,
                app.onepass.apis.User>(
                  this, METHODID_SET_INTERESTED_EVENTS)))
          .addMethod(
            getGetUserByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GetObjectByIdRequest,
                app.onepass.apis.User>(
                  this, METHODID_GET_USER_BY_ID)))
          .addMethod(
            getGenerateAccessTokenMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GenerateAccessTokenRequest,
                app.onepass.apis.GenerateAccessTokenResponse>(
                  this, METHODID_GENERATE_ACCESS_TOKEN)))
          .addMethod(
            getHasPermissionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.HasPermissionRequest,
                com.google.protobuf.BoolValue>(
                  this, METHODID_HAS_PERMISSION)))
          .addMethod(
            getAssignRoleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.AssignRoleRequest,
                com.google.protobuf.BoolValue>(
                  this, METHODID_ASSIGN_ROLE)))
          .addMethod(
            getRemoveRoleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.RemoveRoleRequest,
                com.google.protobuf.BoolValue>(
                  this, METHODID_REMOVE_ROLE)))
          .addMethod(
            getGetUserOrganizationsByUserIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GetObjectByIdRequest,
                app.onepass.apis.GetUserOrganizationsByUserIdResponse>(
                  this, METHODID_GET_USER_ORGANIZATIONS_BY_USER_ID)))
          .addMethod(
            getGetUserOrganizationsByOrganizationIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GetObjectByIdRequest,
                app.onepass.apis.GetUserOrganizationsByOrganizationIdResponse>(
                  this, METHODID_GET_USER_ORGANIZATIONS_BY_ORGANIZATION_ID)))
          .addMethod(
            getPingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.google.protobuf.BoolValue>(
                  this, METHODID_PING)))
          .build();
    }
  }

  /**
   */
  public static final class AccountServiceStub extends io.grpc.stub.AbstractAsyncStub<AccountServiceStub> {
    private AccountServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountServiceStub(channel, callOptions);
    }

    /**
     */
    public void createUser(app.onepass.apis.CreateUserRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchUser(app.onepass.apis.SearchUserRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.SearchUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserByChulaId(app.onepass.apis.GetUserByChulaIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserByChulaIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserByEmail(app.onepass.apis.GetUserByEmailRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserByEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void isAuthenticated(app.onepass.apis.IsAuthenticatedRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsAuthenticatedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAccountInfo(app.onepass.apis.User request,
        io.grpc.stub.StreamObserver<app.onepass.apis.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAccountInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setInterestedTags(app.onepass.apis.SetInterestedTagsRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetInterestedTagsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setInterestedEvents(app.onepass.apis.SetInterestedEventsRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetInterestedEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserById(app.onepass.apis.GetObjectByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void generateAccessToken(app.onepass.apis.GenerateAccessTokenRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GenerateAccessTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateAccessTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void hasPermission(app.onepass.apis.HasPermissionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHasPermissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void assignRole(app.onepass.apis.AssignRoleRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeRole(app.onepass.apis.RemoveRoleRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserOrganizationsByUserId(app.onepass.apis.GetObjectByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GetUserOrganizationsByUserIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserOrganizationsByUserIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserOrganizationsByOrganizationId(app.onepass.apis.GetObjectByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GetUserOrganizationsByOrganizationIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserOrganizationsByOrganizationIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void ping(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AccountServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AccountServiceBlockingStub> {
    private AccountServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public app.onepass.apis.User createUser(app.onepass.apis.CreateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.SearchUserResponse searchUser(app.onepass.apis.SearchUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.User getUserByChulaId(app.onepass.apis.GetUserByChulaIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserByChulaIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.User getUserByEmail(app.onepass.apis.GetUserByEmailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserByEmailMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.BoolValue isAuthenticated(app.onepass.apis.IsAuthenticatedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsAuthenticatedMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.User updateAccountInfo(app.onepass.apis.User request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAccountInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.User setInterestedTags(app.onepass.apis.SetInterestedTagsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetInterestedTagsMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.User setInterestedEvents(app.onepass.apis.SetInterestedEventsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetInterestedEventsMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.User getUserById(app.onepass.apis.GetObjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.GenerateAccessTokenResponse generateAccessToken(app.onepass.apis.GenerateAccessTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateAccessTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.BoolValue hasPermission(app.onepass.apis.HasPermissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHasPermissionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.BoolValue assignRole(app.onepass.apis.AssignRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.BoolValue removeRole(app.onepass.apis.RemoveRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.GetUserOrganizationsByUserIdResponse getUserOrganizationsByUserId(app.onepass.apis.GetObjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserOrganizationsByUserIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.GetUserOrganizationsByOrganizationIdResponse getUserOrganizationsByOrganizationId(app.onepass.apis.GetObjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserOrganizationsByOrganizationIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.BoolValue ping(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AccountServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AccountServiceFutureStub> {
    private AccountServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.User> createUser(
        app.onepass.apis.CreateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.SearchUserResponse> searchUser(
        app.onepass.apis.SearchUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.User> getUserByChulaId(
        app.onepass.apis.GetUserByChulaIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserByChulaIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.User> getUserByEmail(
        app.onepass.apis.GetUserByEmailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserByEmailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.BoolValue> isAuthenticated(
        app.onepass.apis.IsAuthenticatedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsAuthenticatedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.User> updateAccountInfo(
        app.onepass.apis.User request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAccountInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.User> setInterestedTags(
        app.onepass.apis.SetInterestedTagsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetInterestedTagsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.User> setInterestedEvents(
        app.onepass.apis.SetInterestedEventsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetInterestedEventsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.User> getUserById(
        app.onepass.apis.GetObjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.GenerateAccessTokenResponse> generateAccessToken(
        app.onepass.apis.GenerateAccessTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateAccessTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.BoolValue> hasPermission(
        app.onepass.apis.HasPermissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHasPermissionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.BoolValue> assignRole(
        app.onepass.apis.AssignRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.BoolValue> removeRole(
        app.onepass.apis.RemoveRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.GetUserOrganizationsByUserIdResponse> getUserOrganizationsByUserId(
        app.onepass.apis.GetObjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserOrganizationsByUserIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.GetUserOrganizationsByOrganizationIdResponse> getUserOrganizationsByOrganizationId(
        app.onepass.apis.GetObjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserOrganizationsByOrganizationIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.BoolValue> ping(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_USER = 0;
  private static final int METHODID_SEARCH_USER = 1;
  private static final int METHODID_GET_USER_BY_CHULA_ID = 2;
  private static final int METHODID_GET_USER_BY_EMAIL = 3;
  private static final int METHODID_IS_AUTHENTICATED = 4;
  private static final int METHODID_UPDATE_ACCOUNT_INFO = 5;
  private static final int METHODID_SET_INTERESTED_TAGS = 6;
  private static final int METHODID_SET_INTERESTED_EVENTS = 7;
  private static final int METHODID_GET_USER_BY_ID = 8;
  private static final int METHODID_GENERATE_ACCESS_TOKEN = 9;
  private static final int METHODID_HAS_PERMISSION = 10;
  private static final int METHODID_ASSIGN_ROLE = 11;
  private static final int METHODID_REMOVE_ROLE = 12;
  private static final int METHODID_GET_USER_ORGANIZATIONS_BY_USER_ID = 13;
  private static final int METHODID_GET_USER_ORGANIZATIONS_BY_ORGANIZATION_ID = 14;
  private static final int METHODID_PING = 15;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AccountServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccountServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_USER:
          serviceImpl.createUser((app.onepass.apis.CreateUserRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.User>) responseObserver);
          break;
        case METHODID_SEARCH_USER:
          serviceImpl.searchUser((app.onepass.apis.SearchUserRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.SearchUserResponse>) responseObserver);
          break;
        case METHODID_GET_USER_BY_CHULA_ID:
          serviceImpl.getUserByChulaId((app.onepass.apis.GetUserByChulaIdRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.User>) responseObserver);
          break;
        case METHODID_GET_USER_BY_EMAIL:
          serviceImpl.getUserByEmail((app.onepass.apis.GetUserByEmailRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.User>) responseObserver);
          break;
        case METHODID_IS_AUTHENTICATED:
          serviceImpl.isAuthenticated((app.onepass.apis.IsAuthenticatedRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue>) responseObserver);
          break;
        case METHODID_UPDATE_ACCOUNT_INFO:
          serviceImpl.updateAccountInfo((app.onepass.apis.User) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.User>) responseObserver);
          break;
        case METHODID_SET_INTERESTED_TAGS:
          serviceImpl.setInterestedTags((app.onepass.apis.SetInterestedTagsRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.User>) responseObserver);
          break;
        case METHODID_SET_INTERESTED_EVENTS:
          serviceImpl.setInterestedEvents((app.onepass.apis.SetInterestedEventsRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.User>) responseObserver);
          break;
        case METHODID_GET_USER_BY_ID:
          serviceImpl.getUserById((app.onepass.apis.GetObjectByIdRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.User>) responseObserver);
          break;
        case METHODID_GENERATE_ACCESS_TOKEN:
          serviceImpl.generateAccessToken((app.onepass.apis.GenerateAccessTokenRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.GenerateAccessTokenResponse>) responseObserver);
          break;
        case METHODID_HAS_PERMISSION:
          serviceImpl.hasPermission((app.onepass.apis.HasPermissionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue>) responseObserver);
          break;
        case METHODID_ASSIGN_ROLE:
          serviceImpl.assignRole((app.onepass.apis.AssignRoleRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue>) responseObserver);
          break;
        case METHODID_REMOVE_ROLE:
          serviceImpl.removeRole((app.onepass.apis.RemoveRoleRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue>) responseObserver);
          break;
        case METHODID_GET_USER_ORGANIZATIONS_BY_USER_ID:
          serviceImpl.getUserOrganizationsByUserId((app.onepass.apis.GetObjectByIdRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.GetUserOrganizationsByUserIdResponse>) responseObserver);
          break;
        case METHODID_GET_USER_ORGANIZATIONS_BY_ORGANIZATION_ID:
          serviceImpl.getUserOrganizationsByOrganizationId((app.onepass.apis.GetObjectByIdRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.GetUserOrganizationsByOrganizationIdResponse>) responseObserver);
          break;
        case METHODID_PING:
          serviceImpl.ping((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AccountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccountServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return app.onepass.apis.AccountProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccountService");
    }
  }

  private static final class AccountServiceFileDescriptorSupplier
      extends AccountServiceBaseDescriptorSupplier {
    AccountServiceFileDescriptorSupplier() {}
  }

  private static final class AccountServiceMethodDescriptorSupplier
      extends AccountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccountServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AccountServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccountServiceFileDescriptorSupplier())
              .addMethod(getCreateUserMethod())
              .addMethod(getSearchUserMethod())
              .addMethod(getGetUserByChulaIdMethod())
              .addMethod(getGetUserByEmailMethod())
              .addMethod(getIsAuthenticatedMethod())
              .addMethod(getUpdateAccountInfoMethod())
              .addMethod(getSetInterestedTagsMethod())
              .addMethod(getSetInterestedEventsMethod())
              .addMethod(getGetUserByIdMethod())
              .addMethod(getGenerateAccessTokenMethod())
              .addMethod(getHasPermissionMethod())
              .addMethod(getAssignRoleMethod())
              .addMethod(getRemoveRoleMethod())
              .addMethod(getGetUserOrganizationsByUserIdMethod())
              .addMethod(getGetUserOrganizationsByOrganizationIdMethod())
              .addMethod(getPingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
