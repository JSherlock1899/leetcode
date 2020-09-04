package other;

/**
 * @author: sherlock
 * @description:变态跳台阶 Fib(n) = 2*Fib(n-1) n >= 2
 * @date: 2020/9/4 8:54
 */
public class JumpStep {

    public static void main(String[] args) {
        System.out.println(JumpFloorII(4));
    }

    public static int JumpFloorII(int target) {
        if (target <= 0) return 0;
        int[] dp = new int[target + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= target; i++) {
            dp[i] = 2 * dp[i - 1];
        }
        return dp[target];
    }
}
