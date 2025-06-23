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
- ✅ [How to **declare variables** and use:](#How-to-Declare-Variables-and-Use-Them-in-Java)
    - Primitive types: `int`, `double`, `char`, `boolean`
    - `String` for text
- ✅ [How to **read input** using the `Scanner` class](#How-to-Read-Input-Using-the-Scanner-Class-in-Java)
- ✅ [**Arithmetic expressions**:](#Arithmetic-Expressions-in-Java)
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
---

# How to Read Input Using the `Scanner` Class in Java

In Java, the `Scanner` class (from the `java.util` package) is the most common way to read user input from the console. It allows you to read **different types of input**, such as `String`, `int`, `double`, and more.

---

## 🔹 1. Importing the Scanner Class

Before you can use `Scanner`, you must import it at the top of your file:

```java
import java.util.Scanner;
```

---

## 🔹 2. Creating a Scanner Object

You need to create a `Scanner` object and pass `System.in` as the source of input:

```java
Scanner scanner = new Scanner(System.in);
```

---

## 🔹 3. Reading Different Types of Input

### 🔸 Read a full line (text):
```java
String name = scanner.nextLine();   // Reads an entire line (including spaces)
```

### 🔸 Read a single word (until space):
```java
String word = scanner.next();       // Reads one word (stops at space)
```

### 🔸 Read an integer:
```java
int age = scanner.nextInt();
```

### 🔸 Read a decimal (floating-point number):
```java
double salary = scanner.nextDouble();
```

### 🔸 Read a boolean value (`true` or `false`):
```java
boolean isActive = scanner.nextBoolean();
```

### 🔸 Read a single character (indirect method):
```java
char letter = scanner.next().charAt(0);  // Reads first character of a word
```

---

## 🔹 4. Full Example

```java
import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create scanner object

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // Read full line

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();       // Read integer

        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble(); // Read double

        System.out.println("\n--- User Info ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);

        scanner.close(); // Always close the scanner
    }
}
```

---

## ⚠️ Tips and Common Pitfalls

- After using `nextInt()` or `nextDouble()`, if you want to read a line with `nextLine()`, **add an extra `nextLine()`** to consume the leftover newline:

```java
int age = scanner.nextInt();
scanner.nextLine();  // consume leftover newline
String name = scanner.nextLine(); // now safe to read line
```

- **Always close** the scanner at the end using `scanner.close()` to free system resources.
---
---

# Arithmetic Expressions in Java

In Java, arithmetic expressions are used to perform mathematical calculations using **operators** such as addition, subtraction, multiplication, division, and modulo.

---

## ✅ 1. Arithmetic Operators

| Operator | Symbol | Description            | Example      |
|----------|--------|------------------------|--------------|
| Addition | `+`    | Adds two values        | `5 + 3` → `8` |
| Subtraction | `-` | Subtracts one value from another | `5 - 2` → `3` |
| Multiplication | `*` | Multiplies two values | `4 * 3` → `12` |
| Division | `/`    | Divides one value by another (returns quotient) | `10 / 2` → `5` |
| Modulo (Remainder) | `%` | Returns the remainder of division | `10 % 3` → `1` |

---

## 🔹 2. Integer vs. Floating-Point Division

### Integer division:
If both numbers are integers, the result is also an integer (fraction is discarded):

```java
int result = 7 / 2;  // result = 3 (not 3.5)
```

### Floating-point division:
If at least one operand is a `double`, the result will include decimals:

```java
double result = 7.0 / 2;  // result = 3.5
```

---

## 🔹 3. Operator Precedence

Java follows **operator precedence** rules to decide the order in which operations are performed.

### Precedence (from highest to lowest):

1. `()` **Parentheses**
2. `*`, `/`, `%` **Multiplication, Division, Modulo**
3. `+`, `-` **Addition, Subtraction**

### Example:

```java
int result = 5 + 3 * 2;  // result = 5 + 6 = 11 (not 16)
```

Because multiplication (`*`) has higher precedence than addition (`+`), it’s done first.

---

## 🔹 4. Using Parentheses to Control Order

You can use **parentheses** to **override** the default precedence and make the operations clearer or force them to occur in a specific order:

```java
int result = (5 + 3) * 2;  // result = 8 * 2 = 16
```

Always use parentheses when needed to avoid confusion and improve readability.

---

## 🧪 5. Example in Code

```java
public class ArithmeticDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println("a + b = " + (a + b));     // 13
        System.out.println("a - b = " + (a - b));     // 7
        System.out.println("a * b = " + (a * b));     // 30
        System.out.println("a / b = " + (a / b));     // 3
        System.out.println("a % b = " + (a % b));     // 1

        int complex = a + b * 2 - (a % 3);
        System.out.println("Complex expression: " + complex); // 10 + 6 - 1 = 15
    }
}
```

---
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
