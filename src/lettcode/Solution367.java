package lettcode;

/**
 * @author: sherlock
 * @description:有效的完全平方数 二分查找，仍然是要注意mid*mid的越界
 * @date: 2020/8/17 19:51
 */
public class Solution367 {

    public static boolean isPerfectSquare(int num) {
        if(num == 0 || num == 1) return true;
        if(num < 0) return false;
        int left = 0;
        int right = num;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((long) mid * mid == num) {
                return true;
            } else if ((long) mid * mid < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(2147483647));
    }
}
