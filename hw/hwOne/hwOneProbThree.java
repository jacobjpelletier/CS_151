/*
Write an application program that converts miles to
kilometers. 1 mile = 1.60935 kilometers. Read the miles value from
the user as a floating point value.
*/

import java.util.Scanner;

public class hwOneProbThree
{
    public static void main(String[] args)
    {
        // create memory space for Km and miles
        float kiloMeter, miles;

        // create a new Scanner object called scan, argument being standard input system System.in
        Scanner scan = new Scanner(System.in);

        // obtain data from user
        System.out.print("Enter number of miles you would like converter to kilometers: ");
        miles = scan.nextFloat();

        kiloMeter = miles * (float) 1.60935;

        // return calculation to user
        System.out.println(miles + " miles equals " + kiloMeter + " kilometers.");
    }
}

