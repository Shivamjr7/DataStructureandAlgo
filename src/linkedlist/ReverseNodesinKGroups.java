package linkedlist;

public class ReverseNodesinKGroups {

	static class Node {
		Node next;
		int data;

		Node(int data) {
			this.data = data;
		}
	}

	Node head;

	public static void main(String[] args) {

		ReverseNodesinKGroups obj = new ReverseNodesinKGroups();
		obj.head = new Node(1);
		obj.head.next = new Node(2);
		obj.head.next.next = new Node(3);
		obj.head.next.next.next = new Node(4);
		obj.head.next.next.next.next = new Node(5);
		obj.reverseKGroup(obj.head, 3);
	}

	public Node reverseKGroup(Node head, int k) {
		if (head == null)
			return null;
		
		
		int len = 0;
		
		Node temp = head;
		
		while(temp!=null)
		{
			temp = temp.next;
			len++;
		}
	
		
		head = helper(head, len , k);
		
		return head;
	}
	
	
	Node helper(Node node , int len , int k)
	{
		
		
		if(len <k)
		{
			return node;
		}
		Node current = head;
		Node prev = null;
		Node next = null;

		int count = 0;

		while ( current != null && count < k )
		{
		next = current.next;
		current.next = prev;
		prev = current;
		current = next;
		count++;
		}

		if (current != null) {
			head.next = helper(next,len - count, k);
		}

		return prev;
	}
}
