package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthBinaryTree {
	/*
     * �ⷨһ��
     * �ݹ�ⷨ���ǳ����   
    public static int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        return 1+Math.max(maxDepth(root.left), maxDepth(root.right));
    }
    */
	
    //�ⷨ����ʹ��queue���в������
	public   int maxDepth(TreeNode root) {
		if(root==null) {
			return 0;//���� 
		}
		Queue<TreeNode> queue=new LinkedList<TreeNode>();//queue:���У��Ƚ��ȳ�
		int result=0;//��ʼ�������Ϊ0
		queue.add(root);
		while(!queue.isEmpty()) {
			int size=queue.size();
			for(int i=0;i<size;i++) {
				TreeNode node=queue.poll();
				//poll��Queue(����)��һ����������ȡ���Ƴ��˶��е�ͷ������˶���Ϊ�գ��򷵻�null
				//p��Stack(ջ)�ķ������Ƴ���ջ�����Ķ��󣬲���Ϊ�˺�����ֵ���ظö���				
			}
		}
		return result;
	}
	public static void main(String[] args) {
		
	}

}
