package arrays;

import java.util.Arrays;

public class RotateArray {


    public static void main(String[] args) {
        int [] arr = {-1 , -100 , 3, 99};

        int [] arr1 = {1,2,3,4,5,6,7};
        int [] arr2 = {1,2};

        rotate(arr,2);
        rotate(arr1,3);
        rotate(arr2,3);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    public static void rotate(int[] nums, int k) {

        int n = nums.length;

        while(k>n)
        {
            k = k-n;
        }

        //reverse array from k+1 to n

        reverse(nums,n-k, n-1);

        //reverse array from 0 to k

        reverse(nums ,0 , n-k-1);
        //reverse the complete array
        reverse(nums, 0 , n-1);
    }


   static  void reverse(int [] arr , int start , int end)
    {
        while(start<=end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
