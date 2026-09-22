package day9;

import java.util.Scanner;

public class   Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int marks = scanner.nextInt();
        System.out.println("The Marks of the Student:" + marks);

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid Marks");
        } else if (marks <= 100 && marks >= 90) {
            System.out.println("Grade A");
        } else if (marks <= 89 && marks >= 80) {
            System.out.println("Grade B");
        } else if (marks <= 79 && marks >= 70) {
            System.out.println("Grade C");
        } else if (marks <= 69 && marks >= 60) {
            System.out.println("Grade D");
        } else  {
            System.out.println("Fail");
        }
    }
}
