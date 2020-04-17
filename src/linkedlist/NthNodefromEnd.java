package linkedlist;

public class NthNodefromEnd {

	
	static class Node
	{
		int data;
		Node(int data)
		{
			this.data = data;
		}
		Node next;
	}
	
	Node head;
	public static void main(String[] args) {
		
		NthNodefromEnd obj = new NthNodefromEnd();
		
		obj.head = new Node(1);
		obj.head.next = new Node(2);
		obj.head.next.next = new Node(3);
		obj.head.next.next.next = new Node(4);
		obj.head.next.next.next.next = new Node(5);
		obj.removeNthFromEnd(obj.head, 1);
		

	}

	
	  public Node removeNthFromEnd(Node head, int n) {
	        
		  if(head==null	)
			  return null;
		  
		
		
		  
		  Node fast = head;
		  Node slow = head;
		  
		  
		int count =0;
		
		while(fast.next!=null && count <n)
		{
			fast = fast.next;
			count++;
		}
		
		if(count<n)
			return head.next;
	
		while(fast!=null && fast.next!=null)
		{
			slow = slow.next;
			fast = fast.next;
		}
		
		
		
		slow.next=slow.next.next;
		
		
		return head;
	  }
}
