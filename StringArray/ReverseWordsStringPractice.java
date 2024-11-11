package LeetCode.StringArray;

public class ReverseWordsStringPractice {
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }

    private static String reverseWords(String s) {
        String[]words = s.split(" ");;
        StringBuilder sb = new StringBuilder();
       for(int i = words.length-1;i>=0;i--){
          if(!words[i].equals("")){
              sb.append(words[i]).append(" ");
          }

       }
       return sb.toString().trim();

    }
}
