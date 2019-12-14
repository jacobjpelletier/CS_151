//*********************************************************
// BasicArray.java
// Deomonstrates basic array declaration and use
//*********************************************************

public class BasicArray {

  //---------------------------------------------------------
  // Creates an array, fills it with various integer values,
  // modifies one value, then prints them out.
  //---------------------------------------------------------
  public static void main(String[] args) {
    
    final int LIMIT = 15, MULTIPLE = 10;
    
    int[] list = new int[LIMIT]; //pass constant variable LIMIT as list length parameter

    // initializes the array values
    for (int index = 0; index < LIMIT; index++) {
      list[index] = index * MULTIPLE; // multiply index value by 10
    }

    list[5] = 999; // change array value at index 5 (6th element, 0 1 2 3 4 5 )
    
    // Print array values
    for (int value : list){
      System.out.print(value + " ");
    }
    System.out.println();
  }
} 
