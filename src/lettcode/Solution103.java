package lettcode;

import utils.TreeNode;

import java.util.*;
import java.util.stream.Stream;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/8/9 21:43
 */
public class Solution103 {

    public static void main(String[] args) {
        Stream.of(zigzagLevelOrder(TreeNode.getInstance())).forEach(System.out::println);
    }

//    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//        List<List<Integer>> res = new ArrayList<>();
//        Deque<TreeNode> deque = new LinkedList<>();
//        boolean flag = true;
//        if (root != null) {
//            deque.offerLast(root);
//        }
//        while (!deque.isEmpty()) {
//            int n = deque.size();
//            List<Integer> list = new ArrayList<>();
//            Deque<TreeNode> tempQuene = new LinkedList<>();
//            for (int i = 0; i < n; i++) {
//                TreeNode pollNode = null;
//                if (!flag) {
//                    pollNode = deque.pollLast();
//
//                } else {
//                    pollNode = deque.pollFirst();
//                }
//                tempQuene.offer(pollNode);
//                list.add(pollNode.val);
//            }
//            n = tempQuene.size();
//            for (int i = 0; i < n; i++) {
//                TreeNode pollNode = null;
//                if (flag)
//                    pollNode = tempQuene.pollFirst();
//                else
//                    pollNode = tempQuene.pollLast();
//                if (pollNode.left != null) {
//                    deque.offerLast(pollNode.left);
//                }
//                if (pollNode.right != null) {
//                    deque.offerLast(pollNode.right);
//                }
//            }
//            res.add(list);
//            flag = !flag;
//
//        }
//        return res;
//    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<TreeNode> deque = new LinkedList<>();
        if (root == null)
            return res;
        else
            deque.offerLast(root);
        while (deque.size() > 0) {
            int n = deque.size();
            List<Integer> list = new ArrayList<>();
            TreeNode node;
            for (int i = 0; i < n; i++) {
                if (res.size() % 2 == 1) {
                    node = deque.pollFirst();
                    if (node.right != null) {
                        deque.offerLast(node.right);
                    }
                    if (node.left != null) {
                        deque.offerLast(node.left);
                    }

                } else {
                    node = deque.pollLast();
                    if (node.left != null) {
                        deque.offerFirst(node.left);
                    }
                    if (node.right != null) {
                        deque.offerFirst(node.right);
                    }
                }
                list.add(node.val);
            }
            res.add(list);
        }
        return res;
    }
}
