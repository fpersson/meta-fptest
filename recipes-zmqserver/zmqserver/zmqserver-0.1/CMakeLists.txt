cmake_minimum_required(VERSION 3.1)
project(zmq_test)

set(CMAKE_CXX_STANDARD 11)

## FIND_LIBRARY(ZMQ_LIB libzmq)

## load in pkg-config support
find_package(PkgConfig)
## use pkg-config to get hints for 0mq locations
pkg_check_modules(PC_ZeroMQ QUIET zmq)

## use the hint from above to find where 'zmq.hpp' is located
find_path(ZeroMQ_INCLUDE_DIR
        NAMES zmq.hpp
        PATHS ${PC_ZeroMQ_INCLUDE_DIRS}
        )

## use the hint from about to find the location of libzmq
find_library(ZeroMQ_LIBRARY
        NAMES zmq
        PATHS ${PC_ZeroMQ_LIBRARY_DIRS}
        )

message(STATUS "Inlude path: " ${ZeroMQ_INCLUDE_DIR})

set(SOURCE_FILES server.cpp)

include_directories(${PC_ZeroMQ_INCLUDE_DIR})

add_executable(zmqserver ${SOURCE_FILES} ${PC_ZeroMQ_INCLUDE_DIR})
target_link_libraries(zmqserver ${ZeroMQ_LIBRARY})
