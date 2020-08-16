package offer;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/8/9 23:09
 */
public class Solution13 {

    public int digit_sum(int digit) {
        int sum = 0;
        while (digit != 0) {
            sum += digit % 10;
            digit /= 10;
        }
        return sum;
    }
    public int difsSolution(int i, int j, int m, int n,int k, boolean[][] visited) {
        if (i < 0 || j < 0 || i >= m || j >= n || digit_sum(i) + digit_sum(j) > k || visited[i][j] == true) {
            return 0;
        }
        visited[i][j] = true;
        return difsSolution(i, j + 1, m, n, k, visited) +
                difsSolution(i + 1, j, m, n, k, visited) + 1;
    }
    public int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        return difsSolution(0, 0, m, n,k, visited);
    }
}
