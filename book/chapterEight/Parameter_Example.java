// Parameter passing example
// adapted from the book, page 327 -- 331

class Parameter_Passing {

   public static void exchange (int formal1, int formal2,
                                Num formal3, Num formal4, Num formal5) {

      System.out.println();
      System.out.println ("Before changing values1: ");
      System.out.println ("Formal parameter 1: " + formal1);
      System.out.println ("Formal parameter 2: " + formal2);
      System.out.println ("Formal parameter 3: " + formal3.getValue());
      System.out.println ("Formal parameter 4: " + formal4.getValue());
      System.out.println ("Formal parameter 5: " + formal5.getValue());

      formal2 = 5;
      formal4.setValue(8);
      formal5 = new Num(20);

      System.out.println();
      System.out.println ("After changing values1: ");
      System.out.println ("Formal parameter 1: " + formal1);
      System.out.println ("Formal parameter 2: " + formal2);
      System.out.println ("Formal parameter 3: " + formal3.getValue());
      System.out.println ("Formal parameter 4: " + formal4.getValue());
      System.out.println ("Formal parameter 5: " + formal5.getValue());
   }

   public static void main (String[] args) {

      int actual1 = 6;
      int actual2 = 9;
      Num actual3 = new Num (7);
      Num actual4 = new Num (1);
      Num actual5 = new Num (10);

      System.out.println();
      System.out.println ("Before method call: ");
      System.out.println ("Actual parameter 1: " + actual1);
      System.out.println ("Actual parameter 2: " + actual2);
      System.out.println ("Actual parameter 3: " + actual3.getValue());
      System.out.println ("Actual parameter 4: " + actual4.getValue());
      System.out.println ("Actual parameter 5: " + actual5.getValue());

      exchange(actual1, actual2, actual3, actual4, actual5);

      System.out.println();
      System.out.println ("After method call: ");
      System.out.println ("Actual parameter 1: " + actual1);
      System.out.println ("Actual parameter 2: " + actual2);
      System.out.println ("Actual parameter 3: " + actual3.getValue());
      System.out.println ("Actual parameter 4: " + actual4.getValue());
      System.out.println ("Actual parameter 5: " + actual5.getValue());

   }
}

class Num {

   int value;

   public Num (int number) {
     value = number;     
   }

   int getValue () {
     return value;
   }

   void setValue (int number) {
     value = number;
   }
}