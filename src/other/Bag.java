package other;

/**
 * @author: sherlock
 * @description:背包问题
 * @date: 2020/8/27 8:50
 */
public class Bag {


    public static int calcBagMaxVal(int W, int N, int[] wt, int[] val) {
        int[][] dp = new int[N + 1][W + 1];
        for (int i = 0; i < W; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i < N; i++) {
            dp[0][i] = 0;
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= W; j++) {
                if (j - wt[ i - 1] < 0) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - wt[i - 1]] + val[i - 1]);
                }
            }
        }
        return dp[W][N];
    }

    public static void main(String[] args) {
        System.out.println(calcBagMaxVal(3, 4, new int[]{2, 1, 3}, new int[]{4, 2, 3}));
    }
}
