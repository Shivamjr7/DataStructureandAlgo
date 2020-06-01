package graphs;

public class FriendCircles {

	public static void main(String[] args) {
		
		
		int [][] M1 = {
				{1,1,0},
				{1,1,0},
				{0,0,1}
		};
		
		
		
	int [][] M=	
		{
		 {1,1,0,0,0,0,0,1,0,0,0,0,0,0,0},
		 {1,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
		 {0,0,1,0,0,0,0,0,0,0,0,0,0,0,0},
		 {0,0,0,1,0,1,1,0,0,0,0,0,0,0,0},
		 {0,0,0,0,1,0,0,0,0,1,1,0,0,0,0},
		 {0,0,0,1,0,1,0,0,0,0,1,0,0,0,0},
		 {0,0,0,1,0,0,1,0,1,0,0,0,0,1,0},
		 {1,0,0,0,0,0,0,1,1,0,0,0,0,0,0},
		 {0,0,0,0,0,0,1,1,1,0,0,0,0,1,0},
		 {0,0,0,0,1,0,0,0,0,1,0,1,0,0,1},
		 {0,0,0,0,1,1,0,0,0,0,1,1,0,0,0},
		 {0,0,0,0,0,0,0,0,0,1,1,1,0,0,0},
		 {0,0,0,0,0,0,0,0,0,0,0,0,1,0,0},
		 {0,0,0,0,0,0,1,0,1,0,0,0,0,1,0},
		 {0,0,0,0,0,0,0,0,0,1,0,0,0,0,1}
		 };
				 
				 
				 
		System.out.println(findCircleNum(M));
		

	}

	public static int findCircleNum(int[][] M) {


	
		
		int n = M.length;
	    if(n==0) return 0;
	    
	    int [] par = new int[n];
	    for(int i =0; i<n; i++)
	        par[i] = i;
	    
	    for(int i=0;i<n;i++)
	    {
	        for(int j=i+1;j<M[0].length;j++)
	        {
	            if(M[i][j]==1)
	            {
	                int pr1 = findPar(par,i);
	                int pr2 = findPar(par,j);
	                if(pr1!=pr2)
	                {
	                    par[pr2] = pr1;
	                }
	            }
	        }
	    }
	    
	    int count =0;
	    for(int i =0; i<n;i++)
	        if(par[i]==i)
	            count++;
	    
	    return count;

	}

	static int findPar(int []par,int vtx)
	{
	    if(par[vtx]==vtx) return vtx;
	    return par[vtx] = findPar(par,par[vtx]);
	}

}
