DESCRIPTION = "An implementation of docker-compose with podman backend"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

inherit setuptools3

SRC_URI = "git://github.com/containers/podman-compose.git;branch=0.1.x"

SRCREV = "e6accb0eb7587f12873dba13a9477061b5de9ee1"

S = "${WORKDIR}/git"

DEPENDS += "${PYTHON_PN}-pyyaml-native ${PYTHON_PN}-dotenv-native"

RDEPENDS_${PN} += "${PYTHON_PN}-pyyaml ${PYTHON_PN}-dotenv"
