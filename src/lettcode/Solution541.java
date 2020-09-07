package lettcode;

/**
 * @author: sherlock
 * @description:反转字符串 II，和344题一样的思路
 * @date: 2020/9/7 18:39
 */
public class Solution541 {

    public static String reverseStr(String s, int k) {
        int n = s.length();
        if (n == 0) return "";
        char[] chars = s.toCharArray();
        int left = 0;
        int right = n - 1;
        if (n < k || n < 2 * k && n > k) {
            if (n < 2 * k && n > k) {
                right = k - 1;
            }
            swap(left, right, chars);
        } else {
            right = k - 1;
            while (n > 2 * k) {
                swap(left, right, chars);
                left += 2 * k;
                right += 2 * k;
                n -= 2 * k;
            }
            swap(left, right, chars);
        }
        return String.valueOf(chars);
    }

    private static void swap(int left, int right, char[] chars) {
        while (left < right && left < chars.length && right > 0 && right < chars.length) {
            System.out.println("left = " + left);
            System.out.println("right = " + right);
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg",3));
    }
}
