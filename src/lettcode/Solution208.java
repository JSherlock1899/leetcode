package lettcode;

/**
 * @author: sherlock
 * @description:实现 Trie (前缀树)，一种数据结构，可用于搜索引擎的自动补全
 * @date: 2020/8/23 1:30
 */
public class Solution208 {

    class Trie{
        private Trie[] next = new Trie[26];
        private boolean is_string = false;

        public Trie() {

        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            Trie root = this;
            char[] words = word.toCharArray();
            for (int i = 0; i < words.length; i++) {
                char currentWord = words[i];
                if (root.next[currentWord - 'a'] == null) root.next[currentWord - 'a'] = new Trie();
                root = root.next[currentWord - 'a'];
            }
            root.is_string = true;
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            Trie root = this;
            char[] words = word.toCharArray();
            for (int i = 0; i < words.length; i++) {
                char currentWord = words[i];
                if (root.next[currentWord - 'a'] == null) return false;
                root = root.next[currentWord - 'a'];
            }
            return root.is_string;
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            Trie root = this;
            char[] words = prefix.toCharArray();
            for (int i = 0; i < words.length; i++) {
                char currentWord = words[i];
                if (root.next[currentWord - 'a'] == null) return false;
                root = root.next[currentWord - 'a'];
            }
            return true;
        }
    }
}
