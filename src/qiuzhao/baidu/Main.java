package qiuzhao.baidu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/9/3 19:21
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        int length = nums.length;
        boolean[] used = new boolean[length];
        Arrays.sort(nums);
        int[] temp = new int[length];
        for (int i = length - 1; i > 0; i--) {
            temp[i] = nums[nums.length - 1 - i];
        }
        while (length > 0) {
            dfs(temp, length, 0, used, path, res);
            long l = find(res);
            if (l != -1 && l != 0) {
                System.out.println(l);
                break;
            }

            length--;
            res = new ArrayList<>();
            used = new boolean[temp.length];
            path = new ArrayList<>();
        }
    }

    public static long find(List<List<Integer>> res) {
        int size = res.size();
        long ans = 0;
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            List<Integer> list = res.get(i);
            long r = 0;
            for (int j = list.size() - 1; j >= 0; j--) {
                r = r * 10 + list.get(j);
            }
//            System.out.println("r = " + r);
            if (r % 90 == 0) {
                flag = true;
                ans = r;
                break;
            }
        }
        if (flag) {
            return ans;
        } else {
            return -1;
        }
    }

    private static void dfs(int[] nums, int length, int depth, boolean[] used, List<Integer> path, List<List<Integer>> res) {
        if (length == depth) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < length; i++) {
            if (i > 0 && nums[i] == nums[i - 1] && used[i - 1]) {
                continue;
            }
            if (!used[i]) {
                path.add(nums[i]);
                used[i] = true;
                dfs(nums, length, depth + 1, used, path, res);
                used[i] = false;
                path.remove(path.size() - 1);
            }
        }
    }
}




