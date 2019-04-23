# J8 二叉树的下一个结点
- 题目描述：

给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。

- 示例

```
public class TreeLinkNode {

    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
```

- 解题思路：

1. 如果一个节点的右子树不为空，那么该节点的下一个节点是右子树的最左节点；
2. 否则，向上找第一个左链接指向的树包含该节点的祖先节点。
