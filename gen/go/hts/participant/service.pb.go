// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.23.0
// 	protoc        v3.13.0
// source: hts/participant/service.proto

package participant

import (
	proto "github.com/golang/protobuf/proto"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
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

type IsEventAvailableRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Event *common.Event `protobuf:"bytes,1,opt,name=event,proto3" json:"event,omitempty"`
}

func (x *IsEventAvailableRequest) Reset() {
	*x = IsEventAvailableRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_hts_participant_service_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *IsEventAvailableRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*IsEventAvailableRequest) ProtoMessage() {}

func (x *IsEventAvailableRequest) ProtoReflect() protoreflect.Message {
	mi := &file_hts_participant_service_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use IsEventAvailableRequest.ProtoReflect.Descriptor instead.
func (*IsEventAvailableRequest) Descriptor() ([]byte, []int) {
	return file_hts_participant_service_proto_rawDescGZIP(), []int{0}
}

func (x *IsEventAvailableRequest) GetEvent() *common.Event {
	if x != nil {
		return x.Event
	}
	return nil
}

type JoinEventRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	User  *common.User  `protobuf:"bytes,1,opt,name=user,proto3" json:"user,omitempty"`
	Event *common.Event `protobuf:"bytes,2,opt,name=event,proto3" json:"event,omitempty"`
}

func (x *JoinEventRequest) Reset() {
	*x = JoinEventRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_hts_participant_service_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *JoinEventRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*JoinEventRequest) ProtoMessage() {}

func (x *JoinEventRequest) ProtoReflect() protoreflect.Message {
	mi := &file_hts_participant_service_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use JoinEventRequest.ProtoReflect.Descriptor instead.
func (*JoinEventRequest) Descriptor() ([]byte, []int) {
	return file_hts_participant_service_proto_rawDescGZIP(), []int{1}
}

func (x *JoinEventRequest) GetUser() *common.User {
	if x != nil {
		return x.User
	}
	return nil
}

func (x *JoinEventRequest) GetEvent() *common.Event {
	if x != nil {
		return x.Event
	}
	return nil
}

type CancelEventRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	User  *common.User  `protobuf:"bytes,1,opt,name=user,proto3" json:"user,omitempty"`
	Event *common.Event `protobuf:"bytes,2,opt,name=event,proto3" json:"event,omitempty"`
}

func (x *CancelEventRequest) Reset() {
	*x = CancelEventRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_hts_participant_service_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CancelEventRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CancelEventRequest) ProtoMessage() {}

func (x *CancelEventRequest) ProtoReflect() protoreflect.Message {
	mi := &file_hts_participant_service_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CancelEventRequest.ProtoReflect.Descriptor instead.
func (*CancelEventRequest) Descriptor() ([]byte, []int) {
	return file_hts_participant_service_proto_rawDescGZIP(), []int{2}
}

func (x *CancelEventRequest) GetUser() *common.User {
	if x != nil {
		return x.User
	}
	return nil
}

func (x *CancelEventRequest) GetEvent() *common.Event {
	if x != nil {
		return x.Event
	}
	return nil
}

type CreateFeedbackRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	User     *common.User          `protobuf:"bytes,1,opt,name=user,proto3" json:"user,omitempty"`
	Feedback *common.EventFeedback `protobuf:"bytes,2,opt,name=feedback,proto3" json:"feedback,omitempty"`
}

func (x *CreateFeedbackRequest) Reset() {
	*x = CreateFeedbackRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_hts_participant_service_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CreateFeedbackRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateFeedbackRequest) ProtoMessage() {}

