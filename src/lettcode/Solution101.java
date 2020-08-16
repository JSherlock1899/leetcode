package lettcode;

import utils.TreeNode;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/8/9 22:45
 */
public class Solution101 {

//    public boolean isSymmetric(TreeNode root) {
//        return check(root, root);
//    }
//
//    private boolean check(TreeNode u, TreeNode v) {
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(u);
//        queue.offer(v);
//        while (!queue.isEmpty()) {
//            u = queue.poll();
//            v = queue.poll();
//            if (u == null && v == null) {
//                continue;
//            }
//
//            if ((u == null || v == null) || (u.val != v.val)) {
//                return false;
//            }
//            queue.offer(u.left);
//            queue.offer(v.right);
//            queue.offer(u.right);
//            queue.offer(v.left);
//        }
//        return true;
//    }

    //dfs
    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    private boolean check(TreeNode u, TreeNode v) {
        if (u == null && v == null) {
            return true;
        }
        if ((u == null || v == null) && (u != null && v != null)) {
            return false;
        }
        return u.val == v.val && check(u.left, v.right) && check(u.right, v.left);
    }
}
