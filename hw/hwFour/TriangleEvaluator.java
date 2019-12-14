//Homework 4 -- The triangle problem: more than just a hint 

import java.util.Scanner;

class Triangle {

    int side1, side2, side3;

    public Triangle() {
        side1 = 0;
        side2 = 0;
        side3 = 0;
    }

    public void getData() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter triangle sides in increasing size:");
        System.out.print("    side1 > ");
        System.out.flush();
        side1 = scan.nextInt();

        System.out.print("    side2 > ");
        System.out.flush();
        side2 = scan.nextInt();

        System.out.print("    side3 > ");
        System.out.flush();
        side3 = scan.nextInt();
    }

    public boolean isRight() {
        return ((side1 * side1 + side2 * side2) == (side3 * side3));
    }

    public boolean isScelene() {
        if (side1 != side2) {
            if (side2 != side3) {
                if (side1 != side3) {
                    return true;
                }
                else
                    return false;
            }
            else
                return false;
        }
        else
            return false;
    }

    public boolean isIsosceles() {
        if (side1 == side2)
            if (side1 != side3)
                return true;
            else
                return false;
        else if (side1 == side3)
            if (side1 != side2)
                return true;
            else
                return false;
        else if (side2 == side3)
            if (side2 != side1)
                return true;
            else
                return false;
        else
            return false;
    }

    public boolean isEquilateral() {
        if (side1 == side2 && side1 == side3 && side2 == side3) {
            return true;
        } else
            return false;
    }
}

class TriangleEvaluator {

   public static void main (String[] args) {
 
      Triangle triangle1 = new Triangle();
   
      triangle1.getData();
      if (triangle1.isRight()) {
          System.out.println("triangle1 is right.");
          if (triangle1.isScelene())
              System.out.println("triangle1 is also scelene.");
          else if (triangle1.isIsosceles())
              System.out.println("triangle1 is also iscoceles.");
          else;
      }
      else if (triangle1.isScelene())
         System.out.println ("triangle1 is scelene.");
      else if (triangle1.isIsosceles())
          System.out.println ("triangle1 is iscoceles.");
      else if (triangle1.isEquilateral())
          System.out.println ("triangle1 is equilateral.");
      else
         System.out.println ("Something goes here.");
   }
}


    
 