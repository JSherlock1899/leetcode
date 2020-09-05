package qiuzhao.tonghuashun;

import java.util.HashSet;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/9/5 10:22
 */
public class Test {

    static byte b = 127;
    static String s;
    static HashSet set;
    public static byte get() {
        return ++b;
    }

    public static void main(String[] args) {
        System.out.println(get());
        return;}
}
