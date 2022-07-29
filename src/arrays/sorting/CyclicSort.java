package arrays.sorting;

import java.util.Arrays;

public class CyclicSort {


    public static void main(String[] args) {
        int [] arr ={4, 3, 2, 7, 8, 2, 3, 1};

        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] array) {


        int i = 0;

        while (i < array.length) {

            int correct = array[i]-1;
            if (array[i] != array[correct]) {
                swap(array, correct, i);
            } else {
                i++;
            }
        }


        return array;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
