// Code generated by protoc-gen-go-grpc. DO NOT EDIT.

package participant

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
	emptypb "google.golang.org/protobuf/types/known/emptypb"
	timestamppb "google.golang.org/protobuf/types/known/timestamppb"
	wrapperspb "google.golang.org/protobuf/types/known/wrapperspb"
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
	IsEventAvailable(ctx context.Context, in *IsEventAvailableRequest, opts ...grpc.CallOption) (*wrapperspb.BoolValue, error)
	JoinEvent(ctx context.Context, in *UserWithEventRequest, opts ...grpc.CallOption) (*common.Event, error)
	CancelEvent(ctx context.Context, in *UserWithEventRequest, opts ...grpc.CallOption) (*common.Event, error)
	SubmitAnswerForPostEventQuestion(ctx context.Context, in *SubmitAnswerForPostEventQuestionRequest, opts ...grpc.CallOption) (*SubmitAnswerForPostEventQuestionResponse, error)
	GetEventById(ctx context.Context, in *GetEventByIdRequest, opts ...grpc.CallOption) (*common.Event, error)
	GetAllEvents(ctx context.Context, in *emptypb.Empty, opts ...grpc.CallOption) (*EventsResponse, error)
	GetSuggestedEvents(ctx context.Context, in *emptypb.Empty, opts ...grpc.CallOption) (*EventsResponse, error)
	GetUpcomingEvents(ctx context.Context, in *GetUpcomingEventsRequest, opts ...grpc.CallOption) (*EventsResponse, error)
	GetEventsByStringOfName(ctx context.Context, in *StringInputRequest, opts ...grpc.CallOption) (*EventsResponse, error)
	GetEventsByTagId(ctx context.Context, in *GetEventsByIdRequest, opts ...grpc.CallOption) (*EventsResponse, error)
	GetEventsByOrganizationId(ctx context.Context, in *GetEventsByIdRequest, opts ...grpc.CallOption) (*EventsResponse, error)
	GetEventsByFacilityId(ctx context.Context, in *GetEventsByIdRequest, opts ...grpc.CallOption) (*EventsResponse, error)
	GetEventsByDate(ctx context.Context, in *timestamppb.Timestamp, opts ...grpc.CallOption) (*EventsResponse, error)
	GenerateQR(ctx context.Context, in *GenerateQRRequest, opts ...grpc.CallOption) (*GenerateQRResponse, error)
	Ping(ctx context.Context, in *emptypb.Empty, opts ...grpc.CallOption) (*wrapperspb.BoolValue, error)
}

type participantServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewParticipantServiceClient(cc grpc.ClientConnInterface) ParticipantServiceClient {
	return &participantServiceClient{cc}
}

