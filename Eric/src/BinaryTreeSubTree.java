
public class BinaryTreeSubTree {

	public static void main(String[] args) {
		BinaryTreeNode node1=new BinaryTreeNode(8);
		BinaryTreeNode node2=new BinaryTreeNode(8);
		BinaryTreeNode node3=new BinaryTreeNode(7);
		BinaryTreeNode node4=new BinaryTreeNode(9);
		BinaryTreeNode node5=new BinaryTreeNode(2);
		BinaryTreeNode node6=new BinaryTreeNode(4);
		BinaryTreeNode node7=new BinaryTreeNode(7);
		node1.setLchildNode(node1);node1.setRchildNode(node3);
		node2.setLchildNode(node4);node2.setRchildNode(node5);
		node5.setLchildNode(node6);node5.setRchildNode(node7);
		
		BinaryTreeNode a=new BinaryTreeNode(8);
		BinaryTreeNode b=new BinaryTreeNode(9);
		BinaryTreeNode c=new BinaryTreeNode(2);
		a.setLchildNode(b);a.setRchildNode(c);
		System.out.println(hasSubTree(node1,a));
		
	}
	private static boolean hasSubTree(BinaryTreeNode root1,BinaryTreeNode root2) {
		{
			boolean result=false;
			if(root1!=null&&root2!=null) {
				result=doseTree1HaveTree2(root1,root2);
				if(!result) {
					result=hasSubTree(root1.getLchildNode(),root2);
					
				}
				if(!result) {
					result=hasSubTree(root1.getRchildNode(),root2);
				}
			}
			return result;
		}
	}
    private static boolean doseTree1HaveTree2(BinaryTreeNode root1, BinaryTreeNode root2) {
		if(root2==null) {
			return true;
		}
		if(root1==null) {
		return false;	
		}
		if(root1.getValue()!=root2.getValue()) {
			return false;
		}
		return doseTree1HaveTree2(root1.getLchildNode(),root2.getRchildNode())
				&&doseTree1HaveTree2(root1.getLchildNode(),root2.getRchildNode());
	}
	static class BinaryTreeNode{//��Ϊ��̬static��
	   public BinaryTreeNode LchildNode;
	   public BinaryTreeNode RchildNode;
	   public int value;
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
}
