package arrays;

public class SearchInSortedRotatedArray {

	public static void main(String[] args) {

		int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
		System.out.println(search(arr,1));
	}

	public static int search(int[] nums, int target) {

		if (nums == null || nums.length == 0)
			return 0;

		int pivot = findPivot(nums);

		int start = 0;
		int end = 0;

		if (pivot > 0 && target >= nums[0] && target <= nums[pivot - 1]) {
			start = 0;
			end = pivot - 1;
		} else {
			start = pivot;
			end = nums.length - 1;

		}

		while (start <= end) {
			int mid = (start + end) / 2;

			if (nums[mid] == target)
				return mid;
			else if (target > nums[mid]) {
				end = mid - 1;
			} else
				start = mid + 1;
		}

		return -1;

	}

	public static int findPivot(int[] nums) {
		int start = 0;
		int end = nums.length - 1;

		// finding pivot
		while (start <= end) {
			int mid = (start + end) / 2;

			if (nums[mid] > nums[mid + 1])
				return mid + 1;
			else if (nums[mid] <= nums[start]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}

		return 0;
	}
}
