# For more information about using CMake with Android Studio, read the
# documentation: https://d.android.com/studio/projects/add-native-code.html.
# For more examples on how to use CMake, see https://github.com/android/ndk-samples.

cmake_minimum_required(VERSION 3.22.1)

# Declares the project name
project("xcheat")

# Set C++ standard
set(CMAKE_CXX_STANDARD 17)
set(CMAKE_CXX_STANDARD_REQUIRED ON)

# Include directories
include_directories(
    ${CMAKE_CURRENT_SOURCE_DIR}
    ${CMAKE_CURRENT_SOURCE_DIR}/login
)

# Main library sources
add_library(xcheat SHARED
        redxgui.cpp
        other/oxorany.cpp
        other/canvas/Canvas.cpp
        other/canvas/Paint.cpp
        other/canvas/Path.cpp
        other/canvas/Rect.cpp
        other/canvas/Typeface.cpp
    login/login.cpp
    login/login_helper.cpp
)

# Find required libraries
find_library(log-lib log)

# Link libraries
target_link_libraries(xcheat ${log-lib})