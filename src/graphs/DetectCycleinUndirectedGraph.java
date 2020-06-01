package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DetectCycleinUndirectedGraph {

	int V;
	List<Integer>[] graph;

	public static void main(String[] args) {

		int[][] graph = { { 1, 0 }, { 0, 2 }, { 2, 1 }, { 0, 3 }, { 3, 4 } };
		
		
		System.out.println(new DetectCycleinUndirectedGraph().hasCycle(graph, 5));

	}

	boolean hasCycle(int[][] array, int v) {

		this.V = v;
		graph = new ArrayList[V];

		for (int i = 0; i < V; i++) {
			graph[i] = new ArrayList<>();
		}

		for (int[] p : array) {
			graph[p[1]].add(p[0]);
			graph[p[0]].add(p[1]);
		}

		Queue<Integer> queue = new LinkedList<Integer>();

		int[] visited = new int[V];

		queue.add(0);
		visited[0] = 1;

		while (!queue.isEmpty()) {

			int t = queue.poll();

			for (int q : graph[t]) {
				if (visited[q] == 0) {
					visited[q] = 1;
					queue.add(q);
				} else if (visited[q] == 1)
					return true;
			}

			visited[t] = 2;

		}

		return false;

	}

}
