How to Run on Ubuntu Terminal1. *Clone the repository:*
   git clone git@github.com:YOUR-USERNAME/YOUR-REPO-NAME.git
   cd YOUR-REPO-NAME
2. *Compile the source files:*
   javac src/*.java -d bin/
3. *Run the application:*
   java -cp bin/ Main# Core Java College Assignments

A collection of lab assignments and practice programs for my Java coursework.

## Table of Contents
* [Assignment 1: Box Volume Calculator](#assignment-1-box-volume-calculator)

---

## Assignment 1: Box Volume Calculator

This assignment demonstrates object-oriented programming in Java by calculating the volume of a box using a custom class.

### Code Example
Here is the core logic used to define the box dimensions and calculate the volume:

```java
class Box {
    int length;
    int width;
    int height;

    Box(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }

    int volume() {
        return length * width * height;
    }
}

