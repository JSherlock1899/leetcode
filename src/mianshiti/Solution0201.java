package mianshiti;

import utils.ListNode;

import java.util.HashSet;

/**
 * @author: sherlock
 * @description:移除重复节点，双指针 + 哈希表
 * @date: 2020/9/7 8:31
 */
public class Solution0201 {

    public static ListNode removeDuplicateNodes(ListNode head) {
        ListNode p = head;
        ListNode prev = new ListNode(-1);
        prev.next = head;
        HashSet<Integer> set = new HashSet<>();
        while (p != null) {
            if (set.contains(p.val)) {
                prev.next = p.next;
            } else {
                set.add(p.val);
                prev = prev.next;
            }
            p = p.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(3);
        ListNode l5 = new ListNode(2);
        ListNode l6 = new ListNode(1);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        ListNode node = removeDuplicateNodes(l1);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
