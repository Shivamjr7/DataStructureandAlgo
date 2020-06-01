package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DetectCycleUsingBFS {

	int V;
	List<Integer>[] graph;

	public static void main(String[] args) {

		int[][] graph = { { 0, 1 }, { 1, 2 }, { 2, 0 }, { 3, 4 },{4,5}};

		int v = 4;

		System.out.println(new DetectCycleUsingBFS().hasCycle(graph, 6));

	}

	boolean hasCycle(int[][] array, int v) {
		this.V = v;
		graph = new ArrayList[V];

		for (int i = 0; i < V; i++) {
			graph[i] = new ArrayList<>();
		}

		for (int[] p : array) {
			graph[p[0]].add(p[1]);
		}

		int[] indegree = new int[V];

		for (int i = 0; i < V; i++) {
			for (int n : graph[i]) {
				indegree[n]++;
			}
		}

		Queue<Integer> queue = new LinkedList<>();

		for (int i = 0; i < V; i++) {
			if (indegree[i] == 0)
				queue.add(i);
		}

		int count = 0;

		List<Integer> list = new ArrayList<>();

		while (!queue.isEmpty()) {
			int u = queue.poll();
			list.add(u);

			for (int itr : graph[u]) {
				if (--indegree[itr] == 0)
					queue.add(itr);
			}

			count++;
		}

		if (count != this.V)
			return true;

		else
			return false;
	}

}
