package arrays;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {

		int[] arr = { 100, 4, 200, 1, 3, 2 };

		System.out.println(new LongestConsecutiveSequence().longestConsecutive(arr));

	}

	public int longestConsecutive(int[] nums) {
		int res = 0;

		Set<Integer> set = new HashSet<>();

		for (int num : nums) {
			set.add(num);
		}

		for (int num : nums) {

			if (!set.contains(num))
				continue;
			int max = 1;

			int add = num + 1;
			int sub = num - 1;

			while (set.contains(add)) {
				max++;
				set.remove(add);
				add++;
			}

			while (set.contains(sub)) {
				max++;

				set.remove(sub);
				sub--;
			}

			res = Math.max(max, res);
		}

		return res;

	}
}
