package sort;

import static sort.BubbleSort.print;

/**
 * @author: sherlock
 * @description:归并排序
 * @date: 2020/8/31 13:34
 */
public class MergeSort {

    static void merge(int[] a, int leftPtr, int rightPtr, int rightRound) {
        int mid = rightPtr - 1;
        int i = leftPtr;
        int j = rightPtr;
        int k = 0;
        int[] temp = new int[rightRound - leftPtr + 1];
        while (i <= mid && j <= rightRound) {
            if (a[i] < a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = a[i++];
        }
        while (j <= rightRound) {
            temp[k++] = a[j++];
        }
        for (int m = 0; m < temp.length; m++) {
            a[leftPtr + m] = temp[m];
        }
    }

    static void sort(int[] a, int left, int right) {
       if (left >= right) return;
       //分成两半
        int mid = left + (right - left) / 2;
        //左边排序
        sort(a, left, mid);
        //右边排序
        sort(a, mid + 1, right);
        //合并
        merge(a, left, mid + 1, right);
    }

    public static void main(String[] args) {
        int[] a = {9 ,3, 1, 4, 6, 8, 7, 5, 2};
        sort(a, 0, a.length - 1);
        print(a);
    }
}
