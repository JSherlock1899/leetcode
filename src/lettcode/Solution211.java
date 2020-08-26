package lettcode;

/**
 * @author: sherlock
 * @description:添加与搜索单词 - 数据结构设计 前缀树 有时间再写吧 。。。。。。
 * @date: 2020/8/26 11:10
 */
public class Solution211 {

    class WordDictionary {

        private WordDictionary[] next = new WordDictionary[26];
        private boolean is_string = false;

        /** Initialize your data structure here. */
        public WordDictionary() {

        }

        /** Adds a word into the data structure. */
        public void addWord(String word) {
            WordDictionary root = this;
            char[] words = word.toCharArray();
            for (int i = 0; i < words.length; i++) {
                if (words[i] == '.') {
                    for (int j = 0; j < 26; j++) {
                        this.next[j] = new WordDictionary();
                    }
                }
                char currentWord = words[i];
                if (root.next[currentWord - 'a'] == null) root.next[currentWord - 'a'] = new WordDictionary();
                root = root.next[currentWord - 'a'];
            }
            this.is_string = true;
        }

        /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
        public boolean search(String word) {
            WordDictionary root = this;
            return match(root, word, 0);

        }

        private boolean match(WordDictionary root, String word, int index) {
            char currentChar = word.charAt(index);
            if (currentChar == '.') {
                match(root, word, index + 1);
            } else {
                if(root.next[currentChar]!=null){
                    root=root.next[currentChar];
                }else{
                    return false;
                }

                for (int i = 0; i < word.length() - index; i++) {
                    if (root.next[currentChar - 'a'] == null) return false;
                    root = root.next[currentChar - 'a'];
                }
            }
            return root.is_string;
        }
    }

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
}
