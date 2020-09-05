package lettcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/9/5 9:23
 */
public class Solution60 {

    public static String getPermutation(int n, int k) {
        int[] nums = new int[n];
        for (int i = 1; i <= n; i++) {
            nums[i - 1] = i;
        }
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        boolean[] used = new boolean[n];
        dfs(nums, n, 0, used, path, res);
        List<Integer> list = res.get(k - 1);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            stringBuilder.append(list.get(i));
        }
        return stringBuilder.toString();
    }

    private static void dfs(int[] nums, int length, int depth, boolean[] used, List<Integer> path, List<List<Integer>> res) {
        if (length == depth) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < length; i++) {
            if (!used[i]) {
                path.add(nums[i]);
                used[i] = true;
                dfs(nums, length, depth + 1, used, path, res);
                used[i] = false;
                path.remove(path.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(getPermutation(3, 3));
        System.out.println(getPermutation(4, 9));
    }
}
