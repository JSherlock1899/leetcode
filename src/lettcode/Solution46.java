package lettcode;

import qiuzhao.qianxin.Solution;

import java.util.ArrayList;
import java.util.List;
/**
 * @author: sherlock
 * @description:全排列，dfs + 回溯，注意这部分： path.add(nums[i]);
 *                 used[i] = true;
 *                 dfs(nums, length, depth + 1, used, res, path);
 *                 used[i] = false;
 *                 path.remove(path.size() - 1);
 *                 后两行这就是回溯
 * @date: 2020/9/3 18:04
 */
public class Solution46 {

    public static List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        if(len == 0) return null;
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[len];
        dfs(nums, len, 0, used, res, new ArrayList<>());
        return res;
    }

    private static void dfs(int[] nums, int length, int depth, boolean[] used, List<List<Integer>> res, List<Integer> path) {
        if (length == depth) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < length; i++) {
            if (!used[i]) {
                path.add(nums[i]);
                used[i] = true;
                dfs(nums, length, depth + 1, used, res, path);
                used[i] = false;
                path.remove(path.size() - 1);
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Solution solution = new Solution();
        List<List<Integer>> lists = permute(nums);
        System.out.println(lists);
    }

}
