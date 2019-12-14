/*
Write an application program that prints AAAAAAA BBBBBBB
CCCCCCC in three different ways:
    a)  on one line
    b)  on three lines
    c)  inside a box made up of the characters * and =
*/

public class hwOneProbTwo
{
  public static void main(String[] args)
  {
    //print on one line	
    System.out.println("\npart a:\n");
    System.out.println("AAAAAAA BBBBBBB CCCCCCC");
    //print on three lines
    System.out.println("\npart b:\n");
    System.out.println("AAAAAAA");
    System.out.println("BBBBBBB");
    System.out.println("CCCCCCC");
    System.out.println("\npart c:\n");
    System.out.println("*==================*");
    System.out.println("*      AAAAAAA     *");
    System.out.println("*      BBBBBBB     *");
    System.out.println("*      CCCCCCC     *");
    System.out.println("*==================*");
  }
}
