package app.onepass.apis;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: hts/facility/service.proto")
public final class FacilityServiceGrpc {

  private FacilityServiceGrpc() {}

  public static final String SERVICE_NAME = "hts.facility.FacilityService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GetFacilityListRequest,
      app.onepass.apis.GetFacilityListResponse> getGetFacilityListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFacilityList",
      requestType = app.onepass.apis.GetFacilityListRequest.class,
      responseType = app.onepass.apis.GetFacilityListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GetFacilityListRequest,
      app.onepass.apis.GetFacilityListResponse> getGetFacilityListMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GetFacilityListRequest, app.onepass.apis.GetFacilityListResponse> getGetFacilityListMethod;
    if ((getGetFacilityListMethod = FacilityServiceGrpc.getGetFacilityListMethod) == null) {
      synchronized (FacilityServiceGrpc.class) {
        if ((getGetFacilityListMethod = FacilityServiceGrpc.getGetFacilityListMethod) == null) {
          FacilityServiceGrpc.getGetFacilityListMethod = getGetFacilityListMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GetFacilityListRequest, app.onepass.apis.GetFacilityListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFacilityList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetFacilityListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetFacilityListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FacilityServiceMethodDescriptorSupplier("GetFacilityList"))
              .build();
        }
      }
    }
    return getGetFacilityListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GetFacilityRequestListRequest,
      app.onepass.apis.GetFacilityRequestListResponse> getGetFacilityRequestListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFacilityRequestList",
      requestType = app.onepass.apis.GetFacilityRequestListRequest.class,
      responseType = app.onepass.apis.GetFacilityRequestListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GetFacilityRequestListRequest,
      app.onepass.apis.GetFacilityRequestListResponse> getGetFacilityRequestListMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GetFacilityRequestListRequest, app.onepass.apis.GetFacilityRequestListResponse> getGetFacilityRequestListMethod;
    if ((getGetFacilityRequestListMethod = FacilityServiceGrpc.getGetFacilityRequestListMethod) == null) {
      synchronized (FacilityServiceGrpc.class) {
        if ((getGetFacilityRequestListMethod = FacilityServiceGrpc.getGetFacilityRequestListMethod) == null) {
          FacilityServiceGrpc.getGetFacilityRequestListMethod = getGetFacilityRequestListMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GetFacilityRequestListRequest, app.onepass.apis.GetFacilityRequestListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFacilityRequestList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetFacilityRequestListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetFacilityRequestListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FacilityServiceMethodDescriptorSupplier("GetFacilityRequestList"))
              .build();
        }
      }
    }
    return getGetFacilityRequestListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GetFacilityRequestStatusRequest,
      app.onepass.apis.FacilityRequest> getGetFacilityRequestStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFacilityRequestStatus",
      requestType = app.onepass.apis.GetFacilityRequestStatusRequest.class,
      responseType = app.onepass.apis.FacilityRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GetFacilityRequestStatusRequest,
      app.onepass.apis.FacilityRequest> getGetFacilityRequestStatusMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GetFacilityRequestStatusRequest, app.onepass.apis.FacilityRequest> getGetFacilityRequestStatusMethod;
    if ((getGetFacilityRequestStatusMethod = FacilityServiceGrpc.getGetFacilityRequestStatusMethod) == null) {
      synchronized (FacilityServiceGrpc.class) {
        if ((getGetFacilityRequestStatusMethod = FacilityServiceGrpc.getGetFacilityRequestStatusMethod) == null) {
          FacilityServiceGrpc.getGetFacilityRequestStatusMethod = getGetFacilityRequestStatusMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GetFacilityRequestStatusRequest, app.onepass.apis.FacilityRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFacilityRequestStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetFacilityRequestStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.FacilityRequest.getDefaultInstance()))
              .setSchemaDescriptor(new FacilityServiceMethodDescriptorSupplier("GetFacilityRequestStatus"))
              .build();
        }
      }
    }
    return getGetFacilityRequestStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      app.onepass.apis.GetAvailableFacilityListResponse> getGetAvailableFacilityListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAvailableFacilityList",
      requestType = com.google.protobuf.Empty.class,
      responseType = app.onepass.apis.GetAvailableFacilityListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      app.onepass.apis.GetAvailableFacilityListResponse> getGetAvailableFacilityListMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, app.onepass.apis.GetAvailableFacilityListResponse> getGetAvailableFacilityListMethod;
    if ((getGetAvailableFacilityListMethod = FacilityServiceGrpc.getGetAvailableFacilityListMethod) == null) {
      synchronized (FacilityServiceGrpc.class) {
        if ((getGetAvailableFacilityListMethod = FacilityServiceGrpc.getGetAvailableFacilityListMethod) == null) {
          FacilityServiceGrpc.getGetAvailableFacilityListMethod = getGetAvailableFacilityListMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, app.onepass.apis.GetAvailableFacilityListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAvailableFacilityList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetAvailableFacilityListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FacilityServiceMethodDescriptorSupplier("GetAvailableFacilityList"))
              .build();
        }
      }
    }
    return getGetAvailableFacilityListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GetAvailableTimeOfFacilityRequest,
      app.onepass.apis.GetAvailableTimeOfFacilityResponse> getGetAvailableTimeOfFacilityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAvailableTimeOfFacility",
      requestType = app.onepass.apis.GetAvailableTimeOfFacilityRequest.class,
      responseType = app.onepass.apis.GetAvailableTimeOfFacilityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GetAvailableTimeOfFacilityRequest,
      app.onepass.apis.GetAvailableTimeOfFacilityResponse> getGetAvailableTimeOfFacilityMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GetAvailableTimeOfFacilityRequest, app.onepass.apis.GetAvailableTimeOfFacilityResponse> getGetAvailableTimeOfFacilityMethod;
    if ((getGetAvailableTimeOfFacilityMethod = FacilityServiceGrpc.getGetAvailableTimeOfFacilityMethod) == null) {
      synchronized (FacilityServiceGrpc.class) {
        if ((getGetAvailableTimeOfFacilityMethod = FacilityServiceGrpc.getGetAvailableTimeOfFacilityMethod) == null) {
          FacilityServiceGrpc.getGetAvailableTimeOfFacilityMethod = getGetAvailableTimeOfFacilityMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GetAvailableTimeOfFacilityRequest, app.onepass.apis.GetAvailableTimeOfFacilityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAvailableTimeOfFacility"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetAvailableTimeOfFacilityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetAvailableTimeOfFacilityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FacilityServiceMethodDescriptorSupplier("GetAvailableTimeOfFacility"))
              .build();
        }
      }
    }
    return getGetAvailableTimeOfFacilityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.RequestFacilityRequestRequest,
      app.onepass.apis.FacilityRequest> getRequestFacilityRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestFacilityRequest",
      requestType = app.onepass.apis.RequestFacilityRequestRequest.class,
      responseType = app.onepass.apis.FacilityRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.RequestFacilityRequestRequest,
      app.onepass.apis.FacilityRequest> getRequestFacilityRequestMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.RequestFacilityRequestRequest, app.onepass.apis.FacilityRequest> getRequestFacilityRequestMethod;
    if ((getRequestFacilityRequestMethod = FacilityServiceGrpc.getRequestFacilityRequestMethod) == null) {
      synchronized (FacilityServiceGrpc.class) {
        if ((getRequestFacilityRequestMethod = FacilityServiceGrpc.getRequestFacilityRequestMethod) == null) {
          FacilityServiceGrpc.getRequestFacilityRequestMethod = getRequestFacilityRequestMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.RequestFacilityRequestRequest, app.onepass.apis.FacilityRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RequestFacilityRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.RequestFacilityRequestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.FacilityRequest.getDefaultInstance()))
              .setSchemaDescriptor(new FacilityServiceMethodDescriptorSupplier("RequestFacilityRequest"))
              .build();
        }
      }
    }
    return getRequestFacilityRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.ApproveFacilityRequestRequest,
      app.onepass.apis.Result> getApproveFacilityRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApproveFacilityRequest",
      requestType = app.onepass.apis.ApproveFacilityRequestRequest.class,
      responseType = app.onepass.apis.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.ApproveFacilityRequestRequest,
      app.onepass.apis.Result> getApproveFacilityRequestMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.ApproveFacilityRequestRequest, app.onepass.apis.Result> getApproveFacilityRequestMethod;
    if ((getApproveFacilityRequestMethod = FacilityServiceGrpc.getApproveFacilityRequestMethod) == null) {
      synchronized (FacilityServiceGrpc.class) {
        if ((getApproveFacilityRequestMethod = FacilityServiceGrpc.getApproveFacilityRequestMethod) == null) {
          FacilityServiceGrpc.getApproveFacilityRequestMethod = getApproveFacilityRequestMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.ApproveFacilityRequestRequest, app.onepass.apis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApproveFacilityRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.ApproveFacilityRequestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new FacilityServiceMethodDescriptorSupplier("ApproveFacilityRequest"))
              .build();
        }
      }
    }
    return getApproveFacilityRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.RejectFacilityRequestRequest,
      app.onepass.apis.Result> getRejectFacilityRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RejectFacilityRequest",
      requestType = app.onepass.apis.RejectFacilityRequestRequest.class,
      responseType = app.onepass.apis.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.RejectFacilityRequestRequest,
      app.onepass.apis.Result> getRejectFacilityRequestMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.RejectFacilityRequestRequest, app.onepass.apis.Result> getRejectFacilityRequestMethod;
    if ((getRejectFacilityRequestMethod = FacilityServiceGrpc.getRejectFacilityRequestMethod) == null) {
      synchronized (FacilityServiceGrpc.class) {
        if ((getRejectFacilityRequestMethod = FacilityServiceGrpc.getRejectFacilityRequestMethod) == null) {
          FacilityServiceGrpc.getRejectFacilityRequestMethod = getRejectFacilityRequestMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.RejectFacilityRequestRequest, app.onepass.apis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RejectFacilityRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.RejectFacilityRequestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new FacilityServiceMethodDescriptorSupplier("RejectFacilityRequest"))
              .build();
        }
      }
    }
    return getRejectFacilityRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GetFacilityInfoRequest,
      app.onepass.apis.Facility> getGetFacilityInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFacilityInfo",
      requestType = app.onepass.apis.GetFacilityInfoRequest.class,
      responseType = app.onepass.apis.Facility.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GetFacilityInfoRequest,
      app.onepass.apis.Facility> getGetFacilityInfoMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GetFacilityInfoRequest, app.onepass.apis.Facility> getGetFacilityInfoMethod;
    if ((getGetFacilityInfoMethod = FacilityServiceGrpc.getGetFacilityInfoMethod) == null) {
      synchronized (FacilityServiceGrpc.class) {
        if ((getGetFacilityInfoMethod = FacilityServiceGrpc.getGetFacilityInfoMethod) == null) {
          FacilityServiceGrpc.getGetFacilityInfoMethod = getGetFacilityInfoMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GetFacilityInfoRequest, app.onepass.apis.Facility>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFacilityInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetFacilityInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Facility.getDefaultInstance()))
              .setSchemaDescriptor(new FacilityServiceMethodDescriptorSupplier("GetFacilityInfo"))
              .build();
        }
      }
    }
    return getGetFacilityInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FacilityServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FacilityServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FacilityServiceStub>() {
        @java.lang.Override
        public FacilityServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FacilityServiceStub(channel, callOptions);
        }
      };
    return FacilityServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FacilityServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FacilityServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FacilityServiceBlockingStub>() {
        @java.lang.Override
        public FacilityServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FacilityServiceBlockingStub(channel, callOptions);
        }
      };
    return FacilityServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FacilityServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FacilityServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FacilityServiceFutureStub>() {
        @java.lang.Override
        public FacilityServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FacilityServiceFutureStub(channel, callOptions);
        }
      };
    return FacilityServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class FacilityServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getFacilityList(app.onepass.apis.GetFacilityListRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GetFacilityListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFacilityListMethod(), responseObserver);
    }

    /**
     */
    public void getFacilityRequestList(app.onepass.apis.GetFacilityRequestListRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GetFacilityRequestListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFacilityRequestListMethod(), responseObserver);
    }

    /**
     */
    public void getFacilityRequestStatus(app.onepass.apis.GetFacilityRequestStatusRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.FacilityRequest> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFacilityRequestStatusMethod(), responseObserver);
    }

    /**
     */
    public void getAvailableFacilityList(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GetAvailableFacilityListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAvailableFacilityListMethod(), responseObserver);
    }

    /**
     */
    public void getAvailableTimeOfFacility(app.onepass.apis.GetAvailableTimeOfFacilityRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GetAvailableTimeOfFacilityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAvailableTimeOfFacilityMethod(), responseObserver);
    }

    /**
     */
    public void requestFacilityRequest(app.onepass.apis.RequestFacilityRequestRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.FacilityRequest> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRequestFacilityRequestMethod(), responseObserver);
    }

    /**
     */
    public void approveFacilityRequest(app.onepass.apis.ApproveFacilityRequestRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApproveFacilityRequestMethod(), responseObserver);
    }

    /**
     */
    public void rejectFacilityRequest(app.onepass.apis.RejectFacilityRequestRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRejectFacilityRequestMethod(), responseObserver);
    }

    /**
     */
    public void getFacilityInfo(app.onepass.apis.GetFacilityInfoRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Facility> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFacilityInfoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetFacilityListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GetFacilityListRequest,
                app.onepass.apis.GetFacilityListResponse>(
                  this, METHODID_GET_FACILITY_LIST)))
          .addMethod(
            getGetFacilityRequestListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GetFacilityRequestListRequest,
                app.onepass.apis.GetFacilityRequestListResponse>(
                  this, METHODID_GET_FACILITY_REQUEST_LIST)))
          .addMethod(
            getGetFacilityRequestStatusMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GetFacilityRequestStatusRequest,
                app.onepass.apis.FacilityRequest>(
                  this, METHODID_GET_FACILITY_REQUEST_STATUS)))
          .addMethod(
            getGetAvailableFacilityListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                app.onepass.apis.GetAvailableFacilityListResponse>(
                  this, METHODID_GET_AVAILABLE_FACILITY_LIST)))
          .addMethod(
            getGetAvailableTimeOfFacilityMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GetAvailableTimeOfFacilityRequest,
                app.onepass.apis.GetAvailableTimeOfFacilityResponse>(
                  this, METHODID_GET_AVAILABLE_TIME_OF_FACILITY)))
          .addMethod(
            getRequestFacilityRequestMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.RequestFacilityRequestRequest,
                app.onepass.apis.FacilityRequest>(
                  this, METHODID_REQUEST_FACILITY_REQUEST)))
          .addMethod(
            getApproveFacilityRequestMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.ApproveFacilityRequestRequest,
                app.onepass.apis.Result>(
                  this, METHODID_APPROVE_FACILITY_REQUEST)))
          .addMethod(
            getRejectFacilityRequestMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.RejectFacilityRequestRequest,
                app.onepass.apis.Result>(
                  this, METHODID_REJECT_FACILITY_REQUEST)))
          .addMethod(
            getGetFacilityInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GetFacilityInfoRequest,
                app.onepass.apis.Facility>(
                  this, METHODID_GET_FACILITY_INFO)))
          .build();
    }
  }

  /**
   */
  public static final class FacilityServiceStub extends io.grpc.stub.AbstractAsyncStub<FacilityServiceStub> {
    private FacilityServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FacilityServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FacilityServiceStub(channel, callOptions);
    }

    /**
     */
    public void getFacilityList(app.onepass.apis.GetFacilityListRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GetFacilityListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFacilityListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFacilityRequestList(app.onepass.apis.GetFacilityRequestListRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GetFacilityRequestListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFacilityRequestListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFacilityRequestStatus(app.onepass.apis.GetFacilityRequestStatusRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.FacilityRequest> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFacilityRequestStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAvailableFacilityList(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GetAvailableFacilityListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAvailableFacilityListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAvailableTimeOfFacility(app.onepass.apis.GetAvailableTimeOfFacilityRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GetAvailableTimeOfFacilityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAvailableTimeOfFacilityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void requestFacilityRequest(app.onepass.apis.RequestFacilityRequestRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.FacilityRequest> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRequestFacilityRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void approveFacilityRequest(app.onepass.apis.ApproveFacilityRequestRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApproveFacilityRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rejectFacilityRequest(app.onepass.apis.RejectFacilityRequestRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRejectFacilityRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFacilityInfo(app.onepass.apis.GetFacilityInfoRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Facility> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFacilityInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FacilityServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<FacilityServiceBlockingStub> {
    private FacilityServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FacilityServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FacilityServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public app.onepass.apis.GetFacilityListResponse getFacilityList(app.onepass.apis.GetFacilityListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFacilityListMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.GetFacilityRequestListResponse getFacilityRequestList(app.onepass.apis.GetFacilityRequestListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFacilityRequestListMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.FacilityRequest getFacilityRequestStatus(app.onepass.apis.GetFacilityRequestStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFacilityRequestStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.GetAvailableFacilityListResponse getAvailableFacilityList(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAvailableFacilityListMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.GetAvailableTimeOfFacilityResponse getAvailableTimeOfFacility(app.onepass.apis.GetAvailableTimeOfFacilityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAvailableTimeOfFacilityMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.FacilityRequest requestFacilityRequest(app.onepass.apis.RequestFacilityRequestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRequestFacilityRequestMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Result approveFacilityRequest(app.onepass.apis.ApproveFacilityRequestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApproveFacilityRequestMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Result rejectFacilityRequest(app.onepass.apis.RejectFacilityRequestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRejectFacilityRequestMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Facility getFacilityInfo(app.onepass.apis.GetFacilityInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFacilityInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FacilityServiceFutureStub extends io.grpc.stub.AbstractFutureStub<FacilityServiceFutureStub> {
    private FacilityServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FacilityServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FacilityServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.GetFacilityListResponse> getFacilityList(
        app.onepass.apis.GetFacilityListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFacilityListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.GetFacilityRequestListResponse> getFacilityRequestList(
        app.onepass.apis.GetFacilityRequestListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFacilityRequestListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.FacilityRequest> getFacilityRequestStatus(
        app.onepass.apis.GetFacilityRequestStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFacilityRequestStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.GetAvailableFacilityListResponse> getAvailableFacilityList(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAvailableFacilityListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.GetAvailableTimeOfFacilityResponse> getAvailableTimeOfFacility(
        app.onepass.apis.GetAvailableTimeOfFacilityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAvailableTimeOfFacilityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.FacilityRequest> requestFacilityRequest(
        app.onepass.apis.RequestFacilityRequestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRequestFacilityRequestMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Result> approveFacilityRequest(
        app.onepass.apis.ApproveFacilityRequestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApproveFacilityRequestMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Result> rejectFacilityRequest(
        app.onepass.apis.RejectFacilityRequestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRejectFacilityRequestMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Facility> getFacilityInfo(
        app.onepass.apis.GetFacilityInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFacilityInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FACILITY_LIST = 0;
  private static final int METHODID_GET_FACILITY_REQUEST_LIST = 1;
  private static final int METHODID_GET_FACILITY_REQUEST_STATUS = 2;
  private static final int METHODID_GET_AVAILABLE_FACILITY_LIST = 3;
  private static final int METHODID_GET_AVAILABLE_TIME_OF_FACILITY = 4;
  private static final int METHODID_REQUEST_FACILITY_REQUEST = 5;
  private static final int METHODID_APPROVE_FACILITY_REQUEST = 6;
  private static final int METHODID_REJECT_FACILITY_REQUEST = 7;
  private static final int METHODID_GET_FACILITY_INFO = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FacilityServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FacilityServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_FACILITY_LIST:
          serviceImpl.getFacilityList((app.onepass.apis.GetFacilityListRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.GetFacilityListResponse>) responseObserver);
          break;
        case METHODID_GET_FACILITY_REQUEST_LIST:
          serviceImpl.getFacilityRequestList((app.onepass.apis.GetFacilityRequestListRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.GetFacilityRequestListResponse>) responseObserver);
          break;
        case METHODID_GET_FACILITY_REQUEST_STATUS:
          serviceImpl.getFacilityRequestStatus((app.onepass.apis.GetFacilityRequestStatusRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.FacilityRequest>) responseObserver);
          break;
        case METHODID_GET_AVAILABLE_FACILITY_LIST:
          serviceImpl.getAvailableFacilityList((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.GetAvailableFacilityListResponse>) responseObserver);
          break;
        case METHODID_GET_AVAILABLE_TIME_OF_FACILITY:
          serviceImpl.getAvailableTimeOfFacility((app.onepass.apis.GetAvailableTimeOfFacilityRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.GetAvailableTimeOfFacilityResponse>) responseObserver);
          break;
        case METHODID_REQUEST_FACILITY_REQUEST:
          serviceImpl.requestFacilityRequest((app.onepass.apis.RequestFacilityRequestRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.FacilityRequest>) responseObserver);
          break;
        case METHODID_APPROVE_FACILITY_REQUEST:
          serviceImpl.approveFacilityRequest((app.onepass.apis.ApproveFacilityRequestRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Result>) responseObserver);
          break;
        case METHODID_REJECT_FACILITY_REQUEST:
          serviceImpl.rejectFacilityRequest((app.onepass.apis.RejectFacilityRequestRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Result>) responseObserver);
          break;
        case METHODID_GET_FACILITY_INFO:
          serviceImpl.getFacilityInfo((app.onepass.apis.GetFacilityInfoRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Facility>) responseObserver);
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

  private static abstract class FacilityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FacilityServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return app.onepass.apis.FacilityProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FacilityService");
    }
  }

  private static final class FacilityServiceFileDescriptorSupplier
      extends FacilityServiceBaseDescriptorSupplier {
    FacilityServiceFileDescriptorSupplier() {}
  }

  private static final class FacilityServiceMethodDescriptorSupplier
      extends FacilityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FacilityServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FacilityServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FacilityServiceFileDescriptorSupplier())
              .addMethod(getGetFacilityListMethod())
              .addMethod(getGetFacilityRequestListMethod())
              .addMethod(getGetFacilityRequestStatusMethod())
              .addMethod(getGetAvailableFacilityListMethod())
              .addMethod(getGetAvailableTimeOfFacilityMethod())
              .addMethod(getRequestFacilityRequestMethod())
              .addMethod(getApproveFacilityRequestMethod())
              .addMethod(getRejectFacilityRequestMethod())
              .addMethod(getGetFacilityInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
