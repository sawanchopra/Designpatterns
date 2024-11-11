package TicTacToe;
import com.sun.tools.javac.util.Pair;
import java.util.ArrayList;
import java.util.List;

public class Board {
    public int size;
    public PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        this.board = new PlayingPiece[size][size];
    }

    public Boolean addPiece(PlayingPiece piece, int row, int col) {
        if (board[row][col] != null) {
            return false;
        }
        board[row][col] = piece;
        return true;
        }

       public List<Pair<Integer,Integer>> getFreeCells(){
        List<Pair<Integer,Integer>> freeCells = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (board[i][j] == null) {
                       Pair<Integer,Integer> rowCol = new Pair<>(i,j);
                        freeCells.add(rowCol);
                    }
                }
            }
            return freeCells;
        }
    public void printBoard() {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].pieceType.name() + "   ");
                } else {
                    System.out.print("    ");

                }
                System.out.print(" | ");
            }
            System.out.println();

        }
    }


}
