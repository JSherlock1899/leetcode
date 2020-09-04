package lettcode;

import qiuzhao.qianxin.Solution;
import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: sherlock
 * @description:二叉树的所有路径
 * @date: 2020/9/4 9:09
 */
public class Solution257 {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        dfs(root, res, "");
        return res;
    }

    private void dfs(TreeNode root, List<String> res, String s) {
        if (root == null) return;
        StringBuilder path = new StringBuilder(s);
        path.append(root.val);
        if (root.left == null && root.right == null) {
            res.add(path.toString());
        } else {
            path.append("->");
            dfs(root.left, res, path.toString());
            dfs(root.right, res, path.toString());
        }
    }


    public static void main(String[] args) {

    }
}
