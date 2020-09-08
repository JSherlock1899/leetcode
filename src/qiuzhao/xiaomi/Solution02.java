package qiuzhao.xiaomi;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Random;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/9/8 18:39
 */
public class Solution02 {

    public static void main(String[] args) {
        char[][] arr = new char[][]{{'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (dfs(i,j,arr, 0, "")) {
                    System.out.println(true);
                    break;
                }
            }
        }
        System.out.println(false);
    }

    private static boolean dfs(int i,int j , char[][] arr, int length, String s) {
        if (i < 0 || i > 2 || j < 0 || j > 3) return false;
        if (length == 3) {
            if (s.equals("SEE"))
                return true;
            else
                return false;
        }
        s += arr[i][j];
        dfs(i + 1, j, arr, length + 1, s);
        dfs(i, j + 1, arr, length + 1, s);
        dfs(i - 1, j, arr, length + 1, s);
        dfs(i, j - 1, arr, length + 1, s);
        return false;
    }



}
