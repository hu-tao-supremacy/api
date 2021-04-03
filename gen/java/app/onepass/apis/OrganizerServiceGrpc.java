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
      app.onepass.apis.Organization> getCreateOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateOrganization",
      requestType = app.onepass.apis.CreateOrganizationRequest.class,
      responseType = app.onepass.apis.Organization.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.CreateOrganizationRequest,
      app.onepass.apis.Organization> getCreateOrganizationMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.CreateOrganizationRequest, app.onepass.apis.Organization> getCreateOrganizationMethod;
    if ((getCreateOrganizationMethod = OrganizerServiceGrpc.getCreateOrganizationMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getCreateOrganizationMethod = OrganizerServiceGrpc.getCreateOrganizationMethod) == null) {
          OrganizerServiceGrpc.getCreateOrganizationMethod = getCreateOrganizationMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.CreateOrganizationRequest, app.onepass.apis.Organization>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.CreateOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Organization.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("CreateOrganization"))
              .build();
        }
      }
    }
    return getCreateOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      app.onepass.apis.GetOrganizationsResponse> getGetOrganizationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrganizations",
      requestType = com.google.protobuf.Empty.class,
      responseType = app.onepass.apis.GetOrganizationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      app.onepass.apis.GetOrganizationsResponse> getGetOrganizationsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, app.onepass.apis.GetOrganizationsResponse> getGetOrganizationsMethod;
    if ((getGetOrganizationsMethod = OrganizerServiceGrpc.getGetOrganizationsMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getGetOrganizationsMethod = OrganizerServiceGrpc.getGetOrganizationsMethod) == null) {
          OrganizerServiceGrpc.getGetOrganizationsMethod = getGetOrganizationsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, app.onepass.apis.GetOrganizationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrganizations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetOrganizationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("GetOrganizations"))
              .build();
        }
      }
    }
    return getGetOrganizationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest,
      app.onepass.apis.GetOrganizationByIdResponse> getGetOrganizationByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrganizationById",
      requestType = app.onepass.apis.GetObjectByIdRequest.class,
      responseType = app.onepass.apis.GetOrganizationByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest,
      app.onepass.apis.GetOrganizationByIdResponse> getGetOrganizationByIdMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest, app.onepass.apis.GetOrganizationByIdResponse> getGetOrganizationByIdMethod;
    if ((getGetOrganizationByIdMethod = OrganizerServiceGrpc.getGetOrganizationByIdMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getGetOrganizationByIdMethod = OrganizerServiceGrpc.getGetOrganizationByIdMethod) == null) {
          OrganizerServiceGrpc.getGetOrganizationByIdMethod = getGetOrganizationByIdMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GetObjectByIdRequest, app.onepass.apis.GetOrganizationByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrganizationById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetObjectByIdRequest.getDefaultInstance()))
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
      com.google.protobuf.Empty> getUpdateOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOrganization",
      requestType = app.onepass.apis.UpdateOrganizationRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UpdateOrganizationRequest,
      com.google.protobuf.Empty> getUpdateOrganizationMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UpdateOrganizationRequest, com.google.protobuf.Empty> getUpdateOrganizationMethod;
    if ((getUpdateOrganizationMethod = OrganizerServiceGrpc.getUpdateOrganizationMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getUpdateOrganizationMethod = OrganizerServiceGrpc.getUpdateOrganizationMethod) == null) {
          OrganizerServiceGrpc.getUpdateOrganizationMethod = getUpdateOrganizationMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UpdateOrganizationRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UpdateOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("UpdateOrganization"))
              .build();
        }
      }
    }
    return getUpdateOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.RemoveOrganizationRequest,
      com.google.protobuf.Empty> getRemoveOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveOrganization",
      requestType = app.onepass.apis.RemoveOrganizationRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.RemoveOrganizationRequest,
      com.google.protobuf.Empty> getRemoveOrganizationMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.RemoveOrganizationRequest, com.google.protobuf.Empty> getRemoveOrganizationMethod;
    if ((getRemoveOrganizationMethod = OrganizerServiceGrpc.getRemoveOrganizationMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getRemoveOrganizationMethod = OrganizerServiceGrpc.getRemoveOrganizationMethod) == null) {
          OrganizerServiceGrpc.getRemoveOrganizationMethod = getRemoveOrganizationMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.RemoveOrganizationRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.RemoveOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("RemoveOrganization"))
              .build();
        }
      }
    }
    return getRemoveOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UpdateUsersInOrganizationRequest,
      com.google.protobuf.Empty> getAddUsersToOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddUsersToOrganization",
      requestType = app.onepass.apis.UpdateUsersInOrganizationRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UpdateUsersInOrganizationRequest,
      com.google.protobuf.Empty> getAddUsersToOrganizationMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UpdateUsersInOrganizationRequest, com.google.protobuf.Empty> getAddUsersToOrganizationMethod;
    if ((getAddUsersToOrganizationMethod = OrganizerServiceGrpc.getAddUsersToOrganizationMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getAddUsersToOrganizationMethod = OrganizerServiceGrpc.getAddUsersToOrganizationMethod) == null) {
          OrganizerServiceGrpc.getAddUsersToOrganizationMethod = getAddUsersToOrganizationMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UpdateUsersInOrganizationRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddUsersToOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UpdateUsersInOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("AddUsersToOrganization"))
              .build();
        }
      }
    }
    return getAddUsersToOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UpdateUsersInOrganizationRequest,
      com.google.protobuf.Empty> getRemoveUsersFromOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveUsersFromOrganization",
      requestType = app.onepass.apis.UpdateUsersInOrganizationRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UpdateUsersInOrganizationRequest,
      com.google.protobuf.Empty> getRemoveUsersFromOrganizationMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UpdateUsersInOrganizationRequest, com.google.protobuf.Empty> getRemoveUsersFromOrganizationMethod;
    if ((getRemoveUsersFromOrganizationMethod = OrganizerServiceGrpc.getRemoveUsersFromOrganizationMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getRemoveUsersFromOrganizationMethod = OrganizerServiceGrpc.getRemoveUsersFromOrganizationMethod) == null) {
          OrganizerServiceGrpc.getRemoveUsersFromOrganizationMethod = getRemoveUsersFromOrganizationMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UpdateUsersInOrganizationRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveUsersFromOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UpdateUsersInOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("RemoveUsersFromOrganization"))
              .build();
        }
      }
    }
    return getRemoveUsersFromOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.CreateEventRequest,
      com.google.protobuf.Empty> getCreateEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEvent",
      requestType = app.onepass.apis.CreateEventRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.CreateEventRequest,
      com.google.protobuf.Empty> getCreateEventMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.CreateEventRequest, com.google.protobuf.Empty> getCreateEventMethod;
    if ((getCreateEventMethod = OrganizerServiceGrpc.getCreateEventMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getCreateEventMethod = OrganizerServiceGrpc.getCreateEventMethod) == null) {
          OrganizerServiceGrpc.getCreateEventMethod = getCreateEventMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.CreateEventRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.CreateEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("CreateEvent"))
              .build();
        }
      }
    }
    return getCreateEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UpdateEventRequest,
      com.google.protobuf.Empty> getUpdateEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEvent",
      requestType = app.onepass.apis.UpdateEventRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UpdateEventRequest,
      com.google.protobuf.Empty> getUpdateEventMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UpdateEventRequest, com.google.protobuf.Empty> getUpdateEventMethod;
    if ((getUpdateEventMethod = OrganizerServiceGrpc.getUpdateEventMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getUpdateEventMethod = OrganizerServiceGrpc.getUpdateEventMethod) == null) {
          OrganizerServiceGrpc.getUpdateEventMethod = getUpdateEventMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UpdateEventRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UpdateEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("UpdateEvent"))
              .build();
        }
      }
    }
    return getUpdateEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UpdateEventDurationRequest,
      com.google.protobuf.Empty> getUpdateEventDurationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEventDurations",
      requestType = app.onepass.apis.UpdateEventDurationRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UpdateEventDurationRequest,
      com.google.protobuf.Empty> getUpdateEventDurationsMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UpdateEventDurationRequest, com.google.protobuf.Empty> getUpdateEventDurationsMethod;
    if ((getUpdateEventDurationsMethod = OrganizerServiceGrpc.getUpdateEventDurationsMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getUpdateEventDurationsMethod = OrganizerServiceGrpc.getUpdateEventDurationsMethod) == null) {
          OrganizerServiceGrpc.getUpdateEventDurationsMethod = getUpdateEventDurationsMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UpdateEventDurationRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEventDurations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UpdateEventDurationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("UpdateEventDurations"))
              .build();
        }
      }
    }
    return getUpdateEventDurationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.RemoveEventRequest,
      com.google.protobuf.Empty> getRemoveEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveEvent",
      requestType = app.onepass.apis.RemoveEventRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.RemoveEventRequest,
      com.google.protobuf.Empty> getRemoveEventMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.RemoveEventRequest, com.google.protobuf.Empty> getRemoveEventMethod;
    if ((getRemoveEventMethod = OrganizerServiceGrpc.getRemoveEventMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getRemoveEventMethod = OrganizerServiceGrpc.getRemoveEventMethod) == null) {
          OrganizerServiceGrpc.getRemoveEventMethod = getRemoveEventMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.RemoveEventRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.RemoveEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("RemoveEvent"))
              .build();
        }
      }
    }
    return getRemoveEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UpdateRegistrationRequestRequest,
      com.google.protobuf.Empty> getUpdateRegistrationRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRegistrationRequest",
      requestType = app.onepass.apis.UpdateRegistrationRequestRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UpdateRegistrationRequestRequest,
      com.google.protobuf.Empty> getUpdateRegistrationRequestMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UpdateRegistrationRequestRequest, com.google.protobuf.Empty> getUpdateRegistrationRequestMethod;
    if ((getUpdateRegistrationRequestMethod = OrganizerServiceGrpc.getUpdateRegistrationRequestMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getUpdateRegistrationRequestMethod = OrganizerServiceGrpc.getUpdateRegistrationRequestMethod) == null) {
          OrganizerServiceGrpc.getUpdateRegistrationRequestMethod = getUpdateRegistrationRequestMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UpdateRegistrationRequestRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRegistrationRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UpdateRegistrationRequestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("UpdateRegistrationRequest"))
              .build();
        }
      }
    }
    return getUpdateRegistrationRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.CreateTagRequest,
      com.google.protobuf.Empty> getCreateTagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTag",
      requestType = app.onepass.apis.CreateTagRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.CreateTagRequest,
      com.google.protobuf.Empty> getCreateTagMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.CreateTagRequest, com.google.protobuf.Empty> getCreateTagMethod;
    if ((getCreateTagMethod = OrganizerServiceGrpc.getCreateTagMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getCreateTagMethod = OrganizerServiceGrpc.getCreateTagMethod) == null) {
          OrganizerServiceGrpc.getCreateTagMethod = getCreateTagMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.CreateTagRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.CreateTagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("CreateTag"))
              .build();
        }
      }
    }
    return getCreateTagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UpdateTagRequest,
      com.google.protobuf.Empty> getAddTagsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddTags",
      requestType = app.onepass.apis.UpdateTagRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UpdateTagRequest,
      com.google.protobuf.Empty> getAddTagsMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UpdateTagRequest, com.google.protobuf.Empty> getAddTagsMethod;
    if ((getAddTagsMethod = OrganizerServiceGrpc.getAddTagsMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getAddTagsMethod = OrganizerServiceGrpc.getAddTagsMethod) == null) {
          OrganizerServiceGrpc.getAddTagsMethod = getAddTagsMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UpdateTagRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddTags"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UpdateTagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("AddTags"))
              .build();
        }
      }
    }
    return getAddTagsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UpdateTagRequest,
      com.google.protobuf.Empty> getRemoveTagsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveTags",
      requestType = app.onepass.apis.UpdateTagRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UpdateTagRequest,
      com.google.protobuf.Empty> getRemoveTagsMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UpdateTagRequest, com.google.protobuf.Empty> getRemoveTagsMethod;
    if ((getRemoveTagsMethod = OrganizerServiceGrpc.getRemoveTagsMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getRemoveTagsMethod = OrganizerServiceGrpc.getRemoveTagsMethod) == null) {
          OrganizerServiceGrpc.getRemoveTagsMethod = getRemoveTagsMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UpdateTagRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveTags"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UpdateTagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("RemoveTags"))
              .build();
        }
      }
    }
    return getRemoveTagsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.HasEventRequest,
      app.onepass.apis.Event> getHasEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HasEvent",
      requestType = app.onepass.apis.HasEventRequest.class,
      responseType = app.onepass.apis.Event.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.HasEventRequest,
      app.onepass.apis.Event> getHasEventMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.HasEventRequest, app.onepass.apis.Event> getHasEventMethod;
    if ((getHasEventMethod = OrganizerServiceGrpc.getHasEventMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getHasEventMethod = OrganizerServiceGrpc.getHasEventMethod) == null) {
          OrganizerServiceGrpc.getHasEventMethod = getHasEventMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.HasEventRequest, app.onepass.apis.Event>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HasEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.HasEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Event.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("HasEvent"))
              .build();
        }
      }
    }
    return getHasEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.AddQuestionGroupsRequest,
      com.google.protobuf.Empty> getAddQuestionGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddQuestionGroups",
      requestType = app.onepass.apis.AddQuestionGroupsRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.AddQuestionGroupsRequest,
      com.google.protobuf.Empty> getAddQuestionGroupsMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.AddQuestionGroupsRequest, com.google.protobuf.Empty> getAddQuestionGroupsMethod;
    if ((getAddQuestionGroupsMethod = OrganizerServiceGrpc.getAddQuestionGroupsMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getAddQuestionGroupsMethod = OrganizerServiceGrpc.getAddQuestionGroupsMethod) == null) {
          OrganizerServiceGrpc.getAddQuestionGroupsMethod = getAddQuestionGroupsMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.AddQuestionGroupsRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddQuestionGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.AddQuestionGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("AddQuestionGroups"))
              .build();
        }
      }
    }
    return getAddQuestionGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.RemoveQuestionGroupsRequest,
      com.google.protobuf.Empty> getRemoveQuestionGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveQuestionGroups",
      requestType = app.onepass.apis.RemoveQuestionGroupsRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.RemoveQuestionGroupsRequest,
      com.google.protobuf.Empty> getRemoveQuestionGroupsMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.RemoveQuestionGroupsRequest, com.google.protobuf.Empty> getRemoveQuestionGroupsMethod;
    if ((getRemoveQuestionGroupsMethod = OrganizerServiceGrpc.getRemoveQuestionGroupsMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getRemoveQuestionGroupsMethod = OrganizerServiceGrpc.getRemoveQuestionGroupsMethod) == null) {
          OrganizerServiceGrpc.getRemoveQuestionGroupsMethod = getRemoveQuestionGroupsMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.RemoveQuestionGroupsRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveQuestionGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.RemoveQuestionGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("RemoveQuestionGroups"))
              .build();
        }
      }
    }
    return getRemoveQuestionGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.AddQuestionsRequest,
      com.google.protobuf.Empty> getAddQuestionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddQuestions",
      requestType = app.onepass.apis.AddQuestionsRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.AddQuestionsRequest,
      com.google.protobuf.Empty> getAddQuestionsMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.AddQuestionsRequest, com.google.protobuf.Empty> getAddQuestionsMethod;
    if ((getAddQuestionsMethod = OrganizerServiceGrpc.getAddQuestionsMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getAddQuestionsMethod = OrganizerServiceGrpc.getAddQuestionsMethod) == null) {
          OrganizerServiceGrpc.getAddQuestionsMethod = getAddQuestionsMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.AddQuestionsRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddQuestions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.AddQuestionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("AddQuestions"))
              .build();
        }
      }
    }
    return getAddQuestionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.RemoveQuestionsRequest,
      com.google.protobuf.Empty> getRemoveQuestionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveQuestions",
      requestType = app.onepass.apis.RemoveQuestionsRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.RemoveQuestionsRequest,
      com.google.protobuf.Empty> getRemoveQuestionsMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.RemoveQuestionsRequest, com.google.protobuf.Empty> getRemoveQuestionsMethod;
    if ((getRemoveQuestionsMethod = OrganizerServiceGrpc.getRemoveQuestionsMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getRemoveQuestionsMethod = OrganizerServiceGrpc.getRemoveQuestionsMethod) == null) {
          OrganizerServiceGrpc.getRemoveQuestionsMethod = getRemoveQuestionsMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.RemoveQuestionsRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveQuestions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.RemoveQuestionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("RemoveQuestions"))
              .build();
        }
      }
    }
    return getRemoveQuestionsMethod;
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
    if ((getPingMethod = OrganizerServiceGrpc.getPingMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getPingMethod = OrganizerServiceGrpc.getPingMethod) == null) {
          OrganizerServiceGrpc.getPingMethod = getPingMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.BoolValue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.BoolValue.getDefaultInstance()))
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
        io.grpc.stub.StreamObserver<app.onepass.apis.Organization> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateOrganizationMethod(), responseObserver);
    }

    /**
     */
    public void getOrganizations(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GetOrganizationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrganizationsMethod(), responseObserver);
    }

    /**
     */
    public void getOrganizationById(app.onepass.apis.GetObjectByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GetOrganizationByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrganizationByIdMethod(), responseObserver);
    }

    /**
     */
    public void updateOrganization(app.onepass.apis.UpdateOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateOrganizationMethod(), responseObserver);
    }

    /**
     */
    public void removeOrganization(app.onepass.apis.RemoveOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveOrganizationMethod(), responseObserver);
    }

    /**
     */
    public void addUsersToOrganization(app.onepass.apis.UpdateUsersInOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddUsersToOrganizationMethod(), responseObserver);
    }

    /**
     */
    public void removeUsersFromOrganization(app.onepass.apis.UpdateUsersInOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveUsersFromOrganizationMethod(), responseObserver);
    }

    /**
     */
    public void createEvent(app.onepass.apis.CreateEventRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEventMethod(), responseObserver);
    }

    /**
     */
    public void updateEvent(app.onepass.apis.UpdateEventRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEventMethod(), responseObserver);
    }

    /**
     */
    public void updateEventDurations(app.onepass.apis.UpdateEventDurationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEventDurationsMethod(), responseObserver);
    }

    /**
     */
    public void removeEvent(app.onepass.apis.RemoveEventRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveEventMethod(), responseObserver);
    }

    /**
     */
    public void updateRegistrationRequest(app.onepass.apis.UpdateRegistrationRequestRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRegistrationRequestMethod(), responseObserver);
    }

    /**
     */
    public void createTag(app.onepass.apis.CreateTagRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTagMethod(), responseObserver);
    }

    /**
     */
    public void addTags(app.onepass.apis.UpdateTagRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddTagsMethod(), responseObserver);
    }

    /**
     */
    public void removeTags(app.onepass.apis.UpdateTagRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveTagsMethod(), responseObserver);
    }

    /**
     */
    public void hasEvent(app.onepass.apis.HasEventRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Event> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHasEventMethod(), responseObserver);
    }

    /**
     */
    public void addQuestionGroups(app.onepass.apis.AddQuestionGroupsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddQuestionGroupsMethod(), responseObserver);
    }

    /**
     */
    public void removeQuestionGroups(app.onepass.apis.RemoveQuestionGroupsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveQuestionGroupsMethod(), responseObserver);
    }

    /**
     */
    public void addQuestions(app.onepass.apis.AddQuestionsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddQuestionsMethod(), responseObserver);
    }

    /**
     */
    public void removeQuestions(app.onepass.apis.RemoveQuestionsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveQuestionsMethod(), responseObserver);
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
            getCreateOrganizationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.CreateOrganizationRequest,
                app.onepass.apis.Organization>(
                  this, METHODID_CREATE_ORGANIZATION)))
          .addMethod(
            getGetOrganizationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                app.onepass.apis.GetOrganizationsResponse>(
                  this, METHODID_GET_ORGANIZATIONS)))
          .addMethod(
            getGetOrganizationByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GetObjectByIdRequest,
                app.onepass.apis.GetOrganizationByIdResponse>(
                  this, METHODID_GET_ORGANIZATION_BY_ID)))
          .addMethod(
            getUpdateOrganizationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UpdateOrganizationRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_ORGANIZATION)))
          .addMethod(
            getRemoveOrganizationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.RemoveOrganizationRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_REMOVE_ORGANIZATION)))
          .addMethod(
            getAddUsersToOrganizationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UpdateUsersInOrganizationRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_ADD_USERS_TO_ORGANIZATION)))
          .addMethod(
            getRemoveUsersFromOrganizationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UpdateUsersInOrganizationRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_REMOVE_USERS_FROM_ORGANIZATION)))
          .addMethod(
            getCreateEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.CreateEventRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_CREATE_EVENT)))
          .addMethod(
            getUpdateEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UpdateEventRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_EVENT)))
          .addMethod(
            getUpdateEventDurationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UpdateEventDurationRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_EVENT_DURATIONS)))
          .addMethod(
            getRemoveEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.RemoveEventRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_REMOVE_EVENT)))
          .addMethod(
            getUpdateRegistrationRequestMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UpdateRegistrationRequestRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_REGISTRATION_REQUEST)))
          .addMethod(
            getCreateTagMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.CreateTagRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_CREATE_TAG)))
          .addMethod(
            getAddTagsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UpdateTagRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_ADD_TAGS)))
          .addMethod(
            getRemoveTagsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UpdateTagRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_REMOVE_TAGS)))
          .addMethod(
            getHasEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.HasEventRequest,
                app.onepass.apis.Event>(
                  this, METHODID_HAS_EVENT)))
          .addMethod(
            getAddQuestionGroupsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.AddQuestionGroupsRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_ADD_QUESTION_GROUPS)))
          .addMethod(
            getRemoveQuestionGroupsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.RemoveQuestionGroupsRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_REMOVE_QUESTION_GROUPS)))
          .addMethod(
            getAddQuestionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.AddQuestionsRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_ADD_QUESTIONS)))
          .addMethod(
            getRemoveQuestionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.RemoveQuestionsRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_REMOVE_QUESTIONS)))
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
        io.grpc.stub.StreamObserver<app.onepass.apis.Organization> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOrganizations(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GetOrganizationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrganizationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOrganizationById(app.onepass.apis.GetObjectByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.GetOrganizationByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrganizationByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateOrganization(app.onepass.apis.UpdateOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeOrganization(app.onepass.apis.RemoveOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addUsersToOrganization(app.onepass.apis.UpdateUsersInOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddUsersToOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeUsersFromOrganization(app.onepass.apis.UpdateUsersInOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveUsersFromOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createEvent(app.onepass.apis.CreateEventRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEvent(app.onepass.apis.UpdateEventRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEventDurations(app.onepass.apis.UpdateEventDurationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEventDurationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeEvent(app.onepass.apis.RemoveEventRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateRegistrationRequest(app.onepass.apis.UpdateRegistrationRequestRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRegistrationRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createTag(app.onepass.apis.CreateTagRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addTags(app.onepass.apis.UpdateTagRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddTagsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeTags(app.onepass.apis.UpdateTagRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveTagsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void hasEvent(app.onepass.apis.HasEventRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Event> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHasEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addQuestionGroups(app.onepass.apis.AddQuestionGroupsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddQuestionGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeQuestionGroups(app.onepass.apis.RemoveQuestionGroupsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveQuestionGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addQuestions(app.onepass.apis.AddQuestionsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddQuestionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeQuestions(app.onepass.apis.RemoveQuestionsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveQuestionsMethod(), getCallOptions()), request, responseObserver);
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
    public app.onepass.apis.Organization createOrganization(app.onepass.apis.CreateOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateOrganizationMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.GetOrganizationsResponse getOrganizations(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrganizationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.GetOrganizationByIdResponse getOrganizationById(app.onepass.apis.GetObjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrganizationByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty updateOrganization(app.onepass.apis.UpdateOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateOrganizationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty removeOrganization(app.onepass.apis.RemoveOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveOrganizationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty addUsersToOrganization(app.onepass.apis.UpdateUsersInOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddUsersToOrganizationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty removeUsersFromOrganization(app.onepass.apis.UpdateUsersInOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveUsersFromOrganizationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty createEvent(app.onepass.apis.CreateEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty updateEvent(app.onepass.apis.UpdateEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty updateEventDurations(app.onepass.apis.UpdateEventDurationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEventDurationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty removeEvent(app.onepass.apis.RemoveEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty updateRegistrationRequest(app.onepass.apis.UpdateRegistrationRequestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRegistrationRequestMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty createTag(app.onepass.apis.CreateTagRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTagMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty addTags(app.onepass.apis.UpdateTagRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddTagsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty removeTags(app.onepass.apis.UpdateTagRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveTagsMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Event hasEvent(app.onepass.apis.HasEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHasEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty addQuestionGroups(app.onepass.apis.AddQuestionGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddQuestionGroupsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty removeQuestionGroups(app.onepass.apis.RemoveQuestionGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveQuestionGroupsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty addQuestions(app.onepass.apis.AddQuestionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddQuestionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty removeQuestions(app.onepass.apis.RemoveQuestionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveQuestionsMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Organization> createOrganization(
        app.onepass.apis.CreateOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateOrganizationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.GetOrganizationsResponse> getOrganizations(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrganizationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.GetOrganizationByIdResponse> getOrganizationById(
        app.onepass.apis.GetObjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrganizationByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateOrganization(
        app.onepass.apis.UpdateOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateOrganizationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> removeOrganization(
        app.onepass.apis.RemoveOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveOrganizationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> addUsersToOrganization(
        app.onepass.apis.UpdateUsersInOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddUsersToOrganizationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> removeUsersFromOrganization(
        app.onepass.apis.UpdateUsersInOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveUsersFromOrganizationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> createEvent(
        app.onepass.apis.CreateEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateEvent(
        app.onepass.apis.UpdateEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateEventDurations(
        app.onepass.apis.UpdateEventDurationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEventDurationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> removeEvent(
        app.onepass.apis.RemoveEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateRegistrationRequest(
        app.onepass.apis.UpdateRegistrationRequestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRegistrationRequestMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> createTag(
        app.onepass.apis.CreateTagRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTagMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> addTags(
        app.onepass.apis.UpdateTagRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddTagsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> removeTags(
        app.onepass.apis.UpdateTagRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveTagsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Event> hasEvent(
        app.onepass.apis.HasEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHasEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> addQuestionGroups(
        app.onepass.apis.AddQuestionGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddQuestionGroupsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> removeQuestionGroups(
        app.onepass.apis.RemoveQuestionGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveQuestionGroupsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> addQuestions(
        app.onepass.apis.AddQuestionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddQuestionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> removeQuestions(
        app.onepass.apis.RemoveQuestionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveQuestionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.BoolValue> ping(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ORGANIZATION = 0;
  private static final int METHODID_GET_ORGANIZATIONS = 1;
  private static final int METHODID_GET_ORGANIZATION_BY_ID = 2;
  private static final int METHODID_UPDATE_ORGANIZATION = 3;
  private static final int METHODID_REMOVE_ORGANIZATION = 4;
  private static final int METHODID_ADD_USERS_TO_ORGANIZATION = 5;
  private static final int METHODID_REMOVE_USERS_FROM_ORGANIZATION = 6;
  private static final int METHODID_CREATE_EVENT = 7;
  private static final int METHODID_UPDATE_EVENT = 8;
  private static final int METHODID_UPDATE_EVENT_DURATIONS = 9;
  private static final int METHODID_REMOVE_EVENT = 10;
  private static final int METHODID_UPDATE_REGISTRATION_REQUEST = 11;
  private static final int METHODID_CREATE_TAG = 12;
  private static final int METHODID_ADD_TAGS = 13;
  private static final int METHODID_REMOVE_TAGS = 14;
  private static final int METHODID_HAS_EVENT = 15;
  private static final int METHODID_ADD_QUESTION_GROUPS = 16;
  private static final int METHODID_REMOVE_QUESTION_GROUPS = 17;
  private static final int METHODID_ADD_QUESTIONS = 18;
  private static final int METHODID_REMOVE_QUESTIONS = 19;
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
              (io.grpc.stub.StreamObserver<app.onepass.apis.Organization>) responseObserver);
          break;
        case METHODID_GET_ORGANIZATIONS:
          serviceImpl.getOrganizations((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.GetOrganizationsResponse>) responseObserver);
          break;
        case METHODID_GET_ORGANIZATION_BY_ID:
          serviceImpl.getOrganizationById((app.onepass.apis.GetObjectByIdRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.GetOrganizationByIdResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ORGANIZATION:
          serviceImpl.updateOrganization((app.onepass.apis.UpdateOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_REMOVE_ORGANIZATION:
          serviceImpl.removeOrganization((app.onepass.apis.RemoveOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_ADD_USERS_TO_ORGANIZATION:
          serviceImpl.addUsersToOrganization((app.onepass.apis.UpdateUsersInOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_REMOVE_USERS_FROM_ORGANIZATION:
          serviceImpl.removeUsersFromOrganization((app.onepass.apis.UpdateUsersInOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_EVENT:
          serviceImpl.createEvent((app.onepass.apis.CreateEventRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_EVENT:
          serviceImpl.updateEvent((app.onepass.apis.UpdateEventRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_EVENT_DURATIONS:
          serviceImpl.updateEventDurations((app.onepass.apis.UpdateEventDurationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_REMOVE_EVENT:
          serviceImpl.removeEvent((app.onepass.apis.RemoveEventRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_REGISTRATION_REQUEST:
          serviceImpl.updateRegistrationRequest((app.onepass.apis.UpdateRegistrationRequestRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_TAG:
          serviceImpl.createTag((app.onepass.apis.CreateTagRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_ADD_TAGS:
          serviceImpl.addTags((app.onepass.apis.UpdateTagRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_REMOVE_TAGS:
          serviceImpl.removeTags((app.onepass.apis.UpdateTagRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_HAS_EVENT:
          serviceImpl.hasEvent((app.onepass.apis.HasEventRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Event>) responseObserver);
          break;
        case METHODID_ADD_QUESTION_GROUPS:
          serviceImpl.addQuestionGroups((app.onepass.apis.AddQuestionGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_REMOVE_QUESTION_GROUPS:
          serviceImpl.removeQuestionGroups((app.onepass.apis.RemoveQuestionGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_ADD_QUESTIONS:
          serviceImpl.addQuestions((app.onepass.apis.AddQuestionsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_REMOVE_QUESTIONS:
          serviceImpl.removeQuestions((app.onepass.apis.RemoveQuestionsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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
              .addMethod(getGetOrganizationsMethod())
              .addMethod(getGetOrganizationByIdMethod())
              .addMethod(getUpdateOrganizationMethod())
              .addMethod(getRemoveOrganizationMethod())
              .addMethod(getAddUsersToOrganizationMethod())
              .addMethod(getRemoveUsersFromOrganizationMethod())
              .addMethod(getCreateEventMethod())
              .addMethod(getUpdateEventMethod())
              .addMethod(getUpdateEventDurationsMethod())
              .addMethod(getRemoveEventMethod())
              .addMethod(getUpdateRegistrationRequestMethod())
              .addMethod(getCreateTagMethod())
              .addMethod(getAddTagsMethod())
              .addMethod(getRemoveTagsMethod())
              .addMethod(getHasEventMethod())
              .addMethod(getAddQuestionGroupsMethod())
              .addMethod(getRemoveQuestionGroupsMethod())
              .addMethod(getAddQuestionsMethod())
              .addMethod(getRemoveQuestionsMethod())
              .addMethod(getPingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
