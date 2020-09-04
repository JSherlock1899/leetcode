package offer;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author: sherlock
 * @description:数组中重复的数字，hash表
 * @date: 2020/9/4 21:57
 */
public class Solution03 {

    public static int findRepeatNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return nums[i];
            } else {
                set.add(nums[i]);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findRepeatNumber(new int[]{2, 3, 1, 0, 2, 5, 3}));
    }
}
