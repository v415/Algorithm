/*
public class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        // 如果有右节点，返回右节点
        if(pNode.right != null){
            TreeLinkNode node = pNode.right;
            while(node.left != null)
                node = node.left;
            return node;
        }
        // 如果没有右节点
        else{
            while(pNode.next != null){
                TreeLinkNode parent = pNode.next;
                // 如果当前节点是父节点的左孩子，返回当前父节点
                if(pNode == parent.left)
                    return parent;
                pNode = pNode.next;
            }
        }
        return null;
    }
}