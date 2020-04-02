package tree;

import java.util.ArrayList;
import java.util.List;

public class KthSmallestInaBST {

	static class Node {
		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
		}
	}

	Node root;
	int ele =-1;
	public static void main(String[] args) {

		KthSmallestInaBST obj = new KthSmallestInaBST();
		obj.root  = new Node(3);
		obj.root.left  = new Node(1);
		obj.root.right = new Node(4);
		obj.root.left.right  = new Node(2);
		
		System.out.println(obj.kthSmallest(obj.root, 2));
	}

	public int kthSmallest(Node root, int k) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		helper(root,list);
		return list.get(k-1);
	
	}
	
	
	void helper(Node root , ArrayList<Integer> list)
	{
		if(root==null)
			return;
		
		helper(root.left,list);
		list.add(root.data);
		helper(root.right,list);
	}
}
