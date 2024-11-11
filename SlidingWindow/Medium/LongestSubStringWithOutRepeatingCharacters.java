package LeetCode.SlidingWindow.Medium;

public class LongestSubStringWithOutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longestSubString(s));
    }

    private static int longestSubString(String s) {
        int  i =0;
        int  j =0;
        int max = 0;
        int[] arr = new int[128];
while(i<s.length()){
    arr[s.charAt(i)]++;
    while(arr[s.charAt(i)]>1){
        arr[s.charAt(j)]--;
        j++;

    }
    max =Math.max (max,i-j+1);
    i++;


}
return max;



    }
}






