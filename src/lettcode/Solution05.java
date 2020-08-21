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


    public static String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > (end - start)) {
                start = i - (len - 1) / 2;
                end = len / 2 + i;
            }
        }
        return s.substring(start, end + 1);
    }
    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                left--;
                right++;
        }
        //这里是因为此时left和right指针指向的已经是不相等的两个字符了所以要减2，而right - left 又会少1，所以减1
        return right - left - 1;
    }

    public static void main(String[] args) {
        String s = "lcnvoknqgejxbfhijmxglisfzjwbtvhodwummdqeggzfczmetrdnoetmcydwddmtubcqmdjwnpzdqcdhplxtezctvgnpobnnscrmeqkwgiedhzsvskrxwfyklynkplbgefjbyhlgmkkfpwngdkvwmbdskvagkcfsidrdgwgmnqjtdbtltzwxaokrvbxqqqhljszmefsyewwggylpugmdmemvcnlugipqdjnriythsanfdxpvbatsnatmlusspqizgknabhnqayeuzflkuysqyhfxojhfponsndytvjpbzlbfzjhmwoxcbwvhnvnzwmkhjxvuszgtqhctbqsxnasnhrusodeqmzrlcsrafghbqjpyklaaqximcjmpsxpzbyxqvpexytrhwhmrkuybtvqhwxdqhsnbecpfiudaqpzsvfaywvkhargputojdxonvlprzwvrjlmvqmrlftzbytqdusgeupuofhgonqoyffhmartpcbgybshllnjaapaixdbbljvjomdrrgfeqhwffcknmcqbhvulwiwmsxntropqzefwboozphjectnudtvzzlcmeruszqxvjgikcpfclnrayokxsqxpicfkvaerljmxchwcmxhtbwitsexfqowsflgzzeynuzhtzdaixhjtnielbablmckqzcccalpuyahwowqpcskjencokprybrpmpdnswslpunohafvminfolekdleusuaeiatdqsoatputmymqvxjqpikumgmxaxidlrlfmrhpkzmnxjtvdnopcgsiedvtfkltvplfcfflmwyqffktsmpezbxlnjegdlrcubwqvhxdammpkwkycrqtegepyxtohspeasrdtinjhbesilsvffnzznltsspjwuogdyzvanalohmzrywdwqqcukjceothydlgtocukc";
        System.out.println(s.length());
        System.out.println(longestPalindrome(s));
    }

}
