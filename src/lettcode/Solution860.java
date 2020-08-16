package lettcode;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/8/8 20:43
 */
public class Solution860 {

    public static void main(String[] args) {
        System.out.println(lemonadeChange(new int[]{5,5,5,10,20}));
        System.out.println(lemonadeChange(new int[]{5,5,10}));
        System.out.println(lemonadeChange(new int[]{10,10}));
        System.out.println(lemonadeChange(new int[]{5,5,10,10,20}));
    }

    public static boolean lemonadeChange(int[] bills) {
        if (bills[0] == 10 || bills[0] == 20) {
            return false;
        }
        int five = 1;
        int ten = 0;
        int twenty = 0;
        for (int i = 1; i < bills.length; i++) {
            if (bills[i] == 5) {
                five++;
            }
            if (bills[i] == 10) {
                ten++;
                five--;
            }
            if (bills[i] == 20) {
                if (ten > 0) {
                    twenty++;
                    ten--;
                    five--;
                } else {
                    five -= 3;
                }
            }
            if (five < 0 || ten < 0 || twenty < 0) {
                return false;
            }
        }
        return true;
    }
}
