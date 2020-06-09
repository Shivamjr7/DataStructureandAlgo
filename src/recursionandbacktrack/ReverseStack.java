package recursionandbacktrack;

import java.util.Stack;

public class ReverseStack {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();

		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		
		reverse(stack);
		
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}
		

	}

	static void reverse(Stack<Integer> stack) {
		if (stack.isEmpty())
			return;

		int ele = stack.pop();

		reverse(stack);
		stack.push(ele);

	}

}
