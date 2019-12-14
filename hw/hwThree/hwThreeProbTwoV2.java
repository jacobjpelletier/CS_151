
/*
Problem 2: Create a modified version of the PalidromeTester program from the
textbook so that the spaces and punctuations are not considered when determining 
whether a string is a polidrome. Think carefully about your design -- a detailed 
pseudocode will really help.
*/

import java.util.Scanner;

public class hwThreeProbTwoV2
{
    public static void main(String[] args)
    {
        String str, another = "y";
        int left, right;

        Scanner scan = new Scanner(System.in);

        while (another.equalsIgnoreCase("y")) // accepts y and Y
        {
            System.out.print("Enter a potential palindrome: ");
            str = scan.nextLine().toLowerCase();

            left = 0;
            right = str.length()-1;

            while (str.charAt(left) == str.charAt(right) && left < right)
            {
                left++;
                // tests whether character is punctuation (33[!], 46[.], 96[,], 63[?,]  or space (32)
                while (str.charAt(left) == 32 || str.charAt(left) == 33 || str.charAt(left) == 46 ||
                        str.charAt(left) == 96 || str.charAt(left) == 63)
                {
                    left++;
                }
                right--;
                // tests whether character is punctuation (33[!], 46[.], 96[,], 63[?,]  or space (32)
                while (str.charAt(right) == 32 || str.charAt(right) == 33 || str.charAt(right) == 46 ||
                        str.charAt(right) == 96 || str.charAt(right) == 63)
                {
                    right--;
                }
                System.out.println("L: " + left + " R: " + right);
            }

            if (left < right)
            {
                System.out.println("That string is NOT a palindrome.");
            }
            else
                System.out.println("That string IS a palindrome.");

            System.out.println();
            System.out.print("Test another palindrome (y/n)? ");
            another = scan.nextLine();
        }
    }
}