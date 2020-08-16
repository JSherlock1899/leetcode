package lettcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/8/15 17:38
 */
public class Solution78 {

    public static List<List<Integer>> subsets(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        List<List<Integer>> lists = new ArrayList<>();
        dfs(nums, 0,lists,new ArrayList<>());
        return lists;
    }



    private static void dfs(int[] nums, int index, List<List<Integer>> lists,List list) {
        if (index == nums.length) {
            lists.add(new ArrayList<>(list));
            return;
        }
        dfs(nums, index + 1, lists,list);
        list.add(nums[index]);
        dfs(nums, index + 1, lists,list);
        list.remove(list.size() - 1);
    }

    public static void main(String[] args) {
        Stream.of(subsets(new int[]{1,2,3})).forEach(System.out::println);
    }

}
