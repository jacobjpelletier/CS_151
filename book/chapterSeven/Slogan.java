// represents a single slogan string
package sloganPack;

public class Slogan {

  private String phrase;
  private static int count = 0;

  // construcotr 
  public Slogan(String str) {
    phrase = str;
    count++;
  }
  
  public String toString() {
    return phrase;
  }
  
  public static int getCount() {
    return count;
  }
}
