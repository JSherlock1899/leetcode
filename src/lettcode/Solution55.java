package lettcode;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/8/8 20:04
 */
public class Solution55 {

    public boolean canJump(int[] nums) {
        if (nums == null) {
            return false;
        }
        int enableReached = nums.length - 1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] + i >= enableReached) {
                enableReached = i;
            }
        }
        return enableReached == 0;
    }
}
