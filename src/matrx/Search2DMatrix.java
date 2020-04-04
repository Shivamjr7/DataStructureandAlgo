package matrx;

public class Search2DMatrix {

	/**
	 * 
	 * Write an efficient algorithm that searches for a value in an m x n
	 * matrix. This matrix has the following properties:
	 * 
	 * Integers in each row are sorted from left to right. The first integer of
	 * each row is greater than the last integer of the previous row.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int[][] matrix = { { 1,2,3 },
							{7,9,11},
							{16,18,20}
		}	;

		System.out.println(searchMatrix(matrix, 9));
		System.out.println(searchMatrixBS(matrix,9));

	}

	/**
	 * My solution 
	 * @param matrix
	 * @param target
	 * @return
	 */
	public static boolean searchMatrix(int[][] matrix, int target) {

		if (matrix.length == 0 || matrix[0].length == 0)
			return false;

		boolean flag = false;
		int r1 = 0;
		int r2 = matrix.length - 1;
		int c1 = 0;
		int c2 = matrix[0].length - 1;

		while (r1 <= r2 && matrix[r1][c2] < target)
			r1++;

		if (r1 <= r2 && c1 <= c2) {
			for (int i = c1; i <= c2; i++)
				if (matrix[r1][i] == target)
					flag = true;

		}
		return flag;
	}

	/**
	 * Binary search
	 * @param matrix
	 * @param target
	 * @return
	 */
	 public static boolean searchMatrixBS(int[][] matrix, int target) {
	        if(matrix==null || matrix.length==0 || matrix[0].length==0) 
	            return false;
	 
	        int m = matrix.length;
	        int n = matrix[0].length;
	 
	        int start = 0;
	        int end = m*n-1;
	 
	        while(start<=end){
	            int mid=(start+end)/2;
	            int midX=mid/n;
	            int midY=mid%n;
	 
	            if(matrix[midX][midY]==target) 
	                return true;
	 
	            if(matrix[midX][midY]<target){
	                start=mid+1;
	            }else{
	                end=mid-1;
	            }
	        }
	 
	        return false;
	    }
}
