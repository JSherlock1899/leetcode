package lettcode;

import utils.ListNode;

/**
 * @author: sherlock
 * @description:删除链表的倒数第N个节点，
 * @date: 2020/9/4 13:41
 */
public class Solution19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = head;
        int length = 0;
        while (first != null) {
            first = first.next;
            length++;
        }
        length -= n;
        first = dummy;
        while (length > 0) {
            first = first.next;
            length--;
        }
        first.next = first.next.next;
        return dummy.next;
    }


}
