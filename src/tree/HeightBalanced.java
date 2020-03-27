package tree;

public class HeightBalanced {

	static class Node {
		int data;

		Node left, right;

		Node(int data) {
			this.data = data;

		}
	}

	Node head;

	public static void main(String[] args) {

		HeightBalanced obj = new HeightBalanced();

		obj.head = new Node(1);
		obj.head.left = new Node(2);
		obj.head.right = new Node(2);
		
		
		obj.head.left.left = new Node(3);
		obj.head.left.right = new Node(3);
		
		
		obj.head.left.left.left = new Node(4);
		obj.head.left.left.right = new Node(4);
		
		
		System.out.println(obj.isBalanced(obj.head));

	}

	public boolean isBalanced(Node root) {

		if (root == null)
			return true;

		int lh = height(root.left);
		int rh = height(root.right);

		  return (Math.abs(lh-rh)<=1 && isBalanced(root.left) && isBalanced(root.right) );
	}
	
	

	int height(Node node) {
		if (node == null)
			return 0;

		return 1 + (Math.max(height(node.left), height(node.right)));
	}

}
