//**********************************************************************************************************************
// PP 8.1
// Write a program that reads an arbitrary number of integers that are in the range 0 to 50 inclusive and
// counts how many occuraces of each are entered. Indicate the end of the input by a value outside of the range. After
// all input has been processed, print all of the values (with the number of occurances) that were enetred one or more
// times.
//**********************************************************************************************************************

import java.util.Scanner;
import java.util.Random;

public class pp81 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        final int LIMIT = 52;
        int control = 0, current = 0, arbitraryTotal, arbitraryElem;

        int[] range = new int[LIMIT];
        int[] counter = new int[LIMIT];
        int[] results = new int[LIMIT];

        System.out.print("Enter \"0\" if you would like to enter your own integers to evaluate, enter 99 when done" +
                "\nOtherwise enter " + "any other integer if you would like to evaluate a random input of integers: ");
        int input1 = scan.nextInt();
        if (input1 == 0) {
            while (control <= LIMIT) {
                System.out.print("Enter an integer: ");
                int input2 = scan.nextInt();
                if (input2 <= 51 && input2 >= 0) {
                    range[current] = input2;
                    control = input2;
                    current++;
                } else if (input2 == 99) {
                    control = 99;
                } else {
                    System.out.println("Please enter an integer between 0 and 51.");
                }
            }
            System.out.println("\nYour input:");
            // Creates array of user inputs
            for (int num = 0; num < current; num++) {
                System.out.print(range[num] + " ");
            }
            System.out.println();
        }
        else {
            // Creates random array
            Random generator = new Random();
            arbitraryTotal = generator.nextInt(LIMIT);

            System.out.println("\nRandom input:");
            for (int num = 0; num <= arbitraryTotal; num++) {
                arbitraryElem = generator.nextInt(LIMIT);
                range[num] = arbitraryElem;
                current++;
                System.out.print(arbitraryElem + " ");
            }
            System.out.println();
        }

        // Creates array to count against
        for (int num = 0; num < LIMIT; num++) {
            counter[num] = num;
        }

        // Compare arrays to count number of integer occurances
        for (int num = 0; num < LIMIT; num++) {
            for (int x = 0; x <= current; x++) {
                if (range[x] == counter[num])
                    results[num]++;
            }
        }

        System.out.println();
        // Display results
        for (int num = 0; num < LIMIT; num++) {
            if (num == 0) {
                results[num] = results[num] - 1; // results[LIMIT] provides an extra 0 than desired due to
            }
            System.out.print("Number of " + counter[num] + "'s entered: " + results[num] + "\n");
        }
        System.out.println();
    }
}