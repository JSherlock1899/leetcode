package lettcode;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/8/8 20:32
 */
public class Solution392 {

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
    }
    public static boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        int p = 0;
        int q = 0;
        while (p < n && q < m) {
            if (s.charAt(p) == t.charAt(q)) {
                p++;
                q++;
            } else {
                q++;
            }
        }
        return p == n;
    }
}
