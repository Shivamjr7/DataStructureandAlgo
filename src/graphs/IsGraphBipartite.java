package graphs;

import java.util.Arrays;
import java.util.Stack;

public class IsGraphBipartite {

	public static void main(String[] args) {

		int[][] graph = { { 1, 3 }, { 0, 2 }, { 1, 3 }, { 0, 2 } };

		System.out.println(isBipartite(graph));

	}

	public static boolean isBipartite(int[][] graph) {

		int n = graph.length;
		int[] color = new int[n];
		Arrays.fill(color, -1);

		for (int start = 0; start < n; ++start) {
			if (color[start] == -1) {
				Stack<Integer> stack = new Stack<>();
				stack.push(start);
				color[start] = 0;

				while (!stack.empty()) {
					Integer node = stack.pop();
					for (int nei : graph[node]) {
						if (color[nei] == -1) {
							stack.push(nei);
							color[nei] = color[node] ^ 1;
						} else if (color[nei] == color[node]) {
							return false;
						}
					}
				}
			}
		}

		return true;
	}
}
