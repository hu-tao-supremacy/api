package app.onepass.apis;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: hts/participant/service.proto")
public final class ParticipantServiceGrpc {

  private ParticipantServiceGrpc() {}

  public static final String SERVICE_NAME = "hts.participant.ParticipantService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.IsEventAvailableRequest,
      app.onepass.apis.Result> getIsEventAvailableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsEventAvailable",
      requestType = app.onepass.apis.IsEventAvailableRequest.class,
      responseType = app.onepass.apis.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.IsEventAvailableRequest,
      app.onepass.apis.Result> getIsEventAvailableMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.IsEventAvailableRequest, app.onepass.apis.Result> getIsEventAvailableMethod;
    if ((getIsEventAvailableMethod = ParticipantServiceGrpc.getIsEventAvailableMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getIsEventAvailableMethod = ParticipantServiceGrpc.getIsEventAvailableMethod) == null) {
          ParticipantServiceGrpc.getIsEventAvailableMethod = getIsEventAvailableMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.IsEventAvailableRequest, app.onepass.apis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsEventAvailable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.IsEventAvailableRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("IsEventAvailable"))
              .build();
        }
      }
    }
    return getIsEventAvailableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.JoinEventRequest,
      app.onepass.apis.Result> getJoinEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "JoinEvent",
      requestType = app.onepass.apis.JoinEventRequest.class,
      responseType = app.onepass.apis.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.JoinEventRequest,
      app.onepass.apis.Result> getJoinEventMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.JoinEventRequest, app.onepass.apis.Result> getJoinEventMethod;
    if ((getJoinEventMethod = ParticipantServiceGrpc.getJoinEventMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getJoinEventMethod = ParticipantServiceGrpc.getJoinEventMethod) == null) {
          ParticipantServiceGrpc.getJoinEventMethod = getJoinEventMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.JoinEventRequest, app.onepass.apis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "JoinEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.JoinEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("JoinEvent"))
              .build();
        }
      }
    }
    return getJoinEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.CancelEventRequest,
      app.onepass.apis.Result> getCancelEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelEvent",
      requestType = app.onepass.apis.CancelEventRequest.class,
      responseType = app.onepass.apis.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.CancelEventRequest,
      app.onepass.apis.Result> getCancelEventMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.CancelEventRequest, app.onepass.apis.Result> getCancelEventMethod;
    if ((getCancelEventMethod = ParticipantServiceGrpc.getCancelEventMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getCancelEventMethod = ParticipantServiceGrpc.getCancelEventMethod) == null) {
          ParticipantServiceGrpc.getCancelEventMethod = getCancelEventMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.CancelEventRequest, app.onepass.apis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.CancelEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("CancelEvent"))
              .build();
        }
      }
    }
    return getCancelEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.CreateFeedbackRequest,
      app.onepass.apis.Result> getCreateFeedbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateFeedback",
      requestType = app.onepass.apis.CreateFeedbackRequest.class,
      responseType = app.onepass.apis.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.CreateFeedbackRequest,
      app.onepass.apis.Result> getCreateFeedbackMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.CreateFeedbackRequest, app.onepass.apis.Result> getCreateFeedbackMethod;
    if ((getCreateFeedbackMethod = ParticipantServiceGrpc.getCreateFeedbackMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getCreateFeedbackMethod = ParticipantServiceGrpc.getCreateFeedbackMethod) == null) {
          ParticipantServiceGrpc.getCreateFeedbackMethod = getCreateFeedbackMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.CreateFeedbackRequest, app.onepass.apis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateFeedback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.CreateFeedbackRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("CreateFeedback"))
              .build();
        }
      }
    }
    return getCreateFeedbackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.RemoveFeedbackRequest,
      app.onepass.apis.Result> getRemoveFeedbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveFeedback",
      requestType = app.onepass.apis.RemoveFeedbackRequest.class,
      responseType = app.onepass.apis.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.RemoveFeedbackRequest,
      app.onepass.apis.Result> getRemoveFeedbackMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.RemoveFeedbackRequest, app.onepass.apis.Result> getRemoveFeedbackMethod;
    if ((getRemoveFeedbackMethod = ParticipantServiceGrpc.getRemoveFeedbackMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getRemoveFeedbackMethod = ParticipantServiceGrpc.getRemoveFeedbackMethod) == null) {
          ParticipantServiceGrpc.getRemoveFeedbackMethod = getRemoveFeedbackMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.RemoveFeedbackRequest, app.onepass.apis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveFeedback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.RemoveFeedbackRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("RemoveFeedback"))
              .build();
        }
      }
    }
    return getRemoveFeedbackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.SearchEventsByNameRequest,
      app.onepass.apis.SearchEventsByNameRespond> getSearchEventsByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchEventsByName",
      requestType = app.onepass.apis.SearchEventsByNameRequest.class,
      responseType = app.onepass.apis.SearchEventsByNameRespond.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.SearchEventsByNameRequest,
      app.onepass.apis.SearchEventsByNameRespond> getSearchEventsByNameMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.SearchEventsByNameRequest, app.onepass.apis.SearchEventsByNameRespond> getSearchEventsByNameMethod;
    if ((getSearchEventsByNameMethod = ParticipantServiceGrpc.getSearchEventsByNameMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getSearchEventsByNameMethod = ParticipantServiceGrpc.getSearchEventsByNameMethod) == null) {
          ParticipantServiceGrpc.getSearchEventsByNameMethod = getSearchEventsByNameMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.SearchEventsByNameRequest, app.onepass.apis.SearchEventsByNameRespond>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchEventsByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.SearchEventsByNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.SearchEventsByNameRespond.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("SearchEventsByName"))
              .build();
        }
      }
    }
    return getSearchEventsByNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GenerateQRRequest,
      app.onepass.apis.GenerateQRRespond> getGenerateQRMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateQR",
      requestType = app.onepass.apis.GenerateQRRequest.class,
      responseType = app.onepass.apis.GenerateQRRespond.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GenerateQRRequest,
      app.onepass.apis.GenerateQRRespond> getGenerateQRMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GenerateQRRequest, app.onepass.apis.GenerateQRRespond> getGenerateQRMethod;
    if ((getGenerateQRMethod = ParticipantServiceGrpc.getGenerateQRMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getGenerateQRMethod = ParticipantServiceGrpc.getGenerateQRMethod) == null) {
          ParticipantServiceGrpc.getGenerateQRMethod = getGenerateQRMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GenerateQRRequest, app.onepass.apis.GenerateQRRespond>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateQR"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GenerateQRRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GenerateQRRespond.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("GenerateQR"))
              .build();
        }
      }
    }
    return getGenerateQRMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GetEventRequest,
      app.onepass.apis.Event> getGetEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEvent",
      requestType = app.onepass.apis.GetEventRequest.class,
      responseType = app.onepass.apis.Event.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GetEventRequest,
      app.onepass.apis.Event> getGetEventMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GetEventRequest, app.onepass.apis.Event> getGetEventMethod;
    if ((getGetEventMethod = ParticipantServiceGrpc.getGetEventMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getGetEventMethod = ParticipantServiceGrpc.getGetEventMethod) == null) {
          ParticipantServiceGrpc.getGetEventMethod = getGetEventMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GetEventRequest, app.onepass.apis.Event>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Event.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("GetEvent"))
              .build();
        }
      }
    }
    return getGetEventMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ParticipantServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ParticipantServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ParticipantServiceStub>() {
        @java.lang.Override
        public ParticipantServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ParticipantServiceStub(channel, callOptions);
        }
      };
    return ParticipantServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ParticipantServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ParticipantServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ParticipantServiceBlockingStub>() {
        @java.lang.Override
        public ParticipantServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ParticipantServiceBlockingStub(channel, callOptions);
        }
      };
    return ParticipantServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ParticipantServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ParticipantServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ParticipantServiceFutureStub>() {
        @java.lang.Override
        public ParticipantServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ParticipantServiceFutureStub(channel, callOptions);
        }
      };
    return ParticipantServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ParticipantServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void isEventAvailable(app.onepass.apis.IsEventAvailableRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsEventAvailableMethod(), responseObserver);
    }

    /**
     */
    public void joinEvent(app.onepass.apis.JoinEventRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getJoinEventMethod(), responseObserver);
    }

    /**
     */
    public void cancelEvent(app.onepass.apis.CancelEventRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelEventMethod(), responseObserver);
    }

    /**
     */
    public void createFeedback(app.onepass.apis.CreateFeedbackRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateFeedbackMethod(), responseObserver);
    }

    /**
     */
    public void removeFeedback(app.onepass.apis.RemoveFeedbackRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveFeedbackMethod(), responseObserver);
    }

    /**
     */
    public void searchEventsByName(app.onepass.apis.SearchEventsByNameRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.SearchEventsByNameRespond> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchEventsByNameMethod(), responseObserver);
    }

    /**
     */
    public void generateQR(app.onepass.apis.GenerateQRRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GenerateQRRespond> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateQRMethod(), responseObserver);
    }

    /**
     */
    public void getEvent(app.onepass.apis.GetEventRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Event> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEventMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getIsEventAvailableMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.IsEventAvailableRequest,
                app.onepass.apis.Result>(
                  this, METHODID_IS_EVENT_AVAILABLE)))
          .addMethod(
            getJoinEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.JoinEventRequest,
                app.onepass.apis.Result>(
                  this, METHODID_JOIN_EVENT)))
          .addMethod(
            getCancelEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.CancelEventRequest,
                app.onepass.apis.Result>(
                  this, METHODID_CANCEL_EVENT)))
          .addMethod(
            getCreateFeedbackMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.CreateFeedbackRequest,
                app.onepass.apis.Result>(
                  this, METHODID_CREATE_FEEDBACK)))
          .addMethod(
            getRemoveFeedbackMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.RemoveFeedbackRequest,
                app.onepass.apis.Result>(
                  this, METHODID_REMOVE_FEEDBACK)))
          .addMethod(
            getSearchEventsByNameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.SearchEventsByNameRequest,
                app.onepass.apis.SearchEventsByNameRespond>(
                  this, METHODID_SEARCH_EVENTS_BY_NAME)))
          .addMethod(
            getGenerateQRMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GenerateQRRequest,
                app.onepass.apis.GenerateQRRespond>(
                  this, METHODID_GENERATE_QR)))
          .addMethod(
            getGetEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GetEventRequest,
                app.onepass.apis.Event>(
                  this, METHODID_GET_EVENT)))
          .build();
    }
  }

  /**
   */
  public static final class ParticipantServiceStub extends io.grpc.stub.AbstractAsyncStub<ParticipantServiceStub> {
    private ParticipantServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParticipantServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ParticipantServiceStub(channel, callOptions);
    }

    /**
     */
    public void isEventAvailable(app.onepass.apis.IsEventAvailableRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsEventAvailableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void joinEvent(app.onepass.apis.JoinEventRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getJoinEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelEvent(app.onepass.apis.CancelEventRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createFeedback(app.onepass.apis.CreateFeedbackRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateFeedbackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeFeedback(app.onepass.apis.RemoveFeedbackRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveFeedbackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchEventsByName(app.onepass.apis.SearchEventsByNameRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.SearchEventsByNameRespond> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchEventsByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void generateQR(app.onepass.apis.GenerateQRRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GenerateQRRespond> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateQRMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEvent(app.onepass.apis.GetEventRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Event> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEventMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ParticipantServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ParticipantServiceBlockingStub> {
    private ParticipantServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParticipantServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ParticipantServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public app.onepass.apis.Result isEventAvailable(app.onepass.apis.IsEventAvailableRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsEventAvailableMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Result joinEvent(app.onepass.apis.JoinEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getJoinEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Result cancelEvent(app.onepass.apis.CancelEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Result createFeedback(app.onepass.apis.CreateFeedbackRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateFeedbackMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Result removeFeedback(app.onepass.apis.RemoveFeedbackRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveFeedbackMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.SearchEventsByNameRespond searchEventsByName(app.onepass.apis.SearchEventsByNameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchEventsByNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.GenerateQRRespond generateQR(app.onepass.apis.GenerateQRRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateQRMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Event getEvent(app.onepass.apis.GetEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEventMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ParticipantServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ParticipantServiceFutureStub> {
    private ParticipantServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParticipantServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ParticipantServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Result> isEventAvailable(
        app.onepass.apis.IsEventAvailableRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsEventAvailableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Result> joinEvent(
        app.onepass.apis.JoinEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getJoinEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Result> cancelEvent(
        app.onepass.apis.CancelEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Result> createFeedback(
        app.onepass.apis.CreateFeedbackRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateFeedbackMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Result> removeFeedback(
        app.onepass.apis.RemoveFeedbackRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveFeedbackMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.SearchEventsByNameRespond> searchEventsByName(
        app.onepass.apis.SearchEventsByNameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchEventsByNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.GenerateQRRespond> generateQR(
        app.onepass.apis.GenerateQRRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateQRMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Event> getEvent(
        app.onepass.apis.GetEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEventMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_IS_EVENT_AVAILABLE = 0;
  private static final int METHODID_JOIN_EVENT = 1;
  private static final int METHODID_CANCEL_EVENT = 2;
  private static final int METHODID_CREATE_FEEDBACK = 3;
  private static final int METHODID_REMOVE_FEEDBACK = 4;
  private static final int METHODID_SEARCH_EVENTS_BY_NAME = 5;
  private static final int METHODID_GENERATE_QR = 6;
  private static final int METHODID_GET_EVENT = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ParticipantServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ParticipantServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_IS_EVENT_AVAILABLE:
          serviceImpl.isEventAvailable((app.onepass.apis.IsEventAvailableRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Result>) responseObserver);
          break;
        case METHODID_JOIN_EVENT:
          serviceImpl.joinEvent((app.onepass.apis.JoinEventRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Result>) responseObserver);
          break;
        case METHODID_CANCEL_EVENT:
          serviceImpl.cancelEvent((app.onepass.apis.CancelEventRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Result>) responseObserver);
          break;
        case METHODID_CREATE_FEEDBACK:
          serviceImpl.createFeedback((app.onepass.apis.CreateFeedbackRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Result>) responseObserver);
          break;
        case METHODID_REMOVE_FEEDBACK:
          serviceImpl.removeFeedback((app.onepass.apis.RemoveFeedbackRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Result>) responseObserver);
          break;
        case METHODID_SEARCH_EVENTS_BY_NAME:
          serviceImpl.searchEventsByName((app.onepass.apis.SearchEventsByNameRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.SearchEventsByNameRespond>) responseObserver);
          break;
        case METHODID_GENERATE_QR:
          serviceImpl.generateQR((app.onepass.apis.GenerateQRRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.GenerateQRRespond>) responseObserver);
          break;
        case METHODID_GET_EVENT:
          serviceImpl.getEvent((app.onepass.apis.GetEventRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Event>) responseObserver);
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

  private static abstract class ParticipantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ParticipantServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return app.onepass.apis.ParticipantProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ParticipantService");
    }
  }

  private static final class ParticipantServiceFileDescriptorSupplier
      extends ParticipantServiceBaseDescriptorSupplier {
    ParticipantServiceFileDescriptorSupplier() {}
  }

  private static final class ParticipantServiceMethodDescriptorSupplier
      extends ParticipantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ParticipantServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ParticipantServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ParticipantServiceFileDescriptorSupplier())
              .addMethod(getIsEventAvailableMethod())
              .addMethod(getJoinEventMethod())
              .addMethod(getCancelEventMethod())
              .addMethod(getCreateFeedbackMethod())
              .addMethod(getRemoveFeedbackMethod())
              .addMethod(getSearchEventsByNameMethod())
              .addMethod(getGenerateQRMethod())
              .addMethod(getGetEventMethod())
              .build();
        }
      }
    }
    return result;
  }
}
