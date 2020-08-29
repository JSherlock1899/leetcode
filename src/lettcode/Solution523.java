package lettcode;

import java.util.HashMap;

/**
 * @author: sherlock
 * @description:连续的子数组和，前缀和，用hashmap，取余再一次到达hashmap中保存的值就说明满足条件
 * @date: 2020/8/28 22:56
 */
public class Solution523 {

    public static boolean checkSubarraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0) return false;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (k != 0) {
                sum %= k;
            }
            if (map.containsKey(sum)) {
                if (i - map.get(sum) > 1)
                    return true;
            } else {
                map.put(sum, i);
            }
        }
        return false;
    }




    public static void main(String[] args) {
        System.out.println(checkSubarraySum(new int[]{23, 2, 6, 4, 7}, 6));
        System.out.println(checkSubarraySum(new int[]{23, 2, 6, 4, 7}, 999));
        System.out.println(checkSubarraySum(new int[]{0,0}, 0));
        System.out.println(checkSubarraySum(new int[]{0,1,0}, 0));

    }
}
