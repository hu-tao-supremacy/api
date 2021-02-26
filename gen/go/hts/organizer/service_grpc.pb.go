// Code generated by protoc-gen-go-grpc. DO NOT EDIT.

package organizer

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
	emptypb "google.golang.org/protobuf/types/known/emptypb"
	common "onepass.app/facility/hts/common"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

// OrganizationServiceClient is the client API for OrganizationService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type OrganizationServiceClient interface {
	CreateOrganization(ctx context.Context, in *CreateOrganizationRequest, opts ...grpc.CallOption) (*common.Result, error)
	ReadOrganization(ctx context.Context, in *UserRequest, opts ...grpc.CallOption) (*ReadOrganizationResult, error)
	ReadOrganizationById(ctx context.Context, in *ReadByIdRequest, opts ...grpc.CallOption) (*ReadOrganizationByIdResult, error)
	UpdateOrganization(ctx context.Context, in *UpdateOrganizationRequest, opts ...grpc.CallOption) (*common.Result, error)
	DeleteOrganization(ctx context.Context, in *DeleteOrganizationRequest, opts ...grpc.CallOption) (*common.Result, error)
	AddUsersToOrganization(ctx context.Context, in *UpdateUsersInOrganizationRequest, opts ...grpc.CallOption) (*common.Result, error)
	RemoveUsersFromOrganization(ctx context.Context, in *UpdateUsersInOrganizationRequest, opts ...grpc.CallOption) (*common.Result, error)
	CreateEvent(ctx context.Context, in *CreateEventRequest, opts ...grpc.CallOption) (*common.Result, error)
	ReadEvent(ctx context.Context, in *UserRequest, opts ...grpc.CallOption) (*ReadEventResult, error)
	ReadEventById(ctx context.Context, in *ReadByIdRequest, opts ...grpc.CallOption) (*ReadEventByIdResult, error)
	UpdateEventInfo(ctx context.Context, in *UpdateEventInfoRequest, opts ...grpc.CallOption) (*common.Result, error)
	UpdateEventFacility(ctx context.Context, in *UpdateEventFacilityRequest, opts ...grpc.CallOption) (*common.Result, error)
	UpdateEventDuration(ctx context.Context, in *UpdateEventDurationRequest, opts ...grpc.CallOption) (*common.Result, error)
	DeleteEvent(ctx context.Context, in *DeleteEventRequest, opts ...grpc.CallOption) (*common.Result, error)
	UpdateRegistrationRequest(ctx context.Context, in *UpdateRegistrationRequestRequest, opts ...grpc.CallOption) (*common.Result, error)
	AddTag(ctx context.Context, in *UpdateTagRequest, opts ...grpc.CallOption) (*common.Result, error)
	RemoveTag(ctx context.Context, in *UpdateTagRequest, opts ...grpc.CallOption) (*common.Result, error)
	ReadTag(ctx context.Context, in *UserRequest, opts ...grpc.CallOption) (*ReadTagResult, error)
	ReadTagById(ctx context.Context, in *ReadByIdRequest, opts ...grpc.CallOption) (*ReadTagByIdResult, error)
	HasEvent(ctx context.Context, in *HasEventRequest, opts ...grpc.CallOption) (*common.Result, error)
	Ping(ctx context.Context, in *emptypb.Empty, opts ...grpc.CallOption) (*common.Result, error)
}

type organizationServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewOrganizationServiceClient(cc grpc.ClientConnInterface) OrganizationServiceClient {
	return &organizationServiceClient{cc}
}

