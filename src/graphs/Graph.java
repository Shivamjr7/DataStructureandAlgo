package graphs;

import java.util.LinkedList;

public class Graph {
	
	/**
	 * 
	 *  0 - > 1
	 * 	^    /
	 *  |  /
	 *  V
	 *  2 -- >3(loop)
	 */
	
	// vertices
	private int v;

	// adjacency list
	private LinkedList<Integer> adjlist[];

	Graph(int v) {
		this.v = v;
		adjlist = new LinkedList[v];

		for (int i = 0; i < v; i++) {
			adjlist[i] = new LinkedList<>();
		}
	}

	void addEdge(int v, int w) {
		adjlist[v].add(w);
	}

	public static void main(String... args) {
		Graph g = new Graph(4);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);
	}
}
