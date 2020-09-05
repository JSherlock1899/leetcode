package offer;

/**
 * @author: sherlock
 * @description:丑数，丑数只包含因子 2, 3, 52,3,5 ，因此有 “丑数 == 某较小丑数 × 某因子”
 * @date: 2020/9/4 23:13
 */
public class Solution49 {

    public static int nthUglyNumber(int n) {
        int a = 0;
        int b = 0;
        int c = 0;
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            int n2 = dp[a] * 2;
            int n3 = dp[b] * 3;
            int n5 = dp[c] * 5;
            dp[i] = Math.min(n2, Math.min(n3, n5));
            if (n2 == dp[i]) a++;
            if (n3 == dp[i]) b++;
            if (n5 == dp[i]) c++;
        }
        return dp[n - 1];
    }


    public static void main(String[] args) {
        System.out.println(nthUglyNumber(10));
    }
}
