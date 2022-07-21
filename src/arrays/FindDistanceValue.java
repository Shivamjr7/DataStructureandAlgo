package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class FindDistanceValue {


    public static void main(String[] args) {
        int[] arr1 = {-3,10,2,8,0,10};
        int[] arr2 = {-9,-1,-4,-9,-8};




        System.out.println(findTheDistanceValue(arr1, arr2,  9));
    }

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {


        Arrays.sort(arr2);

        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            int num = arr1[i];
            if (binarySearch(arr2, num) > d)
                count++;
        }

        return count;


    }


    static int binarySearch(int[] arr, int num) {
        int ans = 0;


        int start = 0;
        int end = arr.length - 1;

        int diff = Integer.MAX_VALUE;
        while (start < end) {
            int mid = start + (end - start) / 2;

//            diff = Math.min(diff, Math.abs(num - arr[mid]));
            if (arr[mid] == num)
                return ans;
            else if (num > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid;
            }

        }

        diff = Math.min(diff, Math.abs(num - arr[start]));
        ans = diff ==Integer.MAX_VALUE ? 0 : diff;


        return ans;
    }
}
