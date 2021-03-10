package app.onepass.apis;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
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
      app.onepass.apis.ReadOrganizationResult> getReadOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadOrganization",
      requestType = app.onepass.apis.UserRequest.class,
      responseType = app.onepass.apis.ReadOrganizationResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UserRequest,
      app.onepass.apis.ReadOrganizationResult> getReadOrganizationMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UserRequest, app.onepass.apis.ReadOrganizationResult> getReadOrganizationMethod;
    if ((getReadOrganizationMethod = OrganizerServiceGrpc.getReadOrganizationMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getReadOrganizationMethod = OrganizerServiceGrpc.getReadOrganizationMethod) == null) {
          OrganizerServiceGrpc.getReadOrganizationMethod = getReadOrganizationMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UserRequest, app.onepass.apis.ReadOrganizationResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.ReadOrganizationResult.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("ReadOrganization"))
              .build();
        }
      }
    }
    return getReadOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.ReadByIdRequest,
      app.onepass.apis.ReadOrganizationByIdResult> getReadOrganizationByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadOrganizationById",
      requestType = app.onepass.apis.ReadByIdRequest.class,
      responseType = app.onepass.apis.ReadOrganizationByIdResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.ReadByIdRequest,
      app.onepass.apis.ReadOrganizationByIdResult> getReadOrganizationByIdMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.ReadByIdRequest, app.onepass.apis.ReadOrganizationByIdResult> getReadOrganizationByIdMethod;
    if ((getReadOrganizationByIdMethod = OrganizerServiceGrpc.getReadOrganizationByIdMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getReadOrganizationByIdMethod = OrganizerServiceGrpc.getReadOrganizationByIdMethod) == null) {
          OrganizerServiceGrpc.getReadOrganizationByIdMethod = getReadOrganizationByIdMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.ReadByIdRequest, app.onepass.apis.ReadOrganizationByIdResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadOrganizationById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.ReadByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.ReadOrganizationByIdResult.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("ReadOrganizationById"))
              .build();
        }
      }
    }
    return getReadOrganizationByIdMethod;
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

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.DeleteOrganizationRequest,
      app.onepass.apis.Result> getDeleteOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteOrganization",
      requestType = app.onepass.apis.DeleteOrganizationRequest.class,
      responseType = app.onepass.apis.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.DeleteOrganizationRequest,
      app.onepass.apis.Result> getDeleteOrganizationMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.DeleteOrganizationRequest, app.onepass.apis.Result> getDeleteOrganizationMethod;
    if ((getDeleteOrganizationMethod = OrganizerServiceGrpc.getDeleteOrganizationMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getDeleteOrganizationMethod = OrganizerServiceGrpc.getDeleteOrganizationMethod) == null) {
          OrganizerServiceGrpc.getDeleteOrganizationMethod = getDeleteOrganizationMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.DeleteOrganizationRequest, app.onepass.apis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.DeleteOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("DeleteOrganization"))
              .build();
        }
      }
    }
    return getDeleteOrganizationMethod;
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
      app.onepass.apis.ReadEventResult> getReadEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadEvent",
      requestType = app.onepass.apis.UserRequest.class,
      responseType = app.onepass.apis.ReadEventResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UserRequest,
      app.onepass.apis.ReadEventResult> getReadEventMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UserRequest, app.onepass.apis.ReadEventResult> getReadEventMethod;
    if ((getReadEventMethod = OrganizerServiceGrpc.getReadEventMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getReadEventMethod = OrganizerServiceGrpc.getReadEventMethod) == null) {
          OrganizerServiceGrpc.getReadEventMethod = getReadEventMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UserRequest, app.onepass.apis.ReadEventResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.ReadEventResult.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("ReadEvent"))
              .build();
        }
      }
    }
    return getReadEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.ReadByIdRequest,
      app.onepass.apis.ReadEventByIdResult> getReadEventByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadEventById",
      requestType = app.onepass.apis.ReadByIdRequest.class,
      responseType = app.onepass.apis.ReadEventByIdResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.ReadByIdRequest,
      app.onepass.apis.ReadEventByIdResult> getReadEventByIdMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.ReadByIdRequest, app.onepass.apis.ReadEventByIdResult> getReadEventByIdMethod;
    if ((getReadEventByIdMethod = OrganizerServiceGrpc.getReadEventByIdMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getReadEventByIdMethod = OrganizerServiceGrpc.getReadEventByIdMethod) == null) {
          OrganizerServiceGrpc.getReadEventByIdMethod = getReadEventByIdMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.ReadByIdRequest, app.onepass.apis.ReadEventByIdResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadEventById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.ReadByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.ReadEventByIdResult.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("ReadEventById"))
              .build();
        }
      }
    }
    return getReadEventByIdMethod;
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

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.DeleteEventRequest,
      app.onepass.apis.Result> getDeleteEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteEvent",
      requestType = app.onepass.apis.DeleteEventRequest.class,
      responseType = app.onepass.apis.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.DeleteEventRequest,
      app.onepass.apis.Result> getDeleteEventMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.DeleteEventRequest, app.onepass.apis.Result> getDeleteEventMethod;
    if ((getDeleteEventMethod = OrganizerServiceGrpc.getDeleteEventMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getDeleteEventMethod = OrganizerServiceGrpc.getDeleteEventMethod) == null) {
          OrganizerServiceGrpc.getDeleteEventMethod = getDeleteEventMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.DeleteEventRequest, app.onepass.apis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.DeleteEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("DeleteEvent"))
              .build();
        }
      }
    }
    return getDeleteEventMethod;
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
      app.onepass.apis.ReadTagResult> getReadTagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadTag",
      requestType = app.onepass.apis.UserRequest.class,
      responseType = app.onepass.apis.ReadTagResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UserRequest,
      app.onepass.apis.ReadTagResult> getReadTagMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UserRequest, app.onepass.apis.ReadTagResult> getReadTagMethod;
    if ((getReadTagMethod = OrganizerServiceGrpc.getReadTagMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getReadTagMethod = OrganizerServiceGrpc.getReadTagMethod) == null) {
          OrganizerServiceGrpc.getReadTagMethod = getReadTagMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UserRequest, app.onepass.apis.ReadTagResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadTag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.ReadTagResult.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("ReadTag"))
              .build();
        }
      }
    }
    return getReadTagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.ReadByIdRequest,
      app.onepass.apis.ReadTagByIdResult> getReadTagByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadTagById",
      requestType = app.onepass.apis.ReadByIdRequest.class,
      responseType = app.onepass.apis.ReadTagByIdResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.ReadByIdRequest,
      app.onepass.apis.ReadTagByIdResult> getReadTagByIdMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.ReadByIdRequest, app.onepass.apis.ReadTagByIdResult> getReadTagByIdMethod;
    if ((getReadTagByIdMethod = OrganizerServiceGrpc.getReadTagByIdMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getReadTagByIdMethod = OrganizerServiceGrpc.getReadTagByIdMethod) == null) {
          OrganizerServiceGrpc.getReadTagByIdMethod = getReadTagByIdMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.ReadByIdRequest, app.onepass.apis.ReadTagByIdResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadTagById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.ReadByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.ReadTagByIdResult.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("ReadTagById"))
              .build();
        }
      }
    }
    return getReadTagByIdMethod;
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
    public void readOrganization(app.onepass.apis.UserRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.ReadOrganizationResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadOrganizationMethod(), responseObserver);
    }

    /**
     */
    public void readOrganizationById(app.onepass.apis.ReadByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.ReadOrganizationByIdResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadOrganizationByIdMethod(), responseObserver);
    }

    /**
     */
    public void updateOrganization(app.onepass.apis.UpdateOrganizationRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateOrganizationMethod(), responseObserver);
    }

    /**
     */
    public void deleteOrganization(app.onepass.apis.DeleteOrganizationRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteOrganizationMethod(), responseObserver);
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
    public void readEvent(app.onepass.apis.UserRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.ReadEventResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadEventMethod(), responseObserver);
    }

    /**
     */
    public void readEventById(app.onepass.apis.ReadByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.ReadEventByIdResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadEventByIdMethod(), responseObserver);
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
    public void deleteEvent(app.onepass.apis.DeleteEventRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEventMethod(), responseObserver);
    }

    /**
     */
    public void updateRegistrationRequest(app.onepass.apis.UpdateRegistrationRequestRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRegistrationRequestMethod(), responseObserver);
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
    public void readTag(app.onepass.apis.UserRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.ReadTagResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadTagMethod(), responseObserver);
    }

    /**
     */
    public void readTagById(app.onepass.apis.ReadByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.ReadTagByIdResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadTagByIdMethod(), responseObserver);
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
            getReadOrganizationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UserRequest,
                app.onepass.apis.ReadOrganizationResult>(
                  this, METHODID_READ_ORGANIZATION)))
          .addMethod(
            getReadOrganizationByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.ReadByIdRequest,
                app.onepass.apis.ReadOrganizationByIdResult>(
                  this, METHODID_READ_ORGANIZATION_BY_ID)))
          .addMethod(
            getUpdateOrganizationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UpdateOrganizationRequest,
                app.onepass.apis.Result>(
                  this, METHODID_UPDATE_ORGANIZATION)))
          .addMethod(
            getDeleteOrganizationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.DeleteOrganizationRequest,
                app.onepass.apis.Result>(
                  this, METHODID_DELETE_ORGANIZATION)))
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
            getReadEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UserRequest,
                app.onepass.apis.ReadEventResult>(
                  this, METHODID_READ_EVENT)))
          .addMethod(
            getReadEventByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.ReadByIdRequest,
                app.onepass.apis.ReadEventByIdResult>(
                  this, METHODID_READ_EVENT_BY_ID)))
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
            getDeleteEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.DeleteEventRequest,
                app.onepass.apis.Result>(
                  this, METHODID_DELETE_EVENT)))
          .addMethod(
            getUpdateRegistrationRequestMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UpdateRegistrationRequestRequest,
                app.onepass.apis.Result>(
                  this, METHODID_UPDATE_REGISTRATION_REQUEST)))
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
            getReadTagMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UserRequest,
                app.onepass.apis.ReadTagResult>(
                  this, METHODID_READ_TAG)))
          .addMethod(
            getReadTagByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.ReadByIdRequest,
                app.onepass.apis.ReadTagByIdResult>(
                  this, METHODID_READ_TAG_BY_ID)))
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
    public void readOrganization(app.onepass.apis.UserRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.ReadOrganizationResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readOrganizationById(app.onepass.apis.ReadByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.ReadOrganizationByIdResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadOrganizationByIdMethod(), getCallOptions()), request, responseObserver);
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
    public void deleteOrganization(app.onepass.apis.DeleteOrganizationRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteOrganizationMethod(), getCallOptions()), request, responseObserver);
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
    public void readEvent(app.onepass.apis.UserRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.ReadEventResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readEventById(app.onepass.apis.ReadByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.ReadEventByIdResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadEventByIdMethod(), getCallOptions()), request, responseObserver);
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
    public void deleteEvent(app.onepass.apis.DeleteEventRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEventMethod(), getCallOptions()), request, responseObserver);
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
    public void readTag(app.onepass.apis.UserRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.ReadTagResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadTagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readTagById(app.onepass.apis.ReadByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.ReadTagByIdResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadTagByIdMethod(), getCallOptions()), request, responseObserver);
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
    public app.onepass.apis.ReadOrganizationResult readOrganization(app.onepass.apis.UserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadOrganizationMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.ReadOrganizationByIdResult readOrganizationById(app.onepass.apis.ReadByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadOrganizationByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Result updateOrganization(app.onepass.apis.UpdateOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateOrganizationMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Result deleteOrganization(app.onepass.apis.DeleteOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteOrganizationMethod(), getCallOptions(), request);
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
    public app.onepass.apis.ReadEventResult readEvent(app.onepass.apis.UserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.ReadEventByIdResult readEventById(app.onepass.apis.ReadByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadEventByIdMethod(), getCallOptions(), request);
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
    public app.onepass.apis.Result deleteEvent(app.onepass.apis.DeleteEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Result updateRegistrationRequest(app.onepass.apis.UpdateRegistrationRequestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRegistrationRequestMethod(), getCallOptions(), request);
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
    public app.onepass.apis.ReadTagResult readTag(app.onepass.apis.UserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadTagMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.ReadTagByIdResult readTagById(app.onepass.apis.ReadByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadTagByIdMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.ReadOrganizationResult> readOrganization(
        app.onepass.apis.UserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadOrganizationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.ReadOrganizationByIdResult> readOrganizationById(
        app.onepass.apis.ReadByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadOrganizationByIdMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Result> deleteOrganization(
        app.onepass.apis.DeleteOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteOrganizationMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.ReadEventResult> readEvent(
        app.onepass.apis.UserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.ReadEventByIdResult> readEventById(
        app.onepass.apis.ReadByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadEventByIdMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Result> deleteEvent(
        app.onepass.apis.DeleteEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEventMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.ReadTagResult> readTag(
        app.onepass.apis.UserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadTagMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.ReadTagByIdResult> readTagById(
        app.onepass.apis.ReadByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadTagByIdMethod(), getCallOptions()), request);
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
  private static final int METHODID_READ_ORGANIZATION = 1;
  private static final int METHODID_READ_ORGANIZATION_BY_ID = 2;
  private static final int METHODID_UPDATE_ORGANIZATION = 3;
  private static final int METHODID_DELETE_ORGANIZATION = 4;
  private static final int METHODID_ADD_USERS_TO_ORGANIZATION = 5;
  private static final int METHODID_REMOVE_USERS_FROM_ORGANIZATION = 6;
  private static final int METHODID_CREATE_EVENT = 7;
  private static final int METHODID_READ_EVENT = 8;
  private static final int METHODID_READ_EVENT_BY_ID = 9;
  private static final int METHODID_UPDATE_EVENT_INFO = 10;
  private static final int METHODID_UPDATE_EVENT_FACILITY = 11;
  private static final int METHODID_UPDATE_EVENT_DURATION = 12;
  private static final int METHODID_DELETE_EVENT = 13;
  private static final int METHODID_UPDATE_REGISTRATION_REQUEST = 14;
  private static final int METHODID_ADD_TAG = 15;
  private static final int METHODID_REMOVE_TAG = 16;
  private static final int METHODID_READ_TAG = 17;
  private static final int METHODID_READ_TAG_BY_ID = 18;
  private static final int METHODID_HAS_EVENT = 19;
  private static final int METHODID_PING = 20;

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
        case METHODID_READ_ORGANIZATION:
          serviceImpl.readOrganization((app.onepass.apis.UserRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.ReadOrganizationResult>) responseObserver);
          break;
        case METHODID_READ_ORGANIZATION_BY_ID:
          serviceImpl.readOrganizationById((app.onepass.apis.ReadByIdRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.ReadOrganizationByIdResult>) responseObserver);
          break;
        case METHODID_UPDATE_ORGANIZATION:
          serviceImpl.updateOrganization((app.onepass.apis.UpdateOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Result>) responseObserver);
          break;
        case METHODID_DELETE_ORGANIZATION:
          serviceImpl.deleteOrganization((app.onepass.apis.DeleteOrganizationRequest) request,
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
        case METHODID_READ_EVENT:
          serviceImpl.readEvent((app.onepass.apis.UserRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.ReadEventResult>) responseObserver);
          break;
        case METHODID_READ_EVENT_BY_ID:
          serviceImpl.readEventById((app.onepass.apis.ReadByIdRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.ReadEventByIdResult>) responseObserver);
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
        case METHODID_DELETE_EVENT:
          serviceImpl.deleteEvent((app.onepass.apis.DeleteEventRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Result>) responseObserver);
          break;
        case METHODID_UPDATE_REGISTRATION_REQUEST:
          serviceImpl.updateRegistrationRequest((app.onepass.apis.UpdateRegistrationRequestRequest) request,
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
        case METHODID_READ_TAG:
          serviceImpl.readTag((app.onepass.apis.UserRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.ReadTagResult>) responseObserver);
          break;
        case METHODID_READ_TAG_BY_ID:
          serviceImpl.readTagById((app.onepass.apis.ReadByIdRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.ReadTagByIdResult>) responseObserver);
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
              .addMethod(getReadOrganizationMethod())
              .addMethod(getReadOrganizationByIdMethod())
              .addMethod(getUpdateOrganizationMethod())
              .addMethod(getDeleteOrganizationMethod())
              .addMethod(getAddUsersToOrganizationMethod())
              .addMethod(getRemoveUsersFromOrganizationMethod())
              .addMethod(getCreateEventMethod())
              .addMethod(getReadEventMethod())
              .addMethod(getReadEventByIdMethod())
              .addMethod(getUpdateEventInfoMethod())
              .addMethod(getUpdateEventFacilityMethod())
              .addMethod(getUpdateEventDurationMethod())
              .addMethod(getDeleteEventMethod())
              .addMethod(getUpdateRegistrationRequestMethod())
              .addMethod(getAddTagMethod())
              .addMethod(getRemoveTagMethod())
              .addMethod(getReadTagMethod())
              .addMethod(getReadTagByIdMethod())
              .addMethod(getHasEventMethod())
              .addMethod(getPingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
