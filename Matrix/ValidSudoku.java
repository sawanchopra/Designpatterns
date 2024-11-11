package LeetCode.Matrix;

import com.sun.tools.javac.util.Pair;

import java.util.*;

public class ValidSudoku {
    public static void main(String[] args) {
char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println(isValidSudoku(board));

    }

    private static boolean isValidSudoku(char[][] board) {
        HashMap<Integer, Set> colums = new HashMap();
        HashMap<Integer, Set> rows = new HashMap();
        HashMap<Pair<Integer,Integer>, Set> Cubes = new HashMap();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j] =='.'){
                    continue;
                }
                int num = board[i][j];
                if(rows.containsKey(i) && rows.get(i).contains(num)
                        || colums.containsKey(j) && colums.get(j).contains(num)
                        || Cubes.containsKey(new Pair(i/3,j/3)) && Cubes.get(new Pair(i/3,j/3)).contains(num)
                        ){
                    return false;
                }
                Set<Integer> rowSet = rows.getOrDefault(i, new HashSet<>());
                rowSet.add(num);
                rows.put(i, rowSet);

                Set<Integer> columnSet = colums.getOrDefault(j, new HashSet<>());
                columnSet.add(num);
                colums.put(j, columnSet);

                Pair<Integer, Integer> cubeKey = new Pair<>(i/3, j/3);
                Set<Integer> cubeSet = Cubes.getOrDefault(cubeKey, new HashSet<>());
                cubeSet.add(num);
                Cubes.put(cubeKey, cubeSet);
            }

        }
        return true;


    }
}
