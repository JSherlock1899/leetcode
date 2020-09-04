package lettcode;

/**
 * @author: sherlock
 * @description: 爬楼梯 在每一阶楼梯上都有两个选择，走一阶楼梯和两阶楼梯，所以问题转化为了斐波那契数列
 * @date: 2020/8/11 17:40
 */
public class Solution70 {

    public static void main(String[] args) {
        System.out.println(climb_Stairs(45));
    }

    public static long climb_Stairs(int n) {
        if (n == 0 ) return 0;
        long[] dp = new long[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }


}
