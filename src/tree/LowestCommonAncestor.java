package tree;

public class LowestCommonAncestor {

	
	static class Node {
		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
		}
	}

	Node root;
	
	
	public static void main(String[] args) {
		
		LowestCommonAncestor tree = new LowestCommonAncestor();
		
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		Node lca = 	tree.lowestCommonAncestor(tree.root, tree.root.left.left, tree.root.right);
		
		System.out.println(lca.data);

	}
	
	public Node lowestCommonAncestor(Node root, Node p, Node q) {
        
		if(root==null)
			return null;
		
		if(root==p || root==q)
			return root;
		
		Node left_lca=lowestCommonAncestor(root.left,p,q);
		Node right_lca=lowestCommonAncestor(root.right,p,q);
		
		
		if(left_lca!=null && right_lca!=null)
			return root;
		
		if(right_lca!=null)
			return right_lca;
		else 
			return left_lca;
			
    }

}
