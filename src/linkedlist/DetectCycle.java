package linkedlist;


public class DetectCycle {

	
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}
	
	Node head;
	
	public static void main(String[] args) {
		
		
		DetectCycle obj = new DetectCycle();
		obj.head = new Node(1);
		Node second  = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		
		obj.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = second;
		
		
		System.out.println(hasCycle(obj.head));

	}
	
	  public static boolean hasCycle(Node head) {
	        
		  
		  Node slow = head;
		  Node fast = head;
		  
		  
		  while(fast!=null && fast.next!=null && fast.next.next!=null)
		  {
			  slow = slow.next;
			  fast = fast.next.next;
			  
			  
			  if(fast==slow)
				  return true;
		  }
		  
		  
		  return false;
		  
	    }

}
