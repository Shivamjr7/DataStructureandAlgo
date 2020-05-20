package tree;



public class ValiateBST {

	

	static class Node
	{
		int data;
		Node left,right;
		Node(int data)
		{
			this.data = data;
		}
	}
	
	
	Node root;
	public static void main(String[] args) {
		
		ValiateBST tree = new ValiateBST();
		tree.root = new Node(2);
		tree.root.left = new Node(1);
		tree.root.right = new Node(3);
//		tree.root.right.left = new Node(3);
//		tree.root.right.right = new Node(6);
		
		
		System.out.println(tree.isValidBST(tree.root));
	}
	
	
	
	  public boolean isValidBST(Node root) {
	        
		  if(root==null)
			  return true;
		  
		  return isValidBSTutil(root,null, null);
	   }
	  
	  

	  public boolean isValidBSTutil(Node root, Integer min , Integer max) {
	  
	  if(root ==null)
		  return true;
	  
	  
	  if(min !=null &&  root.data<=min) return false;
	  if(max!=null && root.data>=max) return false;
	  
	  
	  

      return isValidBSTutil(root.left, min, root.data) && isValidBSTutil(root.right, root.data, max);
	
	  }
}
