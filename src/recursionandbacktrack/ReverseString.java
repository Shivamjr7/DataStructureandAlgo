package recursionandbacktrack;

public class ReverseString {

	public static void main(String[] args) {
	
		
		
		String str = "abcd";

		System.out.println(reverse(str));
	}
	
	
	static String reverse(String str)
	{
		
		if(str.equals(""))
			return "";
		
		int n = str.length();
		
		str = str.charAt(n-1) + reverse(str.substring(0,n-1));
		
		return str;
	}

}
