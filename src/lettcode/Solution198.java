package lettcode;

/**
 * @author: sherlock
 * @description:打家劫舍，这里因为你不知道前面的房子有没有偷，因此一维的DP已经无法解决了，要多加一维来表示有没有偷当前
 * 这个房子。dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]) 代表第i个房子我不偷，那么到第i个房子为止，可能偷到的最大值就是
 * Math.max(dp[i-1][0],dp[i-1][1]); dp[i][1] = dp[i-1][0] + nums[i] 代表第i个房子我偷，那么第i-1个房子我肯定不能偷，
 * 再加上自身即可。
 * ==============================================================================================================
 * 那么能否用一维数组解决这个问题呢？是可以的。如果房子数大于2，那么
 * 1） 如果偷第k个房子，那么能偷到的最大值就是dp[k-2] + nums[k]
 * 2) 如果不偷第k个房子，那么能偷到的最大值就是dp[k-1]
 * @date: 2020/8/22 20:13
 */
public class Solution198 {

//    public static int rob(int[] nums) {
//        if (nums == null || nums.length == 0) return 0;
//        int n = nums.length;
//        int[][] dp = new int[n][2];
//        dp[0][0] = 0;
//        dp[0][1] = nums[0];
//        for (int i = 1; i < n; i++) {
//            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]);
//            dp[i][1] = dp[i-1][0] + nums[i];
//        }
//        return Math.max(dp[n - 1][0], dp[n - 1][1]);
//    }

    public static void main(String[] args) {
        System.out.println(rob(new int[]{1, 2, 3, 1}));
        System.out.println(rob(new int[]{2, 7, 9, 3, 1}));
        System.out.println(rob(new int[]{2, 1, 1, 2}));
    }

    public static int rob(int[] nums) {
        int n = nums.length;
        int x = 0;
        int y = 0;
        int res = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            res = Math.max(x, y + nums[i]);
            y = x;
            x = res;
        }
        return res;
    }
}
