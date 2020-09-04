package lettcode;

/**
 * @author: sherlock
 * @description:2的幂，位运算，如果是2的幂。那么二进制为必然只有一个1，那么消去它就变成了0
 * @date: 2020/9/4 10:47
 */
public class Solution231 {

    public static boolean isPowerOfTwo(int n) {
        long x = (long) n;
        return n != 0 && (x & (x - 1) ) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }
}
