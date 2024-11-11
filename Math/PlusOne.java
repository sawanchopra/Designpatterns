package LeetCode.Math;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] res = plusOne(arr);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }

    private static int[] plusOne(int[] arr) {
    int n = arr.length;
    for(int i = n-1;i>=0;i--){
        if(arr[i]<9){
            arr[i]++;
            return arr;

        }
        arr[i]=0;

    }
    int[] res = new int[n+1];
     res[0]=1;
     return res;
    }


}
