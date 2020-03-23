package arrays;

public class SquaresOfSortedArray {

	public static void main(String[] args) {

		int[] arr = { -4, -1, 0, 3, 10 };
		
		sortedSquares(arr);

	}

	public static int[] sortedSquares(int[] A) {

		int[] res = new int[A.length];

		int end = A.length - 1, start = 0;
		int index = A.length - 1;

		while (start <= end) {
			if (A[end] > -A[start]) // because the original array is already sorted, so A[end] will be always
									// greater than A[start]
				res[index--] = A[end] * A[end--];
			else
				res[index--] = A[start] * A[start++];
		}
		return res;
	}

}
