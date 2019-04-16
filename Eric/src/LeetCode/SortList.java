package LeetCode;

public class SortList {

	public static ListNode sortList(ListNode head) {
		if(head==null||head.next==null) {
			return head;
		}
		 ListNode mid = getMid(head);
	        ListNode midNext = mid.next;
	        mid.next = null;
	        return mergeSort(sortList(head), sortList(midNext));
	    }
	    private static ListNode getMid(ListNode head) {
	        if(head == null || head.next == null) {
	            return head;
	        }
	        ListNode slow = head, quick = head;
	        while(quick.next != null && quick.next.next != null) {
	            slow = slow.next;
	            quick = quick.next.next;
	        }
	        return slow;
	    }
	    private static ListNode mergeSort(ListNode n1, ListNode n2) {
	        ListNode preHead = new ListNode(0);
	        ListNode cur1 = n1;
	        ListNode cur2 = n2;
	        ListNode cur = preHead;
	        while(cur1 != null && cur2 != null) {
	            if(cur1.val < cur2.val) {
	                cur.next = cur1;
	                cur1 = cur1.next;
	            } else {
	                cur.next = cur2;
	                cur2 = cur2.next;
	            }
	            cur = cur.next;
	        }
	        if(cur1 != null){
	            cur.next = cur1;
	        }
	        if(cur2 != null){
	            cur.next = cur2;
	        }
	        return preHead.next;
	    }	
	public static void main(String[] args) {
		
                  sortList(null);
	}

}
