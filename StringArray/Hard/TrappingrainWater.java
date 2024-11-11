package LeetCode.StringArray.Hard;

import java.util.Arrays;

public class TrappingrainWater {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }

    private static int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int sum = 0;
        int maxleft = 0;
        int maxright = 0;
        for(int i =0;i<n;i++){
            if(i ==0){
              left[i] = 0;
            }else {
                left[i] = Math.max(height[i - 1], maxleft);
                maxleft =left[i];
            }
        }
        for(int i=n-1;i>=0;i--){
            if(i == n-1){
                right[i] = 0;
            }else{
                right[i] = Math.max(height[i+1],maxright);
                maxright = right[i];
            }

        }
        for(int i=0;i<n;i++){
            int min = Math.min(left[i],right[i]);
            if(min>height[i]){
                sum += min-height[i];
            }


        }

        return sum;

    }
}
