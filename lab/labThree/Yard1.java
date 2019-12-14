// Lab1, problem 2.

import java.util.Scanner;

class Yard1 {

   final static float YardsToMeters = 0.8f;  

   public static void main (String[] args) {

     Scanner scan = new Scanner(System.in);

     System.out.print ("Enter the width of the yard: ");
     int yardWidth = scan.nextInt();

     System.out.print ("Enter the length of the yard: ");
     int yardLength = scan.nextInt();     

     System.out.print ("Enter the width of the house: ");
     int houseWidth = scan.nextInt();

     System.out.print ("Enter the length of the house: ");
     int houseLength = scan.nextInt();

     int yardArea = yardWidth * yardLength;
     int houseArea = houseWidth * houseLength;
     int grassArea = yardArea - houseArea;
     float grassAreaInSqM = grassArea * YardsToMeters;
     float timeInSec = grassAreaInSqM / 2;
     float timeInMin = timeInSec / 60;

     System.out.println ("The time to cut the grass is " + timeInMin + " minutes.");
   }
}