import java.util.ArrayList;
import java.util.Stack;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ListNode phead = new ListNode(-1);
        while(listNode != null){
            ListNode memo = listNode.next;
            listNode.next = phead.next;
            phead.next = listNode;
            listNode = memo;
        }
        
        ArrayList<Integer> ret = new ArrayList<>();
        phead = phead.next;
        while(phead != null){
            ret.add(phead.val);
            phead = phead.next;
        }
        return ret;
    }
}