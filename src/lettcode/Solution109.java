package lettcode;

import utils.ListNode;
import utils.TreeNode;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/8/9 23:57
 */
public class Solution109 {

    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode[] arr = transformArray(head);
        TreeNode root = dfs(arr, 0, arr.length - 1);
        return root;
    }

    private TreeNode dfs(ListNode[] arr, int low, int high) {
        if (low > high) {
            return null;
        }
        int mid = low + (high - low) / 2;
        TreeNode root = new TreeNode(arr[mid].val);
        root.left = dfs(arr, low, mid - 1);
        root.right = dfs(arr, mid + 1, high);
        return root;
    }

    private static ListNode[] transformArray(ListNode head) {
        ListNode temp = head;
        int length = 1;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }
        ListNode[] arr = new ListNode[length];
        arr[0] = head;
        for (int i = 1; i < length; i++) {
            arr[i] = head.next;
            head = head.next;
        }
        return arr;
    }

//    public static void main(String[] args) {
//        ListNode[] arr = transformArray(ListNode.getInstance());
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i].val);
//        }
//    }
}
