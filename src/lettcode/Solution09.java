package lettcode;

/**
 * @program: leetcode
 * @description: 回文数，这题就是把数字翻转啦，但是因为是回文，所以翻转一半去比较就可以了，还是蛮巧妙的呀。
 * @author: sherlock
 * @create: 2019-08-28 23:28
 **/

public class Solution09 {

//    public static boolean isPalindrome(int x) {
//        if (x < 0){
//            return false;
//        }
//        int temp = x;
//        int res = 0;
//        while (temp != 0) {
//            int i = temp % 10;
//            temp = temp / 10;
//            res = res * 10 + i;
//        }
//        return res == x;
//    }

    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int resverNum = 0;
        while (x > resverNum) {
            resverNum = resverNum * 10 + x % 10;
            x = x / 10;
        }
        return x == resverNum || x == resverNum / 10;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(11122111));
        System.out.println(isPalindrome(121));
    }
}
