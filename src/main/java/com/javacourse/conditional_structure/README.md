# 📘 Conditional Structure

This module covers the **conditional structure**, a core element of control flow in programming.  
It allows the execution of specific blocks of code depending on whether a condition is **true** or **false**.

---

## 📂 Folder Structure

The structure below contains files with examples that demonstrate the key concepts of the **Conditional Structure** in Java.
```
conditional_structure/
│
├── README.md
├── basic_conditions/
│ ├── SimpleIfExample.java
│ ├── IfElseExample.java
│ ├── NestedIfExample.java
│ ├── SwitchCaseExample.java
│ ├── TernaryOperatorExample.java
│ └── PhoneBillCalculator.java
├── exemplo01/
│ └── Exercise01.java
├── exemplo02/
│ └── Exercise02.java
└── 05-estrutura-condicional.pdf
```


---

## 🧠 What You’ll Learn Here

- ✅ [**Relational operators**:](#relational-operators)
    - `>`, `<`, `>=`, `<=`, `==`, `!=`
    - Used to compare numeric or character values
- ✅ [**Logical operators**:](#logical-operators)
    - `&&` (AND), `||` (OR), `!` (NOT)
    - Used to combine or negate boolean expressions
- ✅ [How to use **if / if-else / if-else-if** statements](#if-else-if-statements)
    - For simple and multiple-branch decision making
- ✅ [**Switch-case** syntax:](#switch-case-statements)
    - For selecting a block of code based on the value of a variable
- ✅ [**Ternary operator** for concise conditions:](#ternary-operator-in-java)
    - `(condition) ? valueIfTrue : valueIfFalse`
- ✅ [How to apply **conditional logic in real scenarios**](#real-life-conditional-examples)
    - Example: calculating phone bill based on usage

---

---

## 🔹 Relational Operators

Relational operators are used to **compare values**, returning a boolean result: `true` or `false`.

| Operator | Meaning         | Example (`x = 5`) | Result |
|----------|------------------|-------------------|--------|
| `>`      | Greater than     | `x > 3`           | true   |
| `<`      | Less than        | `x < 3`           | false  |
| `>=`     | Greater or equal | `x >= 5`          | true   |
| `<=`     | Less or equal    | `x <= 4`          | false  |
| `==`     | Equal to         | `x == 5`          | true   |
| `!=`     | Not equal to     | `x != 4`          | true   |

📌 These are often used inside `if` statements.

---

## Logical Operators

Logical operators allow combining multiple **boolean conditions** or inverting a condition.

| Operator | Meaning         | Example                         | Result |
|----------|------------------|----------------------------------|--------|
| `&&`     | Logical AND     | `x > 0 && x < 10` (x = 5)        | true   |
| `||`     | Logical OR      | `x == 3 || x == 5` (x = 5)       | true   |
| `!`      | Logical NOT     | `!(x == 10)` (x = 5)             | true   |

✅ Use `&&` when **all conditions must be true**.  
✅ Use `||` when **at least one condition is true**.  
✅ Use `!` to **invert** a condition (not).

---

## 🔹 if / if-else / if-else-if Statements

These are **basic conditional structures** to control the program's flow.

```java
int x = 7;

if (x > 10) {
    System.out.println("Greater than 10");
} else if (x == 10) {
    System.out.println("Equal to 10");
} else {
    System.out.println("Less than 10");
}
```
📌 Use if for simple conditions,
📌 if-else when you want to cover two possibilities,
📌 and if-else-if for multiple exclusive conditions.
---

# Switch-Case Statements

A switch statement is useful when you want to execute different code based on a fixed value.

```java
int day = 3;

switch (day) {
    case 1:
        System.out.println("Sunday");
        break;
    case 2:
        System.out.println("Monday");
        break;
    case 3:
        System.out.println("Tuesday");
        break;
    default:
        System.out.println("Invalid day");
}
```
📌 switch is cleaner than multiple if-else when dealing with fixed options like menu choices or days of the week.

--- # Ternary Operator in Java
The ternary operator is a compact alternative to if-else when assigning a value based on a condition:
```java
int age = 20;
String message = (age >= 18) ? "Adult" : "Minor";

System.out.println(message); // Adult
```

📌 Use it only for simple decisions involving value assignment.

---

# Real-Life Conditional Examples

💡 Phone Bill Calculator
You have a basic plan with 100 minutes included. Every minute over this costs R$2.00.

```java
int minutes = 103;
double total = 50.0;

if (minutes > 100) {
    total += (minutes - 100) * 2.0;
}

System.out.printf("Total bill: R$ %.2f%n", total); // R$ 56.00
```
📌 This example combines:

Relational operators: minutes > 100

Arithmetic logic

Conditional execution

## 🔗 Return to Course Index

[← Back to Course README](../../../../../../README.md)
