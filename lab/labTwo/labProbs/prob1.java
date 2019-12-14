/*
Write a program to compute the total value in dollars 
and cents of your loose change. You will input the number of 
quarters, dimes, nickels and pennies, and your program must tell 
you how much is this in dollars and cents.
*/

// import Scanner package
import java.util.Scanner;

public class prob1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        // declare variables that will represent change and total sum of change
        int quarters, dimes, nickels, pennies, dollars, cents, total;

        // will need to gather information from user - # of quarters
        System.out.print("Enter number of quarters: ");
        quarters = scan.nextInt();

        // will need to gather information from user - # of dimes
        System.out.print("Enter number of dimes: ");
        dimes = scan.nextInt();

        // will need to gather information from user - # of nickels
        System.out.print("Enter number of nickels: ");
        nickels = scan.nextInt();

        // will need to gather information from user - # of pennies
        System.out.print("Enter number of pennies: ");
        pennies = scan.nextInt();

        // calculate total amount of money from user input
        total = (quarters*25)+(dimes*10)+(nickels*5)+(pennies*1);
        // integer division to get number of dollars
        dollars = total/100;
        // remainder division will yeild cents
        cents = total%100;

        System.out.println(total);
        // concatenate results with a string for the user
        System.out.println("You have " + dollars + " dollars and " + cents + " cents.");

    }
}
