// Lab 3, problem 1.

import java.util.Scanner;

class Wage {
 
    public static void main (String[] args) {

       Scanner scan = new Scanner(System.in);       

       double wage;
  
       System.out.print ("Enter hours worked: ");
       int hours = scan.nextInt();

       System.out.print ("Enter hourly rate: ");
       float rate = scan.nextFloat();

       if (hours > 40) 
          wage = (hours - 40) * 1.5 * rate + (40 * rate);
       else
          wage = hours * rate;
       
       System.out.println ("Your wage is " + wage);

    }
}