setup:
	@cd $(dirname $0)
	ln -s proto/hts hts

generate:
	@cd $(dirname $0)
	bazel build //:go
	bazel build //:python
	bazel build //:java
	bazel build //:nest
	bazel build //:gql

	rm -rf gen
	mkdir -p gen/go
	mkdir -p gen/java
	mkdir -p gen/nest
	mkdir -p gen/gql
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
	cp -r bazel-bin/gql/gen/hts gen/gql/.
	cp -r bazel-bin/nest/gen/google gen/nest/.
	cp -r bazel-bin/gql/gen/google gen/gql/.


generate-linux:
	@cd $(dirname $0)
	bazel build //:go
	bazel build //:python
	bazel build //:java
	bazel build //:nest
	bazel build //:gql

	rm -rf gen
	mkdir -p gen/go
	mkdir -p gen/java
	mkdir -p gen/nest
	mkdir -p gen/gql
	mkdir -p gen/python

	mv bazel-bin/go/gen/hts gen/go/.
	mv bazel-bin/python/gen/hts gen/python/.

	cp -r bazel-bin/java/gen/java.srcjar gen/java/.
	cp -r bazel-bin/java/gen/java_grpc.srcjar gen/java/.
	mv gen/java/java.srcjar gen/java/java.zip
	mv gen/java/java_grpc.srcjar gen/java/java_grpc.zip
	unzip gen/java/java.zip -d gen/java
	unzip gen/java/java_grpc.zip -d gen/java
	rm -rf gen/java/java.zip
	rm -rf gen/java/java_grpc.zip
	rm -rf gen/java/META-INF

	cp -r bazel-bin/nest/gen/hts gen/nest/.
	cp -r bazel-bin/gql/gen/hts gen/gql/.
	cp -r bazel-bin/nest/gen/google gen/nest/.
	cp -r bazel-bin/gql/gen/google gen/gql/.
