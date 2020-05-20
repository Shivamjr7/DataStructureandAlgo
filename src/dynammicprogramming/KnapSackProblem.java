package dynammicprogramming;

public class KnapSackProblem {

	public static void main(String[] args) {

		KnapSackProblem ks = new KnapSackProblem();
		int[] profits = { 1, 6, 10, 16 };
		int[] weights = { 1, 2, 3, 5 };
		int maxProfit = ks.solveKnapsack( weights, profits, 7);

		
		System.out.println(maxProfit);
	}

	int solveKnapsack(int[] weights, int[] profits, int capacity) {

		// create a 2d array

		int[][] dp = new int[profits.length][capacity + 1];

		
		for(int i=0;i<profits.length;i++)
		{
			dp[i][0] = 0;
		}
		
		for(int i=1;i<=capacity;i++)
		{
			dp[0][i] = profits[0];
		}
	
		for (int i = 1; i <profits.length; i++) {
			for (int j = 1; j <=capacity; j++) {
				if (i == 0 || j == 0) {
					dp[i][j] = 0;
					continue;
				}

				if (j - weights[i] >= 0) {
					dp[i][j] = Math.max(profits[i]+dp[i-1][j- weights[i]], dp[i-1][j]);
				} else {
					dp[i][j] = dp[i - 1][j];
				}

			}
		}

		return dp[profits.length-1][capacity];
	}

}
