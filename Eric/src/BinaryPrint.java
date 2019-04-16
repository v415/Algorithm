import java.util.LinkedList;

public class BinaryPrint {

	public static void main(String[] args) {		
		BinaryTreeNode node1=new BinaryTreeNode(8);
		BinaryTreeNode node2=new BinaryTreeNode(5);
		BinaryTreeNode node3=new BinaryTreeNode(7);
		BinaryTreeNode node4=new BinaryTreeNode(9);
		BinaryTreeNode node5=new BinaryTreeNode(2);
		BinaryTreeNode node6=new BinaryTreeNode(4);
		BinaryTreeNode node7=new BinaryTreeNode(15);
		node1.setLchildNode(node2);node1.setRchildNode(node3);
		node2.setLchildNode(node4);node2.setRchildNode(node5);
		node3.setLchildNode(node6);node3.setRchildNode(node7);
		
		printFromTopToBottom(node1);//node1为该二叉树的根节点
	}
	private static void printFromTopToBottom(BinaryTreeNode root) {//输入根节点
		if(root==null) {
			return;
		}
		LinkedList<BinaryTreeNode> queue=new LinkedList<BinaryTreeNode>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BinaryTreeNode node =queue.poll();//删除第一个元素，赋值给node节点
			System.out.print(node.getValue()+" ");//打印节点值
			if(node.getLchildNode()!=null) {
				queue.add(node.getLchildNode());
			}
			if(node.getRchildNode()!=null) {
				queue.add(node.getRchildNode());
			}
		}
		}
	}
	class BinaryTreeNode{
		   private BinaryTreeNode LchildNode;
		   private BinaryTreeNode RchildNode;
		   private int value;
		   public BinaryTreeNode(int i) {
			   super();
			   this.value=i;		   
		   }
		public BinaryTreeNode getLchildNode() {
			return LchildNode;
		}
		public void setLchildNode(BinaryTreeNode lchildNode) {
			LchildNode = lchildNode;
		}
		public BinaryTreeNode getRchildNode() {
			return RchildNode;
		}
		public void setRchildNode(BinaryTreeNode rchildNode) {
			RchildNode = rchildNode;
		}
		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = value;
		}
		   
}