func (c *participantServiceClient) IsEventAvailable(ctx context.Context, in *IsEventAvailableRequest, opts ...grpc.CallOption) (*wrapperspb.BoolValue, error) {
	out := new(wrapperspb.BoolValue)
	err := c.cc.Invoke(ctx, "/hts.participant.ParticipantService/IsEventAvailable", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *participantServiceClient) JoinEvent(ctx context.Context, in *UserWithEventRequest, opts ...grpc.CallOption) (*common.Event, error) {
	out := new(common.Event)
	err := c.cc.Invoke(ctx, "/hts.participant.ParticipantService/JoinEvent", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *participantServiceClient) CancelEvent(ctx context.Context, in *UserWithEventRequest, opts ...grpc.CallOption) (*common.Event, error) {
	out := new(common.Event)
	err := c.cc.Invoke(ctx, "/hts.participant.ParticipantService/CancelEvent", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *participantServiceClient) SubmitAnswerForPostEventQuestion(ctx context.Context, in *SubmitAnswerForPostEventQuestionRequest, opts ...grpc.CallOption) (*SubmitAnswerForPostEventQuestionResponse, error) {
	out := new(SubmitAnswerForPostEventQuestionResponse)
	err := c.cc.Invoke(ctx, "/hts.participant.ParticipantService/SubmitAnswerForPostEventQuestion", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *participantServiceClient) GetEventById(ctx context.Context, in *GetEventByIdRequest, opts ...grpc.CallOption) (*common.Event, error) {
	out := new(common.Event)
	err := c.cc.Invoke(ctx, "/hts.participant.ParticipantService/GetEventById", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *participantServiceClient) GetAllEvents(ctx context.Context, in *emptypb.Empty, opts ...grpc.CallOption) (*EventsResponse, error) {
	out := new(EventsResponse)
	err := c.cc.Invoke(ctx, "/hts.participant.ParticipantService/GetAllEvents", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *participantServiceClient) GetSuggestedEvents(ctx context.Context, in *emptypb.Empty, opts ...grpc.CallOption) (*EventsResponse, error) {
	out := new(EventsResponse)
	err := c.cc.Invoke(ctx, "/hts.participant.ParticipantService/GetSuggestedEvents", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *participantServiceClient) GetUpcomingEvents(ctx context.Context, in *GetUpcomingEventsRequest, opts ...grpc.CallOption) (*EventsResponse, error) {
	out := new(EventsResponse)
	err := c.cc.Invoke(ctx, "/hts.participant.ParticipantService/GetUpcomingEvents", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *participantServiceClient) GetEventsByStringOfName(ctx context.Context, in *StringInputRequest, opts ...grpc.CallOption) (*EventsResponse, error) {
	out := new(EventsResponse)
	err := c.cc.Invoke(ctx, "/hts.participant.ParticipantService/GetEventsByStringOfName", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *participantServiceClient) GetEventsByTagId(ctx context.Context, in *GetEventsByIdRequest, opts ...grpc.CallOption) (*EventsResponse, error) {
	out := new(EventsResponse)
	err := c.cc.Invoke(ctx, "/hts.participant.ParticipantService/GetEventsByTagId", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *participantServiceClient) GetEventsByOrganizationId(ctx context.Context, in *GetEventsByIdRequest, opts ...grpc.CallOption) (*EventsResponse, error) {
	out := new(EventsResponse)
	err := c.cc.Invoke(ctx, "/hts.participant.ParticipantService/GetEventsByOrganizationId", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *participantServiceClient) GetEventsByFacilityId(ctx context.Context, in *GetEventsByIdRequest, opts ...grpc.CallOption) (*EventsResponse, error) {
	out := new(EventsResponse)
	err := c.cc.Invoke(ctx, "/hts.participant.ParticipantService/GetEventsByFacilityId", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *participantServiceClient) GetEventsByDate(ctx context.Context, in *timestamppb.Timestamp, opts ...grpc.CallOption) (*EventsResponse, error) {
	out := new(EventsResponse)
	err := c.cc.Invoke(ctx, "/hts.participant.ParticipantService/GetEventsByDate", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *participantServiceClient) GenerateQR(ctx context.Context, in *GenerateQRRequest, opts ...grpc.CallOption) (*GenerateQRResponse, error) {
	out := new(GenerateQRResponse)
	err := c.cc.Invoke(ctx, "/hts.participant.ParticipantService/GenerateQR", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *participantServiceClient) Ping(ctx context.Context, in *emptypb.Empty, opts ...grpc.CallOption) (*wrapperspb.BoolValue, error) {
	out := new(wrapperspb.BoolValue)
	err := c.cc.Invoke(ctx, "/hts.participant.ParticipantService/Ping", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// ParticipantServiceServer is the server API for ParticipantService service.
// All implementations must embed UnimplementedParticipantServiceServer
// for forward compatibility
type ParticipantServiceServer interface {
	IsEventAvailable(context.Context, *IsEventAvailableRequest) (*wrapperspb.BoolValue, error)
	JoinEvent(context.Context, *UserWithEventRequest) (*common.Event, error)
	CancelEvent(context.Context, *UserWithEventRequest) (*common.Event, error)
	SubmitAnswerForPostEventQuestion(context.Context, *SubmitAnswerForPostEventQuestionRequest) (*SubmitAnswerForPostEventQuestionResponse, error)
	GetEventById(context.Context, *GetEventByIdRequest) (*common.Event, error)
	GetAllEvents(context.Context, *emptypb.Empty) (*EventsResponse, error)
	GetSuggestedEvents(context.Context, *emptypb.Empty) (*EventsResponse, error)
	GetUpcomingEvents(context.Context, *GetUpcomingEventsRequest) (*EventsResponse, error)
	GetEventsByStringOfName(context.Context, *StringInputRequest) (*EventsResponse, error)
	GetEventsByTagId(context.Context, *GetEventsByIdRequest) (*EventsResponse, error)
	GetEventsByOrganizationId(context.Context, *GetEventsByIdRequest) (*EventsResponse, error)
	GetEventsByFacilityId(context.Context, *GetEventsByIdRequest) (*EventsResponse, error)
	GetEventsByDate(context.Context, *timestamppb.Timestamp) (*EventsResponse, error)
	GenerateQR(context.Context, *GenerateQRRequest) (*GenerateQRResponse, error)
	Ping(context.Context, *emptypb.Empty) (*wrapperspb.BoolValue, error)
	mustEmbedUnimplementedParticipantServiceServer()
}

// UnimplementedParticipantServiceServer must be embedded to have forward compatible implementations.
type UnimplementedParticipantServiceServer struct {
}

func (UnimplementedParticipantServiceServer) IsEventAvailable(context.Context, *IsEventAvailableRequest) (*wrapperspb.BoolValue, error) {
	return nil, status.Errorf(codes.Unimplemented, "method IsEventAvailable not implemented")
}
func (UnimplementedParticipantServiceServer) JoinEvent(context.Context, *UserWithEventRequest) (*common.Event, error) {
	return nil, status.Errorf(codes.Unimplemented, "method JoinEvent not implemented")
}
func (UnimplementedParticipantServiceServer) CancelEvent(context.Context, *UserWithEventRequest) (*common.Event, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CancelEvent not implemented")
}
func (UnimplementedParticipantServiceServer) SubmitAnswerForPostEventQuestion(context.Context, *SubmitAnswerForPostEventQuestionRequest) (*SubmitAnswerForPostEventQuestionResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method SubmitAnswerForPostEventQuestion not implemented")
}
func (UnimplementedParticipantServiceServer) GetEventById(context.Context, *GetEventByIdRequest) (*common.Event, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetEventById not implemented")
}
func (UnimplementedParticipantServiceServer) GetAllEvents(context.Context, *emptypb.Empty) (*EventsResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetAllEvents not implemented")
}
func (UnimplementedParticipantServiceServer) GetSuggestedEvents(context.Context, *emptypb.Empty) (*EventsResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetSuggestedEvents not implemented")
}
func (UnimplementedParticipantServiceServer) GetUpcomingEvents(context.Context, *GetUpcomingEventsRequest) (*EventsResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetUpcomingEvents not implemented")
}
func (UnimplementedParticipantServiceServer) GetEventsByStringOfName(context.Context, *StringInputRequest) (*EventsResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetEventsByStringOfName not implemented")
}
func (UnimplementedParticipantServiceServer) GetEventsByTagId(context.Context, *GetEventsByIdRequest) (*EventsResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetEventsByTagId not implemented")
}
func (UnimplementedParticipantServiceServer) GetEventsByOrganizationId(context.Context, *GetEventsByIdRequest) (*EventsResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetEventsByOrganizationId not implemented")
}
func (UnimplementedParticipantServiceServer) GetEventsByFacilityId(context.Context, *GetEventsByIdRequest) (*EventsResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetEventsByFacilityId not implemented")
}
func (UnimplementedParticipantServiceServer) GetEventsByDate(context.Context, *timestamppb.Timestamp) (*EventsResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetEventsByDate not implemented")
}
func (UnimplementedParticipantServiceServer) GenerateQR(context.Context, *GenerateQRRequest) (*GenerateQRResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GenerateQR not implemented")
}
func (UnimplementedParticipantServiceServer) Ping(context.Context, *emptypb.Empty) (*wrapperspb.BoolValue, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Ping not implemented")
}
func (UnimplementedParticipantServiceServer) mustEmbedUnimplementedParticipantServiceServer() {}

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
	in := new(UserWithEventRequest)
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
		return srv.(ParticipantServiceServer).JoinEvent(ctx, req.(*UserWithEventRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _ParticipantService_CancelEvent_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UserWithEventRequest)
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
		return srv.(ParticipantServiceServer).CancelEvent(ctx, req.(*UserWithEventRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _ParticipantService_SubmitAnswerForPostEventQuestion_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(SubmitAnswerForPostEventQuestionRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ParticipantServiceServer).SubmitAnswerForPostEventQuestion(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.participant.ParticipantService/SubmitAnswerForPostEventQuestion",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ParticipantServiceServer).SubmitAnswerForPostEventQuestion(ctx, req.(*SubmitAnswerForPostEventQuestionRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _ParticipantService_GetEventById_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetEventByIdRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ParticipantServiceServer).GetEventById(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.participant.ParticipantService/GetEventById",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ParticipantServiceServer).GetEventById(ctx, req.(*GetEventByIdRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _ParticipantService_GetAllEvents_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(emptypb.Empty)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ParticipantServiceServer).GetAllEvents(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.participant.ParticipantService/GetAllEvents",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ParticipantServiceServer).GetAllEvents(ctx, req.(*emptypb.Empty))
	}
	return interceptor(ctx, in, info, handler)
}

func _ParticipantService_GetSuggestedEvents_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(emptypb.Empty)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ParticipantServiceServer).GetSuggestedEvents(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.participant.ParticipantService/GetSuggestedEvents",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ParticipantServiceServer).GetSuggestedEvents(ctx, req.(*emptypb.Empty))
	}
	return interceptor(ctx, in, info, handler)
}

func _ParticipantService_GetUpcomingEvents_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetUpcomingEventsRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ParticipantServiceServer).GetUpcomingEvents(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.participant.ParticipantService/GetUpcomingEvents",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ParticipantServiceServer).GetUpcomingEvents(ctx, req.(*GetUpcomingEventsRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _ParticipantService_GetEventsByStringOfName_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(StringInputRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ParticipantServiceServer).GetEventsByStringOfName(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.participant.ParticipantService/GetEventsByStringOfName",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ParticipantServiceServer).GetEventsByStringOfName(ctx, req.(*StringInputRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _ParticipantService_GetEventsByTagId_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetEventsByIdRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ParticipantServiceServer).GetEventsByTagId(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.participant.ParticipantService/GetEventsByTagId",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ParticipantServiceServer).GetEventsByTagId(ctx, req.(*GetEventsByIdRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _ParticipantService_GetEventsByOrganizationId_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetEventsByIdRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ParticipantServiceServer).GetEventsByOrganizationId(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.participant.ParticipantService/GetEventsByOrganizationId",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ParticipantServiceServer).GetEventsByOrganizationId(ctx, req.(*GetEventsByIdRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _ParticipantService_GetEventsByFacilityId_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetEventsByIdRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ParticipantServiceServer).GetEventsByFacilityId(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.participant.ParticipantService/GetEventsByFacilityId",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ParticipantServiceServer).GetEventsByFacilityId(ctx, req.(*GetEventsByIdRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _ParticipantService_GetEventsByDate_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(timestamppb.Timestamp)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ParticipantServiceServer).GetEventsByDate(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.participant.ParticipantService/GetEventsByDate",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ParticipantServiceServer).GetEventsByDate(ctx, req.(*timestamppb.Timestamp))
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

func _ParticipantService_Ping_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(emptypb.Empty)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ParticipantServiceServer).Ping(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.participant.ParticipantService/Ping",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ParticipantServiceServer).Ping(ctx, req.(*emptypb.Empty))
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
			MethodName: "SubmitAnswerForPostEventQuestion",
			Handler:    _ParticipantService_SubmitAnswerForPostEventQuestion_Handler,
		},
		{
			MethodName: "GetEventById",
			Handler:    _ParticipantService_GetEventById_Handler,
		},
		{
			MethodName: "GetAllEvents",
			Handler:    _ParticipantService_GetAllEvents_Handler,
		},
		{
			MethodName: "GetSuggestedEvents",
			Handler:    _ParticipantService_GetSuggestedEvents_Handler,
		},
		{
			MethodName: "GetUpcomingEvents",
			Handler:    _ParticipantService_GetUpcomingEvents_Handler,
		},
		{
			MethodName: "GetEventsByStringOfName",
			Handler:    _ParticipantService_GetEventsByStringOfName_Handler,
		},
		{
			MethodName: "GetEventsByTagId",
			Handler:    _ParticipantService_GetEventsByTagId_Handler,
		},
		{
			MethodName: "GetEventsByOrganizationId",
			Handler:    _ParticipantService_GetEventsByOrganizationId_Handler,
		},
		{
			MethodName: "GetEventsByFacilityId",
			Handler:    _ParticipantService_GetEventsByFacilityId_Handler,
		},
		{
			MethodName: "GetEventsByDate",
			Handler:    _ParticipantService_GetEventsByDate_Handler,
		},
		{
			MethodName: "GenerateQR",
			Handler:    _ParticipantService_GenerateQR_Handler,
		},
		{
			MethodName: "Ping",
			Handler:    _ParticipantService_Ping_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "hts/participant/service.proto",
}
