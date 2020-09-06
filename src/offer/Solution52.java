package offer;

import utils.ListNode;

/**
 * @author: sherlock
 * @description:两个链表的第一个公共节点，走过你走过的路，浪漫相遇啊。。。
 * 你变成我，走过我走过的路。
 * 我变成你，走过你走过的路。
 * 然后我们便相遇了..
 * 秀。。。
 * @date: 2020/9/6 15:44
 */
public class Solution52 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1 = headA;
        ListNode l2 = headB;
        while (l1 != l2) {
            l1 = l1 == null ? headB : l1.next;
            l2 = l2 == null ? headA : l2.next;
        }
        return l1;
    }

}
