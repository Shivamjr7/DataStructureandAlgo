package arrays;

import java.util.Arrays;

public class RearrangeAlternateHighandLow {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		new RearrangeAlternateHighandLow().rearrange(arr);
		
		System.out.println(Arrays.toString(arr));
	}

	void rearrange(int[] arr) {
		for (int i = 1; i < arr.length; i = i + 2) {
			if (arr[i - 1] > arr[i]) {
				swap(arr, i-1, i);
			}

			if (i + 1 < arr.length && arr[i + 1] > arr[i])
				swap(arr, i, i + 1);
		}
	}

	void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
