package arrays;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {

	public static void main(String[] args) {
		int[][] arr = { { 1, 3 }, { 6, 9 } };

		insert(arr, new int[] { 2, 5 });
	}

	public static int[][] insert(int[][] intervals, int[] newInterval) {

		List<int[]> res = new ArrayList<>();

		int i = 0;

		while (i < intervals.length && intervals[i][1] < newInterval[0]) {
			res.add(intervals[i++]);
		}

		while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
			newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
			newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
			i++;
		}

		res.add(newInterval);

		while (i < intervals.length) {
			res.add(intervals[i++]);
		}
		return res.toArray(new int[][] {});
	}

}
