import java.util.*;

public class hwFourProbOne {

  //------------------------------------------------------------------------------------------
  // main method which tests custom class Phone.java
  //------------------------------------------------------------------------------------------
  public static void main(String[] args) {
    
    Phone userNumber; // initialize Phone object

    /* take in user data below */
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter phone number in the format of (555) 555-5555: ");
    String phoneNumber = scan.nextLine();
    System.out.println();

    userNumber = new Phone(phoneNumber); // create new Phone object with user input

    /* return tokenized output as desired */
    System.out.println("Area Code: " + userNumber.getAreaCode());
    System.out.println("Grouping: " + userNumber.getGrouping());
    System.out.println("Line Number: " + userNumber.getLineNumber());

  }
}

class Phone {

  private String number, areaCode, grouping, lineNumber, numberToEval; // private initialization of instance data

  //------------------------------------------------------------------------------------------
  // phone constructor takes in a string argument and stores components as data through tokenization
  // input data is expected as a string in the form (###) ### ####
  // data compentents from tokenization stored as strings
  //------------------------------------------------------------------------------------------
  public Phone(String phoneNumber) {
  
    numberToEval = phoneNumber;

    /* initiaze areaCode, grouping, and lineNumber to argument data */
    StringTokenizer strT = new StringTokenizer(numberToEval, " ");
    areaCode = strT.nextToken();
    grouping = strT.nextToken("-");
    lineNumber = strT.nextToken();

  }

  //------------------------------------------------------------------------------------------
  // getter methods
  //------------------------------------------------------------------------------------------
  public String getAreaCode() {
    return areaCode;
  }

  public String getGrouping() {
    return grouping;
  }

  public String getLineNumber() {
    return lineNumber;
  }
}       
