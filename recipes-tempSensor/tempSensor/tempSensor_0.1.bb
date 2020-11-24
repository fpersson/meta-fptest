#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

SUMMARY = "Simple temperatue application"
SECTION = "tempSensor"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit pkgconfig cmake systemd

SYSTEMD_AUTO_ENABLE = "enable"
SYSTEMD_SERVICE_${PN} = "tempsensor.service"

SRC_URI =  "git://github.com/fpersson/tempSensor.git"
SRCREV = "454405c85f3acd36363546ac8ce671530a8ddf6a"
SRC_URI[sha256sum] = "e9588c6c831ac05bc2754810fb86fedaea60d90ccfe1e6f1fa77a067117153c1"

SRC_URI += "file://tempsensor.ini"
FILES_${PN} += "/etc/tempsensor.ini"

SRC_URI_append = " file://tempsensor.service "
FILES_${PN} += "${systemd_unitdir}/system/tempsensor.service"

#SRC_URI[md5sum] = "b9c6fffad4ab0f5a34ecc78d2bb5ecb7"

S = "${WORKDIR}/git"

DEPENDS += "sqlite3 mosquitto"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 tempsensor ${D}${bindir}
    install -d ${D}/etc
    install -m 0644 ${WORKDIR}/tempsensor.ini ${D}/etc
    install -d ${D}/${systemd_unitdir}/system
    install -m 0644 ${WORKDIR}/tempsensor.service ${D}/${systemd_unitdir}/system
}
