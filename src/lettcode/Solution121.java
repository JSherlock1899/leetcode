package lettcode;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/8/8 19:11
 */
public class Solution121 {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));

    }
    public static int maxProfit(int[] prices) {
        if (prices.length == 2 && prices[1] > prices[0] ) {
            return prices[1] - prices[0];
        }
        if (prices.length < 2)
            return 0;
        int max = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            max = Math.max(max, prices[i] - min);
            if (min > prices[i]) {
                min = prices[i];
            }
        }
        return max;

    }
}
