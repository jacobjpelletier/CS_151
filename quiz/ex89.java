//**********************************************************************************************************************
//  Write a method called sumArray that accepts an array of floating point values and returns the sum of the values
//  stored in the array.
//**********************************************************************************************************************

import java.util.Scanner;

public class ex89 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] array = new double[10]; // array of floating point values

        for (int index = 0; index < array.length; index++) {
            System.out.print("Enter double number " + (index+1) +" of " + array.length + " to add to the array: ");
            array[index] = scan.nextDouble();
        }
        DoubleArray custom = new DoubleArray(array);
        System.out.println("The sum of your double array is " + custom.sumArray());

    }
}

class DoubleArray {

    private double[] doubleArray;

    public DoubleArray(double[] array) {
        doubleArray = array;
    }

    public double sumArray() { // returns the sum of an array of doubles
        double sum = 0;
        for (double element : doubleArray) {
            sum += element;
        }
        return sum;
    }
}