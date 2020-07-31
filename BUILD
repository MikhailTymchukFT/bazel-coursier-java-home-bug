load("@rules_java//java:defs.bzl", "java_binary", "java_library", "java_test")


java_library(
    name = "main",
    srcs = glob(["target/**/*.java"])
)

java_binary(
    name = "A",
    main_class = "example.A",
    tags = ["manual"],
    runtime_deps = [
        ":main"
    ],
)

java_binary(
    name = "B",
    main_class = "example.B",
    runtime_deps = [
        ":main"
    ],
)
