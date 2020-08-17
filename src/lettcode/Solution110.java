package lettcode;

import utils.TreeNode;

/**
 * @author: sherlock
 * @description:平衡二叉树 DFS,求每一个节点的左右子树高度差，若大于二，直接返回false，若搜索到底了还没有返回，则证明
 * 这是一棵高度平衡的二叉树
 * @date: 2020/8/17 15:33
 */
public class Solution110 {

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int right = 0;
        int left = 0;
        return dfs(root,left,right);
    }

    private boolean dfs(TreeNode root, int left, int right) {
        if (Math.abs(left - right) > 2) {
            return false;
        }
        if (root.left != null) {
            dfs(root.left, left + 1, right);
        }
        if (root.right != null) {
            dfs(root.right, left, right + 1);
        }
        return Math.abs(left - right) < 2;
    }
}
