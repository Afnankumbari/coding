package day5;

public class TernaryOperator {
    public static void main(String[] args) {
        int n = 5;
        String result;

       /* * if (n%2==0){
            result = 10;
        }
        else{
            result = 20;
        } */
        
            result = n%2==0 ? "odd" : "even";
            System.out.println(result);
    }
}