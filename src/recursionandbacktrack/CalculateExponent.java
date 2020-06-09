package recursionandbacktrack;

public class CalculateExponent {

	public static void main(String[] args) {

		
		System.out.println(pow(2,12));

	}

	
	static int pow(int x, int y)
	{
		
		
		if(y==1)
			return x;
		
		return x * pow(x,y-1);
	}
}
