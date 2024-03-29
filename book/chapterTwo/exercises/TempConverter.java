// Deomonstrates the use of primitive data types and arithmetic expressions

public class TempConverter
{
    public static void main(String[] args)
    {
        final int BASE = 32;
        final double CONVERSION_FACTOR = 9.0/5.0;

        double fahrenheitTemp;
        int celsiusTemp = 24; // value to convert

        fahrenheitTemp = celsiusTemp * CONVERSION_FACTOR + BASE;
        System.out.println("Celsius Temperature: " + celsiusTemp);
        System.out.println("Fahrenheit Equivalent: " + fahrenheitTemp);
        System.out.println("9/5: " + 9.0/5.0);
    }
}