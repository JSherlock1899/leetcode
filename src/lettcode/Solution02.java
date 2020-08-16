package lettcode;

import utils.ListNode;

/**
 * @author: sherlock
 * @descril1tion:
 * @date: 2020/5/21 20:48
 */

public class Solution02 {
    public  static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(0);
        ListNode p = l1,q = l2,curr = dummyNode;
        int carry = 0;
        while (p != null || q != null) {
            int x = p != null ? p.val : 0;
            int y = q != null ? q.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p!=null)p = p.next;
            if (q!=null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(1);
        }
        return dummyNode.next;
    }




    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(2);
        listNode1.next = new ListNode(4);
        listNode1.next.next = new ListNode(3);
        ListNode listNode2 = new ListNode(5);
        listNode2.next = new ListNode(6);
        listNode2.next.next = new ListNode(4);
        ListNode listNode = addTwoNumbers(listNode1, listNode2);
        System.out.println(listNode.val);
        System.out.println(listNode.next.val);
        System.out.println(listNode.next.next.val);


    }
}
