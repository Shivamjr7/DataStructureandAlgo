package arrays;

public class FixedPoint {

	public static void main(String[] args) {

		int[] arr = { -10, -5, 0, 3, 7 };
		System.out.println(fixedPoint(arr));

	}

	public static int fixedPoint(int[] A) {

		int start = 0;
		int end = A.length - 1;

		int res = -1;
		while (start < end) {
			int mid = (start + end) / 2;

			if (A[mid] == mid) {
				res = mid;
				end = mid - 1;
			} else if (A[mid] > mid) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}

		return res;
	}
}
