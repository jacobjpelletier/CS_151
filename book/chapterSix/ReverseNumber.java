/*
Demonstrates the use of a do loop
*/

import java.util.Scanner;

public class ReverseNumber
{
    public static void main(String[] args)
    {
        int number, lastDigit, reverse = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        number = scan.nextInt();

        do
        {
            lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number = number / 10;
            System.out.println("number: " + number + "\tlastDigit: " + lastDigit + "\treverse: " + reverse);
        }
        while (number > 0);

        System.out.println("That number reversed is " + reverse);
    }
}