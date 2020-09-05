package lettcode;

/**
 * @author: sherlock
 * @description:最大连续1的个数
 * @date: 2020/9/5 8:00
 */
public class Solution485 {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        int ans = -1;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }


    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
    }
}
