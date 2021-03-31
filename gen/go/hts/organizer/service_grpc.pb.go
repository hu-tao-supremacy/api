// Code generated by protoc-gen-go-grpc. DO NOT EDIT.

package organizer

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
	emptypb "google.golang.org/protobuf/types/known/emptypb"
	wrapperspb "google.golang.org/protobuf/types/known/wrapperspb"
	common "onepass.app/facility/hts/common"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

// OrganizerServiceClient is the client API for OrganizerService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type OrganizerServiceClient interface {
	CreateOrganization(ctx context.Context, in *CreateOrganizationRequest, opts ...grpc.CallOption) (*emptypb.Empty, error)
	GetOrganizations(ctx context.Context, in *emptypb.Empty, opts ...grpc.CallOption) (*GetOrganizationsResponse, error)
	GetOrganizationById(ctx context.Context, in *common.GetObjectByIdRequest, opts ...grpc.CallOption) (*GetOrganizationByIdResponse, error)
	UpdateOrganization(ctx context.Context, in *UpdateOrganizationRequest, opts ...grpc.CallOption) (*emptypb.Empty, error)
	RemoveOrganization(ctx context.Context, in *RemoveOrganizationRequest, opts ...grpc.CallOption) (*emptypb.Empty, error)
	AddUsersToOrganization(ctx context.Context, in *UpdateUsersInOrganizationRequest, opts ...grpc.CallOption) (*emptypb.Empty, error)
	RemoveUsersFromOrganization(ctx context.Context, in *UpdateUsersInOrganizationRequest, opts ...grpc.CallOption) (*emptypb.Empty, error)
	CreateEvent(ctx context.Context, in *CreateEventRequest, opts ...grpc.CallOption) (*emptypb.Empty, error)
	UpdateEvent(ctx context.Context, in *UpdateEventRequest, opts ...grpc.CallOption) (*emptypb.Empty, error)
	UpdateEventDurations(ctx context.Context, in *UpdateEventDurationRequest, opts ...grpc.CallOption) (*emptypb.Empty, error)
	RemoveEvent(ctx context.Context, in *RemoveEventRequest, opts ...grpc.CallOption) (*emptypb.Empty, error)
	UpdateRegistrationRequest(ctx context.Context, in *UpdateRegistrationRequestRequest, opts ...grpc.CallOption) (*emptypb.Empty, error)
	CreateTag(ctx context.Context, in *CreateTagRequest, opts ...grpc.CallOption) (*emptypb.Empty, error)
	AddTags(ctx context.Context, in *UpdateTagRequest, opts ...grpc.CallOption) (*emptypb.Empty, error)
	RemoveTags(ctx context.Context, in *UpdateTagRequest, opts ...grpc.CallOption) (*emptypb.Empty, error)
	HasEvent(ctx context.Context, in *HasEventRequest, opts ...grpc.CallOption) (*common.Event, error)
	AddQuestionGroups(ctx context.Context, in *AddQuestionGroupsRequest, opts ...grpc.CallOption) (*emptypb.Empty, error)
	RemoveQuestionGroups(ctx context.Context, in *RemoveQuestionGroupsRequest, opts ...grpc.CallOption) (*emptypb.Empty, error)
	AddQuestions(ctx context.Context, in *AddQuestionsRequest, opts ...grpc.CallOption) (*emptypb.Empty, error)
	RemoveQuestions(ctx context.Context, in *RemoveQuestionsRequest, opts ...grpc.CallOption) (*emptypb.Empty, error)
	Ping(ctx context.Context, in *emptypb.Empty, opts ...grpc.CallOption) (*wrapperspb.BoolValue, error)
}

type organizerServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewOrganizerServiceClient(cc grpc.ClientConnInterface) OrganizerServiceClient {
	return &organizerServiceClient{cc}
}

