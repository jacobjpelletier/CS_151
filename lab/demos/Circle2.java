// Example illustrating arithmetic operators and conversions 
// between data types.

// Given the radius, compute the circumference and
// the area of a circle.

import java.util.Scanner;

class Circle2 {

   public static void main(String[] args) {
     
     double radius, circumference, area, a, b, threesquared;

     Scanner scan = new Scanner(System.in);
        
   // prompt for input datum -- the radius

     System.out.print ("Enter radius: ");
     radius = scan.nextDouble();

   // calculate circumference and area
	
     circumference = (2d * Math.PI * radius);
     area = (Math.PI * (Math.pow(radius, 2d)));

   // square
      a = 3d;
      b = 2d;
      threesquared = Math.pow(a, b);

   // display results

      System.out.println("Statistics of Circle: ");
      System.out.println("----------------------");
      System.out.println("Radius        " + radius);
      System.out.println("Circumference " + circumference);
      System.out.println("Area          " + area);
      System.out.println("----------------------");
      System.out.println("3 squared is " + threesquared);
   }
}