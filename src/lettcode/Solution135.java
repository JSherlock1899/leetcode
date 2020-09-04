package lettcode;

import java.util.Arrays;

/**
 * @author: sherlock
 * @description:分发糖果，双数组两次扫描，一次从左到右，一次从右到左
 * @date: 2020/9/4 7:43
 */
public class Solution135 {

    public static int candy(int[] ratings) {
        int n = ratings.length;
        int[] leftToRight = new int[n];
        int[] rightToLeft = new int[n];
        Arrays.fill(leftToRight, 1);
        Arrays.fill(rightToLeft, 1);
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                leftToRight[i] = leftToRight[i - 1] + 1;
            }
        }
        for (int i = n - 1; i > 0; i--) {
            if (ratings[i - 1] > ratings[i]) {
                rightToLeft[i - 1] = rightToLeft[i] + 1;
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.max(leftToRight[i], rightToLeft[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(candy(new int[]{1, 0, 2}));
        System.out.println(candy(new int[]{1, 2, 2}));
        System.out.println(candy(new int[]{1,3,2,2,1}));
        System.out.println(candy(new int[]{1,2,87,87,87,2,1}));
    }
}
