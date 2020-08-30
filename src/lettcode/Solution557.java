package lettcode;

/**
 * @author: sherlock
 * @description:反转字符串中的单词 III
 * @date: 2020/8/30 15:29
 */
public class Solution557 {

    public static String reverseWords(String s) {
        String[] strings = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (String string : strings) {
            res.append(new StringBuffer(string).reverse());
            res.append(" ");
        }
        return res.toString().substring(0, res.length() - 1);
    }


    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

}
