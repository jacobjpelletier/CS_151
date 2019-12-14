// Reading real numbers of type double from the keyboard. 

import java.util.Scanner;

class Yard2 {

   final static double YardsToMeters = 0.8;  

   public static void main (String[] args) {

     Scanner scan = new Scanner(System.in);

     System.out.print ("Enter the width of the yard: ");
     double yardWidth = scan.nextDouble();

     System.out.print ("Enter the length of the yard: ");
     double yardLength = scan.nextDouble();     

     System.out.print ("Enter the width of the house: ");
     double houseWidth = scan.nextDouble();

     System.out.print ("Enter the length of the house: ");
     double houseLength = scan.nextDouble();

     double yardArea = yardWidth * yardLength;
     double houseArea = houseWidth * houseLength;
     double grassArea = yardArea - houseArea;
     double grassAreaInSqM = grassArea * YardsToMeters;
     double timeInSec = grassAreaInSqM / 2;
     double timeInMin = timeInSec / 60;

     System.out.println ("The time to cut the grass is " + timeInMin + " minutes.");
   }
}