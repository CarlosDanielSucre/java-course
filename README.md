# ☕ Java Full Course – Project Repository

Welcome! This repository contains all exercises, notes, and projects developed throughout the **Complete Java Course** by Dr. Nelio Alves.  
The course is structured into comprehensive modules that guide you from the **basics** of Java to more **advanced topics**, including hands-on **real-world projects**.

--

## 🗺️ Course Roadmap

- [x] [Sequential Structure](#sequential-structure)
- [x] [Estrutura Condicional](#conditional-structure)
- [x] [Estruturas Repetitivas](#estruturas-repetitivas)
- [x] [Outros Tópicos Básicos](#outher-topics-in-java)
- [x] [Introdução à Programação Orientada a Objetos](#introdução-à-programação-orientada-a-objetos)
- [x] [Construtores, `this`, Sobrecarga e Encapsulamento](#construtores-palavra-this-sobrecarga-e-encapsulamento)
- [x] [Trabalhar com Data e Hora](#trabalhar-com-data-e-hora)
- [x] [Enumerações e Composições](#enumerações-e-composições)
---

## Sequential Structure

A **Sequential Structure** is the most fundamental type of control flow in programming.  
In Java, this means that each instruction is executed **in the exact order** it appears — one after another — **without any conditionals or loops**.
This is the most basic control structure and is fundamental to understanding program flow.

### Key Concepts:
- No decision-making (`if`, `switch`)
- No repetition structures (`for`, `while`, `do-while`)
- Code is executed **line by line**, from top to bottom

### ☕ Java Example:
In the example below, each comand is executed one after the other, in the order they are written:
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Starting program...");
        System.out.println("Loading data...");
        System.out.println("Processing...");
        System.out.println("Done!");
    }
}

```

<sub>📁 [See the exercises](src/main/java/com/javacourse/sequential_structure)</sub>
____________________________________________________________________________________________
___________________________________________________________________________________________
---

## Conditional Structure

A **Conditional Structure** allows a Java program to make decisions based on certain conditions.  
It enables dynamic behavior, where code is executed differently depending on input or program state.

### ✨ Key Concepts
- `if`: executes a block of code if a condition is `true`
- `else`: executes a block if the `if` condition is `false`
- `else if`: checks additional conditions
- `switch`: tests a value against multiple cases

These tools help guide program flow in a flexible and logical way.

### ☕ Java Example: `if`, `else if`, `else`
```java
public class Main {
    public static void main(String[] args) {
        int age = 18;

        if (age < 18) {
            System.out.println("Underage");
        } else if (age == 18) {
            System.out.println("Just became an adult");
        } else {
            System.out.println("Adult");
        }
    }
}
```
### 🎯 Java Example: switch statement

```java
public class Main {
    public static void main(String[] args) {
        String day = "Saturday";

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Weekday");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
```

<sub>📁 [See the exercises](src/main/java/com/javacourse/conditional_structure)</sub>

---

## Other Basic Topics in Java

This section explores **foundational building blocks** of the Java language — the essentials every Java developer should master early on.

### 🧮 Variable Declarations
In Java, variables must be declared with a specific type before they are used. Common data types include:
- `int`: integer numbers
- `double`: decimal numbers
- `boolean`: true or false
- `char`: single characters
- `String`: sequences of characters (not a primitive)

```java
int age = 25;
double price = 99.99;
boolean isActive = true;
char grade = 'A';
String name = "Carlos";
```

➕ Operators and Expressions
Java supports a wide range of operators for math, logic, and comparisons:

Arithmetic: +, -, *, /, %

Relational: ==, !=, >, <, >=, <=

Logical: &&, ||, !

Assignment: =, +=, -=, etc.

```java
int a = 10;
int b = 5;
int sum = a + b;
boolean result = a > b && b != 0;
```
📥 Input/Output with Scanner
Java uses the Scanner class (from java.util) to receive input from the user:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Hello, " + name + "!");
    }
}
```
🔄 Type Casting
Java requires explicit conversion when moving between incompatible types (e.g., double to int):

```java
double salary = 1350.75;
int roundedSalary = (int) salary; // results in 1350

int x = 42;
double converted = x; // implicit casting
```
📚 Standard Java Libraries

Java includes a rich set of standard libraries, such as:

java.util: collections, dates, Scanner

java.lang: core classes (Math, String, etc.)

java.io: input/output streams

java.time: date and time API

Example using Math:

```java
double result = Math.sqrt(49); // returns 7.0
int rounded = Math.round(3.6f); // returns 4

```
<sub>📁 [See the exercises](src/main/java/com/javacourse/conditional_structure)</sub>
---

## Introdução à Programação Orientada a Objetos

Object-Oriented Programming (OOP) introduces concepts like **classes**, **objects**, and **methods**.  
Java is an OOP language, and understanding these principles is key to building modular and reusable code.

---

## Construtores, palavra `this`, Sobrecarga e Encapsulamento

This module explores:
- **Constructors**: special methods to initialize objects
- **`this` keyword**: refers to the current object
- **Method overloading**: using the same method name with different parameters
- **Encapsulation**: protecting data through access modifiers and getters/setters

---

## Trabalhar com Data e Hora

Java provides the `java.time` package for working with **dates and times** efficiently.  
Learn how to:
- Get current date/time
- Format and parse dates
- Use `LocalDate`, `LocalTime`, and `LocalDateTime`

---

## Enumerações e Composições

- **Enums**: define a fixed set of constants, useful for readable code and decision-making.
- **Composition**: modeling complex types by combining simpler classes.  
It's an alternative to inheritance and a key part of clean object modeling.





## About the Course

- **Instructor:** Dr. Nelio Alves  
- **Focus:** Java fundamentals, object-oriented programming, algorithms, data structures, GUI development, and real-world applications  
- 🌐 **Course Link (Udemy):** [Click here](https://www.udemy.com/course/java-curso-completo/)

---

## 🚀 Stay Tuned

More modules, code samples, and personal projects will be added as the course progresses.  
Feel free to explore, fork, or contribute!

