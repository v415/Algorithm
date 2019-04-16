/*import java.util.Scanner;

import LeetCode.ListNode;

public class Test {
	public boolean hasloop(ListNode head) {
	  //定义快慢指针
	  ListNode slow,fast;
	  slow=fast=head;
	  while(fast!=null&&fast.next!=null){
	  slow=slow.next;
	  fast=fast.next.next;
	  if(fast==slow) 
		  return ture;  
		 
	}
		public static void splitStr(String s) {
			if (s == null) {
				return;
			}
			int a = s.length() % 8;
			StringBuilder sb = new StringBuilder(s);
			if (a != 0) {
				for (int i = 8 - a; i > 0; i--) {
					sb.append('0');
				}
			}
			s = sb.toString();
			for (int i = 0; i < s.length(); i += 8) {
				System.out.println(sb.substring(i, i + 8));
			}
		}

	  import sys
	  if __name__=="__main__":
	      input_list=sys.stdin.
	      readline().strip().split('')
	      str_list=[]
	      for index in range(1,len(input_list)):
	          for i in range(0,len())
	  while(sc.hasNext()) {
		 int N=sc.nextInt();			
		if(input1.length()%8!=0) {
			input1=input1+"00000000";//不够补0
		}
		while(input1.length()>=8) {
			System.out.println(input1.substring(0, 8));
			input1=input1.substring(8);
		}
	}
	   return false;
	}
	}
	public static boolean JudgeLoop(ListNode head) {
	   if(head==null||head.next==null) {
		   return false;
	   }
	   ListNode slow=head;
	   ListNode fast=head;
	   while(fast!=null&&slow!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				fast=head;
				while(fast!=slow) {
					fast=fast.next;
					slow=slow.next;
				}			
				return true;
			}
		}
	return false; 
	}
	
	public static void main(String[] args) {
		
		System.out.println("请输入一个链表节点，使用逗号分隔");
		Scanner sc=new Scanner(System.in);
		ListNode head=new ListNode();
		head.next=sc.next();
		JudgeLoop(head.next);
	}

}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// 从键盘接收字符串
		System.out.println("请输入字符串：");
		while (sc.hasNext()) {
			int N = Integer.parseInt(sc.nextLine());

			for (int i = 0; i < N; i++) {
				String s = sc.nextLine();
                 splitStr(s);
			}
		}
	}

	public static void splitStr(String s) {
		if (s == null) {
			return;
		}
		int a = s.length() % 8;
		StringBuilder sb = new StringBuilder(s);
		if (a != 0) {
			for (int i = 8 - a; i > 0; i--) {
				sb.append('0');
			}
		}
		s = sb.toString();
		for (int i = 0; i < s.length(); i += 8) {
			System.out.println(sb.substring(i, i + 8));
		}
	}

}

*/