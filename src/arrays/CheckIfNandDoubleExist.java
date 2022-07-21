package arrays;

import java.util.Arrays;

public class CheckIfNandDoubleExist {

    public static void main(String[] args) {

        int [] arr = {0,0};
        System.out.println(checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) {


        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {

            if(arr[i]>=0 && binarySearch(arr, i + 1, arr.length - 1, arr[i] * 2))
                return true;
            else if(arr[i]<0 && binarySearch(arr, 0, i-1, arr[i]*2))
                return true;
        }

        return false;
    }

   static  boolean binarySearch(int[] arr, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid])
                return true;
            if (target > arr[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }

        return false;
    }
}
