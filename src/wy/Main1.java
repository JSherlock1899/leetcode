package wy;

import java.util.Scanner;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/8/8 15:56
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        long now = System.currentTimeMillis();
        int count = n - m;
        int temp = 1;
        int border = 0;
        while (count != 0) {
            boolean flag = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == temp) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                for (int j = border; j < m; j++) {
                    if (arr[j] > temp) {
                        border = j;
                        for (int p = m; p > j; p--) {
                            arr[p] = arr[p - 1];
                        }
                        arr[j] = temp;
                        count--;
                        m++;
                        break;

                    }
                    if (j == m - 1) {
                        arr[m] = temp;
                        count--;
                        m++;
                        break;
                    }
                }
            }
            temp++;

        }
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            res += arr[i] + " ";
        }
        System.out.println(res.trim());
        long end = System.currentTimeMillis();
        System.out.println(end - now);

    }
}
