package arrays.sorting;

import java.util.Arrays;

/**
 *  finds the max element and then swaps it with last index
 *  time complexity : best case O(n2) , worst case :O(n2)
 *  Stable sort algo : NO
 */
public class SelectionSort {


    public static void main(String[] args) {

        int []array =  {6,3,1,2,7,9,0};
        System.out.println(Arrays.toString(sort(array)));
    }

    static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int last = array.length -i- 1;
            int max_element_index = getMaxIndex(array, 0, last);

            //swap max with last index
            swap(array, max_element_index , last);

        }
        return array;
    }

    static int getMaxIndex(int[] arr, int start, int end) {

        int max = start;

        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max])
                max = i;
        }

        return max;
    }

    static void swap(int []array , int i , int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
