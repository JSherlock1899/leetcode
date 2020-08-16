package lettcode;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/8/8 20:22
 */
public class Solution45 {

    public static void main(String[] args) {
        System.out.println(jump(new int[]{2, 3, 1, 1, 4}));
    }

    public static int jump(int[] nums) {
        int position = nums.length - 1;
        int step = 0;
        while (position > 0) {
            for (int i = 0; i < position; i++) {
                if (i + nums[i] >= position) {
                    position = i;
                    step++;
                }
            }
        }
        return step;
    }
}
