package lettcode;

/**
 * @author: sherlock
 * @description:乘积最大子数组，DP，这一题和Solution53不同的地方在于，这一题中最小和最大的值都需要记录，因为会负负得正
 * max = max(nums[i], nums[i]*mx , nums[i]*mn) 最小值同理
 * =============================================================================================
 *
 * @date: 2020/8/21 20:28
 */
public class Solution152 {


    public static int maxProduct(int[] nums) {
        int n = nums.length;
        if (n==1) return nums[0];
        int max = nums[0];
        int min = nums[0];
        int ans = nums[0];
        for (int i = 1; i < n; i++) {
            int temp = max;
            max = Math.max(nums[i], Math.max(max * nums[i], min * nums[i]));
            min = Math.min(nums[i], Math.min(temp * nums[i], min * nums[i]));
            ans = Math.max(ans, max);
        }
        return ans;
    }
    public static void main(String[] args) {
//        System.out.println(maxProduct(new int[]{2, 3, -2, 4}));
        System.out.println(maxProduct(new int[]{-4, -3, -2}));
    }
}
