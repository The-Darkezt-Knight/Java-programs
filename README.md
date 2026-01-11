# Java OOP Practice Repository

A small collection of Java practice projects focused on object-oriented programming fundamentals (classes, inheritance, composition, encapsulation), plus a set of LeetCode-style algorithm exercises.

## What’s inside

- `GuessingGame/` — a simple guessing game demonstrating basic program structure and game logic.
- `Inventory/` — an OOP-style inventory model (e.g., `Item`, `Weapon`, `Fruit`, `Player`) and a driver class.
- `Restaurant/` — a small class hierarchy around foods (e.g., `Food`, `Cake`, `Cupcake`, `Chef`).
- `StudentRecord/` — a basic student/registration domain model (e.g., `Student`, `School`, `Registrar`, `Enrollment`).
- `Leetcode/` — standalone solutions to common coding interview problems (this folder also has its own `README.md`).

## Requirements

- Java JDK (recommended: Java 17+, but most files should work on earlier versions)
- VS Code with Java extensions (optional)

## How to run

From the repository root, compile and run a program by targeting the folder and the class with `main`.

Example (PowerShell):

```powershell
# Compile
javac .\GuessingGame\*.java

# Run (use the class name that contains public static void main)
java -cp . Guessing_Game
```

Notes:
- If a class is in a package (not typical in this repo), you must run it via its fully-qualified name.
- Some folders may contain multiple entry points; run the class that defines `public static void main(String[] args)`.

## Purpose

This repository is primarily for learning and experimentation: practicing Java syntax, OOP design, and common algorithm patterns.