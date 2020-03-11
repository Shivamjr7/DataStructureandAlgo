package miscellaneous;

public class FibonacciNumber {

	public static void main(String[] args) {
		
		
		
		System.out.println(fib(4));
	}

	
	  public static int fib(int N) {
	     
		  
		  if(N==0)
			  return 0;
		  if(N==1)
			  return 1;
		  
		  int a =0;
		  int b =1;		  
		  int sum =0;
		  
		  //logic
		  //we take a and b as 0 and 1 resp
		  //now we calculate sum and then transfer b to a and sum to b
		  
		  for(int i=2;i<=N;i++)
		  {
			  sum = a+b;
			  a= b;
			  b=sum;
		  }
		 
		  
		  
		  return sum;
	  }
}
