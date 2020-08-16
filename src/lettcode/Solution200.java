package lettcode;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/8/10 21:17
 */
public class Solution200 {

    public static void dfs(char[][] grid, int m, int n) {
        int maxX = grid.length;
        int maxY = grid[0].length;
        if (m < 0 || n < 0 || m >= maxX || n >= maxY || grid[m][n] == '0') {
            return;
        }
        grid[m][n] = '0';
        dfs(grid, m, n + 1);
        dfs(grid, m + 1, n);
        dfs(grid, m, n - 1);
        dfs(grid, m - 1, n);
    }

    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int maxX = grid.length;
        int maxY = grid[0].length;
        int num = 0;
        for (int i = 0; i < maxX; i++) {
            for (int j = 0; j < maxY; j++) {
                System.out.println(grid[0][0]);
                if (grid[i][j] == '1') {
                    num++;
                    dfs(grid, i, j);
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(numIslands(new char[][]{{1, 1, 1, 1, 0}, {1, 1, 0, 1, 0}, {1, 1, 0, 0, 0}, {0, 0, 0, 0, 0}}));

    }
}
