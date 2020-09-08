package lettcode;

/**
 * @author: sherlock
 * @description:买卖股票的最佳时机 IV
 * @date: 2020/9/8 15:24
 */
public class Solution188 {

    public static void main(String[] args) {
        System.out.println(maxProfit(2, new int[]{3, 2, 6, 5, 0, 3}));
        System.out.println(maxProfit(2, new int[]{2,4,1}));
    }

    public static int maxProfit(int k, int[] prices) {
        int n = prices.length;
        int[][][] dp = new int[n][k][2];
        dp[0][0][0] = 0;
        dp[0][0][1] = -prices[0];

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < k; j++) {
                    dp[i][j][0] = Math.max(dp[i - 1][j][0], dp[i - 1][j][1] + prices[i]);
                    dp[i][j][1] = Math.max(dp[i - 1][j][1], dp[i - 1][j - 1][0] - prices[i]);
            }
        }
        return dp[n - 1][k-1][0];
    }

}
