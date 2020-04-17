package matrx;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRooms2 {

	public static void main(String[] args) {
		int[][] arr = { { 9,10}, {4,9},{4,17}};

		System.out.println(new  MeetingRooms2().minMeetingRooms(arr));
	}

	public int minMeetingRooms(int[][] intervals) {

		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

	
		PriorityQueue<int[]> queue = new PriorityQueue<>((q1,q2)->q1[1]-q2[1]);

		
		int size = intervals.length;
		
		for(int i =0;i<size;i++)
		{
			if(!queue.isEmpty() && intervals[i][0]>=queue.peek()[1])
				queue.poll();
			
			queue.add(intervals[i]);
		}
		return queue.size();
	}
}
