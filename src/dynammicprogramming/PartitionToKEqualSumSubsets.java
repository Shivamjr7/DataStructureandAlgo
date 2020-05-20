package dynammicprogramming;

public class PartitionToKEqualSumSubsets {

	public static void main(String[] args) {
		
		
		int [] arr = {4, 3, 2, 3, 5, 2, 1};

	}

	public boolean canPartitionKSubsets(int[] nums, int k) {

		
		int sum =0;
		
		for(int num: nums)
		{
			sum+=num;
		}
		
		
		if(sum%k!=0)
			return false;
		
		
		sum = sum/k;
		
		
		int n = nums.length;
				
		boolean dp[][] = new boolean[n][sum+1];
		for(int i=0;i<n;i++)
		{
			dp[i][0]= true;
		}
		
		
		for(int i=0;i<=sum;i++)
		{
			dp[0][i]=(nums[0]==i)?true:false;
		}
		
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<sum;j++)
			{
				if(j<nums[i])
				{
					dp[i][j]= dp[i-1][j];
				}
				else
				{
					dp[i][j] = dp[i-1][j]|| dp[i-1][j-nums[i]];
				}
			}
		}
		
		return dp[n-1][sum];
	}

}
