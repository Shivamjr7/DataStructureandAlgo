package arrays;

public class FindMinInSortedRotatedArray {

	public static void main(String[] args) {
		int[] arr = { 4,5,6,7,0,1,2 };
		System.out.println(findMin(arr));

	}

	public static int findMin(int[] nums) {
		if (nums.length == 0)
			return -1;

		if (nums.length == 1)
			return nums[0];

		int start = 0;
		int end = nums.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;

			if (mid>0  &&  nums[mid - 1] > nums[mid]) {
				return nums[mid];
				// sorted on the ledt side and not on the right
			} else if (nums[start]<=nums[mid] && nums[mid]>nums[end])
				start = mid + 1;
			else
				end = mid - 1;

		}

		return nums[start];
	}
}
