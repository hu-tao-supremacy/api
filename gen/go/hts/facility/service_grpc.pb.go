// Code generated by protoc-gen-go-grpc. DO NOT EDIT.

package facility

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

// FacilityServiceClient is the client API for FacilityService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type FacilityServiceClient interface {
	GetFacilityList(ctx context.Context, in *GetFacilityListRequest, opts ...grpc.CallOption) (*GetFacilityListResponse, error)
	GetFacilityRequestList(ctx context.Context, in *GetFacilityRequestListRequest, opts ...grpc.CallOption) (*GetFacilityRequestListResponse, error)
	GetFacilityRequestsListStatus(ctx context.Context, in *GetFacilityRequestsListStatusRequest, opts ...grpc.CallOption) (*GetFacilityRequestsListStatusResponse, error)
	GetFacilityRequestStatus(ctx context.Context, in *GetFacilityRequestStatusRequest, opts ...grpc.CallOption) (*common.FacilityRequest, error)
	GetFacilityRequestStatusFull(ctx context.Context, in *GetFacilityRequestStatusFullRequest, opts ...grpc.CallOption) (*FacilityRequestWithFacilityInfo, error)
	GetAvailableFacilityList(ctx context.Context, in *emptypb.Empty, opts ...grpc.CallOption) (*GetAvailableFacilityListResponse, error)
	GetAvailableTimeOfFacility(ctx context.Context, in *GetAvailableTimeOfFacilityRequest, opts ...grpc.CallOption) (*GetAvailableTimeOfFacilityResponse, error)
	CreateFacilityRequest(ctx context.Context, in *CreateFacilityRequestRequest, opts ...grpc.CallOption) (*common.FacilityRequest, error)
	ApproveFacilityRequest(ctx context.Context, in *ApproveFacilityRequestRequest, opts ...grpc.CallOption) (*wrapperspb.BoolValue, error)
	RejectFacilityRequest(ctx context.Context, in *RejectFacilityRequestRequest, opts ...grpc.CallOption) (*wrapperspb.BoolValue, error)
	GetFacilityInfo(ctx context.Context, in *GetFacilityInfoRequest, opts ...grpc.CallOption) (*common.Facility, error)
	Ping(ctx context.Context, in *emptypb.Empty, opts ...grpc.CallOption) (*wrapperspb.BoolValue, error)
}

type facilityServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewFacilityServiceClient(cc grpc.ClientConnInterface) FacilityServiceClient {
	return &facilityServiceClient{cc}
}

