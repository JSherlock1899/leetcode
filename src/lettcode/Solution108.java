package lettcode;

import utils.TreeNode;

/**
 * @author: sherlock
 * @description:DFS, 找到每一次有序数组的中点，中点的值就是这一层TreeNode的val值
 * @date: 2020/8/9 23:43
 */
public class Solution108 {

    public static TreeNode sortedArrayToBST(int[] nums) {
        return dfs(nums, 0, nums.length - 1);
    }

    private static TreeNode dfs(int[] nums, int low, int high) {
        if (low > high) {
            return null;
        }
        int mid = low + (high - low) / 2;
        //关键
        TreeNode root = new TreeNode(nums[mid]);
        root.left = dfs(nums, low, mid - 1);
        root.right = dfs(nums, mid + 1, high);
        return root;
    }

    public static void main(String[] args) {
        System.out.println(sortedArrayToBST(new int[]{-10, -3, 0, 5, 9}).val);
    }
}
