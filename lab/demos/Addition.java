// Numeric input example: the two numbers to be added are entered as 
// strings, and then convered to numbers.

import java.util.Scanner;

class Addition {

   public static void main (String[] args) {

     Scanner scan = new Scanner(System.in);

     int num1, num2;

     System.out.print ("Enter the first number: ");
     num1 = scan.nextInt ();

     System.out.print ("Enter the second number: ");
     num2 = scan.nextInt ();

     System.out.println ("The sum of " + num1 + " and " + num2 + " is " + 
             (num1 + num2));
     }
}