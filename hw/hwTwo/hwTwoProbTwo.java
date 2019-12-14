/*
Problem 2 (From L&L, chapter3 projects)  Write an application that reads the (x,y)
coordinates for two points. Compute the distance between them using the following
formula

	distance = sqrt((x2 - x1)^2 + (y2 - y1)^2 (see the book)
*/


import java.util.Scanner;
import java.lang.Math; 

public class hwTwoProbTwo
{
  public static void main(String[] args)
  {
    double x1, x2, y1, y2, xSquared, ySquared, distance;
    
    Scanner scan = new Scanner(System.in);  
    
    System.out.print("Enter x value of first coordinate: ");
    x1 = scan.nextDouble();

    System.out.print("Enter y value of first coordinate: ");
    y1 = scan.nextDouble();

    System.out.print("Enter x value of second coordinate: ");
    x2 = scan.nextDouble();

    System.out.print("Enter y value of second coordinate: ");
    y2 = scan.nextDouble();

    xSquared = Math.pow((x1 + x2), 2);

    ySquared = Math.pow((y1 + y2), 2);	

    distance = Math.sqrt(xSquared + ySquared);

    System.out.println("Distance between first and second coordinate: " + distance);
  }
}