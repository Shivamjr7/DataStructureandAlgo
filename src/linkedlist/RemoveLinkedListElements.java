package linkedlist;

public class RemoveLinkedListElements {

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	Node head;

	public static void main(String[] args) {

		RemoveLinkedListElements list = new RemoveLinkedListElements();
		list.head = new Node(1);
		list.head.next = new Node(2);
		 list.head.next.next = new Node(6);
		 list.head.next.next.next = new Node(3);
		 list.head.next.next.next.next = new Node(4);
		 list.head.next.next.next.next.next = new Node(5);
		 list.head.next.next.next.next.next.next= new Node(6);

		removeElements(list.head, 6);

	}

	public static Node removeElements(Node head, int val) {

		if(head ==null)
	           return null;
		
		
		while (head != null && head.data == val) {
			head = head.next;
		}
	
		
		Node temp = head;
		
		Node prev = null;
		
		while(temp!=null)
		{
			
			while(temp!=null && temp.data==val)
			{
				prev.next = temp.next;
				temp = temp.next;
			}
		
			prev = temp;
			if(temp!=null)
			temp = temp.next;
			
		}
		
	

		return head;
	}

}
