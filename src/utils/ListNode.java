package utils;

import java.util.List;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/8/9 23:29
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
    val = x;
    }

    public static ListNode getInstance() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        return head;
    }


}
