package linkedlist;

public class PlusOneLinkedList {

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	Node head;

	public static void main(String[] args) {

		PlusOneLinkedList obj = new PlusOneLinkedList();
		obj.head = new Node(8);
		obj.head.next = new Node(9);
		obj.head.next.next = new Node(9);
		obj.plusOne(obj.head);

	}

	public Node plusOne(Node head) {

		if (head == null)
			return null;
		
		boolean flag = helper(head);
		
		if(flag )
		{
			
			if(head.data==9) {
				head.data = 0;
				Node node = new Node(1);
				node.next = head;
				head = node;
			}
			else
			{
				if(head.data==0) {
					Node node = new Node(1);
					node.next = head;
					head = node;
				}
			}
			
		}
		
		return head;

	}

	boolean helper(Node node) {
		if (node.next == null) {
			node.data = node.data + 1;

			if (node.data > 9) {
				node.data = 0;
				return true;
			} else
				return false;
		}

		boolean x = helper(node.next);

		if (x) {
			node.data = node.data + 1;
			if (node.data > 9) {
				node.data = 0;
				return true;
			}

		}

		return x;
	}
}
