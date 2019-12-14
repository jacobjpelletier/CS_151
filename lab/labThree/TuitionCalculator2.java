// Block example

import java.util.Scanner;

class  TuitionCalculator2 {

   public static void main (String[] args) {

     Scanner scan = new Scanner(System.in);

     System.out.print ("Enter the number of credits: ");
     System.out.flush();
     int credits = scan.nextInt();

     int tuition = credits * 75;

     if (tuition > 1000)

        tuition = 1000;
        System.out.println ("Maximum pay is $1000.00");


     System.out.println ("You pay $" + tuition + " for " + credits + " credits.");

     }
}

