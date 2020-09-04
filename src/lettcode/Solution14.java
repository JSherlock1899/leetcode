package lettcode;

/**
 * @author: sherlock
 * @description:最长公共前缀，横向扫描，先第一个和第二个比较得出公共前缀，在把得到的公共前缀和第三个比，依次类推
 * 即可得到整个的最长公共前缀
 * @date: 2020/9/4 13:21
 */
public class Solution14 {


    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        int n = strs.length;
        String prefix = strs[0];
        for (int i = 1; i < n; i++) {
            prefix = longestCommonPrefix(prefix, strs[i]);
            if (prefix.length() == 0) break;
        }
        return prefix;
    }

    private static String longestCommonPrefix(String prefix, String str) {
        int length = Math.min(prefix.length(), str.length());
        int index = 0;
        while (index < length && prefix.charAt(index) == str.charAt(index)) {
            index++;
        }
        return prefix.substring(0, index);
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }
}
