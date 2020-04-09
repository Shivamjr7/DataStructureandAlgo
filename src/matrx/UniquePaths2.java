package matrx;

public class UniquePaths2 {

	public static void main(String[] args) {

		int[][] matrix = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };

		System.out.println(uniquePathsWithObstacles(matrix));

	}

	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {

		int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;

		if (obstacleGrid[0][0] == 1)
			obstacleGrid[0][0] = 0;

		obstacleGrid[0][0] = 1;
		for (int i = 1; i < m; i++) {
			if (obstacleGrid[i][0] == 1) {
				obstacleGrid[i][0] = 0;
			} else {
				obstacleGrid[i][0] = obstacleGrid[i- 1][0];

			}
		}

		for (int j = 1; j < n; j++) {
			if (obstacleGrid[0][j] == 1) {
				obstacleGrid[0][j] = 0;
			} else {
				obstacleGrid[0][j] = obstacleGrid[0][j - 1];

			}
		}

		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				if (obstacleGrid[i][j] == 1)
					obstacleGrid[i][j] = 0;
				else
					obstacleGrid[i][j] = obstacleGrid[i-1][j] + obstacleGrid[i][j - 1];
			}
		}

		return obstacleGrid[m - 1][n - 1];
	}
}