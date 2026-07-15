package day7;
public class Task1{
    public static void main(String args[]){
        int a = 10;
        int b = 20;
        int c = 5;

        if(a==b && a==c){
            System.out.println("all are equal.");
        }
        else if((a==b && a>c) || (b==c && b>a) || (a==c && a>b)){
            System.out.println("both are largest");
        }

        else if (a>b && a>c){
            System.out.println(a +" is the largest.");
        }
        else if (b>c){
            System.out.println(b +" is the largest.");
        }
        else
            System.out.println(c +" is the largest.");
    }
}

