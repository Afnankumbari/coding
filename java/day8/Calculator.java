package day8;
class  Calc {
    public int add(int n1, int n2) {

        int r = n1+n2;
        return r;
    }
}


public class Calculator{
    public static void main(String[] args) {
        // Object Oreinted Programming
        // Object - Properties and Behaviours

        //Class

        //int num1= 4;
        //int num2= 5;

        Calc c = new Calc();
        int result = c.add(4,5);

        //int result = num1 + num2;
        System.out.println(result);

    }
}
