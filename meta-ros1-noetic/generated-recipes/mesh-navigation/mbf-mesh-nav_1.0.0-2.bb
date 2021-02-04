# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "The mbf_mesh_nav package"
AUTHOR = "Sebastian Pütz <spuetz@uos.de>"
ROS_AUTHOR = "Sebastian Pütz <spuetz@uos.de>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "BSD-3"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=ba717dc718040ac1636f383eca24f11f"

ROS_CN = "mesh_navigation"
ROS_BPN = "mbf_mesh_nav"

ROS_BUILD_DEPENDS = " \
    dynamic-reconfigure \
    mbf-abstract-nav \
    mbf-mesh-core \
    mesh-map \
    pluginlib \
    roscpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    dynamic-reconfigure \
    mbf-abstract-nav \
    mbf-mesh-core \
    mesh-map \
    pluginlib \
    roscpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    dynamic-reconfigure \
    mbf-abstract-nav \
    mbf-mesh-core \
    mesh-map \
    pluginlib \
    roscpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/uos-gbp/mesh_navigation-release/archive/release/noetic/mbf_mesh_nav/1.0.0-2.tar.gz
ROS_BRANCH ?= "branch=release/noetic/mbf_mesh_nav"
SRC_URI = "git://github.com/uos-gbp/mesh_navigation-release;${ROS_BRANCH};protocol=https"
SRCREV = "4fc1b927e7fb22e210759183dba5b9a50211d5cc"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}