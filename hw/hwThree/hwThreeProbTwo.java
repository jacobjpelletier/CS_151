/*
Problem 2: Create a modified version of the PolidromeTester program from the 
textbook so that the spaces and punctuations are not considered when determining 
whether a string is a polidrome. Think carefully about your design -- a detailed 
pseudocode will really help.
*/

import java.util.Scanner;

public class hwThreeProbTwo
{
    public static void main(String[] args)
    {
        String str, newStr = "", another = "y";;
        int left, right;

        Scanner scan = new Scanner(System.in);

        while (another.equalsIgnoreCase("y")) // allows y or Y
        {
            System.out.print("Enter a palindrome: ");
            // initialize user value to input and make all lowercase
            str = scan.nextLine().toLowerCase();

            // for loop  to create filtered string
            for (int item = 0; item <= str.length()-1; item++)
            {
                // if input is a valid letter
                if (str.charAt(item) > 96)
                {
                    // use string concatenation to convert char to String
                    String newChar = "" + str.charAt(item);
                    // add new character of type String to new filtered string
                    newStr = newStr + newChar;
                }
                else {
                    // otherwise, continue with filter loop
                    continue;
                }
            }

            // DEBUGGER
            //System.out.println(newStr);

            // Test filtered String
            left = 0;
            right = newStr.length() - 1;

            while (newStr.charAt(left) == newStr.charAt(right) && left < right)
            {
                left++;
                right--;
            }

            System.out.println();

            if (left < right)
                System.out.println("That string is NOT a palindrome.");
            else
                System.out.println("This string IS a palindrome.");

            System.out.println();
            System.out.print("Test another palindrome (y/n)? ");
            another = scan.nextLine();
        }
    }
}
