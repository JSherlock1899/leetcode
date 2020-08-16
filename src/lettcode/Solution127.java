package lettcode;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/8/10 21:36
 */
public class Solution127 {


    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> queue = new LinkedList();
        if (!wordList.contains(endWord)) {
            return 0;
        }
        queue.offer(beginWord);
        int step = 1;
        boolean[] marked = new boolean[wordList.size()+1];//少不了标记
        while (!queue.isEmpty()) {
            int n = queue.size();
            step++;
            for (int count = 0; count < n; count++) {
                String cur = queue.poll();
                for (int i = 0; i < wordList.size(); i++) {
                    if(marked[i])continue;
                    String dic = wordList.get(i);
                    //只差一个字母
                    if(canChange(dic, cur)) {
                        if(dic.equals(endWord))return step;
                        queue.offer(dic);
                        marked[i] = true;
                    }
                }
            }
        }
        return 0;
    }

    //是否可以转换的辅助函数
    public boolean canChange(String s,String t) {
        int diff = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != t.charAt(i))diff++;
        }
        return diff==1;
    }

}
