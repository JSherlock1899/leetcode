package other;

/**
 * @author: sherlock
 * @description: 矩阵转置
 * @date: 2020/8/10 19:02
 */
public class MatrixTranspose {

    public static void main(String[] args) {
        int data [][] = new int [] [] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } } ;
        System.out.println("----------------转置前------------------") ;
        print(data) ;
        reverse(data) ;
        System.out.println("----------------转置后------------------") ;
        print(data) ;
    }

    private static void print(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void reverse(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = i; j < data[i].length; j++) {
                int temp = data[i][j];
                data[i][j] = data[j][i];
                data[j][i] = temp;
            }
        }
    }
}
