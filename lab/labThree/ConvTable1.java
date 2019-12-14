// Lab 3, problem 4, version 1
// Print a conversion table $US --> Euro

class ConvTable1 {
 
    static final float COEF = 1.40f;

    public static void main (String[] args) {

       final double COEF_REV = 1 / COEF;

       int US = 10;
 
       System.out.println ("US dollars\tEuro");

       while (US <= 100) {
          System.out.println (US + "\t\t" + (COEF_REV * US) );
          US = US + 10;
       } 
    }
}