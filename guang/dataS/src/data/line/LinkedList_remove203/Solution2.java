package data.line.LinkedList_remove203;

/* 
 * @author yuan 
 * @version 1.0 
 * @date 2018年11月1日 下午1:11:10 
 */

public class Solution2 {
	 public ListNode removeElements(ListNode head, int val) {
		ListNode dummyHead = new ListNode(-1);
		dummyHead.next=head;
		 ListNode pre = dummyHead;
		while (pre.next!=null) {
			if (pre.next.val==val) {
				pre.next=pre.next.next;
			}else {
				pre=pre.next;
			}
		}
		return dummyHead.next;
	    }
}


