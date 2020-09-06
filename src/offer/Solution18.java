package offer;

import utils.ListNode;

/**
 * @author: sherlock
 * @description: 删除链表的节点，迭代 + 递归
 * @date: 2020/9/6 15:21
 */
public class Solution18 {

//    public static ListNode deleteNode(ListNode head, int val) {
//        ListNode dummy = new ListNode(-1);
//        dummy.next = head;
//        ListNode pre = dummy;
//        ListNode cur = head;
//        while (cur != null) {
//            if (cur.val == val) {
//                pre.next = cur.next;
//                break;
//            }
//            pre = pre.next;
//            cur = cur.next;
//        }
//        return dummy.next;
//    }


    public static ListNode deleteNode(ListNode head, int val) {
        if (head == null) return null;
        if (head.val == val) return head.next;
        head.next = deleteNode(head.next, val);
        return head;
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        ListNode listNode = deleteNode(l1, 2);
        System.out.println(listNode.val);
        System.out.println(listNode.next.val);
        System.out.println(listNode.next.next.val);
    }
}
