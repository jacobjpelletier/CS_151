/*
Problem 6. Write a program in which the user is asked repeatedly to input 
integers from 1 to 5. The program should inform the user when she enters 
an integer that puts the sum of the input integers over 21. In addition 
to printing the message OVER 21, the program should print the sum and the 
last integer entered. 
*/

import java.util.Scanner;

public class prob6
{
    public static void main(String[] args)
    {
        int prior, current = 0, sum = 0;

        Scanner scan = new Scanner(System.in);

        while (sum <= 21)
        {
            prior = current;
            System.out.print("Enter an integer: ");
            current = scan.nextInt();
            if (current > 0 && current < 6) {
                sum += current;
            }
            else {
                System.out.println("enter a valid integer");
            }
            // DEBUGGER
            //System.out.println("Prior: " + prior + "\tCurrent: " + current + "\tSum: " + sum);
        }

        System.out.println("OVER 21. Total sum entered: " + sum + "\nLast integer entered: " + current);

    }
}

