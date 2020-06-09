package recursionandbacktrack;

public class StringToInteger {

	public static void main(String[] args) {
		
		
		String str = "1234";
		stoI(str);
	}

	
	static int rev =0;
	
	static int stoI(String str)
	{
		
		if(str.length()==1)
			return str.charAt(0)-'0';
		
		
		
		rev = stoI(str.substring(1));
		
		double x = str.charAt(0) - '0'; 
		  
        
        x = x * Math.pow(10, str.length() - 1) + rev; 
        return (int)(x); 
	}
}
