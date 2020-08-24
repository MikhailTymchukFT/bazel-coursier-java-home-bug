load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

RULES_JVM_EXTERNAL_TAG = "3.2"
RULES_JVM_EXTERNAL_SHA = "82262ff4223c5fda6fb7ff8bd63db8131b51b413d26eb49e3131037e79e324af"

http_archive(
    name = "rules_jvm_external",
    sha256 = RULES_JVM_EXTERNAL_SHA,
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % RULES_JVM_EXTERNAL_TAG,
)

load("@rules_jvm_external//:defs.bzl", "maven_install")

maven_install(
    artifacts = [
        "junit:junit:4.12"
    ],
    fetch_sources = True,
    repositories = [
        "http://uk.maven.org/maven2",
        "https://jcenter.bintray.com/",
    ],
)

http_archive(
    name = "openjdk8u202_darwin_archive",
    build_file_content = """
package(default_visibility = ["//visibility:public"])

java_runtime(
    name = 'runtime',
    srcs =  glob(['**']),
    java='//:Contents/Home/bin/java',
    java_home='abc'
)
""",
    sha256 = "059f7c18faa6722aa636bbd79bcdff3aee6a6da5b34940b072ea6e3af85bbe1d",
    strip_prefix = "jdk8u202-b08",
    urls = ["https://github.com/AdoptOpenJDK/openjdk8-binaries/releases/download/jdk8u202-b08/OpenJDK8U-jdk_x64_mac_hotspot_8u202b08.tar.gz"],
)