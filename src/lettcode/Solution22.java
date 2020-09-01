package lettcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author: sherlock
 * @description:括号生成 n为括号的对数，左括号的个数一定要大于右括号的个数，当左括号的个数小于n时，就加左括号。当左括号加完了
 * 之后，并且右括号的个数小于左括号的个数，再加右括号。
 * @date: 2020/8/11 20:34
 */
public class Solution22 {

    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generate(0, 0, n, "", res);
        return res;
    }

    private static void generate(int left, int right, int n, String s,List res) {
        if (left == n && right == n) {
            res.add(s);
            return;
        }
        if (left < n) generate(left + 1, right, n, s + "(", res);
        if (right < left) generate(left, right + 1, n, s + ")", res);
    }

    public static void main(String[] args) {
        Stream.of(generateParenthesis(3)).forEach(System.out::println);
    }
}
