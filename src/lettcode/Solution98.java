package lettcode;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: sherlock
 * @description:验证二叉搜索树，二叉搜索树中序遍历即为递增序列
 * @date: 2020/9/2 12:40
 */
public class Solution98 {

    public static boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        List<Integer> res = new ArrayList<>();
        dfs(root, res);
        for (int i = 1; i < res.size(); i++) {
            if (res.get(i) <= res.get(i-1)) return false;
        }
        return true;
    }

    private static void dfs(TreeNode root, List<Integer> res) {
        if (root.left != null) {
            dfs(root.left,res);
        }
        res.add(root.val);
        if (root.right != null) {
            dfs(root.right,res);
        }
    }

    public static void main(String[] args) {

    }
}
