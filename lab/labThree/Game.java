// Lab 3, problem 6.

import java.util.Scanner;

class Game {
 
    public static void main (String[] args) {

       Scanner scan = new Scanner (System.in);

       int number, lastnumber = 0, sum = 0;

       while (sum <= 21) {
         
          System.out.print ("Enter number between 1 and 5: ");

          number = scan.nextInt();

          if (number >= 1 && number <= 5) {
             
             sum = sum + number;
             lastnumber = number;
          }
          else
             System.out.println ("Invalid input -- the number must be between 1 and 5");
       }

       System.out.println ("OVER 21. The sum is " + sum);
       System.out.println ("The last number was " + lastnumber);
    }
}
