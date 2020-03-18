package linkedlist;

public class RemoveDuplicateFromSortedList {

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	Node head;

	public static void main(String[] args) {
		RemoveDuplicateFromSortedList list = new RemoveDuplicateFromSortedList();

		list.head = new Node(1);
		list.head.next = new Node(1);
		list.head.next.next = new Node(2);
		list.head.next.next.next = new Node(2);
		list.head.next.next.next.next = new Node(3);
		list.head.next.next.next.next.next = new Node(3);

		
		deleteDuplicates(list.head);
	}

	public static  Node deleteDuplicates(Node head) {

		
		if(head ==null)
			return null;
		
		
		Node temp = head;
		
		while(temp !=null)
		{
		
			while(temp.next != null && temp.data==temp.next.data)
			{
				temp.next = temp.next.next;
			}
			temp =temp.next;
		}
		
		return head;
		
	}

}
