package lettcode;

/**
 * @author: sherlock
 * @description:二分查找，关键点在于int element = matrix[mid / n][mid % n];
 * @date: 2020/8/18 21:24
 */
public class Solution74 {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = n * m - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            //关键
            int element = matrix[mid / n][mid % n];
            if (element == target) {
                return true;
            } else if (element < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
