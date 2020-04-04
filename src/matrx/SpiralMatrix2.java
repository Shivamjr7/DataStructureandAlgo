package matrx;

public class SpiralMatrix2 {

	public static void main(String[] args) {
		generateMatrix(3);
	}

	public static  int[][] generateMatrix(int n) {

		int[][] matrix = new int[n][n];

		int r1 = 0;
		int r2 = n - 1;
		int c1 = 0;
		int c2 = n - 1;

		int count =1;
		while (r1 <= r2 && c1 <= c2) {

			for(int i =c1 ;i<=c2;i++)
			{
				matrix[r1][i] = count++;
			}
			
			for(int j=r1+1;j<=r2;j++)
			{
				matrix[j][c2] = count++;
			}
			
			
			if(r1<r2 && c1<c2)
			{
				for(int i=c2-1;i>c1;i--)
					matrix[r2][i] = count++;
				
				for(int j=r2;j>r1;j--)
					matrix[j][c1] = count++;
				
			}
			
			r1++;
			r2--;
			c1++;
			c2--;
		}

		return matrix;
	}
}
