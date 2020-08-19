package lettcode;

/**
 * @author: sherlock
 * @description:不同路径2，DP，和不同路径差不多，只是加了条件的判断
 * @date: 2020/8/19 18:29
 */
public class Solution63 {

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if (m <= 0 || n<=0 || obstacleGrid[0][0] ==1 ) return 0;
        int[][] dp = new int[m][n];
        dp[0][0] = 1;

        for (int i = 1; i < m; i++) {
            dp[i][0] = (obstacleGrid[i][0] != 1 & dp[i - 1][0] == 1) ? 1 : 0;
        }
        for (int i = 1; i < n; i++) {
            dp[0][i] = (obstacleGrid[0][i] != 1 & dp[0][i - 1] == 1) ? 1 : 0;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        System.out.println(uniquePathsWithObstacles(new int[][]{{0,0,0,0},{0,1,0,0},{0,0,0,0},{0,0,1,0},{0,0,0,0}}));
    }
}
