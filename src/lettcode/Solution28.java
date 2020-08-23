package lettcode;

/**
 * @author: sherlock
 * @description:实现 strStr()，今天状态不好，做个简单的题目缓一缓。。。 字符串的比较就不要一个一个的比啦，直接一段一段的
 * 边比边移。。这算是滑动窗口？？？
 * @date: 2020/8/22 22:11
 */
public class Solution28 {

    public static int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();
        for (int i = 0; i < m - n + 1; i++) {
            if (haystack.substring(i,i+n).equals(needle)) return i;
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
        System.out.println(strStr("aaaaa", "bba"));
    }
}
