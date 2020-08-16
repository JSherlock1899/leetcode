package lettcode;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/8/11 17:45
 */
public class Solution509 {

    public static int fib(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
