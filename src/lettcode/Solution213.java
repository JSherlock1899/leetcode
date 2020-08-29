package lettcode;

/**
 * @author: sherlock
 * @description:打家劫舍2，DP,
 * @date: 2020/8/22 20:36
 */
public class Solution213 {

    public static int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        return Math.max(robRange(nums, 0, n - 2),
                robRange(nums, 1, n - 1));
    }

    // 仅计算闭区间 [start,end] 的最优结果
    static int robRange(int[] nums, int start, int end) {
        int x = 0;
        int y = 0;
        int res = 0;
        for (int i = end; i >= start ; i--) {
            res = Math.max(x, y + nums[i]);
            y = x;
            x = res;
        }
        return res;
    }





    public static void main(String[] args) {
        System.out.println(rob(new int[]{1, 2, 3, 1}));
        System.out.println(rob(new int[]{2, 3, 3}));
    }
}
