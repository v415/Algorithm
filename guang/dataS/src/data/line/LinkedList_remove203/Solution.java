package data.line.LinkedList_remove203;

/* 
 * @author yuan 
 * @version 1.0 
 * @date 2018年11月1日 下午1:11:10 
 */

public class Solution {
	 public ListNode removeElements(ListNode head, int val) {
		 while(head!=null && head.val==val)
			 head=head.next;
		 if (head==null) {
			 return null;
		}
		 ListNode pre = head;
		while (pre.next!=null) {
			if (pre.next.val==val) {
				pre.next=pre.next.next;
			}else {
				pre=pre.next;
			}
		}
		return head;
	    }
}


