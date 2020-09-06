package offer;

import utils.ListNode;

/**
 * @author: sherlock
 * @description:反转链表，用next来保存node的下一个结点以防止丢失，直接把node指向pre，完成这两个结点的反转，再把
 * pre和node都向前移一个结点，即可完成反转链表。
 * @date: 2020/9/6 16:10
 */
public class Solution24 {

    public static ListNode reverse(ListNode node) {
        if (node == null || node.next == null) {
            return node;
        } else {
            ListNode headNode = reverse(node.next);
            node.next.next = node;
            node.next = null;
            return headNode;
        }
    }

    public static ListNode reverseList(ListNode node) {
        ListNode pre = null;
        ListNode next = null;
        while (node != null) {
            next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
        return pre;
    }

}
