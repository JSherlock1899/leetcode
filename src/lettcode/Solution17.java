package lettcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * @author: sherlock
 * @description:电话号码的字母组合
 * @date: 2020/8/26 18:31
 */
public class Solution17 {

    public static List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        if (digits.length() == 0) {
            return res;
        }
        Map<Character, String> map = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
        search("", digits, 0, res, map);
        return res;
    }

    private static void search(String s,String digits,int i,List<String> res,Map<Character,String> map) {
        if (i == digits.length()) {
            res.add(s);
            return;
        }
        String letters = map.get(digits.charAt(i));
        for (int j = 0; j < letters.length(); j++) {
            search(s + letters.charAt(j), digits, i + 1, res, map);
        }
    }


    public static void main(String[] args) {
        Stream.of(letterCombinations("23")).forEach(System.out::println);
    }
}
