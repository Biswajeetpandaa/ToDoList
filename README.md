# CLI To-Do List Application

A simple, Java-based Command Line Interface (CLI) application for managing daily tasks. This project allows users to add, view, and remove tasks dynamically using an interactive menu.

## 📋 Features

* **Add Task:** Input custom task descriptions to a dynamic list.
* **View Tasks:** Display all current tasks with numbered indexing.
* **Remove Task:** Delete specific tasks by their list number.
* **Input Validation:** Prevents errors when trying to remove tasks that don't exist.
* **User-Friendly Menu:** Interactive loop that keeps the application running until the user decides to quit.

## 🛠️ Technical Details

* **Language:** Java
* **Data Structure:** `ArrayList` (Java Collections Framework)
* **Input Handling:** `java.util.Scanner`
* **Logic:** Uses a `do-while` loop for the application lifecycle and **Enhanced / mordern (that does not need any break statement ) Switch  Statements** for menu selection.

## ⚙️ Prerequisites

* **Java Development Kit (JDK):** Version 14 or higher (Required for Enhanced Switch syntax).

## 🚀 How to Run

1.  **Compile the code:**
    Open your terminal or command prompt and navigate to the directory containing `ToDoProject.java`.
    ```bash
    javac ToDoProject.java
    ```

2.  **Run the application:**
    ```bash
    java ToDoProject
    ```

## 📖 Usage Guide

Upon running the application, you will see the following menu:

```text
----Menu----
1 for add task
2 for view tasks
3 for remove task
0 for quit from the application
