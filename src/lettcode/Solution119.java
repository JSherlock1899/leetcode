package lettcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author: sherlock
 * @description:杨辉三角 II，DP，每一行的第一个和最后一个为1，然后就是从后往前加。使用滚动数组，降低空间复杂度。
 * @date: 2020/8/20 22:23
 */
public class Solution119 {

    public static List<Integer> getRow(int rowIndex) {
        int[] dp = new int[rowIndex + 1];
        for (int i = 0; i <= rowIndex; i++) {
            for (int j = i; j >= 0; j--) {
                dp[j] = j == i  || j == 0 ? 1 : dp[j - 1] + dp[j];
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < dp.length; i++) {
            list.add(dp[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        Stream.of(getRow(3)).forEach(System.out::println);
    }
}
