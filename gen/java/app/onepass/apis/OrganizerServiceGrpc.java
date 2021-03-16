package app.onepass.apis;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: hts/organizer/service.proto")
public final class OrganizerServiceGrpc {

  private OrganizerServiceGrpc() {}

  public static final String SERVICE_NAME = "hts.organizer.OrganizerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.CreateOrganizationRequest,
      app.onepass.apis.Result> getCreateOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateOrganization",
      requestType = app.onepass.apis.CreateOrganizationRequest.class,
      responseType = app.onepass.apis.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.CreateOrganizationRequest,
      app.onepass.apis.Result> getCreateOrganizationMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.CreateOrganizationRequest, app.onepass.apis.Result> getCreateOrganizationMethod;
    if ((getCreateOrganizationMethod = OrganizerServiceGrpc.getCreateOrganizationMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getCreateOrganizationMethod = OrganizerServiceGrpc.getCreateOrganizationMethod) == null) {
          OrganizerServiceGrpc.getCreateOrganizationMethod = getCreateOrganizationMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.CreateOrganizationRequest, app.onepass.apis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.CreateOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("CreateOrganization"))
              .build();
        }
      }
    }
    return getCreateOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UserRequest,
      app.onepass.apis.GetOrganizationResponse> getGetOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrganization",
      requestType = app.onepass.apis.UserRequest.class,
      responseType = app.onepass.apis.GetOrganizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UserRequest,
      app.onepass.apis.GetOrganizationResponse> getGetOrganizationMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UserRequest, app.onepass.apis.GetOrganizationResponse> getGetOrganizationMethod;
    if ((getGetOrganizationMethod = OrganizerServiceGrpc.getGetOrganizationMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getGetOrganizationMethod = OrganizerServiceGrpc.getGetOrganizationMethod) == null) {
          OrganizerServiceGrpc.getGetOrganizationMethod = getGetOrganizationMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UserRequest, app.onepass.apis.GetOrganizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetOrganizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("GetOrganization"))
              .build();
        }
      }
    }
    return getGetOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GetByIdRequest,
      app.onepass.apis.GetOrganizationByIdResponse> getGetOrganizationByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrganizationById",
      requestType = app.onepass.apis.GetByIdRequest.class,
      responseType = app.onepass.apis.GetOrganizationByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GetByIdRequest,
      app.onepass.apis.GetOrganizationByIdResponse> getGetOrganizationByIdMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GetByIdRequest, app.onepass.apis.GetOrganizationByIdResponse> getGetOrganizationByIdMethod;
    if ((getGetOrganizationByIdMethod = OrganizerServiceGrpc.getGetOrganizationByIdMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getGetOrganizationByIdMethod = OrganizerServiceGrpc.getGetOrganizationByIdMethod) == null) {
          OrganizerServiceGrpc.getGetOrganizationByIdMethod = getGetOrganizationByIdMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GetByIdRequest, app.onepass.apis.GetOrganizationByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrganizationById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetOrganizationByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("GetOrganizationById"))
              .build();
        }
      }
    }
    return getGetOrganizationByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UpdateOrganizationRequest,
      app.onepass.apis.Result> getUpdateOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOrganization",
      requestType = app.onepass.apis.UpdateOrganizationRequest.class,
      responseType = app.onepass.apis.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UpdateOrganizationRequest,
      app.onepass.apis.Result> getUpdateOrganizationMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UpdateOrganizationRequest, app.onepass.apis.Result> getUpdateOrganizationMethod;
    if ((getUpdateOrganizationMethod = OrganizerServiceGrpc.getUpdateOrganizationMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getUpdateOrganizationMethod = OrganizerServiceGrpc.getUpdateOrganizationMethod) == null) {
          OrganizerServiceGrpc.getUpdateOrganizationMethod = getUpdateOrganizationMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UpdateOrganizationRequest, app.onepass.apis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UpdateOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("UpdateOrganization"))
              .build();
        }
      }
    }
    return getUpdateOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.RemoveOrganizationRequest,
      app.onepass.apis.Result> getRemoveOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveOrganization",
      requestType = app.onepass.apis.RemoveOrganizationRequest.class,
      responseType = app.onepass.apis.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.RemoveOrganizationRequest,
      app.onepass.apis.Result> getRemoveOrganizationMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.RemoveOrganizationRequest, app.onepass.apis.Result> getRemoveOrganizationMethod;
    if ((getRemoveOrganizationMethod = OrganizerServiceGrpc.getRemoveOrganizationMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getRemoveOrganizationMethod = OrganizerServiceGrpc.getRemoveOrganizationMethod) == null) {
          OrganizerServiceGrpc.getRemoveOrganizationMethod = getRemoveOrganizationMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.RemoveOrganizationRequest, app.onepass.apis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.RemoveOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("RemoveOrganization"))
              .build();
        }
      }
    }
    return getRemoveOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UpdateUsersInOrganizationRequest,
      app.onepass.apis.Result> getAddUsersToOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddUsersToOrganization",
      requestType = app.onepass.apis.UpdateUsersInOrganizationRequest.class,
      responseType = app.onepass.apis.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UpdateUsersInOrganizationRequest,
      app.onepass.apis.Result> getAddUsersToOrganizationMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UpdateUsersInOrganizationRequest, app.onepass.apis.Result> getAddUsersToOrganizationMethod;
    if ((getAddUsersToOrganizationMethod = OrganizerServiceGrpc.getAddUsersToOrganizationMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getAddUsersToOrganizationMethod = OrganizerServiceGrpc.getAddUsersToOrganizationMethod) == null) {
          OrganizerServiceGrpc.getAddUsersToOrganizationMethod = getAddUsersToOrganizationMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UpdateUsersInOrganizationRequest, app.onepass.apis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddUsersToOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UpdateUsersInOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("AddUsersToOrganization"))
              .build();
        }
      }
    }
    return getAddUsersToOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UpdateUsersInOrganizationRequest,
      app.onepass.apis.Result> getRemoveUsersFromOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveUsersFromOrganization",
      requestType = app.onepass.apis.UpdateUsersInOrganizationRequest.class,
      responseType = app.onepass.apis.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UpdateUsersInOrganizationRequest,
      app.onepass.apis.Result> getRemoveUsersFromOrganizationMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UpdateUsersInOrganizationRequest, app.onepass.apis.Result> getRemoveUsersFromOrganizationMethod;
    if ((getRemoveUsersFromOrganizationMethod = OrganizerServiceGrpc.getRemoveUsersFromOrganizationMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getRemoveUsersFromOrganizationMethod = OrganizerServiceGrpc.getRemoveUsersFromOrganizationMethod) == null) {
          OrganizerServiceGrpc.getRemoveUsersFromOrganizationMethod = getRemoveUsersFromOrganizationMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UpdateUsersInOrganizationRequest, app.onepass.apis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveUsersFromOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UpdateUsersInOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("RemoveUsersFromOrganization"))
              .build();
        }
      }
    }
    return getRemoveUsersFromOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.CreateEventRequest,
      app.onepass.apis.Result> getCreateEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEvent",
      requestType = app.onepass.apis.CreateEventRequest.class,
      responseType = app.onepass.apis.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.CreateEventRequest,
      app.onepass.apis.Result> getCreateEventMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.CreateEventRequest, app.onepass.apis.Result> getCreateEventMethod;
    if ((getCreateEventMethod = OrganizerServiceGrpc.getCreateEventMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getCreateEventMethod = OrganizerServiceGrpc.getCreateEventMethod) == null) {
          OrganizerServiceGrpc.getCreateEventMethod = getCreateEventMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.CreateEventRequest, app.onepass.apis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.CreateEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("CreateEvent"))
              .build();
        }
      }
    }
    return getCreateEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UserRequest,
      app.onepass.apis.GetEventResponse> getGetEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEvent",
      requestType = app.onepass.apis.UserRequest.class,
      responseType = app.onepass.apis.GetEventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UserRequest,
      app.onepass.apis.GetEventResponse> getGetEventMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UserRequest, app.onepass.apis.GetEventResponse> getGetEventMethod;
    if ((getGetEventMethod = OrganizerServiceGrpc.getGetEventMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getGetEventMethod = OrganizerServiceGrpc.getGetEventMethod) == null) {
          OrganizerServiceGrpc.getGetEventMethod = getGetEventMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UserRequest, app.onepass.apis.GetEventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetEventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("GetEvent"))
              .build();
        }
      }
    }
    return getGetEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GetByIdRequest,
      app.onepass.apis.GetEventByIdResponse> getGetEventByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEventById",
      requestType = app.onepass.apis.GetByIdRequest.class,
      responseType = app.onepass.apis.GetEventByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GetByIdRequest,
      app.onepass.apis.GetEventByIdResponse> getGetEventByIdMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GetByIdRequest, app.onepass.apis.GetEventByIdResponse> getGetEventByIdMethod;
    if ((getGetEventByIdMethod = OrganizerServiceGrpc.getGetEventByIdMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getGetEventByIdMethod = OrganizerServiceGrpc.getGetEventByIdMethod) == null) {
          OrganizerServiceGrpc.getGetEventByIdMethod = getGetEventByIdMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GetByIdRequest, app.onepass.apis.GetEventByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEventById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetEventByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("GetEventById"))
              .build();
        }
      }
    }
    return getGetEventByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UpdateEventInfoRequest,
      app.onepass.apis.Result> getUpdateEventInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEventInfo",
      requestType = app.onepass.apis.UpdateEventInfoRequest.class,
      responseType = app.onepass.apis.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UpdateEventInfoRequest,
      app.onepass.apis.Result> getUpdateEventInfoMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UpdateEventInfoRequest, app.onepass.apis.Result> getUpdateEventInfoMethod;
    if ((getUpdateEventInfoMethod = OrganizerServiceGrpc.getUpdateEventInfoMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getUpdateEventInfoMethod = OrganizerServiceGrpc.getUpdateEventInfoMethod) == null) {
          OrganizerServiceGrpc.getUpdateEventInfoMethod = getUpdateEventInfoMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UpdateEventInfoRequest, app.onepass.apis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEventInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UpdateEventInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("UpdateEventInfo"))
              .build();
        }
      }
    }
    return getUpdateEventInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UpdateEventFacilityRequest,
      app.onepass.apis.Result> getUpdateEventFacilityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEventFacility",
      requestType = app.onepass.apis.UpdateEventFacilityRequest.class,
      responseType = app.onepass.apis.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UpdateEventFacilityRequest,
      app.onepass.apis.Result> getUpdateEventFacilityMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UpdateEventFacilityRequest, app.onepass.apis.Result> getUpdateEventFacilityMethod;
    if ((getUpdateEventFacilityMethod = OrganizerServiceGrpc.getUpdateEventFacilityMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getUpdateEventFacilityMethod = OrganizerServiceGrpc.getUpdateEventFacilityMethod) == null) {
          OrganizerServiceGrpc.getUpdateEventFacilityMethod = getUpdateEventFacilityMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UpdateEventFacilityRequest, app.onepass.apis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEventFacility"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UpdateEventFacilityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("UpdateEventFacility"))
              .build();
        }
      }
    }
    return getUpdateEventFacilityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UpdateEventDurationRequest,
      app.onepass.apis.Result> getUpdateEventDurationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEventDuration",
      requestType = app.onepass.apis.UpdateEventDurationRequest.class,
      responseType = app.onepass.apis.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UpdateEventDurationRequest,
      app.onepass.apis.Result> getUpdateEventDurationMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UpdateEventDurationRequest, app.onepass.apis.Result> getUpdateEventDurationMethod;
    if ((getUpdateEventDurationMethod = OrganizerServiceGrpc.getUpdateEventDurationMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getUpdateEventDurationMethod = OrganizerServiceGrpc.getUpdateEventDurationMethod) == null) {
          OrganizerServiceGrpc.getUpdateEventDurationMethod = getUpdateEventDurationMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UpdateEventDurationRequest, app.onepass.apis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEventDuration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UpdateEventDurationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("UpdateEventDuration"))
              .build();
        }
      }
    }
    return getUpdateEventDurationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.RemoveEventRequest,
      app.onepass.apis.Result> getRemoveEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveEvent",
      requestType = app.onepass.apis.RemoveEventRequest.class,
      responseType = app.onepass.apis.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.RemoveEventRequest,
      app.onepass.apis.Result> getRemoveEventMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.RemoveEventRequest, app.onepass.apis.Result> getRemoveEventMethod;
    if ((getRemoveEventMethod = OrganizerServiceGrpc.getRemoveEventMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getRemoveEventMethod = OrganizerServiceGrpc.getRemoveEventMethod) == null) {
          OrganizerServiceGrpc.getRemoveEventMethod = getRemoveEventMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.RemoveEventRequest, app.onepass.apis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.RemoveEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("RemoveEvent"))
              .build();
        }
      }
    }
    return getRemoveEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UpdateRegistrationRequestRequest,
      app.onepass.apis.Result> getUpdateRegistrationRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRegistrationRequest",
      requestType = app.onepass.apis.UpdateRegistrationRequestRequest.class,
      responseType = app.onepass.apis.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UpdateRegistrationRequestRequest,
      app.onepass.apis.Result> getUpdateRegistrationRequestMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UpdateRegistrationRequestRequest, app.onepass.apis.Result> getUpdateRegistrationRequestMethod;
    if ((getUpdateRegistrationRequestMethod = OrganizerServiceGrpc.getUpdateRegistrationRequestMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getUpdateRegistrationRequestMethod = OrganizerServiceGrpc.getUpdateRegistrationRequestMethod) == null) {
          OrganizerServiceGrpc.getUpdateRegistrationRequestMethod = getUpdateRegistrationRequestMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UpdateRegistrationRequestRequest, app.onepass.apis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRegistrationRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UpdateRegistrationRequestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("UpdateRegistrationRequest"))
              .build();
        }
      }
    }
    return getUpdateRegistrationRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.CreateTagRequest,
      app.onepass.apis.Result> getCreateTagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTag",
      requestType = app.onepass.apis.CreateTagRequest.class,
      responseType = app.onepass.apis.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.CreateTagRequest,
      app.onepass.apis.Result> getCreateTagMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.CreateTagRequest, app.onepass.apis.Result> getCreateTagMethod;
    if ((getCreateTagMethod = OrganizerServiceGrpc.getCreateTagMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getCreateTagMethod = OrganizerServiceGrpc.getCreateTagMethod) == null) {
          OrganizerServiceGrpc.getCreateTagMethod = getCreateTagMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.CreateTagRequest, app.onepass.apis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.CreateTagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("CreateTag"))
              .build();
        }
      }
    }
    return getCreateTagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UpdateTagRequest,
      app.onepass.apis.Result> getAddTagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddTag",
      requestType = app.onepass.apis.UpdateTagRequest.class,
      responseType = app.onepass.apis.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UpdateTagRequest,
      app.onepass.apis.Result> getAddTagMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UpdateTagRequest, app.onepass.apis.Result> getAddTagMethod;
    if ((getAddTagMethod = OrganizerServiceGrpc.getAddTagMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getAddTagMethod = OrganizerServiceGrpc.getAddTagMethod) == null) {
          OrganizerServiceGrpc.getAddTagMethod = getAddTagMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UpdateTagRequest, app.onepass.apis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddTag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UpdateTagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("AddTag"))
              .build();
        }
      }
    }
    return getAddTagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UpdateTagRequest,
      app.onepass.apis.Result> getRemoveTagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveTag",
      requestType = app.onepass.apis.UpdateTagRequest.class,
      responseType = app.onepass.apis.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UpdateTagRequest,
      app.onepass.apis.Result> getRemoveTagMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UpdateTagRequest, app.onepass.apis.Result> getRemoveTagMethod;
    if ((getRemoveTagMethod = OrganizerServiceGrpc.getRemoveTagMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getRemoveTagMethod = OrganizerServiceGrpc.getRemoveTagMethod) == null) {
          OrganizerServiceGrpc.getRemoveTagMethod = getRemoveTagMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UpdateTagRequest, app.onepass.apis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveTag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UpdateTagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("RemoveTag"))
              .build();
        }
      }
    }
    return getRemoveTagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UserRequest,
      app.onepass.apis.GetTagResponse> getGetTagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTag",
      requestType = app.onepass.apis.UserRequest.class,
      responseType = app.onepass.apis.GetTagResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UserRequest,
      app.onepass.apis.GetTagResponse> getGetTagMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UserRequest, app.onepass.apis.GetTagResponse> getGetTagMethod;
    if ((getGetTagMethod = OrganizerServiceGrpc.getGetTagMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getGetTagMethod = OrganizerServiceGrpc.getGetTagMethod) == null) {
          OrganizerServiceGrpc.getGetTagMethod = getGetTagMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UserRequest, app.onepass.apis.GetTagResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetTagResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("GetTag"))
              .build();
        }
      }
    }
    return getGetTagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GetByIdRequest,
      app.onepass.apis.GetTagByIdResponse> getGetTagByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTagById",
      requestType = app.onepass.apis.GetByIdRequest.class,
      responseType = app.onepass.apis.GetTagByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GetByIdRequest,
      app.onepass.apis.GetTagByIdResponse> getGetTagByIdMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GetByIdRequest, app.onepass.apis.GetTagByIdResponse> getGetTagByIdMethod;
    if ((getGetTagByIdMethod = OrganizerServiceGrpc.getGetTagByIdMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getGetTagByIdMethod = OrganizerServiceGrpc.getGetTagByIdMethod) == null) {
          OrganizerServiceGrpc.getGetTagByIdMethod = getGetTagByIdMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GetByIdRequest, app.onepass.apis.GetTagByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTagById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetTagByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("GetTagById"))
              .build();
        }
      }
    }
    return getGetTagByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.HasEventRequest,
      app.onepass.apis.Result> getHasEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HasEvent",
      requestType = app.onepass.apis.HasEventRequest.class,
      responseType = app.onepass.apis.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.HasEventRequest,
      app.onepass.apis.Result> getHasEventMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.HasEventRequest, app.onepass.apis.Result> getHasEventMethod;
    if ((getHasEventMethod = OrganizerServiceGrpc.getHasEventMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getHasEventMethod = OrganizerServiceGrpc.getHasEventMethod) == null) {
          OrganizerServiceGrpc.getHasEventMethod = getHasEventMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.HasEventRequest, app.onepass.apis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HasEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.HasEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("HasEvent"))
              .build();
        }
      }
    }
    return getHasEventMethod;
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
    if ((getPingMethod = OrganizerServiceGrpc.getPingMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getPingMethod = OrganizerServiceGrpc.getPingMethod) == null) {
          OrganizerServiceGrpc.getPingMethod = getPingMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, app.onepass.apis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("Ping"))
              .build();
        }
      }
    }
    return getPingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OrganizerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrganizerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrganizerServiceStub>() {
        @java.lang.Override
        public OrganizerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrganizerServiceStub(channel, callOptions);
        }
      };
    return OrganizerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OrganizerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrganizerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrganizerServiceBlockingStub>() {
        @java.lang.Override
        public OrganizerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrganizerServiceBlockingStub(channel, callOptions);
        }
      };
    return OrganizerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OrganizerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrganizerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrganizerServiceFutureStub>() {
        @java.lang.Override
        public OrganizerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrganizerServiceFutureStub(channel, callOptions);
        }
      };
    return OrganizerServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class OrganizerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createOrganization(app.onepass.apis.CreateOrganizationRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateOrganizationMethod(), responseObserver);
    }

    /**
     */
    public void getOrganization(app.onepass.apis.UserRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GetOrganizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrganizationMethod(), responseObserver);
    }

    /**
     */
    public void getOrganizationById(app.onepass.apis.GetByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GetOrganizationByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrganizationByIdMethod(), responseObserver);
    }

    /**
     */
    public void updateOrganization(app.onepass.apis.UpdateOrganizationRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateOrganizationMethod(), responseObserver);
    }

    /**
     */
    public void removeOrganization(app.onepass.apis.RemoveOrganizationRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveOrganizationMethod(), responseObserver);
    }

    /**
     */
    public void addUsersToOrganization(app.onepass.apis.UpdateUsersInOrganizationRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddUsersToOrganizationMethod(), responseObserver);
    }

    /**
     */
    public void removeUsersFromOrganization(app.onepass.apis.UpdateUsersInOrganizationRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveUsersFromOrganizationMethod(), responseObserver);
    }

    /**
     */
    public void createEvent(app.onepass.apis.CreateEventRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEventMethod(), responseObserver);
    }

    /**
     */
    public void getEvent(app.onepass.apis.UserRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GetEventResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEventMethod(), responseObserver);
    }

    /**
     */
    public void getEventById(app.onepass.apis.GetByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GetEventByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEventByIdMethod(), responseObserver);
    }

    /**
     */
    public void updateEventInfo(app.onepass.apis.UpdateEventInfoRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEventInfoMethod(), responseObserver);
    }

    /**
     */
    public void updateEventFacility(app.onepass.apis.UpdateEventFacilityRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEventFacilityMethod(), responseObserver);
    }

    /**
     */
    public void updateEventDuration(app.onepass.apis.UpdateEventDurationRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEventDurationMethod(), responseObserver);
    }

    /**
     */
    public void removeEvent(app.onepass.apis.RemoveEventRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveEventMethod(), responseObserver);
    }

    /**
     */
    public void updateRegistrationRequest(app.onepass.apis.UpdateRegistrationRequestRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRegistrationRequestMethod(), responseObserver);
    }

    /**
     */
    public void createTag(app.onepass.apis.CreateTagRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTagMethod(), responseObserver);
    }

    /**
     */
    public void addTag(app.onepass.apis.UpdateTagRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddTagMethod(), responseObserver);
    }

    /**
     */
    public void removeTag(app.onepass.apis.UpdateTagRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveTagMethod(), responseObserver);
    }

    /**
     */
    public void getTag(app.onepass.apis.UserRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GetTagResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTagMethod(), responseObserver);
    }

    /**
     */
    public void getTagById(app.onepass.apis.GetByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GetTagByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTagByIdMethod(), responseObserver);
    }

    /**
     */
    public void hasEvent(app.onepass.apis.HasEventRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHasEventMethod(), responseObserver);
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
            getCreateOrganizationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.CreateOrganizationRequest,
                app.onepass.apis.Result>(
                  this, METHODID_CREATE_ORGANIZATION)))
          .addMethod(
            getGetOrganizationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UserRequest,
                app.onepass.apis.GetOrganizationResponse>(
                  this, METHODID_GET_ORGANIZATION)))
          .addMethod(
            getGetOrganizationByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GetByIdRequest,
                app.onepass.apis.GetOrganizationByIdResponse>(
                  this, METHODID_GET_ORGANIZATION_BY_ID)))
          .addMethod(
            getUpdateOrganizationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UpdateOrganizationRequest,
                app.onepass.apis.Result>(
                  this, METHODID_UPDATE_ORGANIZATION)))
          .addMethod(
            getRemoveOrganizationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.RemoveOrganizationRequest,
                app.onepass.apis.Result>(
                  this, METHODID_REMOVE_ORGANIZATION)))
          .addMethod(
            getAddUsersToOrganizationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UpdateUsersInOrganizationRequest,
                app.onepass.apis.Result>(
                  this, METHODID_ADD_USERS_TO_ORGANIZATION)))
          .addMethod(
            getRemoveUsersFromOrganizationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UpdateUsersInOrganizationRequest,
                app.onepass.apis.Result>(
                  this, METHODID_REMOVE_USERS_FROM_ORGANIZATION)))
          .addMethod(
            getCreateEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.CreateEventRequest,
                app.onepass.apis.Result>(
                  this, METHODID_CREATE_EVENT)))
          .addMethod(
            getGetEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UserRequest,
                app.onepass.apis.GetEventResponse>(
                  this, METHODID_GET_EVENT)))
          .addMethod(
            getGetEventByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GetByIdRequest,
                app.onepass.apis.GetEventByIdResponse>(
                  this, METHODID_GET_EVENT_BY_ID)))
          .addMethod(
            getUpdateEventInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UpdateEventInfoRequest,
                app.onepass.apis.Result>(
                  this, METHODID_UPDATE_EVENT_INFO)))
          .addMethod(
            getUpdateEventFacilityMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UpdateEventFacilityRequest,
                app.onepass.apis.Result>(
                  this, METHODID_UPDATE_EVENT_FACILITY)))
          .addMethod(
            getUpdateEventDurationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UpdateEventDurationRequest,
                app.onepass.apis.Result>(
                  this, METHODID_UPDATE_EVENT_DURATION)))
          .addMethod(
            getRemoveEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.RemoveEventRequest,
                app.onepass.apis.Result>(
                  this, METHODID_REMOVE_EVENT)))
          .addMethod(
            getUpdateRegistrationRequestMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UpdateRegistrationRequestRequest,
                app.onepass.apis.Result>(
                  this, METHODID_UPDATE_REGISTRATION_REQUEST)))
          .addMethod(
            getCreateTagMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.CreateTagRequest,
                app.onepass.apis.Result>(
                  this, METHODID_CREATE_TAG)))
          .addMethod(
            getAddTagMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UpdateTagRequest,
                app.onepass.apis.Result>(
                  this, METHODID_ADD_TAG)))
          .addMethod(
            getRemoveTagMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UpdateTagRequest,
                app.onepass.apis.Result>(
                  this, METHODID_REMOVE_TAG)))
          .addMethod(
            getGetTagMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UserRequest,
                app.onepass.apis.GetTagResponse>(
                  this, METHODID_GET_TAG)))
          .addMethod(
            getGetTagByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GetByIdRequest,
                app.onepass.apis.GetTagByIdResponse>(
                  this, METHODID_GET_TAG_BY_ID)))
          .addMethod(
            getHasEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.HasEventRequest,
                app.onepass.apis.Result>(
                  this, METHODID_HAS_EVENT)))
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
  public static final class OrganizerServiceStub extends io.grpc.stub.AbstractAsyncStub<OrganizerServiceStub> {
    private OrganizerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrganizerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrganizerServiceStub(channel, callOptions);
    }

    /**
     */
    public void createOrganization(app.onepass.apis.CreateOrganizationRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOrganization(app.onepass.apis.UserRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GetOrganizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOrganizationById(app.onepass.apis.GetByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GetOrganizationByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrganizationByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateOrganization(app.onepass.apis.UpdateOrganizationRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeOrganization(app.onepass.apis.RemoveOrganizationRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addUsersToOrganization(app.onepass.apis.UpdateUsersInOrganizationRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddUsersToOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeUsersFromOrganization(app.onepass.apis.UpdateUsersInOrganizationRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveUsersFromOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createEvent(app.onepass.apis.CreateEventRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEvent(app.onepass.apis.UserRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GetEventResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEventById(app.onepass.apis.GetByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GetEventByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEventByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEventInfo(app.onepass.apis.UpdateEventInfoRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEventInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEventFacility(app.onepass.apis.UpdateEventFacilityRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEventFacilityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEventDuration(app.onepass.apis.UpdateEventDurationRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEventDurationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeEvent(app.onepass.apis.RemoveEventRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateRegistrationRequest(app.onepass.apis.UpdateRegistrationRequestRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRegistrationRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createTag(app.onepass.apis.CreateTagRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addTag(app.onepass.apis.UpdateTagRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddTagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeTag(app.onepass.apis.UpdateTagRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveTagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTag(app.onepass.apis.UserRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GetTagResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTagById(app.onepass.apis.GetByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GetTagByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTagByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void hasEvent(app.onepass.apis.HasEventRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHasEventMethod(), getCallOptions()), request, responseObserver);
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
  public static final class OrganizerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<OrganizerServiceBlockingStub> {
    private OrganizerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrganizerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrganizerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public app.onepass.apis.Result createOrganization(app.onepass.apis.CreateOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateOrganizationMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.GetOrganizationResponse getOrganization(app.onepass.apis.UserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrganizationMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.GetOrganizationByIdResponse getOrganizationById(app.onepass.apis.GetByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrganizationByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Result updateOrganization(app.onepass.apis.UpdateOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateOrganizationMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Result removeOrganization(app.onepass.apis.RemoveOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveOrganizationMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Result addUsersToOrganization(app.onepass.apis.UpdateUsersInOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddUsersToOrganizationMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Result removeUsersFromOrganization(app.onepass.apis.UpdateUsersInOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveUsersFromOrganizationMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Result createEvent(app.onepass.apis.CreateEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.GetEventResponse getEvent(app.onepass.apis.UserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.GetEventByIdResponse getEventById(app.onepass.apis.GetByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEventByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Result updateEventInfo(app.onepass.apis.UpdateEventInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEventInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Result updateEventFacility(app.onepass.apis.UpdateEventFacilityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEventFacilityMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Result updateEventDuration(app.onepass.apis.UpdateEventDurationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEventDurationMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Result removeEvent(app.onepass.apis.RemoveEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Result updateRegistrationRequest(app.onepass.apis.UpdateRegistrationRequestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRegistrationRequestMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Result createTag(app.onepass.apis.CreateTagRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTagMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Result addTag(app.onepass.apis.UpdateTagRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddTagMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Result removeTag(app.onepass.apis.UpdateTagRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveTagMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.GetTagResponse getTag(app.onepass.apis.UserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTagMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.GetTagByIdResponse getTagById(app.onepass.apis.GetByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTagByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Result hasEvent(app.onepass.apis.HasEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHasEventMethod(), getCallOptions(), request);
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
  public static final class OrganizerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<OrganizerServiceFutureStub> {
    private OrganizerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrganizerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrganizerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Result> createOrganization(
        app.onepass.apis.CreateOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateOrganizationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.GetOrganizationResponse> getOrganization(
        app.onepass.apis.UserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrganizationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.GetOrganizationByIdResponse> getOrganizationById(
        app.onepass.apis.GetByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrganizationByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Result> updateOrganization(
        app.onepass.apis.UpdateOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateOrganizationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Result> removeOrganization(
        app.onepass.apis.RemoveOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveOrganizationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Result> addUsersToOrganization(
        app.onepass.apis.UpdateUsersInOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddUsersToOrganizationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Result> removeUsersFromOrganization(
        app.onepass.apis.UpdateUsersInOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveUsersFromOrganizationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Result> createEvent(
        app.onepass.apis.CreateEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.GetEventResponse> getEvent(
        app.onepass.apis.UserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.GetEventByIdResponse> getEventById(
        app.onepass.apis.GetByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEventByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Result> updateEventInfo(
        app.onepass.apis.UpdateEventInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEventInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Result> updateEventFacility(
        app.onepass.apis.UpdateEventFacilityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEventFacilityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Result> updateEventDuration(
        app.onepass.apis.UpdateEventDurationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEventDurationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Result> removeEvent(
        app.onepass.apis.RemoveEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Result> updateRegistrationRequest(
        app.onepass.apis.UpdateRegistrationRequestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRegistrationRequestMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Result> createTag(
        app.onepass.apis.CreateTagRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTagMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Result> addTag(
        app.onepass.apis.UpdateTagRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddTagMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Result> removeTag(
        app.onepass.apis.UpdateTagRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveTagMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.GetTagResponse> getTag(
        app.onepass.apis.UserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTagMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.GetTagByIdResponse> getTagById(
        app.onepass.apis.GetByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTagByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Result> hasEvent(
        app.onepass.apis.HasEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHasEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Result> ping(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ORGANIZATION = 0;
  private static final int METHODID_GET_ORGANIZATION = 1;
  private static final int METHODID_GET_ORGANIZATION_BY_ID = 2;
  private static final int METHODID_UPDATE_ORGANIZATION = 3;
  private static final int METHODID_REMOVE_ORGANIZATION = 4;
  private static final int METHODID_ADD_USERS_TO_ORGANIZATION = 5;
  private static final int METHODID_REMOVE_USERS_FROM_ORGANIZATION = 6;
  private static final int METHODID_CREATE_EVENT = 7;
  private static final int METHODID_GET_EVENT = 8;
  private static final int METHODID_GET_EVENT_BY_ID = 9;
  private static final int METHODID_UPDATE_EVENT_INFO = 10;
  private static final int METHODID_UPDATE_EVENT_FACILITY = 11;
  private static final int METHODID_UPDATE_EVENT_DURATION = 12;
  private static final int METHODID_REMOVE_EVENT = 13;
  private static final int METHODID_UPDATE_REGISTRATION_REQUEST = 14;
  private static final int METHODID_CREATE_TAG = 15;
  private static final int METHODID_ADD_TAG = 16;
  private static final int METHODID_REMOVE_TAG = 17;
  private static final int METHODID_GET_TAG = 18;
  private static final int METHODID_GET_TAG_BY_ID = 19;
  private static final int METHODID_HAS_EVENT = 20;
  private static final int METHODID_PING = 21;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OrganizerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OrganizerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ORGANIZATION:
          serviceImpl.createOrganization((app.onepass.apis.CreateOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Result>) responseObserver);
          break;
        case METHODID_GET_ORGANIZATION:
          serviceImpl.getOrganization((app.onepass.apis.UserRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.GetOrganizationResponse>) responseObserver);
          break;
        case METHODID_GET_ORGANIZATION_BY_ID:
          serviceImpl.getOrganizationById((app.onepass.apis.GetByIdRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.GetOrganizationByIdResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ORGANIZATION:
          serviceImpl.updateOrganization((app.onepass.apis.UpdateOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Result>) responseObserver);
          break;
        case METHODID_REMOVE_ORGANIZATION:
          serviceImpl.removeOrganization((app.onepass.apis.RemoveOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Result>) responseObserver);
          break;
        case METHODID_ADD_USERS_TO_ORGANIZATION:
          serviceImpl.addUsersToOrganization((app.onepass.apis.UpdateUsersInOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Result>) responseObserver);
          break;
        case METHODID_REMOVE_USERS_FROM_ORGANIZATION:
          serviceImpl.removeUsersFromOrganization((app.onepass.apis.UpdateUsersInOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Result>) responseObserver);
          break;
        case METHODID_CREATE_EVENT:
          serviceImpl.createEvent((app.onepass.apis.CreateEventRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Result>) responseObserver);
          break;
        case METHODID_GET_EVENT:
          serviceImpl.getEvent((app.onepass.apis.UserRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.GetEventResponse>) responseObserver);
          break;
        case METHODID_GET_EVENT_BY_ID:
          serviceImpl.getEventById((app.onepass.apis.GetByIdRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.GetEventByIdResponse>) responseObserver);
          break;
        case METHODID_UPDATE_EVENT_INFO:
          serviceImpl.updateEventInfo((app.onepass.apis.UpdateEventInfoRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Result>) responseObserver);
          break;
        case METHODID_UPDATE_EVENT_FACILITY:
          serviceImpl.updateEventFacility((app.onepass.apis.UpdateEventFacilityRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Result>) responseObserver);
          break;
        case METHODID_UPDATE_EVENT_DURATION:
          serviceImpl.updateEventDuration((app.onepass.apis.UpdateEventDurationRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Result>) responseObserver);
          break;
        case METHODID_REMOVE_EVENT:
          serviceImpl.removeEvent((app.onepass.apis.RemoveEventRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Result>) responseObserver);
          break;
        case METHODID_UPDATE_REGISTRATION_REQUEST:
          serviceImpl.updateRegistrationRequest((app.onepass.apis.UpdateRegistrationRequestRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Result>) responseObserver);
          break;
        case METHODID_CREATE_TAG:
          serviceImpl.createTag((app.onepass.apis.CreateTagRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Result>) responseObserver);
          break;
        case METHODID_ADD_TAG:
          serviceImpl.addTag((app.onepass.apis.UpdateTagRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Result>) responseObserver);
          break;
        case METHODID_REMOVE_TAG:
          serviceImpl.removeTag((app.onepass.apis.UpdateTagRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Result>) responseObserver);
          break;
        case METHODID_GET_TAG:
          serviceImpl.getTag((app.onepass.apis.UserRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.GetTagResponse>) responseObserver);
          break;
        case METHODID_GET_TAG_BY_ID:
          serviceImpl.getTagById((app.onepass.apis.GetByIdRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.GetTagByIdResponse>) responseObserver);
          break;
        case METHODID_HAS_EVENT:
          serviceImpl.hasEvent((app.onepass.apis.HasEventRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Result>) responseObserver);
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

  private static abstract class OrganizerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OrganizerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return app.onepass.apis.OrganizerProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OrganizerService");
    }
  }

  private static final class OrganizerServiceFileDescriptorSupplier
      extends OrganizerServiceBaseDescriptorSupplier {
    OrganizerServiceFileDescriptorSupplier() {}
  }

  private static final class OrganizerServiceMethodDescriptorSupplier
      extends OrganizerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OrganizerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (OrganizerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OrganizerServiceFileDescriptorSupplier())
              .addMethod(getCreateOrganizationMethod())
              .addMethod(getGetOrganizationMethod())
              .addMethod(getGetOrganizationByIdMethod())
              .addMethod(getUpdateOrganizationMethod())
              .addMethod(getRemoveOrganizationMethod())
              .addMethod(getAddUsersToOrganizationMethod())
              .addMethod(getRemoveUsersFromOrganizationMethod())
              .addMethod(getCreateEventMethod())
              .addMethod(getGetEventMethod())
              .addMethod(getGetEventByIdMethod())
              .addMethod(getUpdateEventInfoMethod())
              .addMethod(getUpdateEventFacilityMethod())
              .addMethod(getUpdateEventDurationMethod())
              .addMethod(getRemoveEventMethod())
              .addMethod(getUpdateRegistrationRequestMethod())
              .addMethod(getCreateTagMethod())
              .addMethod(getAddTagMethod())
              .addMethod(getRemoveTagMethod())
              .addMethod(getGetTagMethod())
              .addMethod(getGetTagByIdMethod())
              .addMethod(getHasEventMethod())
              .addMethod(getPingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
