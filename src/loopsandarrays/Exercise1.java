package loopsandarrays;

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        //Exercise 1 and 2

        // declare an empty integer array of length = 3
        // print the contents to the console

        int[] intArray = new int[3];
        System.out.println(Arrays.toString(intArray));

        //Exercise2
        // fill it with the number `4`
        // print the array to the console
        Arrays.fill(intArray, 4);
        System.out.println(Arrays.toString(intArray));
    }
}
