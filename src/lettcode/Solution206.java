package lettcode;

import utils.ListNode;

/**
 * @author: sherlock
 * @description:反转链表，同剑指24
 * @date: 2020/9/7 8:04
 */
public class Solution206 {

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
