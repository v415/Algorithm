
public class ReverseNode {

	public static void main(String[] args) {
		

	}
	
	private static Node reverse2(Node head) {
		Node pre=head;
		Node cur=head.getNext();
		Node temp;
		while(cur!=null) {
			temp=cur.getNext();
			cur.setNext(pre);
			pre=cur;
			cur=temp;			
		}
		return pre;
	}
   class Node{
	   String data;
	   Node next;
	public Node getNext() {	
		return next;
	}
	public void setNext(Node next) {
		this.next=next;
	}
   }
  /* public void Node(String data) {
	   super();
	   this.data=data;
   }
   public void Node(String data,Node next) {
	   super();
	   this.data=data;
	   this.next=next;
   }
   */
}
