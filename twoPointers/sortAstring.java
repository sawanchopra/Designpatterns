package LeetCode.twoPointers;

public class sortAstring {
    public static void main(String[] args) {
        String s = "aaaabbbbcccc";
        System.out.println(sortString(s));
    }

    private static String sortString(String s) {
        int[] count = new int[26];
        for(char c : s.toCharArray()){
            count[c-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        while(sb.length() < s.length()){
            for(int i=0;i<26;i++){
                if(count[i]>0){
                    sb.append((char)(i+'a'));
                    count[i]--;
                }
            }
            for(int i=25;i>=0;i--){
                if(count[i]>0){
                    sb.append((char)(i+'a'));
                    count[i]--;
                }
            }
        }
        return sb.toString();
    }


}
