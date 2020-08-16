package lettcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Jiang
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
        Set<Character> set = new HashSet<>();
        int start = 0;
        int end = 0;
        int ans = 0;
        while (start < s.length() && end < s.length()) {
            if (!set.contains(s.charAt(end))) {
                set.add(s.charAt(end++));
                ans = Math.max(ans, end - start);
            } else {
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
