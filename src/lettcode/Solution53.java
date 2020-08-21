package lettcode;

/**
 * @author: sherlock
 * @description:最大子序和，DP，每个位置都找到当前点往下走的最大子序列和，这个最大子序列和要不就是前一个位置的最大
 * 子序列和 以及 这个位置 中的较大者  ==============>  最大子序列和 = 当前元素自身 或者
 * 当前元素自身 + 前一个位置的最大子序列和 dp[i] = max(nums[i], dp[i-1] + nums[i])
 * @date: 2020/8/21 19:53
 */
public class Solution53 {

    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        if (n==0) return 0;
        int[] dp = new int[n];
        dp[0] = nums[0];
        int res = dp[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(nums[i], nums[i] + dp[i - 1]);
            res = Math.max(res, dp[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
