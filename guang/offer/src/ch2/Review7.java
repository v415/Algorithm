package ch2;


public class Review7 {
	// Definition for binary tree
		  public static class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	
public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
	return reConstructBinaryTree(pre, 0, pre.length-1, in, 0, in.length-1);
    }
//范围是前闭后bi[preStart,preEnd],
public static TreeNode reConstructBinaryTree(int [] pre,int preStart,int preEnd,int [] in,
		int inStart,int inEnd) {
	if (pre.length==0||in.length==0) {
		return null;
	}
	if (preStart>preEnd||inStart>inEnd) {
		return null;
	}
	TreeNode node=new TreeNode(pre[preStart]);
	for (int i = inStart; i <= inEnd; i++) {
		if (pre[preStart]==in[i]) {
			node.left=reConstructBinaryTree(pre, preStart+1, preStart+i-inStart, in, inStart, i-1);
			node.right=reConstructBinaryTree(pre, preStart+1+i-inStart, preEnd, in, i+1, inEnd);
		}
	}
	return node;
}
// 中序遍历二叉树
public static void printTree(TreeNode root) {
    if (root != null) {
        printTree(root.left);
        System.out.print(root.val + " ");
        printTree(root.right);
    }
}
public static void main(String[] args) {
	int[] preorder = {1, 2, 4, 7, 3, 5, 6, 8};
    int[] inorder = {4, 7, 2, 1, 5, 3, 8, 6};
    TreeNode root = reConstructBinaryTree(preorder, inorder);
    printTree(root);
}
}
