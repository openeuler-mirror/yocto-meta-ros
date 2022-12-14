# Copyright (c) 2021 LG Electronics, Inc.

DEPENDS += " \
    ament-cmake \
    ament-cmake-core \
    ament-cmake-libraries \
    ament-cmake-export-definitions \
    ament-cmake-export-include-directories \
    ament-cmake-export-interfaces \
    ament-cmake-export-libraries \
    ament-cmake-export-link-flags \
    ament-cmake-export-targets \
    ament-cmake-python \
    ament-cmake-target-dependencies \
    ament-cmake-include-directories \
    ament-cmake-test \
    ament-cmake-version \
    ament-package-native \
    python3-catkin-pkg-native \
"

FILES:${PN} += "${libdir}/python"
