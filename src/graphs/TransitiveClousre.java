package graphs;

import java.util.Arrays;
import java.util.LinkedList;

public class TransitiveClousre {

	
	
	private int vertcies;
	
	LinkedList<Integer> adjlst[];
	
	
	int [][]tc 	;
	TransitiveClousre(int v)
	{
		this.vertcies =v;
		adjlst = new LinkedList[v];
		
		tc = new int[v][v];
		for(int i=0;i<v;i++)
		{
			adjlst[i] = new LinkedList<>();
			
		}
	}
	
	
	void addEdge(int u , int v)
	{
		adjlst[u].add(v);
	}
	
	
	void dfsutil(int i , int j )
	{
		tc[i][j] =1;
		
		 for (int adj : adjlst[j]) {             
	            if (tc[i][adj]==0) { 
	            	dfsutil(i, adj); 
	            } 
	        } 
	}
	
	 public void transitiveClosure() { 
		  
	        // Call the recursive helper 
	        // function to print DFS 
	        // traversal starting from all 
	        // vertices one by one 
	        for (int i = 0; i < vertcies; i++) { 
	        	dfsutil(i, i); 
	        } 
	  
	        for (int i = 0; i < vertcies; i++) { 
	          System.out.println(Arrays.toString(tc[i])); 
	        } 
	    } 
	
	public static void main(String[] args) {
		
		
			TransitiveClousre g = new TransitiveClousre(4); 
		  
	        g.addEdge(0, 1); 
	        g.addEdge(0, 2); 
	        g.addEdge(1, 2); 
	        g.addEdge(2, 0); 
	        g.addEdge(2, 3); 
	        g.addEdge(3, 3); 
	        System.out.println("Transitive closure " + 
	                "matrix is"); 
	  
	        g.transitiveClosure(); 

	}

}
