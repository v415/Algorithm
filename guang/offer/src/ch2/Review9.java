package ch2;

import java.util.Stack;

public class Review9 {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	public void push(int node) {
		stack1.add(node);
	}

	public int pop() {
		if (stack2.size()<=0) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();

	}
}
