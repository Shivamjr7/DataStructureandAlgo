package miscellaneous;

public class FirstBadVersion {

	public static void main(String[] args) {
		
		
		System.out.println(new FirstBadVersion().firstBadVersion(2126753390));

	}

	
	
	 public int firstBadVersion(int n) {
	
		 
		 int start =1;
		 
		 int end = n;
		 
		 
		 while(start<=end)
		 {
			 int mid = start + (end-start)/2;
			 if(mid==0 || (isBadVersion(mid) && !isBadVersion(mid-1)))
				 return mid;
			 else if(isBadVersion(mid-1))
			 {
				 end = mid-1;
			 }
			 else
			 {
				 start = mid+1;
			 }
				 
		 }
		 
		 return -1;
	  }
	 
	 
	 boolean isBadVersion(int version)
	 {
		 if(version>=1702766719)
			 return true;
		 return false;
	 }
}
