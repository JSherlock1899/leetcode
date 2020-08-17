package lettcode;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/8/17 20:43
 */
public class Solution33 {

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > nums[0] && (target > nums[mid] || target < nums[0])) {
                //[0,mid]有序
                left = mid + 1;
            } else if (target > nums[mid] && target < nums[0]) {
                //[0,mid]为旋转位
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }
}
