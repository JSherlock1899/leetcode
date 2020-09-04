package lettcode;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/9/4 8:16
 */
public class Solution1103 {

    public static int[] distributeCandies(int candies, int num_people) {
        int[] arr = new int[num_people];
        distribute(arr, candies,1);
        return arr;
    }

    private static void distribute(int[] arr, int candies,int start) {
        for (int i = 0; i < arr.length; i++) {
            candies -= start;
            if (candies <= 0) {
                arr[i] += start + candies;
                return;
            }
            arr[i] += start;
            start++;

        }
        distribute(arr, candies, start);
    }

    public static void main(String[] args) {
        int[] ints = distributeCandies(60, 4);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
