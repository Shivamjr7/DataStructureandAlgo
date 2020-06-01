package dynammicprogramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class PossibleBipartition {

	public static void main(String[] args) {

		int[][] dislikes = { { 1, 2 }, { 1, 3 }, { 2, 4 } };

		System.out.println(new PossibleBipartition().possibleBipartition(4, dislikes));
		
	}

	ArrayList<Integer>[] graph;
	Map<Integer, Integer> color;

	public boolean possibleBipartition(int n, int[][] dislikes) {
		 int[] root = new int[n];
	        for (int i = 0; i < root.length; i++) {
	            root[i] = i;
	        }
	        
	        LinkedList<Integer>[] graph = new LinkedList[n];
	        
	        for (int i = 0; i < n ; i++ ) {
	            graph[i] = new LinkedList<Integer>();
	        }

	        for(int[] dislike : dislikes){
	            int a = dislike[0] - 1;
	            int b = dislike[1] - 1;
	            graph[a].add(b);
	            graph[b].add(a);
	        }

	        for(int i = 0; i < n; i++){
	            LinkedList<Integer> adjList = graph[i];
	            for(int adj : adjList) {
	                int xRoot = find(i, root);
	                int yRoot = find(adj, root);
	                if(xRoot != yRoot){
	                    root[find(adjList.get(0), root)] = yRoot;
	                }else{
	                    return false;
	                }
	            }
	        }
	        return true;
	}
	
	
	 public int find(int x, int[] root){
	        while(x != root[x]){
	            root[x] = root[root[x]];
	            x = root[x];
	        }
	        return x;
	    }

}
