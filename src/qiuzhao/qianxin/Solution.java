package qiuzhao.qianxin;

import java.util.Arrays;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/9/2 15:32
 */
public class Solution {

    public static int house (int[] person) {
        int n = person.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int ans = 0;
        for (int i = 1; i < n; i++) {
            if (person[i] > person[i - 1]) {
                dp[i] = dp[i - 1] + 1;
            }
            if (person[i] < person[i - 1]) {
                dp[i - 1] = dp[i] + 1;
            }
            ans += dp[i];
        }
        return ans + dp[0];
    }

    public static void main(String[] args) {
        System.out.println(house(new int[]{3, 2, 4}));
    }
}
