package app.onepass.apis;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: hts/organizer/service.proto")
public final class OrganizationServiceGrpc {

  private OrganizationServiceGrpc() {}

  public static final String SERVICE_NAME = "hts.facility.OrganizationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.CreateOrganizationReq,
      app.onepass.apis.Result> getCreateOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateOrganization",
      requestType = app.onepass.apis.CreateOrganizationReq.class,
      responseType = app.onepass.apis.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.CreateOrganizationReq,
      app.onepass.apis.Result> getCreateOrganizationMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.CreateOrganizationReq, app.onepass.apis.Result> getCreateOrganizationMethod;
    if ((getCreateOrganizationMethod = OrganizationServiceGrpc.getCreateOrganizationMethod) == null) {
      synchronized (OrganizationServiceGrpc.class) {
        if ((getCreateOrganizationMethod = OrganizationServiceGrpc.getCreateOrganizationMethod) == null) {
          OrganizationServiceGrpc.getCreateOrganizationMethod = getCreateOrganizationMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.CreateOrganizationReq, app.onepass.apis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.CreateOrganizationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationServiceMethodDescriptorSupplier("CreateOrganization"))
              .build();
        }
      }
    }
    return getCreateOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UserReq,
      app.onepass.apis.ReadOrganizationRes> getReadOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadOrganization",
      requestType = app.onepass.apis.UserReq.class,
      responseType = app.onepass.apis.ReadOrganizationRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UserReq,
      app.onepass.apis.ReadOrganizationRes> getReadOrganizationMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UserReq, app.onepass.apis.ReadOrganizationRes> getReadOrganizationMethod;
    if ((getReadOrganizationMethod = OrganizationServiceGrpc.getReadOrganizationMethod) == null) {
      synchronized (OrganizationServiceGrpc.class) {
        if ((getReadOrganizationMethod = OrganizationServiceGrpc.getReadOrganizationMethod) == null) {
          OrganizationServiceGrpc.getReadOrganizationMethod = getReadOrganizationMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UserReq, app.onepass.apis.ReadOrganizationRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UserReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.ReadOrganizationRes.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationServiceMethodDescriptorSupplier("ReadOrganization"))
              .build();
        }
      }
    }
    return getReadOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UpdateOrganizationReq,
      app.onepass.apis.Result> getUpdateOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOrganization",
      requestType = app.onepass.apis.UpdateOrganizationReq.class,
      responseType = app.onepass.apis.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UpdateOrganizationReq,
      app.onepass.apis.Result> getUpdateOrganizationMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UpdateOrganizationReq, app.onepass.apis.Result> getUpdateOrganizationMethod;
    if ((getUpdateOrganizationMethod = OrganizationServiceGrpc.getUpdateOrganizationMethod) == null) {
      synchronized (OrganizationServiceGrpc.class) {
        if ((getUpdateOrganizationMethod = OrganizationServiceGrpc.getUpdateOrganizationMethod) == null) {
          OrganizationServiceGrpc.getUpdateOrganizationMethod = getUpdateOrganizationMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UpdateOrganizationReq, app.onepass.apis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UpdateOrganizationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationServiceMethodDescriptorSupplier("UpdateOrganization"))
              .build();
        }
      }
    }
    return getUpdateOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.DeleteOrganizationReq,
      app.onepass.apis.Result> getDeleteOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteOrganization",
      requestType = app.onepass.apis.DeleteOrganizationReq.class,
      responseType = app.onepass.apis.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.DeleteOrganizationReq,
      app.onepass.apis.Result> getDeleteOrganizationMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.DeleteOrganizationReq, app.onepass.apis.Result> getDeleteOrganizationMethod;
    if ((getDeleteOrganizationMethod = OrganizationServiceGrpc.getDeleteOrganizationMethod) == null) {
      synchronized (OrganizationServiceGrpc.class) {
        if ((getDeleteOrganizationMethod = OrganizationServiceGrpc.getDeleteOrganizationMethod) == null) {
          OrganizationServiceGrpc.getDeleteOrganizationMethod = getDeleteOrganizationMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.DeleteOrganizationReq, app.onepass.apis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.DeleteOrganizationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationServiceMethodDescriptorSupplier("DeleteOrganization"))
              .build();
        }
      }
    }
    return getDeleteOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UpdateUsersInOrganizationReq,
      app.onepass.apis.Result> getAddUsersToOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddUsersToOrganization",
      requestType = app.onepass.apis.UpdateUsersInOrganizationReq.class,
      responseType = app.onepass.apis.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UpdateUsersInOrganizationReq,
      app.onepass.apis.Result> getAddUsersToOrganizationMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UpdateUsersInOrganizationReq, app.onepass.apis.Result> getAddUsersToOrganizationMethod;
    if ((getAddUsersToOrganizationMethod = OrganizationServiceGrpc.getAddUsersToOrganizationMethod) == null) {
      synchronized (OrganizationServiceGrpc.class) {
        if ((getAddUsersToOrganizationMethod = OrganizationServiceGrpc.getAddUsersToOrganizationMethod) == null) {
          OrganizationServiceGrpc.getAddUsersToOrganizationMethod = getAddUsersToOrganizationMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UpdateUsersInOrganizationReq, app.onepass.apis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddUsersToOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UpdateUsersInOrganizationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationServiceMethodDescriptorSupplier("AddUsersToOrganization"))
              .build();
        }
      }
    }
    return getAddUsersToOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UpdateUsersInOrganizationReq,
      app.onepass.apis.Result> getRemoveUsersFromOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveUsersFromOrganization",
      requestType = app.onepass.apis.UpdateUsersInOrganizationReq.class,
      responseType = app.onepass.apis.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UpdateUsersInOrganizationReq,
      app.onepass.apis.Result> getRemoveUsersFromOrganizationMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UpdateUsersInOrganizationReq, app.onepass.apis.Result> getRemoveUsersFromOrganizationMethod;
    if ((getRemoveUsersFromOrganizationMethod = OrganizationServiceGrpc.getRemoveUsersFromOrganizationMethod) == null) {
      synchronized (OrganizationServiceGrpc.class) {
        if ((getRemoveUsersFromOrganizationMethod = OrganizationServiceGrpc.getRemoveUsersFromOrganizationMethod) == null) {
          OrganizationServiceGrpc.getRemoveUsersFromOrganizationMethod = getRemoveUsersFromOrganizationMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UpdateUsersInOrganizationReq, app.onepass.apis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveUsersFromOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UpdateUsersInOrganizationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationServiceMethodDescriptorSupplier("RemoveUsersFromOrganization"))
              .build();
        }
      }
    }
    return getRemoveUsersFromOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.CreateEventReq,
      app.onepass.apis.Result> getCreateEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEvent",
      requestType = app.onepass.apis.CreateEventReq.class,
      responseType = app.onepass.apis.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.CreateEventReq,
      app.onepass.apis.Result> getCreateEventMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.CreateEventReq, app.onepass.apis.Result> getCreateEventMethod;
    if ((getCreateEventMethod = OrganizationServiceGrpc.getCreateEventMethod) == null) {
      synchronized (OrganizationServiceGrpc.class) {
        if ((getCreateEventMethod = OrganizationServiceGrpc.getCreateEventMethod) == null) {
          OrganizationServiceGrpc.getCreateEventMethod = getCreateEventMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.CreateEventReq, app.onepass.apis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.CreateEventReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationServiceMethodDescriptorSupplier("CreateEvent"))
              .build();
        }
      }
    }
    return getCreateEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UserReq,
      app.onepass.apis.ReadEventRes> getReadEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadEvent",
      requestType = app.onepass.apis.UserReq.class,
      responseType = app.onepass.apis.ReadEventRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UserReq,
      app.onepass.apis.ReadEventRes> getReadEventMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UserReq, app.onepass.apis.ReadEventRes> getReadEventMethod;
    if ((getReadEventMethod = OrganizationServiceGrpc.getReadEventMethod) == null) {
      synchronized (OrganizationServiceGrpc.class) {
        if ((getReadEventMethod = OrganizationServiceGrpc.getReadEventMethod) == null) {
          OrganizationServiceGrpc.getReadEventMethod = getReadEventMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UserReq, app.onepass.apis.ReadEventRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UserReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.ReadEventRes.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationServiceMethodDescriptorSupplier("ReadEvent"))
              .build();
        }
      }
    }
    return getReadEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UpdateEventInfoReq,
      app.onepass.apis.Result> getUpdateEventInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEventInfo",
      requestType = app.onepass.apis.UpdateEventInfoReq.class,
      responseType = app.onepass.apis.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UpdateEventInfoReq,
      app.onepass.apis.Result> getUpdateEventInfoMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UpdateEventInfoReq, app.onepass.apis.Result> getUpdateEventInfoMethod;
    if ((getUpdateEventInfoMethod = OrganizationServiceGrpc.getUpdateEventInfoMethod) == null) {
      synchronized (OrganizationServiceGrpc.class) {
        if ((getUpdateEventInfoMethod = OrganizationServiceGrpc.getUpdateEventInfoMethod) == null) {
          OrganizationServiceGrpc.getUpdateEventInfoMethod = getUpdateEventInfoMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UpdateEventInfoReq, app.onepass.apis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEventInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UpdateEventInfoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationServiceMethodDescriptorSupplier("UpdateEventInfo"))
              .build();
        }
      }
    }
    return getUpdateEventInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UpdateEventFacilityReq,
      app.onepass.apis.Result> getUpdateEventFacilityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEventFacility",
      requestType = app.onepass.apis.UpdateEventFacilityReq.class,
      responseType = app.onepass.apis.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UpdateEventFacilityReq,
      app.onepass.apis.Result> getUpdateEventFacilityMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UpdateEventFacilityReq, app.onepass.apis.Result> getUpdateEventFacilityMethod;
    if ((getUpdateEventFacilityMethod = OrganizationServiceGrpc.getUpdateEventFacilityMethod) == null) {
      synchronized (OrganizationServiceGrpc.class) {
        if ((getUpdateEventFacilityMethod = OrganizationServiceGrpc.getUpdateEventFacilityMethod) == null) {
          OrganizationServiceGrpc.getUpdateEventFacilityMethod = getUpdateEventFacilityMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UpdateEventFacilityReq, app.onepass.apis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEventFacility"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UpdateEventFacilityReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationServiceMethodDescriptorSupplier("UpdateEventFacility"))
              .build();
        }
      }
    }
    return getUpdateEventFacilityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UpdateEventDurationReq,
      app.onepass.apis.Result> getUpdateEventDurationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEventDuration",
      requestType = app.onepass.apis.UpdateEventDurationReq.class,
      responseType = app.onepass.apis.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UpdateEventDurationReq,
      app.onepass.apis.Result> getUpdateEventDurationMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UpdateEventDurationReq, app.onepass.apis.Result> getUpdateEventDurationMethod;
    if ((getUpdateEventDurationMethod = OrganizationServiceGrpc.getUpdateEventDurationMethod) == null) {
      synchronized (OrganizationServiceGrpc.class) {
        if ((getUpdateEventDurationMethod = OrganizationServiceGrpc.getUpdateEventDurationMethod) == null) {
          OrganizationServiceGrpc.getUpdateEventDurationMethod = getUpdateEventDurationMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UpdateEventDurationReq, app.onepass.apis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEventDuration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UpdateEventDurationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationServiceMethodDescriptorSupplier("UpdateEventDuration"))
              .build();
        }
      }
    }
    return getUpdateEventDurationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.DeleteEventReq,
      app.onepass.apis.Result> getDeleteEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteEvent",
      requestType = app.onepass.apis.DeleteEventReq.class,
      responseType = app.onepass.apis.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.DeleteEventReq,
      app.onepass.apis.Result> getDeleteEventMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.DeleteEventReq, app.onepass.apis.Result> getDeleteEventMethod;
    if ((getDeleteEventMethod = OrganizationServiceGrpc.getDeleteEventMethod) == null) {
      synchronized (OrganizationServiceGrpc.class) {
        if ((getDeleteEventMethod = OrganizationServiceGrpc.getDeleteEventMethod) == null) {
          OrganizationServiceGrpc.getDeleteEventMethod = getDeleteEventMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.DeleteEventReq, app.onepass.apis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.DeleteEventReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationServiceMethodDescriptorSupplier("DeleteEvent"))
              .build();
        }
      }
    }
    return getDeleteEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UpdateRegistrationRequestReq,
      app.onepass.apis.Result> getUpdateRegistrationRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRegistrationRequest",
      requestType = app.onepass.apis.UpdateRegistrationRequestReq.class,
      responseType = app.onepass.apis.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UpdateRegistrationRequestReq,
      app.onepass.apis.Result> getUpdateRegistrationRequestMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UpdateRegistrationRequestReq, app.onepass.apis.Result> getUpdateRegistrationRequestMethod;
    if ((getUpdateRegistrationRequestMethod = OrganizationServiceGrpc.getUpdateRegistrationRequestMethod) == null) {
      synchronized (OrganizationServiceGrpc.class) {
        if ((getUpdateRegistrationRequestMethod = OrganizationServiceGrpc.getUpdateRegistrationRequestMethod) == null) {
          OrganizationServiceGrpc.getUpdateRegistrationRequestMethod = getUpdateRegistrationRequestMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UpdateRegistrationRequestReq, app.onepass.apis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRegistrationRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UpdateRegistrationRequestReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationServiceMethodDescriptorSupplier("UpdateRegistrationRequest"))
              .build();
        }
      }
    }
    return getUpdateRegistrationRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UpdateTagReq,
      app.onepass.apis.Result> getAddTagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddTag",
      requestType = app.onepass.apis.UpdateTagReq.class,
      responseType = app.onepass.apis.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UpdateTagReq,
      app.onepass.apis.Result> getAddTagMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UpdateTagReq, app.onepass.apis.Result> getAddTagMethod;
    if ((getAddTagMethod = OrganizationServiceGrpc.getAddTagMethod) == null) {
      synchronized (OrganizationServiceGrpc.class) {
        if ((getAddTagMethod = OrganizationServiceGrpc.getAddTagMethod) == null) {
          OrganizationServiceGrpc.getAddTagMethod = getAddTagMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UpdateTagReq, app.onepass.apis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddTag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UpdateTagReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationServiceMethodDescriptorSupplier("AddTag"))
              .build();
        }
      }
    }
    return getAddTagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UpdateTagReq,
      app.onepass.apis.Result> getRemoveTagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveTag",
      requestType = app.onepass.apis.UpdateTagReq.class,
      responseType = app.onepass.apis.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UpdateTagReq,
      app.onepass.apis.Result> getRemoveTagMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UpdateTagReq, app.onepass.apis.Result> getRemoveTagMethod;
    if ((getRemoveTagMethod = OrganizationServiceGrpc.getRemoveTagMethod) == null) {
      synchronized (OrganizationServiceGrpc.class) {
        if ((getRemoveTagMethod = OrganizationServiceGrpc.getRemoveTagMethod) == null) {
          OrganizationServiceGrpc.getRemoveTagMethod = getRemoveTagMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UpdateTagReq, app.onepass.apis.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveTag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UpdateTagReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Result.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationServiceMethodDescriptorSupplier("RemoveTag"))
              .build();
        }
      }
    }
    return getRemoveTagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UserReq,
      app.onepass.apis.ReadTagRes> getReadTagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadTag",
      requestType = app.onepass.apis.UserReq.class,
      responseType = app.onepass.apis.ReadTagRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UserReq,
      app.onepass.apis.ReadTagRes> getReadTagMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UserReq, app.onepass.apis.ReadTagRes> getReadTagMethod;
    if ((getReadTagMethod = OrganizationServiceGrpc.getReadTagMethod) == null) {
      synchronized (OrganizationServiceGrpc.class) {
        if ((getReadTagMethod = OrganizationServiceGrpc.getReadTagMethod) == null) {
          OrganizationServiceGrpc.getReadTagMethod = getReadTagMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UserReq, app.onepass.apis.ReadTagRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadTag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UserReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.ReadTagRes.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationServiceMethodDescriptorSupplier("ReadTag"))
              .build();
        }
      }
    }
    return getReadTagMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OrganizationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrganizationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrganizationServiceStub>() {
        @java.lang.Override
        public OrganizationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrganizationServiceStub(channel, callOptions);
        }
      };
    return OrganizationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OrganizationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrganizationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrganizationServiceBlockingStub>() {
        @java.lang.Override
        public OrganizationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrganizationServiceBlockingStub(channel, callOptions);
        }
      };
    return OrganizationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OrganizationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrganizationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrganizationServiceFutureStub>() {
        @java.lang.Override
        public OrganizationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrganizationServiceFutureStub(channel, callOptions);
        }
      };
    return OrganizationServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class OrganizationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createOrganization(app.onepass.apis.CreateOrganizationReq request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateOrganizationMethod(), responseObserver);
    }

    /**
     */
    public void readOrganization(app.onepass.apis.UserReq request,
        io.grpc.stub.StreamObserver<app.onepass.apis.ReadOrganizationRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadOrganizationMethod(), responseObserver);
    }

    /**
     */
    public void updateOrganization(app.onepass.apis.UpdateOrganizationReq request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateOrganizationMethod(), responseObserver);
    }

    /**
     */
    public void deleteOrganization(app.onepass.apis.DeleteOrganizationReq request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteOrganizationMethod(), responseObserver);
    }

    /**
     */
    public void addUsersToOrganization(app.onepass.apis.UpdateUsersInOrganizationReq request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddUsersToOrganizationMethod(), responseObserver);
    }

    /**
     */
    public void removeUsersFromOrganization(app.onepass.apis.UpdateUsersInOrganizationReq request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveUsersFromOrganizationMethod(), responseObserver);
    }

    /**
     */
    public void createEvent(app.onepass.apis.CreateEventReq request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEventMethod(), responseObserver);
    }

    /**
     */
    public void readEvent(app.onepass.apis.UserReq request,
        io.grpc.stub.StreamObserver<app.onepass.apis.ReadEventRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadEventMethod(), responseObserver);
    }

    /**
     */
    public void updateEventInfo(app.onepass.apis.UpdateEventInfoReq request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEventInfoMethod(), responseObserver);
    }

    /**
     */
    public void updateEventFacility(app.onepass.apis.UpdateEventFacilityReq request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEventFacilityMethod(), responseObserver);
    }

    /**
     */
    public void updateEventDuration(app.onepass.apis.UpdateEventDurationReq request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEventDurationMethod(), responseObserver);
    }

    /**
     */
    public void deleteEvent(app.onepass.apis.DeleteEventReq request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEventMethod(), responseObserver);
    }

    /**
     */
    public void updateRegistrationRequest(app.onepass.apis.UpdateRegistrationRequestReq request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRegistrationRequestMethod(), responseObserver);
    }

    /**
     */
    public void addTag(app.onepass.apis.UpdateTagReq request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddTagMethod(), responseObserver);
    }

    /**
     */
    public void removeTag(app.onepass.apis.UpdateTagReq request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveTagMethod(), responseObserver);
    }

    /**
     */
    public void readTag(app.onepass.apis.UserReq request,
        io.grpc.stub.StreamObserver<app.onepass.apis.ReadTagRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadTagMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateOrganizationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.CreateOrganizationReq,
                app.onepass.apis.Result>(
                  this, METHODID_CREATE_ORGANIZATION)))
          .addMethod(
            getReadOrganizationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UserReq,
                app.onepass.apis.ReadOrganizationRes>(
                  this, METHODID_READ_ORGANIZATION)))
          .addMethod(
            getUpdateOrganizationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UpdateOrganizationReq,
                app.onepass.apis.Result>(
                  this, METHODID_UPDATE_ORGANIZATION)))
          .addMethod(
            getDeleteOrganizationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.DeleteOrganizationReq,
                app.onepass.apis.Result>(
                  this, METHODID_DELETE_ORGANIZATION)))
          .addMethod(
            getAddUsersToOrganizationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UpdateUsersInOrganizationReq,
                app.onepass.apis.Result>(
                  this, METHODID_ADD_USERS_TO_ORGANIZATION)))
          .addMethod(
            getRemoveUsersFromOrganizationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UpdateUsersInOrganizationReq,
                app.onepass.apis.Result>(
                  this, METHODID_REMOVE_USERS_FROM_ORGANIZATION)))
          .addMethod(
            getCreateEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.CreateEventReq,
                app.onepass.apis.Result>(
                  this, METHODID_CREATE_EVENT)))
          .addMethod(
            getReadEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UserReq,
                app.onepass.apis.ReadEventRes>(
                  this, METHODID_READ_EVENT)))
          .addMethod(
            getUpdateEventInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UpdateEventInfoReq,
                app.onepass.apis.Result>(
                  this, METHODID_UPDATE_EVENT_INFO)))
          .addMethod(
            getUpdateEventFacilityMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UpdateEventFacilityReq,
                app.onepass.apis.Result>(
                  this, METHODID_UPDATE_EVENT_FACILITY)))
          .addMethod(
            getUpdateEventDurationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UpdateEventDurationReq,
                app.onepass.apis.Result>(
                  this, METHODID_UPDATE_EVENT_DURATION)))
          .addMethod(
            getDeleteEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.DeleteEventReq,
                app.onepass.apis.Result>(
                  this, METHODID_DELETE_EVENT)))
          .addMethod(
            getUpdateRegistrationRequestMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UpdateRegistrationRequestReq,
                app.onepass.apis.Result>(
                  this, METHODID_UPDATE_REGISTRATION_REQUEST)))
          .addMethod(
            getAddTagMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UpdateTagReq,
                app.onepass.apis.Result>(
                  this, METHODID_ADD_TAG)))
          .addMethod(
            getRemoveTagMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UpdateTagReq,
                app.onepass.apis.Result>(
                  this, METHODID_REMOVE_TAG)))
          .addMethod(
            getReadTagMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UserReq,
                app.onepass.apis.ReadTagRes>(
                  this, METHODID_READ_TAG)))
          .build();
    }
  }

  /**
   */
  public static final class OrganizationServiceStub extends io.grpc.stub.AbstractAsyncStub<OrganizationServiceStub> {
    private OrganizationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrganizationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrganizationServiceStub(channel, callOptions);
    }

    /**
     */
    public void createOrganization(app.onepass.apis.CreateOrganizationReq request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readOrganization(app.onepass.apis.UserReq request,
        io.grpc.stub.StreamObserver<app.onepass.apis.ReadOrganizationRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateOrganization(app.onepass.apis.UpdateOrganizationReq request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteOrganization(app.onepass.apis.DeleteOrganizationReq request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addUsersToOrganization(app.onepass.apis.UpdateUsersInOrganizationReq request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddUsersToOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeUsersFromOrganization(app.onepass.apis.UpdateUsersInOrganizationReq request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveUsersFromOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createEvent(app.onepass.apis.CreateEventReq request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readEvent(app.onepass.apis.UserReq request,
        io.grpc.stub.StreamObserver<app.onepass.apis.ReadEventRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEventInfo(app.onepass.apis.UpdateEventInfoReq request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEventInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEventFacility(app.onepass.apis.UpdateEventFacilityReq request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEventFacilityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEventDuration(app.onepass.apis.UpdateEventDurationReq request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEventDurationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteEvent(app.onepass.apis.DeleteEventReq request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateRegistrationRequest(app.onepass.apis.UpdateRegistrationRequestReq request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRegistrationRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addTag(app.onepass.apis.UpdateTagReq request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddTagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeTag(app.onepass.apis.UpdateTagReq request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveTagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readTag(app.onepass.apis.UserReq request,
        io.grpc.stub.StreamObserver<app.onepass.apis.ReadTagRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadTagMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class OrganizationServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<OrganizationServiceBlockingStub> {
    private OrganizationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrganizationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrganizationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public app.onepass.apis.Result createOrganization(app.onepass.apis.CreateOrganizationReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateOrganizationMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.ReadOrganizationRes readOrganization(app.onepass.apis.UserReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadOrganizationMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Result updateOrganization(app.onepass.apis.UpdateOrganizationReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateOrganizationMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Result deleteOrganization(app.onepass.apis.DeleteOrganizationReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteOrganizationMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Result addUsersToOrganization(app.onepass.apis.UpdateUsersInOrganizationReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddUsersToOrganizationMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Result removeUsersFromOrganization(app.onepass.apis.UpdateUsersInOrganizationReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveUsersFromOrganizationMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Result createEvent(app.onepass.apis.CreateEventReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.ReadEventRes readEvent(app.onepass.apis.UserReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Result updateEventInfo(app.onepass.apis.UpdateEventInfoReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEventInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Result updateEventFacility(app.onepass.apis.UpdateEventFacilityReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEventFacilityMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Result updateEventDuration(app.onepass.apis.UpdateEventDurationReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEventDurationMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Result deleteEvent(app.onepass.apis.DeleteEventReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Result updateRegistrationRequest(app.onepass.apis.UpdateRegistrationRequestReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRegistrationRequestMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Result addTag(app.onepass.apis.UpdateTagReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddTagMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Result removeTag(app.onepass.apis.UpdateTagReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveTagMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.ReadTagRes readTag(app.onepass.apis.UserReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadTagMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class OrganizationServiceFutureStub extends io.grpc.stub.AbstractFutureStub<OrganizationServiceFutureStub> {
    private OrganizationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrganizationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrganizationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Result> createOrganization(
        app.onepass.apis.CreateOrganizationReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateOrganizationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.ReadOrganizationRes> readOrganization(
        app.onepass.apis.UserReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadOrganizationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Result> updateOrganization(
        app.onepass.apis.UpdateOrganizationReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateOrganizationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Result> deleteOrganization(
        app.onepass.apis.DeleteOrganizationReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteOrganizationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Result> addUsersToOrganization(
        app.onepass.apis.UpdateUsersInOrganizationReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddUsersToOrganizationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Result> removeUsersFromOrganization(
        app.onepass.apis.UpdateUsersInOrganizationReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveUsersFromOrganizationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Result> createEvent(
        app.onepass.apis.CreateEventReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.ReadEventRes> readEvent(
        app.onepass.apis.UserReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Result> updateEventInfo(
        app.onepass.apis.UpdateEventInfoReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEventInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Result> updateEventFacility(
        app.onepass.apis.UpdateEventFacilityReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEventFacilityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Result> updateEventDuration(
        app.onepass.apis.UpdateEventDurationReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEventDurationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Result> deleteEvent(
        app.onepass.apis.DeleteEventReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Result> updateRegistrationRequest(
        app.onepass.apis.UpdateRegistrationRequestReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRegistrationRequestMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Result> addTag(
        app.onepass.apis.UpdateTagReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddTagMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Result> removeTag(
        app.onepass.apis.UpdateTagReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveTagMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.ReadTagRes> readTag(
        app.onepass.apis.UserReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadTagMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ORGANIZATION = 0;
  private static final int METHODID_READ_ORGANIZATION = 1;
  private static final int METHODID_UPDATE_ORGANIZATION = 2;
  private static final int METHODID_DELETE_ORGANIZATION = 3;
  private static final int METHODID_ADD_USERS_TO_ORGANIZATION = 4;
  private static final int METHODID_REMOVE_USERS_FROM_ORGANIZATION = 5;
  private static final int METHODID_CREATE_EVENT = 6;
  private static final int METHODID_READ_EVENT = 7;
  private static final int METHODID_UPDATE_EVENT_INFO = 8;
  private static final int METHODID_UPDATE_EVENT_FACILITY = 9;
  private static final int METHODID_UPDATE_EVENT_DURATION = 10;
  private static final int METHODID_DELETE_EVENT = 11;
  private static final int METHODID_UPDATE_REGISTRATION_REQUEST = 12;
  private static final int METHODID_ADD_TAG = 13;
  private static final int METHODID_REMOVE_TAG = 14;
  private static final int METHODID_READ_TAG = 15;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OrganizationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OrganizationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ORGANIZATION:
          serviceImpl.createOrganization((app.onepass.apis.CreateOrganizationReq) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Result>) responseObserver);
          break;
        case METHODID_READ_ORGANIZATION:
          serviceImpl.readOrganization((app.onepass.apis.UserReq) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.ReadOrganizationRes>) responseObserver);
          break;
        case METHODID_UPDATE_ORGANIZATION:
          serviceImpl.updateOrganization((app.onepass.apis.UpdateOrganizationReq) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Result>) responseObserver);
          break;
        case METHODID_DELETE_ORGANIZATION:
          serviceImpl.deleteOrganization((app.onepass.apis.DeleteOrganizationReq) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Result>) responseObserver);
          break;
        case METHODID_ADD_USERS_TO_ORGANIZATION:
          serviceImpl.addUsersToOrganization((app.onepass.apis.UpdateUsersInOrganizationReq) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Result>) responseObserver);
          break;
        case METHODID_REMOVE_USERS_FROM_ORGANIZATION:
          serviceImpl.removeUsersFromOrganization((app.onepass.apis.UpdateUsersInOrganizationReq) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Result>) responseObserver);
          break;
        case METHODID_CREATE_EVENT:
          serviceImpl.createEvent((app.onepass.apis.CreateEventReq) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Result>) responseObserver);
          break;
        case METHODID_READ_EVENT:
          serviceImpl.readEvent((app.onepass.apis.UserReq) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.ReadEventRes>) responseObserver);
          break;
        case METHODID_UPDATE_EVENT_INFO:
          serviceImpl.updateEventInfo((app.onepass.apis.UpdateEventInfoReq) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Result>) responseObserver);
          break;
        case METHODID_UPDATE_EVENT_FACILITY:
          serviceImpl.updateEventFacility((app.onepass.apis.UpdateEventFacilityReq) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Result>) responseObserver);
          break;
        case METHODID_UPDATE_EVENT_DURATION:
          serviceImpl.updateEventDuration((app.onepass.apis.UpdateEventDurationReq) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Result>) responseObserver);
          break;
        case METHODID_DELETE_EVENT:
          serviceImpl.deleteEvent((app.onepass.apis.DeleteEventReq) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Result>) responseObserver);
          break;
        case METHODID_UPDATE_REGISTRATION_REQUEST:
          serviceImpl.updateRegistrationRequest((app.onepass.apis.UpdateRegistrationRequestReq) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Result>) responseObserver);
          break;
        case METHODID_ADD_TAG:
          serviceImpl.addTag((app.onepass.apis.UpdateTagReq) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Result>) responseObserver);
          break;
        case METHODID_REMOVE_TAG:
          serviceImpl.removeTag((app.onepass.apis.UpdateTagReq) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Result>) responseObserver);
          break;
        case METHODID_READ_TAG:
          serviceImpl.readTag((app.onepass.apis.UserReq) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.ReadTagRes>) responseObserver);
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

  private static abstract class OrganizationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OrganizationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return app.onepass.apis.FacilityProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OrganizationService");
    }
  }

  private static final class OrganizationServiceFileDescriptorSupplier
      extends OrganizationServiceBaseDescriptorSupplier {
    OrganizationServiceFileDescriptorSupplier() {}
  }

  private static final class OrganizationServiceMethodDescriptorSupplier
      extends OrganizationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OrganizationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (OrganizationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OrganizationServiceFileDescriptorSupplier())
              .addMethod(getCreateOrganizationMethod())
              .addMethod(getReadOrganizationMethod())
              .addMethod(getUpdateOrganizationMethod())
              .addMethod(getDeleteOrganizationMethod())
              .addMethod(getAddUsersToOrganizationMethod())
              .addMethod(getRemoveUsersFromOrganizationMethod())
              .addMethod(getCreateEventMethod())
              .addMethod(getReadEventMethod())
              .addMethod(getUpdateEventInfoMethod())
              .addMethod(getUpdateEventFacilityMethod())
              .addMethod(getUpdateEventDurationMethod())
              .addMethod(getDeleteEventMethod())
              .addMethod(getUpdateRegistrationRequestMethod())
              .addMethod(getAddTagMethod())
              .addMethod(getRemoveTagMethod())
              .addMethod(getReadTagMethod())
              .build();
        }
      }
    }
    return result;
  }
}
