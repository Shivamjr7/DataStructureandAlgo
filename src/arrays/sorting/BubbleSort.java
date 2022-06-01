package arrays.sorting;

import java.util.Arrays;

/**
 *  compares 2 elements and swaps
 *  with each iteration the largest element is at the end of array
 *  time complexity : O(n^2) , best case : O(n)
 *  Stable sort algo  : YES
 */
public class BubbleSort {


    public static void main(String[] args) {
        int [] array = {3,5,1,4,6};
        System.out.println(Arrays.toString(sort(array)));


        int [] sortedArr = {1,2,3,4,5};
        System.out.println(Arrays.toString(sort(sortedArr)));
    }

    static int[] sort(int[] arr) {
        int n = arr.length;
        boolean swapped ;
        for (int i = 0; i < n; i++) {
            swapped = false;
            for (int j = 1; j < n - i ; j++) {
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }

            if(!swapped) {
                break;
            }
        }

        return arr;
    }

}
