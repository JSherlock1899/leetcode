package lettcode;

/**
 * @program: leetcode
 * @description:最长回文子串
 * @author: sherlock
 * @create: 2019-08-26 21:10
 **/

public class Solution05 {

//    public static String longestPalindrome(String s) {
//        if (s.length() < 2) {
//            return s;
//        }
//        int start = 0;
//        int end = 0;
//        int len = 0;
//        String newStr;
//        int startIndex = 0;
//        while (start <= s.length()) {
//            if (end<s.length()){
//                newStr = s.substring(start, ++end);
//                if (newStr.equals(new StringBuilder(newStr).reverse().toString())) {
//                    if (len < newStr.length()) {
//                        startIndex = start;
//                        len = newStr.length();
//                    }
//                }
//            }else {
//                start++;
//                end = start;
//            }
//        }
//        return s.substring(startIndex, startIndex + len);
//    }


//    public static String longestPalindrome(String s) {
//        if (s.length() < 2) {
//            return s;
//        }
//        int start = 0;
//        int end = 0;
//        for (int i = 0; i < s.length(); i++) {
//            int len1 = expandAroundCenter(s, i, i);
//            int len2 = expandAroundCenter(s, i, i + 1);
//            int len = Math.max(len1, len2);
//            if (len > (end - start)) {
//                start = i - (len - 1) / 2;
//                end = len / 2 + i;
//            }
//        }
//        return s.substring(start, end + 1);
//    }
//    private static int expandAroundCenter(String s, int left, int right) {
//        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
//                left--;
//                right++;
//        }
//        //这里是因为此时left和right指针指向的已经是不相等的两个字符了所以要减2，而right - left 又会少1，所以减1
//        return right - left - 1;
//    }
    public static String longestPalindrome(String s) {
        int n = s.length();
        if (n < 2) {
            return s;
        }
        char[] charArray = s.toCharArray();
        int begin = 0;
        int max = 1;
        boolean[][] dp = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }
        for (int j = 1; j < n; j++) {
            for (int i = 0; i < j; i++) {
                if (charArray[i] != charArray[j]) {
                    dp[i][j] = false;
                } else {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
                if (dp[i][j] && j - i + 1 > max) {
                    max = j - i + 1;
                    begin = i;
                }
            }

        }

        return s.substring(begin, begin + max);
    }

    public static void main(String[] args) {
        String s = "lcnvoknqgejxbfhijmxglisfzjwbtvhodwummdqeggzfczmetrdnoetmcydwddmtubcqmdjwnpzdqcdhplxtezctvgnpobnnscrmeqkwgiedhzsvskrxwfyklynkplbgefjbyhlgmkkfpwngdkvwmbdskvagkcfsidrdgwgmnqjtdbtltzwxaokrvbxqqqhljszmefsyewwggylpugmdmemvcnlugipqdjnriythsanfdxpvbatsnatmlusspqizgknabhnqayeuzflkuysqyhfxojhfponsndytvjpbzlbfzjhmwoxcbwvhnvnzwmkhjxvuszgtqhctbqsxnasnhrusodeqmzrlcsrafghbqjpyklaaqximcjmpsxpzbyxqvpexytrhwhmrkuybtvqhwxdqhsnbecpfiudaqpzsvfaywvkhargputojdxonvlprzwvrjlmvqmrlftzbytqdusgeupuofhgonqoyffhmartpcbgybshllnjaapaixdbbljvjomdrrgfeqhwffcknmcqbhvulwiwmsxntropqzefwboozphjectnudtvzzlcmeruszqxvjgikcpfclnrayokxsqxpicfkvaerljmxchwcmxhtbwitsexfqowsflgzzeynuzhtzdaixhjtnielbablmckqzcccalpuyahwowqpcskjencokprybrpmpdnswslpunohafvminfolekdleusuaeiatdqsoatputmymqvxjqpikumgmxaxidlrlfmrhpkzmnxjtvdnopcgsiedvtfkltvplfcfflmwyqffktsmpezbxlnjegdlrcubwqvhxdammpkwkycrqtegepyxtohspeasrdtinjhbesilsvffnzznltsspjwuogdyzvanalohmzrywdwqqcukjceothydlgtocukc";
//        String s = "cbbd";
//        System.out.println(s.length());
        System.out.println(longestPalindrome(s));
    }

}
