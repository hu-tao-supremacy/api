// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.25.0
// 	protoc        v3.15.3
// source: hts/account/service.proto

package account

import (
	proto "github.com/golang/protobuf/proto"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	emptypb "google.golang.org/protobuf/types/known/emptypb"
	wrapperspb "google.golang.org/protobuf/types/known/wrapperspb"
	common "onepass.app/facility/hts/common"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

// This is a compile-time assertion that a sufficiently up-to-date version
// of the legacy proto package is being used.
const _ = proto.ProtoPackageIsVersion4

type AccessTokenPayload struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	UserId int32 `protobuf:"varint,1,opt,name=user_id,json=userId,proto3" json:"user_id,omitempty"`
}

func (x *AccessTokenPayload) Reset() {
	*x = AccessTokenPayload{}
	if protoimpl.UnsafeEnabled {
		mi := &file_hts_account_service_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *AccessTokenPayload) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*AccessTokenPayload) ProtoMessage() {}

func (x *AccessTokenPayload) ProtoReflect() protoreflect.Message {
	mi := &file_hts_account_service_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use AccessTokenPayload.ProtoReflect.Descriptor instead.
func (*AccessTokenPayload) Descriptor() ([]byte, []int) {
	return file_hts_account_service_proto_rawDescGZIP(), []int{0}
}

func (x *AccessTokenPayload) GetUserId() int32 {
	if x != nil {
		return x.UserId
	}
	return 0
}

type IsAuthenticatedRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	AccessToken string `protobuf:"bytes,1,opt,name=access_token,json=accessToken,proto3" json:"access_token,omitempty"`
}

func (x *IsAuthenticatedRequest) Reset() {
	*x = IsAuthenticatedRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_hts_account_service_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *IsAuthenticatedRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*IsAuthenticatedRequest) ProtoMessage() {}

func (x *IsAuthenticatedRequest) ProtoReflect() protoreflect.Message {
	mi := &file_hts_account_service_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use IsAuthenticatedRequest.ProtoReflect.Descriptor instead.
func (*IsAuthenticatedRequest) Descriptor() ([]byte, []int) {
	return file_hts_account_service_proto_rawDescGZIP(), []int{1}
}

func (x *IsAuthenticatedRequest) GetAccessToken() string {
	if x != nil {
		return x.AccessToken
	}
	return ""
}

type GenerateAccessTokenRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	UserId int32 `protobuf:"varint,1,opt,name=user_id,json=userId,proto3" json:"user_id,omitempty"`
}

func (x *GenerateAccessTokenRequest) Reset() {
	*x = GenerateAccessTokenRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_hts_account_service_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GenerateAccessTokenRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GenerateAccessTokenRequest) ProtoMessage() {}

func (x *GenerateAccessTokenRequest) ProtoReflect() protoreflect.Message {
	mi := &file_hts_account_service_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GenerateAccessTokenRequest.ProtoReflect.Descriptor instead.
func (*GenerateAccessTokenRequest) Descriptor() ([]byte, []int) {
	return file_hts_account_service_proto_rawDescGZIP(), []int{2}
}

func (x *GenerateAccessTokenRequest) GetUserId() int32 {
	if x != nil {
		return x.UserId
	}
	return 0
}

type GenerateAccessTokenResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	AccessToken string `protobuf:"bytes,1,opt,name=access_token,json=accessToken,proto3" json:"access_token,omitempty"`
}

func (x *GenerateAccessTokenResponse) Reset() {
	*x = GenerateAccessTokenResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_hts_account_service_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GenerateAccessTokenResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GenerateAccessTokenResponse) ProtoMessage() {}

func (x *GenerateAccessTokenResponse) ProtoReflect() protoreflect.Message {
	mi := &file_hts_account_service_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GenerateAccessTokenResponse.ProtoReflect.Descriptor instead.
func (*GenerateAccessTokenResponse) Descriptor() ([]byte, []int) {
	return file_hts_account_service_proto_rawDescGZIP(), []int{3}
}

func (x *GenerateAccessTokenResponse) GetAccessToken() string {
	if x != nil {
		return x.AccessToken
	}
	return ""
}

type HasPermissionRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	UserId         int32             `protobuf:"varint,1,opt,name=user_id,json=userId,proto3" json:"user_id,omitempty"`
	OrganizationId int32             `protobuf:"varint,2,opt,name=organization_id,json=organizationId,proto3" json:"organization_id,omitempty"`
	PermissionName common.Permission `protobuf:"varint,3,opt,name=permission_name,json=permissionName,proto3,enum=hts.common.Permission" json:"permission_name,omitempty"`
}

