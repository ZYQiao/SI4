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
CMAKE_SOURCE_DIR = /Users/zhaoyuqiao/Desktop/SI4/C++/td2/Person

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /Users/zhaoyuqiao/Desktop/SI4/C++/td2/Person/cmake-build-debug

# Include any dependencies generated for this target.
include CMakeFiles/person.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/person.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/person.dir/flags.make

CMakeFiles/person.dir/main.cpp.o: CMakeFiles/person.dir/flags.make
CMakeFiles/person.dir/main.cpp.o: ../main.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/zhaoyuqiao/Desktop/SI4/C++/td2/Person/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/person.dir/main.cpp.o"
	/Library/Developer/CommandLineTools/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/person.dir/main.cpp.o -c /Users/zhaoyuqiao/Desktop/SI4/C++/td2/Person/main.cpp

CMakeFiles/person.dir/main.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/person.dir/main.cpp.i"
	/Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /Users/zhaoyuqiao/Desktop/SI4/C++/td2/Person/main.cpp > CMakeFiles/person.dir/main.cpp.i

CMakeFiles/person.dir/main.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/person.dir/main.cpp.s"
	/Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /Users/zhaoyuqiao/Desktop/SI4/C++/td2/Person/main.cpp -o CMakeFiles/person.dir/main.cpp.s

# Object files for target person
person_OBJECTS = \
"CMakeFiles/person.dir/main.cpp.o"

# External object files for target person
person_EXTERNAL_OBJECTS =

person: CMakeFiles/person.dir/main.cpp.o
person: CMakeFiles/person.dir/build.make
person: CMakeFiles/person.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/Users/zhaoyuqiao/Desktop/SI4/C++/td2/Person/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable person"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/person.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/person.dir/build: person

.PHONY : CMakeFiles/person.dir/build

CMakeFiles/person.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/person.dir/cmake_clean.cmake
.PHONY : CMakeFiles/person.dir/clean

CMakeFiles/person.dir/depend:
	cd /Users/zhaoyuqiao/Desktop/SI4/C++/td2/Person/cmake-build-debug && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/zhaoyuqiao/Desktop/SI4/C++/td2/Person /Users/zhaoyuqiao/Desktop/SI4/C++/td2/Person /Users/zhaoyuqiao/Desktop/SI4/C++/td2/Person/cmake-build-debug /Users/zhaoyuqiao/Desktop/SI4/C++/td2/Person/cmake-build-debug /Users/zhaoyuqiao/Desktop/SI4/C++/td2/Person/cmake-build-debug/CMakeFiles/person.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/person.dir/depend
