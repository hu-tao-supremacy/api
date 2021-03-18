package app.onepass.apis;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
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

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UserWithEventRequest,
      app.onepass.apis.Event> getJoinEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "JoinEvent",
      requestType = app.onepass.apis.UserWithEventRequest.class,
      responseType = app.onepass.apis.Event.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UserWithEventRequest,
      app.onepass.apis.Event> getJoinEventMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UserWithEventRequest, app.onepass.apis.Event> getJoinEventMethod;
    if ((getJoinEventMethod = ParticipantServiceGrpc.getJoinEventMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getJoinEventMethod = ParticipantServiceGrpc.getJoinEventMethod) == null) {
          ParticipantServiceGrpc.getJoinEventMethod = getJoinEventMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UserWithEventRequest, app.onepass.apis.Event>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "JoinEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UserWithEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Event.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("JoinEvent"))
              .build();
        }
      }
    }
    return getJoinEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UserWithEventRequest,
      app.onepass.apis.Event> getCancelEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelEvent",
      requestType = app.onepass.apis.UserWithEventRequest.class,
      responseType = app.onepass.apis.Event.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UserWithEventRequest,
      app.onepass.apis.Event> getCancelEventMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UserWithEventRequest, app.onepass.apis.Event> getCancelEventMethod;
    if ((getCancelEventMethod = ParticipantServiceGrpc.getCancelEventMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getCancelEventMethod = ParticipantServiceGrpc.getCancelEventMethod) == null) {
          ParticipantServiceGrpc.getCancelEventMethod = getCancelEventMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UserWithEventRequest, app.onepass.apis.Event>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UserWithEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Event.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("CancelEvent"))
              .build();
        }
      }
    }
    return getCancelEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.CreateFeedbackRequest,
      app.onepass.apis.EventFeedback> getCreateFeedbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateFeedback",
      requestType = app.onepass.apis.CreateFeedbackRequest.class,
      responseType = app.onepass.apis.EventFeedback.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.CreateFeedbackRequest,
      app.onepass.apis.EventFeedback> getCreateFeedbackMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.CreateFeedbackRequest, app.onepass.apis.EventFeedback> getCreateFeedbackMethod;
    if ((getCreateFeedbackMethod = ParticipantServiceGrpc.getCreateFeedbackMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getCreateFeedbackMethod = ParticipantServiceGrpc.getCreateFeedbackMethod) == null) {
          ParticipantServiceGrpc.getCreateFeedbackMethod = getCreateFeedbackMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.CreateFeedbackRequest, app.onepass.apis.EventFeedback>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateFeedback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.CreateFeedbackRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.EventFeedback.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("CreateFeedback"))
              .build();
        }
      }
    }
    return getCreateFeedbackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UserWithEventRequest,
      app.onepass.apis.EventFeedback> getHasSubmitFeedbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HasSubmitFeedback",
      requestType = app.onepass.apis.UserWithEventRequest.class,
      responseType = app.onepass.apis.EventFeedback.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UserWithEventRequest,
      app.onepass.apis.EventFeedback> getHasSubmitFeedbackMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UserWithEventRequest, app.onepass.apis.EventFeedback> getHasSubmitFeedbackMethod;
    if ((getHasSubmitFeedbackMethod = ParticipantServiceGrpc.getHasSubmitFeedbackMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getHasSubmitFeedbackMethod = ParticipantServiceGrpc.getHasSubmitFeedbackMethod) == null) {
          ParticipantServiceGrpc.getHasSubmitFeedbackMethod = getHasSubmitFeedbackMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UserWithEventRequest, app.onepass.apis.EventFeedback>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HasSubmitFeedback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UserWithEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.EventFeedback.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("HasSubmitFeedback"))
              .build();
        }
      }
    }
    return getHasSubmitFeedbackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.EventFeedback,
      app.onepass.apis.EventFeedback> getRemoveFeedbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveFeedback",
      requestType = app.onepass.apis.EventFeedback.class,
      responseType = app.onepass.apis.EventFeedback.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.EventFeedback,
      app.onepass.apis.EventFeedback> getRemoveFeedbackMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.EventFeedback, app.onepass.apis.EventFeedback> getRemoveFeedbackMethod;
    if ((getRemoveFeedbackMethod = ParticipantServiceGrpc.getRemoveFeedbackMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getRemoveFeedbackMethod = ParticipantServiceGrpc.getRemoveFeedbackMethod) == null) {
          ParticipantServiceGrpc.getRemoveFeedbackMethod = getRemoveFeedbackMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.EventFeedback, app.onepass.apis.EventFeedback>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveFeedback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.EventFeedback.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.EventFeedback.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("RemoveFeedback"))
              .build();
        }
      }
    }
    return getRemoveFeedbackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.Event,
      app.onepass.apis.GetFeedbacksFromEventResponse> getGetFeedbacksFromEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFeedbacksFromEvent",
      requestType = app.onepass.apis.Event.class,
      responseType = app.onepass.apis.GetFeedbacksFromEventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.Event,
      app.onepass.apis.GetFeedbacksFromEventResponse> getGetFeedbacksFromEventMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.Event, app.onepass.apis.GetFeedbacksFromEventResponse> getGetFeedbacksFromEventMethod;
    if ((getGetFeedbacksFromEventMethod = ParticipantServiceGrpc.getGetFeedbacksFromEventMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getGetFeedbacksFromEventMethod = ParticipantServiceGrpc.getGetFeedbacksFromEventMethod) == null) {
          ParticipantServiceGrpc.getGetFeedbacksFromEventMethod = getGetFeedbacksFromEventMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.Event, app.onepass.apis.GetFeedbacksFromEventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFeedbacksFromEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Event.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetFeedbacksFromEventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("GetFeedbacksFromEvent"))
              .build();
        }
      }
    }
    return getGetFeedbacksFromEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UserWithEventRequest,
      app.onepass.apis.EventFeedback> getGetUserFeedbackFromEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserFeedbackFromEvent",
      requestType = app.onepass.apis.UserWithEventRequest.class,
      responseType = app.onepass.apis.EventFeedback.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UserWithEventRequest,
      app.onepass.apis.EventFeedback> getGetUserFeedbackFromEventMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UserWithEventRequest, app.onepass.apis.EventFeedback> getGetUserFeedbackFromEventMethod;
    if ((getGetUserFeedbackFromEventMethod = ParticipantServiceGrpc.getGetUserFeedbackFromEventMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getGetUserFeedbackFromEventMethod = ParticipantServiceGrpc.getGetUserFeedbackFromEventMethod) == null) {
          ParticipantServiceGrpc.getGetUserFeedbackFromEventMethod = getGetUserFeedbackFromEventMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UserWithEventRequest, app.onepass.apis.EventFeedback>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserFeedbackFromEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UserWithEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.EventFeedback.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("GetUserFeedbackFromEvent"))
              .build();
        }
      }
    }
    return getGetUserFeedbackFromEventMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      app.onepass.apis.EventsResponse> getGetAllEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllEvents",
      requestType = com.google.protobuf.Empty.class,
      responseType = app.onepass.apis.EventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      app.onepass.apis.EventsResponse> getGetAllEventsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, app.onepass.apis.EventsResponse> getGetAllEventsMethod;
    if ((getGetAllEventsMethod = ParticipantServiceGrpc.getGetAllEventsMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getGetAllEventsMethod = ParticipantServiceGrpc.getGetAllEventsMethod) == null) {
          ParticipantServiceGrpc.getGetAllEventsMethod = getGetAllEventsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, app.onepass.apis.EventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.EventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("GetAllEvents"))
              .build();
        }
      }
    }
    return getGetAllEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      app.onepass.apis.EventsResponse> getGetSuggestedEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSuggestedEvents",
      requestType = com.google.protobuf.Empty.class,
      responseType = app.onepass.apis.EventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      app.onepass.apis.EventsResponse> getGetSuggestedEventsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, app.onepass.apis.EventsResponse> getGetSuggestedEventsMethod;
    if ((getGetSuggestedEventsMethod = ParticipantServiceGrpc.getGetSuggestedEventsMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getGetSuggestedEventsMethod = ParticipantServiceGrpc.getGetSuggestedEventsMethod) == null) {
          ParticipantServiceGrpc.getGetSuggestedEventsMethod = getGetSuggestedEventsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, app.onepass.apis.EventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSuggestedEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.EventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("GetSuggestedEvents"))
              .build();
        }
      }
    }
    return getGetSuggestedEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.StringInputRequest,
      app.onepass.apis.EventsResponse> getGetEventsByStringOfNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEventsByStringOfName",
      requestType = app.onepass.apis.StringInputRequest.class,
      responseType = app.onepass.apis.EventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.StringInputRequest,
      app.onepass.apis.EventsResponse> getGetEventsByStringOfNameMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.StringInputRequest, app.onepass.apis.EventsResponse> getGetEventsByStringOfNameMethod;
    if ((getGetEventsByStringOfNameMethod = ParticipantServiceGrpc.getGetEventsByStringOfNameMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getGetEventsByStringOfNameMethod = ParticipantServiceGrpc.getGetEventsByStringOfNameMethod) == null) {
          ParticipantServiceGrpc.getGetEventsByStringOfNameMethod = getGetEventsByStringOfNameMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.StringInputRequest, app.onepass.apis.EventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEventsByStringOfName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.StringInputRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.EventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("GetEventsByStringOfName"))
              .build();
        }
      }
    }
    return getGetEventsByStringOfNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.Tag,
      app.onepass.apis.EventsResponse> getGetEventsByTagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEventsByTag",
      requestType = app.onepass.apis.Tag.class,
      responseType = app.onepass.apis.EventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.Tag,
      app.onepass.apis.EventsResponse> getGetEventsByTagMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.Tag, app.onepass.apis.EventsResponse> getGetEventsByTagMethod;
    if ((getGetEventsByTagMethod = ParticipantServiceGrpc.getGetEventsByTagMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getGetEventsByTagMethod = ParticipantServiceGrpc.getGetEventsByTagMethod) == null) {
          ParticipantServiceGrpc.getGetEventsByTagMethod = getGetEventsByTagMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.Tag, app.onepass.apis.EventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEventsByTag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Tag.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.EventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("GetEventsByTag"))
              .build();
        }
      }
    }
    return getGetEventsByTagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.Organization,
      app.onepass.apis.EventsResponse> getGetEventsByOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEventsByOrganization",
      requestType = app.onepass.apis.Organization.class,
      responseType = app.onepass.apis.EventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.Organization,
      app.onepass.apis.EventsResponse> getGetEventsByOrganizationMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.Organization, app.onepass.apis.EventsResponse> getGetEventsByOrganizationMethod;
    if ((getGetEventsByOrganizationMethod = ParticipantServiceGrpc.getGetEventsByOrganizationMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getGetEventsByOrganizationMethod = ParticipantServiceGrpc.getGetEventsByOrganizationMethod) == null) {
          ParticipantServiceGrpc.getGetEventsByOrganizationMethod = getGetEventsByOrganizationMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.Organization, app.onepass.apis.EventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEventsByOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Organization.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.EventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("GetEventsByOrganization"))
              .build();
        }
      }
    }
    return getGetEventsByOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.Facility,
      app.onepass.apis.EventsResponse> getGetEventsByFacilityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEventsByFacility",
      requestType = app.onepass.apis.Facility.class,
      responseType = app.onepass.apis.EventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.Facility,
      app.onepass.apis.EventsResponse> getGetEventsByFacilityMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.Facility, app.onepass.apis.EventsResponse> getGetEventsByFacilityMethod;
    if ((getGetEventsByFacilityMethod = ParticipantServiceGrpc.getGetEventsByFacilityMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getGetEventsByFacilityMethod = ParticipantServiceGrpc.getGetEventsByFacilityMethod) == null) {
          ParticipantServiceGrpc.getGetEventsByFacilityMethod = getGetEventsByFacilityMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.Facility, app.onepass.apis.EventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEventsByFacility"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Facility.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.EventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("GetEventsByFacility"))
              .build();
        }
      }
    }
    return getGetEventsByFacilityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.StringInputRequest,
      app.onepass.apis.EventsResponse> getGetEventsByDateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEventsByDate",
      requestType = app.onepass.apis.StringInputRequest.class,
      responseType = app.onepass.apis.EventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.StringInputRequest,
      app.onepass.apis.EventsResponse> getGetEventsByDateMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.StringInputRequest, app.onepass.apis.EventsResponse> getGetEventsByDateMethod;
    if ((getGetEventsByDateMethod = ParticipantServiceGrpc.getGetEventsByDateMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getGetEventsByDateMethod = ParticipantServiceGrpc.getGetEventsByDateMethod) == null) {
          ParticipantServiceGrpc.getGetEventsByDateMethod = getGetEventsByDateMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.StringInputRequest, app.onepass.apis.EventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEventsByDate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.StringInputRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.EventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("GetEventsByDate"))
              .build();
        }
      }
    }
    return getGetEventsByDateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UserEvent,
      app.onepass.apis.GenerateQRResponse> getGenerateQRMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateQR",
      requestType = app.onepass.apis.UserEvent.class,
      responseType = app.onepass.apis.GenerateQRResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UserEvent,
      app.onepass.apis.GenerateQRResponse> getGenerateQRMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UserEvent, app.onepass.apis.GenerateQRResponse> getGenerateQRMethod;
    if ((getGenerateQRMethod = ParticipantServiceGrpc.getGenerateQRMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getGenerateQRMethod = ParticipantServiceGrpc.getGenerateQRMethod) == null) {
          ParticipantServiceGrpc.getGenerateQRMethod = getGenerateQRMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UserEvent, app.onepass.apis.GenerateQRResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateQR"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UserEvent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GenerateQRResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("GenerateQR"))
              .build();
        }
      }
    }
    return getGenerateQRMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      app.onepass.apis.Result> getPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ping",
      requestType = com.google.protobuf.Empty.class,
      responseType = app.onepass.apis.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      app.onepass.apis.Result> getPingMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, app.onepass.apis.Result> getPingMethod;
    if ((getPingMethod = ParticipantServiceGrpc.getPingMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getPingMethod = ParticipantServiceGrpc.getPingMethod) == null) {
          ParticipantServiceGrpc.getPingMethod = getPingMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, app.onepass.apis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("Ping"))
              .build();
        }
      }
    }
    return getPingMethod;
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
    public void joinEvent(app.onepass.apis.UserWithEventRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Event> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getJoinEventMethod(), responseObserver);
    }

    /**
     */
    public void cancelEvent(app.onepass.apis.UserWithEventRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Event> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelEventMethod(), responseObserver);
    }

    /**
     */
    public void createFeedback(app.onepass.apis.CreateFeedbackRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventFeedback> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateFeedbackMethod(), responseObserver);
    }

    /**
     */
    public void hasSubmitFeedback(app.onepass.apis.UserWithEventRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventFeedback> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHasSubmitFeedbackMethod(), responseObserver);
    }

    /**
     */
    public void removeFeedback(app.onepass.apis.EventFeedback request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventFeedback> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveFeedbackMethod(), responseObserver);
    }

    /**
     */
    public void getFeedbacksFromEvent(app.onepass.apis.Event request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GetFeedbacksFromEventResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFeedbacksFromEventMethod(), responseObserver);
    }

    /**
     */
    public void getUserFeedbackFromEvent(app.onepass.apis.UserWithEventRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventFeedback> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserFeedbackFromEventMethod(), responseObserver);
    }

    /**
     */
    public void getEvent(app.onepass.apis.GetEventRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Event> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEventMethod(), responseObserver);
    }

    /**
     */
    public void getAllEvents(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllEventsMethod(), responseObserver);
    }

    /**
     */
    public void getSuggestedEvents(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSuggestedEventsMethod(), responseObserver);
    }

    /**
     */
    public void getEventsByStringOfName(app.onepass.apis.StringInputRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEventsByStringOfNameMethod(), responseObserver);
    }

    /**
     */
    public void getEventsByTag(app.onepass.apis.Tag request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEventsByTagMethod(), responseObserver);
    }

    /**
     */
    public void getEventsByOrganization(app.onepass.apis.Organization request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEventsByOrganizationMethod(), responseObserver);
    }

    /**
     */
    public void getEventsByFacility(app.onepass.apis.Facility request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEventsByFacilityMethod(), responseObserver);
    }

    /**
     */
    public void getEventsByDate(app.onepass.apis.StringInputRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEventsByDateMethod(), responseObserver);
    }

    /**
     */
    public void generateQR(app.onepass.apis.UserEvent request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GenerateQRResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateQRMethod(), responseObserver);
    }

    /**
     */
    public void ping(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
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
                app.onepass.apis.UserWithEventRequest,
                app.onepass.apis.Event>(
                  this, METHODID_JOIN_EVENT)))
          .addMethod(
            getCancelEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UserWithEventRequest,
                app.onepass.apis.Event>(
                  this, METHODID_CANCEL_EVENT)))
          .addMethod(
            getCreateFeedbackMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.CreateFeedbackRequest,
                app.onepass.apis.EventFeedback>(
                  this, METHODID_CREATE_FEEDBACK)))
          .addMethod(
            getHasSubmitFeedbackMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UserWithEventRequest,
                app.onepass.apis.EventFeedback>(
                  this, METHODID_HAS_SUBMIT_FEEDBACK)))
          .addMethod(
            getRemoveFeedbackMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.EventFeedback,
                app.onepass.apis.EventFeedback>(
                  this, METHODID_REMOVE_FEEDBACK)))
          .addMethod(
            getGetFeedbacksFromEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.Event,
                app.onepass.apis.GetFeedbacksFromEventResponse>(
                  this, METHODID_GET_FEEDBACKS_FROM_EVENT)))
          .addMethod(
            getGetUserFeedbackFromEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UserWithEventRequest,
                app.onepass.apis.EventFeedback>(
                  this, METHODID_GET_USER_FEEDBACK_FROM_EVENT)))
          .addMethod(
            getGetEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GetEventRequest,
                app.onepass.apis.Event>(
                  this, METHODID_GET_EVENT)))
          .addMethod(
            getGetAllEventsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                app.onepass.apis.EventsResponse>(
                  this, METHODID_GET_ALL_EVENTS)))
          .addMethod(
            getGetSuggestedEventsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                app.onepass.apis.EventsResponse>(
                  this, METHODID_GET_SUGGESTED_EVENTS)))
          .addMethod(
            getGetEventsByStringOfNameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.StringInputRequest,
                app.onepass.apis.EventsResponse>(
                  this, METHODID_GET_EVENTS_BY_STRING_OF_NAME)))
          .addMethod(
            getGetEventsByTagMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.Tag,
                app.onepass.apis.EventsResponse>(
                  this, METHODID_GET_EVENTS_BY_TAG)))
          .addMethod(
            getGetEventsByOrganizationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.Organization,
                app.onepass.apis.EventsResponse>(
                  this, METHODID_GET_EVENTS_BY_ORGANIZATION)))
          .addMethod(
            getGetEventsByFacilityMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.Facility,
                app.onepass.apis.EventsResponse>(
                  this, METHODID_GET_EVENTS_BY_FACILITY)))
          .addMethod(
            getGetEventsByDateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.StringInputRequest,
                app.onepass.apis.EventsResponse>(
                  this, METHODID_GET_EVENTS_BY_DATE)))
          .addMethod(
            getGenerateQRMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UserEvent,
                app.onepass.apis.GenerateQRResponse>(
                  this, METHODID_GENERATE_QR)))
          .addMethod(
            getPingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                app.onepass.apis.Result>(
                  this, METHODID_PING)))
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
    public void joinEvent(app.onepass.apis.UserWithEventRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Event> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getJoinEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelEvent(app.onepass.apis.UserWithEventRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Event> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createFeedback(app.onepass.apis.CreateFeedbackRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventFeedback> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateFeedbackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void hasSubmitFeedback(app.onepass.apis.UserWithEventRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventFeedback> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHasSubmitFeedbackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeFeedback(app.onepass.apis.EventFeedback request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventFeedback> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveFeedbackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFeedbacksFromEvent(app.onepass.apis.Event request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GetFeedbacksFromEventResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFeedbacksFromEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserFeedbackFromEvent(app.onepass.apis.UserWithEventRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventFeedback> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserFeedbackFromEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEvent(app.onepass.apis.GetEventRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Event> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllEvents(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSuggestedEvents(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSuggestedEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEventsByStringOfName(app.onepass.apis.StringInputRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEventsByStringOfNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEventsByTag(app.onepass.apis.Tag request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEventsByTagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEventsByOrganization(app.onepass.apis.Organization request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEventsByOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEventsByFacility(app.onepass.apis.Facility request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEventsByFacilityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEventsByDate(app.onepass.apis.StringInputRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEventsByDateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void generateQR(app.onepass.apis.UserEvent request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GenerateQRResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateQRMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void ping(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request, responseObserver);
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
    public app.onepass.apis.Event joinEvent(app.onepass.apis.UserWithEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getJoinEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Event cancelEvent(app.onepass.apis.UserWithEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.EventFeedback createFeedback(app.onepass.apis.CreateFeedbackRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateFeedbackMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.EventFeedback hasSubmitFeedback(app.onepass.apis.UserWithEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHasSubmitFeedbackMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.EventFeedback removeFeedback(app.onepass.apis.EventFeedback request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveFeedbackMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.GetFeedbacksFromEventResponse getFeedbacksFromEvent(app.onepass.apis.Event request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFeedbacksFromEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.EventFeedback getUserFeedbackFromEvent(app.onepass.apis.UserWithEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserFeedbackFromEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Event getEvent(app.onepass.apis.GetEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.EventsResponse getAllEvents(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllEventsMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.EventsResponse getSuggestedEvents(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSuggestedEventsMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.EventsResponse getEventsByStringOfName(app.onepass.apis.StringInputRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEventsByStringOfNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.EventsResponse getEventsByTag(app.onepass.apis.Tag request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEventsByTagMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.EventsResponse getEventsByOrganization(app.onepass.apis.Organization request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEventsByOrganizationMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.EventsResponse getEventsByFacility(app.onepass.apis.Facility request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEventsByFacilityMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.EventsResponse getEventsByDate(app.onepass.apis.StringInputRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEventsByDateMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.GenerateQRResponse generateQR(app.onepass.apis.UserEvent request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateQRMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Result ping(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Event> joinEvent(
        app.onepass.apis.UserWithEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getJoinEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Event> cancelEvent(
        app.onepass.apis.UserWithEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.EventFeedback> createFeedback(
        app.onepass.apis.CreateFeedbackRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateFeedbackMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.EventFeedback> hasSubmitFeedback(
        app.onepass.apis.UserWithEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHasSubmitFeedbackMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.EventFeedback> removeFeedback(
        app.onepass.apis.EventFeedback request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveFeedbackMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.GetFeedbacksFromEventResponse> getFeedbacksFromEvent(
        app.onepass.apis.Event request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFeedbacksFromEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.EventFeedback> getUserFeedbackFromEvent(
        app.onepass.apis.UserWithEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserFeedbackFromEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Event> getEvent(
        app.onepass.apis.GetEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.EventsResponse> getAllEvents(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllEventsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.EventsResponse> getSuggestedEvents(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSuggestedEventsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.EventsResponse> getEventsByStringOfName(
        app.onepass.apis.StringInputRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEventsByStringOfNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.EventsResponse> getEventsByTag(
        app.onepass.apis.Tag request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEventsByTagMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.EventsResponse> getEventsByOrganization(
        app.onepass.apis.Organization request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEventsByOrganizationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.EventsResponse> getEventsByFacility(
        app.onepass.apis.Facility request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEventsByFacilityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.EventsResponse> getEventsByDate(
        app.onepass.apis.StringInputRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEventsByDateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.GenerateQRResponse> generateQR(
        app.onepass.apis.UserEvent request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateQRMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Result> ping(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_IS_EVENT_AVAILABLE = 0;
  private static final int METHODID_JOIN_EVENT = 1;
  private static final int METHODID_CANCEL_EVENT = 2;
  private static final int METHODID_CREATE_FEEDBACK = 3;
  private static final int METHODID_HAS_SUBMIT_FEEDBACK = 4;
  private static final int METHODID_REMOVE_FEEDBACK = 5;
  private static final int METHODID_GET_FEEDBACKS_FROM_EVENT = 6;
  private static final int METHODID_GET_USER_FEEDBACK_FROM_EVENT = 7;
  private static final int METHODID_GET_EVENT = 8;
  private static final int METHODID_GET_ALL_EVENTS = 9;
  private static final int METHODID_GET_SUGGESTED_EVENTS = 10;
  private static final int METHODID_GET_EVENTS_BY_STRING_OF_NAME = 11;
  private static final int METHODID_GET_EVENTS_BY_TAG = 12;
  private static final int METHODID_GET_EVENTS_BY_ORGANIZATION = 13;
  private static final int METHODID_GET_EVENTS_BY_FACILITY = 14;
  private static final int METHODID_GET_EVENTS_BY_DATE = 15;
  private static final int METHODID_GENERATE_QR = 16;
  private static final int METHODID_PING = 17;

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
          serviceImpl.joinEvent((app.onepass.apis.UserWithEventRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Event>) responseObserver);
          break;
        case METHODID_CANCEL_EVENT:
          serviceImpl.cancelEvent((app.onepass.apis.UserWithEventRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Event>) responseObserver);
          break;
        case METHODID_CREATE_FEEDBACK:
          serviceImpl.createFeedback((app.onepass.apis.CreateFeedbackRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.EventFeedback>) responseObserver);
          break;
        case METHODID_HAS_SUBMIT_FEEDBACK:
          serviceImpl.hasSubmitFeedback((app.onepass.apis.UserWithEventRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.EventFeedback>) responseObserver);
          break;
        case METHODID_REMOVE_FEEDBACK:
          serviceImpl.removeFeedback((app.onepass.apis.EventFeedback) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.EventFeedback>) responseObserver);
          break;
        case METHODID_GET_FEEDBACKS_FROM_EVENT:
          serviceImpl.getFeedbacksFromEvent((app.onepass.apis.Event) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.GetFeedbacksFromEventResponse>) responseObserver);
          break;
        case METHODID_GET_USER_FEEDBACK_FROM_EVENT:
          serviceImpl.getUserFeedbackFromEvent((app.onepass.apis.UserWithEventRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.EventFeedback>) responseObserver);
          break;
        case METHODID_GET_EVENT:
          serviceImpl.getEvent((app.onepass.apis.GetEventRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Event>) responseObserver);
          break;
        case METHODID_GET_ALL_EVENTS:
          serviceImpl.getAllEvents((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse>) responseObserver);
          break;
        case METHODID_GET_SUGGESTED_EVENTS:
          serviceImpl.getSuggestedEvents((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse>) responseObserver);
          break;
        case METHODID_GET_EVENTS_BY_STRING_OF_NAME:
          serviceImpl.getEventsByStringOfName((app.onepass.apis.StringInputRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse>) responseObserver);
          break;
        case METHODID_GET_EVENTS_BY_TAG:
          serviceImpl.getEventsByTag((app.onepass.apis.Tag) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse>) responseObserver);
          break;
        case METHODID_GET_EVENTS_BY_ORGANIZATION:
          serviceImpl.getEventsByOrganization((app.onepass.apis.Organization) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse>) responseObserver);
          break;
        case METHODID_GET_EVENTS_BY_FACILITY:
          serviceImpl.getEventsByFacility((app.onepass.apis.Facility) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse>) responseObserver);
          break;
        case METHODID_GET_EVENTS_BY_DATE:
          serviceImpl.getEventsByDate((app.onepass.apis.StringInputRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse>) responseObserver);
          break;
        case METHODID_GENERATE_QR:
          serviceImpl.generateQR((app.onepass.apis.UserEvent) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.GenerateQRResponse>) responseObserver);
          break;
        case METHODID_PING:
          serviceImpl.ping((com.google.protobuf.Empty) request,
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
              .addMethod(getHasSubmitFeedbackMethod())
              .addMethod(getRemoveFeedbackMethod())
              .addMethod(getGetFeedbacksFromEventMethod())
              .addMethod(getGetUserFeedbackFromEventMethod())
              .addMethod(getGetEventMethod())
              .addMethod(getGetAllEventsMethod())
              .addMethod(getGetSuggestedEventsMethod())
              .addMethod(getGetEventsByStringOfNameMethod())
              .addMethod(getGetEventsByTagMethod())
              .addMethod(getGetEventsByOrganizationMethod())
              .addMethod(getGetEventsByFacilityMethod())
              .addMethod(getGetEventsByDateMethod())
              .addMethod(getGenerateQRMethod())
              .addMethod(getPingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
