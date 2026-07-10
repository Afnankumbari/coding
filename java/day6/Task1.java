package day6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //int num = -10;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int num = scanner.nextInt();
        System.out.println("you entered number is : "+ num);

        if(num > 0){
            System.out.println("Positive");
        }
        else if(num<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("zero or neutral");
        }
    }
    
}
