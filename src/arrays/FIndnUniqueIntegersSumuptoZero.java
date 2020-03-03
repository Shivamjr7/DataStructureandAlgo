package arrays;

public class FIndnUniqueIntegersSumuptoZero {

	public static void main(String[] args) {
		
		int n = 5;
		

	}

	public int[] sumZero(int n) {
		
		int []result = new int[n];
		
		if(n==1){
			result[0]=0;
			return result;
		}
			
		int x = n/2;
		if(n%2==0)
		{
			int i =0;
			while(i<n)
			{
				result[i]=x;
				result[i+1]=-x;
				i=i+2;
				x--;
			}
		}
		else
		{
			result[0]=0;
			int i=1;
			while(i<n)
			{
				result[i]=x;
				result[i+1]=-x;
				i=i+2;
				x--;
			}
		}
		
		return result;
	}

}
