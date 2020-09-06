package lettcode;

import utils.ListNode;

/**
 * @author: sherlock
 * @description:合并两个有序链表，迭代、递归两种解法
 * @date: 2020/9/6 14:52
 */
public class Solution21 {

//    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode preHead = new ListNode(-1);
//        ListNode prev = preHead;
//        while (l1 != null && l2 != null) {
//            if (l1.val <= l2.val) {
//                prev.next = l1;
//                l1 = l1.next;
//            } else {
//                prev.next = l2;
//                l2 = l2.next;
//            }
//            prev = prev.next;
//        }
//        prev.next = l1 == null ? l2 : l1;
//        return preHead.next;
//    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val <= l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }

}
