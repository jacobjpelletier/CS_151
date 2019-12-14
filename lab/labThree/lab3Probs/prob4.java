/*
Problem 4. Write a program to output a table of conversion from US dollars 
to Euro. The table should contain the column heading with the 
first column saying "US dollars", and the second saying "Euro". 
Start with $10 and go to $100 with increments of $10. Assume 1 Euro = $ 1.40 .
*/

import java.text.DecimalFormat;

public class prob4
{
    public static void main(String[] args)
    {
        double dollars = 10.00, euro;
        System.out.println("Dollars\t" + "\tEuros" + "\n_______\t" + "\t______");

        DecimalFormat fmt = new DecimalFormat("0.##");

        while (dollars <= 100.00)
        {
         System.out.println(fmt.format(dollars) + "\t\t" + fmt.format(dollars/1.4));
         dollars += 10.00;
        }
    }
}