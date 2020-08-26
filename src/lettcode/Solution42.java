package lettcode;

/**
 * @author: sherlock
 * @description:接雨水，暴力，可用备忘录进行优化
 * @date: 2020/8/27 7:36
 */
public class Solution42 {

    public static int trap(int[] height) {
        if (height == null || height.length == 0 ) return 0;
        int n = height.length;
        int ans = 0;
        for (int i = 1; i < n - 1; i++) {
            int left_max = 0;
            int right_max = 0;
            for (int j = i; j >= 0; j--) {
                right_max = Math.max(right_max, height[j]);
            }
            for (int j = i; j < n; j++) {
                left_max = Math.max(left_max, height[j]);
            }
            ans += Math.min(left_max, right_max) - height[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }
}
