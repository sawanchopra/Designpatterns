package LeetCode.StringArray.Medium;

import java.util.Arrays;

public class Hindex {
    public static void main(String[] args) {

        int[] citations = {3, 0, 6, 1, 5};
        System.out.println(hIndex(citations));
    }

    private static int hIndex(int[] citations) {
       Arrays.sort(citations);
       int hIndex = 0;
       for(int i=0;i<citations.length;i++){
           int smaller = Math.min(citations[i],citations.length-i);
            hIndex = Math.max(hIndex,smaller);

       }
         return hIndex;


    }
}
