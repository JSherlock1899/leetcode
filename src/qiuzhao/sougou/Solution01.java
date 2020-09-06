package qiuzhao.sougou;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/9/5 18:32
 */
public class Solution01 {

    public static void main(String[] args) {
        System.out.println(numberofprize(4,4,2));
        System.out.println(numberofprize(9,3,3));
    }



    public static int numberofprize (int a, int b, int c) {
        // write code here
        int left=min(a,b,c);
        int right=max(a,b,c);
        while (left<=right){
            int mid=left+(right-left)/2;
            if (check(mid,a,b,c)){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return right;
    }

    private static boolean check(int mid, int a, int b, int c) {
        long left=0;
        if (a>=mid){
            left+=(a-mid);
        }else {
            left-=(2*(mid-a));
        }
        if (b>=mid){
            left+=(b-mid);
        }else {
            left-=(2*(mid-b));
        }
        if (c>mid){
            left+=(c-mid);
        }else {
            left-=(2*(mid-c));
        }
        return left>=0;
    }

    private static int min(int a, int b, int c) {
        return Math.min(Math.min(a,b),c);
    }
    private static int max(int a, int b, int c) {
        return Math.max(Math.max(a,b),c);
    }
}
