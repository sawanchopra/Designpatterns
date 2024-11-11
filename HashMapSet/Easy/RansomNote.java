package LeetCode.HashMapSet.Easy;

import java.util.HashMap;

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine));
    }

    private static boolean canConstruct(String ransomNote, String magazine) {
      for(int i=0;i<ransomNote.length();i++){
          if(magazine.contains(ransomNote.charAt(i)+"")){
              magazine = magazine.replaceFirst(ransomNote.charAt(i)+"","");
      }
        else{
            return false;
        }
        }
        return true;
    }
}
