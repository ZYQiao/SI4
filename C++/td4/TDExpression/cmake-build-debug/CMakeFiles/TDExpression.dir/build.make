# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.17

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Disable VCS-based implicit rules.
% : %,v


# Disable VCS-based implicit rules.
% : RCS/%


# Disable VCS-based implicit rules.
% : RCS/%,v


# Disable VCS-based implicit rules.
% : SCCS/s.%


# Disable VCS-based implicit rules.
% : s.%


.SUFFIXES: .hpux_make_needs_suffix_list


# Command-line flag to silence nested $(MAKE).
$(VERBOSE)MAKESILENT = -s

# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /Applications/CLion.app/Contents/bin/cmake/mac/bin/cmake

# The command to remove a file.
RM = /Applications/CLion.app/Contents/bin/cmake/mac/bin/cmake -E rm -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /Users/zhaoyuqiao/Desktop/SI4/C++/td4/TDExpression

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /Users/zhaoyuqiao/Desktop/SI4/C++/td4/TDExpression/cmake-build-debug

# Include any dependencies generated for this target.
include CMakeFiles/TDExpression.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/TDExpression.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/TDExpression.dir/flags.make

CMakeFiles/TDExpression.dir/main.cpp.o: CMakeFiles/TDExpression.dir/flags.make
CMakeFiles/TDExpression.dir/main.cpp.o: ../main.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/zhaoyuqiao/Desktop/SI4/C++/td4/TDExpression/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/TDExpression.dir/main.cpp.o"
	/Library/Developer/CommandLineTools/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/TDExpression.dir/main.cpp.o -c /Users/zhaoyuqiao/Desktop/SI4/C++/td4/TDExpression/main.cpp

CMakeFiles/TDExpression.dir/main.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/TDExpression.dir/main.cpp.i"
	/Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /Users/zhaoyuqiao/Desktop/SI4/C++/td4/TDExpression/main.cpp > CMakeFiles/TDExpression.dir/main.cpp.i

CMakeFiles/TDExpression.dir/main.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/TDExpression.dir/main.cpp.s"
	/Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /Users/zhaoyuqiao/Desktop/SI4/C++/td4/TDExpression/main.cpp -o CMakeFiles/TDExpression.dir/main.cpp.s

# Object files for target TDExpression
TDExpression_OBJECTS = \
"CMakeFiles/TDExpression.dir/main.cpp.o"

# External object files for target TDExpression
TDExpression_EXTERNAL_OBJECTS =

TDExpression: CMakeFiles/TDExpression.dir/main.cpp.o
TDExpression: CMakeFiles/TDExpression.dir/build.make
TDExpression: CMakeFiles/TDExpression.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/Users/zhaoyuqiao/Desktop/SI4/C++/td4/TDExpression/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable TDExpression"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/TDExpression.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/TDExpression.dir/build: TDExpression

.PHONY : CMakeFiles/TDExpression.dir/build

CMakeFiles/TDExpression.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/TDExpression.dir/cmake_clean.cmake
.PHONY : CMakeFiles/TDExpression.dir/clean

CMakeFiles/TDExpression.dir/depend:
	cd /Users/zhaoyuqiao/Desktop/SI4/C++/td4/TDExpression/cmake-build-debug && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/zhaoyuqiao/Desktop/SI4/C++/td4/TDExpression /Users/zhaoyuqiao/Desktop/SI4/C++/td4/TDExpression /Users/zhaoyuqiao/Desktop/SI4/C++/td4/TDExpression/cmake-build-debug /Users/zhaoyuqiao/Desktop/SI4/C++/td4/TDExpression/cmake-build-debug /Users/zhaoyuqiao/Desktop/SI4/C++/td4/TDExpression/cmake-build-debug/CMakeFiles/TDExpression.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/TDExpression.dir/depend
