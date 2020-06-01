package graphs;



public class NumberOfComponentsInUndirectedGraph {

	public static void main(String[] args) {

		int[][] edges = { { 0, 1 }, { 1, 2 }, { 3, 4 } };

		System.out.println(countComponents(5, edges));

	}

	public static int countComponents(int n, int[][] edges) {
		int[] root = new int[n];
	    for(int i = 0; i < n; i++) {
	    	root[i] = i;
	    }
	    for(int[] edge : edges) {
	    	int root1 = findRoot(root, edge[0]);
	    	int root2 = findRoot(root, edge[1]);
	    	//union
	    	if(root1 != root2) {
	    		root[root2] = root1;
	    	}
	    }
	    //count
	    int count = 0;
	    for(int i = 0; i < n; i++) {
	    	if(root[i] == i) {
	    		count++;
	    	}
	    }
	    return count;
	}
	private static int findRoot(int[] root, int i) {
		while(root[i] != i) {
			//compress
			root[i] = root[root[i]];
			i = root[i];
		}
		return i;
	}
}
