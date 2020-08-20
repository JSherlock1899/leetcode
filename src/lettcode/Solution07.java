package lettcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @program: leetcode
 * @description:整数反转，对于这个求每个数位上的值的方法可以好好的借鉴一下呀，循环地对目标数进行 %10 再 /10
 * 这样，每次都能得到最后一位的值。emmmm，666，是我菜了。然后对于这个整数越界的判断方法也要记一下，还是蛮巧妙的呀！
 * @author: sherlock
 * @create: 2019-08-27 23:12
 **/

public class Solution07 {

    public static int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE /10&& pop > 7)) {
                return 0;
            }
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            ans = ans * 10 + pop;
        }
        return ans;
    }



    public static void main(String[] args) {
        System.out.println(reverse(-123));
        //这我以前还真不知道。。。
        System.out.println(-2147483648  == 2147483647 +1);
    }
}
