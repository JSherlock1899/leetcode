package lettcode;

/**
 * @author: sherlock
 * @description:回文子串 中心扩散法 和Solution05差不多啦
 * @date: 2020/8/19 17:27
 */
public class Solution647 {

    public static int countSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = findSubstrings(s, i, i);
            int len2 = findSubstrings(s, i, i + 1);
            count += len1 + len2;
        }
        return count;
    }

    public static int findSubstrings(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSubstrings("abc"));
    }
}
