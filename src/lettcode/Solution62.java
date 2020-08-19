package lettcode;

/**
 * @author: sherlock
 * @description:不同路径，dp，一种分治的思想，找到走到当前所在点的路径数，依次递推到终点
 * @date: 2020/8/19 18:09
 */
public class Solution62 {

    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[m - 1][n - 1];
    }



    public static void main(String[] args) {
        System.out.println(uniquePaths(7, 3));
    }
}
