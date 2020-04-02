package graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class DepthFirstSearch {

	int v;
	LinkedList<Integer> adjlist[];

	DepthFirstSearch(int v) {
		this.v = v;
		adjlist = new LinkedList[v];

		for (int i = 0; i < v; i++) {
			adjlist[i] = new LinkedList<>();
		}

	}

	void addEdge(int v, int w) {
		adjlist[v].add(w);
	}

	void DFS(int s) {
		boolean[] visited = new boolean[v];

		DFSUtil(s, visited);
	}

	void DFSUtil(int s, boolean[] visited) {
		visited[s] = true;

		System.out.println(s);

		Iterator<Integer> itr = adjlist[s].iterator();

		while (itr.hasNext()) {
			int t = itr.next();

			if (!visited[t])
				DFSUtil(t, visited);
		}

	

	}

	public static void main(String[] args) {

		DepthFirstSearch g = new DepthFirstSearch(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);

		g.DFS(2);

	}

}
