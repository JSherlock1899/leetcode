package lettcode;

/**
 * @author: sherlock
 * @description:重复的子字符串，若是由重复的字符串构成的，那么只要移动，就一定会移动到和原串相同的时候
 * =============================================================================================
 * https://leetcode-cn.com/problems/repeated-substring-pattern/solution/jian-dan-ming-liao-guan-yu-javaliang-xing-dai-ma-s/
 * 这个题解是真的秀
 * @date: 2020/8/24 0:18
 */
public class Solution459 {

    public static boolean repeatedSubstringPattern(String s) {
        String str = s + s;
        return str.substring(1, str.length() - 1).contains(s);
    }

    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("abcabcabcabc"));
    }
}
