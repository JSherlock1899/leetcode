package qiuzhao.sougou;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashSet;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/9/5 19:11
 */
public class Solution03 {

    public static void main(String[] args) {
        System.out.println(getPasswordCount("1234567890"));
    }

    public static long getPasswordCount (String password) {
        if (password == null || password.length() == 0 ) return 0;
        HashSet<String> set = new HashSet();
        for (int i = 0; i <= 9; i++) {
            dfs(password.length(),1,String.valueOf(i),set,password);
        }
        if (set.contains(password)) {
            return set.size() - 1;
        }
        return set.size();
    }

    public static void dfs(int length, int depth, String s, HashSet set,String password) {
        if (length == depth) {
            set.add(s);
            return;
        }

        int n = Integer.valueOf(password.substring(depth,depth+1));
        int p = n + Integer.valueOf(s.substring(depth - 1, depth));
        int q = p / 2;
        dfs(length, depth + 1, s + String.valueOf(q), set, password);
        if (p % 2 == 1) {
            dfs(length, depth + 1, s + String.valueOf(q + 1), set, password);
        }
    }


}