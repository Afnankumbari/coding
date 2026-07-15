package day7;

//Write a Java program that checks whether a person is eligible to vote.

//Take the age as input using Scanner.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Age");
        int age = scanner.nextInt();


        if(age < 0){
            System.out.println("Invalid age");
        }
        else if(age >=18){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not eligible to vote");
        }

        scanner.close();
    }

}
