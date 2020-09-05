package qiuzhao.sougou;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/9/5 18:37
 */
public class Solution02 {

    public static int getHouses (int t, int[] xa) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < xa.length; i = i + 2) {
                list.add(xa[i] - xa[i + 1] / 2);
                list.add(xa[i] + xa[i + 1] / 2);
        }
        int dist = -1;
        int count = 0;
        boolean flag = true;
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 1) {
                dist = list.get(i) - t;
                flag = true;
            } else {
                dist = list.get(i) + t;
                flag = false;
            }
            for (int j = 0; j < list.size(); j++) {
                if (i != j) {
                    if (flag) {
                        if (list.get(j) < i && list.get(j) > dist) {
                            count++;
                            break;
                        }
                    }
                    if (!flag) {
                        if (list.get(j) < dist && list.get(j) > i) {
                            count++;
                            break;
                        }
                    }
                }
            }
        }
        return xa.length - count;
    }

    public static void main(String[] args) {
//        System.out.println(getHouses(2, new int[]{-1, 4, 5, 2}));
        System.out.println(getHouses(1, new int[]{0, 1, 2, 1}));
    }
}
