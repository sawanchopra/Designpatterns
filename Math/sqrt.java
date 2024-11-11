package LeetCode.Math;

public class sqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }

    private static int mySqrt(int i) {
        if(i == 0) return 0;
        int left = 1;
        int right = i;
        while(true){
            int mid = left + (right - left)/2;
            if(mid > i/mid){
                right = mid - 1;
            }else{
                if(mid + 1 > i/(mid + 1)){
                    return mid;
                }
                left = mid + 1;
            }
        }

    }
}
