package lettcode;

import java.util.Arrays;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/8/8 18:58
 */
public class Solution455 {

    public static void main(String[] args) {
        int contentChildren = findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1});
        System.out.println(contentChildren);
    }


    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int p =0;
        int q =0;
        int count = 0;
        while (p < g.length && q < s.length) {
            if (g[p] <= s[q]) {
                count++;
                p++;
                q++;
            } else {
                q++;
            }
        }
        return count;

    }
}
