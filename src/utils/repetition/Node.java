package utils.repetition;

import utils.repetition.Node;

import java.util.List;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/8/21 21:44
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<utils.repetition.Node> _children) {
        val = _val;
        children = _children;
    }
};
