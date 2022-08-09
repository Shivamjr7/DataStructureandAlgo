package arrays.slidingwindow;

public class CountNiceSubArrays {


    public static void main(String[] args) {
        int[] nums = {2,4,6};
        System.out.println(numberOfSubarrays(nums, 1));
    }

    public static int numberOfSubarrays(int[] nums, int k) {


        int start = 0;

        int count = 0;
        int res = 0;
        int end = 0;
        int countSubArray = 0;

        for (end = 0; end < nums.length; end++) {

            // increment the count for odd elements
            if (nums[end] % 2 != 0) {
                count++;
            }


            // when the subarray with k odd elements are found ,
            // keep on checking if next element is even
            // if next element is even it will add to subarray count
            if (count == k) {
                countSubArray++;
            }

            // if count of odd becomes greater , increment start till k odd elements array is found again
            while (count > k && start < end) {
                res = res + countSubArray;

                if (nums[start] % 2 != 0) {
                    count--;
                    // if odd element is removed from start , will count the subarrays again
                    countSubArray=1;
                }
                start++;
            }


        }


        // edge case when start < end ex: {2,2,2,1,2,2,1,2,2,2}
        // in this case start will be less than end and count will be valid
        while(count==k && start<end)
        {
            if(nums[start]%2!=0)
                count--;

            res = res + countSubArray;
            start++;
        }


        return res;
    }
}
