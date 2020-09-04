package lettcode;

/**
 * @author: sherlock
 * @description:这种题你把它转成字符串在reverse再转回来的确是可以做的，
 * 但是太复杂了。使用位运算就能变的十分简单。用n&1不断取出n的最后一位，再放到ans中即可。
 * @date: 2020/9/4 11:06
 */
public class Solution190 {

    public static int reverseBits(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            ans = ans << 1 + n & 1;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {


    }
}
