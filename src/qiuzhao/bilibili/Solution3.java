package qiuzhao.bilibili;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/9/4 20:06
 */
public class Solution3 {

    public static int GetFragment (String str) {
        int n = str.length();
        if (n == 0 ) return 0;
        char tempChar = str.charAt(0);
        int sum = 1;
        for (int i = 1; i < n; i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                tempChar = str.charAt(i);
                sum++;
            }
        }
        return n / sum;
    }

    public static void main(String[] args) {
        System.out.println(GetFragment("aaabbaaac"));
    }
}
