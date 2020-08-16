package lettcode;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/8/11 21:16
 */
public class Solution130 {

    static int m = 0;  // 行数
    static int n = 0;  // 列数
    public static void solve(char[][] board) {
        // java二维矩阵的行数和列数可能不同，并且每一行的列数可能都不一样
        // 但是肯定是先后行再有列，而且根据题目要求，在这里每一行的列数都是相同的
        m = board.length;       //  行数m
        if (m == 0) {   // 行数为0，board为空
            return;
        }
        n = board[0].length;    // 列数
        // 搜索上下边界的'O'
        for (int i = 0; i < n; i++) {
            if (board[0][i] == 'O') {   //  第一行
                DFS(board, 0, i);   // 标记
            }
            if (board[m - 1][i] == 'O') {      // 最后一行
                DFS(board, m - 1, i);   // 标记
            }
        }
        // 搜索左右边界
        for (int i = 0; i < m ; i++) {
            if (board[i][0] == 'O') {   // 第一列
                DFS(board, i, 0);       // 标记
            }
            if (board[i][n - 1] == 'O') {   // 最后一列
                DFS(board, i, n - 1);   // 标记
            }
        }
        // 标记完，再次遍历，现在矩阵中可能有3中字符，'X','M','O'
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'X') {
                    continue;
                } else if (board[i][j] == 'O'){ // 出现没被标记过的'O'，应该被填充
                    board[i][j] = 'X';
                } else if (board[i][j] == 'M'){ // 被标记过的，不应该被填充，恢复
                    board[i][j] = 'O';
                }
            }
        }
    }

    public static void DFS(char[][] board, int x, int y) {
        // 越界或者不是字符'O'终止
        if (x < 0 || x >= m || y < 0 || y >= n || board[x][y] != 'O') {
            return;
        }
        board[x][y] = 'M';  // 修改为'M'表示这个字符被标记了
        // 搜索四个方向
        DFS(board, x - 1, y);   // 上
        DFS(board, x + 1, y);   // 下
        DFS(board, x, y - 1);   // 左
        DFS(board, x, y + 1);   // 右
    }

//    ----------------------------------------------------------


//    public static void solve(char[][] board) {
//        if (board.length == 0 || board == null) {
//            return;
//        }
//        int m = board.length;
//        int n = board[0].length;
//        for (int i = 0; i < n; i++) {
//            if (board[0][i] == '0') {
//                dfs(0, i, m, n, board);
//            }
//            if (board[m - 1][i] == 'O') {
//                dfs(m - 1, i, m, n, board);
//            }
//        }
//        System.out.println(board[0][0]);
//        for (int i = 0; i < m - 1; i++) {
//            if (board[i][0] == 'O') {
//                dfs(i, 0, m, n, board);
//            }
//            if (board[i][n - 1] == 'O') {
//                dfs(i, n - 1, m, n, board);
//            }
//        }
//        System.out.println(board[0][0]);
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (board[i][j] == 'X') {
//                    continue;
//                } else if (board[i][j] == 'O'){ // 出现没被标记过的'O'，应该被填充
//                    board[i][j] = 'X';
//                } else if (board[i][j] == 'M'){ // 被标记过的，不应该被填充，恢复
//                    board[i][j] = 'O';
//                }
//            }
//        }
//
//    }

    private static void dfs(int x, int y, int m, int n, char[][] board) {
        if (x <= 0 || y <= 0 || x >= m || y >= n || board[x][y] != 'O') return;
        board[x][y] = 'M';
        dfs(x + 1, y, m, n, board);
        dfs(x, y + 1, m, n, board);
        dfs(x - 1, y, m, n, board);
        dfs(x, y - 1, m, n, board);
    }

    public static void main(String[] args) {
        char[][] chars = {{'O', 'X', 'X', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'}, {'X', 'O', 'X', 'X'}};
        print(chars);
        solve(chars);
        print(chars);
    }

    private static void print(char[][] chars) {
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[0].length; j++) {
                System.out.print(chars[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
    }
}
