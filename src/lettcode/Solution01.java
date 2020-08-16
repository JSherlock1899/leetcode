package lettcode;

import java.util.HashMap;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Jiang
 * @create: 2019-07-14 23:19
 **/

public class Solution01 {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {4,2,3,5,99};
        int target = 5;
        int[] ints = twoSum(nums, target);
        System.out.println(ints[0]);
        System.out.println(ints[1]);
    }
}
