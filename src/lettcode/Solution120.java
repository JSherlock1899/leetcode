package lettcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: sherlock
 * @description:三角形最小路径和，杨辉三角，首先两边的这个路径，其实只有一条路，加起来就完事了。但是，在中间的路径
 * 它会有两条路可以选择，所以要取其中小的那一条再加上自己。
 * @date: 2020/8/20 20:44
 */
public class Solution120 {

    public static int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] dp = new int[n + 1];
        dp[0] = triangle.get(0).get(0);
        for (int i = 1; i < n; i++) {
            //每行最后一个
            dp[i] = dp[i - 1] + triangle.get(i).get(i);
            for (int j = i - 1; j > 0; j--) {
                //从后往前
                dp[j] = Math.min(dp[j - 1], dp[j]) + triangle.get(i).get(j);
            }
            //每行第一个，给dp[0]赋值下一轮的第一个
            dp[0] += triangle.get(i).get(0);

        }
        int ans = dp[0];
        for (int i = 0; i < n; i++) {
            ans = Math.min(ans, dp[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(2);
        List<Integer> l2 = Arrays.asList(3,4);
        List<Integer> l3 = Arrays.asList(6,5,7);
        List<Integer> l4 = Arrays.asList(4,1,8,3);
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(l1);
        lists.add(l2);
        lists.add(l3);
        lists.add(l4);
        System.out.println(minimumTotal(lists));
    }


}
