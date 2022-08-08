package arrays.slidingwindow;

public class MaxConsecutiveOnesIII {


    public static void main(String[] args) {

        int [] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};

        System.out.println(longestOnes(nums,3));
    }
    public static  int longestOnes(int[] nums, int k) {


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
                 while(countOfZeros>k)
                {
                    if(nums[start]==0) {
                        countOfZeros--;
                    }
                    start++;

                }
            len = Math.max(len , end-start+1);

        }

        return len;

    }
}
