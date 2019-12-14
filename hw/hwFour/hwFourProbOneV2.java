import java.util.*;

//------------------------------------------------------------------------------------------
// Rather than using StringTokenizer, split was used in this solution.
// NOTE FROM ORACLE ON tokenizer vs split:
// https://docs.oracle.com/javase/7/docs/api/java/util/StringTokenizer.html
// "StringTokenizer is a legacy class that is retained for compatibility reasons although its use is discouraged in new
// code. It is recommended that anyone seeking this functionality use the split method of String or the java.util.regex
// package instead."
//------------------------------------------------------------------------------------------
public class hwFourProbOneV2 {

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

    private String number, areaCode, grouping, lineNumber; // private initialization of instance data

    //------------------------------------------------------------------------------------------
    // phone constructor takes in a string argument and stores components as data using split method
    // input data is expected as a string in the form (###) ### ####
    // data compentents from tokenization stored as strings
    //------------------------------------------------------------------------------------------
    public Phone(String phoneNumber) {

        /* initiaze areaCode, grouping, and lineNumber to argument data */
        String[] numberToEval = phoneNumber.split("\\s|\\-");
        for (int x=0; x<numberToEval.length; x++) {
            switch (x) {
                case 0:
                    areaCode = numberToEval[x];
                    break;
                case 1:
                    grouping = numberToEval[x];
                    break;
                case 2:
                    lineNumber = numberToEval[x];
            }
        }
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