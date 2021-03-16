load("@rules_proto_grpc//:defs.bzl", "proto_plugin")

proto_plugin(
    name = "nest_plugin",
    output_directory = True,
    tool = "@npm//ts-proto/bin:protoc-gen-ts_proto",
    visibility = ["//visibility:public"],
)
