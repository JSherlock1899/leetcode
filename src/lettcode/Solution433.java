package lettcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/8/10 20:30
 */
public class Solution433 {

    public static int minMutation(String start, String end, String[] bank) {
        HashSet set = new HashSet(Arrays.asList(bank));
        if (!set.contains(end)) {
            return -1;
        }
        Queue<String> queue = new LinkedList();
        char[] four = {'A', 'C', 'G', 'T'};
        queue.offer(start);
        int step = 0;
        while (!queue.isEmpty()) {
            int n = queue.size();
            step++;
            for (int count = 0; count < n; count++) {
                char[] tempChar = queue.poll().toCharArray();
                for (int i = 0; i < tempChar.length; i++) {
                    char oldChar = tempChar[i];
                    for (int j = 0; j < four.length; j++) {
                        tempChar[i] = four[j];
                        String newString = new String(tempChar);
                        if (end.equals(newString)) {
                            return step;
                        } else if (set.contains(newString)) {
                            queue.offer(newString);
                            set.remove(newString);
                        }
                    }
                    tempChar[i] = oldChar;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(minMutation("AACCGGTT", "AACCGGTA", new String[]{"AACCGGTA"}));
    }
}
