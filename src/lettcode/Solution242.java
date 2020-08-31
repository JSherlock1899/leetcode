package lettcode;

import java.util.Arrays;

/**
 * @author: sherlock
 * @description:有效的字母异位词，排序即可，注意一下Arrays.equals(ch1, ch2)
 * @date: 2020/8/31 16:17
 */
public class Solution242 {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
    }
}
