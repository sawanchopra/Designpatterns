package LeetCode.Matrix;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}};
        rotate(matrix);
    }

    private static void rotate(int[][] matrix) {
         int  l =0;
         int r =matrix.length-1;
         while(l<r) {
             for(int i =0;i<r-l;i++){
                 int top = l;
                 int bottom = r;
                 int temp = matrix[top][l+i];
                 matrix[top][l+i] = matrix[bottom-i][l];
                 matrix[bottom-i][l] = matrix[bottom][r-i];
                 matrix[bottom][r-i] = matrix[top+i][r];
                 matrix[top+i][r] = temp;
             }
             l++;
             r--;
         }






    }
}
