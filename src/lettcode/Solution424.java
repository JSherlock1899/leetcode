package lettcode;

/**
 * @author: sherlock
 * @description:替换后的最长重复字符，和1004题差不多，右指针不断往右移，并记录历史最长重复字符长度，当right - left + 1
 * 也就是窗口长度大于历史最长重复长度 + k时，说明我们已经无法填满这个窗口了，要开始移动左指针
 * @date: 2020/9/5 8:53
 */
public class Solution424 {


    public static int characterReplacement(String s, int k) {
        int[] charMap = new int[26];
        if (s == null | s.length() == 0) return 0;
        int left = 0;
        int right = 0;
        int maxCount = 0;
        char[] chars = s.toCharArray();
        while (right < chars.length) {
            int index = chars[right] - 'A';
            charMap[index]++;
            maxCount = Math.max(maxCount, charMap[index]);
            if (right - left + 1 > maxCount + k) {
                left++;
                charMap[chars[left] - 'A']--;
            }
            right++;
        }
        return chars.length - left;
    }

    public static void main(String[] args) {
        System.out.println(characterReplacement("AABABBA", 1));
        System.out.println(characterReplacement("AABA", 0));
    }

}
