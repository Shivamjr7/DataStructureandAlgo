package arrays.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class MaxiumErasureValue {


    public static void main(String[] args) {

        int [] nums  = {5,2,1,2,5,2,1,2,5};

        System.out.println(maximumUniqueSubarray(nums));
    }
    public static  int maximumUniqueSubarray(int[] nums) {


        int start =0;
        int sum =0;

        int max_sum = 0;

        boolean [] seenNo = new boolean[10001];

        for(int end =0;end<nums.length;end++)
        {


            sum += nums[end];


            while(seenNo[nums[end]])
            {
                sum = sum - nums[start];
                seenNo[nums[start]] = false;
                start++;

            }

            seenNo[nums[end]] = true;
            max_sum = Math.max(sum , max_sum);

        }

        return max_sum;
    }
}
