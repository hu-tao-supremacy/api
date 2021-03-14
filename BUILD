proto_library(
    name = "common_proto",
    srcs = ["hts/common/common.proto"],
    visibility = ["//visibility:public"],
    deps = [
        "@com_google_protobuf//:timestamp_proto",
        "@com_google_protobuf//:empty_proto",
        "@com_google_protobuf//:wrappers_proto",
    ],
)

proto_library(
    name = "account_proto",
    srcs = ["hts/account/service.proto"],
    visibility = ["//visibility:public"],
    deps = [
        "@com_google_protobuf//:timestamp_proto",
        "@com_google_protobuf//:empty_proto",
        "@com_google_protobuf//:wrappers_proto",
        ":common_proto"
    ],
)

proto_library(
    name = "facility_proto",
    srcs = ["hts/facility/service.proto"],
    visibility = ["//visibility:public"],
    deps = [
        "@com_google_protobuf//:timestamp_proto",
        "@com_google_protobuf//:empty_proto",
        "@com_google_protobuf//:wrappers_proto",
        ":common_proto"
    ],
)

proto_library(
    name = "organizer_proto",
    srcs = ["hts/organizer/service.proto"],
    visibility = ["//visibility:public"],
    deps = [
        "@com_google_protobuf//:timestamp_proto",
        "@com_google_protobuf//:empty_proto",
        "@com_google_protobuf//:wrappers_proto",
        ":common_proto"
    ],
)

proto_library(
    name = "participant_proto",
    srcs = ["hts/participant/service.proto"],
    visibility = ["//visibility:public"],
    deps = [
        "@com_google_protobuf//:timestamp_proto",
        "@com_google_protobuf//:empty_proto",
        "@com_google_protobuf//:wrappers_proto",
        ":common_proto"
    ],
)

load("@rules_proto_grpc//go:defs.bzl", "go_grpc_compile")

go_grpc_compile(
    name = "go",
    prefix_path = "bzl-gen",
    deps = [
        ":common_proto",
        ":account_proto",
    ],
)

load("@rules_proto_grpc//js:defs.bzl", "js_grpc_node_compile")

js_grpc_node_compile(
    name = "api-gateway",
    prefix_path = "bzl-gen",
    protos = [
        ":common_proto",
        ":account_proto"
    ],
)

load("@rules_proto_grpc//java:defs.bzl", "java_grpc_compile")

java_grpc_compile(
    name = "java",
    prefix_path = "bzl-gen",
    protos = [
        ":common_proto",
        ":account_proto"
    ],
)

load("@rules_proto_grpc//python:defs.bzl", "python_grpc_compile")

python_grpc_compile(
    name = "python",
    prefix_path = "bzl-gen",
    protos = [
        ":common_proto",
        ":account_proto"
    ],
)
