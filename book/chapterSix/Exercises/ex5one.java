/* What happens if MinOfThree program program if two or more values are equal? */

import java.util.Scanner;

public class ex5one
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
   
    int num1, num2, num3, min = 0; 
    
    System.out.println("Enter 3 integers: ");
    num1 = scan.nextInt();
    num2 = scan.nextInt();
    num3 = scan.nextInt(); 	
	
    if (num1 < num2) 
      if (num1 < num3)
         min = num1;
      else // num1 is less than num2, but not less than num3
         min = num3;
    else // num2 is less than num1
      if (num2 < num3)
         min = num2;
      else // num2 is less than num1, but not less than num3
         min = num3;

    System.out.println("min is " + min);
  }
}
