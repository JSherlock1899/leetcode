package lettcode;

/**
 * @author: sherlock
 * @description:移除元素，双指针，貌似这种移除类的题目很多都可以用双指针
 * @date: 2020/9/7 9:00
 */
public class Solution27 {

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }



    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }
}
