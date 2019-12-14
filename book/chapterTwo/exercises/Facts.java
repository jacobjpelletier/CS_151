// Demonstrates the use of the string concatenates operator and the automatic conversion of an integer to a string

public class Facts
{
    public static void main(String[] args)
    {
        //strings can be concatenated into one long string
        System.out.println("We present the following facts for your "+
                "extracurricular edification");
        System.out.println();

        //a string can contain numeric digits
        System.out.println("Letters in the hawaiin alphabet: 12");

        //a numeric value can be concatenated to a string
        System.out.println("Dialing code for Antartica:: " + 999);
        System.out.println("Go " + 50 + " km/hr");
    }

}
