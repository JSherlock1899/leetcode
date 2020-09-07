package lettcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: sherlock
 * @description:字符串中的第一个唯一字符，第一遍先哈希表记录所有字符出现的次数。
 * 再次遍历找到第一个只出现一次的字符。
 * @date: 2020/9/7 17:51
 */
public class Solution387 {

    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
