# 🔄 Type Conversion & Casting in Java

---

## 📌 Overview

![Type Conversion Diagram](type_conversion_diagram.svg)

---

## 1️⃣ Type Conversion (Implicit Conversion)

Also called **Widening** or **Automatic Conversion**.

Occurs automatically when:
- A **smaller** data type is assigned to a **larger** data type
- The conversion is between **compatible** data types

### Characteristics:
- Performed **automatically** by the compiler
- **No data loss** occurs
- Destination type is always **larger** than source type

### Example:

```java
byte b = 127;
int a = 256;

b = a; // ❌ Compile Error — int too large for byte

int a = b; // ✅ Allowed — byte fits inside int
```

> Storing a `byte` value in an `int` variable is allowed because `int` has a larger range — this is called **implicit type conversion / widening**.

---

## 2️⃣ Type Casting (Explicit Conversion)

Also called **Narrowing** or **Manual Conversion**.

Performed manually by the programmer when:
- A **larger** data type needs to be assigned to a **smaller** data type
- The conversion **may result in data loss**

### Characteristics:
- Requires **explicit use of the casting operator** `(type)`
- Can be applied to both compatible and incompatible data types
- **May result in data loss** or unexpected results

### Code Example:

```java
public class TypeCastingExample {
    public static void main(String[] args) {
        byte b = 127;       // Step 1: max value of byte
        int a = 257;        // Step 2: int variable
        b = (byte) a;       // Step 3: cast int to byte
        System.out.println("Value of b after casting: " + b); // Step 4
    }
}
```

**Output:**
```
Value of b after casting: 1
```

### How the output is calculated:

The `byte` data type has a range from **-128 to 127** (total 256 values).

When casting `int` to `byte`, Java uses the **modulo operation**:

```
257 % 256 = 1
```

> This explicit conversion — converting a larger type to a smaller one — is called **casting** or **narrowing**.

---

## 3️⃣ Automatic Promotion in Java

**Automatic promotion** is a feature that automatically converts smaller data types to larger data types when used in **expressions or method calls**.

This ensures all operands in an expression are of compatible types, allowing the operation to succeed.

### Type Promotion:

Type promotion refers to the process where a **smaller data type is automatically converted to a larger data type**.

For instance: `int` can be promoted to `long`, `float`, `double`, and so on.

The **JVM performs this automatic type promotion** when a method that requires a larger data type is called with a smaller data type argument.

### Code Example:

```java
public class hello {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 30;
        int result = a * b;          // byte × byte → auto promoted to int
        System.out.println(result);
    }
}
```

**Output:**
```
300
```

### Code Explanation:

Although both `a` and `b` are `byte` types, the result is **automatically promoted to `int`** because in Java, arithmetic operations involving bytes result in an integer value. This is why the result is stored in an `int` variable named `result`.

---

## 📊 Quick Comparison

| Feature | Type Conversion | Type Casting |
|---------|----------------|--------------|
| Also called | Widening / Implicit | Narrowing / Explicit |
| Done by | Compiler automatically | Programmer manually |
| Direction | Small → Large | Large → Small |
| Data loss? | ❌ No | ⚠️ Possible |
| Syntax | `int a = b;` | `b = (byte) a;` |

---

## 📝 Quick Revision

| Concept | Summary |
|---------|---------|
| Implicit Conversion | Automatic, small → large, no data loss |
| Explicit Casting | Manual using `(type)`, large → small, data loss possible |
| Widening | Another name for implicit conversion |
| Narrowing | Another name for explicit casting |
| Modulo in casting | `257 % 256 = 1` — value wraps around byte range |
| Type Promotion | byte × byte → result auto-promoted to int by JVM |

---

*Stay curious and keep learning! ☺*