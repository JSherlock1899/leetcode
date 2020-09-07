package mianshiti;

import utils.ListNode;

/**
 * @author: sherlock
 * @description:删除中间节点，狸猫换太子？？有点小晕
 * @date: 2020/9/7 8:41
 */
public class Solution0203 {

//    public static void deleteNode(ListNode node) {
//        int count = 0;
//        ListNode p = node;
//        while (p != null) {
//            p = p.next;
//            count++;
//        }
//        int mid = count / 2;
//        p = node;
//        ListNode pre = new ListNode(-1);
//        pre.next = node;
//        while (mid > 1) {
//            p = p.next;
//            pre = pre.next;
//            mid--;
//        }
//        pre.next = p.next;
//    }

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(4);
        ListNode l2 = new ListNode(5);
        ListNode l3 = new ListNode(1);
        ListNode l4 = new ListNode(9);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        deleteNode(l1);
        while (l1 != null) {
            System.out.println(l1.val);
            l1 = l1.next;
        }
    }
}
