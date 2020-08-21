package lettcode;

import java.util.Arrays;

/**
 * @author: sherlock
 * @description:零钱兑换，DP，
 * @date: 2020/8/21 21:04
 */
public class Solution322 {

    public static int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, 100);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < n; j++) {
                if (i - coins[j] >= 0) {
                    if (dp[i - coins[j]] != 0) {
                        dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                    } else {
                        dp[i] = 0;
                    }
                }
            }
        }
        return dp[amount];
    }

    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{1, 2, 5}, 11));
        System.out.println(coinChange(new int[]{2}, 11));
    }
}
