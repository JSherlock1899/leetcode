package offer;

import utils.TreeNode;

/**
 * @author: sherlock
 * @description:二叉搜索树的第k大节点，二叉搜索树的中序遍历就是一个递增序列 。
 * 注意是第K大，所以右根左；第K小才是左根右
 * @date: 2020/8/31 18:25
 */
public class Solution54 {

    int res, k;
    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return res;
    }
    void dfs(TreeNode root) {
        if(root == null) return;
        dfs(root.right);
        if (--k == 0) {
            res = root.val;
            return;
        }
        dfs(root.left);
    }


}
