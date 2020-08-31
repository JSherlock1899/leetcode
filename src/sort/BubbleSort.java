package sort;

/**
 * @author: sherlock
 * @description:冒泡排序
 * @date: 2020/8/31 10:41
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] a = {9 ,3, 1, 4, 6, 8, 7, 5, 2};
        sort(a);
        print(a);
    }

    static void sort(int[] a) {
        boolean flag = false;
        int lastSwapIndex = 0;
        int sortBorder = a.length - 1;
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < sortBorder; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    flag = true;
                    lastSwapIndex = j;
                }
            }
            sortBorder = lastSwapIndex;
            if (!flag) {
                break;
            }
        }
    }
    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void print(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "，");
        }
    }
}

