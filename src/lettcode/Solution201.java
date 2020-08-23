package lettcode;

/**
 * @author: sherlock
 * @description:数字范围按位与，位运算，其实这道题目就是求公共前缀，因为每位上只要有一位为0，那么这一位上就是0，所以
 * 经过这样按位与之后，只有公共部分是不变的。求把m，n一起往右移，直到相等，这样就找到了公共前缀，再把m移回去就好了
 * @date: 2020/8/23 1:12
 */
public class Solution201 {

    public static int rangeBitwiseAnd(int m, int n) {
        int shift = 0;
        while (m != n) {
            m >>= 1;
            n >>= 1;
            shift++;
        }
        return m << shift;
    }

    public static void main(String[] args) {
        System.out.println(rangeBitwiseAnd(5, 7));
    }
}
