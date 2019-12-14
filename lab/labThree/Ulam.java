// Lab 3, problem 5
// Print Ulam sequence for an input integer

import java.util.Scanner;

class Ulam {
 
    public static void main (String[] args) {

       Scanner scan = new Scanner (System.in);
       
       int num, count = 0;

       System.out.print ("Enter number greater than 1: ");
       num = scan.nextInt();
       int initial = num;

       while (num != 1) {
         
          if (num % 2 == 0) 
             num = num / 2;
          else 
             num = 3 * num + 1;

          System.out.print (" " + num);
          count = count + 1;
          if (count % 10 == 0)
             System.out.println ();
       }

       System.out.println ();
       System.out.print ("The length of Ulam sequence for " + initial);
       System.out.println (" is " + count + ".");
    }
}