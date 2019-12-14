/*
Assume that the interest on a loan is computed by means
of the following formula:

     interest = principal * (rate/100) * (time/365)

Write a program to compute the value of interest you pay, given 
the amount borrowed, the interest rate, and the time of the loan.
*/

//import necessary package
import java.util.Scanner;

public class prob2
{
    public static void main(String[] args)
    {
       // declare necessary float variables needed to perform calculation
       float interest, rate, principal, time;
       
       // will need scanner object to register user input
       Scanner scan = new Scanner(System.in);

       // gather interest rate from user
       System.out.print("Enter interest rate: ");
       rate = scan.nextFloat();

       // gather principal from user
       System.out.print("Enter the principal: ");
       principal = scan.nextFloat();

       // gather loan term from user
       System.out.print("Enter the time of the loan: ");
       time = scan.nextFloat();

       // perform calculation
       interest = principal * (rate/100) * (time/365);

       // concatenate calculation with user
       System.out.println("Your total interest due will be " + interest + " dollars.");
    }
}
