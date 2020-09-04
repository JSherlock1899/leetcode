package offer;

import java.util.stream.Stream;

/**
 * @author: sherlock
 * @description:替换空格，字符数组，新建一个字符数组，遍历原字符串，填到新字符数组中
 * @date: 2020/9/4 22:24
 */
public class Solution05 {

    public static String replaceSpace(String s) {
        char[] charArray = s.toCharArray();
        int size = 0;
        int index = 0;
        char[] res = new char[charArray.length * 3];
        while (index < charArray.length) {
            char c = charArray[index++];
            if (c == ' ') {
                res[size++] = '%';
                res[size++] = '2';
                res[size++] = '0';
            } else {
                res[size++] = c;
            }
        }
        return new String(res, 0, size);
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace("We are happy."));
    }
}
