package LeetCode.twoPointers.Easy;

public class isSubsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequences(s, t));
    }

    private static boolean isSubsequences(String s, String t) {
        int i =0;
        int j =0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;

            }
            j++;
        }
        return i==s.length();
    }
}
