/*
Problem 3: Mexico's population is 62 million and is growing at the annual 
rate of 7%. The United States' current population is 280 million and is
growing at the annual rate of 2%. If these two countries were to
maintain their current rates of growth, in how many years will Mexico's
population be more than half that of the United States? Your program
should answer this question.
*/

public class hwThreeProbThree
{
    public static void main(String[] args)
    {
        int mexPop = 62000000, usPop = 280000000, years = 0;

        while (mexPop < (usPop/2))
        {
            mexPop = (int) ((mexPop * 0.07) + mexPop);
            usPop = (int) ((usPop * 0.02) + usPop);
            years++;
            // DEBUGGER
            // System.out.println("Mex: " + mexPop + "\tUS: " + usPop + "\tYears: " + years);
        }
        System.out.println("It will take " + years + " years for the Mexican population to be more than half" +
                " of America's population at annual growth rates of 7% and 2%, respectively. The Mexican population" +
                " would be " + mexPop + " while America's would be " + usPop + ".");
    }
}