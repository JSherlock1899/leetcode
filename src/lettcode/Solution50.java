package lettcode;

/**
 * @author: sherlock
 * @description: Pow(x, n)，求幂函数，也就是实现 pow(x, n)
 * 采用分治思想x的n次方等于x的n/2次方 * x的n/2次方，递归。
 * @date: 2020/8/15 16:22
 */
public class Solution50 {

    public static double myPow(double x, int n) {
        long N = n;
        return N > 0 ? fast_pow(x, N) : 1 / fast_pow(x, -N);

    }

    private static double fast_pow(double x, long  N) {
        if (N == 0) {
            return 1;
        }
        double y = fast_pow(x, N / 2);
        return N % 2 == 1 ? y * y * x : y * y;
    }


    public static void main(String[] args) {
        System.out.println(myPow(0.0000000000001,
                Integer.MIN_VALUE));
    }
}
