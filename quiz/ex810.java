//**********************************************************************************************************************
//  Write a method called switchThem that accepts two integer arrays as parameters and switches the contents of the
//  arrays. Take into account that the array be of different sizes.
//**********************************************************************************************************************

public class ex810 {
//----------------------------------------------------------------------------------------------------------------------
// test suite for ArrayMethods which accomplish specs of example 8.10
//----------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        int[] one = {1, 2, 3, 4};
        int[] two = {2, 4, 6, 8};

        System.out.println();
        System.out.println("array one before switch: " + ArrayMethods.stringThisThing(one));
        System.out.println("array two before switch: " + ArrayMethods.stringThisThing(two));
        ArrayMethods.switchThem(one, two);
        System.out.println();
        System.out.println("array one after switch: " + ArrayMethods.stringThisThing(one));
        System.out.println("array two after switch: " + ArrayMethods.stringThisThing(two));
        System.out.println();
    }
}

class ArrayMethods {
//----------------------------------------------------------------------------------------------------------------------
// provides utility static methods to work with int arrays
//----------------------------------------------------------------------------------------------------------------------

    public static void switchThem(int[] firstArray, int[] secondArray) {
        //--------------------------------------------------------------------------------------------------------------
        // given two arrays of the same length, will return their values switched
        //--------------------------------------------------------------------------------------------------------------

        if (firstArray.length == secondArray.length) {
            int[] temp = new int[firstArray.length];

            for (int index = 0; index < firstArray.length; index++) {
                temp[index] = firstArray[index];
                firstArray[index] = secondArray[index];
                secondArray[index] = temp[index];
            }
        }
        else
            System.out.println("\nERROR: integer arrays are of two different index lengths!" +
                    "\n\t<Cannot swith array elements>");
    }

    public static String stringThisThing(int[] array) {
        //--------------------------------------------------------------------------------------------------------------
        // given an integer array, will return a string representation
        //--------------------------------------------------------------------------------------------------------------
        String result = "";
        for (int index = 0; index < array.length; index++) {
            result += Integer.toString(array[index]) + " ";
        }
        return result;
    }
}
