package lettcode;

/**
 * @program: leetcode
 * @description: 回文数
 * @author: Mr.Jiang
 * @create: 2019-08-28 23:28
 **/

public class Solution09 {

    public static boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        Integer integer = new Integer(x);
        String s = integer.toString();
        StringBuffer stringBuffer = new StringBuffer(s);
        if (s.equals(stringBuffer.reverse().toString())){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(11122111));
    }
}
