package dp;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/8/19 15:31
 */
public class Fib {

//    public static int fib(int n) {
//        return n <= 1 ? n : fib(n - 1) + fib(n - 2);
//    }

//    public static int fib(int n,int[] memo) {
//        if (n<=1) return n;
//        if (memo[n] == 0) {
//            memo[n] = fib(n - 1, memo) + fib(n - 2, memo);
//        }
//        return memo[n];
//    }

    public static int fib(int n,int[] dp) {
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(fib(10,new int[11]));
    }
}
