package lettcode;

/**
 * @author: sherlock
 * @description:二分查找，若target不存在nums中，那么比较nums[low]与target的大小来确定位置
 * @date: 2020/8/18 20:55
 */
public class Solution35 {

    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int height = nums.length - 1;
        while (low <= height) {
            int mid = low + (height - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                height = mid - 1;
            }
        }
        return nums[low] < target ? low + 1 : low;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6},0));
    }
}
