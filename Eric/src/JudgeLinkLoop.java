public class JudgeLinkLoop {
	private static class Node {
		private int data;
		private Node next;

		Node() {
		}
		Node(int data) {
			this.data = data;
			this.next = null;
		}

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	public static boolean isLoop(Node head) {
		Node slow = head.next;
		Node fast = head.next.next;

		// 为空或只有一个节点时
		if (slow == null || fast == null) {
			return false;
		}
		while (slow.next != null) {

			// 两个节点是不存在循环
			if (fast.next == null) {
				return false;
			}
			// 如果slow的数据域和fast的数据域相同，则表示有环
			if (slow.data == fast.data) {
				return true;
			}
			// slow指针走一步，fast走两步
			slow = slow.next;
			fast = fast.next.next;

			// 如果fast走到最后为空，表示没有环
			if (fast == null) {
				return false;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// 构造链表 1->2->3->4->5->6-4;
		Node head = new Node();
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		Node f = new Node(6);
		head.next = a;
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		f.next = d;	
		System.out.println(isLoop(head));// 输出结果
	}
}
