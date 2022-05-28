package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraysInJava {


    public static void main(String[] args) {


        /**
         * Ways of declaring array
         */
        int[] intArray = new int[10];
        intArray[0] = 1;

        int[] intArray1 = {1, 2, 3, 4,9,2};

        int[] intArray2 = new int[]{1, 2, 3, 4,6,3};


        /**
         * methods in arrays
         */

        int length = intArray.length;
        System.out.println("length of array : " + length); //10



        /**
         * Stream of arrays
         */
        int sum = Arrays.stream(intArray2)
                .sum();


        System.out.println("sum of arrays :" + sum);


        Arrays.stream(intArray1)
                .forEach(System.out::println);


        /**
         * Multi dimension arrays
         */

        //this means there are 2 arrays(rows) and each row has an array of 3 elements
        int [][] multi = new int[2][3]; // not mandatory to specify columns

        int [][] multi1 = {{2,3,},{4,5},{6,7,8,8}}; // [3][]


        /**
         * Sorting an array with inbuit methods
         */

        System.out.println("Sorting using Arrays.sort");
        Arrays.sort(intArray1);

        System.out.println(Arrays.toString(intArray1));

        System.out.println("Sorting arrays with stream");
        Arrays.
                stream(intArray2)
                .sorted()
                .forEach(System.out::println);


    }
}
