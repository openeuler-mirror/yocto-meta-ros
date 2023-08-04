# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "This package is composed of 'dynamixel_item', 'dynamixel_tool', 'dynamixel_driver' and 'dynamixel_workbench' class.     The 'dynamixel_item' is saved as control table item and information of DYNAMIXEL.     The 'dynamixel_tool' class loads its by model number of DYNAMIXEL.     The 'dynamixel_driver' class includes wraped function used in DYNAMIXEL SDK.     The 'dynamixel_workbench' class make simple to use DYNAMIXEL."
AUTHOR = "Will Son <willson@robotis.com>"
ROS_AUTHOR = "Darby Lim <thlim@robotis.com>"
HOMEPAGE = "http://wiki.ros.org/dynamixel_workbench_toolbox"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "dynamixel_workbench"
ROS_BPN = "dynamixel_workbench_toolbox"

ROS_BUILD_DEPENDS = " \
    dynamixel-sdk \
    rclcpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    dynamixel-sdk \
    rclcpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    dynamixel-sdk \
    rclcpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/dynamixel_workbench-release/archive/release/humble/dynamixel_workbench_toolbox/2.2.3-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/dynamixel_workbench_toolbox"
SRC_URI = "git://github.com/ros2-gbp/dynamixel_workbench-release;${ROS_BRANCH};protocol=https"
SRCREV = "5f17ace14424a7b39bd2272456c0aa29051cccc1"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
