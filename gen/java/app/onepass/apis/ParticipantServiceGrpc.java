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
      com.google.protobuf.BoolValue> getIsEventAvailableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsEventAvailable",
      requestType = app.onepass.apis.IsEventAvailableRequest.class,
      responseType = com.google.protobuf.BoolValue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.IsEventAvailableRequest,
      com.google.protobuf.BoolValue> getIsEventAvailableMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.IsEventAvailableRequest, com.google.protobuf.BoolValue> getIsEventAvailableMethod;
    if ((getIsEventAvailableMethod = ParticipantServiceGrpc.getIsEventAvailableMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getIsEventAvailableMethod = ParticipantServiceGrpc.getIsEventAvailableMethod) == null) {
          ParticipantServiceGrpc.getIsEventAvailableMethod = getIsEventAvailableMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.IsEventAvailableRequest, com.google.protobuf.BoolValue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsEventAvailable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.IsEventAvailableRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.BoolValue.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("IsEventAvailable"))
              .build();
        }
      }
    }
    return getIsEventAvailableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UserWithEventRequest,
      app.onepass.apis.UserEvent> getJoinEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "JoinEvent",
      requestType = app.onepass.apis.UserWithEventRequest.class,
      responseType = app.onepass.apis.UserEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UserWithEventRequest,
      app.onepass.apis.UserEvent> getJoinEventMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UserWithEventRequest, app.onepass.apis.UserEvent> getJoinEventMethod;
    if ((getJoinEventMethod = ParticipantServiceGrpc.getJoinEventMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getJoinEventMethod = ParticipantServiceGrpc.getJoinEventMethod) == null) {
          ParticipantServiceGrpc.getJoinEventMethod = getJoinEventMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UserWithEventRequest, app.onepass.apis.UserEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "JoinEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UserWithEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UserEvent.getDefaultInstance()))
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

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.SubmitAnswerForPostEventQuestionRequest,
      app.onepass.apis.SubmitAnswerForPostEventQuestionResponse> getSubmitAnswerForPostEventQuestionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitAnswerForPostEventQuestion",
      requestType = app.onepass.apis.SubmitAnswerForPostEventQuestionRequest.class,
      responseType = app.onepass.apis.SubmitAnswerForPostEventQuestionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.SubmitAnswerForPostEventQuestionRequest,
      app.onepass.apis.SubmitAnswerForPostEventQuestionResponse> getSubmitAnswerForPostEventQuestionMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.SubmitAnswerForPostEventQuestionRequest, app.onepass.apis.SubmitAnswerForPostEventQuestionResponse> getSubmitAnswerForPostEventQuestionMethod;
    if ((getSubmitAnswerForPostEventQuestionMethod = ParticipantServiceGrpc.getSubmitAnswerForPostEventQuestionMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getSubmitAnswerForPostEventQuestionMethod = ParticipantServiceGrpc.getSubmitAnswerForPostEventQuestionMethod) == null) {
          ParticipantServiceGrpc.getSubmitAnswerForPostEventQuestionMethod = getSubmitAnswerForPostEventQuestionMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.SubmitAnswerForPostEventQuestionRequest, app.onepass.apis.SubmitAnswerForPostEventQuestionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitAnswerForPostEventQuestion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.SubmitAnswerForPostEventQuestionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.SubmitAnswerForPostEventQuestionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("SubmitAnswerForPostEventQuestion"))
              .build();
        }
      }
    }
    return getSubmitAnswerForPostEventQuestionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GetEventByIdRequest,
      app.onepass.apis.Event> getGetEventByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEventById",
      requestType = app.onepass.apis.GetEventByIdRequest.class,
      responseType = app.onepass.apis.Event.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GetEventByIdRequest,
      app.onepass.apis.Event> getGetEventByIdMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GetEventByIdRequest, app.onepass.apis.Event> getGetEventByIdMethod;
    if ((getGetEventByIdMethod = ParticipantServiceGrpc.getGetEventByIdMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getGetEventByIdMethod = ParticipantServiceGrpc.getGetEventByIdMethod) == null) {
          ParticipantServiceGrpc.getGetEventByIdMethod = getGetEventByIdMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GetEventByIdRequest, app.onepass.apis.Event>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEventById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetEventByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Event.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("GetEventById"))
              .build();
        }
      }
    }
    return getGetEventByIdMethod;
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

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GetUpcomingEventsRequest,
      app.onepass.apis.EventsResponse> getGetUpcomingEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUpcomingEvents",
      requestType = app.onepass.apis.GetUpcomingEventsRequest.class,
      responseType = app.onepass.apis.EventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GetUpcomingEventsRequest,
      app.onepass.apis.EventsResponse> getGetUpcomingEventsMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GetUpcomingEventsRequest, app.onepass.apis.EventsResponse> getGetUpcomingEventsMethod;
    if ((getGetUpcomingEventsMethod = ParticipantServiceGrpc.getGetUpcomingEventsMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getGetUpcomingEventsMethod = ParticipantServiceGrpc.getGetUpcomingEventsMethod) == null) {
          ParticipantServiceGrpc.getGetUpcomingEventsMethod = getGetUpcomingEventsMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GetUpcomingEventsRequest, app.onepass.apis.EventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUpcomingEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetUpcomingEventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.EventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("GetUpcomingEvents"))
              .build();
        }
      }
    }
    return getGetUpcomingEventsMethod;
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

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest,
      app.onepass.apis.EventsResponse> getGetEventsByTagIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEventsByTagId",
      requestType = app.onepass.apis.GetObjectByIdRequest.class,
      responseType = app.onepass.apis.EventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest,
      app.onepass.apis.EventsResponse> getGetEventsByTagIdMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest, app.onepass.apis.EventsResponse> getGetEventsByTagIdMethod;
    if ((getGetEventsByTagIdMethod = ParticipantServiceGrpc.getGetEventsByTagIdMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getGetEventsByTagIdMethod = ParticipantServiceGrpc.getGetEventsByTagIdMethod) == null) {
          ParticipantServiceGrpc.getGetEventsByTagIdMethod = getGetEventsByTagIdMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GetObjectByIdRequest, app.onepass.apis.EventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEventsByTagId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetObjectByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.EventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("GetEventsByTagId"))
              .build();
        }
      }
    }
    return getGetEventsByTagIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest,
      app.onepass.apis.EventsResponse> getGetEventsByOrganizationIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEventsByOrganizationId",
      requestType = app.onepass.apis.GetObjectByIdRequest.class,
      responseType = app.onepass.apis.EventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest,
      app.onepass.apis.EventsResponse> getGetEventsByOrganizationIdMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest, app.onepass.apis.EventsResponse> getGetEventsByOrganizationIdMethod;
    if ((getGetEventsByOrganizationIdMethod = ParticipantServiceGrpc.getGetEventsByOrganizationIdMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getGetEventsByOrganizationIdMethod = ParticipantServiceGrpc.getGetEventsByOrganizationIdMethod) == null) {
          ParticipantServiceGrpc.getGetEventsByOrganizationIdMethod = getGetEventsByOrganizationIdMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GetObjectByIdRequest, app.onepass.apis.EventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEventsByOrganizationId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetObjectByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.EventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("GetEventsByOrganizationId"))
              .build();
        }
      }
    }
    return getGetEventsByOrganizationIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest,
      app.onepass.apis.EventsResponse> getGetEventsByFacilityIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEventsByFacilityId",
      requestType = app.onepass.apis.GetObjectByIdRequest.class,
      responseType = app.onepass.apis.EventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest,
      app.onepass.apis.EventsResponse> getGetEventsByFacilityIdMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest, app.onepass.apis.EventsResponse> getGetEventsByFacilityIdMethod;
    if ((getGetEventsByFacilityIdMethod = ParticipantServiceGrpc.getGetEventsByFacilityIdMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getGetEventsByFacilityIdMethod = ParticipantServiceGrpc.getGetEventsByFacilityIdMethod) == null) {
          ParticipantServiceGrpc.getGetEventsByFacilityIdMethod = getGetEventsByFacilityIdMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GetObjectByIdRequest, app.onepass.apis.EventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEventsByFacilityId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetObjectByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.EventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("GetEventsByFacilityId"))
              .build();
        }
      }
    }
    return getGetEventsByFacilityIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Timestamp,
      app.onepass.apis.EventsResponse> getGetEventsByDateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEventsByDate",
      requestType = com.google.protobuf.Timestamp.class,
      responseType = app.onepass.apis.EventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Timestamp,
      app.onepass.apis.EventsResponse> getGetEventsByDateMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Timestamp, app.onepass.apis.EventsResponse> getGetEventsByDateMethod;
    if ((getGetEventsByDateMethod = ParticipantServiceGrpc.getGetEventsByDateMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getGetEventsByDateMethod = ParticipantServiceGrpc.getGetEventsByDateMethod) == null) {
          ParticipantServiceGrpc.getGetEventsByDateMethod = getGetEventsByDateMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Timestamp, app.onepass.apis.EventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEventsByDate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Timestamp.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.EventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("GetEventsByDate"))
              .build();
        }
      }
    }
    return getGetEventsByDateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest,
      app.onepass.apis.Location> getGetLocationByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLocationById",
      requestType = app.onepass.apis.GetObjectByIdRequest.class,
      responseType = app.onepass.apis.Location.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest,
      app.onepass.apis.Location> getGetLocationByIdMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest, app.onepass.apis.Location> getGetLocationByIdMethod;
    if ((getGetLocationByIdMethod = ParticipantServiceGrpc.getGetLocationByIdMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getGetLocationByIdMethod = ParticipantServiceGrpc.getGetLocationByIdMethod) == null) {
          ParticipantServiceGrpc.getGetLocationByIdMethod = getGetLocationByIdMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GetObjectByIdRequest, app.onepass.apis.Location>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLocationById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetObjectByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Location.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("GetLocationById"))
              .build();
        }
      }
    }
    return getGetLocationByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GenerateQRRequest,
      app.onepass.apis.GenerateQRResponse> getGenerateQRMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateQR",
      requestType = app.onepass.apis.GenerateQRRequest.class,
      responseType = app.onepass.apis.GenerateQRResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GenerateQRRequest,
      app.onepass.apis.GenerateQRResponse> getGenerateQRMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GenerateQRRequest, app.onepass.apis.GenerateQRResponse> getGenerateQRMethod;
    if ((getGenerateQRMethod = ParticipantServiceGrpc.getGenerateQRMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getGenerateQRMethod = ParticipantServiceGrpc.getGenerateQRMethod) == null) {
          ParticipantServiceGrpc.getGenerateQRMethod = getGenerateQRMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GenerateQRRequest, app.onepass.apis.GenerateQRResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateQR"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GenerateQRRequest.getDefaultInstance()))
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
      com.google.protobuf.BoolValue> getPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ping",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.google.protobuf.BoolValue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.BoolValue> getPingMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.google.protobuf.BoolValue> getPingMethod;
    if ((getPingMethod = ParticipantServiceGrpc.getPingMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getPingMethod = ParticipantServiceGrpc.getPingMethod) == null) {
          ParticipantServiceGrpc.getPingMethod = getPingMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.BoolValue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.BoolValue.getDefaultInstance()))
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
        io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsEventAvailableMethod(), responseObserver);
    }

    /**
     */
    public void joinEvent(app.onepass.apis.UserWithEventRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.UserEvent> responseObserver) {
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
    public void submitAnswerForPostEventQuestion(app.onepass.apis.SubmitAnswerForPostEventQuestionRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.SubmitAnswerForPostEventQuestionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitAnswerForPostEventQuestionMethod(), responseObserver);
    }

    /**
     */
    public void getEventById(app.onepass.apis.GetEventByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Event> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEventByIdMethod(), responseObserver);
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
    public void getUpcomingEvents(app.onepass.apis.GetUpcomingEventsRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUpcomingEventsMethod(), responseObserver);
    }

    /**
     */
    public void getEventsByStringOfName(app.onepass.apis.StringInputRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEventsByStringOfNameMethod(), responseObserver);
    }

    /**
     */
    public void getEventsByTagId(app.onepass.apis.GetObjectByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEventsByTagIdMethod(), responseObserver);
    }

    /**
     */
    public void getEventsByOrganizationId(app.onepass.apis.GetObjectByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEventsByOrganizationIdMethod(), responseObserver);
    }

    /**
     */
    public void getEventsByFacilityId(app.onepass.apis.GetObjectByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEventsByFacilityIdMethod(), responseObserver);
    }

    /**
     */
    public void getEventsByDate(com.google.protobuf.Timestamp request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEventsByDateMethod(), responseObserver);
    }

    /**
     */
    public void getLocationById(app.onepass.apis.GetObjectByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Location> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLocationByIdMethod(), responseObserver);
    }

    /**
     */
    public void generateQR(app.onepass.apis.GenerateQRRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GenerateQRResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateQRMethod(), responseObserver);
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
            getIsEventAvailableMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.IsEventAvailableRequest,
                com.google.protobuf.BoolValue>(
                  this, METHODID_IS_EVENT_AVAILABLE)))
          .addMethod(
            getJoinEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UserWithEventRequest,
                app.onepass.apis.UserEvent>(
                  this, METHODID_JOIN_EVENT)))
          .addMethod(
            getCancelEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UserWithEventRequest,
                app.onepass.apis.Event>(
                  this, METHODID_CANCEL_EVENT)))
          .addMethod(
            getSubmitAnswerForPostEventQuestionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.SubmitAnswerForPostEventQuestionRequest,
                app.onepass.apis.SubmitAnswerForPostEventQuestionResponse>(
                  this, METHODID_SUBMIT_ANSWER_FOR_POST_EVENT_QUESTION)))
          .addMethod(
            getGetEventByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GetEventByIdRequest,
                app.onepass.apis.Event>(
                  this, METHODID_GET_EVENT_BY_ID)))
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
            getGetUpcomingEventsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GetUpcomingEventsRequest,
                app.onepass.apis.EventsResponse>(
                  this, METHODID_GET_UPCOMING_EVENTS)))
          .addMethod(
            getGetEventsByStringOfNameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.StringInputRequest,
                app.onepass.apis.EventsResponse>(
                  this, METHODID_GET_EVENTS_BY_STRING_OF_NAME)))
          .addMethod(
            getGetEventsByTagIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GetObjectByIdRequest,
                app.onepass.apis.EventsResponse>(
                  this, METHODID_GET_EVENTS_BY_TAG_ID)))
          .addMethod(
            getGetEventsByOrganizationIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GetObjectByIdRequest,
                app.onepass.apis.EventsResponse>(
                  this, METHODID_GET_EVENTS_BY_ORGANIZATION_ID)))
          .addMethod(
            getGetEventsByFacilityIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GetObjectByIdRequest,
                app.onepass.apis.EventsResponse>(
                  this, METHODID_GET_EVENTS_BY_FACILITY_ID)))
          .addMethod(
            getGetEventsByDateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Timestamp,
                app.onepass.apis.EventsResponse>(
                  this, METHODID_GET_EVENTS_BY_DATE)))
          .addMethod(
            getGetLocationByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GetObjectByIdRequest,
                app.onepass.apis.Location>(
                  this, METHODID_GET_LOCATION_BY_ID)))
          .addMethod(
            getGenerateQRMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GenerateQRRequest,
                app.onepass.apis.GenerateQRResponse>(
                  this, METHODID_GENERATE_QR)))
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
        io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsEventAvailableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void joinEvent(app.onepass.apis.UserWithEventRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.UserEvent> responseObserver) {
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
    public void submitAnswerForPostEventQuestion(app.onepass.apis.SubmitAnswerForPostEventQuestionRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.SubmitAnswerForPostEventQuestionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitAnswerForPostEventQuestionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEventById(app.onepass.apis.GetEventByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Event> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEventByIdMethod(), getCallOptions()), request, responseObserver);
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
    public void getUpcomingEvents(app.onepass.apis.GetUpcomingEventsRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUpcomingEventsMethod(), getCallOptions()), request, responseObserver);
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
    public void getEventsByTagId(app.onepass.apis.GetObjectByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEventsByTagIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEventsByOrganizationId(app.onepass.apis.GetObjectByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEventsByOrganizationIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEventsByFacilityId(app.onepass.apis.GetObjectByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEventsByFacilityIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEventsByDate(com.google.protobuf.Timestamp request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEventsByDateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLocationById(app.onepass.apis.GetObjectByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Location> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLocationByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void generateQR(app.onepass.apis.GenerateQRRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GenerateQRResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateQRMethod(), getCallOptions()), request, responseObserver);
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
    public com.google.protobuf.BoolValue isEventAvailable(app.onepass.apis.IsEventAvailableRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsEventAvailableMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.UserEvent joinEvent(app.onepass.apis.UserWithEventRequest request) {
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
    public app.onepass.apis.SubmitAnswerForPostEventQuestionResponse submitAnswerForPostEventQuestion(app.onepass.apis.SubmitAnswerForPostEventQuestionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitAnswerForPostEventQuestionMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Event getEventById(app.onepass.apis.GetEventByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEventByIdMethod(), getCallOptions(), request);
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
    public app.onepass.apis.EventsResponse getUpcomingEvents(app.onepass.apis.GetUpcomingEventsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUpcomingEventsMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.EventsResponse getEventsByStringOfName(app.onepass.apis.StringInputRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEventsByStringOfNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.EventsResponse getEventsByTagId(app.onepass.apis.GetObjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEventsByTagIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.EventsResponse getEventsByOrganizationId(app.onepass.apis.GetObjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEventsByOrganizationIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.EventsResponse getEventsByFacilityId(app.onepass.apis.GetObjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEventsByFacilityIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.EventsResponse getEventsByDate(com.google.protobuf.Timestamp request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEventsByDateMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Location getLocationById(app.onepass.apis.GetObjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLocationByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.GenerateQRResponse generateQR(app.onepass.apis.GenerateQRRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateQRMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.BoolValue> isEventAvailable(
        app.onepass.apis.IsEventAvailableRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsEventAvailableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.UserEvent> joinEvent(
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
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.SubmitAnswerForPostEventQuestionResponse> submitAnswerForPostEventQuestion(
        app.onepass.apis.SubmitAnswerForPostEventQuestionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitAnswerForPostEventQuestionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Event> getEventById(
        app.onepass.apis.GetEventByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEventByIdMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.EventsResponse> getUpcomingEvents(
        app.onepass.apis.GetUpcomingEventsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUpcomingEventsMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.EventsResponse> getEventsByTagId(
        app.onepass.apis.GetObjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEventsByTagIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.EventsResponse> getEventsByOrganizationId(
        app.onepass.apis.GetObjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEventsByOrganizationIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.EventsResponse> getEventsByFacilityId(
        app.onepass.apis.GetObjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEventsByFacilityIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.EventsResponse> getEventsByDate(
        com.google.protobuf.Timestamp request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEventsByDateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Location> getLocationById(
        app.onepass.apis.GetObjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLocationByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.GenerateQRResponse> generateQR(
        app.onepass.apis.GenerateQRRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateQRMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.BoolValue> ping(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_IS_EVENT_AVAILABLE = 0;
  private static final int METHODID_JOIN_EVENT = 1;
  private static final int METHODID_CANCEL_EVENT = 2;
  private static final int METHODID_SUBMIT_ANSWER_FOR_POST_EVENT_QUESTION = 3;
  private static final int METHODID_GET_EVENT_BY_ID = 4;
  private static final int METHODID_GET_ALL_EVENTS = 5;
  private static final int METHODID_GET_SUGGESTED_EVENTS = 6;
  private static final int METHODID_GET_UPCOMING_EVENTS = 7;
  private static final int METHODID_GET_EVENTS_BY_STRING_OF_NAME = 8;
  private static final int METHODID_GET_EVENTS_BY_TAG_ID = 9;
  private static final int METHODID_GET_EVENTS_BY_ORGANIZATION_ID = 10;
  private static final int METHODID_GET_EVENTS_BY_FACILITY_ID = 11;
  private static final int METHODID_GET_EVENTS_BY_DATE = 12;
  private static final int METHODID_GET_LOCATION_BY_ID = 13;
  private static final int METHODID_GENERATE_QR = 14;
  private static final int METHODID_PING = 15;

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
              (io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue>) responseObserver);
          break;
        case METHODID_JOIN_EVENT:
          serviceImpl.joinEvent((app.onepass.apis.UserWithEventRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.UserEvent>) responseObserver);
          break;
        case METHODID_CANCEL_EVENT:
          serviceImpl.cancelEvent((app.onepass.apis.UserWithEventRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Event>) responseObserver);
          break;
        case METHODID_SUBMIT_ANSWER_FOR_POST_EVENT_QUESTION:
          serviceImpl.submitAnswerForPostEventQuestion((app.onepass.apis.SubmitAnswerForPostEventQuestionRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.SubmitAnswerForPostEventQuestionResponse>) responseObserver);
          break;
        case METHODID_GET_EVENT_BY_ID:
          serviceImpl.getEventById((app.onepass.apis.GetEventByIdRequest) request,
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
        case METHODID_GET_UPCOMING_EVENTS:
          serviceImpl.getUpcomingEvents((app.onepass.apis.GetUpcomingEventsRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse>) responseObserver);
          break;
        case METHODID_GET_EVENTS_BY_STRING_OF_NAME:
          serviceImpl.getEventsByStringOfName((app.onepass.apis.StringInputRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse>) responseObserver);
          break;
        case METHODID_GET_EVENTS_BY_TAG_ID:
          serviceImpl.getEventsByTagId((app.onepass.apis.GetObjectByIdRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse>) responseObserver);
          break;
        case METHODID_GET_EVENTS_BY_ORGANIZATION_ID:
          serviceImpl.getEventsByOrganizationId((app.onepass.apis.GetObjectByIdRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse>) responseObserver);
          break;
        case METHODID_GET_EVENTS_BY_FACILITY_ID:
          serviceImpl.getEventsByFacilityId((app.onepass.apis.GetObjectByIdRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse>) responseObserver);
          break;
        case METHODID_GET_EVENTS_BY_DATE:
          serviceImpl.getEventsByDate((com.google.protobuf.Timestamp) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse>) responseObserver);
          break;
        case METHODID_GET_LOCATION_BY_ID:
          serviceImpl.getLocationById((app.onepass.apis.GetObjectByIdRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Location>) responseObserver);
          break;
        case METHODID_GENERATE_QR:
          serviceImpl.generateQR((app.onepass.apis.GenerateQRRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.GenerateQRResponse>) responseObserver);
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
              .addMethod(getSubmitAnswerForPostEventQuestionMethod())
              .addMethod(getGetEventByIdMethod())
              .addMethod(getGetAllEventsMethod())
              .addMethod(getGetSuggestedEventsMethod())
              .addMethod(getGetUpcomingEventsMethod())
              .addMethod(getGetEventsByStringOfNameMethod())
              .addMethod(getGetEventsByTagIdMethod())
              .addMethod(getGetEventsByOrganizationIdMethod())
              .addMethod(getGetEventsByFacilityIdMethod())
              .addMethod(getGetEventsByDateMethod())
              .addMethod(getGetLocationByIdMethod())
              .addMethod(getGenerateQRMethod())
              .addMethod(getPingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
