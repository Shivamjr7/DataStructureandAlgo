package matrx;

public class MaximalSquare {

	public static void main(String[] args) {
		
		
		char[][]m ={
				{'1', '0' ,'1','0','0'},
				{'1', '0' ,'1','1','1'},
				{'1', '1' ,'1','1','1'},
				{'1', '0' ,'0','1','0'}

		};
		
		
		System.out.println(new MaximalSquare().maximalSquare(m));

	}
	
	
	 public int maximalSquare(char[][] m) {
	     
		 
		  if(m.length==0) return 0;
	        int[][] dp = new int[m.length][m[0].length];
	        int max = 0;
	        for(int i = 0; i<m.length;i++){
	            for(int j = 0; j<m[i].length;j++){
	                if(i==0 || j == 0)dp[i][j] = m[i][j] == '0' ? 0: 1 ;
	                else{
	                    if(m[i][j] == '0') continue;
	                    int a = dp[i][j-1];
	                    int b = dp[i-1][j-1];
	                    int c = dp[i-1][j];
	                    dp[i][j] = Math.min(a,Math.min(b,c))+1;
	                }
	                max = Math.max(max,dp[i][j]);
	            }
	        }
	        return max*max;
	    }
	 

}
