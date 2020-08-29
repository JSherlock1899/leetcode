package lettcode;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/8/29 18:31
 */
public class Solution384 {

    static int[] temp = null;
    static int[] nums = null;

    public Solution384(int[] nums) {
        this.temp = nums;
        this.nums = nums;
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return temp;
    }

    /** Returns a random shuffling of the array. */
    public static int[] shuffle() {
        Solution384 solution = new Solution384(new int[]{1,2,3,4,5,6});
        int[] nums = solution.nums;
        int j = nums.length - 2;
        for (int i = nums.length - 1; i >= 0; i--) {
            int n = (int)(Math.random()*j+1);
//            System.out.println("n = " + n);
//            System.out.println("i = " + i);
            int temp = nums[i];
            nums[i] = nums[n];
            nums[n] = temp;
            j--;
        }
        return nums;
    }
    public static void main(String[] args) {

         int[] shuffle = shuffle();
        for (int i = 0; i < shuffle.length; i++) {
            System.out.print(shuffle[i] + "\t");
        }


    }
}
