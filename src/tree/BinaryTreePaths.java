package tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {

	static class Node {
		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
		}
	}

	Node root;

	public static void main(String[] args) {

		BinaryTreePaths obj = new BinaryTreePaths();
		obj.root = new Node(1);
		obj.root.left = new Node(2);
		obj.root.right = new Node(3);
		obj.root.left.right = new Node(5);
		obj.binaryTreePaths(obj.root);

	}

	public List<String> binaryTreePaths(Node root) {

		if (root == null)
			return new ArrayList<String>();

		List<String> list = new ArrayList<>();

		

		findPaths(root, list, "");
		return list;

	}

		void findPaths(Node root, List<String> list, String str) {
			if (root == null)
				return;
	
			str += Integer.toString(root.data);
	
			if (root.left == null && root.right == null) {
				list.add(str.toString());
				return;
			}
	
			else {
				str += "->";
				findPaths(root.left, list, str);
				findPaths(root.right, list, str);
			}
	
		}
}
