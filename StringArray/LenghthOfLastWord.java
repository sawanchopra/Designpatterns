package LeetCode.StringArray;

public class LenghthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }

    private static int lengthOfLastWord(String s) {
        String []words=s.split(" ");
        System.out.println(words);
        return words[words.length-1].length();
    }
}
