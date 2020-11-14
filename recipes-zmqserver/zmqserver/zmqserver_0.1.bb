#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

SUMMARY = "Simple zmqserver application"
SECTION = "zmqserver"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI =  "file://CMakeLists.txt \
            file://server.cpp \
            "

S = "${WORKDIR}"

DEPENDS += "zeromq cppzmq czmq"

inherit pkgconfig cmake

do_install() {
	     install -d ${D}${bindir}
	     install -m 0755 zmqserver ${D}${bindir}
}
