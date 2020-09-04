package qiuzhao.qianxin;

import java.util.Scanner;

/**
 * @author: sherlock
 * @description:奇安信笔试
 * @date: 2020/9/2 14:59
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println(0);
        } else {
            int res = ++n <= 1 ? n : fib(n - 1) + fib(n - 2);
            System.out.println(res);
        }
    }

    public static int fib(int n) {
        return n <= 1 ? n : fib(n - 1) + fib(n - 2);
    }
}
