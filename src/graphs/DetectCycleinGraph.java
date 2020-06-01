package graphs;

import java.util.ArrayList;
import java.util.List;

/**
 * Detect cycle in directed graph using DFS
 * 
 * @author sjari
 *
 */
public class DetectCycleinGraph {

	int V;
	List<Integer>[] graph;

	public static void main(String[] args) {

		int[][] graph = { { 0, 1 }, { 1, 2 }, { 2, 0 }, { 2, 3 }};

		int v = 4;

		System.out.println(new DetectCycleinGraph().hasCycle(graph, 4));

	}

	boolean hasCycle(int[][] array, int v) {
		// build the graph

		this.V = v;
		graph = new ArrayList[V];

		for (int i = 0; i < V; i++) {
			graph[i] = new ArrayList<>();
		}

		for (int[] p : array) {
			graph[p[0]].add(p[1]);
		}

		int[] visited = new int[V];

		for (int i = 0; i < V; i++) {
			if (dfs(visited, i))
				return true;
		}

		return false;
	}

	boolean dfs(int[] visited, int i) {
		if (visited[i] == 1)
			return true;

		if (visited[i] == 2)
			return false;

		visited[i] = 1;
		for (int n : graph[i]) {
			if (dfs(visited, n))
				return true;
		}

		visited[i] = 2;
		return false;

	}

}
