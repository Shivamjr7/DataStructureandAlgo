package linkedlist;

import java.util.Stack;

public class Add2Numbers2 {

	static class Node {
		int data;

		Node(int data) {
			this.data = data;
		}

		Node next;
	}

	Node head1, head2;

	public static void main(String[] args) {

		Add2Numbers2 obj = new Add2Numbers2();

		obj.head1 = new Node(7);
		obj.head1.next = new Node(2);
		obj.head1.next.next = new Node(8);
		obj.head1.next.next.next = new Node(3);

		obj.head2 = new Node(5);
		obj.head2.next = new Node(6);
		obj.head2.next.next = new Node(7);
		obj.addTwoNumbers(obj.head1, obj.head2);

	}

	public Node addTwoNumbers(Node n1, Node n2) {
		// helper(n1, n2);

		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();

		while (n1 != null) {
			stack1.push(n1.data);
			n1 = n1.next;
		}

		while (n2 != null) {
			stack2.push(n2.data);
			n2 = n2.next;
		}

		int carry = 0;
		Node res = new Node(0);

		while (!stack1.isEmpty() || !stack2.isEmpty()) {

			int sum = (!stack1.isEmpty() ? stack1.pop() : 0) + (!stack2.isEmpty() ? stack2.pop() : 0) + carry;

			carry = sum / 10;
			sum = sum % 10;
			Node temp = new Node(sum);
			temp.next = res.next;
			res.next = temp;

		}

		if (carry > 0) {
			Node temp = new Node(carry);
			temp.next = res.next;
			res.next = temp;
		}

		return res.next;
	}

}
