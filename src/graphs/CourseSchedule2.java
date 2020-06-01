package graphs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class CourseSchedule2 {

	int V;
	List<Integer>[] graph;
	boolean cycle = false;

	public static void main(String[] args) {
		
		
		
		int [][] arr = {{0,1},{1,0}};

		
		new CourseSchedule2().findOrder(2, arr);
		
	}

	public int[] findOrder(int numCourses, int[][] prerequisites) {
		this.V = numCourses;

		int[] res = new int[numCourses];
		Stack<Integer> stack = new Stack<>();

		int[] visited = new int[numCourses];
		graph = new ArrayList[numCourses];

		// build graph
		for (int i = 0; i < V; i++) {
			graph[i] = new ArrayList<>();
		}

		// add edges
		for (int[] vertex : prerequisites) {
			graph[vertex[1]].add(vertex[0]);
		}

		for (int i = 0; i < V; i++) {
			if (dfs(i, visited, stack))
				return new int[] {};
		}
		
		int index =0;
		while(!stack.isEmpty())
		{
			res[index++] = stack.pop();
		}
		
		
		return res;

	}

	boolean dfs(int v, int[] visited, Stack<Integer> stack) {
		if (visited[v] == 2)
			return false;

		if (visited[v] == 1)
			return true;

		visited[v] = 1;
		for (int u : graph[v]) {
			if (dfs(u, visited, stack))
				return true;
		}

		visited[v]=2;
		stack.add(v);
		return false;
	}

}
