package arrays;

public class FindNumberWithEvenNumberOfdigits {

	public static void main(String[] args) {
		int [] arr = {12,345,2,6,7896};
		
		System.out.println(new FindNumberWithEvenNumberOfdigits().findNumbers(arr) );

	}

	
	  public int findNumbers(int[] nums) {
	        
		  
		  int count = 0;
		  for(int i = 0;i<nums.length;i++)
		  {
			  if(count(nums[i])%2==0)
				  count++;
		  }
		  
		  return count;
	 }
	  
	  
	  private int count(int num)
	  {
		  
		  int res = 0;
		  
		  while(num>0)
		  {
			  num = num/10;
			  res++;
		  }
		  
		  return res;
	  }
	  
}
