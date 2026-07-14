package day6;
 class TelsukoTask2 {
    public static void main (String args[]){

   
        double num1 = 7;
        double num2 = 3;
        char operator = '+';
        String again = "y"; 
        


        while(again == "y"){
            again = "n";

            if (operator == '+'){
                System.out.println("addition");
                System.out.println("Result: "+ (num1 + num2));
            }
 
            else if (operator ==  '-'){
                System.out.println("subtraction");
                System.out.println("Result: "+ (num1 - num2));
            }
            else if(operator == '*'){
                System.out.println("multiplication");
                System.out.println("Result: "+ ( num1*num2));
            }
            else {
                System.out.println("divison");
                
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.println("Result: "+ (num1 / num2));
               }
            }
            }
            System.out.println("Thank you for using the calculator.");
        }
    }
