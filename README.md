[![pipeline status](https://gitlab.com/jsky.johnson/CTCI/badges/master/pipeline.svg)](https://gitlab.com/jsky.johnson/CTCI/-/commits/master)
[![GitHub issues](https://img.shields.io/github/issues/jskyjohnson/CTCI)](https://github.com/jskyjohnson/CTCI/issues)

[![GitHub license](https://img.shields.io/github/license/jskyjohnson/CTCI)](https://github.com/jskyjohnson/CTCI/blob/master/LICENSE)
![Lines of code](https://img.shields.io/tokei/lines/github/jskyjohnson/CTCI)
![](https://img.shields.io/badge/maven-v3.6.3-informational)

# Hello!
Welcome to my java solutions for "Cracking the Coding Interview 6th Edition" by Gayle McDowell. Included is a functioning test suite for JUnit on Maven.

## Content

Arrays and Strings

## Set up

#### Prereqs

- [Java Platform (JDK) 15 (Java SE 15)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Apache Maven 3.6.3](https://maven.apache.org/download.cgi)
- [VSCode](https://code.visualstudio.com/)
- [VSCode Java extensions pack](https://aka.ms/vscode-java-installer-win)

JUnit should be built when you run maven compile or test but incase that doesn't work, or you need to downgrade to junit 4
- [JUnit](https://github.com/junit-team/junit4/wiki/Download-and-Install)

I use VS code for my projects. To get started with VSCode and java I suggest you look at [visual studio's guide](https://code.visualstudio.com/docs/java/java-tutorial) on it, and again, make sure you have th [coding pack extensions](https://aka.ms/vscode-java-installer-win) for java in VSCode.


Next, make sure your JAVA_HOME system variable is set. If you require addition help updating system variables on windows you might want too look at this [How to set Java Home](https://www.wikihow.com/Set-Java-Home)
```
JAVA_HOME = C:\Program Files\Java\jdk-15
```

Then you will need to do the same for MAVEN_HOME and JUNIT_HOME (if using standalone junit jar).

```
MAVEN_HOME = C:\Program Files\Maven\apache-maven-3.6.3
JUNIT_HOME = C:\Program Files\Java\junit\junit-platform-console-standalone-1.7.0-M1.jar //Lives in the same folder as my Java sdks, your set up might be different.
```

#### To run

Navigate to a specific question test file, and you should be able to run that question's tests independantly. 
https://i.imgur.com/BqLFZ31.png

Alternatively, you should also be able to run the entire test suite by clicking on the test side window menu.
https://i.imgur.com/hdSQ8Ki.png

And you are always more than welcome to make a new static main method in whatever file you are in to test for specific cases, or add new test cases to that question's test file.

# Thank you!




