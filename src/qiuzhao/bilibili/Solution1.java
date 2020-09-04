package qiuzhao.bilibili;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/9/4 19:20
 */
public class Solution1 {

    public static int GetMaxConsecutiveOnes (int[] arr, int k) {
        // write code here
        int n = arr.length;
        int count = 0;
        int ans = -1;
        int fin = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            ans = Math.max(ans, count);
            if (ans == count) {
                fin = i;
            }
        }
        int[] temp = arr;
        for (int i = fin - 1; i > 0; i--) {
            if (arr[i] == 0 && k != 0) {
                k--;
                arr[i] = 1;
            }
        }
        int max = -1;
        int t = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                t++;
            } else {
                t = 0;
            }
            max = Math.max(max, t);
        }
        return max;
    }



    public static void main(String[] args) {
        System.out.println(GetMaxConsecutiveOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0},2));
    }
}
