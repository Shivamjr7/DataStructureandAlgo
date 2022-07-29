package arrays.slidingwindow;

public class MaxAverageSubarrayI {


    public static void main(String[] args) {
        int [] nums = {-1};


        System.out.println(findMaxAverage(nums,1));
    }

    public static  double findMaxAverage(int[] nums, int k) {


        int start = 0;
        double avg = Integer.MIN_VALUE;

        double sum = 0;
        for (int end = 0; end < nums.length; end++) {

            sum = sum + nums[end];

            if (end - start + 1 == k) {
                double newAvg = (sum / k);

                avg = Math.max(newAvg, avg);

                sum = sum - nums[start];
                start++;
            }


        }

        return avg;


    }
}
