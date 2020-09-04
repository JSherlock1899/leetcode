package offer;

/**
 * @author: sherlock
 * @description:二维数组中的查找，线性扫描，从右上角开始扫，根据取到的值和target相比，决定是左移还是下移
 * @date: 2020/9/4 22:04
 */
public class Solution04 {

    public static void main(String[] args) {
        System.out.println(findNumberIn2DArray(new int[][]{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}}, 5));
    }

//    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
//        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
//            return false;
//        }
//        int n = matrix.length;
//        int m = matrix[0].length;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (matrix[i][j] == target) return true;
//            }
//        }
//        return false;
//    }

    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int row = 0;
        int column = matrix[0].length - 1;
        while (row < matrix.length && column >= 0) {
            int num = matrix[row][column];
            if (num == target) {
                return true;
            } else if (num > target) {
                column--;
            } else {
                row++;
            }
        }
        return false;
    }
}
