setup:
	@cd $(dirname $0)
	ln -s proto/hts hts

generate:
	@cd $(dirname $0)
	bazel build //:go
	bazel build //:python
	bazel build //:java
	bazel build //:nest
	bazel build //:ts
	bazel build //:api-gateway

	rm -rf gen
	mkdir -p gen/go
	mkdir -p gen/java
	mkdir -p gen/nest
	mkdir -p gen/ts
	mkdir -p gen/api-gateway
	mkdir -p gen/python

	mv bazel-bin/go/gen/hts gen/go/.
	mv bazel-bin/python/gen/hts gen/python/.

	cp -r bazel-bin/java/gen/java.srcjar gen/java/.
	cp -r bazel-bin/java/gen/java_grpc.srcjar gen/java/.
	mv gen/java/java.srcjar gen/java/java.zip
	mv gen/java/java_grpc.srcjar gen/java/java_grpc.zip
	ditto -xk gen/java/java.zip gen/java
	ditto -xk gen/java/java_grpc.zip gen/java
	rm -rf gen/java/java.zip
	rm -rf gen/java/java_grpc.zip
	rm -rf gen/java/META-INF

	cp -r bazel-bin/nest/gen/hts gen/nest/.
	cp -r bazel-bin/ts/gen/hts gen/ts/.
	cp -r bazel-bin/nest/gen/google gen/nest/.
	cp -r bazel-bin/ts/gen/google gen/ts/.
	cp -r bazel-bin/api-gateway/gen/hts gen/api-gateway/.
