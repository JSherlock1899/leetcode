package lettcode;

import utils.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author: sherlock
 * @description:杨辉三角，讲道理，这也算动态规划吧，hhhhhhhhhhhh
 * @date: 2020/8/20 22:07
 */
public class Solution118 {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows<1) return res;
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    list.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
                }
            }
            res.add(list);
        }
        return res;
    }

    public static void main(String[] args) {
        Stream.of(generate(0)).forEach(System.out::println);
    }

}
