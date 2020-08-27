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
        if (coins == null || coins.length == 0 || amount == 0) return 0;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i >= coins[j]) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{1, 2, 5}, 11));
        System.out.println(coinChange(new int[]{3}, 11111));
    }
}
