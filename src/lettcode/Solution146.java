package lettcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: sherlock
 * @description:LRU算法，最近最少使用，双向链表 + 哈希表，在操作链表的时候先动node（addToHead方法）
 * @date: 2020/8/30 14:17
 */
public class Solution146 {

    class DLinkedNode{
        int key;
        int value;
        DLinkedNode prev;
        DLinkedNode next;

        public DLinkedNode() {
        }

        public DLinkedNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    class LRUCache{
        Map<Integer, DLinkedNode> cache = new HashMap<>();
        int capacity;
        int size;
        DLinkedNode head;
        DLinkedNode tail;

        public LRUCache(int capacity) {
            this.size = 0;
            this.capacity = capacity;
            head = new DLinkedNode();
            tail = new DLinkedNode();
            head.next = tail;
            tail.prev = head;
        }

        public int get(int key) {
            DLinkedNode node = cache.get(key);
            if (node == null) {
                return -1;
            }
            moveToHead(node);
            return node.value;
        }

        public void put(int key, int value) {
            DLinkedNode node = cache.get(key);
            if (node == null) {
                node = new DLinkedNode(key, value);
                cache.put(key, node);
                addToHead(node);
                ++size;
                if (size > capacity) {
                    DLinkedNode res = removeTail();
                    cache.remove(res.key);
                    --size;
                }
            } else {
                node.value = value;
                moveToHead(node);
            }
        }

        public void addToHead(DLinkedNode node) {
            node.next = head.next;
            node.prev = head;
            head.next.prev = node;
            head.next = node;
        }

        public void removeNode(DLinkedNode node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }

        public void moveToHead(DLinkedNode node) {
            removeNode(node);
            addToHead(node);
        }

        public DLinkedNode removeTail() {
            DLinkedNode res = tail.prev;
            removeNode(res);
            return res;
        }
    }


}
