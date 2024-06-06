require at91bootstrap.inc

#LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://main.c;endline=27;md5=228bc7f30852b83e3c129e8ed4c7414d"

#BBRANCH = "main"

SRC_URI = "git://github.com/SarangamManindra/at91bootstrap-rba5d2x_4.0.9.git;protocol=https;branch=main"


#PV = "3.8.12+git${SRCPV}"

SRCREV = "be22adc86416f64641d9dae8ac2e0bf88ecd0aee"

S = "${WORKDIR}/git"

EXTRA_OEMAKE = 'CROSS_COMPILE=${TARGET_PREFIX} CC=${TARGET_PREFIX}gcc EXTRA_CC_ARGS="${TOOLCHAIN_OPTIONS}"'

AT91BOOTSTRAP_BIN_PATH = "${S}/build/binaries"

AT91BOOTSTRAP_CONFIG_PATH = "${S}/configs"



COMPATIBLE_MACHINE = '(sama5d3xek|sama5d3-xplained|sama5d3-xplained-sd|at91sam9x5ek|at91sam9rlek|at91sam9m10g45ek|sama5d4ek|sama5d4-xplained|sama5d4-xplained-sd|sama5d2-xplained|sama5d2-xplained-sd|sama5d2-xplained-emmc|sama5d2-ptc-ek|sama5d2-ptc-ek-sd|sama5d27-som1-ek|sama5d27-som1-ek-sd|rugged-board-a5d2x)'
