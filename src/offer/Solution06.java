package offer;

import utils.ListNode;

import java.util.Stack;

/**
 * @author: sherlock
 * @description:从尾到头打印链表，使用栈，很常规
 * @date: 2020/9/4 22:41
 */
public class Solution06 {

    public static int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        int count = 0;
        while (head != null) {
            stack.push(head);
            head = head.next;
            count++;
        }
        int[] res = new int[count];
        int index = 0;
        while (!stack.isEmpty()) {
            res[index++] = stack.pop().val;
        }
        return res;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(2);
        l1.next = l2;
        l2.next = l3;
        int[] ints = reversePrint(l1);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
