package lettcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author: sherlock
 * @description:合并区间，首先将intervals按每行第一个数的大小进行排序，如果当前区间的起始位置
 * > 结果数组中最后区间的终止位置，则不合并，直接将当前区间加入结果数组。 反之将当前区间合并至结果数组的最后区间
 * https://leetcode-cn.com/problems/merge-intervals/solution/chi-jing-ran-yi-yan-miao-dong-by-sweetiee/
 * @date: 2020/8/31 16:51
 */
public class Solution56 {


    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (v1, v2) -> v1[0] - v2[0]);
        int[][] res = new int[intervals.length][2];
        int index = -1;
        for (int[] interval : intervals) {
            if (index == -1 || interval[0] > res[index][1]) {
                res[++index] = intervals[index];
            } else {
                res[index][1] = Math.max(res[index][1], interval[1]);
            }
        }
        return Arrays.copyOf(res, index + 1);
    }



    public static void main(String[] args) {
        int[][] A = new int[][]{{1, 3}, {15, 18}, {2, 6}, {8, 10}};
        int[][] merge = merge(A);
        for (int i = 0; i < merge.length; i++) {
            for (int j = 0; j < merge[0].length; j++) {
                System.out.print(merge[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
