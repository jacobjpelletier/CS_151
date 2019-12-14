// Lab 3, problem 4, version 2
// Print a conversion table $US --> EURO

import java.text.*;

class ConvTable2 {
 
    static final float COEF = 1.40f;

    public static void main (String[] args) {

       final double COEF_REV = 1 / COEF;

       DecimalFormat precisionTwo = new DecimalFormat("#.00");

       int US = 10;

       System.out.println ("US dollars\tEuro");

       while (US <= 100) {
          System.out.println (US + "\t\t" + precisionTwo.format(COEF_REV * US) );
          US = US + 10;
       } 
    }
}