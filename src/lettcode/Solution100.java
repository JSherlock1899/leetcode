package lettcode;

import utils.TreeNode;

/**
 * @author: sherlock
 * @description:相同的树 当两树遍历到的结点都为null时返回true，只有一棵为null则必不是相同的树，在比较当前遍历结点的值是否相等，
 *继续遍历当前结点的左右结点
 * @date: 2020/8/14 18:43
 */
public class Solution100 {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        } else if (p.val != q.val) {
            return false;
        }else {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }


}
