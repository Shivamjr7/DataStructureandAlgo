package graphs;

public class FindCelebrity {

	public static void main(String[] args) {
		
		
		System.out.println(findCelebrity(3));

	}
	
	
	
	 public static int findCelebrity(int n) {
	  
		 
		 int []arr = new int[n+1];
		 for(int i =0;i<n-1;i++)
		 {
			 for(int j =i+1;j<n;j++)
			 {
				 if(knows(i,j))
				 {
					arr[j]++;
					arr[i]--;
				 }
				 
				 if(knows(j,i))
				 {
					 arr[i]++;
					 arr[j]--;
				 }
			 }
		 }
		 
		 for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == n - 1) {
	                return i;
	            }
	        }
		 
		 
		 return -1;
		 
	  }
	 
	 
	static  boolean knows(int a , int b)
	 {
		 if(b==1)
			 return true;
		 if(a==2)
			 return true;
		 
		 return false;
	 }

}
