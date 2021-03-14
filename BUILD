proto_library(
    name = "common_proto",
    src = ["proto/hts/common/common.proto"],
    deps = [
        "@com_google_protobuf//:timestamp_proto",
        "@com_google_protobuf//:empty_proto",
        "@com_google_protobuf//:wrappers_proto",
    ],
)

proto_library(
    name = "account_proto",
    src = ["proto/hts/account/service.proto"],
    deps = [
        "@com_google_protobuf//:timestamp_proto",
        "@com_google_protobuf//:empty_proto",
        "@com_google_protobuf//:wrappers_proto",
        ":common_proto"
    ],
)

proto_library(
    name = "facility_proto",
    src = ["proto/hts/facility/service.proto"],
    deps = [
        "@com_google_protobuf//:timestamp_proto",
        "@com_google_protobuf//:empty_proto",
        "@com_google_protobuf//:wrappers_proto",
        ":common_proto"
    ],
)

proto_library(
    name = "organizer_proto",
    src = ["proto/hts/organizer/service.proto"],
    deps = [
        "@com_google_protobuf//:timestamp_proto",
        "@com_google_protobuf//:empty_proto",
        "@com_google_protobuf//:wrappers_proto",
        ":common_proto"
    ],
)

proto_library(
    name = "participant_proto",
    src = ["proto/hts/participant/service.proto"],
    deps = [
        "@com_google_protobuf//:timestamp_proto",
        "@com_google_protobuf//:empty_proto",
        "@com_google_protobuf//:wrappers_proto",
        ":common_proto"
    ],
)

load("@build_stack_rules_proto//go:go_grpc_compile.bzl", "go_grpc_compile")

go_grpc_compile(
    name = "go",
    deps = [
        ":common_proto",
        ":account_proto",
        ":facility_proto",
        ":organizer_proto",
        ":participant_proto",
    ],
)
