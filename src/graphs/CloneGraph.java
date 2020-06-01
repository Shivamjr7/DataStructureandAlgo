package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CloneGraph {

	static class Node {
		public int val;
		public List<Node> neighbors;

		public Node() {
			val = 0;
			neighbors = new ArrayList<Node>();
		}

		public Node(int _val) {
			val = _val;
			neighbors = new ArrayList<Node>();
		}

		public Node(int _val, ArrayList<Node> _neighbors) {
			val = _val;
			neighbors = _neighbors;
		}
	}

	public static void main(String[] args) {

	}

	HashMap<Node, Node> map = new HashMap<>();

	public Node cloneGraph(Node node) {

		if (node == null)
			return null;
		map.put(node, new Node(node.val, new ArrayList<>()));

		for (Node neighbour : node.neighbors) {
			if (map.containsKey(neighbour)) {
				map.get(node).neighbors.add(map.get(neighbour));
			} else {
				map.get(node).neighbors.add(cloneGraph(neighbour));
			}
		}
		return map.get(node);
	}

}
