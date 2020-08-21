package lettcode;

/**
 * @author: sherlock
 * @description:使用最小花费爬楼梯，dp，算出走到每一阶台阶的最小花费，依次递推。
 * @date: 2020/8/21 22:47
 */
public class Solution746 {

    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i <= n; i++) {
            if (i == n) {
                dp[i] = Math.min(dp[i - 2], dp[i - 1]);
                break;
            }
            dp[i] = Math.min(dp[i - 2] + cost[i], dp[i - 1] + cost[i]);
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
        System.out.println(minCostClimbingStairs(new int[]{0,0,0,1}));
        System.out.println(minCostClimbingStairs(new int[]{0,0,1,0}));
    }
}
