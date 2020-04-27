package arrays;

import java.util.PriorityQueue;

public class KthLargestinArray {

	public static int findKthLargest(int[] nums, int k) {

		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int num :nums)
		{
			pq.offer(num);
			while(pq.size()>k)
				pq.remove();
		}
		
		return pq.peek();
	}

	public static void main(String[] args) {
		
		
		
		int []nums = {3,2,1,5,6,4};
		
		System.out.println(findKthLargest(nums,2));

	}

}
