package lettcode;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/8/11 19:43
 */
public class Solution122 {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{3,3,5,0,0,3,1,4}));
    }

    public static int maxProfit(int[] prices) {
        if (prices.length == 2 && prices[1] > prices[0]) {
            return prices[1] - prices[0];
        }
        if (prices.length < 2) {
            return 0;
        }
        int deal1 = 0;
        int deal2 = 0;
        int thisdeal = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            int buy = prices[i];
            int temp = i;
            while (buy <= prices[temp]) {
                thisdeal = Math.max(thisdeal, prices[temp] - buy);
                temp++;
                if(temp == prices.length){
                    break;
                }
            }
            if (thisdeal > deal2) {
                if (thisdeal > deal1) {
                    deal1 = thisdeal;
                } else {
                    deal2 = thisdeal;
                }
            }
        }
        return deal1 + deal2;
    }
}
