package day5;
public class Task {
   public static void main(String[] args) {
       
        int score = 75;
        char grade = 'B';
        
        // TODO: Check pass or fail

        if(score>=50)
        {
            System.out.println("Passed");
        }
        else
        {
        System.out.println("Failed");
        }

        // TODO: Determine grade based on score
       if(score >= 90)
       {
           System.out.println("A");
       }
       else if(75 <= score && score <= 89)
       {
           System.out.println("B");
       }
       else if(60 <= score && score <= 74)
       {
           System.out.println("C");
       }
       else
       {
           System.out.println("D");
       }
   }
}