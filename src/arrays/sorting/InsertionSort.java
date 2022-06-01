package arrays.sorting;

import java.util.Arrays;

/**
 *  With every pass it sorts the array till j value
 *  time complexity : worst case O(n2) , best case : O(n) : when array is already sorted
 *  stable : YES
 */
public class InsertionSort {

    public static void main(String[] args) {
        int [] arr = {6,4,2,1,5};

        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    swap(array, j, j-1);
                } else {
                    break;
                }
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
