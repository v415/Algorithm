
public class FindDataFromNode {

	public static void main(String[] args) {
		Node a = new Node("1");
		Node b = new Node("2");
		Node c = new Node("3");
		Node d = new Node("4");
		Node e = new Node("5");
		Node f = new Node("6");
		a.setNext(b);
		b.setNext(c);
		c.setNext(d);
		d.setNext(e);
		e.setNext(f);
		System.out.println(FindDataFromTail(a, 6));
	}

	private static String FindDataFromTail(Node a, int k) {
		if (a == null)
			return null;
		if (k == 0) {
			System.out.println("k应该从1开始");
			return null;
		}
		Node Node1 = a;
		Node Node2 = null;
		for (int i = 0; i < k - 1; i++) {
			if (Node1.getNext() == null) {
				System.out.println("k不应该大于链表的长度");
				return null;
			}
			Node1 = Node1.getNext();
		}
		Node2 = a;
		while (Node1.getNext() != null) {
			Node1 = Node1.getNext();
			Node2 = Node2.getNext();
		}
		return Node2.getData();
	}

	static class Node {//加static，不然报错
		private String data;
		private Node next;

		public Node(String data) {
			super();
			this.data = data;
		}

		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}
}
