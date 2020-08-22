package lettcode;

/**
 * @author: sherlock
 * @description:最长重复子数组，DP，其实这类最长子序列的题目做法都差不多。就从后面开始找起。若两数组的最后一个元素
 * 不相等，那不用说了，公共子数组肯定不包括他俩。若是相等，那么就把最后一个元素都去掉，看前面的数组能给他们提供多长的
 * 子序列。
 * @date: 2020/8/19 22:24
 */
public class Solution718 {

    public static int findLength(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        int[][] dp = new int[m + 1][n + 1];
        int ans = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = A[i - 1] == B[j - 1] ? dp[i - 1][j - 1] + 1 : 0;
                ans = Math.max(ans, dp[i][j]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(findLength(new int[]{1, 2, 3, 2, 1}, new int[]{3, 2, 1, 4, 7}));
    }
}
