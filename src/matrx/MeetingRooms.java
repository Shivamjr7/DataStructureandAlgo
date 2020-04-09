package matrx;

import java.util.Arrays;

public class MeetingRooms {

	public static void main(String[] args) {
		
		
		int [][] arr={
				{7,10},{2,4},{0,1}
		};
		
		
		System.out.println(new MeetingRooms().canAttendMeetings(arr));

	}
	
	 public boolean canAttendMeetings(int[][] intervals) {
	        
		 
		 Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
		 
		 
		 int end =intervals[0][1];
		 
		 
		 for(int i =1; i<intervals.length;i++)
		 {
			 int []arr = intervals[i];
			 
			 if(arr[0]<end)
			 {
				 return false;
			 }
			 else
			 {
				 
				 end = arr[1];
			 }
		 }
		 
		 return true;
	    }

}
