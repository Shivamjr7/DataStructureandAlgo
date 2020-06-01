package graphs;

/**
 * Given n nodes labeled from 0 to n-1 and a list of undirected edges (each edge
 * is a pair of nodes), write a function to check whether these edges make up a
 * valid tree.
 * 
 * Example 1:
 * 
 * Input: n = 5, and edges = [[0,1], [0,2], [0,3], [1,4]] Output: true
 * 
 *
 */
public class GraphValidTree {

	public static void main(String[] args) {
		
		
		
		int edges[][] = {{0,1}, {0,4}, {1,4},{2,3}};
		
		
		System.out.println(validTree(5,edges));

	}

	public static  boolean validTree(int n, int[][] edges) {

		int root[] = new int[n];

		for (int i = 0; i < n; i++) {
			root[i] = i;
		}

		for (int[] edge : edges) {
			
			
			int root1 = findRoot(root,edge[0]);
			int root2 = findRoot(root,edge[1]);
			
				
			if(root1==root2)
				return false;
			
			root[root2] = root1;
			
		}
		
		return edges.length==n-1;
	}

	private static int findRoot(int[] root, int i) {
		while (root[i] != i) {
			root[i] = root[root[i]];

			i = root[i];
		}

		return i;
	}

}
