package lettcode;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/8/13 12:05
 */
public class Solution43 {

    public static void main(String[] args) {
        System.out.println(multiply("9", "99"));
    }

    public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int m = num1.length();
        int n = num2.length();
        String ans = "0";
        for (int i = n - 1; i >= 0; i--) {
            StringBuffer curr = new StringBuffer();
            int carry = 0;
            for (int j = n - 1; j > i; j--) {
                curr.append(0);
            }
            int y = num2.charAt(i) - '0';
            for (int j = m - 1; j >= 0; j--) {
                int x = num1.charAt(j) - '0';
                int temp = x * y + carry;
                curr.append(temp % 10);
                carry = temp / 10;
            }
            if (carry != 0) {
                curr.append(carry % 10);
            }
            ans = add(ans, curr.reverse().toString());
        }
        return ans;
    }

    private static String add(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        StringBuffer res = new StringBuffer();
        while (i >= 0 || j >= 0) {
            int n1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int n2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            int temp = n1 + n2 + carry;
            carry = temp / 10;
            res.append(temp % 10);
            i--;
            j--;
        }
        if (carry != 0) {
            res.append(1);
        }
        return res.reverse().toString();
    }
}
