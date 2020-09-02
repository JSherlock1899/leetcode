package lettcode;

import java.util.Arrays;

/**
 * @author: sherlock
 * @description:零钱兑换，经典DP，求出从0 —— amount中间每一个所需的最少的硬币个数。那么如果dp[i - coins[j]]是
 * 存在的话，dp[i] = dp[i - coins[j]] + 1 即可
 * @date: 2020/8/21 21:04
 */
public class Solution322 {

    public static int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new  int[n + 1][amount + 1];
        // base case
        for (int i = 0; i <= n; i++)
            dp[i][0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= amount; j++) {
                if (i - coins[j-1] >= 0) {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][i - coins[j-1]] + 1);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][amount];
    }

    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{1, 2, 5}, 11));
        System.out.println(coinChange(new int[]{3}, 11111));
    }
}
