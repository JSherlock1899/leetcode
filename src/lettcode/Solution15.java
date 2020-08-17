package lettcode;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.util.*;

/**
 * @author: sherlock
 * @description:三数之和，可以先选一个c位，左右两个指针分别按照三个数相加的结果进行移动。
 * 将所有的可能都放到set中以达到去重的目的
 * @date: 2020/8/17 16:12
 */
public class Solution15 {

//    public static List<List<Integer>> threeSum(int[] nums) {
//        Arrays.sort(nums);
//        Set<List<Integer>> set = new HashSet<>();
//        for (int i = 0; i < nums.length - 1; i++) {
//            HashMap<Integer, Integer> map = new HashMap<>();
//            int target = -nums[i];
//            for (int j = i + 1; j < nums.length; j++) {
//                if (map.containsKey(target -(Integer) nums[j])) {
//                    set.add(Arrays.asList(nums[i], nums[j], target - nums[j]));
//                }
//                map.put(nums[j], j);
//            }
//        }
//        List<List<Integer>> lists = new ArrayList<>();
//        Iterator<List<Integer>> it = set.iterator();
//        while (it.hasNext()) {
//            lists.add(it.next());
//        }
//        return lists;
//    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        //数组长度小于3，或者符号全相等，不可能存在，直接返回
        if (nums.length >= 3 && (nums[0] <= 0 && nums[nums.length - 1] >= 0)) {
            for (int i = 1; i < nums.length - 1;i++) {
                int left = 0;
                int right = nums.length - 1;
                while (true) {
                    if (left >= i || right <=i) break;
                    int res = nums[left] + nums[i] + nums[right];
                    if (res == 0) {
                        set.add(Arrays.asList(nums[left], nums[i], nums[right]));
                        while (left < i && nums[left] == nums[++left]);
                        while (right > i &&nums[right] == nums[--right]);
                        //全0
//                        while (i < nums.length - 1) {
//                            if (nums[i] == nums[i + 1]) {
//                                i++;
//                            } else {
//                                break;
//                            }
//                        }
                    } else if (res < 0) {
                        while (nums[left] == nums[++left]  && left < right) ;
                    } else if (res > 0) {
                        while (nums[right] == nums[--right] && left < right) ;
                    } else {
                        break;
                    }
                }
            }
        }
        List<List<Integer>> lists = new ArrayList<>();
        Iterator<List<Integer>> it = set.iterator();
        while (it.hasNext()) {
            lists.add(it.next());
        }
        return lists;
    }
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0}));
    }
}
