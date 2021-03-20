load("@rules_proto_grpc//:defs.bzl", "proto_plugin")

proto_plugin(
    name = "ts_plugin",
    output_directory = True,
    tool = "@npm_gql//ts-proto/bin:protoc-gen-ts_proto",
    visibility = ["//visibility:public"],
)
