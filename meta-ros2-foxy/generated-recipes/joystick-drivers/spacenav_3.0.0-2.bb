# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_foxy
inherit ros_superflore_generated

DESCRIPTION = "ROS interface to the 3Dconnexion SpaceNavigator 6DOF joystick."
AUTHOR = "Jonathan Bohren <jbo@jhu.edu>"
ROS_AUTHOR = "Stuart Glaser"
HOMEPAGE = "http://www.ros.org/wiki/spacenav_node"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=4;endline=4;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "joystick_drivers"
ROS_BPN = "spacenav"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libspnav-dev} \
    geometry-msgs \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libspnav-dev} \
    geometry-msgs \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libspnav-dev} \
    ${ROS_UNRESOLVED_DEP-spacenavd} \
    geometry-msgs \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/joystick_drivers-release/archive/release/foxy/spacenav/3.0.0-2.tar.gz
ROS_BRANCH ?= "branch=release/foxy/spacenav"
SRC_URI = "git://github.com/ros2-gbp/joystick_drivers-release;${ROS_BRANCH};protocol=https"
SRCREV = "cf98060d07481ba7edf5a014e355d9710974d1f6"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
