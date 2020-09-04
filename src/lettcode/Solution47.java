package lettcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: sherlock
 * @description:全排列2，和全排列1差不多，只不过要剪枝
 * @date: 2020/9/3 18:22
 */
public class Solution47 {

    public static List<List<Integer>> permuteUnique(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        if (n==0) return null;
        boolean[] used = new boolean[n];
        List<Integer> path = new ArrayList<>();
        dfs(nums, n, 0, used, path, res);
        return res;
    }

    private static void dfs(int[] nums, int len, int depth, boolean[] used, List<Integer> path, List<List<Integer>> res) {
        if (len == depth) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < len; i++) {
            //剪枝
            if (i > 0 && nums[i] == nums[i - 1] && used[i - 1]) {
                continue;
            }
            if (!used[i]) {
                path.add(nums[i]);
                used[i] = true;
                dfs(nums, len, depth + 1, used, path, res);
                used[i] = false;
                path.remove(path.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> lists = permuteUnique(new int[]{1, 1, 2});
        System.out.println(lists);
    }
}
