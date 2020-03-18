package linkedlist;


public class BinaryToInteger {
	
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	Node head;
	
	
	public static void main(String[] args) {
		BinaryToInteger obj = new BinaryToInteger();
		obj.head = new Node(1);
//		obj.head.next = new Node(0);
//		obj.head.next.next = new Node(1);
		System.out.println(obj.getDecimalValue(obj.head));

	}
	
	 public int getDecimalValue(Node head) {
	        
		 
		 int count =0;
		 
		 Node temp = head;
		 while(temp!=null)
		 {
			 temp  =temp.next;
			 count++;
		 }
		 
		 
		 Node tempnew = head;
		 
		 double dec =0;
		 while(tempnew!=null)
		 {
			dec = dec+ Math.pow(2,count-1)*tempnew.data;
			tempnew = tempnew.next;
			count--;
		 }
		 
		 return (int) dec;
		 
	    }

}
