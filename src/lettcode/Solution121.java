package lettcode;

/**
 * @author: sherlock
 * @description:买卖股票的最佳时机
 * @date: 2020/8/8 19:11
 */
public class Solution121 {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));

    }
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        int res = 0;
        int currMin = prices[0];
        for (int i = 0; i < prices.length; i++) {
            currMin = Math.min(currMin, prices[i]);
            res = Math.max(res, prices[i] - currMin);
        }
        return res;
    }
}
