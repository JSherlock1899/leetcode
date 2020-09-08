package lettcode;

/**
 * @author: sherlock
 * @description:买卖股票的最佳时机 II，dp，dp[i][0]表示第i天没有持有股票的获利情况
 * Case 1，今天我没有股票，有两种可能：
 *
 * 昨天我手上就没有股票，今天不做任何操作（rest）；
 * 昨天我手上有一只股票，今天按照时价卖掉了（sell），收获了一笔钱
 * Case 2，今天持有一只股票，有两种可能：
 *
 * 昨天我手上就有这只股票，今天不做任何操作（rest）；
 * 昨天我没有股票，今天按照时价买入一只（sell），花掉了一笔钱
 * @date: 2020/8/11 19:43
 */
public class Solution122 {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{3,3,5,0,0,3,1,4}));
    }

//    public static int maxProfit(int[] prices) {
//        if (prices.length == 2 && prices[1] > prices[0]) {
//            return prices[1] - prices[0];
//        }
//        if (prices.length < 2) {
//            return 0;
//        }
//        int deal1 = 0;
//        int deal2 = 0;
//        int thisdeal = 0;
//        for (int i = 0; i < prices.length - 1; i++) {
//            int buy = prices[i];
//            int temp = i;
//            while (buy <= prices[temp]) {
//                thisdeal = Math.max(thisdeal, prices[temp] - buy);
//                temp++;
//                if(temp == prices.length){
//                    break;
//                }
//            }
//            if (thisdeal > deal2) {
//                if (thisdeal > deal1) {
//                    deal1 = thisdeal;
//                } else {
//                    deal2 = thisdeal;
//                }
//            }
//        }
//        return deal1 + deal2;
//    }

//    public static int maxProfit(int[] prices) {
//        int n = prices.length;
//        if (n < 2) return 0;
//        int max = 0;
//        for (int i = 1; i < prices.length; i++) {
//            if (prices[i] - prices[i - 1] > 0) {
//                max += prices[i] - prices[i - 1];
//            }
//        }
//        return max;
//    }

    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
        }
        return dp[n - 1][0];
    }
}
