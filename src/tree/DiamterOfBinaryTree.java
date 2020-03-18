package tree;

public class DiamterOfBinaryTree {

	static class Node {
		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
		}
	}

	Node root;

	public static void main(String[] args) {

		DiamterOfBinaryTree tree = new DiamterOfBinaryTree();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		
		System.out.println(diameterOfBinaryTree(tree.root));
	}

	public static int diameterOfBinaryTree(Node root) {

		
		if(root==null)
			return 0;
		
		int lh = height(root.left);
		int rh = height(root.right);
		
		int ld = diameterOfBinaryTree(root.left);
		int rd = diameterOfBinaryTree(root.right);
		
		
		return Math.max(lh+rh+1, Math.max(ld, rd))-1;
	}

	public  static int height(Node node) {

		
		if(node ==null )return 0;
		
		
		return 1+ Math.max(height(node.left), height(node.right));
	}

}
