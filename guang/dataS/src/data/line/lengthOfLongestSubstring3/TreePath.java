package data.line.lengthOfLongestSubstring3;

public class TreePath {
	int temp=0,max=0;
	boolean flag=false;

    // add data structure your need
      public class TreeNode {
         int val;
          TreeNode left;
         TreeNode right;
          TreeNode(int x) { val = x; }
      }
     
    public int longestPath(TreeNode root, int[] nodeValues) {
        // implement your method
    	
        return longest(root, nodeValues);
    }
    public int longest(TreeNode node, int[] nodeValues){
    	if (node==null) {
			return 0;
		}
    		for (int i = 0; i < nodeValues.length; i++) {
    			if(node.val==nodeValues[i]) {
    				temp++;
    				flag=true;
    				
				}
			}
    		if (!flag) {
    			temp=0;
			}
    		max=Math.max(max, temp);
    		flag=false;
    		
    		if (node.left!=null) {
    			longest(node.left,nodeValues);
			}
    		if (node.right!=null) {
    			longest(node.right,nodeValues);
			}
		return max;
    	
    }
}
