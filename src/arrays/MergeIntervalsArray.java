package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervalsArray {

	public static void main(String[] args) {

		int[][] arr = { { 1, 3 }, { 2, 6 }, { 9, 10 }, { 15, 18 } };
		merge(arr);
	}

	public static int[][] merge(int[][] intervals) {

		List<int[]> res = new ArrayList<>();
		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

		int start = intervals[0][0];
		int end = intervals[0][1];

		for (int i = 1; i < intervals.length; i++) {

			int[] arr = intervals[i];
			if (arr[0] <= end) {
				end = Math.max(arr[1], end);
			} else {

				res.add(new int[] { start, end });
				start = arr[0];
				end = arr[1];

			}

		}

		res.add(new int[] { start, end });

		return res.toArray(new int[][] {});

	}

}
