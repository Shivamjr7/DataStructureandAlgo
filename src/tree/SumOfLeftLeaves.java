package tree;



public class SumOfLeftLeaves {

	
	static class Node {
		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
		}
	}

	Node root;
	
	int sum=0;
	public static void main(String[] args) {
		
		SumOfLeftLeaves tree = new SumOfLeftLeaves();
		
		tree.root = new Node(3);
		tree.root.left = new Node(9);
		tree.root.right = new Node(20);
		tree.root.right.left = new Node(15);
		tree.root.right.right = new Node(7);
		
		
		System.out.println(tree.sumOfLeftLeaves(tree.root));

	}
	
	
	
	  public int sumOfLeftLeaves(Node root) {
		  
		  if(root==null)
			  return 0;
		  
		  if(root.left!=null && root.left.left==null && root.left.right==null)
		  {
			  sum+= root.left.data;
		  }
	        
		  
		  sumOfLeftLeaves(root.left);
		  sumOfLeftLeaves(root.right);
		  
		  return sum;
	    }
	  


}
