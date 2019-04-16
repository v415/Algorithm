import java.util.Stack;

public class StackGetMin {

	public static void main(String[] args) {
		MyStack a = new MyStack();
		System.out.println(a.min());
		a.push(10);
		a.push(11);
		System.out.println(a.min());
	}

}

class MyStack {
	private Stack<Integer> stack1, stackHelp;

	public MyStack() {
		stack1 = new Stack<Integer>();
		stackHelp = new Stack<Integer>();
	}

	public void push(int num) {
		stack1.push(num);
		if (stackHelp.size() == 0 || num < stackHelp.peek())//这里误加了分号；
		{
			stackHelp.push(num);
		} else {
			stackHelp.push(stackHelp.peek());
		}

	}

	public void pop() {
		stack1.pop();
		stackHelp.pop();
	}

	public Integer min() {
		if (stackHelp.size() == 0) {
			return null;
		} else
			return stackHelp.peek();
	}
}