func (x *HasPermissionRequest) Reset() {
	*x = HasPermissionRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_hts_account_service_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *HasPermissionRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*HasPermissionRequest) ProtoMessage() {}

func (x *HasPermissionRequest) ProtoReflect() protoreflect.Message {
	mi := &file_hts_account_service_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use HasPermissionRequest.ProtoReflect.Descriptor instead.
func (*HasPermissionRequest) Descriptor() ([]byte, []int) {
	return file_hts_account_service_proto_rawDescGZIP(), []int{4}
}

func (x *HasPermissionRequest) GetUserId() int32 {
	if x != nil {
		return x.UserId
	}
	return 0
}

func (x *HasPermissionRequest) GetOrganizationId() int32 {
	if x != nil {
		return x.OrganizationId
	}
	return 0
}

func (x *HasPermissionRequest) GetPermissionName() common.Permission {
	if x != nil {
		return x.PermissionName
	}
	return common.Permission_PERMISSION_UNSPECIFIED
}

type CreateUserRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	FirstName      string `protobuf:"bytes,1,opt,name=first_name,json=firstName,proto3" json:"first_name,omitempty"`
	LastName       string `protobuf:"bytes,2,opt,name=last_name,json=lastName,proto3" json:"last_name,omitempty"`
	ChulaId        string `protobuf:"bytes,3,opt,name=chula_id,json=chulaId,proto3" json:"chula_id,omitempty"`
	Email          string `protobuf:"bytes,4,opt,name=email,proto3" json:"email,omitempty"`
	IsChulaStudent bool   `protobuf:"varint,5,opt,name=is_chula_student,json=isChulaStudent,proto3" json:"is_chula_student,omitempty"`
}

func (x *CreateUserRequest) Reset() {
	*x = CreateUserRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_hts_account_service_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CreateUserRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateUserRequest) ProtoMessage() {}

