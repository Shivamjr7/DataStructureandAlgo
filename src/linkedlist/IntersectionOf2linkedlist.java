package linkedlist;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOf2linkedlist {

	
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	Node head1,head2;
	
	
	public static void main(String[] args) {
		IntersectionOf2linkedlist list = new IntersectionOf2linkedlist();
		list.head1 = new Node(4);
		list.head1.next = new Node(1);
		list.head1.next.next = new Node(8);
		list.head1.next.next.next = new Node(4);
		list.head1.next.next.next.next = new Node(5);
		
		
		list.head2 = new Node(5);
		list.head2.next = new Node(0);
		list.head2.next.next = new Node(1);
		list.head2.next.next.next = new Node(8);
		list.head2.next.next.next.next = new Node(4);
		list.head2.next.next.next.next.next = new Node(5);
		list.getIntersectionNode(list.head1, list.head2);
	}
	
	  public Node getIntersectionNode(Node headA, Node headB) {
	        
		  
		  Set<Node> set = new HashSet<>();
		  
		  Node temp1 = headA;
		  Node temp2 = headB;
		  while(temp1 != null)
		  {
			  set.add(temp1);
			  temp1 = temp1.next;
					  
		  }
		  
		  
		  while(temp2!=null)
		  {
			  if(set.contains(temp2))
				  return temp2;
			  temp2= temp2.next;
		  }
		  
		  
		  return null;
	    }

}
