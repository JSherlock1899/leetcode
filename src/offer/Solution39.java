package offer;

import java.util.HashMap;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/8/16 17:19
 */
public class Solution39 {

    public static int majorityElement(int[] nums) {
        int length = nums.length;
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (Integer integer : map.keySet()) {
            if (map.get(integer) > length / 2) {
                return integer;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2}));
    }
}
