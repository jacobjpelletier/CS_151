/*

Deomonstrates the use of nested if statements

*/

import java.util.Scanner;

public class MinOfThree
{
  public static void main(String[] args)
  {
    int num1, num2, num3, min;
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter three digits: ");
    num1 = scan.nextInt();
    num2 = scan.nextInt();
    num3 = scan.nextInt();
 
    if (num1 < num2)
      if (num1 < num3)
        min = num1;
      else
        min = num3;
    else
      if (num2 < num3)
        min = num2;
      else
        min = num3;

    System.out.println("minimum value: " + min);
  }
}
