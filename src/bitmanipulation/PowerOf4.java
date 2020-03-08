package bitmanipulation;

public class PowerOf4 {

	public static void main(String[] args) {
		
		PowerOf4 obj = new PowerOf4();
		
		int num1 = 16;
		System.out.println(obj.isPowerOfFour(num1));
		int num2 = 5;
		System.out.println(obj.isPowerOfFour(num2));
	}

	
	 public boolean isPowerOfFour(int num) {
	        
		 if(num>0 && ((Math.log(num)/Math.log(2) %2==0)))
			 return true;
		 
		 return false;
	    }
}
