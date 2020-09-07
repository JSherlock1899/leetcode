package mianshiti;

import utils.ListNode;

/**
 * @author: sherlock
 * @description:返回倒数第 k 个节点，快慢指针
 * @date: 2020/9/7 8:38
 */
public class Solution0202 {

    public static int kthToLast(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        while (k > 0) {
            fast = fast.next;
            k--;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow.val;
    }


}
