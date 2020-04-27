package miscellaneous;

import java.util.PriorityQueue;

public class UglyNumber2 {

	public static void main(String[] args) {

		System.out.println(nthUglyNumber(10));

	}

	public static int nthUglyNumber(int n) {

		PriorityQueue<Long> pq = new PriorityQueue<>();

		pq.add(1L);

		for (long i = 1; i < n; i++) {

			long num = pq.poll();

			while (!pq.isEmpty() && pq.peek() == num)
				num = pq.poll();

			pq.offer(num * 2);
			pq.offer(num * 3);
			pq.offer(num * 5);

		}

		return pq.poll().intValue();
	}

}
