package lettcode;

import java.util.Arrays;

/**
 * @author: sherlock
 * @description:不同路径，dp，一种分治的思想，找到走到当前所在点的路径数，依次递推到终点
 * ==========================================================================================================
 * 二刷了，这一次学了一下滚动数组的思想，把空间复杂度降到了O(n)。因为我们只需要dp[i][j-1]和dp[i-1][j]这两个数即可
 * 空间是可以复用的。cur[j - 1]代表着原来的dp[i][j-1]，而cur[j]就代表着dp[i-1][j]，因为cur[j]存着的是上一次循环
 * 到这一列的值。
 * @date: 2020/8/19 18:09
 */
public class Solution62 {

//    public static int uniquePaths(int m, int n) {
//        int[][] dp = new int[m][n];
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i == 0 || j == 0) {
//                    dp[i][j] = 1;
//                } else {
//                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
//                }
//            }
//        }
//        return dp[m - 1][n - 1];
//    }

    public static int uniquePaths(int m, int n) {
        int[] cur = new int[n];
        Arrays.fill(cur, 1);
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                cur[j] += cur[j - 1];
            }
        }
        return cur[n - 1];
    }



    public static void main(String[] args) {
        System.out.println(uniquePaths(7, 3));
    }
}
