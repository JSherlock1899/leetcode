package lettcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/8/10 22:48
 */
public class Solution696 {

    public static void main(String[] args) {
        System.out.println(countBinarySubstrings("00110011"));
    }

    public static int countBinarySubstrings(String s) {
        List<Integer> counts = new ArrayList<>();
        int p = 0;
        while (p < s.length()) {
            int count = 0;
            char c = s.charAt(p);
            while (p < s.length() && c == s.charAt(p)) {
                p++;
                count++;
            }
            counts.add(count);
        }
        int res = 0;
        for (int i = 1; i < counts.size(); i++) {
            res += Math.min(counts.get(i), counts.get(i - 1));
        }
        return res;
    }
}
