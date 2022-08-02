package arrays;

import java.util.Arrays;

public class SortColors {

    public static void main(String[] args) {

        int [] arr = {0,1,0,1,2,1,0,1,2,0};

        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static  void sortColors(int[] nums) {

        int i =0;
        int j = 0;
        int end = nums.length-1;
        int pivot =1;



        while(j<=end)
        {
            if(nums[j]<pivot)
            {
                swap(nums,i,j);
                i++;
                j++;
            }
            else if(nums[j]==pivot)
            {
                j++;
            }

            else if(nums[j]>pivot)
            {
                swap(nums, j , end);
                end--;
            }

        }
    }

    static void swap(int []arr, int i , int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
