package arrays;

public class FindNumberWithEvenNumberOfdigits {

	public static void main(String[] args) {
		int [] arr = {12,345,2,6,7896};
		
		System.out.println(new FindNumberWithEvenNumberOfdigits().findNumbers(arr) );

	}

	  
	  
	  /**
	   * fast solution
	   * @param nums
	   * @return
	   */
	  public int findNumbersNew(int[] nums) {
	        int count = 0;
	        for(int e : nums){
	            if( Integer.toString(e).length() % 2 == 0) count++;
	        }
	        return count;
	    }
	
	  
	  /**
	   * Brute force
	   * @param nums
	   * @return
	   */
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
