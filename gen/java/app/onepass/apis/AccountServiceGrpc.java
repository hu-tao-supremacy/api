package app.onepass.apis;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: hts/account/service.proto")
public final class AccountServiceGrpc {

  private AccountServiceGrpc() {}

  public static final String SERVICE_NAME = "hts.account.AccountService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.IsAuthenticatedRequest,
      app.onepass.apis.Result> getIsAuthenticatedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsAuthenticated",
      requestType = app.onepass.apis.IsAuthenticatedRequest.class,
      responseType = app.onepass.apis.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.IsAuthenticatedRequest,
      app.onepass.apis.Result> getIsAuthenticatedMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.IsAuthenticatedRequest, app.onepass.apis.Result> getIsAuthenticatedMethod;
    if ((getIsAuthenticatedMethod = AccountServiceGrpc.getIsAuthenticatedMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getIsAuthenticatedMethod = AccountServiceGrpc.getIsAuthenticatedMethod) == null) {
          AccountServiceGrpc.getIsAuthenticatedMethod = getIsAuthenticatedMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.IsAuthenticatedRequest, app.onepass.apis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsAuthenticated"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.IsAuthenticatedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("IsAuthenticated"))
              .build();
        }
      }
    }
    return getIsAuthenticatedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UpdateAccountInfoRequest,
      app.onepass.apis.UpdateAccountInfoResponse> getUpdateAccountInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAccountInfo",
      requestType = app.onepass.apis.UpdateAccountInfoRequest.class,
      responseType = app.onepass.apis.UpdateAccountInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UpdateAccountInfoRequest,
      app.onepass.apis.UpdateAccountInfoResponse> getUpdateAccountInfoMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UpdateAccountInfoRequest, app.onepass.apis.UpdateAccountInfoResponse> getUpdateAccountInfoMethod;
    if ((getUpdateAccountInfoMethod = AccountServiceGrpc.getUpdateAccountInfoMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getUpdateAccountInfoMethod = AccountServiceGrpc.getUpdateAccountInfoMethod) == null) {
          AccountServiceGrpc.getUpdateAccountInfoMethod = getUpdateAccountInfoMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UpdateAccountInfoRequest, app.onepass.apis.UpdateAccountInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAccountInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UpdateAccountInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UpdateAccountInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("UpdateAccountInfo"))
              .build();
        }
      }
    }
    return getUpdateAccountInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GenerateJWTRequest,
      app.onepass.apis.Result> getGenerateJWTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateJWT",
      requestType = app.onepass.apis.GenerateJWTRequest.class,
      responseType = app.onepass.apis.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GenerateJWTRequest,
      app.onepass.apis.Result> getGenerateJWTMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GenerateJWTRequest, app.onepass.apis.Result> getGenerateJWTMethod;
    if ((getGenerateJWTMethod = AccountServiceGrpc.getGenerateJWTMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getGenerateJWTMethod = AccountServiceGrpc.getGenerateJWTMethod) == null) {
          AccountServiceGrpc.getGenerateJWTMethod = getGenerateJWTMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GenerateJWTRequest, app.onepass.apis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateJWT"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GenerateJWTRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("GenerateJWT"))
              .build();
        }
      }
    }
    return getGenerateJWTMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.InvalidateJWTRequest,
      app.onepass.apis.Result> getInvalidateJWTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InvalidateJWT",
      requestType = app.onepass.apis.InvalidateJWTRequest.class,
      responseType = app.onepass.apis.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.InvalidateJWTRequest,
      app.onepass.apis.Result> getInvalidateJWTMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.InvalidateJWTRequest, app.onepass.apis.Result> getInvalidateJWTMethod;
    if ((getInvalidateJWTMethod = AccountServiceGrpc.getInvalidateJWTMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getInvalidateJWTMethod = AccountServiceGrpc.getInvalidateJWTMethod) == null) {
          AccountServiceGrpc.getInvalidateJWTMethod = getInvalidateJWTMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.InvalidateJWTRequest, app.onepass.apis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InvalidateJWT"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.InvalidateJWTRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("InvalidateJWT"))
              .build();
        }
      }
    }
    return getInvalidateJWTMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.HasPermissionRequest,
      app.onepass.apis.Result> getHasPermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HasPermission",
      requestType = app.onepass.apis.HasPermissionRequest.class,
      responseType = app.onepass.apis.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.HasPermissionRequest,
      app.onepass.apis.Result> getHasPermissionMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.HasPermissionRequest, app.onepass.apis.Result> getHasPermissionMethod;
    if ((getHasPermissionMethod = AccountServiceGrpc.getHasPermissionMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getHasPermissionMethod = AccountServiceGrpc.getHasPermissionMethod) == null) {
          AccountServiceGrpc.getHasPermissionMethod = getHasPermissionMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.HasPermissionRequest, app.onepass.apis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HasPermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.HasPermissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("HasPermission"))
              .build();
        }
      }
    }
    return getHasPermissionMethod;
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
    public void isAuthenticated(app.onepass.apis.IsAuthenticatedRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsAuthenticatedMethod(), responseObserver);
    }

    /**
     */
    public void updateAccountInfo(app.onepass.apis.UpdateAccountInfoRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.UpdateAccountInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAccountInfoMethod(), responseObserver);
    }

    /**
     */
    public void generateJWT(app.onepass.apis.GenerateJWTRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateJWTMethod(), responseObserver);
    }

    /**
     */
    public void invalidateJWT(app.onepass.apis.InvalidateJWTRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInvalidateJWTMethod(), responseObserver);
    }

    /**
     */
    public void hasPermission(app.onepass.apis.HasPermissionRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHasPermissionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getIsAuthenticatedMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.IsAuthenticatedRequest,
                app.onepass.apis.Result>(
                  this, METHODID_IS_AUTHENTICATED)))
          .addMethod(
            getUpdateAccountInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UpdateAccountInfoRequest,
                app.onepass.apis.UpdateAccountInfoResponse>(
                  this, METHODID_UPDATE_ACCOUNT_INFO)))
          .addMethod(
            getGenerateJWTMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GenerateJWTRequest,
                app.onepass.apis.Result>(
                  this, METHODID_GENERATE_JWT)))
          .addMethod(
            getInvalidateJWTMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.InvalidateJWTRequest,
                app.onepass.apis.Result>(
                  this, METHODID_INVALIDATE_JWT)))
          .addMethod(
            getHasPermissionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.HasPermissionRequest,
                app.onepass.apis.Result>(
                  this, METHODID_HAS_PERMISSION)))
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
    public void isAuthenticated(app.onepass.apis.IsAuthenticatedRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsAuthenticatedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAccountInfo(app.onepass.apis.UpdateAccountInfoRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.UpdateAccountInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAccountInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void generateJWT(app.onepass.apis.GenerateJWTRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateJWTMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void invalidateJWT(app.onepass.apis.InvalidateJWTRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInvalidateJWTMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void hasPermission(app.onepass.apis.HasPermissionRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHasPermissionMethod(), getCallOptions()), request, responseObserver);
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
    public app.onepass.apis.Result isAuthenticated(app.onepass.apis.IsAuthenticatedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsAuthenticatedMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.UpdateAccountInfoResponse updateAccountInfo(app.onepass.apis.UpdateAccountInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAccountInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Result generateJWT(app.onepass.apis.GenerateJWTRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateJWTMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Result invalidateJWT(app.onepass.apis.InvalidateJWTRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInvalidateJWTMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Result hasPermission(app.onepass.apis.HasPermissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHasPermissionMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Result> isAuthenticated(
        app.onepass.apis.IsAuthenticatedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsAuthenticatedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.UpdateAccountInfoResponse> updateAccountInfo(
        app.onepass.apis.UpdateAccountInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAccountInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Result> generateJWT(
        app.onepass.apis.GenerateJWTRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateJWTMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Result> invalidateJWT(
        app.onepass.apis.InvalidateJWTRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInvalidateJWTMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Result> hasPermission(
        app.onepass.apis.HasPermissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHasPermissionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_IS_AUTHENTICATED = 0;
  private static final int METHODID_UPDATE_ACCOUNT_INFO = 1;
  private static final int METHODID_GENERATE_JWT = 2;
  private static final int METHODID_INVALIDATE_JWT = 3;
  private static final int METHODID_HAS_PERMISSION = 4;

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
        case METHODID_IS_AUTHENTICATED:
          serviceImpl.isAuthenticated((app.onepass.apis.IsAuthenticatedRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Result>) responseObserver);
          break;
        case METHODID_UPDATE_ACCOUNT_INFO:
          serviceImpl.updateAccountInfo((app.onepass.apis.UpdateAccountInfoRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.UpdateAccountInfoResponse>) responseObserver);
          break;
        case METHODID_GENERATE_JWT:
          serviceImpl.generateJWT((app.onepass.apis.GenerateJWTRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Result>) responseObserver);
          break;
        case METHODID_INVALIDATE_JWT:
          serviceImpl.invalidateJWT((app.onepass.apis.InvalidateJWTRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Result>) responseObserver);
          break;
        case METHODID_HAS_PERMISSION:
          serviceImpl.hasPermission((app.onepass.apis.HasPermissionRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Result>) responseObserver);
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
              .addMethod(getIsAuthenticatedMethod())
              .addMethod(getUpdateAccountInfoMethod())
              .addMethod(getGenerateJWTMethod())
              .addMethod(getInvalidateJWTMethod())
              .addMethod(getHasPermissionMethod())
              .build();
        }
      }
    }
    return result;
  }
}