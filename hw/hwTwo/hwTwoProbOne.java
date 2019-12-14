/*
Problem 1 (From L&L, chapter2 projects) Write an application that reads values
representing time durations in hours, minutes, and seconds, and then prints the 
equivalent total number of seconds (EX. 1 hour, 28 minutes and 42 seconds is 
equivalent to 5322 seconds.)
*/

import java.util.Scanner;

public class hwTwoProbOne
{
  public static void main(String[] args)
  {
    int hours, mins, secs, totalsecs;    

    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter number of hours: ");
    hours = scan.nextInt();

    System.out.print("Enter number of minutes: ");
    mins = scan.nextInt();

    System.out.print("Enter number of seconds: ");
    secs = scan.nextInt();

    totalsecs = (hours*60*60)+(mins*60)+(secs);
    System.out.println(hours + " hours, " + mins + " minutes, and " + secs + " seconds is equivalent to " +
      totalsecs + " seconds.");
  }
}