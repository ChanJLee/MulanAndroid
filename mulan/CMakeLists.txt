# For more information about using CMake with Android Studio, read the
# documentation: https://d.android.com/studio/projects/add-native-code.html

# Sets the minimum version of CMake required to build the native library.

cmake_minimum_required(VERSION 3.4.1)

# Creates and names a library, sets it as either STATIC
# or SHARED, and provides the relative paths to its source code.
# You can define multiple libraries, and CMake builds them for you.
# Gradle automatically packages shared libraries with your APK.

set(SOURCE_FILES
    src/main/cpp/com_chan_mulan_Mulan.h
    src/main/cpp/com_chan_mulan_Mulan.cpp
    src/main/cpp/misc/JavaString2RawStringHolder.h
    src/main/cpp/misc/JavaString2RawStringHolder.cpp
    src/main/cpp/symbol/Symbol.h
    src/main/cpp/lexica/LexicalParser.cpp
    src/main/cpp/lexica/LexicalParser.h
    src/main/cpp/token/Token.h
    src/main/cpp/log/Logger.h
    src/main/cpp/utils/CharUtils.h
    src/main/cpp/grammer/GrammarParser.cpp
    src/main/cpp/grammer/GrammarParser.h
    src/main/cpp/render/MiddlewareRenderer.h
    src/main/cpp/render/HtmlRenderer.cpp
    src/main/cpp/render/HtmlRenderer.h
    src/main/cpp/render/RendererUnit.h
    src/main/cpp/render/AndroidRenderer.cpp
    src/main/cpp/render/AndroidRenderer.h)

add_library( # Sets the name of the library.
             mulan

             # Sets the library as a shared library.
             SHARED

             # Provides a relative path to your source file(s).
             ${SOURCE_FILES})

# Searches for a specified prebuilt library and stores the path as a
# variable. Because CMake includes system libraries in the search path by
# default, you only need to specify the name of the public NDK library
# you want to add. CMake verifies that the library exists before
# completing its build.

find_library( # Sets the name of the path variable.
              log-lib

              # Specifies the name of the NDK library that
              # you want CMake to locate.
              log )

# Specifies libraries CMake should link to your target library. You
# can link multiple libraries, such as libraries you define in this
# build script, prebuilt third-party libraries, or system libraries.

target_link_libraries( # Specifies the target library.
                       mulan

                       # Links the target library to the log library
                       # included in the NDK.
                       ${log-lib} )