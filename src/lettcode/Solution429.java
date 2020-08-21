package lettcode;

import utils.repetition.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: sherlock
 * @description:N叉树的层序遍历，BFS，用addAll来进行优化
 * @date: 2020/8/21 21:59
 */
public class Solution429 {

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root==null) return res;
        List<Node> preList = Arrays.asList(root);
        while (!preList.isEmpty()) {
            List<Integer> preVals = new ArrayList<>();
            List<Node> currentNodeList = new LinkedList<>();
            for (Node node : preList) {
                preVals.add(node.val);
                currentNodeList.addAll(node.children);
            }
            res.add(preVals);
            preList = currentNodeList;
        }
        return res;
    }


}
