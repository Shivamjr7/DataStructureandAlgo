package arrays;

public class MissingNumber {

	public static void main(String[] args) {
		
		int [] arr= {3,0,1,2,5};
		System.out.println(missingNumber(arr));
	}

	public static int missingNumber(int[] nums) {

		
		int xor1 = nums[0];
		
		for(int i=1;i<nums.length;i++)
		{
			xor1 = xor1^ nums[i];
		}
		
		int xor2=0;
		int n = nums.length;
		for(int i=1;i<=n;i++)
		{
			xor2 = xor2^i;
		}
		
		xor2 = xor2^xor1;
		
		
		return xor2;
	}

}
