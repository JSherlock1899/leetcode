package lettcode;

/**
 * @author: sherlock
 * @description:航班预订统计，差分数组
 * @date: 2020/9/8 16:56
 */
public class Solution1109 {

    public int[] corpFlightBookings(
            int[][] bookings, int n) {

        int[] answer = new int[n];

        // 遍历bookings 计算航班i+1 对航班i 变化的预订数
        for (int[] b : bookings) {
            // 增加的预订数
            answer[b[0] - 1] += b[2];
            // 防止数组越界
            if (b[1] < n) {
                // 减少的预订数量
                answer[b[1]] -= b[2];
            }
        }

        // 航班i的预订数等于,i-1的预订数，加i时刻变化的预定数
        for (int i = 1; i < n; i++) {
            answer[i] += answer[i - 1];
        }
        return answer;
    }

}
