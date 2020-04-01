package graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class BreadthFirstSearch {

	int v;
	LinkedList<Integer> adjlst[];
	
	BreadthFirstSearch(int v)
	{
		this.v = v;
		adjlst = new LinkedList[v];
		
		for(int i= 0 ;i<v;i++)
		{
			adjlst[i] = new LinkedList<>();
		}
	}
	
	
	void addEdge(int v,int w) 
    { 
		adjlst[v].add(w); 
    } 
	
	/**
	 * using a queue 
	 * will add connected nodes first to queue
	 * @param s
	 */
	void BFS(int s)
	{
		LinkedList<Integer> queue = new LinkedList<>();
		
		//keep track of visited elements
		boolean [] visited = new boolean [v];
		
		queue.add(s);
		
		visited[s]= true;
		
		while(!queue.isEmpty())
		{
			
			s = queue.poll();
			System.out.println(s+" ");
			
			Iterator<Integer> itr = adjlst[s].iterator();
			
			while(itr.hasNext())
			{
				int t = itr.next();
				if(!visited[t])
				{
					visited[t] = true;
					queue.add(t);
				}
			}
		}
	}
	public static void main(String[] args) {
		
		
		BreadthFirstSearch g = new BreadthFirstSearch(4);
		
			g.addEdge(0, 1); 
	        g.addEdge(0, 2); 
	        g.addEdge(1, 2); 
	        g.addEdge(2, 0); 
	        g.addEdge(2, 3); 
	        g.addEdge(3, 3); 
	        
	        
	        //BFS
	        g.BFS(2);
	  
	}

}
