package lettcode;

/**
 * @author: sherlock
 * @description:最长公共子序列 dp，从字符串的最后面开始进行比较，如果两个字符串的最后一个字符不相等，那么他们的最长公共
 * 子序列一定是（s1去掉最后一个字符和s2的lcs）以及（s1和s2去掉最后一个字符的lcs），这两个之间的最大值。若是相等，那么
 * 就可以把s1和s2两个字符串的最后一个字符都去掉，再比较剩下的字符串的lcs，结果加上1即可。将每一次比较的结果建立DP状态表。
 * @date: 2020/8/19 21:45
 */
public class Solution1143 {

    public static int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                    continue;
                }
                if (text1.charAt(i-1) == text2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {

        System.out.println(longestCommonSubsequence("", "BACBAD"));
        System.out.println(longestCommonSubsequence("ABAZDC", "BACBAD"));
        System.out.println(longestCommonSubsequence("abcde", "ace"));
        System.out.println(longestCommonSubsequence("abc", "abc"));
        System.out.println(longestCommonSubsequence("abc", "def"));
        System.out.println(longestCommonSubsequence("bl", "yby"));


    }

}
