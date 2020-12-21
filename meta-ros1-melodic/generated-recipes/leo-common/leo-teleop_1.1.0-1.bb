# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Teleop package for Leo Rover"
AUTHOR = "Błażej Sowa <blazej@turtlerover.com>"
ROS_AUTHOR = "Błażej Sowa <blazej@turtlerover.com>"
HOMEPAGE = "http://wiki.ros.org/leo"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "leo_common"
ROS_BPN = "leo_teleop"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    joy \
    teleop-twist-joy \
    teleop-twist-keyboard \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/fictionlab-gbp/leo_common-release/archive/release/melodic/leo_teleop/1.1.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/leo_teleop"
SRC_URI = "git://github.com/fictionlab-gbp/leo_common-release;${ROS_BRANCH};protocol=https"
SRCREV = "0c5e27f582476a53dec0c13f298abfa4776974e0"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}