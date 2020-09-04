package lettcode;

/**
 * @author: sherlock
 * @description:位1的个数，位运算，n &= (n - 1)就可以把最后的一位1变为0
 * @date: 2020/9/4 10:13
 */
public class Solution191 {

    public static int hammingWeight(int n) {
        int sum = 0;
        while (n != 0) {
            sum++;
            n = n & ~ -n;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(00000000000000000000000000001011));
    }


}
