package lettcode;

/**
 * @author: sherlock
 * @description:并查集
 * @date: 2020/8/25 19:35
 */
public class Solution547 {

    static int[] father = new int[200];

    public static int findCircleNum(int[][] M) {
        int n = M.length;
        for (int i = 0; i < n; i++) {
            father[i] = i;
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (M[i][j] == 1) {
                    union(i, j);
                }
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (father[i] == i) {
                res++;
            }
        }
        return res;
    }

    public static void union(int x, int y) {
        int rootP = find(x);
        int rootQ = find(y);
        if (rootP != rootQ) {
            father[rootP] = rootQ;
        }

    }

    public static int find(int x) {
        if (father[x] == x) return x;
        //路径压缩
        return father[x] = find(father[x]);
    }


    public static void main(String[] args) {
//        System.out.println(findCircleNum(new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}}));
//        System.out.println(findCircleNum(new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}));
        System.out.println(findCircleNum(new int[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}}));
    }
}


