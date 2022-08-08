package arrays.slidingwindow;

public class LongestSubarrayof1With1zero {


    public static void main(String[] args) {
        int[] nums = {0,1,1,1,0,1,1,0,1};
        System.out.println(longestSubarray(nums));
    }

    public static int longestSubarray(int[] nums) {

        int start =0;
        int len = 0;

        int countOfZeros = 0;
        for(int end =0;end <nums.length;end++)
        {
            if(nums[end]==0)
            {
                countOfZeros++;
            }


            //found a valid window
            while(countOfZeros>1)
            {
                if(nums[start]==0) {
                    countOfZeros--;
                }
                start++;

            }
            len = Math.max(len , end-start);

        }

        return len;
    }

}
