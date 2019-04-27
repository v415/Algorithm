package ch2;


public class Review8 {
	// Definition for binary tree

	public class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;
    TreeLinkNode(int val) {
        this.val = val;
    	}
	}


	
 public TreeLinkNode GetNext(TreeLinkNode pNode) {
	 if(pNode==null)
		 return null;
	 //1.存在右子树
	 if (pNode.right!=null) {
		 pNode=pNode.right;
		 while (pNode.left!=null) {
			 pNode=pNode.left;
		}
		 return pNode;
	}
	 //2.右子树为空
	  if (pNode.next!=null) {
		if (pNode==pNode.next.left) {
			pNode=pNode.next;
			
		}
		else if (pNode==pNode.next.right) {
			while (pNode.next!=null && pNode==pNode.next.left) {
				pNode=pNode.next;
			}
		}
		return pNode;
	}

	return null;
	 
 }



}
