load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

http_archive(
    name = "build_stack_rules_proto",
    urls = ["https://github.com/stackb/rules_proto/archive/{GIT_COMMIT_ID}.tar.gz"],
    sha256 = "{ARCHIVE_TAR_GZ_SHA256}",
    strip_prefix = "rules_proto-{GIT_COMMIT_ID}",
)
