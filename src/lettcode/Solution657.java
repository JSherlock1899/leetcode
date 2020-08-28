package lettcode;

/**
 * @author: sherlock
 * @description:机器人能否返回原点，模拟
 * @date: 2020/8/28 19:56
 */
public class Solution657 {


    public static boolean judgeCircle(String moves) {
        int point = 0;
        int x = 0;
        int y = 0;
        while (point < moves.length()) {
            switch (moves.charAt(point)) {
                case 'U': y++;break;
                case 'D': y--;break;
                case 'R': x++;break;
                case 'L': x--;break;
            }
            point++;
        }
        return x == 0 && y == 0;
    }

    public static void main(String[] args) {
        System.out.println(judgeCircle("UD"));
    }
}
