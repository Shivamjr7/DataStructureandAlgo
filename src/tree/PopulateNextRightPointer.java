package tree;

import java.util.LinkedList;
import java.util.Queue;

public class PopulateNextRightPointer {

	static class Node {
		int data;

		Node(int data) {
			this.data = data;

		}

		Node left, right, next;
	}

	Node root;

	public static void main(String[] args) {

		PopulateNextRightPointer obj = new PopulateNextRightPointer();
		obj.root = new Node(1);
		obj.root.left = new Node(2);
		obj.root.right = new Node(3);
		obj.root.left.left = new Node(4);
		obj.root.left.right = new Node(5);
		obj.root.right.left = new Node(6);
		obj.root.right.right = new Node(7);
		obj.connect(obj.root);

	}

	public Node connect(Node root) {

		Queue<Node> queue1 = new LinkedList<Node>();
		Queue<Integer> levelqueue = new LinkedList<>();

		queue1.add(root);
		levelqueue.add(1);

		while (!queue1.isEmpty()) {
			int level = levelqueue.poll();
			Node node = queue1.poll();

			if (!levelqueue.isEmpty() && level != levelqueue.peek()) {
				node.next = null;
			} else {
				node.next = queue1.peek();
			}

			if (node.left != null) {
				queue1.add(node.left);
				levelqueue.add(level+1);
			}
			if (node.right != null) {
				queue1.add(node.right);
				levelqueue.add(level+1);
			}
		}

		return root;

	}

}
