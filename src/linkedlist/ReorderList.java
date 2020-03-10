package linkedlist;
/**
 * Split the list into two 
 * Reverse the second
 * Merge the two list
 * @author sjari
 *
 */
public class ReorderList {

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	Node head;

	public static void main(String[] args) {

		ReorderList obj = new ReorderList();
		obj.head = new Node(1);
		obj.head.next = new Node(2);
		obj.head.next.next = new Node(3);
		obj.head.next.next.next = new Node(4);
		obj.head.next.next.next.next = new Node(5);
		obj.head.next.next.next.next.next = new Node(6);
		obj.head.next.next.next.next.next.next = new Node(7);
		obj.head.next.next.next.next.next.next.next = new Node(8);
		obj.reorderList(obj.head);

	}

	public void reorderList(Node head) {

		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		Node second = slow.next;
		slow.next = null;

		Node p1 = head;
		Node p2 = second;

		second = reverseOrder(second);
		
		// merge two lists here
		while (p2 != null) {
			Node temp1 = p1.next;
			Node temp2 = p2.next;

			p1.next = p2;
			p2.next = temp1;

			p1 = temp1;
			p2 = temp2;
		}

	}

	public static Node reverseOrder(Node head) {

		if (head == null || head.next == null) {
			return head;
		}

		Node pre = head;
		Node curr = head.next;

		while (curr != null) {
			Node temp = curr.next;
			curr.next = pre;
			pre = curr;
			curr = temp;
		}

		// set head node's next
		head.next = null;

		return pre;
	}
}
