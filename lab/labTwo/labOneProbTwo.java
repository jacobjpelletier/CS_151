/*
Problem 2: Given the length and the width of a rectangular yard, and the length 
and the width of a rectangural house situated in this yard, write a program to 
compute the time required to cut the grass at the rate of 2 square meters per 
second. Assume that all input data are given in yards.

Constants that we need:

    YardsToMeters = 0.8

Input:   
 
    yardWidth, yardLength, houseWidth, houseLength (assume these are integers)

Output:

    time needed to cut the grass, timeInMin

Formulas that we need:

   yardArea = yardWidth * yardLength
   houseArea = houseWidth * houseLength
   grassArea = yardArea - houseArea
   grassAreaInSqM = grassArea * YardsToMeters
   timeInSec = grassAreaInSqM / 2
   timeInMin = timeInSec / 60

Therefore, we also need to declare the following variables: yardArea, houseArea, 
grassArea, grassAreaInSqM, timeInSec, where we will store intermediate results. 

*/

//Nothing is going to change, except now we want to read data from the keyboard
//Because we are going to ask the user for information

import java.util.Scanner;

public class labOneProbTwo {
    //when you define your constants within the class rather than a single method,
    //any method within that class can access it.
    final static int FlowRate = 70;
    //int is the default type for integers
    final static float Capacity = 7.48f;
    //float int is explicitly defined as constant, eg "final static float. ."
    //floats automatically stored as double, by default by java
    //you cant take 64 bits and move into 32 bits
    //f forces java to forget about the rest of the 32 bits, so that you can fit it into 32 bits.
    //when you see static, there are no object involved, access main method
    //with int, float, ect, you can specifiy how large of a space in memory you will need
    //to store data type
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the length of the pool: ");
        int length = scan.nextInt();

        System.out.print("Enter the width of the pool: ");
        int width = scan.nextInt();

        System.out.print("Enter the depth of the pool: ");
        int depth = scan.nextInt();

        volume = length * width * depth;
        poolCapacity = Capacity * volume;
        // you cant represent a float as an integer, java represents them in sci.notation
        timeInMin = poolCapacity / FlowRate;

        System.out.println ("The time to fill the pool is "+timeInMin+" minutes.");
    }
}
