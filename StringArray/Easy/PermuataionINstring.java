package LeetCode.StringArray.Easy;

import java.util.HashSet;
import java.util.Set;

import static java.util.Collections.swap;

public class PermuataionINstring {
    public static void main(String[] args) {
        String s1 = "Sawan";
        int n = s1.length();
        Set<String> permutations = permute(s1, 0, n - 1, new HashSet<>());
        System.out.println(permutations);
    }

    private static Set<String> permute(String s1, int l, int r, HashSet<String> result) {
        if(l==r){
            result.add(s1);

        }else{
            for(int i=l;i<=r;i++){
                s1 = swap(s1,l,i);
                permute(s1,l+1,r,result);
                s1 = swap(s1,l,i);
            }
        }
        return result;

    }

    private static String swap(String s1, int l, int i) {
        char[] charArray = s1.toCharArray();
        char temp = charArray[l];
        charArray[l] = charArray[i];
        charArray[i] = temp;
        return String.valueOf(charArray);
    }



















 /*   private static Set<String> permute(String s1, int l, int r, Set<String> result) {
        if (l == r) {
            result.add(s1);
        } else {
            for (int i = l; i <= r; i++) {
                s1 = swap(s1, l, i);
                permute(s1, l + 1, r, result);
                s1 = swap(s1, l, i); // backtrack
            }
        }
        return result;
    }*/

 /*   private static String swap(String s1, int l, int i) {
        char[] charArray = s1.toCharArray();
        char temp = charArray[l];
        charArray[l] = charArray[i];
        charArray[i] = temp;
        return String.valueOf(charArray);
    }*/
}