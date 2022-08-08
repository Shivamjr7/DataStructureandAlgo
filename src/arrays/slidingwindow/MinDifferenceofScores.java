package arrays.slidingwindow;

import java.util.Arrays;

public class MinDifferenceofScores {


    public static void main(String[] args) {

        int [] nums = {90};
        int [] nums1 = {9,1,7,4};


        System.out.println(minimumDifference(nums,1));
        System.out.println(minimumDifference(nums1,3));
    }

    public static  int minimumDifference(int[] nums, int k) {


        int start =0;
        int end = 0;

        int min = Integer.MAX_VALUE;

        Arrays.sort(nums);

        for(end=0;end<nums.length;end++)
        {


            //check for valid window

            if(end - start+1==k)
            {
                min = Math.min(nums[end]- nums[start],min);
                start++;
            }
        }

        return min;
    }
}
