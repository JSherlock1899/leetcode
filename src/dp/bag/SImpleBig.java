package dp.bag;

import java.util.Scanner;

/**
 * @author: sherlock
 * @description:0 - 1背包
 * @date: 2020/9/1 21:42
 */
public class SImpleBig {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int[] wt = new int[N];
        int[] val = new int[N];
        for (int i = 0; i < N; i++) {
            wt[i] = sc.nextInt();
            val[i] = sc.nextInt();
        }
        int[][] dp = new int[N + 1][W + 1];
        for (int i = 0; i < N; i++) {
            dp[0][i] = 0;
        }
        for (int i = 0; i < W; i++) {
            dp[i][0] = 0;
        }
        for (int i = 1; i <= N ; i++) {
            for (int j = 1; j <= W; j++) {
                if (j - wt[i - 1] >= 0) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - wt[i - 1]] + val[i-1]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        System.out.println(dp[N][W]);
    }
}
