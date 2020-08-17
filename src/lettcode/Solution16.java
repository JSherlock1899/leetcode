package lettcode;

import java.util.Arrays;

/**
 * @author: sherlock
 * @description: 最接近的三数之和，排序+双指针
 * @date: 2020/8/17 17:49
 */
public class Solution16 {

//    public static int threeSumClosest(int[] nums, int target) {
//        int min = Integer.MAX_VALUE;
//        int sum = Integer.MAX_VALUE;
//        for (int i = 0; i < nums.length - 2; i++) {
//            for (int j = i + 1; j < nums.length - 1; j++) {
//                for (int m = j + 1; m < nums.length; m++) {
//                    int value = Math.abs(target - nums[i] - nums[j] - nums[m]);
//                    if (value < min) {
//                        min = value;
//                        sum = nums[i] + nums[j] + nums[m];
//                    }
//                }
//            }
//        }
//        return sum;
//    }
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int best = 10000000;

        // 枚举 a
        for (int i = 0; i < n; ++i) {
            // 保证和上一次枚举的元素不相等
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            // 使用双指针枚举 b 和 c
            int j = i + 1, k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                // 如果和为 target 直接返回答案
                if (sum == target) {
                    return target;
                }
                // 根据差值的绝对值来更新答案
                if (Math.abs(sum - target) < Math.abs(best - target)) {
                    best = sum;
                }
                if (sum > target) {
                    // 如果和大于 target，移动 c 对应的指针
                    int k0 = k - 1;
                    // 移动到下一个不相等的元素
                    while (j < k0 && nums[k0] == nums[k]) {
                        --k0;
                    }
                    k = k0;
                } else {
                    // 如果和小于 target，移动 b 对应的指针
                    int j0 = j + 1;
                    // 移动到下一个不相等的元素
                    while (j0 < k && nums[j0] == nums[j]) {
                        ++j0;
                    }
                    j = j0;
                }
            }
        }
        return best;
    }



    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{1,1,-1,-1,3}, -1));
    }
}
