package lettcode;

/**
 * @author: sherlock
 * @description:转换成小写字母，遍历即可
 * 几个常见字母的ASCII码大小： “A”为65；“a”为97；“0”为 48
 * @date: 2020/9/7 17:31
 */
public class Solution709 {

    public static String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] <= 90 && chars[i] >= 65)
                chars[i] += 32;
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        System.out.println(toLowerCase("AFJIAHSjfgSGK"));
    }
}
