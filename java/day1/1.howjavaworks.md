# Day 01 - Java Basics & Setup

## What is Java?
Java is a programming language created in 1995.
Write code once — run it anywhere (Windows, Mac, Linux).
Used in Android apps, banking software, websites.

---

## How Java Works

Your code (.java) → Compiler (javac) → Bytecode (.class) → JVM runs it → Output


![visual diagram of how Java works](<Screenshot 2026-06-25 223002.png>)

---

## JDK vs JRE vs JVM

| Name | Full Form | What it does |
|------|-----------|--------------|
| JDK | Java Development Kit | Write + compile + run Java. Developers use this |
| JRE | Java Runtime Environment | Only run Java programs. End users use this |
| JVM | Java Virtual Machine | Actually executes the bytecode on your machine |

Simple rule:
- You are a developer → install JDK (already done ✓)
- Someone just wants to run your app → they install JRE

---

## What is Bytecode?
- When you compile .java file → javac converts it to .class file
- This .class file contains bytecode
- Bytecode is not English, not machine code — it is in between
- JVM reads bytecode and runs it on any operating system
- This is why Java is called platform independent

---

## Why Java is Platform Independent
Normal languages compile to machine code → works only on one OS
Java compiles to bytecode → JVM on any OS can run it

Write once → Run anywhere

---

## What is public static void main(String[] args)?

```java
public static void main(String[] args)
```

| Word | Meaning |
|------|---------|
| public | Anyone can access this method |
| static | No need to create object to call this |
| void | This method returns nothing |
| main | JVM looks for this exact name to start |
| String[] args | Can take input from command line |

This is the entry point — JVM always starts running from here.
Without main() your program will not run.

---

## Steps to Execute Java Code

#### Step 1 — Write code

- HelloWorld.java

#### Step 2 — Compile
- javac HelloWorld.java

#### Step 3 — Run
- java HelloWorld

#### Step 4 — See output

- Hello World!


---

## What is Object Oriented Language?
Java is an Object Oriented Programming (OOP) language.
Everything in Java is based on Objects and Classes.

| Concept | Simple meaning |
|---------|---------------|
| Class | Blueprint (like a house plan) |
| Object | Real thing made from blueprint (actual house) |
| Method | Action an object can do |

We will learn OOP deeply in coming days.

---

## My First Program

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Day 01 - Started Java Journey!");
    }
}
```

---

## Common Mistakes Beginners Make
- Forgetting ; at end of line
- Class name and file name are different
- Wrong spelling of main
- Forgetting curly brackets { }

## Good Practices
- Class name always starts with Capital letter
- File name must exactly match class name
- One class per file
- Add comments to explain your code

---

## Tools Used
- Telusko YouTube
- VS Code
- Claude AI
- ChatGPT