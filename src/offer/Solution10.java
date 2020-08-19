package offer;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/8/19 16:13
 */
public class Solution10 {

    public static int fib(int n) {
        if(n<2)return n;
        return f(n,new int[n+1]);
    }

    public static int f(int n,int[] dp) {
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(fib(48));
    }
}
