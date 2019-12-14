// This application program illustrates how to
// read text from the keyboard, and tests your
// Java version.

import java.util.Scanner;

/*
-here, you need to import Scanner, this allows you to use
keyboard input.
*/

public class TryApplication2 {

   public static void main (String[] args) {

      String text;
      
      /*
      -This declares the new variable text as a string (to be defined later) 
      - declares space in memory, reserves space called "text" for string data.
      */
      
      Scanner scan = new Scanner (System.in);
      
      /*
      -scan here is an object of Class Scanner. 
      - in the format of "classNameHere obj = new classNameHere"
      -we want the new object to have the properties allowed that specifiy 
        keyboard
      - import Scanner, and memorize "Scanner scan = new Scanner (system.in)"
      */
      
      System.out.println();
      
      /*
      -  
      */

      System.out.println("Type a line of text on the keyboard ");
      System.out.println("and press \"Enter\" when finished: ");
      
      /*
      - \ is an escape key
      - by pressing enter, you move inout from buffer device into main memory, 
        to place in space in memory called "text"
      - = is an assignment value that associated a variable to the data intended
      - the variable "text" is the name of the memory location
      */

      System.out.println();
      text = scan.nextLine();

      /*
      - next line, whatever you typed will be interpreted as a string,
        e.g. 5 would be character 5 not int 5 
      */

      System.out.println();
      System.out.println("The text you typed was: \"" + 
                     text + "\" ");
      /*
      -concatenates input with formatting
      */  
  }
}
