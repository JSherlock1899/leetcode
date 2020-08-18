package lettcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: leetcode
 * @description:哈希表，设置start指针和end指针，判断set中是否存在end指针指向的字符，如果不存在，则将该字符添加到set中，
 * 直到出现set中存在的字符，从start指针开始移除set中的元素，直到当时end指针所指向的字符已经不存在set中，也就是start指针
 * 指向原来那么重复的字符之后。
 * @author: sherlock
 * @create: 2019-07-14 23:49
 **/

public class Solution03 {

//    public static int lengthOfLongestSubstring(String s) {
//        int n = s.length();
//        int l = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n+1; j++) {
//                if(unique(s,i,j)){
//                    l = Math.max(l,j-i);
//                }
//            }
//        }
//        return l;
//    }
//
//    private static boolean unique(String string, int start, int end) {
//        HashSet<Character> set = new HashSet<Character>();
//        for (int i = start; i < end; i++) {
//            Character s = string.charAt(i);
//            if (!set.contains(s)){
//                set.add(s);
//            }else {
//                return false;
//            }
//        }
//        return true;
//    }

    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int ans = 0;
        int start = 0;
        int end = 0;
        while (start < s.length() && end < s.length()) {
            if (!set.contains(s.charAt(end))) {
                set.add(s.charAt(end++));
                ans = Math.max(ans, end - start);
            }else {
                set.remove(s.charAt(start++));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s ="pwwkew";
        int i = lengthOfLongestSubstring(s);
        System.out.println(i);
    }
}
