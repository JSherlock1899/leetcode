package qiuzhao.bilibili;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: sherlock
 * @description:最大连续1的个数 III，滑动窗口，先设置l，r两个指针，r指针不断往右移直到遇到0，遇到0之后K减1，直到k为0
 * 此时就是以l指针为起点的最大值。然后就平移窗口，直到l指针遇到0，因为窗口中少了一个0，所以l指针可以继续往右移了。
 * @date: 2020/9/4 19:20
 */
public class Solution1 {

        public static int GetMaxConsecutiveOnes(int[] A, int K) {
            int l = 0, r = 0, res = 0;
            while (r < A.length) {
                if (A[r] == 0) {
                    if (K == 0) {
                        while (A[l] == 1) l++;
                        l++;
                    } else {
                        K--;
                    }
                }
                res = Math.max(res, ++r - l);
            }
            return res;
        }



    public static void main(String[] args) {
        System.out.println(GetMaxConsecutiveOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0},2));
    }
}
