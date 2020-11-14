#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

SUMMARY = "Simple cmaketest application"
SECTION = "cmaketest"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI =   "file://CMakeLists.txt \
            file://main.cpp \
            "

S = "${WORKDIR}"

inherit pkgconfig cmake

#do_compile() {
#	     ${CXX} ${LDFLAGS} helloworld.cpp -o cpptest
#}

do_install() {
	     install -d ${D}${bindir}
	     install -m 0755 cmaketest ${D}${bindir}
}
