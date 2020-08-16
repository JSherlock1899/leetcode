package lettcode;

import utils.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/8/12 21:45
 */
public class Solution133 {

    public Node cloneGraph(Node node) {
        Map<Node, Node> records = new HashMap<>();
        return dfs(node, records);

    }

    private Node dfs(Node node, Map<Node, Node> records) {
        if (node == null) {
            return null;
        }
        if (records.containsKey(node)) {
            return records.get(node);
        }
        Node clone = new Node(node.val, new ArrayList<>());
        records.put(node, clone);
        for (Node n : node.neighbors) {
            clone.neighbors.add(dfs(n, records));
        }
        return clone;
    }
}
