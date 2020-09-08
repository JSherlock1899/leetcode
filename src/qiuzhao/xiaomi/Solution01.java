package qiuzhao.xiaomi;

import java.util.Scanner;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/9/8 18:17
 */
public class Solution01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] s = line.split(" ");
        int count = 0;
        boolean numFlag = false;
        boolean lowCharFlag = false;
        boolean upCharFlag = false;
        boolean fuHaoFlag = false;
        for (int i = 0; i < s.length; i++) {
            String currentString = s[i];
            int n = currentString.length();
            if (n < 8 || n > 120) {
                System.out.println(1);
                continue;
            }
            for (int j = 0; j < currentString.length(); j++) {
                char c = currentString.charAt(j);
                int typeValue = getType(c);
                if (typeValue == 0 && !numFlag) {
                    count++;
                    numFlag = true;
                } else if (typeValue == 1 && !upCharFlag) {
                    count++;
                    upCharFlag = true;
                }else if (typeValue == 2 && !lowCharFlag) {
                    count++;
                    lowCharFlag = true;
                } else if (typeValue == 3 && !fuHaoFlag) {
                    count++;
                    fuHaoFlag = true;
                }
            }
            if (count == 4) {
                System.out.println(0);
            } else {
                System.out.println(2);
            }
        }

    }

    public static int getType(char c) {
        int charValue = (int) c;
        if (charValue >= 48 && charValue <= 57) {
            return 0;
        } else if (charValue >= 65 && charValue <= 90) {
            return 1;
        } else if (charValue >= 97 && charValue <= 122) {
            return 2;
        } else if (charValue > 0 && charValue < 48){
            return 3;
        }
        return -1;
    }
}
