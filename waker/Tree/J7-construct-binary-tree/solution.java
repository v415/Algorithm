import java.util.Map;
import java.util.HashMap;
public class Solution {
    private Map<Integer, Integer> storeIn = new HashMap<>();
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre==null || in == null)
            return null;
        // 缓存中序遍历数组每个值对应的索引
        for(int i = 0; i < in.length; i++)
            storeIn.put(in[i], i);
        return reConstructBinaryTree(pre, 0, pre.length - 1, 0);
    }
    private TreeNode reConstructBinaryTree(int[] pre, int preL, int preR, int inL){ 
       if(preL > preR)
            return null;
        TreeNode root = new TreeNode(pre[preL]);
        // 从map中找出该节点在中序遍历中的索引
        int inIndex = storeIn.get(root.val);
        int leftTreeSize = inIndex - inL;
        // 递归寻找当前节点对应的左子树和右子树
        root.left = reConstructBinaryTree(pre, preL + 1, preL + leftTreeSize,  inL);
        root.right = reConstructBinaryTree(pre, preL + leftTreeSize + 1, preR, inL + leftTreeSize + 1 );
        return root;      
    }
}