package graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class IterativeDFS {

	int v;
	LinkedList<Integer> adjlist[];

	IterativeDFS(int v) {
		this.v = v;
		adjlist = new LinkedList[v];

		for (int i = 0; i < v; i++) {
			adjlist[i] = new LinkedList<>();
		}
	}

	void addEdge(int v, int w) {
		adjlist[v].add(w); // Add w to v’s list.
	}

	void DFS(int s) {
		boolean[] visited = new boolean[v];

		Stack<Integer> stack = new Stack<>();

		stack.push(s);
		
		while (!stack.isEmpty()) {
			
			s = stack.pop();
			visited[s] = true;
			
			if(visited[s])
				System.out.println(s);
			Iterator<Integer> itr = adjlist[s].iterator();

			while (itr.hasNext()) {
				int t = itr.next();

				if (!visited[t])
					stack.push(t);
			}
		}

	}

	public static void main(String[] args) {

		
		IterativeDFS g = new IterativeDFS(5); 
        
        g.addEdge(1, 0); 
        g.addEdge(0, 2); 
        g.addEdge(2, 1); 
        g.addEdge(0, 3); 
        g.addEdge(1, 4); 
              
        System.out.println("Following is the Depth First Traversal"); 
        g.DFS(0); 
	}

}
