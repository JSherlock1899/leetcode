package sort;

import static sort.BubbleSort.*;

/**
 * @author: sherlock
 * @description:快速排序
 * @date: 2020/8/31 11:13
 */
public class QuickSort {

    static void sort(int[] a,int leftRound,int rightRound) {
        if (leftRound >= rightRound) return;
        int mid = partition(a, leftRound, rightRound);
        sort(a, leftRound, mid - 1);
        sort(a, mid + 1, rightRound);
    }

    static int partition(int[] a, int leftRound, int rightRound) {
        int pivot = a[rightRound];
        int left = leftRound;
        int right = rightRound - 1;
        while (left <= right) {
            while (a[left]<=pivot && left<=right) left++;
            while (a[right]>=pivot && left<=right) right--;
            if (left < right) {
                swap(a, left, right);
            }
        }
        swap(a, left, rightRound);
        return left;
    }



    public static void main(String[] args) {
        int[] a = {9 ,3, 1, 4, 6, 8, 7, 5, 2};
        sort(a, 0, a.length - 1);
        print(a);
    }
}
