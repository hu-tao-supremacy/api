// Code generated by protoc-gen-go-grpc. DO NOT EDIT.

package participant

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
	common "onepass.app/facility/hts/common"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

// ParticipantServiceClient is the client API for ParticipantService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type ParticipantServiceClient interface {
	IsEventAvailable(ctx context.Context, in *IsEventAvailableRequest, opts ...grpc.CallOption) (*common.Result, error)
	JoinEvent(ctx context.Context, in *JoinEventRequest, opts ...grpc.CallOption) (*common.Result, error)
	CancelEvent(ctx context.Context, in *CancelEventRequest, opts ...grpc.CallOption) (*common.Result, error)
	CreateFeedback(ctx context.Context, in *CreateFeedbackRequest, opts ...grpc.CallOption) (*common.Result, error)
	RemoveFeedback(ctx context.Context, in *RemoveFeedbackRequest, opts ...grpc.CallOption) (*common.Result, error)
	SearchEventsByName(ctx context.Context, in *SearchEventsByNameRequest, opts ...grpc.CallOption) (*SearchEventsByNameRespond, error)
	GenerateQR(ctx context.Context, in *GenerateQRRequest, opts ...grpc.CallOption) (*GenerateQRRespond, error)
	GetEvent(ctx context.Context, in *GetEventRequest, opts ...grpc.CallOption) (*common.Event, error)
}

type participantServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewParticipantServiceClient(cc grpc.ClientConnInterface) ParticipantServiceClient {
	return &participantServiceClient{cc}
}

