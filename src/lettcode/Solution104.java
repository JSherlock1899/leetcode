package lettcode;

import utils.TreeNode;

import java.util.stream.Stream;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/8/9 21:41
 */
public class Solution104 {

    public static void main(String[] args) {
        Stream.of(maxDepth(TreeNode.getInstance())).forEach(System.out::println);
    }

    public static int maxDepth(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
