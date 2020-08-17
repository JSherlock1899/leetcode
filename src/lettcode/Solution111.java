package lettcode;

import javafx.util.Pair;
import utils.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author: sherlock
 * @description:二叉树的最小深度 BFS 每到一个节点都判断是否既没有左子树也没有右子树，如果是，就直接返回此时的深度
 * 如果不是，就将它存在的子树加入队列，重复上述操作。
 * @date: 2020/8/16 19:21
 */
public class Solution111 {

    public static int minDepth(TreeNode root) {
        Queue<Pair<TreeNode, Integer>> queue = new LinkedList<>();
        if (root == null) {
            return 0;
        } else {
            queue.add(new Pair<>(root, 1));
        }
        int currentDepth = 0;
        while (!queue.isEmpty()) {
            Pair<TreeNode, Integer> pollNode = queue.poll();
            currentDepth = pollNode.getValue();
            root = pollNode.getKey();
            if (root.left == null && root.right == null) {
                break;
            }
            if (root.left != null) {
                queue.offer(new Pair<>(root.left, currentDepth + 1));
            }
            if (root.right != null) {
                queue.offer(new Pair<>(root.right, currentDepth + 1));
            }
        }
        return currentDepth;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        System.out.println(minDepth(root));
    }
}
