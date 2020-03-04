package arrays;

import java.util.Arrays;

public class SortBinaryArrayinLinearTime {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 0, 1, 1, 0 };

		System.out.println(Arrays.toString(sortBinaryArray(arr)));
	}

	static int[] sortBinaryArray(int[] nums) {

		int j = 0;
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == 0) {
				swap(nums, i, j);
				j++;
			}

		}

		return nums;
	}

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
