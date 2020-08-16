package other;

/**
 * @author: sherlock
 * @description: 回环矩阵
 * @date: 2020/8/10 18:52
 */
public class AnnularMatrix {



    private static final int N = 5;           //定义矩阵大小
    private static int[][] numberArray;    //存放矩阵数据的二维数组

    public static void main(String[] args){
        numberArray = new int[N][N];
        numberArray[0][0] = 1;
        RIGHT(numberArray, 0, 0);
        for(int i = 0; i < N; i++){
            for (int j = 0; j < N; j++) {
                System.out.print(numberArray[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //二维数组向右赋值
    private static void RIGHT(int[][] nArray,int x,int y){
        int maxY = nArray[x].length;
        for(int i = 0; i < maxY - 1; i++){
            if(nArray[x][y+1] > 0) break;
            y++;
            nArray[x][y] = nArray[x][y - 1] + 1;
        }
        DOWN(nArray, x, y);
    }
    //二维数组向下赋值
    private static void DOWN(int[][] nArray,int x,int y){
        int maxX = nArray.length;
        for(int i = 0; i < maxX - 1; i++){
            if(nArray[x + 1][y] > 0) break;
            x++;
            nArray[x][y] = nArray[x - 1][y] + 1;
        }
        LEFT(nArray, x, y);
    }
    //二维数组向左赋值
    private static void LEFT(int[][] nArray,int x,int y){

        for(int i = y; i > 0; i--){
            if(nArray[x][y - 1] > 0) break;
            y--;
            nArray[x][y] = nArray[x][y + 1] + 1;
        }
        UP(nArray, x, y);
    }
    //二维数组向上赋值
    private static void UP(int[][] nArray,int x,int y){
        for(int i = x; i > 1; i--){
            if(nArray[x - 1][y] > 0) break;
            x--;
            nArray[x][y] = nArray[x + 1][y] + 1;
        }
        if(nArray[x][y] == N * N) return;
        else RIGHT(nArray, x, y);
    }
}
