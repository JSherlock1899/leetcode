package lettcode;

/**
 * @author: sherlock
 * @description:x 的平方根 二分查找求平方根，注意当x较大时，如果mid*mid的数仍然使用int类型的话，会越界
 * @date: 2020/8/17 19:20
 */
public class Solution69 {

    public static int mySqrt(int x) {
        int left = 0;
        int right = x;
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((long)mid * mid == x) {
                return mid;
            } else if ((long)mid * mid < x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }
}