func (x *CreateUserRequest) ProtoReflect() protoreflect.Message {
	mi := &file_hts_account_service_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CreateUserRequest.ProtoReflect.Descriptor instead.
func (*CreateUserRequest) Descriptor() ([]byte, []int) {
	return file_hts_account_service_proto_rawDescGZIP(), []int{5}
}

func (x *CreateUserRequest) GetFirstName() string {
	if x != nil {
		return x.FirstName
	}
	return ""
}

func (x *CreateUserRequest) GetLastName() string {
	if x != nil {
		return x.LastName
	}
	return ""
}

func (x *CreateUserRequest) GetChulaId() string {
	if x != nil {
		return x.ChulaId
	}
	return ""
}

func (x *CreateUserRequest) GetEmail() string {
	if x != nil {
		return x.Email
	}
	return ""
}

func (x *CreateUserRequest) GetIsChulaStudent() bool {
	if x != nil {
		return x.IsChulaStudent
	}
	return false
}

type GetUserByChulaIdRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Id string `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
}

func (x *GetUserByChulaIdRequest) Reset() {
	*x = GetUserByChulaIdRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_hts_account_service_proto_msgTypes[6]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GetUserByChulaIdRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetUserByChulaIdRequest) ProtoMessage() {}

func (x *GetUserByChulaIdRequest) ProtoReflect() protoreflect.Message {
	mi := &file_hts_account_service_proto_msgTypes[6]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GetUserByChulaIdRequest.ProtoReflect.Descriptor instead.
func (*GetUserByChulaIdRequest) Descriptor() ([]byte, []int) {
	return file_hts_account_service_proto_rawDescGZIP(), []int{6}
}

func (x *GetUserByChulaIdRequest) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

var File_hts_account_service_proto protoreflect.FileDescriptor

var file_hts_account_service_proto_rawDesc = []byte{
	0x0a, 0x19, 0x68, 0x74, 0x73, 0x2f, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x2f, 0x73, 0x65,
	0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0b, 0x68, 0x74, 0x73,
	0x2e, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x1a, 0x17, 0x68, 0x74, 0x73, 0x2f, 0x63, 0x6f,
	0x6d, 0x6d, 0x6f, 0x6e, 0x2f, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x1a, 0x1b, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62,
	0x75, 0x66, 0x2f, 0x65, 0x6d, 0x70, 0x74, 0x79, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1e,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f,
	0x77, 0x72, 0x61, 0x70, 0x70, 0x65, 0x72, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x2d,
	0x0a, 0x12, 0x41, 0x63, 0x63, 0x65, 0x73, 0x73, 0x54, 0x6f, 0x6b, 0x65, 0x6e, 0x50, 0x61, 0x79,
	0x6c, 0x6f, 0x61, 0x64, 0x12, 0x17, 0x0a, 0x07, 0x75, 0x73, 0x65, 0x72, 0x5f, 0x69, 0x64, 0x18,
	0x01, 0x20, 0x01, 0x28, 0x05, 0x52, 0x06, 0x75, 0x73, 0x65, 0x72, 0x49, 0x64, 0x22, 0x3b, 0x0a,
	0x16, 0x49, 0x73, 0x41, 0x75, 0x74, 0x68, 0x65, 0x6e, 0x74, 0x69, 0x63, 0x61, 0x74, 0x65, 0x64,
	0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x21, 0x0a, 0x0c, 0x61, 0x63, 0x63, 0x65, 0x73,
	0x73, 0x5f, 0x74, 0x6f, 0x6b, 0x65, 0x6e, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0b, 0x61,
	0x63, 0x63, 0x65, 0x73, 0x73, 0x54, 0x6f, 0x6b, 0x65, 0x6e, 0x22, 0x35, 0x0a, 0x1a, 0x47, 0x65,
	0x6e, 0x65, 0x72, 0x61, 0x74, 0x65, 0x41, 0x63, 0x63, 0x65, 0x73, 0x73, 0x54, 0x6f, 0x6b, 0x65,
	0x6e, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x17, 0x0a, 0x07, 0x75, 0x73, 0x65, 0x72,
	0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x05, 0x52, 0x06, 0x75, 0x73, 0x65, 0x72, 0x49,
	0x64, 0x22, 0x40, 0x0a, 0x1b, 0x47, 0x65, 0x6e, 0x65, 0x72, 0x61, 0x74, 0x65, 0x41, 0x63, 0x63,
	0x65, 0x73, 0x73, 0x54, 0x6f, 0x6b, 0x65, 0x6e, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65,
	0x12, 0x21, 0x0a, 0x0c, 0x61, 0x63, 0x63, 0x65, 0x73, 0x73, 0x5f, 0x74, 0x6f, 0x6b, 0x65, 0x6e,
	0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0b, 0x61, 0x63, 0x63, 0x65, 0x73, 0x73, 0x54, 0x6f,
	0x6b, 0x65, 0x6e, 0x22, 0x99, 0x01, 0x0a, 0x14, 0x48, 0x61, 0x73, 0x50, 0x65, 0x72, 0x6d, 0x69,
	0x73, 0x73, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x17, 0x0a, 0x07,
	0x75, 0x73, 0x65, 0x72, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x05, 0x52, 0x06, 0x75,
	0x73, 0x65, 0x72, 0x49, 0x64, 0x12, 0x27, 0x0a, 0x0f, 0x6f, 0x72, 0x67, 0x61, 0x6e, 0x69, 0x7a,
	0x61, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x69, 0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x05, 0x52, 0x0e,
	0x6f, 0x72, 0x67, 0x61, 0x6e, 0x69, 0x7a, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x49, 0x64, 0x12, 0x3f,
	0x0a, 0x0f, 0x70, 0x65, 0x72, 0x6d, 0x69, 0x73, 0x73, 0x69, 0x6f, 0x6e, 0x5f, 0x6e, 0x61, 0x6d,
	0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x16, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x63, 0x6f,
	0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x50, 0x65, 0x72, 0x6d, 0x69, 0x73, 0x73, 0x69, 0x6f, 0x6e, 0x52,
	0x0e, 0x70, 0x65, 0x72, 0x6d, 0x69, 0x73, 0x73, 0x69, 0x6f, 0x6e, 0x4e, 0x61, 0x6d, 0x65, 0x22,
	0xaa, 0x01, 0x0a, 0x11, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x55, 0x73, 0x65, 0x72, 0x52, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x1d, 0x0a, 0x0a, 0x66, 0x69, 0x72, 0x73, 0x74, 0x5f, 0x6e,
	0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x09, 0x66, 0x69, 0x72, 0x73, 0x74,
	0x4e, 0x61, 0x6d, 0x65, 0x12, 0x1b, 0x0a, 0x09, 0x6c, 0x61, 0x73, 0x74, 0x5f, 0x6e, 0x61, 0x6d,
	0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x08, 0x6c, 0x61, 0x73, 0x74, 0x4e, 0x61, 0x6d,
	0x65, 0x12, 0x19, 0x0a, 0x08, 0x63, 0x68, 0x75, 0x6c, 0x61, 0x5f, 0x69, 0x64, 0x18, 0x03, 0x20,
	0x01, 0x28, 0x09, 0x52, 0x07, 0x63, 0x68, 0x75, 0x6c, 0x61, 0x49, 0x64, 0x12, 0x14, 0x0a, 0x05,
	0x65, 0x6d, 0x61, 0x69, 0x6c, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x52, 0x05, 0x65, 0x6d, 0x61,
	0x69, 0x6c, 0x12, 0x28, 0x0a, 0x10, 0x69, 0x73, 0x5f, 0x63, 0x68, 0x75, 0x6c, 0x61, 0x5f, 0x73,
	0x74, 0x75, 0x64, 0x65, 0x6e, 0x74, 0x18, 0x05, 0x20, 0x01, 0x28, 0x08, 0x52, 0x0e, 0x69, 0x73,
	0x43, 0x68, 0x75, 0x6c, 0x61, 0x53, 0x74, 0x75, 0x64, 0x65, 0x6e, 0x74, 0x22, 0x29, 0x0a, 0x17,
	0x47, 0x65, 0x74, 0x55, 0x73, 0x65, 0x72, 0x42, 0x79, 0x43, 0x68, 0x75, 0x6c, 0x61, 0x49, 0x64,
	0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x0e, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x09, 0x52, 0x02, 0x69, 0x64, 0x32, 0xe2, 0x04, 0x0a, 0x0e, 0x41, 0x63, 0x63, 0x6f,
	0x75, 0x6e, 0x74, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x12, 0x3e, 0x0a, 0x0a, 0x43, 0x72,
	0x65, 0x61, 0x74, 0x65, 0x55, 0x73, 0x65, 0x72, 0x12, 0x1e, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x61,
	0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x2e, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x55, 0x73, 0x65,
	0x72, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x10, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x63,
	0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x55, 0x73, 0x65, 0x72, 0x12, 0x4a, 0x0a, 0x10, 0x47, 0x65,
	0x74, 0x55, 0x73, 0x65, 0x72, 0x42, 0x79, 0x43, 0x68, 0x75, 0x6c, 0x61, 0x49, 0x64, 0x12, 0x24,
	0x2e, 0x68, 0x74, 0x73, 0x2e, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x2e, 0x47, 0x65, 0x74,
	0x55, 0x73, 0x65, 0x72, 0x42, 0x79, 0x43, 0x68, 0x75, 0x6c, 0x61, 0x49, 0x64, 0x52, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x1a, 0x10, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f,
	0x6e, 0x2e, 0x55, 0x73, 0x65, 0x72, 0x12, 0x52, 0x0a, 0x0f, 0x49, 0x73, 0x41, 0x75, 0x74, 0x68,
	0x65, 0x6e, 0x74, 0x69, 0x63, 0x61, 0x74, 0x65, 0x64, 0x12, 0x23, 0x2e, 0x68, 0x74, 0x73, 0x2e,
	0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x2e, 0x49, 0x73, 0x41, 0x75, 0x74, 0x68, 0x65, 0x6e,
	0x74, 0x69, 0x63, 0x61, 0x74, 0x65, 0x64, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x1a,
	0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66,
	0x2e, 0x42, 0x6f, 0x6f, 0x6c, 0x56, 0x61, 0x6c, 0x75, 0x65, 0x12, 0x37, 0x0a, 0x11, 0x55, 0x70,
	0x64, 0x61, 0x74, 0x65, 0x41, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x49, 0x6e, 0x66, 0x6f, 0x12,
	0x10, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x55, 0x73, 0x65,
	0x72, 0x1a, 0x10, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x55,
	0x73, 0x65, 0x72, 0x12, 0x41, 0x0a, 0x0b, 0x47, 0x65, 0x74, 0x55, 0x73, 0x65, 0x72, 0x42, 0x79,
	0x49, 0x64, 0x12, 0x20, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e,
	0x47, 0x65, 0x74, 0x4f, 0x62, 0x6a, 0x65, 0x63, 0x74, 0x42, 0x79, 0x49, 0x64, 0x52, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x1a, 0x10, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f,
	0x6e, 0x2e, 0x55, 0x73, 0x65, 0x72, 0x12, 0x68, 0x0a, 0x13, 0x47, 0x65, 0x6e, 0x65, 0x72, 0x61,
	0x74, 0x65, 0x41, 0x63, 0x63, 0x65, 0x73, 0x73, 0x54, 0x6f, 0x6b, 0x65, 0x6e, 0x12, 0x27, 0x2e,
	0x68, 0x74, 0x73, 0x2e, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x2e, 0x47, 0x65, 0x6e, 0x65,
	0x72, 0x61, 0x74, 0x65, 0x41, 0x63, 0x63, 0x65, 0x73, 0x73, 0x54, 0x6f, 0x6b, 0x65, 0x6e, 0x52,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x28, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x61, 0x63, 0x63,
	0x6f, 0x75, 0x6e, 0x74, 0x2e, 0x47, 0x65, 0x6e, 0x65, 0x72, 0x61, 0x74, 0x65, 0x41, 0x63, 0x63,
	0x65, 0x73, 0x73, 0x54, 0x6f, 0x6b, 0x65, 0x6e, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65,
	0x12, 0x4e, 0x0a, 0x0d, 0x48, 0x61, 0x73, 0x50, 0x65, 0x72, 0x6d, 0x69, 0x73, 0x73, 0x69, 0x6f,
	0x6e, 0x12, 0x21, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x2e,
	0x48, 0x61, 0x73, 0x50, 0x65, 0x72, 0x6d, 0x69, 0x73, 0x73, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x1a, 0x1a, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x42, 0x6f, 0x6f, 0x6c, 0x56, 0x61, 0x6c, 0x75, 0x65,
	0x12, 0x3a, 0x0a, 0x04, 0x50, 0x69, 0x6e, 0x67, 0x12, 0x16, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79,
	0x1a, 0x1a, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62,
	0x75, 0x66, 0x2e, 0x42, 0x6f, 0x6f, 0x6c, 0x56, 0x61, 0x6c, 0x75, 0x65, 0x42, 0x44, 0x0a, 0x10,
	0x61, 0x70, 0x70, 0x2e, 0x6f, 0x6e, 0x65, 0x70, 0x61, 0x73, 0x73, 0x2e, 0x61, 0x70, 0x69, 0x73,
	0x42, 0x0c, 0x41, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01,
	0x5a, 0x20, 0x6f, 0x6e, 0x65, 0x70, 0x61, 0x73, 0x73, 0x2e, 0x61, 0x70, 0x70, 0x2f, 0x66, 0x61,
	0x63, 0x69, 0x6c, 0x69, 0x74, 0x79, 0x2f, 0x68, 0x74, 0x73, 0x2f, 0x61, 0x63, 0x63, 0x6f, 0x75,
	0x6e, 0x74, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_hts_account_service_proto_rawDescOnce sync.Once
	file_hts_account_service_proto_rawDescData = file_hts_account_service_proto_rawDesc
)

func file_hts_account_service_proto_rawDescGZIP() []byte {
	file_hts_account_service_proto_rawDescOnce.Do(func() {
		file_hts_account_service_proto_rawDescData = protoimpl.X.CompressGZIP(file_hts_account_service_proto_rawDescData)
	})
	return file_hts_account_service_proto_rawDescData
}

var file_hts_account_service_proto_msgTypes = make([]protoimpl.MessageInfo, 7)
var file_hts_account_service_proto_goTypes = []interface{}{
	(*AccessTokenPayload)(nil),          // 0: hts.account.AccessTokenPayload
	(*IsAuthenticatedRequest)(nil),      // 1: hts.account.IsAuthenticatedRequest
	(*GenerateAccessTokenRequest)(nil),  // 2: hts.account.GenerateAccessTokenRequest
	(*GenerateAccessTokenResponse)(nil), // 3: hts.account.GenerateAccessTokenResponse
	(*HasPermissionRequest)(nil),        // 4: hts.account.HasPermissionRequest
	(*CreateUserRequest)(nil),           // 5: hts.account.CreateUserRequest
	(*GetUserByChulaIdRequest)(nil),     // 6: hts.account.GetUserByChulaIdRequest
	(common.Permission)(0),              // 7: hts.common.Permission
	(*common.User)(nil),                 // 8: hts.common.User
	(*common.GetObjectByIdRequest)(nil), // 9: hts.common.GetObjectByIdRequest
	(*emptypb.Empty)(nil),               // 10: google.protobuf.Empty
	(*wrapperspb.BoolValue)(nil),        // 11: google.protobuf.BoolValue
}
var file_hts_account_service_proto_depIdxs = []int32{
	7,  // 0: hts.account.HasPermissionRequest.permission_name:type_name -> hts.common.Permission
	5,  // 1: hts.account.AccountService.CreateUser:input_type -> hts.account.CreateUserRequest
	6,  // 2: hts.account.AccountService.GetUserByChulaId:input_type -> hts.account.GetUserByChulaIdRequest
	1,  // 3: hts.account.AccountService.IsAuthenticated:input_type -> hts.account.IsAuthenticatedRequest
	8,  // 4: hts.account.AccountService.UpdateAccountInfo:input_type -> hts.common.User
	9,  // 5: hts.account.AccountService.GetUserById:input_type -> hts.common.GetObjectByIdRequest
	2,  // 6: hts.account.AccountService.GenerateAccessToken:input_type -> hts.account.GenerateAccessTokenRequest
	4,  // 7: hts.account.AccountService.HasPermission:input_type -> hts.account.HasPermissionRequest
	10, // 8: hts.account.AccountService.Ping:input_type -> google.protobuf.Empty
	8,  // 9: hts.account.AccountService.CreateUser:output_type -> hts.common.User
	8,  // 10: hts.account.AccountService.GetUserByChulaId:output_type -> hts.common.User
	11, // 11: hts.account.AccountService.IsAuthenticated:output_type -> google.protobuf.BoolValue
	8,  // 12: hts.account.AccountService.UpdateAccountInfo:output_type -> hts.common.User
	8,  // 13: hts.account.AccountService.GetUserById:output_type -> hts.common.User
	3,  // 14: hts.account.AccountService.GenerateAccessToken:output_type -> hts.account.GenerateAccessTokenResponse
	11, // 15: hts.account.AccountService.HasPermission:output_type -> google.protobuf.BoolValue
	11, // 16: hts.account.AccountService.Ping:output_type -> google.protobuf.BoolValue
	9,  // [9:17] is the sub-list for method output_type
	1,  // [1:9] is the sub-list for method input_type
	1,  // [1:1] is the sub-list for extension type_name
	1,  // [1:1] is the sub-list for extension extendee
	0,  // [0:1] is the sub-list for field type_name
}

func init() { file_hts_account_service_proto_init() }
func file_hts_account_service_proto_init() {
	if File_hts_account_service_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_hts_account_service_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*AccessTokenPayload); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_hts_account_service_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*IsAuthenticatedRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_hts_account_service_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GenerateAccessTokenRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_hts_account_service_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GenerateAccessTokenResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_hts_account_service_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*HasPermissionRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_hts_account_service_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CreateUserRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_hts_account_service_proto_msgTypes[6].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GetUserByChulaIdRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_hts_account_service_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   7,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_hts_account_service_proto_goTypes,
		DependencyIndexes: file_hts_account_service_proto_depIdxs,
		MessageInfos:      file_hts_account_service_proto_msgTypes,
	}.Build()
	File_hts_account_service_proto = out.File
	file_hts_account_service_proto_rawDesc = nil
	file_hts_account_service_proto_goTypes = nil
	file_hts_account_service_proto_depIdxs = nil
}
