package LeetCode.StringArray;

public class ReverseVowels {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseVowels(s));
    }

    private static String reverseVowels(String s) {

        char[] chars = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        System.out.println("i: "+i+" j: "+j+"-------------");
        while (i<j){
            System.out.println("i: "+i+" j: "+j);
       if(!isVowel(chars[i])){
           i++;
            continue;
        }
         if(!isVowel(chars[j])){
            j--;
            continue;
        }

        char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
    }
        return new String(chars);
    }

    private static boolean isVowel(char aChar) {
        return "aeiouAEIOU".indexOf(aChar) != -1;
    }
    }
