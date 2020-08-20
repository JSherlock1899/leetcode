package lettcode;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author: sherlock
 * @description:扫雷游戏，dfs，这两个数组dx，dy来遍历四周相邻的格子。这个思路还蛮有意思的，学到了。其他的其实也
 * 就是正常dfs，主要就是要注意不同的字母条件。
 * @date: 2020/8/20 16:10
 */
public class Solution529 {

    static int[] dx = {-1, 1, 0, 0, -1, 1, -1, 1};
    static int[] dy = {0, 0, -1, 1, -1, 1, 1, -1};



    public static char[][] updateBoard(char[][] board, int[] click) {
        int x = click[0];
        int y = click[1];
        if (board[x][y] == 'M') {
            board[x][y] = 'X';
        } else {
            dfs(x, y, board);
        }
        return board;
    }

    private static void dfs(int x, int y, char[][] board) {
        int count = 0;
        for (int i = 0; i < 8; i++) {
            int m = x + dx[i];
            int n = y + dy[i];
            if (m < 0 || m >= board.length || n < 0 || n >= board[0].length) {
                continue;
            }
            if (board[m][n] == 'M') {
                count++;
            }
        }
        if (count > 0) {
            board[x][y] =  (char)(count + '0');
            return;
        }
        board[x][y] = 'B';
        for (int i = 0; i < 8; i++) {
            int m = x + dx[i];
            int n = y + dy[i];
            if (m < 0 || m >= board.length || n < 0 || n >= board[0].length || board[m][n] != 'E') {
                continue;
            }
            dfs(m, n, board);
        }
    }



    public static void main(String[] args) {
        char[][] board = new char[][]{{'E', 'E', 'E', 'E', 'E'},
                {'E', 'E', 'M', 'E', 'E'},
                {'E', 'E', 'E', 'E', 'E'},
                {'E', 'E', 'E', 'E', 'E'}};
        int[] click = new int[]{3, 0};
        char[][] chars = updateBoard(board, click);
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[0].length; j++) {
                System.out.print(chars[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
