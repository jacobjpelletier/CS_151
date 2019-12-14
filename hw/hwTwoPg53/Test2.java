/* PP 1.2 Introduce the following errors, one at a time, to the program from PP 1.1. Record any error messages the compiler 
produces. Fix the previous error each time before you introduce a new one. If no error messages are produced, explain why. 
Try to predict what will happen before you make each change.
*/

public class Test2 {
  public static void main(String[] args)
  {
    System.out.println("An emergency Broadcast");
  }
}

// a. change Test2 to test2 --> error: Test2.java:6: error: class test2 is public,
// should be declared in a file named test2.java

// b. change Emergency to emergency --> error: none. this only alters the string printed by the program

// c. remove the first quotation mark in the string --> error(s): 1) expected ')' and 2) unclosed string literal

// d. remove the last quotation mark --> error: unclosed string literal

// e. change main to man --> error: it will compile, but when you run the compile code it states there is no main method
// found in the class Test2

// f. change println to bogus --> error: cannot find symbol bogus

// g. remove semicolon --> error: ';' expected

// h. remove the last bracket --> error: "reached end of file while parsing"