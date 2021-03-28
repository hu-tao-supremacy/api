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
  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest,
      app.onepass.apis.User> getGetUserByChulaIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserByChulaId",
      requestType = app.onepass.apis.GetObjectByIdRequest.class,
      responseType = app.onepass.apis.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest,
      app.onepass.apis.User> getGetUserByChulaIdMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest, app.onepass.apis.User> getGetUserByChulaIdMethod;
    if ((getGetUserByChulaIdMethod = AccountServiceGrpc.getGetUserByChulaIdMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getGetUserByChulaIdMethod = AccountServiceGrpc.getGetUserByChulaIdMethod) == null) {
          AccountServiceGrpc.getGetUserByChulaIdMethod = getGetUserByChulaIdMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GetObjectByIdRequest, app.onepass.apis.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserByChulaId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetObjectByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.User.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("GetUserByChulaId"))
              .build();
        }
      }
    }
    return getGetUserByChulaIdMethod;
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
    public void getUserByChulaId(app.onepass.apis.GetObjectByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserByChulaIdMethod(), responseObserver);
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
    public void ping(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetUserByChulaIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GetObjectByIdRequest,
                app.onepass.apis.User>(
                  this, METHODID_GET_USER_BY_CHULA_ID)))
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
    public void getUserByChulaId(app.onepass.apis.GetObjectByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserByChulaIdMethod(), getCallOptions()), request, responseObserver);
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
    public app.onepass.apis.User getUserByChulaId(app.onepass.apis.GetObjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserByChulaIdMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.User> getUserByChulaId(
        app.onepass.apis.GetObjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserByChulaIdMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.BoolValue> ping(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER_BY_CHULA_ID = 0;
  private static final int METHODID_IS_AUTHENTICATED = 1;
  private static final int METHODID_UPDATE_ACCOUNT_INFO = 2;
  private static final int METHODID_GENERATE_ACCESS_TOKEN = 3;
  private static final int METHODID_HAS_PERMISSION = 4;
  private static final int METHODID_PING = 5;

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
        case METHODID_GET_USER_BY_CHULA_ID:
          serviceImpl.getUserByChulaId((app.onepass.apis.GetObjectByIdRequest) request,
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
        case METHODID_GENERATE_ACCESS_TOKEN:
          serviceImpl.generateAccessToken((app.onepass.apis.GenerateAccessTokenRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.GenerateAccessTokenResponse>) responseObserver);
          break;
        case METHODID_HAS_PERMISSION:
          serviceImpl.hasPermission((app.onepass.apis.HasPermissionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue>) responseObserver);
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
              .addMethod(getGetUserByChulaIdMethod())
              .addMethod(getIsAuthenticatedMethod())
              .addMethod(getUpdateAccountInfoMethod())
              .addMethod(getGenerateAccessTokenMethod())
              .addMethod(getHasPermissionMethod())
              .addMethod(getPingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
