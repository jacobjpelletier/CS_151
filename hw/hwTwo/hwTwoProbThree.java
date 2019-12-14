/*
Problem 3 (From L&L, chapter3 projects)  Write an application that reads the 
radius of a sphere and prints its volume and surface areas, where

	volume = 4 / 3 * PI * radius^3
	surface = 4 * PI * radius^2      (see the book)
*/

import java.util.Scanner;
import java.lang.Math; 

public class hwTwoProbThree
{
  public static void main(String[] args)
  {
    double radius, volume, surface;
    
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter radius: ");
    radius = scan.nextDouble();

    volume = (4d/3d) * (Math.PI) * (Math.pow(radius, 3));
    surface = 4d * (Math.PI) * (Math.pow(radius,2));

    System.out.println("A sphere with a radius of " + radius + " has a volume of " +
      volume + " and has a surface area of " + surface + "."); 
  }
}
