package LeetCode;

import java.util.LinkedList;

public class MinimumDepthBinaryTree {
	/**
     * ˼·1��
     * ������ȱ�����DFS��
     * �����ǰ�ڵ��ǿգ�����С���Ϊ 0������
     * Ч�ʵ�
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
     * ˼·2��
     * ������ȱ�����BFS��
     * �ҵ���һ��Ҷ�ӽ��Ϳ���ֹͣ����
     * Ч�ʸ�
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
			  return level;	//���Ϊ1		  
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
