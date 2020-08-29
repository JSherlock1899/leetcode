package lettcode;

/**
 * @author: sherlock
 * @description:长度最小的子数组，双指针，有点像滑动窗口，start指针先不动，end指针不断往后移动，直到sum>=s
 * 比较一下当前的子数组长度是不是最小的，start指针前移一格，继续前面的操作。
 * @date: 2020/8/28 22:38
 */
public class Solution209 {

    public static int minSubArrayLen(int s, int[] nums) {
        if (nums == null||nums.length==0) return 0;
        int start = 0;
        int end = 0;
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        while (end < nums.length) {
            sum += nums[end];
            while (sum >= s) {
                ans = Math.min(ans, end - start + 1);
                sum -= nums[start];
                start++;
            }
            end++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }


    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
    }

}
