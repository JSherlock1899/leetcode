package lettcode;

import utils.ListNode;
import utils.TreeNode;

/**
 * @author: sherlock
 * @description:有序链表转换二叉搜索树 通过快慢指针找到每一层链表的中点，dfs构建二叉搜索树
 * @date: 2020/8/9 23:57
 */
public class Solution109 {
//转化为数组的做法，这样就转化成了Solution108
//    public TreeNode sortedListToBST(ListNode head) {
//        if (head == null) {
//            return null;
//        }
//        ListNode[] arr = transformArray(head);
//        TreeNode root = dfs(arr, 0, arr.length - 1);
//        return root;
//    }
//
//    private TreeNode dfs(ListNode[] arr, int low, int high) {
//        if (low > high) {
//            return null;
//        }
//        int mid = low + (high - low) / 2;
//        TreeNode root = new TreeNode(arr[mid].val);
//        root.left = dfs(arr, low, mid - 1);
//        root.right = dfs(arr, mid + 1, high);
//        return root;
//    }
//
//    private static ListNode[] transformArray(ListNode head) {
//        ListNode temp = head;
//        int length = 1;
//        while (temp.next != null) {
//            temp = temp.next;
//            length++;
//        }
//        ListNode[] arr = new ListNode[length];
//        arr[0] = head;
//        for (int i = 1; i < length; i++) {
//            arr[i] = head.next;
//            head = head.next;
//        }
//        return arr;
//    }

//    public static void main(String[] args) {
//        ListNode[] arr = transformArray(ListNode.getInstance());
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i].val);
//        }
//    }
    public static TreeNode sortedListToBST(ListNode head) {
        return dfs(head);
    }

    private static TreeNode dfs(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode preNode = null;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            preNode = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        TreeNode root = new TreeNode(slow.val);
        if (preNode != head) {//也就是说中点slow不是head，需要构建左子树
            preNode.next = null;
            root.left = dfs(head);
        }
        root.right = dfs(slow.next);
        return root;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(-10);
        l1.next = new ListNode(-3);
        l1.next.next = new ListNode(0);
        l1.next.next.next = new ListNode(5);
        l1.next.next.next.next = new ListNode(9);
        System.out.println(sortedListToBST(l1).val);

    }

}
