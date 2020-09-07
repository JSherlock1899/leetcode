package lettcode;

/**
 * @author: sherlock
 * @description:宝石与石头,，暴力法，也可使用哈希表来做
 * @date: 2020/9/7 17:26
 */
public class Solution771 {

    public static int numJewelsInStones(String J, String S) {
        char[] char1 = J.toCharArray();
        char[] char2 = S.toCharArray();
        int count = 0;
        for (int i = 0; i < char1.length; i++) {
            for (int j = 0; j < char2.length; j++) {
                if (char1[i] == char2[j]) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA","aAAbbbb"));
    }
}
