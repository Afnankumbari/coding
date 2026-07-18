//Write a Java program that checks whether a given year is a leap year.
package day8;

    import java.util.Scanner;

    public class LeapYear {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the year to check Leap year");
            int year = scanner.nextInt();

            if(year%400==0) {
                System.out.println("Leap year");
            }
             else if(year%100==0) {
                System.out.println("Not Leap year");
            }
             else if(year%4==0) {
                System.out.println("Leap year");
            }
             else {
                 System.out.println("Not Leap year");
             }
        }
    }

/*
LEAP YEAR - APPROACH AND MY MISTAKES

Approach:
1. First, I thought that if a year is divisible by 4, it is a leap year.
   Example: 2024 % 4 == 0 → Leap Year

2. Then I learned about century-year exceptions:
   - If a year is divisible by 400 → Leap Year
   - Else if divisible by 100 → Not a Leap Year
   - Else if divisible by 4 → Leap Year
   - Otherwise → Not a Leap Year

Correct order:
400 → 100 → 4 → else

Examples:
2000 → divisible by 400 → Leap Year
1900 → divisible by 100 but not 400 → Not Leap Year
2024 → divisible by 4 → Leap Year
2025 → not divisible by 4 → Not Leap Year


Mistakes I Made:

1. Initially, I only checked:
   year % 4 == 0

   This works for years like 2024, but fails for 1900.

2. Then I used nested if statements and printed "Leap year"
   before completing all the checks.

   Because of this, a single year could print multiple and
   contradictory outputs.

3. I then changed to if - else if - else, which ensures
   only one final result is printed.

4. I mistakenly wrote:
   year % 100 == 0 → Leap Year

   Correct rule:
   year % 100 == 0 → Not Leap Year
   unless it was already divisible by 400.

Final Logic:

if divisible by 400
    → Leap Year
else if divisible by 100
    → Not Leap Year
else if divisible by 4
    → Leap Year
else
    → Not Leap Year

Key Learning:
Do not print the result before checking all required conditions.
Always think about edge cases and arrange conditions in the correct order.
*/

