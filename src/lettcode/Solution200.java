package lettcode;

/**
 * @author: sherlock
 * @description:岛屿数量，DFS，沉岛
 * @date: 2020/8/10 21:17
 */
public class Solution200 {

    public static void dfs(char[][] grid, int m, int n) {
        int x = grid.length;
        int y = grid[0].length;
        if (m < 0 || m >= x || n < 0 || n >= y || grid[m][n] == '0') return;
        grid[m][n] = '0';
        dfs(grid, m + 1, n);
        dfs(grid, m - 1, n);
        dfs(grid, m, n + 1);
        dfs(grid, m, n - 1);
    }

    public static int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(grid[i][j]);
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numIslands(new char[][]{{1, 1, 1, 1, 0}, {1, 1, 0, 1, 0}, {1, 1, 0, 0, 0}, {0, 0, 0, 0, 0}}));

    }
}
