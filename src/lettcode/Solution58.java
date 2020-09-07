package lettcode;

/**
 * @author: sherlock
 * @description:最后一个单词的长度，end指针先走。去掉尾部所有的空格，在把start指针指向end指针指向的位置，
 * 继续走直到走到空格，end - start即为最后一个单词的长度
 * @date: 2020/9/7 17:14
 */
public class Solution58 {

//    public static int lengthOfLastWord(String s) {
//        String[] arr = s.split(" ");
//        return arr.length == 0 ? 0 : arr[arr.length - 1].length();
//    }
    public static int lengthOfLastWord(String s) {
        int end = s.length() - 1;
        while (end >= 0 && s.charAt(end) == ' ') end--;
        if (end < 0) return 0;
        int start = end;
        while (start >= 0 && s.charAt(start)!= ' ') start--;
        return end - start;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }
}
