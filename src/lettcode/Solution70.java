package lettcode;

/**
 * @author: sherlock
 * @description: 爬楼梯 在每一阶楼梯上都有两个选择，走一阶楼梯和两阶楼梯，所以问题转化为了斐波那契数列
 * @date: 2020/8/11 17:40
 */
public class Solution70 {

    public static void main(String[] args) {
        System.out.println(climb_Stairs(45));
    }

    public static int climb_Stairs(int n) {
        int[] arr = new int[n + 1];
        return climbStairs(0, n, arr);
    }

    public static int climbStairs(int i,int n,int[] arr) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        if (arr[i] > 0) {
            return arr[i];
        }
        arr[i] = climbStairs(i + 1, n, arr) + climbStairs(i + 2, n, arr);
        return arr[i];
    }
}
