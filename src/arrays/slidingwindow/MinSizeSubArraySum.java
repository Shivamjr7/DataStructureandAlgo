package arrays.slidingwindow;

public class MinSizeSubArraySum {


    public static void main(String[] args) {
        int [] nums ={2,3,1,2,4,3};
        int [] nums1 = {1,1,1,1,1,1,1,1};
        int [] nums2 = {1,4,4};


        System.out.println(minSubArrayLen(7,nums));
        System.out.println(minSubArrayLen(11,nums1));
        System.out.println(minSubArrayLen(1,nums2));
    }

    public static  int minSubArrayLen(int target, int[] nums) {

        int i = 0;
        int j = 0;

        int sum = 0;
        int len = Integer.MAX_VALUE;
        while (i < nums.length) {

            // keep on increasing the window till sum < target
            while (j< nums.length && sum < target) {
                sum += nums[j];
                j++;
            }

            //found a window , calculate the length and store min length window
            if(sum>=target) {
                len = Math.min(len, j - i );

                sum = sum - nums[i];

            }
            i++;
        }


        return len==Integer.MAX_VALUE ? 0 : len;
    }
}
