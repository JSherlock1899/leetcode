package qiuzhao.sougou;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/9/5 18:32
 */
public class Solution01 {

    public static void main(String[] args) {
        System.out.println(numberofprize(4,4,2));
        System.out.println(numberofprize(9,3,3));
    }

    public static int numberofprize (int a, int b, int c) {
        int n1 = Math.min(a, Math.min(b, c));
        int temp = -1;
        if (a == n1) {
            temp = a;
        }
        if (b == n1) {
            temp = b;
        }
        if (c == n1) {
            temp = c;
        }
        int count = (a + b + c - 3 * temp) / 2;
        return n1 + count / 2;
    }
}
