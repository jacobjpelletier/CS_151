/*
Write a program that asks the user to input a three-digit
number and then prints the number in a reverse order. For example, 
678 must be printed as 876. Hint: play with integer division and 
remainder operator.
*/
// import necessary package
import java.util.Scanner;

public class prob3
{
    public static void main(String[] args)
    {
        // declare variables needed to represent three digits 
        int numToFlip, hundreds, tens, ones;

        // initialize a scanner object which will read user data
        Scanner scan = new Scanner(System.in);

        // gather user data here
        System.out.print("Enter integer to reverse: ");
        numToFlip = scan.nextInt();

        // isolate each Int that the user provided
        hundreds = numToFlip/100;
        tens = numToFlip%100/10;
        ones = numToFlip%10;
        /*
        or. . .
        ones * 100 + tens * 10 + hundreds * 1
         */
        System.out.println(numToFlip + " in reverse is " + "" + ones + "" + tens + "" + hundreds + "");
    }
}
