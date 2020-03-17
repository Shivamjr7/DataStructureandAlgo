package linkedlist;

public class MiddleLinkedList {

	
	static class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
		}
	}
	
	Node head;
	public static void main(String[] args) {
		
		
		MiddleLinkedList obj = new MiddleLinkedList();
		
		
		obj.head = new Node(1);
		obj.head.next = new Node(2);
		obj.head.next.next = new Node(3);
		obj.head.next.next.next = new Node(4);
		obj.head.next.next.next.next = new Node(5);
		obj.head.next.next.next.next.next = new Node(6);
		
		middleNode(obj.head);
	}

	
	
	  public static  Node middleNode(Node head) {
	        
		  Node slow = head;
		  Node fast = head;
		  
		  
		  while(fast !=null && fast.next!=null )
		  {
			  slow = slow.next;
			  fast = fast.next.next;
		  }
		  
		  return slow;
		  
	    }
}
