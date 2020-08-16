package lettcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author: sherlock
 * @description: 有效的括号 使用栈，‘）’前面必然需要一个‘（’，所以当遍历到‘）’时，若栈顶为‘（’，即可直接出栈
 * 当遍历结束时，若栈为空栈则为有效的括号
 * @date: 2020/8/14 16:55
 */
public class Solution20 {

    public static boolean isValid(String s) {
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<Character,Character>(){{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                if (stack.isEmpty() || stack.peek() != map.get(ch)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }

        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }
}
