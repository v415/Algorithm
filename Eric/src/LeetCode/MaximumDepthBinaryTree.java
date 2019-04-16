package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthBinaryTree {
	/*
     * 解法一：
     * 递归解法，非常简洁   
    public static int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        return 1+Math.max(maxDepth(root.left), maxDepth(root.right));
    }
    */
	
    //解法二：使用queue进行层序遍历
	public   int maxDepth(TreeNode root) {
		if(root==null) {
			return 0;//空树 
		}
		Queue<TreeNode> queue=new LinkedList<TreeNode>();//queue:队列，先进先出
		int result=0;//初始定义深度为0
		queue.add(root);
		while(!queue.isEmpty()) {
			int size=queue.size();
			for(int i=0;i<size;i++) {
				TreeNode node=queue.poll();
				//poll：Queue(队列)的一个方法，获取并移除此队列的头，如果此队列为空，则返回null
				//p：Stack(栈)的方法，移除堆栈顶部的对象，并作为此函数的值返回该对象				
			}
		}
		return result;
	}
	public static void main(String[] args) {
		
	}

}
