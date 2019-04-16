package LeetCode;

import java.util.Stack;

public class IntStack {

	 public static int intStack(String[] tokens) {
		 Stack<Integer> intStack=new Stack<Integer>();
		 for(int i=0;i<tokens.length;i++) {
			 if(tokens[i]=="*"||tokens[i]=="+"||tokens[i]=="/"||tokens[i]=="-") {
				 int a=intStack.pop();//��ջ ��a  �����룺1 2 +����a=1 b=2
				 int b=intStack.pop();//��ջ ��b
				 intStack.push(calculate(tokens[i],a,b));//����������ֵ
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
		/*�ַ������鸳ֵ  Ҳ���԰����淽ʽ��ֵ��
        String[] str = new String[3]; //����һ������Ϊ5��String(�ַ���)�͵�һά����
        str[0] = "12"; //��ֵ
        str[1] = "2";
        str[2] = "+";*/
		String s[]= {"12","2","+"};       
		int result=intStack(s);
		System.out.println(result);
	}

}
