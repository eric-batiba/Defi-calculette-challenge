# 🧮 Ezo Code Golf Challenge

## 🎯 Objective

Create a Java application that:
- Accepts a `String` input representing a mathematical expression.
- Evaluates the expression while supporting:
  - Operator precedence.
  - Negative and floating-point numbers.
  - Functions like `sqrt()` and `^` (power).
- Returns the result as a `String`.
- Handles invalid inputs gracefully.

---

## 🧱 Architecture

Calculator
|- ExpressionPreprocessor
|- ExpressionEvaluator
|- Main

 ---

## 🧰 Tech Stack

| Technology         | Description                                                                 |
|--------------------|-----------------------------------------------------------------------------|
| **Java 21 (LTS)**  | Core programming language used to build the calculator                     |
| **Maven**          | Build automation tool used for managing dependencies and project structure |
| **ScriptEngine (JavaScript)** | Java’s built-in scripting engine to evaluate expressions dynamically       |
| **JUnit 5**        | Testing framework for writing and running unit tests                        |
| **Regex (RegEx)**  | Used in `ExpressionPreprocessor` to transform input expressions             |
| **DecimalFormat**  | Ensures nicely formatted output (avoids floating-point imprecision)         |
| **Java Logging (Logger)** | Logs information and error messages for debugging and monitoring            |

---

## ✅ Supported Features

- Basic operators: `+`, `-`, `*`, `/`
- Exponentiation: `^`
- Square root: `sqrt()`
- Handles extra spaces
- Respects operator precedence
- Handles negative and decimal numbers

---

## 💥 Sample Test Cases

| Expression         | Expected Result |
|--------------------|------------------|
| `1+1`              | `2`              |
| `1 + 2`            | `3`              |
| `1 + -1`           | `0`              |
| `5 * 2`            | `10`             |
| `2+2*5+5`          | `17`             |
| `(2+5)*3`          | `21`             |
| `2.8*3-1`          | `7.4`            |
| `2^8`              | `256`            |
| `sqrt(4)`          | `2`              |
| `1 / 0`            | `Erreur`         |

---
