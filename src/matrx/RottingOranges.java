package matrx;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
	private static int[][] DIRS = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

	public static void main(String[] args) {

		int[][] grid = { { 2, 1, 0 }, { 1, 1, 0 }, { 0, 1, 1 }, };
		new RottingOranges().orangesRotting(grid);
	}

	int time = 0;

	public int orangesRotting(int[][] grid) {
		int n = grid.length;
		int m = grid[0].length;

		Queue<int[]> queue = new LinkedList<>();

		int freshes = 0;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 2) {
					queue.add(new int[] { i, j });
				} else if (grid[i][j] == 1) {
					freshes++;
				}
			}
		}

		if (freshes == 0) {
			return 0;
		}

		for (int mins = 1; !queue.isEmpty(); mins++) {
			for (int s = queue.size(); s > 0; s--) {
				int[] node = queue.poll();

				for (int[] dir : DIRS) {
					int i = dir[0] + node[0];
					int j = dir[1] + node[1];

					if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != 1) {
						continue;
					}

					freshes--;

					if (freshes == 0) {
						return mins;
					}

					grid[i][j] = 2;
					queue.add(new int[] { i, j });
				}
			}
		}

		return -1;
	}
}
