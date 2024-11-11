package LeetCode.Math;

public class Palidrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    private static boolean isPalindrome(int i) {
        if(i<0) return false;
        int num = i;
        int rev = 0;
        while(i>0){
            rev = rev*10+i%10;
            i =i/10;


        }
        return num == rev;


    }
}
