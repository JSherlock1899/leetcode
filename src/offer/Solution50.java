package offer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/**
 * @author: sherlock
 * @description:第一个只出现一次的字符，哈希表，也可以使用有序哈希表——LinkedHashMap.
 * 这里<Character, Boolean>是关键
 * @date: 2020/9/4 22:57
 */
public class Solution50 {

    public static char firstUniqChar(String s) {
        HashMap<Character, Boolean> map = new HashMap();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            map.put(c, !map.containsKey(c));
        }
        for (char c : charArray) {
            if (map.get(c)) {
                return c;
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("abaccdeff"));
    }
}