func (c *facilityServiceClient) GetFacilityList(ctx context.Context, in *GetFacilityListRequest, opts ...grpc.CallOption) (*GetFacilityListResponse, error) {
	out := new(GetFacilityListResponse)
	err := c.cc.Invoke(ctx, "/hts.facility.FacilityService/GetFacilityList", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *facilityServiceClient) GetFacilityRequestList(ctx context.Context, in *GetFacilityRequestListRequest, opts ...grpc.CallOption) (*GetFacilityRequestListResponse, error) {
	out := new(GetFacilityRequestListResponse)
	err := c.cc.Invoke(ctx, "/hts.facility.FacilityService/GetFacilityRequestList", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *facilityServiceClient) GetFacilityRequestsListStatus(ctx context.Context, in *GetFacilityRequestsListStatusRequest, opts ...grpc.CallOption) (*GetFacilityRequestsListStatusResponse, error) {
	out := new(GetFacilityRequestsListStatusResponse)
	err := c.cc.Invoke(ctx, "/hts.facility.FacilityService/GetFacilityRequestsListStatus", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *facilityServiceClient) GetFacilityRequestStatus(ctx context.Context, in *GetFacilityRequestStatusRequest, opts ...grpc.CallOption) (*common.FacilityRequest, error) {
	out := new(common.FacilityRequest)
	err := c.cc.Invoke(ctx, "/hts.facility.FacilityService/GetFacilityRequestStatus", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *facilityServiceClient) GetFacilityRequestStatusFull(ctx context.Context, in *GetFacilityRequestStatusFullRequest, opts ...grpc.CallOption) (*FacilityRequestWithFacilityInfo, error) {
	out := new(FacilityRequestWithFacilityInfo)
	err := c.cc.Invoke(ctx, "/hts.facility.FacilityService/GetFacilityRequestStatusFull", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *facilityServiceClient) GetAvailableFacilityList(ctx context.Context, in *emptypb.Empty, opts ...grpc.CallOption) (*GetAvailableFacilityListResponse, error) {
	out := new(GetAvailableFacilityListResponse)
	err := c.cc.Invoke(ctx, "/hts.facility.FacilityService/GetAvailableFacilityList", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *facilityServiceClient) GetAvailableTimeOfFacility(ctx context.Context, in *GetAvailableTimeOfFacilityRequest, opts ...grpc.CallOption) (*GetAvailableTimeOfFacilityResponse, error) {
	out := new(GetAvailableTimeOfFacilityResponse)
	err := c.cc.Invoke(ctx, "/hts.facility.FacilityService/GetAvailableTimeOfFacility", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *facilityServiceClient) CreateFacilityRequest(ctx context.Context, in *CreateFacilityRequestRequest, opts ...grpc.CallOption) (*common.FacilityRequest, error) {
	out := new(common.FacilityRequest)
	err := c.cc.Invoke(ctx, "/hts.facility.FacilityService/CreateFacilityRequest", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *facilityServiceClient) ApproveFacilityRequest(ctx context.Context, in *ApproveFacilityRequestRequest, opts ...grpc.CallOption) (*wrapperspb.BoolValue, error) {
	out := new(wrapperspb.BoolValue)
	err := c.cc.Invoke(ctx, "/hts.facility.FacilityService/ApproveFacilityRequest", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *facilityServiceClient) RejectFacilityRequest(ctx context.Context, in *RejectFacilityRequestRequest, opts ...grpc.CallOption) (*wrapperspb.BoolValue, error) {
	out := new(wrapperspb.BoolValue)
	err := c.cc.Invoke(ctx, "/hts.facility.FacilityService/RejectFacilityRequest", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *facilityServiceClient) GetFacilityInfo(ctx context.Context, in *GetFacilityInfoRequest, opts ...grpc.CallOption) (*common.Facility, error) {
	out := new(common.Facility)
	err := c.cc.Invoke(ctx, "/hts.facility.FacilityService/GetFacilityInfo", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *facilityServiceClient) Ping(ctx context.Context, in *emptypb.Empty, opts ...grpc.CallOption) (*wrapperspb.BoolValue, error) {
	out := new(wrapperspb.BoolValue)
	err := c.cc.Invoke(ctx, "/hts.facility.FacilityService/Ping", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// FacilityServiceServer is the server API for FacilityService service.
// All implementations must embed UnimplementedFacilityServiceServer
// for forward compatibility
type FacilityServiceServer interface {
	GetFacilityList(context.Context, *GetFacilityListRequest) (*GetFacilityListResponse, error)
	GetFacilityRequestList(context.Context, *GetFacilityRequestListRequest) (*GetFacilityRequestListResponse, error)
	GetFacilityRequestsListStatus(context.Context, *GetFacilityRequestsListStatusRequest) (*GetFacilityRequestsListStatusResponse, error)
	GetFacilityRequestStatus(context.Context, *GetFacilityRequestStatusRequest) (*common.FacilityRequest, error)
	GetFacilityRequestStatusFull(context.Context, *GetFacilityRequestStatusFullRequest) (*FacilityRequestWithFacilityInfo, error)
	GetAvailableFacilityList(context.Context, *emptypb.Empty) (*GetAvailableFacilityListResponse, error)
	GetAvailableTimeOfFacility(context.Context, *GetAvailableTimeOfFacilityRequest) (*GetAvailableTimeOfFacilityResponse, error)
	CreateFacilityRequest(context.Context, *CreateFacilityRequestRequest) (*common.FacilityRequest, error)
	ApproveFacilityRequest(context.Context, *ApproveFacilityRequestRequest) (*wrapperspb.BoolValue, error)
	RejectFacilityRequest(context.Context, *RejectFacilityRequestRequest) (*wrapperspb.BoolValue, error)
	GetFacilityInfo(context.Context, *GetFacilityInfoRequest) (*common.Facility, error)
	Ping(context.Context, *emptypb.Empty) (*wrapperspb.BoolValue, error)
	mustEmbedUnimplementedFacilityServiceServer()
}

// UnimplementedFacilityServiceServer must be embedded to have forward compatible implementations.
type UnimplementedFacilityServiceServer struct {
}

func (UnimplementedFacilityServiceServer) GetFacilityList(context.Context, *GetFacilityListRequest) (*GetFacilityListResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetFacilityList not implemented")
}
func (UnimplementedFacilityServiceServer) GetFacilityRequestList(context.Context, *GetFacilityRequestListRequest) (*GetFacilityRequestListResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetFacilityRequestList not implemented")
}
func (UnimplementedFacilityServiceServer) GetFacilityRequestsListStatus(context.Context, *GetFacilityRequestsListStatusRequest) (*GetFacilityRequestsListStatusResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetFacilityRequestsListStatus not implemented")
}
func (UnimplementedFacilityServiceServer) GetFacilityRequestStatus(context.Context, *GetFacilityRequestStatusRequest) (*common.FacilityRequest, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetFacilityRequestStatus not implemented")
}
func (UnimplementedFacilityServiceServer) GetFacilityRequestStatusFull(context.Context, *GetFacilityRequestStatusFullRequest) (*FacilityRequestWithFacilityInfo, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetFacilityRequestStatusFull not implemented")
}
func (UnimplementedFacilityServiceServer) GetAvailableFacilityList(context.Context, *emptypb.Empty) (*GetAvailableFacilityListResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetAvailableFacilityList not implemented")
}
func (UnimplementedFacilityServiceServer) GetAvailableTimeOfFacility(context.Context, *GetAvailableTimeOfFacilityRequest) (*GetAvailableTimeOfFacilityResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetAvailableTimeOfFacility not implemented")
}
func (UnimplementedFacilityServiceServer) CreateFacilityRequest(context.Context, *CreateFacilityRequestRequest) (*common.FacilityRequest, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateFacilityRequest not implemented")
}
func (UnimplementedFacilityServiceServer) ApproveFacilityRequest(context.Context, *ApproveFacilityRequestRequest) (*wrapperspb.BoolValue, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ApproveFacilityRequest not implemented")
}
func (UnimplementedFacilityServiceServer) RejectFacilityRequest(context.Context, *RejectFacilityRequestRequest) (*wrapperspb.BoolValue, error) {
	return nil, status.Errorf(codes.Unimplemented, "method RejectFacilityRequest not implemented")
}
func (UnimplementedFacilityServiceServer) GetFacilityInfo(context.Context, *GetFacilityInfoRequest) (*common.Facility, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetFacilityInfo not implemented")
}
func (UnimplementedFacilityServiceServer) Ping(context.Context, *emptypb.Empty) (*wrapperspb.BoolValue, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Ping not implemented")
}
func (UnimplementedFacilityServiceServer) mustEmbedUnimplementedFacilityServiceServer() {}

// UnsafeFacilityServiceServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to FacilityServiceServer will
// result in compilation errors.
type UnsafeFacilityServiceServer interface {
	mustEmbedUnimplementedFacilityServiceServer()
}

func RegisterFacilityServiceServer(s grpc.ServiceRegistrar, srv FacilityServiceServer) {
	s.RegisterService(&FacilityService_ServiceDesc, srv)
}

func _FacilityService_GetFacilityList_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetFacilityListRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FacilityServiceServer).GetFacilityList(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.facility.FacilityService/GetFacilityList",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FacilityServiceServer).GetFacilityList(ctx, req.(*GetFacilityListRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FacilityService_GetFacilityRequestList_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetFacilityRequestListRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FacilityServiceServer).GetFacilityRequestList(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.facility.FacilityService/GetFacilityRequestList",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FacilityServiceServer).GetFacilityRequestList(ctx, req.(*GetFacilityRequestListRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FacilityService_GetFacilityRequestsListStatus_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetFacilityRequestsListStatusRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FacilityServiceServer).GetFacilityRequestsListStatus(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.facility.FacilityService/GetFacilityRequestsListStatus",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FacilityServiceServer).GetFacilityRequestsListStatus(ctx, req.(*GetFacilityRequestsListStatusRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FacilityService_GetFacilityRequestStatus_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetFacilityRequestStatusRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FacilityServiceServer).GetFacilityRequestStatus(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.facility.FacilityService/GetFacilityRequestStatus",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FacilityServiceServer).GetFacilityRequestStatus(ctx, req.(*GetFacilityRequestStatusRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FacilityService_GetFacilityRequestStatusFull_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetFacilityRequestStatusFullRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FacilityServiceServer).GetFacilityRequestStatusFull(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.facility.FacilityService/GetFacilityRequestStatusFull",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FacilityServiceServer).GetFacilityRequestStatusFull(ctx, req.(*GetFacilityRequestStatusFullRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FacilityService_GetAvailableFacilityList_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(emptypb.Empty)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FacilityServiceServer).GetAvailableFacilityList(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.facility.FacilityService/GetAvailableFacilityList",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FacilityServiceServer).GetAvailableFacilityList(ctx, req.(*emptypb.Empty))
	}
	return interceptor(ctx, in, info, handler)
}

func _FacilityService_GetAvailableTimeOfFacility_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetAvailableTimeOfFacilityRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FacilityServiceServer).GetAvailableTimeOfFacility(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.facility.FacilityService/GetAvailableTimeOfFacility",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FacilityServiceServer).GetAvailableTimeOfFacility(ctx, req.(*GetAvailableTimeOfFacilityRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FacilityService_CreateFacilityRequest_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateFacilityRequestRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FacilityServiceServer).CreateFacilityRequest(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.facility.FacilityService/CreateFacilityRequest",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FacilityServiceServer).CreateFacilityRequest(ctx, req.(*CreateFacilityRequestRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FacilityService_ApproveFacilityRequest_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ApproveFacilityRequestRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FacilityServiceServer).ApproveFacilityRequest(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.facility.FacilityService/ApproveFacilityRequest",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FacilityServiceServer).ApproveFacilityRequest(ctx, req.(*ApproveFacilityRequestRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FacilityService_RejectFacilityRequest_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(RejectFacilityRequestRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FacilityServiceServer).RejectFacilityRequest(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.facility.FacilityService/RejectFacilityRequest",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FacilityServiceServer).RejectFacilityRequest(ctx, req.(*RejectFacilityRequestRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FacilityService_GetFacilityInfo_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetFacilityInfoRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FacilityServiceServer).GetFacilityInfo(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.facility.FacilityService/GetFacilityInfo",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FacilityServiceServer).GetFacilityInfo(ctx, req.(*GetFacilityInfoRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FacilityService_Ping_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(emptypb.Empty)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FacilityServiceServer).Ping(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hts.facility.FacilityService/Ping",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FacilityServiceServer).Ping(ctx, req.(*emptypb.Empty))
	}
	return interceptor(ctx, in, info, handler)
}

// FacilityService_ServiceDesc is the grpc.ServiceDesc for FacilityService service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var FacilityService_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "hts.facility.FacilityService",
	HandlerType: (*FacilityServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "GetFacilityList",
			Handler:    _FacilityService_GetFacilityList_Handler,
		},
		{
			MethodName: "GetFacilityRequestList",
			Handler:    _FacilityService_GetFacilityRequestList_Handler,
		},
		{
			MethodName: "GetFacilityRequestsListStatus",
			Handler:    _FacilityService_GetFacilityRequestsListStatus_Handler,
		},
		{
			MethodName: "GetFacilityRequestStatus",
			Handler:    _FacilityService_GetFacilityRequestStatus_Handler,
		},
		{
			MethodName: "GetFacilityRequestStatusFull",
			Handler:    _FacilityService_GetFacilityRequestStatusFull_Handler,
		},
		{
			MethodName: "GetAvailableFacilityList",
			Handler:    _FacilityService_GetAvailableFacilityList_Handler,
		},
		{
			MethodName: "GetAvailableTimeOfFacility",
			Handler:    _FacilityService_GetAvailableTimeOfFacility_Handler,
		},
		{
			MethodName: "CreateFacilityRequest",
			Handler:    _FacilityService_CreateFacilityRequest_Handler,
		},
		{
			MethodName: "ApproveFacilityRequest",
			Handler:    _FacilityService_ApproveFacilityRequest_Handler,
		},
		{
			MethodName: "RejectFacilityRequest",
			Handler:    _FacilityService_RejectFacilityRequest_Handler,
		},
		{
			MethodName: "GetFacilityInfo",
			Handler:    _FacilityService_GetFacilityInfo_Handler,
		},
		{
			MethodName: "Ping",
			Handler:    _FacilityService_Ping_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "hts/facility/service.proto",
}
