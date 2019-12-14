/*

Problem 2:  Write a program to advise you what to wear if the outside 
temperature is known, as well as it is known if it is raining or not. 
Your program should be able to capture the following cases:

     -- if the outside temperature is less than 60 degrees and it is
        raining, then the program should advise you to wear a raincoat
        and get an umbrella;
     -- if it is not raining, but the temperature is below 60, then
        it should advise you to wear an overcoat;
     -- if the temperature is above 60, but below 70, it should advise
        you to wear a jacket, and if it is raining -- get an umbrella
        too;
     -- if the temperature is above 70 and it is raining, the program
        should advise you to get an umbrella;
     -- in all other cases, the program should tell you that there is 
        nothing to worry about.  

*/

import java.util.Scanner;

public class prob2 
{
  public static void main(String[] args)
  {
  
    int temp = 60;
    boolean raining = true;

    Scanner scan = new Scanner(System.in);
  
    System.out.print("Enter integer temperature in Fahrenheit: ");
    temp = scan.nextInt();

    System.out.print("Enter if it is raining,\"true\" or \"false\": ");
    raining = scan.nextBoolean();

    if (raining == true)
    {
      if (temp < 60)
      {
        System.out.println("It is cold and raining, wear a raincoat and get an umbrella.");
      }
      if (temp >= 60 && temp <= 70)
      {
        System.out.println("It is raining but temp between 60 and 70, get a jacket and an umbrella.");
      }
      if (temp > 70)
      {
        System.out.println("It is raining but the temp is greater than 70, get an umbrella.");
      }
    }
    else
    {
     if (temp < 60)
     {
       System.out.println("It is not raining but cold, grab an overcoat.");
     }
     if (temp >= 60 && temp <= 70)
     {
       System.out.println("It is not raining but temp is between 60 and 70, grab a jacket.");
     }
     if (temp > 70)
     {
       System.out.println("Don't worry about it.");
     }
    }
  }
}
