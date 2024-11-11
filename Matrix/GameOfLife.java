package LeetCode.Matrix;

public class GameOfLife {
    public static void main(String[] args) {
        int[][] board = {{0, 1, 0},
                          {0, 0, 1},
                          {1, 1, 1},
                          {0, 0, 0}};
        gameOfLife(board);

    }

    private static void gameOfLife(int[][] board) {
        for(int i =0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                 int neighbours=countNeighbours(board,i,j);
                 if(board[i][j]==1){
                     if((neighbours == 2) || (neighbours == 3)) {
                         board[i][j]=3;
                     }
                 }
                 else if(neighbours==3){
                            board[i][j]=2;
                 }

            }

        }
        for(int i =0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
               if(board[i][j]==2 || board[i][j]==3){
                     board[i][j]=1;
                }
                else{
                     board[i][j]=0;
               }
            }
        }


    }

    private static int countNeighbours(int[][] board, int i, int j) {
        int count =0;
        for(int k=0;k<3;k++){
            for(int l=0;l<3;l++){
                if(k==1&&l==1) continue;
                int x = i+k-1;
                int y = j+l-1;
                if(x>=0&&x<board.length&&y>=0&&y<board[0].length){
                   if( (board[x][y]==1) || (board[x][y]==3)){
                          count++;
                   }
                }
            }
        }
        return count;

    }
}
