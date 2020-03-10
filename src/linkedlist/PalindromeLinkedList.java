package linkedlist;


public class PalindromeLinkedList {
	Node head;
	Node res;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {

		PalindromeLinkedList obj = new PalindromeLinkedList();
		obj.head = new Node(1);
		obj.head.next = new Node(2);
//		obj.head.next.next = new Node(2);
//		obj.head.next.next.next = new Node(1);
		System.out.println(obj.isPalindrome(obj.head));
	}

	public boolean isPalindrome(Node head) {
		res = head;
		return isPalindromeUtil(head);
	}

	public boolean isPalindromeUtil(Node node) {
		if (node == null)
			return true;

		Node temp = node.next;

		
		boolean x = isPalindromeUtil(temp);

		if(!x)
			return false;
		
		boolean y = (res.data == node.data);
			

		res = res.next;
		return y;
	}
}
