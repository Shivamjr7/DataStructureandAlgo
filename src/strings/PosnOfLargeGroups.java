package strings;

import java.util.ArrayList;
import java.util.List;

public class PosnOfLargeGroups {

	public static void main(String[] args) {
		
		
		String str ="abc";
		largeGroupPositions(str);
	}

	 public static  List<List<Integer>> largeGroupPositions(String S) {
	     
		 
		 List<List<Integer>> list = new ArrayList<List<Integer>>();
		 
		 int index =0;
		 int count =0;
		 for(int i=0;i<S.length();i++)
			 
		 {
			 char c= S.charAt(i);
			 index =i;
			 count =1;
			 while(i+1<S.length() && c==S.charAt(i+1))
			 {
				 i++;
				 count++;
			 }
			 
			 
			 if(count>=3)
			 {
				 List<Integer> list1 = new ArrayList<>();
				 list1.add(index);
				 list1.add(i);
				 list.add(list1);
			 }
			
		 }
		 return list;
		
		 
	    }
}
