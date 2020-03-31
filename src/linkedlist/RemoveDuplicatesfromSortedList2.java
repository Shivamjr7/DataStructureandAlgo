package linkedlist;

public class RemoveDuplicatesfromSortedList2 {

	static class Node {
		int data;

		Node(int data) {
			this.data = data;
		}

		Node next;
	}

	Node head;

	public static void main(String[] args) {

		RemoveDuplicatesfromSortedList2 obj = new RemoveDuplicatesfromSortedList2();
		obj.head = new Node(1);
		obj.head.next = new Node(1);
		obj.head.next.next = new Node(1);
		obj.head.next.next.next = new Node(2);
		obj.head.next.next.next.next = new Node(4);
		obj.deleteDuplicates(obj.head);
	}

	public Node deleteDuplicates(Node head) {

		if(head ==null)
			return null;
		Node t = new Node(0);
		    t.next = head;
		 
		    Node p = t;
		    while(p.next!=null&&p.next.next!=null){
		        if(p.next.data == p.next.next.data){
		            int dup = p.next.data;
		            while(p.next!=null&&p.next.data==dup){
		                p.next = p.next.next;
		            }
		        }else{
		            p=p.next;
		        }
		 
		    }
		 
		    return t.next;
	}
}
