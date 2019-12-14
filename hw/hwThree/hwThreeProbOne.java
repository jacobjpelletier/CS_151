/*
Problem 1: Design and implement an application that produces a multiplication 
table showing the results of multiplying the integers 1 through 12 by themselves.
*/

public class hwThreeProbOne {

    public static void main(String[] args)
    {
        final int PER_LINE = 12;
        int row = 1, column = 1;

        while (row < 13)
        {
            System.out.print((column * row) + "\t");
            column ++;
            if (column % 13 == 0)
            {
                System.out.println();
                column = 1;
                row ++;
            }
        }
    }
}
