package lettcode;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/8/26 9:40
 */
public class Solution990 {

    static int[] father = new int[26];

    public static boolean equationsPossible(String[] equations) {
        for (int i = 0; i < father.length; i++) {
            father[i] = i;
        }
        for (String s: equations) {
            if (s.charAt(1) == '='){
                int i = s.charAt(0) - 'a';
                int j = s.charAt(3) - 'a';
                union(i, j);
            }
        }
        for (String s: equations) {
            if (s.charAt(1) == '!'){
                int i = s.charAt(0) - 'a';
                int j = s.charAt(3) - 'a';
                if (find(i) == find(j)) return false;
            }
        }
        return true;
    }

    public static void union(int x, int y) {
        int rootP = find(x);
        int rootQ = find(y);
        if (rootP != rootQ) {
            father[rootP] = rootQ;
        }
    }

    public static Integer find(int x) {
        if (x == father[x]) return x;
        return father[x] = find(father[x]);
    }

    public static void main(String[] args) {
        System.out.println(equationsPossible(new String[]{"a==b", "b!=c", "c==a"}));
        System.out.println(equationsPossible(new String[]{"c==c","b==d","x!=z"}));
    }
}
