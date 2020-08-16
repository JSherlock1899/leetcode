package lettcode;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/8/14 17:44
 */
public class Solution1036 {

    public static boolean isEscapePossible(int[][] blocked, int[] source, int[] target) {
        if (source.length != 2 || blocked == null || target == null) {
            return false;
        }
        int x = source[0];
        int y = source[1];
        int n = blocked.length;
        int m = blocked[0].length;
        if (x == target[0] && y == target[1]) {
            return true;
        }
        if (x < 0 || x >= n || y < 0 || y >= m || blocked[x][y] == 1) {
            return false;
        }
        isEscapePossible(blocked, new int[]{x + 1, y}, target);
        isEscapePossible(blocked, new int[]{x - 1, y}, target);
        isEscapePossible(blocked, new int[]{x, y + 1}, target);
        isEscapePossible(blocked, new int[]{x, y - 1}, target);
        return false;
    }

    public static void main(String[] args) {
//        System.out.println(isEscapePossible(new int[][]{{0, 1}, {1, 0}}, new int[]{0, 0}, new int[]{0, 2}));
        System.out.println(isEscapePossible(new int[][]{{0, 1}}, new int[]{0, 0}, new int[]{0, 2}));
    }
}
