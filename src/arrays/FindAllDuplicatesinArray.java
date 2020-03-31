package arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements
 * appear twice and others appear once.
 * 
 * Find all the elements that appear twice in this array.
 * 
 * Could you do it without extra space and in O(n) runtime?
 * 
 * Example: Input: [4,3,2,7,8,2,3,1]
 * 
 * Output: [2,3]
 * 
 * @author sjari
 *
 */
public class FindAllDuplicatesinArray {

	public static void main(String[] args) {

		int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
		findDuplicates(arr);
	}

	public static List<Integer> findDuplicates(int[] nums) {

		List<Integer> res = new ArrayList<Integer>();

		if (nums.length == 0)
			return res;

		for (int i = 0; i < nums.length; i++) {
			int index = Math.abs(nums[i]) - 1;

			if (nums[index] < 0)
				res.add(index + 1);

			else {
				nums[index] = -nums[index];
			}
		}

		return res;
	}

}
