package arrays;

public class MinimumSizeSubarraySum {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 1, 2, 4, 3 };
		System.out.println(minSubArrayLen(7, arr));
	}

	public static int minSubArrayLen(int s, int[] nums) {

		int window_start = 0;

		int sum = 0;
		int minlength = Integer.MAX_VALUE;

		for (int window_end = 0; window_end < nums.length; window_end++) {
			sum += nums[window_end];

			while (sum >= s) {
				minlength = Math.min(minlength, window_end - window_start+1);
				sum = sum - nums[window_start++];

			}
		}

		return minlength;
	}
}
