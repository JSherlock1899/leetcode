package lettcode;

import utils.TreeNode;

import java.util.*;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/8/14 18:27
 */
public class Solution107 {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList();
        List<List<Integer>> res = new ArrayList<>();
        Stack<List<Integer>> stack = new Stack<>();
        if (root == null) return res;
        queue.offer(root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNode pollNode = queue.poll();
                temp.add(pollNode.val);
                if (pollNode.left != null) {
                    queue.offer(pollNode.left);
                }
                if (pollNode.right != null) {
                    queue.offer(pollNode.right);
                }
            }
            stack.add(temp);
        }
        while (!stack.isEmpty()) {
            res.add(stack.pop());
        }
        return res;
    }


}
