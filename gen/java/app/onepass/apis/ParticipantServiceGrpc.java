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

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.SubmitAnswerForEventQuestionRequest,
      app.onepass.apis.SubmitAnswerForEventQuestionResponse> getSubmitAnswersForEventQuestionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitAnswersForEventQuestion",
      requestType = app.onepass.apis.SubmitAnswerForEventQuestionRequest.class,
      responseType = app.onepass.apis.SubmitAnswerForEventQuestionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.SubmitAnswerForEventQuestionRequest,
      app.onepass.apis.SubmitAnswerForEventQuestionResponse> getSubmitAnswersForEventQuestionMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.SubmitAnswerForEventQuestionRequest, app.onepass.apis.SubmitAnswerForEventQuestionResponse> getSubmitAnswersForEventQuestionMethod;
    if ((getSubmitAnswersForEventQuestionMethod = ParticipantServiceGrpc.getSubmitAnswersForEventQuestionMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getSubmitAnswersForEventQuestionMethod = ParticipantServiceGrpc.getSubmitAnswersForEventQuestionMethod) == null) {
          ParticipantServiceGrpc.getSubmitAnswersForEventQuestionMethod = getSubmitAnswersForEventQuestionMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.SubmitAnswerForEventQuestionRequest, app.onepass.apis.SubmitAnswerForEventQuestionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitAnswersForEventQuestion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.SubmitAnswerForEventQuestionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.SubmitAnswerForEventQuestionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("SubmitAnswersForEventQuestion"))
              .build();
        }
      }
    }
    return getSubmitAnswersForEventQuestionMethod;
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

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest,
      app.onepass.apis.Tag> getGetTagByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTagById",
      requestType = app.onepass.apis.GetObjectByIdRequest.class,
      responseType = app.onepass.apis.Tag.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest,
      app.onepass.apis.Tag> getGetTagByIdMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest, app.onepass.apis.Tag> getGetTagByIdMethod;
    if ((getGetTagByIdMethod = ParticipantServiceGrpc.getGetTagByIdMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getGetTagByIdMethod = ParticipantServiceGrpc.getGetTagByIdMethod) == null) {
          ParticipantServiceGrpc.getGetTagByIdMethod = getGetTagByIdMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GetObjectByIdRequest, app.onepass.apis.Tag>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTagById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetObjectByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Tag.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("GetTagById"))
              .build();
        }
      }
    }
    return getGetTagByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      app.onepass.apis.TagsResponse> getGetAllTagsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllTags",
      requestType = com.google.protobuf.Empty.class,
      responseType = app.onepass.apis.TagsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      app.onepass.apis.TagsResponse> getGetAllTagsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, app.onepass.apis.TagsResponse> getGetAllTagsMethod;
    if ((getGetAllTagsMethod = ParticipantServiceGrpc.getGetAllTagsMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getGetAllTagsMethod = ParticipantServiceGrpc.getGetAllTagsMethod) == null) {
          ParticipantServiceGrpc.getGetAllTagsMethod = getGetAllTagsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, app.onepass.apis.TagsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllTags"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.TagsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("GetAllTags"))
              .build();
        }
      }
    }
    return getGetAllTagsMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      app.onepass.apis.EventsResponse> getGetOnlineEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOnlineEvents",
      requestType = com.google.protobuf.Empty.class,
      responseType = app.onepass.apis.EventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      app.onepass.apis.EventsResponse> getGetOnlineEventsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, app.onepass.apis.EventsResponse> getGetOnlineEventsMethod;
    if ((getGetOnlineEventsMethod = ParticipantServiceGrpc.getGetOnlineEventsMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getGetOnlineEventsMethod = ParticipantServiceGrpc.getGetOnlineEventsMethod) == null) {
          ParticipantServiceGrpc.getGetOnlineEventsMethod = getGetOnlineEventsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, app.onepass.apis.EventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOnlineEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.EventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("GetOnlineEvents"))
              .build();
        }
      }
    }
    return getGetOnlineEventsMethod;
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

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GetEventsByTagIdsRequest,
      app.onepass.apis.EventsResponse> getGetEventsByTagIdsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEventsByTagIds",
      requestType = app.onepass.apis.GetEventsByTagIdsRequest.class,
      responseType = app.onepass.apis.EventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GetEventsByTagIdsRequest,
      app.onepass.apis.EventsResponse> getGetEventsByTagIdsMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GetEventsByTagIdsRequest, app.onepass.apis.EventsResponse> getGetEventsByTagIdsMethod;
    if ((getGetEventsByTagIdsMethod = ParticipantServiceGrpc.getGetEventsByTagIdsMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getGetEventsByTagIdsMethod = ParticipantServiceGrpc.getGetEventsByTagIdsMethod) == null) {
          ParticipantServiceGrpc.getGetEventsByTagIdsMethod = getGetEventsByTagIdsMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GetEventsByTagIdsRequest, app.onepass.apis.EventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEventsByTagIds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetEventsByTagIdsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.EventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("GetEventsByTagIds"))
              .build();
        }
      }
    }
    return getGetEventsByTagIdsMethod;
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

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest,
      app.onepass.apis.TagsResponse> getGetTagsByEventIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTagsByEventId",
      requestType = app.onepass.apis.GetObjectByIdRequest.class,
      responseType = app.onepass.apis.TagsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest,
      app.onepass.apis.TagsResponse> getGetTagsByEventIdMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest, app.onepass.apis.TagsResponse> getGetTagsByEventIdMethod;
    if ((getGetTagsByEventIdMethod = ParticipantServiceGrpc.getGetTagsByEventIdMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getGetTagsByEventIdMethod = ParticipantServiceGrpc.getGetTagsByEventIdMethod) == null) {
          ParticipantServiceGrpc.getGetTagsByEventIdMethod = getGetTagsByEventIdMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GetObjectByIdRequest, app.onepass.apis.TagsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTagsByEventId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetObjectByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.TagsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("GetTagsByEventId"))
              .build();
        }
      }
    }
    return getGetTagsByEventIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest,
      app.onepass.apis.GetRatingByEventIdResponse> getGetRatingByEventIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRatingByEventId",
      requestType = app.onepass.apis.GetObjectByIdRequest.class,
      responseType = app.onepass.apis.GetRatingByEventIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest,
      app.onepass.apis.GetRatingByEventIdResponse> getGetRatingByEventIdMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest, app.onepass.apis.GetRatingByEventIdResponse> getGetRatingByEventIdMethod;
    if ((getGetRatingByEventIdMethod = ParticipantServiceGrpc.getGetRatingByEventIdMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getGetRatingByEventIdMethod = ParticipantServiceGrpc.getGetRatingByEventIdMethod) == null) {
          ParticipantServiceGrpc.getGetRatingByEventIdMethod = getGetRatingByEventIdMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GetObjectByIdRequest, app.onepass.apis.GetRatingByEventIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRatingByEventId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetObjectByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetRatingByEventIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("GetRatingByEventId"))
              .build();
        }
      }
    }
    return getGetRatingByEventIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GetUsersByEventIdRequest,
      app.onepass.apis.GetUsersByEventIdResponse> getGetUsersByEventIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUsersByEventId",
      requestType = app.onepass.apis.GetUsersByEventIdRequest.class,
      responseType = app.onepass.apis.GetUsersByEventIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GetUsersByEventIdRequest,
      app.onepass.apis.GetUsersByEventIdResponse> getGetUsersByEventIdMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GetUsersByEventIdRequest, app.onepass.apis.GetUsersByEventIdResponse> getGetUsersByEventIdMethod;
    if ((getGetUsersByEventIdMethod = ParticipantServiceGrpc.getGetUsersByEventIdMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getGetUsersByEventIdMethod = ParticipantServiceGrpc.getGetUsersByEventIdMethod) == null) {
          ParticipantServiceGrpc.getGetUsersByEventIdMethod = getGetUsersByEventIdMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GetUsersByEventIdRequest, app.onepass.apis.GetUsersByEventIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUsersByEventId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetUsersByEventIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetUsersByEventIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("GetUsersByEventId"))
              .build();
        }
      }
    }
    return getGetUsersByEventIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest,
      app.onepass.apis.GetEventDurationsByEventIdResponse> getGetEventDurationsByEventIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEventDurationsByEventId",
      requestType = app.onepass.apis.GetObjectByIdRequest.class,
      responseType = app.onepass.apis.GetEventDurationsByEventIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest,
      app.onepass.apis.GetEventDurationsByEventIdResponse> getGetEventDurationsByEventIdMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest, app.onepass.apis.GetEventDurationsByEventIdResponse> getGetEventDurationsByEventIdMethod;
    if ((getGetEventDurationsByEventIdMethod = ParticipantServiceGrpc.getGetEventDurationsByEventIdMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getGetEventDurationsByEventIdMethod = ParticipantServiceGrpc.getGetEventDurationsByEventIdMethod) == null) {
          ParticipantServiceGrpc.getGetEventDurationsByEventIdMethod = getGetEventDurationsByEventIdMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GetObjectByIdRequest, app.onepass.apis.GetEventDurationsByEventIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEventDurationsByEventId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetObjectByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetEventDurationsByEventIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("GetEventDurationsByEventId"))
              .build();
        }
      }
    }
    return getGetEventDurationsByEventIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest,
      app.onepass.apis.GetQuestionGroupsByEventIdResponse> getGetQuestionGroupsByEventIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetQuestionGroupsByEventId",
      requestType = app.onepass.apis.GetObjectByIdRequest.class,
      responseType = app.onepass.apis.GetQuestionGroupsByEventIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest,
      app.onepass.apis.GetQuestionGroupsByEventIdResponse> getGetQuestionGroupsByEventIdMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest, app.onepass.apis.GetQuestionGroupsByEventIdResponse> getGetQuestionGroupsByEventIdMethod;
    if ((getGetQuestionGroupsByEventIdMethod = ParticipantServiceGrpc.getGetQuestionGroupsByEventIdMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getGetQuestionGroupsByEventIdMethod = ParticipantServiceGrpc.getGetQuestionGroupsByEventIdMethod) == null) {
          ParticipantServiceGrpc.getGetQuestionGroupsByEventIdMethod = getGetQuestionGroupsByEventIdMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GetObjectByIdRequest, app.onepass.apis.GetQuestionGroupsByEventIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetQuestionGroupsByEventId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetObjectByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetQuestionGroupsByEventIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("GetQuestionGroupsByEventId"))
              .build();
        }
      }
    }
    return getGetQuestionGroupsByEventIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest,
      app.onepass.apis.GetQuestionsByQuestionGroupIdResponse> getGetQuestionsByQuestionGroupIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetQuestionsByQuestionGroupId",
      requestType = app.onepass.apis.GetObjectByIdRequest.class,
      responseType = app.onepass.apis.GetQuestionsByQuestionGroupIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest,
      app.onepass.apis.GetQuestionsByQuestionGroupIdResponse> getGetQuestionsByQuestionGroupIdMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest, app.onepass.apis.GetQuestionsByQuestionGroupIdResponse> getGetQuestionsByQuestionGroupIdMethod;
    if ((getGetQuestionsByQuestionGroupIdMethod = ParticipantServiceGrpc.getGetQuestionsByQuestionGroupIdMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getGetQuestionsByQuestionGroupIdMethod = ParticipantServiceGrpc.getGetQuestionsByQuestionGroupIdMethod) == null) {
          ParticipantServiceGrpc.getGetQuestionsByQuestionGroupIdMethod = getGetQuestionsByQuestionGroupIdMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GetObjectByIdRequest, app.onepass.apis.GetQuestionsByQuestionGroupIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetQuestionsByQuestionGroupId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetObjectByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetQuestionsByQuestionGroupIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("GetQuestionsByQuestionGroupId"))
              .build();
        }
      }
    }
    return getGetQuestionsByQuestionGroupIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest,
      app.onepass.apis.AnswersResponse> getGetAnswersByQuestionIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAnswersByQuestionId",
      requestType = app.onepass.apis.GetObjectByIdRequest.class,
      responseType = app.onepass.apis.AnswersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest,
      app.onepass.apis.AnswersResponse> getGetAnswersByQuestionIdMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest, app.onepass.apis.AnswersResponse> getGetAnswersByQuestionIdMethod;
    if ((getGetAnswersByQuestionIdMethod = ParticipantServiceGrpc.getGetAnswersByQuestionIdMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getGetAnswersByQuestionIdMethod = ParticipantServiceGrpc.getGetAnswersByQuestionIdMethod) == null) {
          ParticipantServiceGrpc.getGetAnswersByQuestionIdMethod = getGetAnswersByQuestionIdMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GetObjectByIdRequest, app.onepass.apis.AnswersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAnswersByQuestionId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetObjectByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.AnswersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("GetAnswersByQuestionId"))
              .build();
        }
      }
    }
    return getGetAnswersByQuestionIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest,
      app.onepass.apis.AnswersResponse> getGetAnswersByUserEventIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAnswersByUserEventId",
      requestType = app.onepass.apis.GetObjectByIdRequest.class,
      responseType = app.onepass.apis.AnswersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest,
      app.onepass.apis.AnswersResponse> getGetAnswersByUserEventIdMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest, app.onepass.apis.AnswersResponse> getGetAnswersByUserEventIdMethod;
    if ((getGetAnswersByUserEventIdMethod = ParticipantServiceGrpc.getGetAnswersByUserEventIdMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getGetAnswersByUserEventIdMethod = ParticipantServiceGrpc.getGetAnswersByUserEventIdMethod) == null) {
          ParticipantServiceGrpc.getGetAnswersByUserEventIdMethod = getGetAnswersByUserEventIdMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GetObjectByIdRequest, app.onepass.apis.AnswersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAnswersByUserEventId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetObjectByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.AnswersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("GetAnswersByUserEventId"))
              .build();
        }
      }
    }
    return getGetAnswersByUserEventIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GetUserAnswerByQuestionIdRequest,
      app.onepass.apis.Answer> getGetUserAnswerByQuestionIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserAnswerByQuestionId",
      requestType = app.onepass.apis.GetUserAnswerByQuestionIdRequest.class,
      responseType = app.onepass.apis.Answer.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GetUserAnswerByQuestionIdRequest,
      app.onepass.apis.Answer> getGetUserAnswerByQuestionIdMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GetUserAnswerByQuestionIdRequest, app.onepass.apis.Answer> getGetUserAnswerByQuestionIdMethod;
    if ((getGetUserAnswerByQuestionIdMethod = ParticipantServiceGrpc.getGetUserAnswerByQuestionIdMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getGetUserAnswerByQuestionIdMethod = ParticipantServiceGrpc.getGetUserAnswerByQuestionIdMethod) == null) {
          ParticipantServiceGrpc.getGetUserAnswerByQuestionIdMethod = getGetUserAnswerByQuestionIdMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GetUserAnswerByQuestionIdRequest, app.onepass.apis.Answer>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserAnswerByQuestionId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetUserAnswerByQuestionIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Answer.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("GetUserAnswerByQuestionId"))
              .build();
        }
      }
    }
    return getGetUserAnswerByQuestionIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GetEventsByUserIdRequest,
      app.onepass.apis.EventsResponse> getGetEventsByUserIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEventsByUserId",
      requestType = app.onepass.apis.GetEventsByUserIdRequest.class,
      responseType = app.onepass.apis.EventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GetEventsByUserIdRequest,
      app.onepass.apis.EventsResponse> getGetEventsByUserIdMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GetEventsByUserIdRequest, app.onepass.apis.EventsResponse> getGetEventsByUserIdMethod;
    if ((getGetEventsByUserIdMethod = ParticipantServiceGrpc.getGetEventsByUserIdMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getGetEventsByUserIdMethod = ParticipantServiceGrpc.getGetEventsByUserIdMethod) == null) {
          ParticipantServiceGrpc.getGetEventsByUserIdMethod = getGetEventsByUserIdMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GetEventsByUserIdRequest, app.onepass.apis.EventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEventsByUserId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetEventsByUserIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.EventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("GetEventsByUserId"))
              .build();
        }
      }
    }
    return getGetEventsByUserIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UserWithEventRequest,
      app.onepass.apis.UserEvent> getGetUserEventByUserAndEventIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserEventByUserAndEventId",
      requestType = app.onepass.apis.UserWithEventRequest.class,
      responseType = app.onepass.apis.UserEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UserWithEventRequest,
      app.onepass.apis.UserEvent> getGetUserEventByUserAndEventIdMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UserWithEventRequest, app.onepass.apis.UserEvent> getGetUserEventByUserAndEventIdMethod;
    if ((getGetUserEventByUserAndEventIdMethod = ParticipantServiceGrpc.getGetUserEventByUserAndEventIdMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getGetUserEventByUserAndEventIdMethod = ParticipantServiceGrpc.getGetUserEventByUserAndEventIdMethod) == null) {
          ParticipantServiceGrpc.getGetUserEventByUserAndEventIdMethod = getGetUserEventByUserAndEventIdMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UserWithEventRequest, app.onepass.apis.UserEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserEventByUserAndEventId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UserWithEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UserEvent.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("GetUserEventByUserAndEventId"))
              .build();
        }
      }
    }
    return getGetUserEventByUserAndEventIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest,
      app.onepass.apis.GetUserEventsByEventIdResponse> getGetUserEventsByEventIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserEventsByEventId",
      requestType = app.onepass.apis.GetObjectByIdRequest.class,
      responseType = app.onepass.apis.GetUserEventsByEventIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest,
      app.onepass.apis.GetUserEventsByEventIdResponse> getGetUserEventsByEventIdMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest, app.onepass.apis.GetUserEventsByEventIdResponse> getGetUserEventsByEventIdMethod;
    if ((getGetUserEventsByEventIdMethod = ParticipantServiceGrpc.getGetUserEventsByEventIdMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getGetUserEventsByEventIdMethod = ParticipantServiceGrpc.getGetUserEventsByEventIdMethod) == null) {
          ParticipantServiceGrpc.getGetUserEventsByEventIdMethod = getGetUserEventsByEventIdMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GetObjectByIdRequest, app.onepass.apis.GetUserEventsByEventIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserEventsByEventId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetObjectByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetUserEventsByEventIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("GetUserEventsByEventId"))
              .build();
        }
      }
    }
    return getGetUserEventsByEventIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.SetRatingByUserEventIdRequest,
      app.onepass.apis.UserEvent> getSetRatingByUserEventIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRatingByUserEventId",
      requestType = app.onepass.apis.SetRatingByUserEventIdRequest.class,
      responseType = app.onepass.apis.UserEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.SetRatingByUserEventIdRequest,
      app.onepass.apis.UserEvent> getSetRatingByUserEventIdMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.SetRatingByUserEventIdRequest, app.onepass.apis.UserEvent> getSetRatingByUserEventIdMethod;
    if ((getSetRatingByUserEventIdMethod = ParticipantServiceGrpc.getSetRatingByUserEventIdMethod) == null) {
      synchronized (ParticipantServiceGrpc.class) {
        if ((getSetRatingByUserEventIdMethod = ParticipantServiceGrpc.getSetRatingByUserEventIdMethod) == null) {
          ParticipantServiceGrpc.getSetRatingByUserEventIdMethod = getSetRatingByUserEventIdMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.SetRatingByUserEventIdRequest, app.onepass.apis.UserEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRatingByUserEventId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.SetRatingByUserEventIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UserEvent.getDefaultInstance()))
              .setSchemaDescriptor(new ParticipantServiceMethodDescriptorSupplier("SetRatingByUserEventId"))
              .build();
        }
      }
    }
    return getSetRatingByUserEventIdMethod;
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
    public void submitAnswersForEventQuestion(app.onepass.apis.SubmitAnswerForEventQuestionRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.SubmitAnswerForEventQuestionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitAnswersForEventQuestionMethod(), responseObserver);
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
    public void getTagById(app.onepass.apis.GetObjectByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Tag> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTagByIdMethod(), responseObserver);
    }

    /**
     */
    public void getAllTags(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<app.onepass.apis.TagsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllTagsMethod(), responseObserver);
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
    public void getOnlineEvents(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOnlineEventsMethod(), responseObserver);
    }

    /**
     */
    public void getEventsByStringOfName(app.onepass.apis.StringInputRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEventsByStringOfNameMethod(), responseObserver);
    }

    /**
     */
    public void getEventsByTagIds(app.onepass.apis.GetEventsByTagIdsRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEventsByTagIdsMethod(), responseObserver);
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
    public void getTagsByEventId(app.onepass.apis.GetObjectByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.TagsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTagsByEventIdMethod(), responseObserver);
    }

    /**
     */
    public void getRatingByEventId(app.onepass.apis.GetObjectByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GetRatingByEventIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRatingByEventIdMethod(), responseObserver);
    }

    /**
     */
    public void getUsersByEventId(app.onepass.apis.GetUsersByEventIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GetUsersByEventIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUsersByEventIdMethod(), responseObserver);
    }

    /**
     */
    public void getEventDurationsByEventId(app.onepass.apis.GetObjectByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GetEventDurationsByEventIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEventDurationsByEventIdMethod(), responseObserver);
    }

    /**
     */
    public void getQuestionGroupsByEventId(app.onepass.apis.GetObjectByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GetQuestionGroupsByEventIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetQuestionGroupsByEventIdMethod(), responseObserver);
    }

    /**
     */
    public void getQuestionsByQuestionGroupId(app.onepass.apis.GetObjectByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GetQuestionsByQuestionGroupIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetQuestionsByQuestionGroupIdMethod(), responseObserver);
    }

    /**
     */
    public void getAnswersByQuestionId(app.onepass.apis.GetObjectByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.AnswersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnswersByQuestionIdMethod(), responseObserver);
    }

    /**
     */
    public void getAnswersByUserEventId(app.onepass.apis.GetObjectByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.AnswersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnswersByUserEventIdMethod(), responseObserver);
    }

    /**
     */
    public void getUserAnswerByQuestionId(app.onepass.apis.GetUserAnswerByQuestionIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Answer> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserAnswerByQuestionIdMethod(), responseObserver);
    }

    /**
     */
    public void getEventsByUserId(app.onepass.apis.GetEventsByUserIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEventsByUserIdMethod(), responseObserver);
    }

    /**
     */
    public void getUserEventByUserAndEventId(app.onepass.apis.UserWithEventRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.UserEvent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserEventByUserAndEventIdMethod(), responseObserver);
    }

    /**
     */
    public void getUserEventsByEventId(app.onepass.apis.GetObjectByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GetUserEventsByEventIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserEventsByEventIdMethod(), responseObserver);
    }

    /**
     */
    public void setRatingByUserEventId(app.onepass.apis.SetRatingByUserEventIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.UserEvent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRatingByUserEventIdMethod(), responseObserver);
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
            getSubmitAnswersForEventQuestionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.SubmitAnswerForEventQuestionRequest,
                app.onepass.apis.SubmitAnswerForEventQuestionResponse>(
                  this, METHODID_SUBMIT_ANSWERS_FOR_EVENT_QUESTION)))
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
            getGetTagByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GetObjectByIdRequest,
                app.onepass.apis.Tag>(
                  this, METHODID_GET_TAG_BY_ID)))
          .addMethod(
            getGetAllTagsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                app.onepass.apis.TagsResponse>(
                  this, METHODID_GET_ALL_TAGS)))
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
            getGetOnlineEventsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                app.onepass.apis.EventsResponse>(
                  this, METHODID_GET_ONLINE_EVENTS)))
          .addMethod(
            getGetEventsByStringOfNameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.StringInputRequest,
                app.onepass.apis.EventsResponse>(
                  this, METHODID_GET_EVENTS_BY_STRING_OF_NAME)))
          .addMethod(
            getGetEventsByTagIdsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GetEventsByTagIdsRequest,
                app.onepass.apis.EventsResponse>(
                  this, METHODID_GET_EVENTS_BY_TAG_IDS)))
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
            getGetTagsByEventIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GetObjectByIdRequest,
                app.onepass.apis.TagsResponse>(
                  this, METHODID_GET_TAGS_BY_EVENT_ID)))
          .addMethod(
            getGetRatingByEventIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GetObjectByIdRequest,
                app.onepass.apis.GetRatingByEventIdResponse>(
                  this, METHODID_GET_RATING_BY_EVENT_ID)))
          .addMethod(
            getGetUsersByEventIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GetUsersByEventIdRequest,
                app.onepass.apis.GetUsersByEventIdResponse>(
                  this, METHODID_GET_USERS_BY_EVENT_ID)))
          .addMethod(
            getGetEventDurationsByEventIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GetObjectByIdRequest,
                app.onepass.apis.GetEventDurationsByEventIdResponse>(
                  this, METHODID_GET_EVENT_DURATIONS_BY_EVENT_ID)))
          .addMethod(
            getGetQuestionGroupsByEventIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GetObjectByIdRequest,
                app.onepass.apis.GetQuestionGroupsByEventIdResponse>(
                  this, METHODID_GET_QUESTION_GROUPS_BY_EVENT_ID)))
          .addMethod(
            getGetQuestionsByQuestionGroupIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GetObjectByIdRequest,
                app.onepass.apis.GetQuestionsByQuestionGroupIdResponse>(
                  this, METHODID_GET_QUESTIONS_BY_QUESTION_GROUP_ID)))
          .addMethod(
            getGetAnswersByQuestionIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GetObjectByIdRequest,
                app.onepass.apis.AnswersResponse>(
                  this, METHODID_GET_ANSWERS_BY_QUESTION_ID)))
          .addMethod(
            getGetAnswersByUserEventIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GetObjectByIdRequest,
                app.onepass.apis.AnswersResponse>(
                  this, METHODID_GET_ANSWERS_BY_USER_EVENT_ID)))
          .addMethod(
            getGetUserAnswerByQuestionIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GetUserAnswerByQuestionIdRequest,
                app.onepass.apis.Answer>(
                  this, METHODID_GET_USER_ANSWER_BY_QUESTION_ID)))
          .addMethod(
            getGetEventsByUserIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GetEventsByUserIdRequest,
                app.onepass.apis.EventsResponse>(
                  this, METHODID_GET_EVENTS_BY_USER_ID)))
          .addMethod(
            getGetUserEventByUserAndEventIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UserWithEventRequest,
                app.onepass.apis.UserEvent>(
                  this, METHODID_GET_USER_EVENT_BY_USER_AND_EVENT_ID)))
          .addMethod(
            getGetUserEventsByEventIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GetObjectByIdRequest,
                app.onepass.apis.GetUserEventsByEventIdResponse>(
                  this, METHODID_GET_USER_EVENTS_BY_EVENT_ID)))
          .addMethod(
            getSetRatingByUserEventIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.SetRatingByUserEventIdRequest,
                app.onepass.apis.UserEvent>(
                  this, METHODID_SET_RATING_BY_USER_EVENT_ID)))
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
    public void submitAnswersForEventQuestion(app.onepass.apis.SubmitAnswerForEventQuestionRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.SubmitAnswerForEventQuestionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitAnswersForEventQuestionMethod(), getCallOptions()), request, responseObserver);
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
    public void getTagById(app.onepass.apis.GetObjectByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Tag> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTagByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllTags(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<app.onepass.apis.TagsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllTagsMethod(), getCallOptions()), request, responseObserver);
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
    public void getOnlineEvents(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOnlineEventsMethod(), getCallOptions()), request, responseObserver);
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
    public void getEventsByTagIds(app.onepass.apis.GetEventsByTagIdsRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEventsByTagIdsMethod(), getCallOptions()), request, responseObserver);
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
    public void getTagsByEventId(app.onepass.apis.GetObjectByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.TagsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTagsByEventIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRatingByEventId(app.onepass.apis.GetObjectByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GetRatingByEventIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRatingByEventIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUsersByEventId(app.onepass.apis.GetUsersByEventIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GetUsersByEventIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUsersByEventIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEventDurationsByEventId(app.onepass.apis.GetObjectByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GetEventDurationsByEventIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEventDurationsByEventIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getQuestionGroupsByEventId(app.onepass.apis.GetObjectByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GetQuestionGroupsByEventIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetQuestionGroupsByEventIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getQuestionsByQuestionGroupId(app.onepass.apis.GetObjectByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GetQuestionsByQuestionGroupIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetQuestionsByQuestionGroupIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAnswersByQuestionId(app.onepass.apis.GetObjectByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.AnswersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnswersByQuestionIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAnswersByUserEventId(app.onepass.apis.GetObjectByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.AnswersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnswersByUserEventIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserAnswerByQuestionId(app.onepass.apis.GetUserAnswerByQuestionIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Answer> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserAnswerByQuestionIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEventsByUserId(app.onepass.apis.GetEventsByUserIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEventsByUserIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserEventByUserAndEventId(app.onepass.apis.UserWithEventRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.UserEvent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserEventByUserAndEventIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserEventsByEventId(app.onepass.apis.GetObjectByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GetUserEventsByEventIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserEventsByEventIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setRatingByUserEventId(app.onepass.apis.SetRatingByUserEventIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.UserEvent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRatingByUserEventIdMethod(), getCallOptions()), request, responseObserver);
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
    public app.onepass.apis.SubmitAnswerForEventQuestionResponse submitAnswersForEventQuestion(app.onepass.apis.SubmitAnswerForEventQuestionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitAnswersForEventQuestionMethod(), getCallOptions(), request);
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
    public app.onepass.apis.Tag getTagById(app.onepass.apis.GetObjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTagByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.TagsResponse getAllTags(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllTagsMethod(), getCallOptions(), request);
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
    public app.onepass.apis.EventsResponse getOnlineEvents(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOnlineEventsMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.EventsResponse getEventsByStringOfName(app.onepass.apis.StringInputRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEventsByStringOfNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.EventsResponse getEventsByTagIds(app.onepass.apis.GetEventsByTagIdsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEventsByTagIdsMethod(), getCallOptions(), request);
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
    public app.onepass.apis.TagsResponse getTagsByEventId(app.onepass.apis.GetObjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTagsByEventIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.GetRatingByEventIdResponse getRatingByEventId(app.onepass.apis.GetObjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRatingByEventIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.GetUsersByEventIdResponse getUsersByEventId(app.onepass.apis.GetUsersByEventIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUsersByEventIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.GetEventDurationsByEventIdResponse getEventDurationsByEventId(app.onepass.apis.GetObjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEventDurationsByEventIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.GetQuestionGroupsByEventIdResponse getQuestionGroupsByEventId(app.onepass.apis.GetObjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetQuestionGroupsByEventIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.GetQuestionsByQuestionGroupIdResponse getQuestionsByQuestionGroupId(app.onepass.apis.GetObjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetQuestionsByQuestionGroupIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.AnswersResponse getAnswersByQuestionId(app.onepass.apis.GetObjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnswersByQuestionIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.AnswersResponse getAnswersByUserEventId(app.onepass.apis.GetObjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnswersByUserEventIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Answer getUserAnswerByQuestionId(app.onepass.apis.GetUserAnswerByQuestionIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserAnswerByQuestionIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.EventsResponse getEventsByUserId(app.onepass.apis.GetEventsByUserIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEventsByUserIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.UserEvent getUserEventByUserAndEventId(app.onepass.apis.UserWithEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserEventByUserAndEventIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.GetUserEventsByEventIdResponse getUserEventsByEventId(app.onepass.apis.GetObjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserEventsByEventIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.UserEvent setRatingByUserEventId(app.onepass.apis.SetRatingByUserEventIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRatingByUserEventIdMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.SubmitAnswerForEventQuestionResponse> submitAnswersForEventQuestion(
        app.onepass.apis.SubmitAnswerForEventQuestionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitAnswersForEventQuestionMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Tag> getTagById(
        app.onepass.apis.GetObjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTagByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.TagsResponse> getAllTags(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllTagsMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.EventsResponse> getOnlineEvents(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOnlineEventsMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.EventsResponse> getEventsByTagIds(
        app.onepass.apis.GetEventsByTagIdsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEventsByTagIdsMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.TagsResponse> getTagsByEventId(
        app.onepass.apis.GetObjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTagsByEventIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.GetRatingByEventIdResponse> getRatingByEventId(
        app.onepass.apis.GetObjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRatingByEventIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.GetUsersByEventIdResponse> getUsersByEventId(
        app.onepass.apis.GetUsersByEventIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUsersByEventIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.GetEventDurationsByEventIdResponse> getEventDurationsByEventId(
        app.onepass.apis.GetObjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEventDurationsByEventIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.GetQuestionGroupsByEventIdResponse> getQuestionGroupsByEventId(
        app.onepass.apis.GetObjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetQuestionGroupsByEventIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.GetQuestionsByQuestionGroupIdResponse> getQuestionsByQuestionGroupId(
        app.onepass.apis.GetObjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetQuestionsByQuestionGroupIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.AnswersResponse> getAnswersByQuestionId(
        app.onepass.apis.GetObjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnswersByQuestionIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.AnswersResponse> getAnswersByUserEventId(
        app.onepass.apis.GetObjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnswersByUserEventIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Answer> getUserAnswerByQuestionId(
        app.onepass.apis.GetUserAnswerByQuestionIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserAnswerByQuestionIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.EventsResponse> getEventsByUserId(
        app.onepass.apis.GetEventsByUserIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEventsByUserIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.UserEvent> getUserEventByUserAndEventId(
        app.onepass.apis.UserWithEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserEventByUserAndEventIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.GetUserEventsByEventIdResponse> getUserEventsByEventId(
        app.onepass.apis.GetObjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserEventsByEventIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.UserEvent> setRatingByUserEventId(
        app.onepass.apis.SetRatingByUserEventIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRatingByUserEventIdMethod(), getCallOptions()), request);
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
  private static final int METHODID_SUBMIT_ANSWERS_FOR_EVENT_QUESTION = 3;
  private static final int METHODID_GET_EVENT_BY_ID = 4;
  private static final int METHODID_GET_ALL_EVENTS = 5;
  private static final int METHODID_GET_TAG_BY_ID = 6;
  private static final int METHODID_GET_ALL_TAGS = 7;
  private static final int METHODID_GET_SUGGESTED_EVENTS = 8;
  private static final int METHODID_GET_UPCOMING_EVENTS = 9;
  private static final int METHODID_GET_ONLINE_EVENTS = 10;
  private static final int METHODID_GET_EVENTS_BY_STRING_OF_NAME = 11;
  private static final int METHODID_GET_EVENTS_BY_TAG_IDS = 12;
  private static final int METHODID_GET_EVENTS_BY_ORGANIZATION_ID = 13;
  private static final int METHODID_GET_EVENTS_BY_FACILITY_ID = 14;
  private static final int METHODID_GET_EVENTS_BY_DATE = 15;
  private static final int METHODID_GET_LOCATION_BY_ID = 16;
  private static final int METHODID_GET_TAGS_BY_EVENT_ID = 17;
  private static final int METHODID_GET_RATING_BY_EVENT_ID = 18;
  private static final int METHODID_GET_USERS_BY_EVENT_ID = 19;
  private static final int METHODID_GET_EVENT_DURATIONS_BY_EVENT_ID = 20;
  private static final int METHODID_GET_QUESTION_GROUPS_BY_EVENT_ID = 21;
  private static final int METHODID_GET_QUESTIONS_BY_QUESTION_GROUP_ID = 22;
  private static final int METHODID_GET_ANSWERS_BY_QUESTION_ID = 23;
  private static final int METHODID_GET_ANSWERS_BY_USER_EVENT_ID = 24;
  private static final int METHODID_GET_USER_ANSWER_BY_QUESTION_ID = 25;
  private static final int METHODID_GET_EVENTS_BY_USER_ID = 26;
  private static final int METHODID_GET_USER_EVENT_BY_USER_AND_EVENT_ID = 27;
  private static final int METHODID_GET_USER_EVENTS_BY_EVENT_ID = 28;
  private static final int METHODID_SET_RATING_BY_USER_EVENT_ID = 29;
  private static final int METHODID_GENERATE_QR = 30;
  private static final int METHODID_PING = 31;

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
        case METHODID_SUBMIT_ANSWERS_FOR_EVENT_QUESTION:
          serviceImpl.submitAnswersForEventQuestion((app.onepass.apis.SubmitAnswerForEventQuestionRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.SubmitAnswerForEventQuestionResponse>) responseObserver);
          break;
        case METHODID_GET_EVENT_BY_ID:
          serviceImpl.getEventById((app.onepass.apis.GetEventByIdRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Event>) responseObserver);
          break;
        case METHODID_GET_ALL_EVENTS:
          serviceImpl.getAllEvents((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse>) responseObserver);
          break;
        case METHODID_GET_TAG_BY_ID:
          serviceImpl.getTagById((app.onepass.apis.GetObjectByIdRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Tag>) responseObserver);
          break;
        case METHODID_GET_ALL_TAGS:
          serviceImpl.getAllTags((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.TagsResponse>) responseObserver);
          break;
        case METHODID_GET_SUGGESTED_EVENTS:
          serviceImpl.getSuggestedEvents((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse>) responseObserver);
          break;
        case METHODID_GET_UPCOMING_EVENTS:
          serviceImpl.getUpcomingEvents((app.onepass.apis.GetUpcomingEventsRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse>) responseObserver);
          break;
        case METHODID_GET_ONLINE_EVENTS:
          serviceImpl.getOnlineEvents((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse>) responseObserver);
          break;
        case METHODID_GET_EVENTS_BY_STRING_OF_NAME:
          serviceImpl.getEventsByStringOfName((app.onepass.apis.StringInputRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse>) responseObserver);
          break;
        case METHODID_GET_EVENTS_BY_TAG_IDS:
          serviceImpl.getEventsByTagIds((app.onepass.apis.GetEventsByTagIdsRequest) request,
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
        case METHODID_GET_TAGS_BY_EVENT_ID:
          serviceImpl.getTagsByEventId((app.onepass.apis.GetObjectByIdRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.TagsResponse>) responseObserver);
          break;
        case METHODID_GET_RATING_BY_EVENT_ID:
          serviceImpl.getRatingByEventId((app.onepass.apis.GetObjectByIdRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.GetRatingByEventIdResponse>) responseObserver);
          break;
        case METHODID_GET_USERS_BY_EVENT_ID:
          serviceImpl.getUsersByEventId((app.onepass.apis.GetUsersByEventIdRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.GetUsersByEventIdResponse>) responseObserver);
          break;
        case METHODID_GET_EVENT_DURATIONS_BY_EVENT_ID:
          serviceImpl.getEventDurationsByEventId((app.onepass.apis.GetObjectByIdRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.GetEventDurationsByEventIdResponse>) responseObserver);
          break;
        case METHODID_GET_QUESTION_GROUPS_BY_EVENT_ID:
          serviceImpl.getQuestionGroupsByEventId((app.onepass.apis.GetObjectByIdRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.GetQuestionGroupsByEventIdResponse>) responseObserver);
          break;
        case METHODID_GET_QUESTIONS_BY_QUESTION_GROUP_ID:
          serviceImpl.getQuestionsByQuestionGroupId((app.onepass.apis.GetObjectByIdRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.GetQuestionsByQuestionGroupIdResponse>) responseObserver);
          break;
        case METHODID_GET_ANSWERS_BY_QUESTION_ID:
          serviceImpl.getAnswersByQuestionId((app.onepass.apis.GetObjectByIdRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.AnswersResponse>) responseObserver);
          break;
        case METHODID_GET_ANSWERS_BY_USER_EVENT_ID:
          serviceImpl.getAnswersByUserEventId((app.onepass.apis.GetObjectByIdRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.AnswersResponse>) responseObserver);
          break;
        case METHODID_GET_USER_ANSWER_BY_QUESTION_ID:
          serviceImpl.getUserAnswerByQuestionId((app.onepass.apis.GetUserAnswerByQuestionIdRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Answer>) responseObserver);
          break;
        case METHODID_GET_EVENTS_BY_USER_ID:
          serviceImpl.getEventsByUserId((app.onepass.apis.GetEventsByUserIdRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.EventsResponse>) responseObserver);
          break;
        case METHODID_GET_USER_EVENT_BY_USER_AND_EVENT_ID:
          serviceImpl.getUserEventByUserAndEventId((app.onepass.apis.UserWithEventRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.UserEvent>) responseObserver);
          break;
        case METHODID_GET_USER_EVENTS_BY_EVENT_ID:
          serviceImpl.getUserEventsByEventId((app.onepass.apis.GetObjectByIdRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.GetUserEventsByEventIdResponse>) responseObserver);
          break;
        case METHODID_SET_RATING_BY_USER_EVENT_ID:
          serviceImpl.setRatingByUserEventId((app.onepass.apis.SetRatingByUserEventIdRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.UserEvent>) responseObserver);
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
              .addMethod(getSubmitAnswersForEventQuestionMethod())
              .addMethod(getGetEventByIdMethod())
              .addMethod(getGetAllEventsMethod())
              .addMethod(getGetTagByIdMethod())
              .addMethod(getGetAllTagsMethod())
              .addMethod(getGetSuggestedEventsMethod())
              .addMethod(getGetUpcomingEventsMethod())
              .addMethod(getGetOnlineEventsMethod())
              .addMethod(getGetEventsByStringOfNameMethod())
              .addMethod(getGetEventsByTagIdsMethod())
              .addMethod(getGetEventsByOrganizationIdMethod())
              .addMethod(getGetEventsByFacilityIdMethod())
              .addMethod(getGetEventsByDateMethod())
              .addMethod(getGetLocationByIdMethod())
              .addMethod(getGetTagsByEventIdMethod())
              .addMethod(getGetRatingByEventIdMethod())
              .addMethod(getGetUsersByEventIdMethod())
              .addMethod(getGetEventDurationsByEventIdMethod())
              .addMethod(getGetQuestionGroupsByEventIdMethod())
              .addMethod(getGetQuestionsByQuestionGroupIdMethod())
              .addMethod(getGetAnswersByQuestionIdMethod())
              .addMethod(getGetAnswersByUserEventIdMethod())
              .addMethod(getGetUserAnswerByQuestionIdMethod())
              .addMethod(getGetEventsByUserIdMethod())
              .addMethod(getGetUserEventByUserAndEventIdMethod())
              .addMethod(getGetUserEventsByEventIdMethod())
              .addMethod(getSetRatingByUserEventIdMethod())
              .addMethod(getGenerateQRMethod())
              .addMethod(getPingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
