package recursionandbacktrack;

public class Palindrome {

	public static void main(String[] args) {
	
		
		int num =101;

		
		boolean flag = isPalindrome(num);
		
		System.out.println(flag);
	}

	
	
	 static boolean isPalindrome(int num)
	{
	
		
		int newNum = helper(num,0);
		
		
		return num==newNum;
	}
	
	
	 static int  helper(int num , int rev)
	{
		
		if(num<=0)
			return rev;
		
		rev = rev*10+ (num%10);
		
		rev = helper(num/10, rev);
		
		return rev;
		
	}
}
