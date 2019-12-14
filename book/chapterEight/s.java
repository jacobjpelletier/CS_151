import java.util.Scanner;
import java.util.Arrays;


public class s {
    
    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a length: ");
        int len = scanner.nextInt(); // reading a length
        int[] array = new int[len];  // creating an array with the specified length
        
        for (int i = 0; i <array.length; i++) {
            System.out.print("enter an element: ");
            array[i] = scanner.nextInt(); // read the next number of the array
        }
        System.out.println(Arrays.toString(array)); // output the array
    }
}
