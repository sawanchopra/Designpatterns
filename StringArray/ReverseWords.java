package LeetCode.StringArray;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }

    private static String reverseWords(String s) {
        int x =s.indexOf(" ");
        if(x == -1){
            return s;

        }
        return reverseWords(s.substring(x+1)) + " " + s.substring(0,x);
    }
}