func (c *organizerServiceClient) CreateOrganization(ctx context.Context, in *CreateOrganizationRequest, opts ...grpc.CallOption) (*emptypb.Empty, error) {
	out := new(emptypb.Empty)
	err := c.cc.Invoke(ctx, "/hts.organizer.OrganizerService/CreateOrganization", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *organizerServiceClient) GetOrganizations(ctx context.Context, in *emptypb.Empty, opts ...grpc.CallOption) (*GetOrganizationsResponse, error) {
	out := new(GetOrganizationsResponse)
	err := c.cc.Invoke(ctx, "/hts.organizer.OrganizerService/GetOrganizations", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *organizerServiceClient) GetOrganizationById(ctx context.Context, in *common.GetObjectByIdRequest, opts ...grpc.CallOption) (*GetOrganizationByIdResponse, error) {
	out := new(GetOrganizationByIdResponse)
	err := c.cc.Invoke(ctx, "/hts.organizer.OrganizerService/GetOrganizationById", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *organizerServiceClient) UpdateOrganization(ctx context.Context, in *UpdateOrganizationRequest, opts ...grpc.CallOption) (*emptypb.Empty, error) {
	out := new(emptypb.Empty)
	err := c.cc.Invoke(ctx, "/hts.organizer.OrganizerService/UpdateOrganization", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *organizerServiceClient) RemoveOrganization(ctx context.Context, in *RemoveOrganizationRequest, opts ...grpc.CallOption) (*emptypb.Empty, error) {
	out := new(emptypb.Empty)
	err := c.cc.Invoke(ctx, "/hts.organizer.OrganizerService/RemoveOrganization", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *organizerServiceClient) AddUsersToOrganization(ctx context.Context, in *UpdateUsersInOrganizationRequest, opts ...grpc.CallOption) (*emptypb.Empty, error) {
	out := new(emptypb.Empty)
	err := c.cc.Invoke(ctx, "/hts.organizer.OrganizerService/AddUsersToOrganization", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *organizerServiceClient) RemoveUsersFromOrganization(ctx context.Context, in *UpdateUsersInOrganizationRequest, opts ...grpc.CallOption) (*emptypb.Empty, error) {
	out := new(emptypb.Empty)
	err := c.cc.Invoke(ctx, "/hts.organizer.OrganizerService/RemoveUsersFromOrganization", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *organizerServiceClient) CreateEvent(ctx context.Context, in *CreateEventRequest, opts ...grpc.CallOption) (*emptypb.Empty, error) {
	out := new(emptypb.Empty)
	err := c.cc.Invoke(ctx, "/hts.organizer.OrganizerService/CreateEvent", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *organizerServiceClient) UpdateEvent(ctx context.Context, in *UpdateEventRequest, opts ...grpc.CallOption) (*emptypb.Empty, error) {
	out := new(emptypb.Empty)
	err := c.cc.Invoke(ctx, "/hts.organizer.OrganizerService/UpdateEvent", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *organizerServiceClient) UpdateEventDurations(ctx context.Context, in *UpdateEventDurationRequest, opts ...grpc.CallOption) (*emptypb.Empty, error) {
	out := new(emptypb.Empty)
	err := c.cc.Invoke(ctx, "/hts.organizer.OrganizerService/UpdateEventDurations", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *organizerServiceClient) RemoveEvent(ctx context.Context, in *RemoveEventRequest, opts ...grpc.CallOption) (*emptypb.Empty, error) {
	out := new(emptypb.Empty)
	err := c.cc.Invoke(ctx, "/hts.organizer.OrganizerService/RemoveEvent", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *organizerServiceClient) UpdateRegistrationRequest(ctx context.Context, in *UpdateRegistrationRequestRequest, opts ...grpc.CallOption) (*emptypb.Empty, error) {
	out := new(emptypb.Empty)
	err := c.cc.Invoke(ctx, "/hts.organizer.OrganizerService/UpdateRegistrationRequest", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *organizerServiceClient) CreateTag(ctx context.Context, in *CreateTagRequest, opts ...grpc.CallOption) (*emptypb.Empty, error) {
	out := new(emptypb.Empty)
	err := c.cc.Invoke(ctx, "/hts.organizer.OrganizerService/CreateTag", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *organizerServiceClient) AddTags(ctx context.Context, in *UpdateTagRequest, opts ...grpc.CallOption) (*emptypb.Empty, error) {
	out := new(emptypb.Empty)
	err := c.cc.Invoke(ctx, "/hts.organizer.OrganizerService/AddTags", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *organizerServiceClient) RemoveTags(ctx context.Context, in *UpdateTagRequest, opts ...grpc.CallOption) (*emptypb.Empty, error) {
	out := new(emptypb.Empty)
	err := c.cc.Invoke(ctx, "/hts.organizer.OrganizerService/RemoveTags", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *organizerServiceClient) HasEvent(ctx context.Context, in *HasEventRequest, opts ...grpc.CallOption) (*common.Event, error) {
	out := new(common.Event)
	err := c.cc.Invoke(ctx, "/hts.organizer.OrganizerService/HasEvent", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *organizerServiceClient) AddQuestionGroups(ctx context.Context, in *AddQuestionGroupsRequest, opts ...grpc.CallOption) (*emptypb.Empty, error) {
	out := new(emptypb.Empty)
	err := c.cc.Invoke(ctx, "/hts.organizer.OrganizerService/AddQuestionGroups", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *organizerServiceClient) RemoveQuestionGroups(ctx context.Context, in *RemoveQuestionGroupsRequest, opts ...grpc.CallOption) (*emptypb.Empty, error) {
	out := new(emptypb.Empty)
	err := c.cc.Invoke(ctx, "/hts.organizer.OrganizerService/RemoveQuestionGroups", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *organizerServiceClient) AddQuestions(ctx context.Context, in *AddQuestionsRequest, opts ...grpc.CallOption) (*emptypb.Empty, error) {
	out := new(emptypb.Empty)
	err := c.cc.Invoke(ctx, "/hts.organizer.OrganizerService/AddQuestions", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *organizerServiceClient) RemoveQuestions(ctx context.Context, in *RemoveQuestionsRequest, opts ...grpc.CallOption) (*emptypb.Empty, error) {
	out := new(emptypb.Empty)
	err := c.cc.Invoke(ctx, "/hts.organizer.OrganizerService/RemoveQuestions", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *organizerServiceClient) Ping(ctx context.Context, in *emptypb.Empty, opts ...grpc.CallOption) (*wrapperspb.BoolValue, error) {
	out := new(wrapperspb.BoolValue)
	err := c.cc.Invoke(ctx, "/hts.organizer.OrganizerService/Ping", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// OrganizerServiceServer is the server API for OrganizerService service.
// All implementations must embed UnimplementedOrganizerServiceServer
// for forward compatibility
type OrganizerServiceServer interface {
	CreateOrganization(context.Context, *CreateOrganizationRequest) (*emptypb.Empty, error)
	GetOrganizations(context.Context, *emptypb.Empty) (*GetOrganizationsResponse, error)
	GetOrganizationById(context.Context, *common.GetObjectByIdRequest) (*GetOrganizationByIdResponse, error)
	UpdateOrganization(context.Context, *UpdateOrganizationRequest) (*emptypb.Empty, error)
	RemoveOrganization(context.Context, *RemoveOrganizationRequest) (*emptypb.Empty, error)
	AddUsersToOrganization(context.Context, *UpdateUsersInOrganizationRequest) (*emptypb.Empty, error)
	RemoveUsersFromOrganization(context.Context, *UpdateUsersInOrganizationRequest) (*emptypb.Empty, error)
	CreateEvent(context.Context, *CreateEventRequest) (*emptypb.Empty, error)
	UpdateEvent(context.Context, *UpdateEventRequest) (*emptypb.Empty, error)
	UpdateEventDurations(context.Context, *UpdateEventDurationRequest) (*emptypb.Empty, error)
	RemoveEvent(context.Context, *RemoveEventRequest) (*emptypb.Empty, error)
	UpdateRegistrationRequest(context.Context, *UpdateRegistrationRequestRequest) (*emptypb.Empty, error)
	CreateTag(context.Context, *CreateTagRequest) (*emptypb.Empty, error)
	AddTags(context.Context, *UpdateTagRequest) (*emptypb.Empty, error)
	RemoveTags(context.Context, *UpdateTagRequest) (*emptypb.Empty, error)
	HasEvent(context.Context, *HasEventRequest) (*common.Event, error)
	AddQuestionGroups(context.Context, *AddQuestionGroupsRequest) (*emptypb.Empty, error)
	RemoveQuestionGroups(context.Context, *RemoveQuestionGroupsRequest) (*emptypb.Empty, error)
	AddQuestions(context.Context, *AddQuestionsRequest) (*emptypb.Empty, error)
	RemoveQuestions(context.Context, *RemoveQuestionsRequest) (*emptypb.Empty, error)
	Ping(context.Context, *emptypb.Empty) (*wrapperspb.BoolValue, error)
	mustEmbedUnimplementedOrganizerServiceServer()
}

// UnimplementedOrganizerServiceServer must be embedded to have forward compatible implementations.
type UnimplementedOrganizerServiceServer struct {
}

func (UnimplementedOrganizerServiceServer) CreateOrganization(context.Context, *CreateOrganizationRequest) (*emptypb.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateOrganization not implemented")
}
func (UnimplementedOrganizerServiceServer) GetOrganizations(context.Context, *emptypb.Empty) (*GetOrganizationsResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetOrganizations not implemented")
}
func (UnimplementedOrganizerServiceServer) GetOrganizationById(context.Context, *common.GetObjectByIdRequest) (*GetOrganizationByIdResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetOrganizationById not implemented")
}
func (UnimplementedOrganizerServiceServer) UpdateOrganization(context.Context, *UpdateOrganizationRequest) (*emptypb.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateOrganization not implemented")
}
func (UnimplementedOrganizerServiceServer) RemoveOrganization(context.Context, *RemoveOrganizationRequest) (*emptypb.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method RemoveOrganization not implemented")
}
func (UnimplementedOrganizerServiceServer) AddUsersToOrganization(context.Context, *UpdateUsersInOrganizationRequest) (*emptypb.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method AddUsersToOrganization not implemented")
}
func (UnimplementedOrganizerServiceServer) RemoveUsersFromOrganization(context.Context, *UpdateUsersInOrganizationRequest) (*emptypb.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method RemoveUsersFromOrganization not implemented")
}
func (UnimplementedOrganizerServiceServer) CreateEvent(context.Context, *CreateEventRequest) (*emptypb.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateEvent not implemented")
}
func (UnimplementedOrganizerServiceServer) UpdateEvent(context.Context, *UpdateEventRequest) (*emptypb.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateEvent not implemented")
}
func (UnimplementedOrganizerServiceServer) UpdateEventDurations(context.Context, *UpdateEventDurationRequest) (*emptypb.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateEventDurations not implemented")
}
func (UnimplementedOrganizerServiceServer) RemoveEvent(context.Context, *RemoveEventRequest) (*emptypb.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method RemoveEvent not implemented")
}
func (UnimplementedOrganizerServiceServer) UpdateRegistrationRequest(context.Context, *UpdateRegistrationRequestRequest) (*emptypb.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateRegistrationRequest not implemented")
}
func (UnimplementedOrganizerServiceServer) CreateTag(context.Context, *CreateTagRequest) (*emptypb.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateTag not implemented")
}
func (UnimplementedOrganizerServiceServer) AddTags(context.Context, *UpdateTagRequest) (*emptypb.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method AddTags not implemented")
}
func (UnimplementedOrganizerServiceServer) RemoveTags(context.Context, *UpdateTagRequest) (*emptypb.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method RemoveTags not implemented")
}
func (UnimplementedOrganizerServiceServer) HasEvent(context.Context, *HasEventRequest) (*common.Event, error) {
	return nil, status.Errorf(codes.Unimplemented, "method HasEvent not implemented")
}
func (UnimplementedOrganizerServiceServer) AddQuestionGroups(context.Context, *AddQuestionGroupsRequest) (*emptypb.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method AddQuestionGroups not implemented")
}
func (UnimplementedOrganizerServiceServer) RemoveQuestionGroups(context.Context, *RemoveQuestionGroupsRequest) (*emptypb.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method RemoveQuestionGroups not implemented")
}
func (UnimplementedOrganizerServiceServer) AddQuestions(context.Context, *AddQuestionsRequest) (*emptypb.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method AddQuestions not implemented")
}
func (UnimplementedOrganizerServiceServer) RemoveQuestions(context.Context, *RemoveQuestionsRequest) (*emptypb.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method RemoveQuestions not implemented")
}
func (UnimplementedOrganizerServiceServer) Ping(context.Context, *emptypb.Empty) (*wrapperspb.BoolValue, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Ping not implemented")
}
func (UnimplementedOrganizerServiceServer) mustEmbedUnimplementedOrganizerServiceServer() {}

// UnsafeOrganizerServiceServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to OrganizerServiceServer will
// result in compilation errors.
type UnsafeOrganizerServiceServer interface {
	mustEmbedUnimplementedOrganizerServiceServer()
}

func RegisterOrganizerServiceServer(s grpc.ServiceRegistrar, srv OrganizerServiceServer) {
	s.RegisterService(&OrganizerService_ServiceDesc, srv)
}

func _OrganizerService_CreateOrganization_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateOrganizationRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrganizerServiceServer).CreateOrganization(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.organizer.OrganizerService/CreateOrganization",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrganizerServiceServer).CreateOrganization(ctx, req.(*CreateOrganizationRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _OrganizerService_GetOrganizations_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(emptypb.Empty)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrganizerServiceServer).GetOrganizations(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.organizer.OrganizerService/GetOrganizations",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrganizerServiceServer).GetOrganizations(ctx, req.(*emptypb.Empty))
	}
	return interceptor(ctx, in, info, handler)
}

func _OrganizerService_GetOrganizationById_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(common.GetObjectByIdRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrganizerServiceServer).GetOrganizationById(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.organizer.OrganizerService/GetOrganizationById",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrganizerServiceServer).GetOrganizationById(ctx, req.(*common.GetObjectByIdRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _OrganizerService_UpdateOrganization_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateOrganizationRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrganizerServiceServer).UpdateOrganization(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.organizer.OrganizerService/UpdateOrganization",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrganizerServiceServer).UpdateOrganization(ctx, req.(*UpdateOrganizationRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _OrganizerService_RemoveOrganization_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(RemoveOrganizationRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrganizerServiceServer).RemoveOrganization(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.organizer.OrganizerService/RemoveOrganization",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrganizerServiceServer).RemoveOrganization(ctx, req.(*RemoveOrganizationRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _OrganizerService_AddUsersToOrganization_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateUsersInOrganizationRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrganizerServiceServer).AddUsersToOrganization(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.organizer.OrganizerService/AddUsersToOrganization",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrganizerServiceServer).AddUsersToOrganization(ctx, req.(*UpdateUsersInOrganizationRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _OrganizerService_RemoveUsersFromOrganization_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateUsersInOrganizationRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrganizerServiceServer).RemoveUsersFromOrganization(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.organizer.OrganizerService/RemoveUsersFromOrganization",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrganizerServiceServer).RemoveUsersFromOrganization(ctx, req.(*UpdateUsersInOrganizationRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _OrganizerService_CreateEvent_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateEventRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrganizerServiceServer).CreateEvent(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.organizer.OrganizerService/CreateEvent",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrganizerServiceServer).CreateEvent(ctx, req.(*CreateEventRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _OrganizerService_UpdateEvent_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateEventRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrganizerServiceServer).UpdateEvent(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.organizer.OrganizerService/UpdateEvent",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrganizerServiceServer).UpdateEvent(ctx, req.(*UpdateEventRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _OrganizerService_UpdateEventDurations_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateEventDurationRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrganizerServiceServer).UpdateEventDurations(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.organizer.OrganizerService/UpdateEventDurations",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrganizerServiceServer).UpdateEventDurations(ctx, req.(*UpdateEventDurationRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _OrganizerService_RemoveEvent_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(RemoveEventRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrganizerServiceServer).RemoveEvent(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.organizer.OrganizerService/RemoveEvent",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrganizerServiceServer).RemoveEvent(ctx, req.(*RemoveEventRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _OrganizerService_UpdateRegistrationRequest_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateRegistrationRequestRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrganizerServiceServer).UpdateRegistrationRequest(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.organizer.OrganizerService/UpdateRegistrationRequest",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrganizerServiceServer).UpdateRegistrationRequest(ctx, req.(*UpdateRegistrationRequestRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _OrganizerService_CreateTag_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateTagRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrganizerServiceServer).CreateTag(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.organizer.OrganizerService/CreateTag",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrganizerServiceServer).CreateTag(ctx, req.(*CreateTagRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _OrganizerService_AddTags_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateTagRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrganizerServiceServer).AddTags(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.organizer.OrganizerService/AddTags",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrganizerServiceServer).AddTags(ctx, req.(*UpdateTagRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _OrganizerService_RemoveTags_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateTagRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrganizerServiceServer).RemoveTags(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.organizer.OrganizerService/RemoveTags",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrganizerServiceServer).RemoveTags(ctx, req.(*UpdateTagRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _OrganizerService_HasEvent_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(HasEventRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrganizerServiceServer).HasEvent(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.organizer.OrganizerService/HasEvent",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrganizerServiceServer).HasEvent(ctx, req.(*HasEventRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _OrganizerService_AddQuestionGroups_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(AddQuestionGroupsRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrganizerServiceServer).AddQuestionGroups(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.organizer.OrganizerService/AddQuestionGroups",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrganizerServiceServer).AddQuestionGroups(ctx, req.(*AddQuestionGroupsRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _OrganizerService_RemoveQuestionGroups_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(RemoveQuestionGroupsRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrganizerServiceServer).RemoveQuestionGroups(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.organizer.OrganizerService/RemoveQuestionGroups",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrganizerServiceServer).RemoveQuestionGroups(ctx, req.(*RemoveQuestionGroupsRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _OrganizerService_AddQuestions_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(AddQuestionsRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrganizerServiceServer).AddQuestions(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.organizer.OrganizerService/AddQuestions",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrganizerServiceServer).AddQuestions(ctx, req.(*AddQuestionsRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _OrganizerService_RemoveQuestions_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(RemoveQuestionsRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrganizerServiceServer).RemoveQuestions(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.organizer.OrganizerService/RemoveQuestions",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrganizerServiceServer).RemoveQuestions(ctx, req.(*RemoveQuestionsRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _OrganizerService_Ping_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(emptypb.Empty)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrganizerServiceServer).Ping(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.organizer.OrganizerService/Ping",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrganizerServiceServer).Ping(ctx, req.(*emptypb.Empty))
	}
	return interceptor(ctx, in, info, handler)
}

// OrganizerService_ServiceDesc is the grpc.ServiceDesc for OrganizerService service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var OrganizerService_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "hts.organizer.OrganizerService",
	HandlerType: (*OrganizerServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "CreateOrganization",
			Handler:    _OrganizerService_CreateOrganization_Handler,
		},
		{
			MethodName: "GetOrganizations",
			Handler:    _OrganizerService_GetOrganizations_Handler,
		},
		{
			MethodName: "GetOrganizationById",
			Handler:    _OrganizerService_GetOrganizationById_Handler,
		},
		{
			MethodName: "UpdateOrganization",
			Handler:    _OrganizerService_UpdateOrganization_Handler,
		},
		{
			MethodName: "RemoveOrganization",
			Handler:    _OrganizerService_RemoveOrganization_Handler,
		},
		{
			MethodName: "AddUsersToOrganization",
			Handler:    _OrganizerService_AddUsersToOrganization_Handler,
		},
		{
			MethodName: "RemoveUsersFromOrganization",
			Handler:    _OrganizerService_RemoveUsersFromOrganization_Handler,
		},
		{
			MethodName: "CreateEvent",
			Handler:    _OrganizerService_CreateEvent_Handler,
		},
		{
			MethodName: "UpdateEvent",
			Handler:    _OrganizerService_UpdateEvent_Handler,
		},
		{
			MethodName: "UpdateEventDurations",
			Handler:    _OrganizerService_UpdateEventDurations_Handler,
		},
		{
			MethodName: "RemoveEvent",
			Handler:    _OrganizerService_RemoveEvent_Handler,
		},
		{
			MethodName: "UpdateRegistrationRequest",
			Handler:    _OrganizerService_UpdateRegistrationRequest_Handler,
		},
		{
			MethodName: "CreateTag",
			Handler:    _OrganizerService_CreateTag_Handler,
		},
		{
			MethodName: "AddTags",
			Handler:    _OrganizerService_AddTags_Handler,
		},
		{
			MethodName: "RemoveTags",
			Handler:    _OrganizerService_RemoveTags_Handler,
		},
		{
			MethodName: "HasEvent",
			Handler:    _OrganizerService_HasEvent_Handler,
		},
		{
			MethodName: "AddQuestionGroups",
			Handler:    _OrganizerService_AddQuestionGroups_Handler,
		},
		{
			MethodName: "RemoveQuestionGroups",
			Handler:    _OrganizerService_RemoveQuestionGroups_Handler,
		},
		{
			MethodName: "AddQuestions",
			Handler:    _OrganizerService_AddQuestions_Handler,
		},
		{
			MethodName: "RemoveQuestions",
			Handler:    _OrganizerService_RemoveQuestions_Handler,
		},
		{
			MethodName: "Ping",
			Handler:    _OrganizerService_Ping_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "hts/organizer/service.proto",
}
