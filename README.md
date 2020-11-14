This README file contains information on the contents of the
meta-fptest layer.

Please see the corresponding sections below for details.


Dependencies
============

This layer depends on:

  URI: git://git.openembedded.org/bitbake
  branch: master

  URI: git://git.openembedded.org/openembedded-core
  layers: meta
  branch: master

  URI: git://git.openembedded.org/meta-openembedded
  layers: meta-oe
  branch: master


Table of Contents
=================

  I. Adding the meta-fptest layer to your build
 II. Misc


I. Adding the meta-fptest layer to your build
=================================================

--- replace with specific instructions for the meta-fptest layer ---

In order to use this layer, you need to make the build system aware of
it.

Assuming the meta-fptest layer exists at the top-level of your
yocto build tree, you can add it to the build system by adding the
location of the meta-fptest layer to bblayers.conf, along with any
other layers needed. e.g.:

  BBLAYERS ?= " \
    /path/to/yocto/meta \
    /path/to/yocto/meta-poky \
    /path/to/yocto/meta-yocto-bsp \
    /path/to/yocto/meta-meta-fptest \
    "

II. Misc
========

--- replace with specific information about the meta-fptest layer ---
