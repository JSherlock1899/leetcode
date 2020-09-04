package qiuzhao.wy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: sherlock
 * @description:网易提前批笔试
 * @date: 2020/8/8 14:54
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int p = 0; p < t; p++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int litter = 0;
            Arrays.sort(arr);
            for (int j = 0; j < n; j++) {
                int one = 0;
                int two = arr[n - j - 1];
                for (int i = j; i < n; i++) {
                    if (i == (n - j - 1)) {
                        continue;
                    }
                    if (one == two) {
                        System.out.println(litter);
                    } else if (one < two) {
                        one += arr[i];
                    } else if (one > two) {
                        two += arr[i];
                    }
                }
                litter += arr[j];
            }
        }




    }

}
