package dynammicprogramming;

public class CountSquareSubmatrices {

	public static void main(String[] args) {
		
		
		int [][] arr = {
				  {1,0,1},
				  {1,1,0},
				  {1,1,0}};
		
		
		System.out.println(countSquares(arr));

	}
	
	
	  public static  int countSquares(int[][] matrix) {
	  
		
	        int result = 0;

	        for(int i = 0; i < matrix.length; i++) {
	          for(int j = 0; j < matrix[0].length; j++) {

	            // for top most row(i == 0) and left most column j == 0, directly
	            // value in the matrix will be added as result.
	            if(matrix[i][j] > 0 && i > 0 && j > 0) {
	              int min = Math.min(matrix[i-1][j], Math.min(matrix[i][j-1], matrix[i-1][j-1]));
	              matrix[i][j] = min + 1;
	            }

	            result += matrix[i][j];
	          }
	        }

	        return result;
		  
	  }

}
