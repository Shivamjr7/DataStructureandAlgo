package miscellaneous;

import java.util.Comparator;
import java.util.PriorityQueue;

public class FindMedianInDataStream {

	PriorityQueue<Integer> minHeap = null;
	PriorityQueue<Integer> maxHeap = null;

	public FindMedianInDataStream() {
		minHeap = new PriorityQueue<>();
		maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
	}

	public void addNum(int num) {

		minHeap.add(num);
		maxHeap.add(minHeap.poll());

		if (minHeap.size() < maxHeap.size()) {
			minHeap.offer(maxHeap.poll());
		}
	}

	public double findMedian() {
		if (minHeap.size() > maxHeap.size()) {
			return minHeap.peek();
		} else {
			return (minHeap.peek() + maxHeap.peek()) / 2.0;
		}
	}

	public static void main(String[] args) {
		FindMedianInDataStream obj = new FindMedianInDataStream();
		
		obj.addNum(1);
		obj.addNum(2);
		
		obj.addNum(3);
		obj.findMedian() ; // 1.5
		obj.addNum(3) ;
		obj.findMedian(); //-> 2

	}

}
