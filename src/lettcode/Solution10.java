package lettcode;

/**
 * @author: sherlock
 * @description:正则表达式匹配
 * @date: 2020/5/23 22:51
 */
public class Solution10 {

//    public boolean isMatch(String s, String p) {
//        int n = s.length();
//        boolean[] dp = new boolean[n];
//        dp[0] = s.charAt(0) == p.charAt(0) || p.charAt(0) == '.';
//        for (int i = 1; i < n; i++) {
//            if (s.charAt(i) == p.charAt(i)) {
//                dp[i] = dp[i - 1];
//            } else {
//                return false;
//            }
//            if (p.charAt(i) == '.') {
//                dp[i] = dp[i - 1];
//            }
//            if (p.charAt(i) == '*') {
//                if (p.charAt(i - 1) == s.charAt(i)) {
//                    dp[i] = dp[i - 1];
//                } else {
//
//                }
//            }
//        }
//    }

}
