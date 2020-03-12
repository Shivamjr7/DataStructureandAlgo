package strings;

import java.util.ArrayList;
import java.util.List;

public class FlipGame {

	public static void main(String[] args) {
		
		
		String s ="++++";
		generatePossibleNextMoves(s);
	}

	
	public static  List<String> generatePossibleNextMoves(String s) {
      
		
		List<String> list = new ArrayList<String>();
		char [] arr = s.toCharArray();
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i] =='+' && arr[i+1]=='+')
			{
				arr[i]='-';
				arr[i+1]='-';
				list.add(String.valueOf(arr));
				arr[i]='+';
				arr[i+1]='+';
			}
			
		
		}
		
		return list;
    }
}
