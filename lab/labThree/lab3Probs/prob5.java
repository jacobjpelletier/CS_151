/*
Problem 5. Write a program to print the Ulam sequence for an input integer. 
The next number in the sequence is defined as follows: if the current number 
is even, divide it by 2; if it is odd, multiply it by 3 and add 1. The last
number in the Ulam sequence is 1. Format the output so that it contains no
more than 10 numbers per line.
*/

import java.util.Scanner;

public class prob5 {

    public static void main (String[] args) {

        Scanner scan = new Scanner (System.in);

        int num, count = 0;

        System.out.print ("Enter number greater than 1: ");
        num = scan.nextInt();
        int initial = num;

        while (num != 1) {

            if (num % 2 == 0)
                num = num / 2;
            else
                num = 3 * num + 1;

            System.out.print (" " + num);
            count = count + 1;
            if (count % 10 == 0)
                System.out.println ();
        }

        System.out.println ();
        System.out.print ("The length of Ulam sequence for " + initial);
        System.out.println (" is " + count + ".");
    }
}