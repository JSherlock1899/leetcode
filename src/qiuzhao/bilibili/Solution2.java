package qiuzhao.bilibili;


import javax.swing.*;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/9/4 19:30
 */
public class Solution2 {

    public static int[] SpiralMatrix (int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return new int[]{};
        int[] res = new int[matrix.length * matrix[0].length];
        RIGHT(matrix, 0, 0, 0, res);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
        return res;
    }


    public static void main(String[] args) {
//        int[][] arr = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[][] arr = new int[][]{{1}, {2}, {3}};
        SpiralMatrix(arr);
    }

    //二维数组向右赋值
    private static void RIGHT(int[][] matrix, int x, int y, int count,int[] res) {
        int maxY = matrix[x].length;
        for (int i = 0; i < maxY - 1; i++) {
            if(matrix.length * matrix[0].length == count) return;
            y++;
            res[count] = matrix[x][y - 1];
            count++;
        }
        DOWN(matrix, x, y,count,res);
    }
    //二维数组向下赋值
    private static void DOWN(int[][] nArray,int x,int y, int count,int[] res){
        int maxX = nArray.length;
        for(int i = 0; i < maxX - 1; i++){
            if(nArray.length * nArray[0].length == count) return;
            x++;
            res[count] = nArray[x - 1][y];
            count++;
        }
        LEFT(nArray, x, y,count,res);
    }
    //二维数组向左赋值
    private static void LEFT(int[][] nArray,int x,int y,int count,int[] res){

        for(int i = y; i > 0; i--){
            if(nArray.length * nArray[0].length == count) return;

            y--;
            res[count] = nArray[x][y + 1];
            count++;
        }
        UP(nArray, x, y,count,res);
    }
    //二维数组向上赋值
    private static void UP(int[][] nArray,int x,int y,int count,int[] res){
        for(int i = x; i > 1; i--){

            x--;
            res[count] = nArray[x + 1][y];
            count++;
        }
        if(nArray.length * nArray[0].length == count) return;
        else RIGHT(nArray, x, y,count,res);
    }
}
