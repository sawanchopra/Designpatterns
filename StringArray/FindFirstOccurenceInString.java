package LeetCode.StringArray;

public class FindFirstOccurenceInString {
    public static void main(String[] args) {
        String haystack = "leetcodelove";
        String needle = "leetcode";
        System.out.println(firstOccurrence(haystack, needle));
    }

    private static int firstOccurrence(String haystack, String needle) {
  if(needle.isEmpty() || haystack.isEmpty() || needle.length() > haystack.length()){
      return -1;

  }
  int  i =0;
  int j=0;
 while(i<haystack.length()&& j<needle.length()){
     if(haystack.charAt(i)==needle.charAt(j)){
         i++;
         j++;
     }
     else {
            i = i-j+1;
            j=0;
     }
 }
 return  j == needle.length() ? i-j :-1;

 }
}
