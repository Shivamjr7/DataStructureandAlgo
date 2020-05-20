package dynammicprogramming;

public class SubSetSum {

	public static void main(String[] args) {

		int[] arr = { 1,5,11,15};

		System.out.println(new SubSetSum().canPartition(arr));

	}

	public boolean canPartition(int[] num) {

		int sum = 0;

		for (int i = 0; i < num.length; i++) {
			sum += num[i];

		}

		if (sum % 2 != 0)
			return false;

		sum = sum / 2;

		boolean dp[][] = new boolean[num.length][sum+1];

		for (int i = 0; i < num.length; i++) {
			dp[i][0] = true;
		}
		for (int i = 1; i <= sum; i++) {
			dp[0][i] = (num[0] == i) ? true : false;
		}

		for (int i = 1; i < num.length; i++) {
			for (int j = 1; j <= sum; j++) {
				// if we can get the sum 's' without the number at index 'i'
				
				if(j<num[i])
				{
					dp[i][j]=dp[i-1][j];
				}
				else
				{
					dp[i][j] = dp[i-1][j]|| dp[i-1][j-num[i]];
				}
			}
		}

		// the bottom-right corner will have our answer.
		return dp[num.length - 1][sum];

	}

	public boolean canPartitionRecursive(int[] num) {

		int sum = 0;
		for (int i = 0; i < num.length; i++)
			sum += num[i];

		// if 'sum' is a an odd number, we can't have two subsets with equal sum
		if (sum % 2 != 0)
			return false;

		return this.canPartitionRecursive(num, sum / 2, 0);
	}

	private boolean canPartitionRecursive(int[] num, int sum, int currentIndex) {
		// base check
		if (sum == 0)
			return true;

		if (num.length == 0 || currentIndex >= num.length)
			return false;

		// recursive call after choosing the number at the currentIndex
		// if the number at currentIndex exceeds the sum, we shouldn't process this
		if (num[currentIndex] <= sum) {
			if (canPartitionRecursive(num, sum - num[currentIndex], currentIndex + 1))
				return true;
		}

		// recursive call after excluding the number at the currentIndex
		return canPartitionRecursive(num, sum, currentIndex + 1);
	}

}
