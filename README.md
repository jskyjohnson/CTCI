[![pipeline status](https://gitlab.com/jsky.johnson/CTCI/badges/master/pipeline.svg)](https://gitlab.com/jsky.johnson/CTCI/-/commits/master)
[![GitHub issues](https://img.shields.io/github/issues/jskyjohnson/CTCI)](https://github.com/jskyjohnson/CTCI/issues)

[![GitHub license](https://img.shields.io/github/license/jskyjohnson/CTCI)](https://github.com/jskyjohnson/CTCI/blob/master/LICENSE)
![Lines of code](https://img.shields.io/tokei/lines/github/jskyjohnson/CTCI)
![](https://img.shields.io/badge/maven-v3.6.3-informational)

# Hello!

Welcome to my java solutions for "Cracking the Coding Interview 6th Edition" by Gayle McDowell. Included is a functioning test suite for JUnit on Maven. I chose to make this a maven project since I wanted to have automatic code testing using the gitlab's ci pipeline. It added a bit of overhead to get this project working and the folder structures are more complex than needed.

See the [Content](#content) section for all questions answered so far.

The general file structure is as follows

    .
    ├── ...
    ├── src
    │   ├── main
    |   |   ├── java\com\jsky\core              #Main code file
    |   |   |   ├── ArraysAndStrings            #Chapter file
    |   |   |   |   ├── IsUnique.java           #Question File
    |   |   |   |   └── ...
    |   |   |   ├── LinkedLists
    |   |   |   └── ...
    |   |   └── ...
    |   ├── test
    |   |   ├── java\com\jsky\core             #Test code files
    |   |   |   ├── ArraysAndStrings           #Chapter files
    |   |   |   |   ├── IsUniqueTest.java      #Question Test files
    |   |   |   |   |   └── ...
    |   |   |   ├── LinkedLists
    |   |   |   └── ...
    |   |   └── ...
    |   ├── utils                              #Java utils and other custom made data structures...
    │   └── ...
    ├── utils                                  #Extra utility files, scripts, autodocs, etc...
    └── ...

## Content Chapters

1. Arrays and Strings
   1. [IsUnique](src/main/java/com/jsky/core/ArraysAndStrings/IsUnique.java)
      - [IsUniqueTest](src/test/java/com/jsky/core/ArraysAndStrings/IsUniqueTest.java)
   1. [CheckPermutation](src/main/java/com/jsky/core/ArraysAndStrings/CheckPermutation.java)
      - [CheckPermutationTest](src/test/java/com/jsky/core/ArraysAndStrings/CheckPermutationTest.java)
   1. [URLify](src/main/java/com/jsky/core/ArraysAndStrings/URLify.java)
      - [URLifyTest](src/test/java/com/jsky/core/ArraysAndStrings/URLifyTest.java)
   1. [PalindromePermutation](src/main/java/com/jsky/core/ArraysAndStrings/PalindromePermutation.java)
      - [PalindromePermutationTest](src/test/java/com/jsky/core/ArraysAndStrings/PalindromePermutationTest.java)
   1. [OneAway](src/main/java/com/jsky/core/ArraysAndStrings/OneAway.java)
      - [OneAwayTest](src/test/java/com/jsky/core/ArraysAndStrings/OneAwayTest.java)
   1. [StringCompression](src/main/java/com/jsky/core/ArraysAndStrings/StringCompression.java)
      - [StringCompressionTest](src/test/java/com/jsky/core/ArraysAndStrings/StringCompressionTest.java)
2. Linked Lists
   1. [RemoveDups](src/main/java/com/jsky/core/LinkedLists/RemoveDups.java)
      - [RemoveDupsTest](src/test/java/com/jsky/core/LinkedLists/RemoveDups.java)
   1. [ReturnKthToLast](src/main/java/com/jsky/core/LinkedLists/ReturnKthToLast.java)
      - [ReturnKthToLastTests](src/test/java/com/jsky/core/LinkedLists/ReturnKthToLastTest.java)
3. Stacks and Queues
4. Trees and Graphs
5. Bit Manipulation
6. Math and Logic Puzzles
7. Object Oriented Design
8. Recursion and Dynamic Programming
9. Sorting and Searching
10. Java
11. Threads and Locks

## Set up

#### Prereqs

- [Java Platform (JDK) 15 (Java SE 15)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Apache Maven 3.6.3](https://maven.apache.org/download.cgi)
- [VSCode](https://code.visualstudio.com/)
- [VSCode Java extensions pack](https://aka.ms/vscode-java-installer-win)

JUnit should be built when you run maven compile or test but incase that doesn't work, or you need to downgrade to junit 4

- [JUnit](https://github.com/junit-team/junit4/wiki/Download-and-Install)

1. I use VS code for my projects. To get started with VSCode and java I suggest you look at [visual studio's guide](https://code.visualstudio.com/docs/java/java-tutorial) on it, and again, make sure you have th [coding pack extensions](https://aka.ms/vscode-java-installer-win) for java in VSCode.

2. Next, make sure your JAVA_HOME system variable is set. If you require addition help updating system variables on windows you might want too look at this [How to set Java Home](https://www.wikihow.com/Set-Java-Home)

```
JAVA_HOME = C:\Program Files\Java\jdk-15
```

3. Then you will need to do the same for MAVEN_HOME and JUNIT_HOME (if using standalone junit jar).

```
MAVEN_HOME = C:\Program Files\Maven\apache-maven-3.6.3
JUNIT_HOME = C:\Program Files\Java\junit\junit-platform-console-standalone-1.7.0-M1.jar //Lives in the same folder as my Java sdks, your set up might be different.
```

#### To run

Navigate to a specific question test file, and you should be able to run that question's tests independantly.

![In editor test example](https://i.imgur.com/BqLFZ31.png)

Alternatively, you should also be able to run the entire test suite by clicking on the test side window menu.

![VSCode testing menu example](https://i.imgur.com/b885Dzh.png)

And you are always more than welcome to make a new static main method in whatever file you are in to test for specific cases, or add new test cases to that question's test file.

# Thank you!
