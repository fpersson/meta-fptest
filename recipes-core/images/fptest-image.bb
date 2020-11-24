DISCRIPTION = "A simple test"
LICENSE = "MIT"

#corefiles
IMAGE_INSTALL = "packagegroup-core-boot"

#packages
IMAGE_INSTALL += "tempSensor boost zeromq example cpptest zmqserver cmaketest bash dropbear ifupdown kbd-keymaps keyboard"

inherit core-image

inherit extrausers
EXTRA_USERS_PARAMS = "usermod -P toor root;"
EXTRA_USERS_PARAMS += "useradd -P test fredrik; usermod -s /bin/bash fredrik;"
