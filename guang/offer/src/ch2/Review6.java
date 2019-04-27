package ch2;

import java.util.ArrayList;
import java.util.Stack;

public class Review6 {
	
	    public static class ListNode {
	       int val;
	       ListNode next = null;
	
	       ListNode(int val) {
	            this.val = val;
	       }
	       ListNode() {
	            
	       }

		public ListNode(int val, ListNode next) {
			super();
			this.val = val;
			this.next = next;
		}
	    }
	
	
public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
	
	Stack<Integer> stack =new Stack<>();
	while (listNode!=null) {
		stack.push(listNode.val);
		listNode=listNode.next;
	}
	ArrayList<Integer> list=new ArrayList<>();
	while (!stack.isEmpty()) {
		list.add(stack.pop());
	}
	
	return list;
        
    }
public static void main(String[] args) {
	ListNode listNode =new ListNode();
	printListFromTailToHead(listNode);
	
	
}
}
