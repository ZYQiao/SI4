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
CMAKE_SOURCE_DIR = /Users/zhaoyuqiao/Desktop/SI4/C++/td1/td1_2_2

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /Users/zhaoyuqiao/Desktop/SI4/C++/td1/td1_2_2/build

# Include any dependencies generated for this target.
include CMakeFiles/cellularAutomata.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/cellularAutomata.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/cellularAutomata.dir/flags.make

CMakeFiles/cellularAutomata.dir/main.cpp.o: CMakeFiles/cellularAutomata.dir/flags.make
CMakeFiles/cellularAutomata.dir/main.cpp.o: ../main.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/zhaoyuqiao/Desktop/SI4/C++/td1/td1_2_2/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/cellularAutomata.dir/main.cpp.o"
	/Library/Developer/CommandLineTools/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/cellularAutomata.dir/main.cpp.o -c /Users/zhaoyuqiao/Desktop/SI4/C++/td1/td1_2_2/main.cpp

CMakeFiles/cellularAutomata.dir/main.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/cellularAutomata.dir/main.cpp.i"
	/Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /Users/zhaoyuqiao/Desktop/SI4/C++/td1/td1_2_2/main.cpp > CMakeFiles/cellularAutomata.dir/main.cpp.i

CMakeFiles/cellularAutomata.dir/main.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/cellularAutomata.dir/main.cpp.s"
	/Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /Users/zhaoyuqiao/Desktop/SI4/C++/td1/td1_2_2/main.cpp -o CMakeFiles/cellularAutomata.dir/main.cpp.s

# Object files for target cellularAutomata
cellularAutomata_OBJECTS = \
"CMakeFiles/cellularAutomata.dir/main.cpp.o"

# External object files for target cellularAutomata
cellularAutomata_EXTERNAL_OBJECTS =

cellularAutomata: CMakeFiles/cellularAutomata.dir/main.cpp.o
cellularAutomata: CMakeFiles/cellularAutomata.dir/build.make
cellularAutomata: CMakeFiles/cellularAutomata.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/Users/zhaoyuqiao/Desktop/SI4/C++/td1/td1_2_2/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable cellularAutomata"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/cellularAutomata.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/cellularAutomata.dir/build: cellularAutomata

.PHONY : CMakeFiles/cellularAutomata.dir/build

CMakeFiles/cellularAutomata.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/cellularAutomata.dir/cmake_clean.cmake
.PHONY : CMakeFiles/cellularAutomata.dir/clean

CMakeFiles/cellularAutomata.dir/depend:
	cd /Users/zhaoyuqiao/Desktop/SI4/C++/td1/td1_2_2/build && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/zhaoyuqiao/Desktop/SI4/C++/td1/td1_2_2 /Users/zhaoyuqiao/Desktop/SI4/C++/td1/td1_2_2 /Users/zhaoyuqiao/Desktop/SI4/C++/td1/td1_2_2/build /Users/zhaoyuqiao/Desktop/SI4/C++/td1/td1_2_2/build /Users/zhaoyuqiao/Desktop/SI4/C++/td1/td1_2_2/build/CMakeFiles/cellularAutomata.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/cellularAutomata.dir/depend

