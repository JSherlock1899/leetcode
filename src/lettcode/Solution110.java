package lettcode;

import utils.TreeNode;

/**
 * @author: sherlock
 * @description:平衡二叉树 自底向上的递归，算出每一层的左右子树差，若大于1则直接返回-1。如果子树是平衡的，
 * 则返回它的高度，其实也就是dfs啦。
 * @date: 2020/8/17 15:33
 */
public class Solution110 {

    public boolean isBalanced(TreeNode root) {
        return height(root) >= 0;
    }

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }
        return Math.max(leftHeight, rightHeight) + 1; //这里加1是为了把父节点的高度算进去
    }


}
