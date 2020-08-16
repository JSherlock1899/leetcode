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
        if (root != null) {
            queue.offer(root);
        }
        Stack<List<Integer>> stack = new Stack<>();
        while (!queue.isEmpty()) {
            int n = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNode pollNode = queue.poll();
                list.add(pollNode.val);
                if (pollNode.left != null) {
                    queue.offer(pollNode.left);
                }
                if (pollNode.right != null) {
                    queue.offer(pollNode.right);
                }
            }
            stack.add(list);
        }
        List<List<Integer>> res = new ArrayList<>();
        while (!stack.isEmpty()) {
            res.add(stack.pop());
        }
        return res;
    }
}
