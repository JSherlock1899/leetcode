package lettcode;

/**
 * @author: sherlock
 * @description:图像渲染 DFS 注意新要染的颜色很原颜色相同的情况即可
 * @date: 2020/8/16 16:36
 */
public class Solution733 {

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image == null || image.length == 0) {
            return null;
        }
        int value = image[sr][sc];
        dfs(image, sr, sc, newColor,value);
        return image;
    }

    private static void dfs(int[][] image, int sr, int sc, int newColor, int value) {
        int x = image.length;
        int y = image[0].length;

        if (sr < 0 || sr >= x || sc < 0 || sc >= y || image[sr][sc] != value || image[sr][sc] == newColor) {
            return;
        }
        image[sr][sc] = newColor;

        dfs(image, sr, sc + 1, newColor, value);
        dfs(image, sr + 1, sc, newColor, value);
        dfs(image, sr, sc - 1, newColor, value);
        dfs(image, sr - 1, sc, newColor, value);
    }

    public static void main(String[] args) {
        int[][] image = floodFill(new int[][]{{0,0,0}, {0,1,1}}, 1, 1, 1);
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                System.out.print(image[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
