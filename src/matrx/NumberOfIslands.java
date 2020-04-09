package matrx;

public class NumberOfIslands {

	public static void main(String[] args) {

		char[][] grid = { { '1', '1', '0', '0', '0' }, { '1', '1', '0', '0', '0' }, { '0', '0', '1', '0', '0' },
				{ '0', '0', '0', '1', '1' } };

		System.out.println(numIslands(grid));
	}

	static int countIslands;

	public static int numIslands(char[][] grid) {

		if (grid == null)
			return 0;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == '1') {
					countIslands++;
					changeIslandTowater(grid, i, j);
				}

			}
		}

		return countIslands;
	}

	static void changeIslandTowater(char[][] grid, int i, int j) {
		if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0')
			return;
		grid[i][j] = '0';
		changeIslandTowater(grid, i - 1, j);
		changeIslandTowater(grid, i + 1, j);
		changeIslandTowater(grid, i, j - 1);
		changeIslandTowater(grid, i, j + 1);

	}

}