func (c *participantServiceClient) IsEventAvailable(ctx context.Context, in *IsEventAvailableRequest, opts ...grpc.CallOption) (*common.Result, error) {
	out := new(common.Result)
	err := c.cc.Invoke(ctx, "/hts.participant.ParticipantService/IsEventAvailable", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *participantServiceClient) JoinEvent(ctx context.Context, in *JoinEventRequest, opts ...grpc.CallOption) (*common.Result, error) {
	out := new(common.Result)
	err := c.cc.Invoke(ctx, "/hts.participant.ParticipantService/JoinEvent", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *participantServiceClient) CancelEvent(ctx context.Context, in *CancelEventRequest, opts ...grpc.CallOption) (*common.Result, error) {
	out := new(common.Result)
	err := c.cc.Invoke(ctx, "/hts.participant.ParticipantService/CancelEvent", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *participantServiceClient) CreateFeedback(ctx context.Context, in *CreateFeedbackRequest, opts ...grpc.CallOption) (*common.Result, error) {
	out := new(common.Result)
	err := c.cc.Invoke(ctx, "/hts.participant.ParticipantService/CreateFeedback", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *participantServiceClient) RemoveFeedback(ctx context.Context, in *RemoveFeedbackRequest, opts ...grpc.CallOption) (*common.Result, error) {
	out := new(common.Result)
	err := c.cc.Invoke(ctx, "/hts.participant.ParticipantService/RemoveFeedback", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *participantServiceClient) SearchEventsByName(ctx context.Context, in *SearchEventsByNameRequest, opts ...grpc.CallOption) (*SearchEventsByNameRespond, error) {
	out := new(SearchEventsByNameRespond)
	err := c.cc.Invoke(ctx, "/hts.participant.ParticipantService/SearchEventsByName", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *participantServiceClient) GenerateQR(ctx context.Context, in *GenerateQRRequest, opts ...grpc.CallOption) (*GenerateQRRespond, error) {
	out := new(GenerateQRRespond)
	err := c.cc.Invoke(ctx, "/hts.participant.ParticipantService/GenerateQR", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *participantServiceClient) GetEvent(ctx context.Context, in *GetEventRequest, opts ...grpc.CallOption) (*common.Event, error) {
	out := new(common.Event)
	err := c.cc.Invoke(ctx, "/hts.participant.ParticipantService/GetEvent", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// ParticipantServiceServer is the server API for ParticipantService service.
// All implementations should embed UnimplementedParticipantServiceServer
// for forward compatibility
type ParticipantServiceServer interface {
	IsEventAvailable(context.Context, *IsEventAvailableRequest) (*common.Result, error)
	JoinEvent(context.Context, *JoinEventRequest) (*common.Result, error)
	CancelEvent(context.Context, *CancelEventRequest) (*common.Result, error)
	CreateFeedback(context.Context, *CreateFeedbackRequest) (*common.Result, error)
	RemoveFeedback(context.Context, *RemoveFeedbackRequest) (*common.Result, error)
	SearchEventsByName(context.Context, *SearchEventsByNameRequest) (*SearchEventsByNameRespond, error)
	GenerateQR(context.Context, *GenerateQRRequest) (*GenerateQRRespond, error)
	GetEvent(context.Context, *GetEventRequest) (*common.Event, error)
}

// UnimplementedParticipantServiceServer should be embedded to have forward compatible implementations.
type UnimplementedParticipantServiceServer struct {
}

func (UnimplementedParticipantServiceServer) IsEventAvailable(context.Context, *IsEventAvailableRequest) (*common.Result, error) {
	return nil, status.Errorf(codes.Unimplemented, "method IsEventAvailable not implemented")
}
func (UnimplementedParticipantServiceServer) JoinEvent(context.Context, *JoinEventRequest) (*common.Result, error) {
	return nil, status.Errorf(codes.Unimplemented, "method JoinEvent not implemented")
}
func (UnimplementedParticipantServiceServer) CancelEvent(context.Context, *CancelEventRequest) (*common.Result, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CancelEvent not implemented")
}
func (UnimplementedParticipantServiceServer) CreateFeedback(context.Context, *CreateFeedbackRequest) (*common.Result, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateFeedback not implemented")
}
func (UnimplementedParticipantServiceServer) RemoveFeedback(context.Context, *RemoveFeedbackRequest) (*common.Result, error) {
	return nil, status.Errorf(codes.Unimplemented, "method RemoveFeedback not implemented")
}
func (UnimplementedParticipantServiceServer) SearchEventsByName(context.Context, *SearchEventsByNameRequest) (*SearchEventsByNameRespond, error) {
	return nil, status.Errorf(codes.Unimplemented, "method SearchEventsByName not implemented")
}
func (UnimplementedParticipantServiceServer) GenerateQR(context.Context, *GenerateQRRequest) (*GenerateQRRespond, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GenerateQR not implemented")
}
func (UnimplementedParticipantServiceServer) GetEvent(context.Context, *GetEventRequest) (*common.Event, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetEvent not implemented")
}

// UnsafeParticipantServiceServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to ParticipantServiceServer will
// result in compilation errors.
type UnsafeParticipantServiceServer interface {
	mustEmbedUnimplementedParticipantServiceServer()
}

func RegisterParticipantServiceServer(s grpc.ServiceRegistrar, srv ParticipantServiceServer) {
	s.RegisterService(&ParticipantService_ServiceDesc, srv)
}

func _ParticipantService_IsEventAvailable_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(IsEventAvailableRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ParticipantServiceServer).IsEventAvailable(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.participant.ParticipantService/IsEventAvailable",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ParticipantServiceServer).IsEventAvailable(ctx, req.(*IsEventAvailableRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _ParticipantService_JoinEvent_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(JoinEventRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ParticipantServiceServer).JoinEvent(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.participant.ParticipantService/JoinEvent",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ParticipantServiceServer).JoinEvent(ctx, req.(*JoinEventRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _ParticipantService_CancelEvent_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CancelEventRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ParticipantServiceServer).CancelEvent(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.participant.ParticipantService/CancelEvent",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ParticipantServiceServer).CancelEvent(ctx, req.(*CancelEventRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _ParticipantService_CreateFeedback_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateFeedbackRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ParticipantServiceServer).CreateFeedback(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.participant.ParticipantService/CreateFeedback",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ParticipantServiceServer).CreateFeedback(ctx, req.(*CreateFeedbackRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _ParticipantService_RemoveFeedback_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(RemoveFeedbackRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ParticipantServiceServer).RemoveFeedback(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.participant.ParticipantService/RemoveFeedback",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ParticipantServiceServer).RemoveFeedback(ctx, req.(*RemoveFeedbackRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _ParticipantService_SearchEventsByName_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(SearchEventsByNameRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ParticipantServiceServer).SearchEventsByName(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.participant.ParticipantService/SearchEventsByName",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ParticipantServiceServer).SearchEventsByName(ctx, req.(*SearchEventsByNameRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _ParticipantService_GenerateQR_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GenerateQRRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ParticipantServiceServer).GenerateQR(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.participant.ParticipantService/GenerateQR",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ParticipantServiceServer).GenerateQR(ctx, req.(*GenerateQRRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _ParticipantService_GetEvent_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetEventRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ParticipantServiceServer).GetEvent(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.participant.ParticipantService/GetEvent",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ParticipantServiceServer).GetEvent(ctx, req.(*GetEventRequest))
	}
	return interceptor(ctx, in, info, handler)
}

// ParticipantService_ServiceDesc is the grpc.ServiceDesc for ParticipantService service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var ParticipantService_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "hts.participant.ParticipantService",
	HandlerType: (*ParticipantServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "IsEventAvailable",
			Handler:    _ParticipantService_IsEventAvailable_Handler,
		},
		{
			MethodName: "JoinEvent",
			Handler:    _ParticipantService_JoinEvent_Handler,
		},
		{
			MethodName: "CancelEvent",
			Handler:    _ParticipantService_CancelEvent_Handler,
		},
		{
			MethodName: "CreateFeedback",
			Handler:    _ParticipantService_CreateFeedback_Handler,
		},
		{
			MethodName: "RemoveFeedback",
			Handler:    _ParticipantService_RemoveFeedback_Handler,
		},
		{
			MethodName: "SearchEventsByName",
			Handler:    _ParticipantService_SearchEventsByName_Handler,
		},
		{
			MethodName: "GenerateQR",
			Handler:    _ParticipantService_GenerateQR_Handler,
		},
		{
			MethodName: "GetEvent",
			Handler:    _ParticipantService_GetEvent_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "hts/participant/service.proto",
}
