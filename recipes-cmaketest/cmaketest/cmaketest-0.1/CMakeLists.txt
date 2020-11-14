cmake_minimum_required(VERSION 3.0)
project(cmaketest)

set(CMAKE_CXX_STANDARD 11)

set(SOURCE_FILES main.cpp)
add_executable(cmaketest ${SOURCE_FILES}) 
