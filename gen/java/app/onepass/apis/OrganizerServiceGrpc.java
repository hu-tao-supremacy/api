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
      app.onepass.apis.OrganizationListResponse> getGetOrganizationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrganizations",
      requestType = com.google.protobuf.Empty.class,
      responseType = app.onepass.apis.OrganizationListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      app.onepass.apis.OrganizationListResponse> getGetOrganizationsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, app.onepass.apis.OrganizationListResponse> getGetOrganizationsMethod;
    if ((getGetOrganizationsMethod = OrganizerServiceGrpc.getGetOrganizationsMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getGetOrganizationsMethod = OrganizerServiceGrpc.getGetOrganizationsMethod) == null) {
          OrganizerServiceGrpc.getGetOrganizationsMethod = getGetOrganizationsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, app.onepass.apis.OrganizationListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrganizations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.OrganizationListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("GetOrganizations"))
              .build();
        }
      }
    }
    return getGetOrganizationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest,
      app.onepass.apis.Organization> getGetOrganizationByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrganizationById",
      requestType = app.onepass.apis.GetObjectByIdRequest.class,
      responseType = app.onepass.apis.Organization.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest,
      app.onepass.apis.Organization> getGetOrganizationByIdMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest, app.onepass.apis.Organization> getGetOrganizationByIdMethod;
    if ((getGetOrganizationByIdMethod = OrganizerServiceGrpc.getGetOrganizationByIdMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getGetOrganizationByIdMethod = OrganizerServiceGrpc.getGetOrganizationByIdMethod) == null) {
          OrganizerServiceGrpc.getGetOrganizationByIdMethod = getGetOrganizationByIdMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GetObjectByIdRequest, app.onepass.apis.Organization>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrganizationById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetObjectByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Organization.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("GetOrganizationById"))
              .build();
        }
      }
    }
    return getGetOrganizationByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest,
      app.onepass.apis.UserListResponse> getGetUsersInOrganizationByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUsersInOrganizationById",
      requestType = app.onepass.apis.GetObjectByIdRequest.class,
      responseType = app.onepass.apis.UserListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest,
      app.onepass.apis.UserListResponse> getGetUsersInOrganizationByIdMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest, app.onepass.apis.UserListResponse> getGetUsersInOrganizationByIdMethod;
    if ((getGetUsersInOrganizationByIdMethod = OrganizerServiceGrpc.getGetUsersInOrganizationByIdMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getGetUsersInOrganizationByIdMethod = OrganizerServiceGrpc.getGetUsersInOrganizationByIdMethod) == null) {
          OrganizerServiceGrpc.getGetUsersInOrganizationByIdMethod = getGetUsersInOrganizationByIdMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GetObjectByIdRequest, app.onepass.apis.UserListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUsersInOrganizationById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetObjectByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UserListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("GetUsersInOrganizationById"))
              .build();
        }
      }
    }
    return getGetUsersInOrganizationByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UpdateOrganizationRequest,
      app.onepass.apis.Organization> getUpdateOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOrganization",
      requestType = app.onepass.apis.UpdateOrganizationRequest.class,
      responseType = app.onepass.apis.Organization.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UpdateOrganizationRequest,
      app.onepass.apis.Organization> getUpdateOrganizationMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UpdateOrganizationRequest, app.onepass.apis.Organization> getUpdateOrganizationMethod;
    if ((getUpdateOrganizationMethod = OrganizerServiceGrpc.getUpdateOrganizationMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getUpdateOrganizationMethod = OrganizerServiceGrpc.getUpdateOrganizationMethod) == null) {
          OrganizerServiceGrpc.getUpdateOrganizationMethod = getUpdateOrganizationMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UpdateOrganizationRequest, app.onepass.apis.Organization>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UpdateOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Organization.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("UpdateOrganization"))
              .build();
        }
      }
    }
    return getUpdateOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.RemoveOrganizationRequest,
      app.onepass.apis.Organization> getRemoveOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveOrganization",
      requestType = app.onepass.apis.RemoveOrganizationRequest.class,
      responseType = app.onepass.apis.Organization.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.RemoveOrganizationRequest,
      app.onepass.apis.Organization> getRemoveOrganizationMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.RemoveOrganizationRequest, app.onepass.apis.Organization> getRemoveOrganizationMethod;
    if ((getRemoveOrganizationMethod = OrganizerServiceGrpc.getRemoveOrganizationMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getRemoveOrganizationMethod = OrganizerServiceGrpc.getRemoveOrganizationMethod) == null) {
          OrganizerServiceGrpc.getRemoveOrganizationMethod = getRemoveOrganizationMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.RemoveOrganizationRequest, app.onepass.apis.Organization>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.RemoveOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Organization.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("RemoveOrganization"))
              .build();
        }
      }
    }
    return getRemoveOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UpdateUsersInOrganizationRequest,
      app.onepass.apis.UserOrganizationListResponse> getAddUsersToOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddUsersToOrganization",
      requestType = app.onepass.apis.UpdateUsersInOrganizationRequest.class,
      responseType = app.onepass.apis.UserOrganizationListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UpdateUsersInOrganizationRequest,
      app.onepass.apis.UserOrganizationListResponse> getAddUsersToOrganizationMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UpdateUsersInOrganizationRequest, app.onepass.apis.UserOrganizationListResponse> getAddUsersToOrganizationMethod;
    if ((getAddUsersToOrganizationMethod = OrganizerServiceGrpc.getAddUsersToOrganizationMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getAddUsersToOrganizationMethod = OrganizerServiceGrpc.getAddUsersToOrganizationMethod) == null) {
          OrganizerServiceGrpc.getAddUsersToOrganizationMethod = getAddUsersToOrganizationMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UpdateUsersInOrganizationRequest, app.onepass.apis.UserOrganizationListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddUsersToOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UpdateUsersInOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UserOrganizationListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("AddUsersToOrganization"))
              .build();
        }
      }
    }
    return getAddUsersToOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UpdateUsersInOrganizationRequest,
      app.onepass.apis.UserOrganizationListResponse> getRemoveUsersFromOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveUsersFromOrganization",
      requestType = app.onepass.apis.UpdateUsersInOrganizationRequest.class,
      responseType = app.onepass.apis.UserOrganizationListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UpdateUsersInOrganizationRequest,
      app.onepass.apis.UserOrganizationListResponse> getRemoveUsersFromOrganizationMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UpdateUsersInOrganizationRequest, app.onepass.apis.UserOrganizationListResponse> getRemoveUsersFromOrganizationMethod;
    if ((getRemoveUsersFromOrganizationMethod = OrganizerServiceGrpc.getRemoveUsersFromOrganizationMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getRemoveUsersFromOrganizationMethod = OrganizerServiceGrpc.getRemoveUsersFromOrganizationMethod) == null) {
          OrganizerServiceGrpc.getRemoveUsersFromOrganizationMethod = getRemoveUsersFromOrganizationMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UpdateUsersInOrganizationRequest, app.onepass.apis.UserOrganizationListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveUsersFromOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UpdateUsersInOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UserOrganizationListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("RemoveUsersFromOrganization"))
              .build();
        }
      }
    }
    return getRemoveUsersFromOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.CreateEventRequest,
      app.onepass.apis.Event> getCreateEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEvent",
      requestType = app.onepass.apis.CreateEventRequest.class,
      responseType = app.onepass.apis.Event.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.CreateEventRequest,
      app.onepass.apis.Event> getCreateEventMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.CreateEventRequest, app.onepass.apis.Event> getCreateEventMethod;
    if ((getCreateEventMethod = OrganizerServiceGrpc.getCreateEventMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getCreateEventMethod = OrganizerServiceGrpc.getCreateEventMethod) == null) {
          OrganizerServiceGrpc.getCreateEventMethod = getCreateEventMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.CreateEventRequest, app.onepass.apis.Event>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.CreateEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Event.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("CreateEvent"))
              .build();
        }
      }
    }
    return getCreateEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UpdateEventRequest,
      app.onepass.apis.Event> getUpdateEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEvent",
      requestType = app.onepass.apis.UpdateEventRequest.class,
      responseType = app.onepass.apis.Event.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UpdateEventRequest,
      app.onepass.apis.Event> getUpdateEventMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UpdateEventRequest, app.onepass.apis.Event> getUpdateEventMethod;
    if ((getUpdateEventMethod = OrganizerServiceGrpc.getUpdateEventMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getUpdateEventMethod = OrganizerServiceGrpc.getUpdateEventMethod) == null) {
          OrganizerServiceGrpc.getUpdateEventMethod = getUpdateEventMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UpdateEventRequest, app.onepass.apis.Event>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UpdateEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Event.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("UpdateEvent"))
              .build();
        }
      }
    }
    return getUpdateEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UpdateEventDurationsRequest,
      app.onepass.apis.EventDurationListResponse> getUpdateEventDurationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEventDurations",
      requestType = app.onepass.apis.UpdateEventDurationsRequest.class,
      responseType = app.onepass.apis.EventDurationListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UpdateEventDurationsRequest,
      app.onepass.apis.EventDurationListResponse> getUpdateEventDurationsMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UpdateEventDurationsRequest, app.onepass.apis.EventDurationListResponse> getUpdateEventDurationsMethod;
    if ((getUpdateEventDurationsMethod = OrganizerServiceGrpc.getUpdateEventDurationsMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getUpdateEventDurationsMethod = OrganizerServiceGrpc.getUpdateEventDurationsMethod) == null) {
          OrganizerServiceGrpc.getUpdateEventDurationsMethod = getUpdateEventDurationsMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UpdateEventDurationsRequest, app.onepass.apis.EventDurationListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEventDurations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UpdateEventDurationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.EventDurationListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("UpdateEventDurations"))
              .build();
        }
      }
    }
    return getUpdateEventDurationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.RemoveEventRequest,
      app.onepass.apis.Event> getRemoveEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveEvent",
      requestType = app.onepass.apis.RemoveEventRequest.class,
      responseType = app.onepass.apis.Event.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.RemoveEventRequest,
      app.onepass.apis.Event> getRemoveEventMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.RemoveEventRequest, app.onepass.apis.Event> getRemoveEventMethod;
    if ((getRemoveEventMethod = OrganizerServiceGrpc.getRemoveEventMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getRemoveEventMethod = OrganizerServiceGrpc.getRemoveEventMethod) == null) {
          OrganizerServiceGrpc.getRemoveEventMethod = getRemoveEventMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.RemoveEventRequest, app.onepass.apis.Event>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.RemoveEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Event.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("RemoveEvent"))
              .build();
        }
      }
    }
    return getRemoveEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UpdateRegistrationRequestRequest,
      app.onepass.apis.UserEvent> getUpdateRegistrationRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRegistrationRequest",
      requestType = app.onepass.apis.UpdateRegistrationRequestRequest.class,
      responseType = app.onepass.apis.UserEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UpdateRegistrationRequestRequest,
      app.onepass.apis.UserEvent> getUpdateRegistrationRequestMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UpdateRegistrationRequestRequest, app.onepass.apis.UserEvent> getUpdateRegistrationRequestMethod;
    if ((getUpdateRegistrationRequestMethod = OrganizerServiceGrpc.getUpdateRegistrationRequestMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getUpdateRegistrationRequestMethod = OrganizerServiceGrpc.getUpdateRegistrationRequestMethod) == null) {
          OrganizerServiceGrpc.getUpdateRegistrationRequestMethod = getUpdateRegistrationRequestMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UpdateRegistrationRequestRequest, app.onepass.apis.UserEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRegistrationRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UpdateRegistrationRequestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UserEvent.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("UpdateRegistrationRequest"))
              .build();
        }
      }
    }
    return getUpdateRegistrationRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.CreateTagRequest,
      app.onepass.apis.Tag> getCreateTagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTag",
      requestType = app.onepass.apis.CreateTagRequest.class,
      responseType = app.onepass.apis.Tag.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.CreateTagRequest,
      app.onepass.apis.Tag> getCreateTagMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.CreateTagRequest, app.onepass.apis.Tag> getCreateTagMethod;
    if ((getCreateTagMethod = OrganizerServiceGrpc.getCreateTagMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getCreateTagMethod = OrganizerServiceGrpc.getCreateTagMethod) == null) {
          OrganizerServiceGrpc.getCreateTagMethod = getCreateTagMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.CreateTagRequest, app.onepass.apis.Tag>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.CreateTagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Tag.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("CreateTag"))
              .build();
        }
      }
    }
    return getCreateTagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UpdateTagRequest,
      app.onepass.apis.EventTagListResponse> getAddTagsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddTags",
      requestType = app.onepass.apis.UpdateTagRequest.class,
      responseType = app.onepass.apis.EventTagListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UpdateTagRequest,
      app.onepass.apis.EventTagListResponse> getAddTagsMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UpdateTagRequest, app.onepass.apis.EventTagListResponse> getAddTagsMethod;
    if ((getAddTagsMethod = OrganizerServiceGrpc.getAddTagsMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getAddTagsMethod = OrganizerServiceGrpc.getAddTagsMethod) == null) {
          OrganizerServiceGrpc.getAddTagsMethod = getAddTagsMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UpdateTagRequest, app.onepass.apis.EventTagListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddTags"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UpdateTagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.EventTagListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("AddTags"))
              .build();
        }
      }
    }
    return getAddTagsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UpdateTagRequest,
      app.onepass.apis.EventTagListResponse> getRemoveTagsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveTags",
      requestType = app.onepass.apis.UpdateTagRequest.class,
      responseType = app.onepass.apis.EventTagListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UpdateTagRequest,
      app.onepass.apis.EventTagListResponse> getRemoveTagsMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UpdateTagRequest, app.onepass.apis.EventTagListResponse> getRemoveTagsMethod;
    if ((getRemoveTagsMethod = OrganizerServiceGrpc.getRemoveTagsMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getRemoveTagsMethod = OrganizerServiceGrpc.getRemoveTagsMethod) == null) {
          OrganizerServiceGrpc.getRemoveTagsMethod = getRemoveTagsMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UpdateTagRequest, app.onepass.apis.EventTagListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveTags"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UpdateTagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.EventTagListResponse.getDefaultInstance()))
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
      app.onepass.apis.QuestionGroupListResponse> getAddQuestionGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddQuestionGroups",
      requestType = app.onepass.apis.AddQuestionGroupsRequest.class,
      responseType = app.onepass.apis.QuestionGroupListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.AddQuestionGroupsRequest,
      app.onepass.apis.QuestionGroupListResponse> getAddQuestionGroupsMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.AddQuestionGroupsRequest, app.onepass.apis.QuestionGroupListResponse> getAddQuestionGroupsMethod;
    if ((getAddQuestionGroupsMethod = OrganizerServiceGrpc.getAddQuestionGroupsMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getAddQuestionGroupsMethod = OrganizerServiceGrpc.getAddQuestionGroupsMethod) == null) {
          OrganizerServiceGrpc.getAddQuestionGroupsMethod = getAddQuestionGroupsMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.AddQuestionGroupsRequest, app.onepass.apis.QuestionGroupListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddQuestionGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.AddQuestionGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.QuestionGroupListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("AddQuestionGroups"))
              .build();
        }
      }
    }
    return getAddQuestionGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.RemoveQuestionGroupsRequest,
      app.onepass.apis.QuestionGroupListResponse> getRemoveQuestionGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveQuestionGroups",
      requestType = app.onepass.apis.RemoveQuestionGroupsRequest.class,
      responseType = app.onepass.apis.QuestionGroupListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.RemoveQuestionGroupsRequest,
      app.onepass.apis.QuestionGroupListResponse> getRemoveQuestionGroupsMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.RemoveQuestionGroupsRequest, app.onepass.apis.QuestionGroupListResponse> getRemoveQuestionGroupsMethod;
    if ((getRemoveQuestionGroupsMethod = OrganizerServiceGrpc.getRemoveQuestionGroupsMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getRemoveQuestionGroupsMethod = OrganizerServiceGrpc.getRemoveQuestionGroupsMethod) == null) {
          OrganizerServiceGrpc.getRemoveQuestionGroupsMethod = getRemoveQuestionGroupsMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.RemoveQuestionGroupsRequest, app.onepass.apis.QuestionGroupListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveQuestionGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.RemoveQuestionGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.QuestionGroupListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("RemoveQuestionGroups"))
              .build();
        }
      }
    }
    return getRemoveQuestionGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.AddQuestionsRequest,
      app.onepass.apis.QuestionListResponse> getAddQuestionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddQuestions",
      requestType = app.onepass.apis.AddQuestionsRequest.class,
      responseType = app.onepass.apis.QuestionListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.AddQuestionsRequest,
      app.onepass.apis.QuestionListResponse> getAddQuestionsMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.AddQuestionsRequest, app.onepass.apis.QuestionListResponse> getAddQuestionsMethod;
    if ((getAddQuestionsMethod = OrganizerServiceGrpc.getAddQuestionsMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getAddQuestionsMethod = OrganizerServiceGrpc.getAddQuestionsMethod) == null) {
          OrganizerServiceGrpc.getAddQuestionsMethod = getAddQuestionsMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.AddQuestionsRequest, app.onepass.apis.QuestionListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddQuestions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.AddQuestionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.QuestionListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("AddQuestions"))
              .build();
        }
      }
    }
    return getAddQuestionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.RemoveQuestionsRequest,
      app.onepass.apis.QuestionListResponse> getRemoveQuestionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveQuestions",
      requestType = app.onepass.apis.RemoveQuestionsRequest.class,
      responseType = app.onepass.apis.QuestionListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.RemoveQuestionsRequest,
      app.onepass.apis.QuestionListResponse> getRemoveQuestionsMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.RemoveQuestionsRequest, app.onepass.apis.QuestionListResponse> getRemoveQuestionsMethod;
    if ((getRemoveQuestionsMethod = OrganizerServiceGrpc.getRemoveQuestionsMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getRemoveQuestionsMethod = OrganizerServiceGrpc.getRemoveQuestionsMethod) == null) {
          OrganizerServiceGrpc.getRemoveQuestionsMethod = getRemoveQuestionsMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.RemoveQuestionsRequest, app.onepass.apis.QuestionListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveQuestions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.RemoveQuestionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.QuestionListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("RemoveQuestions"))
              .build();
        }
      }
    }
    return getRemoveQuestionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest,
      app.onepass.apis.AnswerListResponse> getGetAnswersByQuestionIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAnswersByQuestionId",
      requestType = app.onepass.apis.GetObjectByIdRequest.class,
      responseType = app.onepass.apis.AnswerListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest,
      app.onepass.apis.AnswerListResponse> getGetAnswersByQuestionIdMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByIdRequest, app.onepass.apis.AnswerListResponse> getGetAnswersByQuestionIdMethod;
    if ((getGetAnswersByQuestionIdMethod = OrganizerServiceGrpc.getGetAnswersByQuestionIdMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getGetAnswersByQuestionIdMethod = OrganizerServiceGrpc.getGetAnswersByQuestionIdMethod) == null) {
          OrganizerServiceGrpc.getGetAnswersByQuestionIdMethod = getGetAnswersByQuestionIdMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GetObjectByIdRequest, app.onepass.apis.AnswerListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAnswersByQuestionId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetObjectByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.AnswerListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("GetAnswersByQuestionId"))
              .build();
        }
      }
    }
    return getGetAnswersByQuestionIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.CreateLocationRequest,
      app.onepass.apis.Location> getCreateLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateLocation",
      requestType = app.onepass.apis.CreateLocationRequest.class,
      responseType = app.onepass.apis.Location.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.CreateLocationRequest,
      app.onepass.apis.Location> getCreateLocationMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.CreateLocationRequest, app.onepass.apis.Location> getCreateLocationMethod;
    if ((getCreateLocationMethod = OrganizerServiceGrpc.getCreateLocationMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getCreateLocationMethod = OrganizerServiceGrpc.getCreateLocationMethod) == null) {
          OrganizerServiceGrpc.getCreateLocationMethod = getCreateLocationMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.CreateLocationRequest, app.onepass.apis.Location>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.CreateLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Location.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("CreateLocation"))
              .build();
        }
      }
    }
    return getCreateLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      app.onepass.apis.LocationListResponse> getGetLocationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLocations",
      requestType = com.google.protobuf.Empty.class,
      responseType = app.onepass.apis.LocationListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      app.onepass.apis.LocationListResponse> getGetLocationsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, app.onepass.apis.LocationListResponse> getGetLocationsMethod;
    if ((getGetLocationsMethod = OrganizerServiceGrpc.getGetLocationsMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getGetLocationsMethod = OrganizerServiceGrpc.getGetLocationsMethod) == null) {
          OrganizerServiceGrpc.getGetLocationsMethod = getGetLocationsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, app.onepass.apis.LocationListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLocations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.LocationListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("GetLocations"))
              .build();
        }
      }
    }
    return getGetLocationsMethod;
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
    if ((getGetLocationByIdMethod = OrganizerServiceGrpc.getGetLocationByIdMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getGetLocationByIdMethod = OrganizerServiceGrpc.getGetLocationByIdMethod) == null) {
          OrganizerServiceGrpc.getGetLocationByIdMethod = getGetLocationByIdMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GetObjectByIdRequest, app.onepass.apis.Location>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLocationById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetObjectByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Location.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("GetLocationById"))
              .build();
        }
      }
    }
    return getGetLocationByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByNameRequest,
      app.onepass.apis.LocationListResponse> getSearchLocationsByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchLocationsByName",
      requestType = app.onepass.apis.GetObjectByNameRequest.class,
      responseType = app.onepass.apis.LocationListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByNameRequest,
      app.onepass.apis.LocationListResponse> getSearchLocationsByNameMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GetObjectByNameRequest, app.onepass.apis.LocationListResponse> getSearchLocationsByNameMethod;
    if ((getSearchLocationsByNameMethod = OrganizerServiceGrpc.getSearchLocationsByNameMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getSearchLocationsByNameMethod = OrganizerServiceGrpc.getSearchLocationsByNameMethod) == null) {
          OrganizerServiceGrpc.getSearchLocationsByNameMethod = getSearchLocationsByNameMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GetObjectByNameRequest, app.onepass.apis.LocationListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchLocationsByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GetObjectByNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.LocationListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("SearchLocationsByName"))
              .build();
        }
      }
    }
    return getSearchLocationsByNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.UpdateLocationRequest,
      app.onepass.apis.Location> getUpdateLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateLocation",
      requestType = app.onepass.apis.UpdateLocationRequest.class,
      responseType = app.onepass.apis.Location.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.UpdateLocationRequest,
      app.onepass.apis.Location> getUpdateLocationMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.UpdateLocationRequest, app.onepass.apis.Location> getUpdateLocationMethod;
    if ((getUpdateLocationMethod = OrganizerServiceGrpc.getUpdateLocationMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getUpdateLocationMethod = OrganizerServiceGrpc.getUpdateLocationMethod) == null) {
          OrganizerServiceGrpc.getUpdateLocationMethod = getUpdateLocationMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.UpdateLocationRequest, app.onepass.apis.Location>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UpdateLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Location.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("UpdateLocation"))
              .build();
        }
      }
    }
    return getUpdateLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.RemoveLocationRequest,
      app.onepass.apis.Location> getRemoveLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveLocation",
      requestType = app.onepass.apis.RemoveLocationRequest.class,
      responseType = app.onepass.apis.Location.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.RemoveLocationRequest,
      app.onepass.apis.Location> getRemoveLocationMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.RemoveLocationRequest, app.onepass.apis.Location> getRemoveLocationMethod;
    if ((getRemoveLocationMethod = OrganizerServiceGrpc.getRemoveLocationMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getRemoveLocationMethod = OrganizerServiceGrpc.getRemoveLocationMethod) == null) {
          OrganizerServiceGrpc.getRemoveLocationMethod = getRemoveLocationMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.RemoveLocationRequest, app.onepass.apis.Location>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.RemoveLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.Location.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("RemoveLocation"))
              .build();
        }
      }
    }
    return getRemoveLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.GenerateTicketRequest,
      app.onepass.apis.UserEvent> getGenerateTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateTicket",
      requestType = app.onepass.apis.GenerateTicketRequest.class,
      responseType = app.onepass.apis.UserEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.GenerateTicketRequest,
      app.onepass.apis.UserEvent> getGenerateTicketMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.GenerateTicketRequest, app.onepass.apis.UserEvent> getGenerateTicketMethod;
    if ((getGenerateTicketMethod = OrganizerServiceGrpc.getGenerateTicketMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getGenerateTicketMethod = OrganizerServiceGrpc.getGenerateTicketMethod) == null) {
          OrganizerServiceGrpc.getGenerateTicketMethod = getGenerateTicketMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.GenerateTicketRequest, app.onepass.apis.UserEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.GenerateTicketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UserEvent.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("GenerateTicket"))
              .build();
        }
      }
    }
    return getGenerateTicketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.onepass.apis.CheckInRequest,
      app.onepass.apis.UserEvent> getCheckInMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckIn",
      requestType = app.onepass.apis.CheckInRequest.class,
      responseType = app.onepass.apis.UserEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.onepass.apis.CheckInRequest,
      app.onepass.apis.UserEvent> getCheckInMethod() {
    io.grpc.MethodDescriptor<app.onepass.apis.CheckInRequest, app.onepass.apis.UserEvent> getCheckInMethod;
    if ((getCheckInMethod = OrganizerServiceGrpc.getCheckInMethod) == null) {
      synchronized (OrganizerServiceGrpc.class) {
        if ((getCheckInMethod = OrganizerServiceGrpc.getCheckInMethod) == null) {
          OrganizerServiceGrpc.getCheckInMethod = getCheckInMethod =
              io.grpc.MethodDescriptor.<app.onepass.apis.CheckInRequest, app.onepass.apis.UserEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckIn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.CheckInRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.onepass.apis.UserEvent.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizerServiceMethodDescriptorSupplier("CheckIn"))
              .build();
        }
      }
    }
    return getCheckInMethod;
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
        io.grpc.stub.StreamObserver<app.onepass.apis.OrganizationListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrganizationsMethod(), responseObserver);
    }

    /**
     */
    public void getOrganizationById(app.onepass.apis.GetObjectByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Organization> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrganizationByIdMethod(), responseObserver);
    }

    /**
     */
    public void getUsersInOrganizationById(app.onepass.apis.GetObjectByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.UserListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUsersInOrganizationByIdMethod(), responseObserver);
    }

    /**
     */
    public void updateOrganization(app.onepass.apis.UpdateOrganizationRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Organization> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateOrganizationMethod(), responseObserver);
    }

    /**
     */
    public void removeOrganization(app.onepass.apis.RemoveOrganizationRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Organization> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveOrganizationMethod(), responseObserver);
    }

    /**
     */
    public void addUsersToOrganization(app.onepass.apis.UpdateUsersInOrganizationRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.UserOrganizationListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddUsersToOrganizationMethod(), responseObserver);
    }

    /**
     */
    public void removeUsersFromOrganization(app.onepass.apis.UpdateUsersInOrganizationRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.UserOrganizationListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveUsersFromOrganizationMethod(), responseObserver);
    }

    /**
     */
    public void createEvent(app.onepass.apis.CreateEventRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Event> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEventMethod(), responseObserver);
    }

    /**
     */
    public void updateEvent(app.onepass.apis.UpdateEventRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Event> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEventMethod(), responseObserver);
    }

    /**
     */
    public void updateEventDurations(app.onepass.apis.UpdateEventDurationsRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventDurationListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEventDurationsMethod(), responseObserver);
    }

    /**
     */
    public void removeEvent(app.onepass.apis.RemoveEventRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Event> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveEventMethod(), responseObserver);
    }

    /**
     */
    public void updateRegistrationRequest(app.onepass.apis.UpdateRegistrationRequestRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.UserEvent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRegistrationRequestMethod(), responseObserver);
    }

    /**
     */
    public void createTag(app.onepass.apis.CreateTagRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Tag> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTagMethod(), responseObserver);
    }

    /**
     */
    public void addTags(app.onepass.apis.UpdateTagRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventTagListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddTagsMethod(), responseObserver);
    }

    /**
     */
    public void removeTags(app.onepass.apis.UpdateTagRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventTagListResponse> responseObserver) {
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
        io.grpc.stub.StreamObserver<app.onepass.apis.QuestionGroupListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddQuestionGroupsMethod(), responseObserver);
    }

    /**
     */
    public void removeQuestionGroups(app.onepass.apis.RemoveQuestionGroupsRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.QuestionGroupListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveQuestionGroupsMethod(), responseObserver);
    }

    /**
     */
    public void addQuestions(app.onepass.apis.AddQuestionsRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.QuestionListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddQuestionsMethod(), responseObserver);
    }

    /**
     */
    public void removeQuestions(app.onepass.apis.RemoveQuestionsRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.QuestionListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveQuestionsMethod(), responseObserver);
    }

    /**
     */
    public void getAnswersByQuestionId(app.onepass.apis.GetObjectByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.AnswerListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnswersByQuestionIdMethod(), responseObserver);
    }

    /**
     */
    public void createLocation(app.onepass.apis.CreateLocationRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Location> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateLocationMethod(), responseObserver);
    }

    /**
     */
    public void getLocations(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<app.onepass.apis.LocationListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLocationsMethod(), responseObserver);
    }

    /**
     */
    public void getLocationById(app.onepass.apis.GetObjectByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Location> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLocationByIdMethod(), responseObserver);
    }

    /**
     */
    public void searchLocationsByName(app.onepass.apis.GetObjectByNameRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.LocationListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchLocationsByNameMethod(), responseObserver);
    }

    /**
     */
    public void updateLocation(app.onepass.apis.UpdateLocationRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Location> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateLocationMethod(), responseObserver);
    }

    /**
     */
    public void removeLocation(app.onepass.apis.RemoveLocationRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Location> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveLocationMethod(), responseObserver);
    }

    /**
     */
    public void generateTicket(app.onepass.apis.GenerateTicketRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.UserEvent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateTicketMethod(), responseObserver);
    }

    /**
     */
    public void checkIn(app.onepass.apis.CheckInRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.UserEvent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckInMethod(), responseObserver);
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
                app.onepass.apis.OrganizationListResponse>(
                  this, METHODID_GET_ORGANIZATIONS)))
          .addMethod(
            getGetOrganizationByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GetObjectByIdRequest,
                app.onepass.apis.Organization>(
                  this, METHODID_GET_ORGANIZATION_BY_ID)))
          .addMethod(
            getGetUsersInOrganizationByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GetObjectByIdRequest,
                app.onepass.apis.UserListResponse>(
                  this, METHODID_GET_USERS_IN_ORGANIZATION_BY_ID)))
          .addMethod(
            getUpdateOrganizationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UpdateOrganizationRequest,
                app.onepass.apis.Organization>(
                  this, METHODID_UPDATE_ORGANIZATION)))
          .addMethod(
            getRemoveOrganizationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.RemoveOrganizationRequest,
                app.onepass.apis.Organization>(
                  this, METHODID_REMOVE_ORGANIZATION)))
          .addMethod(
            getAddUsersToOrganizationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UpdateUsersInOrganizationRequest,
                app.onepass.apis.UserOrganizationListResponse>(
                  this, METHODID_ADD_USERS_TO_ORGANIZATION)))
          .addMethod(
            getRemoveUsersFromOrganizationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UpdateUsersInOrganizationRequest,
                app.onepass.apis.UserOrganizationListResponse>(
                  this, METHODID_REMOVE_USERS_FROM_ORGANIZATION)))
          .addMethod(
            getCreateEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.CreateEventRequest,
                app.onepass.apis.Event>(
                  this, METHODID_CREATE_EVENT)))
          .addMethod(
            getUpdateEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UpdateEventRequest,
                app.onepass.apis.Event>(
                  this, METHODID_UPDATE_EVENT)))
          .addMethod(
            getUpdateEventDurationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UpdateEventDurationsRequest,
                app.onepass.apis.EventDurationListResponse>(
                  this, METHODID_UPDATE_EVENT_DURATIONS)))
          .addMethod(
            getRemoveEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.RemoveEventRequest,
                app.onepass.apis.Event>(
                  this, METHODID_REMOVE_EVENT)))
          .addMethod(
            getUpdateRegistrationRequestMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UpdateRegistrationRequestRequest,
                app.onepass.apis.UserEvent>(
                  this, METHODID_UPDATE_REGISTRATION_REQUEST)))
          .addMethod(
            getCreateTagMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.CreateTagRequest,
                app.onepass.apis.Tag>(
                  this, METHODID_CREATE_TAG)))
          .addMethod(
            getAddTagsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UpdateTagRequest,
                app.onepass.apis.EventTagListResponse>(
                  this, METHODID_ADD_TAGS)))
          .addMethod(
            getRemoveTagsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UpdateTagRequest,
                app.onepass.apis.EventTagListResponse>(
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
                app.onepass.apis.QuestionGroupListResponse>(
                  this, METHODID_ADD_QUESTION_GROUPS)))
          .addMethod(
            getRemoveQuestionGroupsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.RemoveQuestionGroupsRequest,
                app.onepass.apis.QuestionGroupListResponse>(
                  this, METHODID_REMOVE_QUESTION_GROUPS)))
          .addMethod(
            getAddQuestionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.AddQuestionsRequest,
                app.onepass.apis.QuestionListResponse>(
                  this, METHODID_ADD_QUESTIONS)))
          .addMethod(
            getRemoveQuestionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.RemoveQuestionsRequest,
                app.onepass.apis.QuestionListResponse>(
                  this, METHODID_REMOVE_QUESTIONS)))
          .addMethod(
            getGetAnswersByQuestionIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GetObjectByIdRequest,
                app.onepass.apis.AnswerListResponse>(
                  this, METHODID_GET_ANSWERS_BY_QUESTION_ID)))
          .addMethod(
            getCreateLocationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.CreateLocationRequest,
                app.onepass.apis.Location>(
                  this, METHODID_CREATE_LOCATION)))
          .addMethod(
            getGetLocationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                app.onepass.apis.LocationListResponse>(
                  this, METHODID_GET_LOCATIONS)))
          .addMethod(
            getGetLocationByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GetObjectByIdRequest,
                app.onepass.apis.Location>(
                  this, METHODID_GET_LOCATION_BY_ID)))
          .addMethod(
            getSearchLocationsByNameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GetObjectByNameRequest,
                app.onepass.apis.LocationListResponse>(
                  this, METHODID_SEARCH_LOCATIONS_BY_NAME)))
          .addMethod(
            getUpdateLocationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.UpdateLocationRequest,
                app.onepass.apis.Location>(
                  this, METHODID_UPDATE_LOCATION)))
          .addMethod(
            getRemoveLocationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.RemoveLocationRequest,
                app.onepass.apis.Location>(
                  this, METHODID_REMOVE_LOCATION)))
          .addMethod(
            getGenerateTicketMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.GenerateTicketRequest,
                app.onepass.apis.UserEvent>(
                  this, METHODID_GENERATE_TICKET)))
          .addMethod(
            getCheckInMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                app.onepass.apis.CheckInRequest,
                app.onepass.apis.UserEvent>(
                  this, METHODID_CHECK_IN)))
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
        io.grpc.stub.StreamObserver<app.onepass.apis.OrganizationListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrganizationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOrganizationById(app.onepass.apis.GetObjectByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Organization> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrganizationByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUsersInOrganizationById(app.onepass.apis.GetObjectByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.UserListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUsersInOrganizationByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateOrganization(app.onepass.apis.UpdateOrganizationRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Organization> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeOrganization(app.onepass.apis.RemoveOrganizationRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Organization> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addUsersToOrganization(app.onepass.apis.UpdateUsersInOrganizationRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.UserOrganizationListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddUsersToOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeUsersFromOrganization(app.onepass.apis.UpdateUsersInOrganizationRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.UserOrganizationListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveUsersFromOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createEvent(app.onepass.apis.CreateEventRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Event> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEvent(app.onepass.apis.UpdateEventRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Event> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEventDurations(app.onepass.apis.UpdateEventDurationsRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventDurationListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEventDurationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeEvent(app.onepass.apis.RemoveEventRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Event> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateRegistrationRequest(app.onepass.apis.UpdateRegistrationRequestRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.UserEvent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRegistrationRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createTag(app.onepass.apis.CreateTagRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Tag> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addTags(app.onepass.apis.UpdateTagRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventTagListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddTagsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeTags(app.onepass.apis.UpdateTagRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.EventTagListResponse> responseObserver) {
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
        io.grpc.stub.StreamObserver<app.onepass.apis.QuestionGroupListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddQuestionGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeQuestionGroups(app.onepass.apis.RemoveQuestionGroupsRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.QuestionGroupListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveQuestionGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addQuestions(app.onepass.apis.AddQuestionsRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.QuestionListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddQuestionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeQuestions(app.onepass.apis.RemoveQuestionsRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.QuestionListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveQuestionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAnswersByQuestionId(app.onepass.apis.GetObjectByIdRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.AnswerListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnswersByQuestionIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createLocation(app.onepass.apis.CreateLocationRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Location> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLocations(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<app.onepass.apis.LocationListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLocationsMethod(), getCallOptions()), request, responseObserver);
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
    public void searchLocationsByName(app.onepass.apis.GetObjectByNameRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.LocationListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchLocationsByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateLocation(app.onepass.apis.UpdateLocationRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Location> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeLocation(app.onepass.apis.RemoveLocationRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.Location> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void generateTicket(app.onepass.apis.GenerateTicketRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.UserEvent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkIn(app.onepass.apis.CheckInRequest request,
        io.grpc.stub.StreamObserver<app.onepass.apis.UserEvent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckInMethod(), getCallOptions()), request, responseObserver);
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
    public app.onepass.apis.OrganizationListResponse getOrganizations(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrganizationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Organization getOrganizationById(app.onepass.apis.GetObjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrganizationByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.UserListResponse getUsersInOrganizationById(app.onepass.apis.GetObjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUsersInOrganizationByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Organization updateOrganization(app.onepass.apis.UpdateOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateOrganizationMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Organization removeOrganization(app.onepass.apis.RemoveOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveOrganizationMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.UserOrganizationListResponse addUsersToOrganization(app.onepass.apis.UpdateUsersInOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddUsersToOrganizationMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.UserOrganizationListResponse removeUsersFromOrganization(app.onepass.apis.UpdateUsersInOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveUsersFromOrganizationMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Event createEvent(app.onepass.apis.CreateEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Event updateEvent(app.onepass.apis.UpdateEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.EventDurationListResponse updateEventDurations(app.onepass.apis.UpdateEventDurationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEventDurationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Event removeEvent(app.onepass.apis.RemoveEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.UserEvent updateRegistrationRequest(app.onepass.apis.UpdateRegistrationRequestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRegistrationRequestMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Tag createTag(app.onepass.apis.CreateTagRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTagMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.EventTagListResponse addTags(app.onepass.apis.UpdateTagRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddTagsMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.EventTagListResponse removeTags(app.onepass.apis.UpdateTagRequest request) {
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
    public app.onepass.apis.QuestionGroupListResponse addQuestionGroups(app.onepass.apis.AddQuestionGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddQuestionGroupsMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.QuestionGroupListResponse removeQuestionGroups(app.onepass.apis.RemoveQuestionGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveQuestionGroupsMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.QuestionListResponse addQuestions(app.onepass.apis.AddQuestionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddQuestionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.QuestionListResponse removeQuestions(app.onepass.apis.RemoveQuestionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveQuestionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.AnswerListResponse getAnswersByQuestionId(app.onepass.apis.GetObjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnswersByQuestionIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Location createLocation(app.onepass.apis.CreateLocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.LocationListResponse getLocations(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLocationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Location getLocationById(app.onepass.apis.GetObjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLocationByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.LocationListResponse searchLocationsByName(app.onepass.apis.GetObjectByNameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchLocationsByNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Location updateLocation(app.onepass.apis.UpdateLocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.Location removeLocation(app.onepass.apis.RemoveLocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.UserEvent generateTicket(app.onepass.apis.GenerateTicketRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateTicketMethod(), getCallOptions(), request);
    }

    /**
     */
    public app.onepass.apis.UserEvent checkIn(app.onepass.apis.CheckInRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckInMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.OrganizationListResponse> getOrganizations(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrganizationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Organization> getOrganizationById(
        app.onepass.apis.GetObjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrganizationByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.UserListResponse> getUsersInOrganizationById(
        app.onepass.apis.GetObjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUsersInOrganizationByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Organization> updateOrganization(
        app.onepass.apis.UpdateOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateOrganizationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Organization> removeOrganization(
        app.onepass.apis.RemoveOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveOrganizationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.UserOrganizationListResponse> addUsersToOrganization(
        app.onepass.apis.UpdateUsersInOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddUsersToOrganizationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.UserOrganizationListResponse> removeUsersFromOrganization(
        app.onepass.apis.UpdateUsersInOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveUsersFromOrganizationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Event> createEvent(
        app.onepass.apis.CreateEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Event> updateEvent(
        app.onepass.apis.UpdateEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.EventDurationListResponse> updateEventDurations(
        app.onepass.apis.UpdateEventDurationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEventDurationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Event> removeEvent(
        app.onepass.apis.RemoveEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.UserEvent> updateRegistrationRequest(
        app.onepass.apis.UpdateRegistrationRequestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRegistrationRequestMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Tag> createTag(
        app.onepass.apis.CreateTagRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTagMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.EventTagListResponse> addTags(
        app.onepass.apis.UpdateTagRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddTagsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.EventTagListResponse> removeTags(
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
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.QuestionGroupListResponse> addQuestionGroups(
        app.onepass.apis.AddQuestionGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddQuestionGroupsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.QuestionGroupListResponse> removeQuestionGroups(
        app.onepass.apis.RemoveQuestionGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveQuestionGroupsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.QuestionListResponse> addQuestions(
        app.onepass.apis.AddQuestionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddQuestionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.QuestionListResponse> removeQuestions(
        app.onepass.apis.RemoveQuestionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveQuestionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.AnswerListResponse> getAnswersByQuestionId(
        app.onepass.apis.GetObjectByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnswersByQuestionIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Location> createLocation(
        app.onepass.apis.CreateLocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateLocationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.LocationListResponse> getLocations(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLocationsMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.LocationListResponse> searchLocationsByName(
        app.onepass.apis.GetObjectByNameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchLocationsByNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Location> updateLocation(
        app.onepass.apis.UpdateLocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateLocationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.Location> removeLocation(
        app.onepass.apis.RemoveLocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveLocationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.UserEvent> generateTicket(
        app.onepass.apis.GenerateTicketRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateTicketMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.onepass.apis.UserEvent> checkIn(
        app.onepass.apis.CheckInRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckInMethod(), getCallOptions()), request);
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
  private static final int METHODID_GET_USERS_IN_ORGANIZATION_BY_ID = 3;
  private static final int METHODID_UPDATE_ORGANIZATION = 4;
  private static final int METHODID_REMOVE_ORGANIZATION = 5;
  private static final int METHODID_ADD_USERS_TO_ORGANIZATION = 6;
  private static final int METHODID_REMOVE_USERS_FROM_ORGANIZATION = 7;
  private static final int METHODID_CREATE_EVENT = 8;
  private static final int METHODID_UPDATE_EVENT = 9;
  private static final int METHODID_UPDATE_EVENT_DURATIONS = 10;
  private static final int METHODID_REMOVE_EVENT = 11;
  private static final int METHODID_UPDATE_REGISTRATION_REQUEST = 12;
  private static final int METHODID_CREATE_TAG = 13;
  private static final int METHODID_ADD_TAGS = 14;
  private static final int METHODID_REMOVE_TAGS = 15;
  private static final int METHODID_HAS_EVENT = 16;
  private static final int METHODID_ADD_QUESTION_GROUPS = 17;
  private static final int METHODID_REMOVE_QUESTION_GROUPS = 18;
  private static final int METHODID_ADD_QUESTIONS = 19;
  private static final int METHODID_REMOVE_QUESTIONS = 20;
  private static final int METHODID_GET_ANSWERS_BY_QUESTION_ID = 21;
  private static final int METHODID_CREATE_LOCATION = 22;
  private static final int METHODID_GET_LOCATIONS = 23;
  private static final int METHODID_GET_LOCATION_BY_ID = 24;
  private static final int METHODID_SEARCH_LOCATIONS_BY_NAME = 25;
  private static final int METHODID_UPDATE_LOCATION = 26;
  private static final int METHODID_REMOVE_LOCATION = 27;
  private static final int METHODID_GENERATE_TICKET = 28;
  private static final int METHODID_CHECK_IN = 29;
  private static final int METHODID_PING = 30;

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
              (io.grpc.stub.StreamObserver<app.onepass.apis.OrganizationListResponse>) responseObserver);
          break;
        case METHODID_GET_ORGANIZATION_BY_ID:
          serviceImpl.getOrganizationById((app.onepass.apis.GetObjectByIdRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Organization>) responseObserver);
          break;
        case METHODID_GET_USERS_IN_ORGANIZATION_BY_ID:
          serviceImpl.getUsersInOrganizationById((app.onepass.apis.GetObjectByIdRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.UserListResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ORGANIZATION:
          serviceImpl.updateOrganization((app.onepass.apis.UpdateOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Organization>) responseObserver);
          break;
        case METHODID_REMOVE_ORGANIZATION:
          serviceImpl.removeOrganization((app.onepass.apis.RemoveOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Organization>) responseObserver);
          break;
        case METHODID_ADD_USERS_TO_ORGANIZATION:
          serviceImpl.addUsersToOrganization((app.onepass.apis.UpdateUsersInOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.UserOrganizationListResponse>) responseObserver);
          break;
        case METHODID_REMOVE_USERS_FROM_ORGANIZATION:
          serviceImpl.removeUsersFromOrganization((app.onepass.apis.UpdateUsersInOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.UserOrganizationListResponse>) responseObserver);
          break;
        case METHODID_CREATE_EVENT:
          serviceImpl.createEvent((app.onepass.apis.CreateEventRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Event>) responseObserver);
          break;
        case METHODID_UPDATE_EVENT:
          serviceImpl.updateEvent((app.onepass.apis.UpdateEventRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Event>) responseObserver);
          break;
        case METHODID_UPDATE_EVENT_DURATIONS:
          serviceImpl.updateEventDurations((app.onepass.apis.UpdateEventDurationsRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.EventDurationListResponse>) responseObserver);
          break;
        case METHODID_REMOVE_EVENT:
          serviceImpl.removeEvent((app.onepass.apis.RemoveEventRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Event>) responseObserver);
          break;
        case METHODID_UPDATE_REGISTRATION_REQUEST:
          serviceImpl.updateRegistrationRequest((app.onepass.apis.UpdateRegistrationRequestRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.UserEvent>) responseObserver);
          break;
        case METHODID_CREATE_TAG:
          serviceImpl.createTag((app.onepass.apis.CreateTagRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Tag>) responseObserver);
          break;
        case METHODID_ADD_TAGS:
          serviceImpl.addTags((app.onepass.apis.UpdateTagRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.EventTagListResponse>) responseObserver);
          break;
        case METHODID_REMOVE_TAGS:
          serviceImpl.removeTags((app.onepass.apis.UpdateTagRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.EventTagListResponse>) responseObserver);
          break;
        case METHODID_HAS_EVENT:
          serviceImpl.hasEvent((app.onepass.apis.HasEventRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Event>) responseObserver);
          break;
        case METHODID_ADD_QUESTION_GROUPS:
          serviceImpl.addQuestionGroups((app.onepass.apis.AddQuestionGroupsRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.QuestionGroupListResponse>) responseObserver);
          break;
        case METHODID_REMOVE_QUESTION_GROUPS:
          serviceImpl.removeQuestionGroups((app.onepass.apis.RemoveQuestionGroupsRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.QuestionGroupListResponse>) responseObserver);
          break;
        case METHODID_ADD_QUESTIONS:
          serviceImpl.addQuestions((app.onepass.apis.AddQuestionsRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.QuestionListResponse>) responseObserver);
          break;
        case METHODID_REMOVE_QUESTIONS:
          serviceImpl.removeQuestions((app.onepass.apis.RemoveQuestionsRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.QuestionListResponse>) responseObserver);
          break;
        case METHODID_GET_ANSWERS_BY_QUESTION_ID:
          serviceImpl.getAnswersByQuestionId((app.onepass.apis.GetObjectByIdRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.AnswerListResponse>) responseObserver);
          break;
        case METHODID_CREATE_LOCATION:
          serviceImpl.createLocation((app.onepass.apis.CreateLocationRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Location>) responseObserver);
          break;
        case METHODID_GET_LOCATIONS:
          serviceImpl.getLocations((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.LocationListResponse>) responseObserver);
          break;
        case METHODID_GET_LOCATION_BY_ID:
          serviceImpl.getLocationById((app.onepass.apis.GetObjectByIdRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Location>) responseObserver);
          break;
        case METHODID_SEARCH_LOCATIONS_BY_NAME:
          serviceImpl.searchLocationsByName((app.onepass.apis.GetObjectByNameRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.LocationListResponse>) responseObserver);
          break;
        case METHODID_UPDATE_LOCATION:
          serviceImpl.updateLocation((app.onepass.apis.UpdateLocationRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Location>) responseObserver);
          break;
        case METHODID_REMOVE_LOCATION:
          serviceImpl.removeLocation((app.onepass.apis.RemoveLocationRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.Location>) responseObserver);
          break;
        case METHODID_GENERATE_TICKET:
          serviceImpl.generateTicket((app.onepass.apis.GenerateTicketRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.UserEvent>) responseObserver);
          break;
        case METHODID_CHECK_IN:
          serviceImpl.checkIn((app.onepass.apis.CheckInRequest) request,
              (io.grpc.stub.StreamObserver<app.onepass.apis.UserEvent>) responseObserver);
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
              .addMethod(getGetUsersInOrganizationByIdMethod())
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
              .addMethod(getGetAnswersByQuestionIdMethod())
              .addMethod(getCreateLocationMethod())
              .addMethod(getGetLocationsMethod())
              .addMethod(getGetLocationByIdMethod())
              .addMethod(getSearchLocationsByNameMethod())
              .addMethod(getUpdateLocationMethod())
              .addMethod(getRemoveLocationMethod())
              .addMethod(getGenerateTicketMethod())
              .addMethod(getCheckInMethod())
              .addMethod(getPingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
