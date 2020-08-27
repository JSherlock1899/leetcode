package lettcode;

/**
 * @author: sherlock
 * @description:删除排序数组中的重复项，快慢指针
 * @date: 2020/8/27 7:49
 */
public class Solution26 {

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int slow = 0;
        int fast = 0;
        int fastNum = Integer.MIN_VALUE;
        while (slow < nums.length && fast < nums.length) {
            if (nums[fast] != fastNum) {
                nums[slow] = nums[fast];
                fastNum = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 2}));
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }

}
