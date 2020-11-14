#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

SUMMARY = "Simple keyboard setting"
SECTION = "keyboard"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://vconsole.conf"

S = "${WORKDIR}"

do_install() {
	     #install -d ${D}${bindir}
	     #install -m 0755 helloworld ${D}${bindir}
	     install -d ${D}/etc
	     install -m 0644 vconsole.conf ${D}/etc
}
	     
FILES_${PN} += "/etc/vconsole.conf"
