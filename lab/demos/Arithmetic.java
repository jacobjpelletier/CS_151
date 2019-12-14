class Arithmetic {

   public static void main (String[] args) {

     System.out.println ("17 / 5 = " + (17 / 5)); // 3, drops decimal data
     System.out.println ("17.0 / 5 = " + (17.0 / 5)); // 3.4
     System.out.println ("17 / 5.0 = " + (17 / 5.0)); // 3.4
     System.out.println ("9 / 12 = " + (9 / 12)); // 0, drops decimal data
     System.out.println ("9.0 / 12.0 = " + (9.0 / 12.0)); // 0.75
     System.out.println ("6 % 2 = " + (6 % 2)); // 0, 6/3 results no remainder
     System.out.println ("14 % 5 = " + (14 % 5)); //4
     System.out.println ("-14 % 5 = " + (-14 % 5));  // -4
     System.out.println ("14 % -5 = " + (14 % -5));  // 4
     System.out.println ("5 + 12 / 5 - 10 % 3 = " + 
                              (5 + 12 / 5 - 10 % 3)); // 6
   }
}