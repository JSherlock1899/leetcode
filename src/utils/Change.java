package utils;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/8/26 10:39
 */
public class Change {

    public static String change(String s) {
        String replace = s.replace('[', '{');
        String res = replace.replace(']', '}');
        return res;
    }
    public static void main(String[] args) {
        System.out.println(change("[" +
                "  [1,   4,  7, 11, 15]," +
                "  [2,   5,  8, 12, 19]," +
                "  [3,   6,  9, 16, 22]," +
                "  [10, 13, 14, 17, 24]," +
                "  [18, 21, 23, 26, 30]" +
                "]"));
    }
}
