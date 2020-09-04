package lettcode;

import java.util.HashSet;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/9/4 7:38
 */
public class Solution575 {


    public static int distributeCandies(int[] candies) {
        HashSet<Integer> set = new HashSet();
        for (int i = 0; i < candies.length; i++) {
            set.add(candies[i]);
        }
        return candies.length / 2 > set.size() ? set.size() : candies.length / 2;
    }
    public static void main(String[] args) {
        System.out.println(distributeCandies(new int[]{1, 1, 2, 2, 3, 3}));
        System.out.println(distributeCandies(new int[]{1, 1, 2, 3}));
    }


}
