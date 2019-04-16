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

		// Ϊ�ջ�ֻ��һ���ڵ�ʱ
		if (slow == null || fast == null) {
			return false;
		}
		while (slow.next != null) {

			// �����ڵ��ǲ�����ѭ��
			if (fast.next == null) {
				return false;
			}
			// ���slow���������fast����������ͬ�����ʾ�л�
			if (slow.data == fast.data) {
				return true;
			}
			// slowָ����һ����fast������
			slow = slow.next;
			fast = fast.next.next;

			// ���fast�ߵ����Ϊ�գ���ʾû�л�
			if (fast == null) {
				return false;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// �������� 1->2->3->4->5->6-4;
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
		System.out.println(isLoop(head));// ������
	}
}
