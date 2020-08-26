package lettcode;

/**
 * @author: sherlock
 * @description:编辑距离，dp，写的有点晕，再看题解吧。。。
 * @date: 2020/8/26 23:49
 */
public class Solution72 {

    public static int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        if (n*m==0) return n + m;
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i < n; i++) {
            dp[i][0] = i;
        }
        for (int i = 0; i < m; i++) {
            dp[0][i] = i;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                int left = dp[i - 1][j] + 1;
                int down = dp[i][j - 1] + 1;
                int left_down = dp[i - 1][j - 1];
                if (word1.charAt(i - 1) != word2.charAt(j - 1)) left_down++;
                dp[i][j] = Math.min(left, Math.min(down, left_down));
            }
        }
        return dp[n][m];
    }




    public static void main(String[] args) {
        System.out.println(minDistance("horse", "ros"));
        System.out.println(minDistance("intention", "execution"));
    }
}
