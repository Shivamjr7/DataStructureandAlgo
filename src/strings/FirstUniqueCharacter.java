package strings;

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		
		String str ="cc";
		
		System.out.println(firstUniqChar(str));
	}

	
	   public static  int firstUniqChar(String s) {
	      
		   
		   int [] arr= new int[26];
		   
		   
		   for(int i=0;i<arr.length;i++)
		   {
			   arr[i]=-1;
		   }
		   
		   for(int i=0;i<s.length();i++)
		   {
			   if(arr[s.charAt(i)-'a']==-1)
			   {
				   arr[s.charAt(i)-'a']=i;
			   }
			   else if(arr[s.charAt(i)-'a']>=0)
			   {
				   arr[s.charAt(i)-'a']=-2;  
			   }
			  
		   }
		   
		   
		   int min = Integer.MAX_VALUE;
		   for(int i=0;i<arr.length;i++)
		   {
			  if(arr[i]<min &&( arr[i]!=-1 && arr[i]!=-2)){
				  min = arr[i];
			  }
		   }
		   
		   
		   if(min!=Integer.MAX_VALUE)
		   return min;
		   else 
			   return -1;
	    }
}
