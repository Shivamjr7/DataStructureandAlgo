package linkedlist;


public class DeleteNode {

	
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	Node head;
	
	
	
	public static void main(String[] args) {
		
		
		DeleteNode list = new DeleteNode();
		list.head = new Node(4);
		list.head.next = new Node(5);
		list.head.next.next = new Node(1);
		list.head.next.next.next = new Node(9);
		list.deleteNode(list.head.next);
	}
	
	
	  public   void deleteNode(Node node) {
	        
		  
		  Node temp = head;
		  Node prev = null;
		  while(temp!=null && temp!=node)
		  {
			  prev = temp;
			  temp = temp.next;
		  }
		  
		  prev.next = temp.next;
	    }

}
