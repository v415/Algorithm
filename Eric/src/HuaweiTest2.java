import java.util.Scanner;
import java.util.Stack;

public class HuaweiTest2 {
	    public static String decodeString(String s) {
	        Stack<Character> stack = new Stack<>();
	        StringBuilder repeat;
	        StringBuilder res = new StringBuilder();
	        for (char c : s.toCharArray()) {
	            if (c == ']' || c == ')' || c == '}') {
	                repeat = new StringBuilder();
	                while (stack.peek() != '[' && stack.peek() != '(' && stack.peek() != '{') {
	                    repeat.append(stack.pop());
	                }

	                if(!stack.isEmpty() || c==']'&&stack.peek()=='[' || c==')'&&stack.peek()=='(' || c=='}'&&stack.peek()=='{')
	                    stack.pop();

	                StringBuilder count = new StringBuilder();
	                while (!stack.isEmpty() && (stack.peek() >= '0' && stack.peek() <= '9')) {
	                    count.append(stack.pop());
	                }
	                Integer num = Integer.valueOf(count.reverse().toString());
	                String str = repeat.reverse().toString();
	                String strs = "";
	                for (int i = 0; i < num; i++) {
	                    strs += str;
	                }
	                for (char charA : strs.toCharArray()) {
	                    stack.push(charA);
	                }
	            } else {
	                stack.push(c);
	            }
	        }

	        while (!stack.isEmpty()) {
	            res.append(stack.pop());
	        }
	        return res.toString();
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String str = sc.nextLine();
	        System.out.println(decodeString(str));
	    }
	}

