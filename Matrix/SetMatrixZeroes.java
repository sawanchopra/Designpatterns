package LeetCode.Matrix;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1},
                          {1, 0, 1},
                          {1, 1, 1}};
        setZeroes(matrix);
    }

    private static void setZeroes(int[][] matrix) {
        boolean firstRowZero = false;
        boolean firstColZero = false;
for(int i=0;i<matrix.length;i++){
    for(int j=0;j<matrix[0].length;j++){
        if(matrix[i][j]==0){
            if(i==0) firstRowZero=true;
            if(j==0) firstColZero=true;
            matrix[i][0]=0;
            matrix[0][j]=0;
        }

    }

}
for(int  i =1;i<matrix.length;i++){
    for(int j=1;j<matrix[0].length;j++){
        if(matrix[i][0]==0||matrix[0][j]==0){
            matrix[i][j]=0;
        }
    }

}
if(firstRowZero){
    for(int i=0;i<matrix[0].length;i++){
        matrix[0][i]=0;
    }
}
if (firstColZero){
    for(int i=0;i<matrix.length;i++){
        matrix[i][0]=0;
    }
}










    }
}