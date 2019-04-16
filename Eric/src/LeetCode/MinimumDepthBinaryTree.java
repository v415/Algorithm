package LeetCode;

import java.util.LinkedList;

public class MinimumDepthBinaryTree {
	/**
     * 思路1：
     * 深度优先遍历（DFS）
     * 如果当前节点是空，则最小深度为 0，返回
     * 效率低
     */
	public static int minDepth(TreeNode root) {
		if(root==null) {
			return 0;
		}
		int l=minDepth(root.left);
		int r=minDepth(root.right);
		if(l==0||r==0)
		{
			return l+r+1;
		}
		return Math.min(l, r)+1;
	}
	
	/**
     * 思路2：
     * 广度优先遍历（BFS）
     * 找到第一个叶子结点就可以停止遍历
     * 效率高
     */
	public int minDepth2(TreeNode root) {
		if(root==null) {
			return 0;
		}
		LinkedList<TreeNode> queue=new LinkedList<TreeNode>();
		LinkedList<TreeNode> layerList=new LinkedList<TreeNode>();
	  queue.addFirst(root);
	  int start=0;
	  int end=1;
	  int level=1;
	  while(!queue.isEmpty()) {
		  TreeNode temp=queue.removeLast();
		  start++;
		  layerList.addFirst(temp);
		  if(temp.left==null&&temp.right==null) {
			  return level;	//深度为1		  
		  }
		  if(temp.left!=null) {
			  queue.addFirst(temp.left);
		  }
		  if(temp.right!=null) {
			  queue.addFirst(temp.right);
		  }
		  if (start == end) {
              level++;
              start = 0;
              end = queue.size();
              layerList = new LinkedList<TreeNode>();
          }
	  }
	  return level;
	}
	public static void main(String[] args) {
	

	}

}
