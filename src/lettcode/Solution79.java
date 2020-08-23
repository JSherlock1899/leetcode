package lettcode;

/**
 * @author: sherlock
 * @description:单词搜索，dfs，注意从每个点都可以是开始搜索的点，注意把已经走过的路变为@，防止重复使用。
 * @date: 2020/8/23 2:12
 */
public class Solution79 {

    public static boolean exist(char[][] board, String word) {
        if (board == null || word == "") return false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(i, j, board, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean dfs(int x, int y, char[][] board, String word, int index) {
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length || word.charAt(index) != board[x][y]) {
            return false;
        }
        if (word.charAt(index) == board[x][y] && index == word.length() - 1) {
            return true;
        }
        char temp = board[x][y];
        board[x][y] = '@';
        boolean flag = dfs(x + 1, y, board, word, index + 1) ||
                dfs(x - 1, y, board, word, index + 1) ||
                dfs(x, y + 1, board, word, index + 1) ||
                dfs(x, y - 1, board, word, index + 1);
        board[x][y] = temp;
        return flag;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'
                }};
        System.out.println(exist(board, "ABCCED"));
        System.out.println(exist(board, "SEE"));
        System.out.println(exist(board, "ABCB"));
    }
}
