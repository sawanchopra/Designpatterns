package LeetCode.StringArray;

public class productExceptSelfPractice {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = productExceptSelfs(nums);
    }

    private static int[] productExceptSelfs(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = 1;
        for(int i =1;i<n;i++){
            left[i]=left[i-1]*nums[i-1];

        }
        for(int i =n-1;i>=0;i--){
            if(i==n-1){
                right[i]=1;
            }
            else{
                right[i]=right[i+1]*nums[i+1];
            }

        }
        for(int i =0;i<n;i++){
            result[i]=left[i]*right[i];
        }
        return result;
    }
}