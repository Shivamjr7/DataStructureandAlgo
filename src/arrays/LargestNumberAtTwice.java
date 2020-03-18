package arrays;

public class LargestNumberAtTwice {

	public static void main(String[] args) {

		int[] arr = { 0,0,0,1 };
		System.out.println(dominantIndex(arr));
	}

	public static int dominantIndex(int[] nums) {
		int firstlargest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;

		int index =0;
		for (int i = 0; i < nums.length; i++) {

			if (firstlargest < nums[i]) {
				secondlargest = firstlargest;
				firstlargest = nums[i];
				index =i;

			}
			
			
			if(secondlargest<nums[i] && nums[i]!=firstlargest)
			{
				secondlargest = nums[i];
			}

		}

		if (firstlargest >= (2 * secondlargest)) {
			return index;
		} else
			return -1;

	}
}
