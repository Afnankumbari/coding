package day6;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("your entered numbers are "+ num1+"  " + num2);


        if(num1 > num2){
            System.out.println(num1 +" is greater");
        }
        else if(num1 == num2){
            System.out.println(num1+" and "+num2 +" both are greater");
        }
        else{
            System.out.println(num2 +" is greater");
        }
    }
    
}
