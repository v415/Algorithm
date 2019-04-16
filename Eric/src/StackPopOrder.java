import java.util.Stack;

public class StackPopOrder {
    //判断第二个序列是否为第一个栈的出栈顺序
	public static void main(String[] args) {
		Integer[] pushOrder = { 1, 2, 3, 4, 5 };
		Integer[] popOrder1 = { 5, 4, 3, 2, 1 };
		Integer[] popOrder2 = { 5, 4, 2, 1, 3 };
		System.out.println(isRight(pushOrder,popOrder1,5));
		System.out.println(isRight(pushOrder,popOrder2,5));
	}
	private static boolean isRight(Integer[] pushOrder, Integer[] popOrder, int n) {
		Stack<Integer> stack = new Stack<Integer>();
		int count = 0;
		for (int i = 0; i < popOrder.length; i++) {
			if (!stack.isEmpty() && stack.peek() == popOrder[i])
				stack.pop();

			else {
				if (count == pushOrder.length)
					return false;
				else {
					do {
						stack.push(pushOrder[count++]);
					} while (stack.peek() != popOrder[i] && count != popOrder.length);
					if (stack.peek() == popOrder[i])
						stack.pop();
					else {
						return false;
					}
				}
			}

		}
		return true;
	}

}