func (c *organizationServiceClient) CreateOrganization(ctx context.Context, in *CreateOrganizationRequest, opts ...grpc.CallOption) (*common.Result, error) {
	out := new(common.Result)
	err := c.cc.Invoke(ctx, "/hts.organizer.OrganizationService/CreateOrganization", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *organizationServiceClient) ReadOrganization(ctx context.Context, in *UserRequest, opts ...grpc.CallOption) (*ReadOrganizationResult, error) {
	out := new(ReadOrganizationResult)
	err := c.cc.Invoke(ctx, "/hts.organizer.OrganizationService/ReadOrganization", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *organizationServiceClient) ReadOrganizationById(ctx context.Context, in *ReadByIdRequest, opts ...grpc.CallOption) (*ReadOrganizationByIdResult, error) {
	out := new(ReadOrganizationByIdResult)
	err := c.cc.Invoke(ctx, "/hts.organizer.OrganizationService/ReadOrganizationById", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *organizationServiceClient) UpdateOrganization(ctx context.Context, in *UpdateOrganizationRequest, opts ...grpc.CallOption) (*common.Result, error) {
	out := new(common.Result)
	err := c.cc.Invoke(ctx, "/hts.organizer.OrganizationService/UpdateOrganization", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *organizationServiceClient) DeleteOrganization(ctx context.Context, in *DeleteOrganizationRequest, opts ...grpc.CallOption) (*common.Result, error) {
	out := new(common.Result)
	err := c.cc.Invoke(ctx, "/hts.organizer.OrganizationService/DeleteOrganization", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *organizationServiceClient) AddUsersToOrganization(ctx context.Context, in *UpdateUsersInOrganizationRequest, opts ...grpc.CallOption) (*common.Result, error) {
	out := new(common.Result)
	err := c.cc.Invoke(ctx, "/hts.organizer.OrganizationService/AddUsersToOrganization", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *organizationServiceClient) RemoveUsersFromOrganization(ctx context.Context, in *UpdateUsersInOrganizationRequest, opts ...grpc.CallOption) (*common.Result, error) {
	out := new(common.Result)
	err := c.cc.Invoke(ctx, "/hts.organizer.OrganizationService/RemoveUsersFromOrganization", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *organizationServiceClient) CreateEvent(ctx context.Context, in *CreateEventRequest, opts ...grpc.CallOption) (*common.Result, error) {
	out := new(common.Result)
	err := c.cc.Invoke(ctx, "/hts.organizer.OrganizationService/CreateEvent", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *organizationServiceClient) ReadEvent(ctx context.Context, in *UserRequest, opts ...grpc.CallOption) (*ReadEventResult, error) {
	out := new(ReadEventResult)
	err := c.cc.Invoke(ctx, "/hts.organizer.OrganizationService/ReadEvent", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *organizationServiceClient) ReadEventById(ctx context.Context, in *ReadByIdRequest, opts ...grpc.CallOption) (*ReadEventByIdResult, error) {
	out := new(ReadEventByIdResult)
	err := c.cc.Invoke(ctx, "/hts.organizer.OrganizationService/ReadEventById", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *organizationServiceClient) UpdateEventInfo(ctx context.Context, in *UpdateEventInfoRequest, opts ...grpc.CallOption) (*common.Result, error) {
	out := new(common.Result)
	err := c.cc.Invoke(ctx, "/hts.organizer.OrganizationService/UpdateEventInfo", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *organizationServiceClient) UpdateEventFacility(ctx context.Context, in *UpdateEventFacilityRequest, opts ...grpc.CallOption) (*common.Result, error) {
	out := new(common.Result)
	err := c.cc.Invoke(ctx, "/hts.organizer.OrganizationService/UpdateEventFacility", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *organizationServiceClient) UpdateEventDuration(ctx context.Context, in *UpdateEventDurationRequest, opts ...grpc.CallOption) (*common.Result, error) {
	out := new(common.Result)
	err := c.cc.Invoke(ctx, "/hts.organizer.OrganizationService/UpdateEventDuration", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *organizationServiceClient) DeleteEvent(ctx context.Context, in *DeleteEventRequest, opts ...grpc.CallOption) (*common.Result, error) {
	out := new(common.Result)
	err := c.cc.Invoke(ctx, "/hts.organizer.OrganizationService/DeleteEvent", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *organizationServiceClient) UpdateRegistrationRequest(ctx context.Context, in *UpdateRegistrationRequestRequest, opts ...grpc.CallOption) (*common.Result, error) {
	out := new(common.Result)
	err := c.cc.Invoke(ctx, "/hts.organizer.OrganizationService/UpdateRegistrationRequest", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *organizationServiceClient) AddTag(ctx context.Context, in *UpdateTagRequest, opts ...grpc.CallOption) (*common.Result, error) {
	out := new(common.Result)
	err := c.cc.Invoke(ctx, "/hts.organizer.OrganizationService/AddTag", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *organizationServiceClient) RemoveTag(ctx context.Context, in *UpdateTagRequest, opts ...grpc.CallOption) (*common.Result, error) {
	out := new(common.Result)
	err := c.cc.Invoke(ctx, "/hts.organizer.OrganizationService/RemoveTag", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *organizationServiceClient) ReadTag(ctx context.Context, in *UserRequest, opts ...grpc.CallOption) (*ReadTagResult, error) {
	out := new(ReadTagResult)
	err := c.cc.Invoke(ctx, "/hts.organizer.OrganizationService/ReadTag", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *organizationServiceClient) ReadTagById(ctx context.Context, in *ReadByIdRequest, opts ...grpc.CallOption) (*ReadTagByIdResult, error) {
	out := new(ReadTagByIdResult)
	err := c.cc.Invoke(ctx, "/hts.organizer.OrganizationService/ReadTagById", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *organizationServiceClient) HasEvent(ctx context.Context, in *HasEventRequest, opts ...grpc.CallOption) (*common.Result, error) {
	out := new(common.Result)
	err := c.cc.Invoke(ctx, "/hts.organizer.OrganizationService/HasEvent", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *organizationServiceClient) Ping(ctx context.Context, in *emptypb.Empty, opts ...grpc.CallOption) (*common.Result, error) {
	out := new(common.Result)
	err := c.cc.Invoke(ctx, "/hts.organizer.OrganizationService/Ping", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// OrganizationServiceServer is the server API for OrganizationService service.
// All implementations should embed UnimplementedOrganizationServiceServer
// for forward compatibility
type OrganizationServiceServer interface {
	CreateOrganization(context.Context, *CreateOrganizationRequest) (*common.Result, error)
	ReadOrganization(context.Context, *UserRequest) (*ReadOrganizationResult, error)
	ReadOrganizationById(context.Context, *ReadByIdRequest) (*ReadOrganizationByIdResult, error)
	UpdateOrganization(context.Context, *UpdateOrganizationRequest) (*common.Result, error)
	DeleteOrganization(context.Context, *DeleteOrganizationRequest) (*common.Result, error)
	AddUsersToOrganization(context.Context, *UpdateUsersInOrganizationRequest) (*common.Result, error)
	RemoveUsersFromOrganization(context.Context, *UpdateUsersInOrganizationRequest) (*common.Result, error)
	CreateEvent(context.Context, *CreateEventRequest) (*common.Result, error)
	ReadEvent(context.Context, *UserRequest) (*ReadEventResult, error)
	ReadEventById(context.Context, *ReadByIdRequest) (*ReadEventByIdResult, error)
	UpdateEventInfo(context.Context, *UpdateEventInfoRequest) (*common.Result, error)
	UpdateEventFacility(context.Context, *UpdateEventFacilityRequest) (*common.Result, error)
	UpdateEventDuration(context.Context, *UpdateEventDurationRequest) (*common.Result, error)
	DeleteEvent(context.Context, *DeleteEventRequest) (*common.Result, error)
	UpdateRegistrationRequest(context.Context, *UpdateRegistrationRequestRequest) (*common.Result, error)
	AddTag(context.Context, *UpdateTagRequest) (*common.Result, error)
	RemoveTag(context.Context, *UpdateTagRequest) (*common.Result, error)
	ReadTag(context.Context, *UserRequest) (*ReadTagResult, error)
	ReadTagById(context.Context, *ReadByIdRequest) (*ReadTagByIdResult, error)
	HasEvent(context.Context, *HasEventRequest) (*common.Result, error)
	Ping(context.Context, *emptypb.Empty) (*common.Result, error)
}

// UnimplementedOrganizationServiceServer should be embedded to have forward compatible implementations.
type UnimplementedOrganizationServiceServer struct {
}

func (UnimplementedOrganizationServiceServer) CreateOrganization(context.Context, *CreateOrganizationRequest) (*common.Result, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateOrganization not implemented")
}
func (UnimplementedOrganizationServiceServer) ReadOrganization(context.Context, *UserRequest) (*ReadOrganizationResult, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ReadOrganization not implemented")
}
func (UnimplementedOrganizationServiceServer) ReadOrganizationById(context.Context, *ReadByIdRequest) (*ReadOrganizationByIdResult, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ReadOrganizationById not implemented")
}
func (UnimplementedOrganizationServiceServer) UpdateOrganization(context.Context, *UpdateOrganizationRequest) (*common.Result, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateOrganization not implemented")
}
func (UnimplementedOrganizationServiceServer) DeleteOrganization(context.Context, *DeleteOrganizationRequest) (*common.Result, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeleteOrganization not implemented")
}
func (UnimplementedOrganizationServiceServer) AddUsersToOrganization(context.Context, *UpdateUsersInOrganizationRequest) (*common.Result, error) {
	return nil, status.Errorf(codes.Unimplemented, "method AddUsersToOrganization not implemented")
}
func (UnimplementedOrganizationServiceServer) RemoveUsersFromOrganization(context.Context, *UpdateUsersInOrganizationRequest) (*common.Result, error) {
	return nil, status.Errorf(codes.Unimplemented, "method RemoveUsersFromOrganization not implemented")
}
func (UnimplementedOrganizationServiceServer) CreateEvent(context.Context, *CreateEventRequest) (*common.Result, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateEvent not implemented")
}
func (UnimplementedOrganizationServiceServer) ReadEvent(context.Context, *UserRequest) (*ReadEventResult, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ReadEvent not implemented")
}
func (UnimplementedOrganizationServiceServer) ReadEventById(context.Context, *ReadByIdRequest) (*ReadEventByIdResult, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ReadEventById not implemented")
}
func (UnimplementedOrganizationServiceServer) UpdateEventInfo(context.Context, *UpdateEventInfoRequest) (*common.Result, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateEventInfo not implemented")
}
func (UnimplementedOrganizationServiceServer) UpdateEventFacility(context.Context, *UpdateEventFacilityRequest) (*common.Result, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateEventFacility not implemented")
}
func (UnimplementedOrganizationServiceServer) UpdateEventDuration(context.Context, *UpdateEventDurationRequest) (*common.Result, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateEventDuration not implemented")
}
func (UnimplementedOrganizationServiceServer) DeleteEvent(context.Context, *DeleteEventRequest) (*common.Result, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeleteEvent not implemented")
}
func (UnimplementedOrganizationServiceServer) UpdateRegistrationRequest(context.Context, *UpdateRegistrationRequestRequest) (*common.Result, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateRegistrationRequest not implemented")
}
func (UnimplementedOrganizationServiceServer) AddTag(context.Context, *UpdateTagRequest) (*common.Result, error) {
	return nil, status.Errorf(codes.Unimplemented, "method AddTag not implemented")
}
func (UnimplementedOrganizationServiceServer) RemoveTag(context.Context, *UpdateTagRequest) (*common.Result, error) {
	return nil, status.Errorf(codes.Unimplemented, "method RemoveTag not implemented")
}
func (UnimplementedOrganizationServiceServer) ReadTag(context.Context, *UserRequest) (*ReadTagResult, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ReadTag not implemented")
}
func (UnimplementedOrganizationServiceServer) ReadTagById(context.Context, *ReadByIdRequest) (*ReadTagByIdResult, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ReadTagById not implemented")
}
func (UnimplementedOrganizationServiceServer) HasEvent(context.Context, *HasEventRequest) (*common.Result, error) {
	return nil, status.Errorf(codes.Unimplemented, "method HasEvent not implemented")
}
func (UnimplementedOrganizationServiceServer) Ping(context.Context, *emptypb.Empty) (*common.Result, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Ping not implemented")
}

// UnsafeOrganizationServiceServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to OrganizationServiceServer will
// result in compilation errors.
type UnsafeOrganizationServiceServer interface {
	mustEmbedUnimplementedOrganizationServiceServer()
}

func RegisterOrganizationServiceServer(s grpc.ServiceRegistrar, srv OrganizationServiceServer) {
	s.RegisterService(&OrganizationService_ServiceDesc, srv)
}

func _OrganizationService_CreateOrganization_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateOrganizationRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrganizationServiceServer).CreateOrganization(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.organizer.OrganizationService/CreateOrganization",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrganizationServiceServer).CreateOrganization(ctx, req.(*CreateOrganizationRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _OrganizationService_ReadOrganization_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UserRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrganizationServiceServer).ReadOrganization(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.organizer.OrganizationService/ReadOrganization",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrganizationServiceServer).ReadOrganization(ctx, req.(*UserRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _OrganizationService_ReadOrganizationById_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ReadByIdRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrganizationServiceServer).ReadOrganizationById(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.organizer.OrganizationService/ReadOrganizationById",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrganizationServiceServer).ReadOrganizationById(ctx, req.(*ReadByIdRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _OrganizationService_UpdateOrganization_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateOrganizationRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrganizationServiceServer).UpdateOrganization(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.organizer.OrganizationService/UpdateOrganization",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrganizationServiceServer).UpdateOrganization(ctx, req.(*UpdateOrganizationRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _OrganizationService_DeleteOrganization_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DeleteOrganizationRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrganizationServiceServer).DeleteOrganization(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.organizer.OrganizationService/DeleteOrganization",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrganizationServiceServer).DeleteOrganization(ctx, req.(*DeleteOrganizationRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _OrganizationService_AddUsersToOrganization_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateUsersInOrganizationRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrganizationServiceServer).AddUsersToOrganization(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.organizer.OrganizationService/AddUsersToOrganization",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrganizationServiceServer).AddUsersToOrganization(ctx, req.(*UpdateUsersInOrganizationRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _OrganizationService_RemoveUsersFromOrganization_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateUsersInOrganizationRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrganizationServiceServer).RemoveUsersFromOrganization(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.organizer.OrganizationService/RemoveUsersFromOrganization",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrganizationServiceServer).RemoveUsersFromOrganization(ctx, req.(*UpdateUsersInOrganizationRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _OrganizationService_CreateEvent_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateEventRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrganizationServiceServer).CreateEvent(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.organizer.OrganizationService/CreateEvent",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrganizationServiceServer).CreateEvent(ctx, req.(*CreateEventRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _OrganizationService_ReadEvent_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UserRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrganizationServiceServer).ReadEvent(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.organizer.OrganizationService/ReadEvent",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrganizationServiceServer).ReadEvent(ctx, req.(*UserRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _OrganizationService_ReadEventById_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ReadByIdRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrganizationServiceServer).ReadEventById(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.organizer.OrganizationService/ReadEventById",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrganizationServiceServer).ReadEventById(ctx, req.(*ReadByIdRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _OrganizationService_UpdateEventInfo_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateEventInfoRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrganizationServiceServer).UpdateEventInfo(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.organizer.OrganizationService/UpdateEventInfo",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrganizationServiceServer).UpdateEventInfo(ctx, req.(*UpdateEventInfoRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _OrganizationService_UpdateEventFacility_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateEventFacilityRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrganizationServiceServer).UpdateEventFacility(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.organizer.OrganizationService/UpdateEventFacility",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrganizationServiceServer).UpdateEventFacility(ctx, req.(*UpdateEventFacilityRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _OrganizationService_UpdateEventDuration_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateEventDurationRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrganizationServiceServer).UpdateEventDuration(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.organizer.OrganizationService/UpdateEventDuration",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrganizationServiceServer).UpdateEventDuration(ctx, req.(*UpdateEventDurationRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _OrganizationService_DeleteEvent_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DeleteEventRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrganizationServiceServer).DeleteEvent(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.organizer.OrganizationService/DeleteEvent",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrganizationServiceServer).DeleteEvent(ctx, req.(*DeleteEventRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _OrganizationService_UpdateRegistrationRequest_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateRegistrationRequestRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrganizationServiceServer).UpdateRegistrationRequest(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.organizer.OrganizationService/UpdateRegistrationRequest",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrganizationServiceServer).UpdateRegistrationRequest(ctx, req.(*UpdateRegistrationRequestRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _OrganizationService_AddTag_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateTagRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrganizationServiceServer).AddTag(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.organizer.OrganizationService/AddTag",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrganizationServiceServer).AddTag(ctx, req.(*UpdateTagRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _OrganizationService_RemoveTag_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateTagRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrganizationServiceServer).RemoveTag(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.organizer.OrganizationService/RemoveTag",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrganizationServiceServer).RemoveTag(ctx, req.(*UpdateTagRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _OrganizationService_ReadTag_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UserRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrganizationServiceServer).ReadTag(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.organizer.OrganizationService/ReadTag",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrganizationServiceServer).ReadTag(ctx, req.(*UserRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _OrganizationService_ReadTagById_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ReadByIdRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrganizationServiceServer).ReadTagById(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.organizer.OrganizationService/ReadTagById",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrganizationServiceServer).ReadTagById(ctx, req.(*ReadByIdRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _OrganizationService_HasEvent_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(HasEventRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrganizationServiceServer).HasEvent(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.organizer.OrganizationService/HasEvent",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrganizationServiceServer).HasEvent(ctx, req.(*HasEventRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _OrganizationService_Ping_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(emptypb.Empty)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrganizationServiceServer).Ping(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.organizer.OrganizationService/Ping",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrganizationServiceServer).Ping(ctx, req.(*emptypb.Empty))
	}
	return interceptor(ctx, in, info, handler)
}

// OrganizationService_ServiceDesc is the grpc.ServiceDesc for OrganizationService service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var OrganizationService_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "hts.organizer.OrganizationService",
	HandlerType: (*OrganizationServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "CreateOrganization",
			Handler:    _OrganizationService_CreateOrganization_Handler,
		},
		{
			MethodName: "ReadOrganization",
			Handler:    _OrganizationService_ReadOrganization_Handler,
		},
		{
			MethodName: "ReadOrganizationById",
			Handler:    _OrganizationService_ReadOrganizationById_Handler,
		},
		{
			MethodName: "UpdateOrganization",
			Handler:    _OrganizationService_UpdateOrganization_Handler,
		},
		{
			MethodName: "DeleteOrganization",
			Handler:    _OrganizationService_DeleteOrganization_Handler,
		},
		{
			MethodName: "AddUsersToOrganization",
			Handler:    _OrganizationService_AddUsersToOrganization_Handler,
		},
		{
			MethodName: "RemoveUsersFromOrganization",
			Handler:    _OrganizationService_RemoveUsersFromOrganization_Handler,
		},
		{
			MethodName: "CreateEvent",
			Handler:    _OrganizationService_CreateEvent_Handler,
		},
		{
			MethodName: "ReadEvent",
			Handler:    _OrganizationService_ReadEvent_Handler,
		},
		{
			MethodName: "ReadEventById",
			Handler:    _OrganizationService_ReadEventById_Handler,
		},
		{
			MethodName: "UpdateEventInfo",
			Handler:    _OrganizationService_UpdateEventInfo_Handler,
		},
		{
			MethodName: "UpdateEventFacility",
			Handler:    _OrganizationService_UpdateEventFacility_Handler,
		},
		{
			MethodName: "UpdateEventDuration",
			Handler:    _OrganizationService_UpdateEventDuration_Handler,
		},
		{
			MethodName: "DeleteEvent",
			Handler:    _OrganizationService_DeleteEvent_Handler,
		},
		{
			MethodName: "UpdateRegistrationRequest",
			Handler:    _OrganizationService_UpdateRegistrationRequest_Handler,
		},
		{
			MethodName: "AddTag",
			Handler:    _OrganizationService_AddTag_Handler,
		},
		{
			MethodName: "RemoveTag",
			Handler:    _OrganizationService_RemoveTag_Handler,
		},
		{
			MethodName: "ReadTag",
			Handler:    _OrganizationService_ReadTag_Handler,
		},
		{
			MethodName: "ReadTagById",
			Handler:    _OrganizationService_ReadTagById_Handler,
		},
		{
			MethodName: "HasEvent",
			Handler:    _OrganizationService_HasEvent_Handler,
		},
		{
			MethodName: "Ping",
			Handler:    _OrganizationService_Ping_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "hts/organizer/service.proto",
}
