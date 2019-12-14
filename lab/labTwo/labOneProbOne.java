/*
Probem 1: Write a program to input the length, width and depth of a rectangular 
swimming pool and calculate the time it takes to fill it. Assume that the rate 
of the flow of water into the pool is 70 gallons per minute, and a cubic foot of 
water has a capacity of 7.48 gallons. 

Constants that we need:

    FlowRate = 70
    Capacity = 7.48

Input:

    length, width, depth (assume these are integers)

Output:

    TimeInMin

Formulas that we need:

    volume = length * width * depth
    poolCapacity = Capacity * volume
    timeInMin = poolCapacity / FlowRate

Therefore, we also need to declare volume and poolCapacity as variables where we 
will store intermediate results.
*/

//Lab 1, problem 1, version 1.
public class labOneProbOne {
    //when you define your constants within the class rather than a single method,
    //any method within that class can access it.
    final static int FlowRate = 70;
    //int is the default type for integers
    final static float Capacity = 7.48f;
    //float int is explicitly defined
    //when you see static, there are no object involved, access main method
    //with int, float, ect, you can specifiy how large of a space in memory you will need
    //to store data type
    public static void main(String[] args)
    {
        int length = 50, width = 25, depth = 5;
        // data of type int
        float volume, poolCapacity, timeInMin;
        // data of type float

        volume = length * width * depth;
        poolCapacity = Capacity * volume;
        // you cant represent a float as an integer, java represents them in sci.notation
        timeInMin = poolCapacity / FlowRate;

        System.out.println ("The time to fill the pool is "+timeInMin+" minutes.");
    }
}

