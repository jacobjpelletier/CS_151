/* This program converts and displays a temperature input in
   degrees Fehrenheit to a temperature in degrees Celcius. */

import java.util.Scanner;

class ConvertorFtoC {

  final static int Coeficient  = 32;

  public static void main (String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.print ("Enter the temperature in degrees Fehrenheit: ");
    float temperatureF = scan.nextFloat();
    System.out.println (temperatureF);

    float temperatureC = (temperatureF - Coeficient) * (5f / 9f);
    
    System.out.println (temperatureF + " degrees Fehrenheit corespond to " + 
                        temperatureC + " degrees Celcius.");
  
  }
}