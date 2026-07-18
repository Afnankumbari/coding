# Data Types in Java

## What is a Data Type?

A data type tells Java — what kind of value this variable will store.
Is it a number? A letter? True or False? Java needs to know before you use it.

```
int age = 20;        // whole number
double price = 99.9; // decimal number
char grade = 'A';    // single character
boolean pass = true; // yes or no
```

---

## Two Categories of Data Types

| Category   | What it means                          | Examples                        |
| ---------- | -------------------------------------- | ------------------------------- |
| Primitive  | Basic types, built into Java           | int, double, char, boolean, etc |
| Non-Primitive | Made from classes, more powerful   | String, Array, Object, etc      |

We will focus on Primitive types today.

---

## 8 Primitive Data Types

| Type    | Size    | What it stores            | Example value     |
| ------- | ------- | ------------------------- | ----------------- |
| byte    | 1 byte  | Small whole number        | 100               |
| short   | 2 bytes | Medium whole number       | 30000             |
| int     | 4 bytes | Normal whole number       | 1000000           |
| long    | 8 bytes | Very large whole number   | 9999999999L       |
| float   | 4 bytes | Decimal (less precise)    | 3.14f             |
| double  | 8 bytes | Decimal (more precise)    | 3.14159265        |
| char    | 2 bytes | Single character          | 'A'               |
| boolean | 1 bit   | True or False only        | true              |

---

## 1. int — Most Used One

Use this when you need whole numbers (no decimal).

```java
public class IntExample {
    public static void main(String[] args) {
        int age = 21;
        int marks = 95;
        int year = 2026;

        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("Year: " + year);
    }
}
```

Output:
```
Age: 21
Marks: 95
Year: 2026
```

Range of int → -2,147,483,648 to 2,147,483,647
If your number is bigger than this → use long

---

## 2. double — For Decimal Numbers

Use this for prices, percentages, measurements.

```java
public class DoubleExample {
    public static void main(String[] args) {
        double price = 499.99;
        double pi = 3.14159265;
        double percentage = 87.5;

        System.out.println("Price: " + price);
        System.out.println("Pi: " + pi);
        System.out.println("Percentage: " + percentage);
    }
}
```

Output:
```
Price: 499.99
Pi: 3.14159265
Percentage: 87.5
```

double vs float → double is more accurate. Always prefer double for decimals.

---

## 3. char — Single Character

Use this for storing one letter, digit, or symbol.
Always use single quotes ' ' not double quotes.

```java
public class CharExample {
    public static void main(String[] args) {
        char grade = 'A';
        char letter = 'Z';
        char symbol = '@';

        System.out.println("Grade: " + grade);
        System.out.println("Letter: " + letter);
        System.out.println("Symbol: " + symbol);
    }
}
```

Output:
```
Grade: A
Letter: Z
Symbol: @
```

Common mistake → char name = "A"; ❌ (this is wrong, double quotes = String)
Correct → char name = 'A'; ✅

---

## 4. boolean — True or False Only

Use this for yes/no, on/off, pass/fail situations.

```java
public class BooleanExample {
    public static void main(String[] args) {
        boolean isLoggedIn = true;
        boolean isPassed = false;
        boolean isAdult = true;

        System.out.println("Logged in: " + isLoggedIn);
        System.out.println("Passed: " + isPassed);
        System.out.println("Is adult: " + isAdult);
    }
}
```

Output:
```
Logged in: true
Passed: false
Is adult: true
```

boolean is heavily used in if-else conditions and loops.

---

## 5. long — For Very Large Numbers

When int is not enough, use long.
Always add L at the end of the value.

```java
public class LongExample {
    public static void main(String[] args) {
        long population = 8000000000L;
        long distanceToMoon = 384400000L;

        System.out.println("World Population: " + population);
        System.out.println("Distance to Moon (m): " + distanceToMoon);
    }
}
```

Output:
```
World Population: 8000000000
Distance to Moon (m): 384400000
```

Forgetting L at the end → Java will give error because it thinks it's an int.

---

## 6. byte and short — Small Numbers

Use byte or short when you want to save memory and numbers are small.

```java
public class ByteShortExample {
    public static void main(String[] args) {
        byte smallNum = 100;
        short mediumNum = 30000;

        System.out.println("Byte value: " + smallNum);
        System.out.println("Short value: " + mediumNum);
    }
}
```

Output:
```
Byte value: 100
Short value: 30000
```

| Type  | Range                    |
| ----- | ------------------------ |
| byte  | -128 to 127              |
| short | -32,768 to 32,767        |

---

## 7. float — Decimal (Less Precise)

Similar to double but takes less memory. Less accurate.
Always add f at the end.

```java
public class FloatExample {
    public static void main(String[] args) {
        float temperature = 36.6f;
        float rating = 4.5f;

        System.out.println("Temperature: " + temperature);
        System.out.println("Rating: " + rating);
    }
}
```

Output:
```
Temperature: 36.6
Rating: 4.5
```

float vs double → float = 6-7 decimal digits, double = 15-16 decimal digits.
Always use double unless memory is very tight.

---

## String — Non-Primitive but Used Everywhere

String is not a primitive type but you will use it every day.
It stores a sequence of characters (words, sentences).
Always use double quotes " ".

```java
public class StringExample {
    public static void main(String[] args) {
        String name = "Afnan";
        String city = "Bengaluru";
        String message = "Java is awesome!";

        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Message: " + message);
    }
}
```

Output:
```
Name: Afnan
City: Bengaluru
Message: Java is awesome!
```

char vs String → char stores one letter, String stores many letters.

---

## All Types in One Program

```java
public class AllDataTypes {
    public static void main(String[] args) {
        byte b = 100;
        short s = 30000;
        int i = 100000;
        long l = 9999999999L;
        float f = 3.14f;
        double d = 3.14159265;
        char c = 'J';
        boolean bool = true;
        String str = "Java";

        System.out.println("byte:    " + b);
        System.out.println("short:   " + s);
        System.out.println("int:     " + i);
        System.out.println("long:    " + l);
        System.out.println("float:   " + f);
        System.out.println("double:  " + d);
        System.out.println("char:    " + c);
        System.out.println("boolean: " + bool);
        System.out.println("String:  " + str);
    }
}
```

---

## Quick Decision Guide — Which Type to Use?

| Situation                          | Use This  |
| ---------------------------------- | --------- |
| Age, marks, count, year            | int       |
| Price, percentage, weight, height  | double    |
| Single letter or symbol            | char      |
| Yes/No, true/false condition       | boolean   |
| Phone number, large population     | long      |
| Name, city, message, sentence      | String    |
| Saving memory with small numbers   | byte/short|

---

## Common Mistakes Beginners Make

- Using double quotes for char → char c = "A"; ❌  use char c = 'A'; ✅
- Forgetting L for long → long x = 9999999999; ❌  use 9999999999L ✅
- Forgetting f for float → float x = 3.14; ❌  use 3.14f ✅
- Using int for decimal numbers → int price = 99.9; ❌  use double ✅
- Storing big number in byte → byte x = 500; ❌  out of range, will error

---

## Good Practices

- Always pick the smallest type that fits your data
- Use double over float for decimal numbers
- Use int as your default for whole numbers
- Name your variables clearly (age, not a or x)
- Add a comment if the variable's purpose is not obvious