func (x *CreateFeedbackRequest) ProtoReflect() protoreflect.Message {
	mi := &file_hts_participant_service_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CreateFeedbackRequest.ProtoReflect.Descriptor instead.
func (*CreateFeedbackRequest) Descriptor() ([]byte, []int) {
	return file_hts_participant_service_proto_rawDescGZIP(), []int{3}
}

func (x *CreateFeedbackRequest) GetUser() *common.User {
	if x != nil {
		return x.User
	}
	return nil
}

func (x *CreateFeedbackRequest) GetFeedback() *common.EventFeedback {
	if x != nil {
		return x.Feedback
	}
	return nil
}

type RemoveFeedbackRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Feedback *common.EventFeedback `protobuf:"bytes,1,opt,name=feedback,proto3" json:"feedback,omitempty"`
}

func (x *RemoveFeedbackRequest) Reset() {
	*x = RemoveFeedbackRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_hts_participant_service_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *RemoveFeedbackRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*RemoveFeedbackRequest) ProtoMessage() {}

func (x *RemoveFeedbackRequest) ProtoReflect() protoreflect.Message {
	mi := &file_hts_participant_service_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use RemoveFeedbackRequest.ProtoReflect.Descriptor instead.
func (*RemoveFeedbackRequest) Descriptor() ([]byte, []int) {
	return file_hts_participant_service_proto_rawDescGZIP(), []int{4}
}

func (x *RemoveFeedbackRequest) GetFeedback() *common.EventFeedback {
	if x != nil {
		return x.Feedback
	}
	return nil
}

type SearchEventsByNameRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Name string `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
}

func (x *SearchEventsByNameRequest) Reset() {
	*x = SearchEventsByNameRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_hts_participant_service_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SearchEventsByNameRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SearchEventsByNameRequest) ProtoMessage() {}

func (x *SearchEventsByNameRequest) ProtoReflect() protoreflect.Message {
	mi := &file_hts_participant_service_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SearchEventsByNameRequest.ProtoReflect.Descriptor instead.
func (*SearchEventsByNameRequest) Descriptor() ([]byte, []int) {
	return file_hts_participant_service_proto_rawDescGZIP(), []int{5}
}

func (x *SearchEventsByNameRequest) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

type SearchEventsByNameRespond struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Events []*common.Event `protobuf:"bytes,1,rep,name=events,proto3" json:"events,omitempty"`
}

func (x *SearchEventsByNameRespond) Reset() {
	*x = SearchEventsByNameRespond{}
	if protoimpl.UnsafeEnabled {
		mi := &file_hts_participant_service_proto_msgTypes[6]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SearchEventsByNameRespond) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SearchEventsByNameRespond) ProtoMessage() {}

func (x *SearchEventsByNameRespond) ProtoReflect() protoreflect.Message {
	mi := &file_hts_participant_service_proto_msgTypes[6]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SearchEventsByNameRespond.ProtoReflect.Descriptor instead.
func (*SearchEventsByNameRespond) Descriptor() ([]byte, []int) {
	return file_hts_participant_service_proto_rawDescGZIP(), []int{6}
}

func (x *SearchEventsByNameRespond) GetEvents() []*common.Event {
	if x != nil {
		return x.Events
	}
	return nil
}

type GenerateQRRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	UserEvent *common.UserEvent `protobuf:"bytes,1,opt,name=user_event,json=userEvent,proto3" json:"user_event,omitempty"`
}

func (x *GenerateQRRequest) Reset() {
	*x = GenerateQRRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_hts_participant_service_proto_msgTypes[7]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GenerateQRRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GenerateQRRequest) ProtoMessage() {}

func (x *GenerateQRRequest) ProtoReflect() protoreflect.Message {
	mi := &file_hts_participant_service_proto_msgTypes[7]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GenerateQRRequest.ProtoReflect.Descriptor instead.
func (*GenerateQRRequest) Descriptor() ([]byte, []int) {
	return file_hts_participant_service_proto_rawDescGZIP(), []int{7}
}

func (x *GenerateQRRequest) GetUserEvent() *common.UserEvent {
	if x != nil {
		return x.UserEvent
	}
	return nil
}

type GenerateQRRespond struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Data string `protobuf:"bytes,1,opt,name=data,proto3" json:"data,omitempty"`
}

func (x *GenerateQRRespond) Reset() {
	*x = GenerateQRRespond{}
	if protoimpl.UnsafeEnabled {
		mi := &file_hts_participant_service_proto_msgTypes[8]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GenerateQRRespond) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GenerateQRRespond) ProtoMessage() {}

func (x *GenerateQRRespond) ProtoReflect() protoreflect.Message {
	mi := &file_hts_participant_service_proto_msgTypes[8]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GenerateQRRespond.ProtoReflect.Descriptor instead.
func (*GenerateQRRespond) Descriptor() ([]byte, []int) {
	return file_hts_participant_service_proto_rawDescGZIP(), []int{8}
}

func (x *GenerateQRRespond) GetData() string {
	if x != nil {
		return x.Data
	}
	return ""
}

var File_hts_participant_service_proto protoreflect.FileDescriptor

var file_hts_participant_service_proto_rawDesc = []byte{
	0x0a, 0x1d, 0x68, 0x74, 0x73, 0x2f, 0x70, 0x61, 0x72, 0x74, 0x69, 0x63, 0x69, 0x70, 0x61, 0x6e,
	0x74, 0x2f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12,
	0x0f, 0x68, 0x74, 0x73, 0x2e, 0x70, 0x61, 0x72, 0x74, 0x69, 0x63, 0x69, 0x70, 0x61, 0x6e, 0x74,
	0x1a, 0x17, 0x68, 0x74, 0x73, 0x2f, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2f, 0x63, 0x6f, 0x6d,
	0x6d, 0x6f, 0x6e, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x42, 0x0a, 0x17, 0x49, 0x73, 0x45,
	0x76, 0x65, 0x6e, 0x74, 0x41, 0x76, 0x61, 0x69, 0x6c, 0x61, 0x62, 0x6c, 0x65, 0x52, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x12, 0x27, 0x0a, 0x05, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x0b, 0x32, 0x11, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e,
	0x2e, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x52, 0x05, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x22, 0x61, 0x0a,
	0x10, 0x4a, 0x6f, 0x69, 0x6e, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73,
	0x74, 0x12, 0x24, 0x0a, 0x04, 0x75, 0x73, 0x65, 0x72, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32,
	0x10, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x55, 0x73, 0x65,
	0x72, 0x52, 0x04, 0x75, 0x73, 0x65, 0x72, 0x12, 0x27, 0x0a, 0x05, 0x65, 0x76, 0x65, 0x6e, 0x74,
	0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x11, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x63, 0x6f, 0x6d,
	0x6d, 0x6f, 0x6e, 0x2e, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x52, 0x05, 0x65, 0x76, 0x65, 0x6e, 0x74,
	0x22, 0x63, 0x0a, 0x12, 0x43, 0x61, 0x6e, 0x63, 0x65, 0x6c, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x52,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x24, 0x0a, 0x04, 0x75, 0x73, 0x65, 0x72, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x0b, 0x32, 0x10, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f,
	0x6e, 0x2e, 0x55, 0x73, 0x65, 0x72, 0x52, 0x04, 0x75, 0x73, 0x65, 0x72, 0x12, 0x27, 0x0a, 0x05,
	0x65, 0x76, 0x65, 0x6e, 0x74, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x11, 0x2e, 0x68, 0x74,
	0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x52, 0x05,
	0x65, 0x76, 0x65, 0x6e, 0x74, 0x22, 0x74, 0x0a, 0x15, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x46,
	0x65, 0x65, 0x64, 0x62, 0x61, 0x63, 0x6b, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x24,
	0x0a, 0x04, 0x75, 0x73, 0x65, 0x72, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x10, 0x2e, 0x68,
	0x74, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x55, 0x73, 0x65, 0x72, 0x52, 0x04,
	0x75, 0x73, 0x65, 0x72, 0x12, 0x35, 0x0a, 0x08, 0x66, 0x65, 0x65, 0x64, 0x62, 0x61, 0x63, 0x6b,
	0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x19, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x63, 0x6f, 0x6d,
	0x6d, 0x6f, 0x6e, 0x2e, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x46, 0x65, 0x65, 0x64, 0x62, 0x61, 0x63,
	0x6b, 0x52, 0x08, 0x66, 0x65, 0x65, 0x64, 0x62, 0x61, 0x63, 0x6b, 0x22, 0x4e, 0x0a, 0x15, 0x52,
	0x65, 0x6d, 0x6f, 0x76, 0x65, 0x46, 0x65, 0x65, 0x64, 0x62, 0x61, 0x63, 0x6b, 0x52, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x12, 0x35, 0x0a, 0x08, 0x66, 0x65, 0x65, 0x64, 0x62, 0x61, 0x63, 0x6b,
	0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x19, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x63, 0x6f, 0x6d,
	0x6d, 0x6f, 0x6e, 0x2e, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x46, 0x65, 0x65, 0x64, 0x62, 0x61, 0x63,
	0x6b, 0x52, 0x08, 0x66, 0x65, 0x65, 0x64, 0x62, 0x61, 0x63, 0x6b, 0x22, 0x2f, 0x0a, 0x19, 0x53,
	0x65, 0x61, 0x72, 0x63, 0x68, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x73, 0x42, 0x79, 0x4e, 0x61, 0x6d,
	0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x12, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65,
	0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x22, 0x46, 0x0a, 0x19,
	0x53, 0x65, 0x61, 0x72, 0x63, 0x68, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x73, 0x42, 0x79, 0x4e, 0x61,
	0x6d, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x64, 0x12, 0x29, 0x0a, 0x06, 0x65, 0x76, 0x65,
	0x6e, 0x74, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x11, 0x2e, 0x68, 0x74, 0x73, 0x2e,
	0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x52, 0x06, 0x65, 0x76,
	0x65, 0x6e, 0x74, 0x73, 0x22, 0x49, 0x0a, 0x11, 0x47, 0x65, 0x6e, 0x65, 0x72, 0x61, 0x74, 0x65,
	0x51, 0x52, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x34, 0x0a, 0x0a, 0x75, 0x73, 0x65,
	0x72, 0x5f, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x15, 0x2e,
	0x68, 0x74, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x55, 0x73, 0x65, 0x72, 0x45,
	0x76, 0x65, 0x6e, 0x74, 0x52, 0x09, 0x75, 0x73, 0x65, 0x72, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x22,
	0x27, 0x0a, 0x11, 0x47, 0x65, 0x6e, 0x65, 0x72, 0x61, 0x74, 0x65, 0x51, 0x52, 0x52, 0x65, 0x73,
	0x70, 0x6f, 0x6e, 0x64, 0x12, 0x12, 0x0a, 0x04, 0x64, 0x61, 0x74, 0x61, 0x18, 0x01, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x04, 0x64, 0x61, 0x74, 0x61, 0x32, 0xd2, 0x04, 0x0a, 0x12, 0x50, 0x61, 0x72,
	0x74, 0x69, 0x63, 0x69, 0x70, 0x61, 0x6e, 0x74, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x12,
	0x50, 0x0a, 0x10, 0x49, 0x73, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x41, 0x76, 0x61, 0x69, 0x6c, 0x61,
	0x62, 0x6c, 0x65, 0x12, 0x28, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x70, 0x61, 0x72, 0x74, 0x69, 0x63,
	0x69, 0x70, 0x61, 0x6e, 0x74, 0x2e, 0x49, 0x73, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x41, 0x76, 0x61,
	0x69, 0x6c, 0x61, 0x62, 0x6c, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x12, 0x2e,
	0x68, 0x74, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x52, 0x65, 0x73, 0x75, 0x6c,
	0x74, 0x12, 0x42, 0x0a, 0x09, 0x4a, 0x6f, 0x69, 0x6e, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x12, 0x21,
	0x2e, 0x68, 0x74, 0x73, 0x2e, 0x70, 0x61, 0x72, 0x74, 0x69, 0x63, 0x69, 0x70, 0x61, 0x6e, 0x74,
	0x2e, 0x4a, 0x6f, 0x69, 0x6e, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73,
	0x74, 0x1a, 0x12, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x52,
	0x65, 0x73, 0x75, 0x6c, 0x74, 0x12, 0x46, 0x0a, 0x0b, 0x43, 0x61, 0x6e, 0x63, 0x65, 0x6c, 0x45,
	0x76, 0x65, 0x6e, 0x74, 0x12, 0x23, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x70, 0x61, 0x72, 0x74, 0x69,
	0x63, 0x69, 0x70, 0x61, 0x6e, 0x74, 0x2e, 0x43, 0x61, 0x6e, 0x63, 0x65, 0x6c, 0x45, 0x76, 0x65,
	0x6e, 0x74, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x12, 0x2e, 0x68, 0x74, 0x73, 0x2e,
	0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x52, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x12, 0x4c, 0x0a,
	0x0e, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x46, 0x65, 0x65, 0x64, 0x62, 0x61, 0x63, 0x6b, 0x12,
	0x26, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x70, 0x61, 0x72, 0x74, 0x69, 0x63, 0x69, 0x70, 0x61, 0x6e,
	0x74, 0x2e, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x46, 0x65, 0x65, 0x64, 0x62, 0x61, 0x63, 0x6b,
	0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x12, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x63, 0x6f,
	0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x52, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x12, 0x4c, 0x0a, 0x0e, 0x52,
	0x65, 0x6d, 0x6f, 0x76, 0x65, 0x46, 0x65, 0x65, 0x64, 0x62, 0x61, 0x63, 0x6b, 0x12, 0x26, 0x2e,
	0x68, 0x74, 0x73, 0x2e, 0x70, 0x61, 0x72, 0x74, 0x69, 0x63, 0x69, 0x70, 0x61, 0x6e, 0x74, 0x2e,
	0x52, 0x65, 0x6d, 0x6f, 0x76, 0x65, 0x46, 0x65, 0x65, 0x64, 0x62, 0x61, 0x63, 0x6b, 0x52, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x12, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x63, 0x6f, 0x6d, 0x6d,
	0x6f, 0x6e, 0x2e, 0x52, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x12, 0x6c, 0x0a, 0x12, 0x53, 0x65, 0x61,
	0x72, 0x63, 0x68, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x73, 0x42, 0x79, 0x4e, 0x61, 0x6d, 0x65, 0x12,
	0x2a, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x70, 0x61, 0x72, 0x74, 0x69, 0x63, 0x69, 0x70, 0x61, 0x6e,
	0x74, 0x2e, 0x53, 0x65, 0x61, 0x72, 0x63, 0x68, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x73, 0x42, 0x79,
	0x4e, 0x61, 0x6d, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x2a, 0x2e, 0x68, 0x74,
	0x73, 0x2e, 0x70, 0x61, 0x72, 0x74, 0x69, 0x63, 0x69, 0x70, 0x61, 0x6e, 0x74, 0x2e, 0x53, 0x65,
	0x61, 0x72, 0x63, 0x68, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x73, 0x42, 0x79, 0x4e, 0x61, 0x6d, 0x65,
	0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x64, 0x12, 0x54, 0x0a, 0x0a, 0x47, 0x65, 0x6e, 0x65, 0x72,
	0x61, 0x74, 0x65, 0x51, 0x52, 0x12, 0x22, 0x2e, 0x68, 0x74, 0x73, 0x2e, 0x70, 0x61, 0x72, 0x74,
	0x69, 0x63, 0x69, 0x70, 0x61, 0x6e, 0x74, 0x2e, 0x47, 0x65, 0x6e, 0x65, 0x72, 0x61, 0x74, 0x65,
	0x51, 0x52, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x22, 0x2e, 0x68, 0x74, 0x73, 0x2e,
	0x70, 0x61, 0x72, 0x74, 0x69, 0x63, 0x69, 0x70, 0x61, 0x6e, 0x74, 0x2e, 0x47, 0x65, 0x6e, 0x65,
	0x72, 0x61, 0x74, 0x65, 0x51, 0x52, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x64, 0x42, 0x4c, 0x0a,
	0x10, 0x61, 0x70, 0x70, 0x2e, 0x6f, 0x6e, 0x65, 0x70, 0x61, 0x73, 0x73, 0x2e, 0x61, 0x70, 0x69,
	0x73, 0x42, 0x10, 0x50, 0x61, 0x72, 0x74, 0x69, 0x63, 0x69, 0x70, 0x61, 0x6e, 0x74, 0x50, 0x72,
	0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x24, 0x6f, 0x6e, 0x65, 0x70, 0x61, 0x73, 0x73, 0x2e, 0x61,
	0x70, 0x70, 0x2f, 0x66, 0x61, 0x63, 0x69, 0x6c, 0x69, 0x74, 0x79, 0x2f, 0x68, 0x74, 0x73, 0x2f,
	0x70, 0x61, 0x72, 0x74, 0x69, 0x63, 0x69, 0x70, 0x61, 0x6e, 0x74, 0x62, 0x06, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x33,
}

var (
	file_hts_participant_service_proto_rawDescOnce sync.Once
	file_hts_participant_service_proto_rawDescData = file_hts_participant_service_proto_rawDesc
)

func file_hts_participant_service_proto_rawDescGZIP() []byte {
	file_hts_participant_service_proto_rawDescOnce.Do(func() {
		file_hts_participant_service_proto_rawDescData = protoimpl.X.CompressGZIP(file_hts_participant_service_proto_rawDescData)
	})
	return file_hts_participant_service_proto_rawDescData
}

var file_hts_participant_service_proto_msgTypes = make([]protoimpl.MessageInfo, 9)
var file_hts_participant_service_proto_goTypes = []interface{}{
	(*IsEventAvailableRequest)(nil),   // 0: hts.participant.IsEventAvailableRequest
	(*JoinEventRequest)(nil),          // 1: hts.participant.JoinEventRequest
	(*CancelEventRequest)(nil),        // 2: hts.participant.CancelEventRequest
	(*CreateFeedbackRequest)(nil),     // 3: hts.participant.CreateFeedbackRequest
	(*RemoveFeedbackRequest)(nil),     // 4: hts.participant.RemoveFeedbackRequest
	(*SearchEventsByNameRequest)(nil), // 5: hts.participant.SearchEventsByNameRequest
	(*SearchEventsByNameRespond)(nil), // 6: hts.participant.SearchEventsByNameRespond
	(*GenerateQRRequest)(nil),         // 7: hts.participant.GenerateQRRequest
	(*GenerateQRRespond)(nil),         // 8: hts.participant.GenerateQRRespond
	(*common.Event)(nil),              // 9: hts.common.Event
	(*common.User)(nil),               // 10: hts.common.User
	(*common.EventFeedback)(nil),      // 11: hts.common.EventFeedback
	(*common.UserEvent)(nil),          // 12: hts.common.UserEvent
	(*common.Result)(nil),             // 13: hts.common.Result
}
var file_hts_participant_service_proto_depIdxs = []int32{
	9,  // 0: hts.participant.IsEventAvailableRequest.event:type_name -> hts.common.Event
	10, // 1: hts.participant.JoinEventRequest.user:type_name -> hts.common.User
	9,  // 2: hts.participant.JoinEventRequest.event:type_name -> hts.common.Event
	10, // 3: hts.participant.CancelEventRequest.user:type_name -> hts.common.User
	9,  // 4: hts.participant.CancelEventRequest.event:type_name -> hts.common.Event
	10, // 5: hts.participant.CreateFeedbackRequest.user:type_name -> hts.common.User
	11, // 6: hts.participant.CreateFeedbackRequest.feedback:type_name -> hts.common.EventFeedback
	11, // 7: hts.participant.RemoveFeedbackRequest.feedback:type_name -> hts.common.EventFeedback
	9,  // 8: hts.participant.SearchEventsByNameRespond.events:type_name -> hts.common.Event
	12, // 9: hts.participant.GenerateQRRequest.user_event:type_name -> hts.common.UserEvent
	0,  // 10: hts.participant.ParticipantService.IsEventAvailable:input_type -> hts.participant.IsEventAvailableRequest
	1,  // 11: hts.participant.ParticipantService.JoinEvent:input_type -> hts.participant.JoinEventRequest
	2,  // 12: hts.participant.ParticipantService.CancelEvent:input_type -> hts.participant.CancelEventRequest
	3,  // 13: hts.participant.ParticipantService.CreateFeedback:input_type -> hts.participant.CreateFeedbackRequest
	4,  // 14: hts.participant.ParticipantService.RemoveFeedback:input_type -> hts.participant.RemoveFeedbackRequest
	5,  // 15: hts.participant.ParticipantService.SearchEventsByName:input_type -> hts.participant.SearchEventsByNameRequest
	7,  // 16: hts.participant.ParticipantService.GenerateQR:input_type -> hts.participant.GenerateQRRequest
	13, // 17: hts.participant.ParticipantService.IsEventAvailable:output_type -> hts.common.Result
	13, // 18: hts.participant.ParticipantService.JoinEvent:output_type -> hts.common.Result
	13, // 19: hts.participant.ParticipantService.CancelEvent:output_type -> hts.common.Result
	13, // 20: hts.participant.ParticipantService.CreateFeedback:output_type -> hts.common.Result
	13, // 21: hts.participant.ParticipantService.RemoveFeedback:output_type -> hts.common.Result
	6,  // 22: hts.participant.ParticipantService.SearchEventsByName:output_type -> hts.participant.SearchEventsByNameRespond
	8,  // 23: hts.participant.ParticipantService.GenerateQR:output_type -> hts.participant.GenerateQRRespond
	17, // [17:24] is the sub-list for method output_type
	10, // [10:17] is the sub-list for method input_type
	10, // [10:10] is the sub-list for extension type_name
	10, // [10:10] is the sub-list for extension extendee
	0,  // [0:10] is the sub-list for field type_name
}

func init() { file_hts_participant_service_proto_init() }
func file_hts_participant_service_proto_init() {
	if File_hts_participant_service_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_hts_participant_service_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*IsEventAvailableRequest); i {
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
		file_hts_participant_service_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*JoinEventRequest); i {
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
		file_hts_participant_service_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CancelEventRequest); i {
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
		file_hts_participant_service_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CreateFeedbackRequest); i {
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
		file_hts_participant_service_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*RemoveFeedbackRequest); i {
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
		file_hts_participant_service_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SearchEventsByNameRequest); i {
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
		file_hts_participant_service_proto_msgTypes[6].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SearchEventsByNameRespond); i {
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
		file_hts_participant_service_proto_msgTypes[7].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GenerateQRRequest); i {
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
		file_hts_participant_service_proto_msgTypes[8].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GenerateQRRespond); i {
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
			RawDescriptor: file_hts_participant_service_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   9,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_hts_participant_service_proto_goTypes,
		DependencyIndexes: file_hts_participant_service_proto_depIdxs,
		MessageInfos:      file_hts_participant_service_proto_msgTypes,
	}.Build()
	File_hts_participant_service_proto = out.File
	file_hts_participant_service_proto_rawDesc = nil
	file_hts_participant_service_proto_goTypes = nil
	file_hts_participant_service_proto_depIdxs = nil
}