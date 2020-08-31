package sort;

import static sort.BubbleSort.print;
import static sort.BubbleSort.swap;

/**
 * @author: sherlock
 * @description:堆排序
 * @date: 2020/8/31 14:37
 */
public class HeapSort {

    static void heapSort(int[] array) {
        if (array.length == 0) return;
        int length = array.length;
        //建立堆
        for (int i = length - 1 / 2; i >= 0; i--) {
            heapify(array, length, i);
        }
        //取出堆顶元素，再调整堆
        for (int i = length - 1; i > 0; i--) {
            swap(array, 0, i);
            heapify(array, i, 0);
        }
    }

    //调整堆
    static void heapify(int[] array, int length, int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;
        if (left < length && array[left] > array[largest]) {
            largest = left;
        }
        if (right < length && array[right] > array[largest]) {
            largest = right;
        }
        if (largest != i) {
            swap(array, largest, i);
            heapify(array, length, largest);
        }
    }


    public static void main(String[] args) {
        int[] a = {9 ,3, 1, 4, 6, 8, 7, 5, 2};
        heapSort(a);
        print(a);
    }
}
