package LeetCode.twoPointers.Easy;

public class validPalidrome {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(input));
    }

    private static boolean isPalindrome(String input) {
       int  i =0;
       int  j =input.length()-1;
     while(i<j){
         while(i<j && !Character.isLetterOrDigit(input.charAt(i))){
             i++;
         }
         while(i<j && !Character.isLetterOrDigit(input.charAt(j))){
             j--;
         }
         if(i<j && Character.toLowerCase(input.charAt(i))!=Character.toLowerCase(input.charAt(j))){
             return false;
         }
            i++;
            j--;

     }
     return true;


    }
}
