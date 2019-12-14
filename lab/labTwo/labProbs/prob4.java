/*
At a state college, tuition charges are $75.00 per credit
with a maximum of $1000.00 no matter how many credits are taken.
Write a program that calculates tuition charges, given the
number of credits taken.
*/

// import scanner package
import java.util.Scanner;

public class prob4
{
    public static void main(String[] args)
    {
	// initialize new scanner object
        Scanner scan = new Scanner(System.in);

	// declare total credits as integer
        int totalCredits;
	// declare charges as double
        double totalCharges;

	// gather data from user
        System.out.print("Enter total number of credits: ");
        totalCredits = scan.nextInt();

        // calcuate totalCharges 
        totalCharges = totalCredits*75.00;
        /*
        int tuition = totalCredits * 75;
        if (tuition > 100)
            tuition = 1000
        System.out.println(tuition)
         */
 
	// if then to determine tuition charges
        if (totalCharges >= 1000) {
            System.out.println("Your total charges will be: $" + 1000); //True
        } else {
            System.out.println("Your total charges will be: $" + totalCharges); //False
        }
    }
}
