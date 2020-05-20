package matrx;

public class RotateImage {

	public static void main(String[] args) {
		int [] [] arr={
				  { 5, 1, 9,11},
				  { 2, 4, 8,10},
				  {13, 3, 6, 7},
				  {15,14,12,16}
		};
		

		rotate(arr);
	}

	
	 public static void rotate(int[][] matrix) {
	       
		int n = matrix.length;
		
		
		//transpose the matrix
		
		for(int i =0;i<n;i++)
		{
			for(int j =i;j<n;j++)
			{
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		
		
		//swap the front and last ele
		for(int i =0;i<n;i++)
		{
			for(int j=0;j<n/2;j++)
			{
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][n-1-j];
				matrix[i][n-1-j] = temp;
			}
		}
	 }
	 
	    
}
