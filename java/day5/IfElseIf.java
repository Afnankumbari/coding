package day5;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entere the 3 numbers");

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        System.out.println("You entered numbers are x:"+ x +"  y:"+ y +"  z:"+ z);


        if (x > y && x > z){
            System.out.println("X is greater");
        }
        else if(y > z){
            System.out.println("Y is greater");
        }
        else{
            System.out.println("Z is greater");
        }
    }
}

// X is greater