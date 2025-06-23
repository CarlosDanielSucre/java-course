# 📘 Sequential Structure

This module covers the **sequential structure**, the most fundamental concept in programming.  
It refers to code that is executed **line by line**, exactly in the order it is written — without decisions (`if`, `switch`) or repetition (`for`, `while`).

---
## 📂 Folder Structure

The structure below contains files with examples that demonstrate the key concepts of the **Sequential Structure** in Java.
```
sequential_structure/
│
├── README.md
├── basic_example/    
│   ├── HelloWorld.java
│   ├── UserGreeting.java
│   ├── ArithmeticDemo.java
│   ├── CircleArea.java
│   ├── CastingExample.java
│   └── ProductInfoOutput.java
├── exemplo01/
    └── Exercise01.java
    
```
---

## 🧠 What You’ll Learn Here

- ✅ [How to **print** output to the console using:](#How-to-Print-Output-to-the-Console-in-Java)
    - `System.out.print()`
    - `System.out.println()`
    - `System.out.printf()`
- ✅ [How to **declare variables** and use:](#How-to-Declare-and-Use-Them)
    - Primitive types: `int`, `double`, `char`, `boolean`
    - `String` for text
- ✅ How to **read input** using the `Scanner` class
- ✅ **Arithmetic expressions**:
    - Operators: `+`, `-`, `*`, `/`, `%`
    - Operator **precedence** and use of parentheses
- ✅ **Type casting** for precise division
    - Example: `(double) a / b`
- ✅ How to use **Locale settings** to print decimals with a dot:
    - `Locale.setDefault(Locale.US);`

---
## How to Print Output to the Console in Java

In Java, printing messages to the console is one of the most basic — and essential — skills.  
There are three main methods used for this:

---

### ✅ `System.out.print()`

- Prints text on the **same line**, without a line break at the end.
- Useful when you want to keep printing on the same line.

#### 🔍 Example:
```java
System.out.print("Enter your name: ");
System.out.print("Welcome ");
System.out.print("to Java!");
```

#### 📾 Output:
```
Enter your name: Welcome to Java!
```

---

### ✅ `System.out.println()`

- Prints text **followed by a line break**.
- The cursor moves to the next line after printing.

#### 🔍 Example:
```java
System.out.println("Welcome to Java!");
System.out.println("Let's begin.");
```

#### 📾 Output:
```
Welcome to Java!
Let's begin.
```

---

### ✅ `System.out.printf()`

- Prints **formatted text**, combining strings, numbers, and variables.
- Useful for controlling number formatting, decimal places, and structured messages.

#### 🔍 Example:
```java
String name = "Maria";
int age = 31;
double salary = 4000.0;

System.out.printf("%s is %d years old and earns $%.2f%n", name, age, salary);
```

#### 📾 Output:
```
Maria is 31 years old and earns $4000.00
```

---

### 🧩 Common Format Specifiers:

| Specifier | Meaning                 |
|-----------|-------------------------|
| `%d`      | Integer                 |
| `%f`      | Floating-point number   |
| `%.2f`    | Float with 2 decimals   |
| `%s`      | String                  |
| `%n`      | Line break (platform-safe) |

> 💡 **Tip:** To force the decimal separator as a **dot (.)** instead of a comma (`,`), use:
```java
Locale.setDefault(Locale.US);
```

---

### Summary Comparison

| Method                | Breaks Line? | Supports Formatting? | When to Use                                 |
|-----------------------|--------------|-----------------------|----------------------------------------------|
| `System.out.print()`   | ❌ No         | ❌ No                  | Simple output on the same line               |
| `System.out.println()` | ✅ Yes        | ❌ No                  | Regular messages, new line after each print  |
| `System.out.printf()`  | ❌ No*        | ✅ Yes                 | Structured or formatted output               |

---

# How to Declare Variables and Use Them in Java

## 1. Variables and Primitive Types

In Java, a variable is a memory location where you can store a value of a specific type. To declare a variable, you specify the type followed by the variable name.

**Primitive types** are the basic built-in data types in Java, each occupying a fixed amount of memory.

### Common Primitive Types:

| Type      | Size          | Example Value | Main Use                         |
|-----------|---------------|---------------|---------------------------------|
| `int`     | 4 bytes       | 42            | Whole numbers (integers)         |
| `double`  | 8 bytes       | 3.1416        | Decimal numbers (floating-point)|
| `char`    | 2 bytes       | 'A'           | Single Unicode character         |
| `boolean` | 1 bit (logical)| `true` or `false` | Logical true/false values         |

### How to Declare and Use Them

```java
int age = 25;              // integer variable storing a whole number
double temperature = 36.5; // decimal variable
char letter = 'J';         // character variable, enclosed in single quotes
boolean isStudent = true;  // logical variable (true or false)
```

You can declare a variable without initializing it, and assign a value later:

```java
int counter;   // declaration
counter = 10;  // assignment
```

Or declare and assign in one line (most common):

```java
double price = 99.99;
```

## 2. `String` for Text

- `String` is **not** a primitive type but a **class** that represents sequences of characters (text).
- Declared similarly, but values are enclosed in double quotes.

```java
String name = "Carlos";
```

You can use methods to manipulate strings, for example:

```java
int length = name.length();         // gets the length of the string
String upperCase = name.toUpperCase();  // converts to uppercase letters
```

## Complete Example

```java
public class VariableExample {
    public static void main(String[] args) {
        int age = 30;
        double salary = 1500.75;
        char initial = 'C';
        boolean isEmployed = true;
        String name = "Carlos Daniel";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Initial: " + initial);
        System.out.println("Employed: " + isEmployed);
    }
}
```

---

## 💻 Example Exercises

| File                        | Description                                  |
|-----------------------------|----------------------------------------------|
| `HelloWorld.java`           | First program: printing simple messages      |
| `UserGreeting.java`         | Read user's name and greet them              |
| `ArithmeticDemo.java`       | Basic math operations                        |
| `CircleArea.java`           | Calculate area of a circle                   |
| `CastingExample.java`       | Convert integer division to floating-point   |
| `ProductInfoOutput.java`    | Format output using multiple variable types  |


---

## 🔗 Return to Course Index

[← Back to Course README](../../../../../../README.md)
