//**********************************************************************************************************************
// VariableParameters.java
//
// Demonstrates the use of a variable length parameter list.
//**********************************************************************************************************************

public class VariableParameters {
    //------------------------------------------------------------------------------------------------------------------
    //  Creates two family objects using a constructor that accepts a variable number of String objects as parameters
    //------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        Family lewis = new Family("John", "Sharon", "Justin", "Kayla", "Nathan", "Samantha");

        Family camden = new Family("Stephen", "Annie", "Matt", "Mary", "Simon", "Lucy", "Ruthie", "Sam", "David");

        System.out.println(lewis);
        System.out.println();
        System.out.println(camden);
    }
}

class Family {

    private String[] members;

    //------------------------------------------------------------------------------------------------------------------
    //  Constructor
    //------------------------------------------------------------------------------------------------------------------
    public Family(String ... names)
    {
        members = names;
    }

    //------------------------------------------------------------------------------------------------------------------
    //  Returns a string representation of this family
    //------------------------------------------------------------------------------------------------------------------
    public String toString() {
        String result = "";

        for (String name : members)
            result += name + "\n";

        return result;
    }
}

