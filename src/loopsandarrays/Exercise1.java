package loopsandarrays;

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        //Exercise 1, 2 3

        // declare an empty integer array of length = 3
        // print the contents to the console

        int[] intArray = new int[3];
        System.out.println(Arrays.toString(intArray));

        //Exercise2
        // fill it with the number `4`
        // print the array to the console
        Arrays.fill(intArray, 4);
        System.out.println(Arrays.toString(intArray));

        //Exercise 3
        // reassign the second value in the array to the number `17`
        // print the array to the console

        intArray[1] = 17;
        System.out.println(Arrays.toString(intArray));
    }
}
