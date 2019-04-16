package LeetCode;

import java.util.Stack;

public class IntStack {

	 public static int intStack(String[] tokens) {
		 Stack<Integer> intStack=new Stack<Integer>();
		 for(int i=0;i<tokens.length;i++) {
			 if(tokens[i]=="*"||tokens[i]=="+"||tokens[i]=="/"||tokens[i]=="-") {
				 int a=intStack.pop();//出栈 给a  如输入：1 2 +，则a=1 b=2
				 int b=intStack.pop();//出栈 给b
				 intStack.push(calculate(tokens[i],a,b));//计算运算结果值
			 }
			 
			 else {
				 intStack.push(Integer.parseInt(tokens[i]));
			 }
		 }
		 return intStack.pop();
	 }
	private static int calculate(String s,int a,int b) {
		if(s.equals("+")) {
			return a+b;
		}
		else if(s.equals("-")) {
			return a-b;
		}
		else if(s.equals("*")) {
			return a*b;
		}
		else
			return a/b;
	}
	public static void main(String[] args) {
		/*字符串数组赋值  也可以按下面方式赋值：
        String[] str = new String[3]; //创建一个长度为5的String(字符串)型的一维数组
        str[0] = "12"; //赋值
        str[1] = "2";
        str[2] = "+";*/
		String s[]= {"12","2","+"};       
		int result=intStack(s);
		System.out.println(result);
	}

}
