package data.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BST<E extends Comparable<E>> {
	private class Node {
		public E e;
		public Node left, right;

		public Node(E e) {
			super();
			this.e = e;
			this.left = null;
			this.right = null;
		}
	}

	private Node root;
	private int size;

	public BST() {
		root = null;
		size = 0;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * 向以node为根的二分搜索树种插入一个元素e，递归算法
	 */
	public void add(E e) {
		root = add(root, e);
	}

	// 向以node为根的二分搜索树种插入一个元素e，递归算法
	// 返回插入新节点后的树的跟
	private Node add(Node node, E e) {
		if (node == null) {
			size++;
			return new Node(e);
		}
		if (e.compareTo(node.e) < 0) {
			node.left = add(node.left, e);
		} else if (e.compareTo(node.e) > 0) {
			node.right = add(node.right, e);
		}
		return node;
	}

	/**
	 * 查看二分搜索树中是否包含e
	 */
	public boolean contains(E e) {
		return contains(root, e);
	}

	private boolean contains(Node node, E e) {
		if (node == null) {
			return false;
		}
		if (e.compareTo(node.e) < 0) {
			return contains(root.left, e);
		} else if (e.compareTo(node.e) > 0) {
			return contains(root.right, e);
		} else {
			return true;
		}
	}

	/**
	 * 二分搜索树的前序遍历
	 */
	public void preOrder() {
		preOrder(root);
	}

	private void preOrder(Node node) {
		if (node == null)
			return;

		System.out.println(node.e);
		preOrder(node.left);
		preOrder(node.right);
	}

	/**
	 * 二分搜索树的前序遍历，非递归方式
	 */
	public void preOrderNR() {
		Stack<Node> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			Node cur = stack.pop();
			System.out.println(cur.e);
			if (cur.right != null)
				stack.push(cur.right);
			if (cur.left != null)
				stack.push(cur.left);
		}
	}
/**
 * 层序遍历
 */
	public void levelOrder() {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node cur = queue.remove();
			System.out.println(cur.e);
			if (cur.left != null)
				queue.add(cur.left);
			if (cur.right != null)
				queue.add(cur.right);
		}
	}

	/**
	 * 二分搜索树的中序遍历
	 */
	public void inOrder() {
		inOrder(root);
	}

	private void inOrder(Node node) {
		if (node == null)
			return;

		inOrder(node.left);
		System.out.println(node.e);
		inOrder(node.right);
	}

	/**
	 * 二分搜索树的后序遍历
	 */
	public void postOrder() {
		postOrder(root);
	}

	private void postOrder(Node node) {
		if (node == null)
			return;

		postOrder(node.left);
		postOrder(node.right);
		System.out.println(node.e);
	}
	/**
	 * 寻找二分搜索树的最小元素
	 */
	public E mininum() {
		if(size==0) {
			throw new IllegalArgumentException("BST is empty");
		}
		return mininum(root).e;
	}
	/**
	 * 返回以node为根的二分搜索树最小值所在节点
	 */
	private Node mininum(Node node) {
		if(node.left==null) {
			return node;
		}
		return mininum(node.left);
	}
	/**
	 * 寻找二分搜索树的最大元素
	 */
	public E maxinum() {
		if(size==0) {
			throw new IllegalArgumentException("BST is empty");
		}
		return maxinum(root).e;
	}
	/**
	 * 返回以node为根的二分搜索树最大值所在节点
	 */
	private Node maxinum(Node node) {
		if(node.right==null) {
			return node;
		}
		return maxinum(node.right);
	}
	/**
	 * 删除二分搜索树的最大元素所在节点
	 */
	public E removeMax() {
		E maxinum = maxinum();
		removeMax(root);
		return maxinum;
	}
	/**
	 * 删除以node为根的二分搜索树最大值所在节点
	 * 返回删除节点后的新的二分搜索树的根
	 */
	private Node removeMax(Node node) {
		if(node.right==null) {
			Node leftNode = node.left;
			node.left=null;
			size--;
			return leftNode;
		}
		node.right=removeMax(node.right);
		return node;
	}
	/**
	 * 删除二分搜索树的最小元素所在节点
	 */
	public E removeMin() {
		E removeMin = mininum();
		removeMin(root);
		return removeMin;
	}
	/**
	 * 删除以node为根的二分搜索树最xiao值所在节点
	 * 返回删除节点后的新的二分搜索树的根
	 */
	private Node removeMin(Node node) {
		if(node.left==null) {
			Node rightNode = node.right;
			node.right=null;
			size--;
			return rightNode;
		}
		node.left=removeMin(node.left);
		return node;
	}
	/**
	 * 从二分搜索树中删除元素为e的节点
	 * @return 
	 */
	public void remove(E e) {
		root = remove(root,e);
	}
	/**
	 * 删除以node为根的树的值为e的节点，递归算法
	 * @return 返回删除节点后新的树的根
	 */
	private Node remove(Node node, E e) {
		if(node==null)
			return null;
		if(e.compareTo(node.e)<0) {
			node.left = remove(node.left,e);
			return node;
		}else if(e.compareTo(node.e)>0) {
			node.right=remove(node.right,e);
			return node;
		}else {//e等于 node.e
			//待删除节点左子树为空
			if(node.left==null) {
				Node nodeRight=node.right;
				node.right=null;
				size--;
				return nodeRight;
			}
			//待删除节点右子树为空
		    if(node.right==null) {
				Node nodeLeft=node.left;
				node.left=null;
				size--;
				return nodeLeft;
			} 
		    //待删除节点左右子树都不为空
			//找到比待删除节点大的最小节点，即待删除节点右子树的最小节点
			//用这个节点代替待删除节点的位置
			Node successor=mininum(node.right);	
			successor.right=removeMin(node.right);
			successor.left=node.left;
			node.left=node.right=null;
			return successor;
		}
	}

	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		generateBSTString(root, 0, res);
		return res.toString();
	}

	/**
	 * 生成以naode为根节点，深度为depth的描述二叉树的字符串
	 */
	private void generateBSTString(Node node, int depth, StringBuilder res) {
		if (node == null) {
			res.append(generateBSTString(depth) + "null\n");
			return;
		}
		res.append(generateBSTString(depth) + node.e + "\n");
		generateBSTString(node.left, depth + 1, res);
		generateBSTString(node.right, depth + 1, res);
	}

	private String generateBSTString(int depth) {
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < depth; i++)
			res.append("--");
		return res.toString();
	}

	public static void main(String[] args) {

		BST<Integer> bst = new BST<>();
		int[] nums = { 5, 3, 6, 8, 4, 2 };
		for (int num : nums) {
			bst.add(num);
		}
		bst.preOrder();
		System.out.println();
		bst.levelOrder();
		// bst.inOrder();
		System.out.println();
		bst.postOrder();
		System.out.println(bst);
	}

}
