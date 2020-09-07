package lettcode;

/**
 * @author: sherlock
 * @description:反转字符串，头指针++，尾指针--，交换头指针和尾指针
 * @date: 2020/9/7 18:35
 */
public class Solution344 {

    public static void reverseString(char[] s) {
        int n = s.length;
        if (n == 0) return;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }


}
