package LeetCode.HashMapSet.Medium;

import java.util.HashMap;
import java.util.Vector;

public class EqualRowColumnPairs {
    public static void main(String[] args) {
        int[][] matrix = {{3,2,1}, {1, 7,6}, {2,7,7}};
        System.out.println(EqualRowAndColumnPairs(matrix));
    }

    private static int EqualRowAndColumnPairs(int[][] matrix) {
       HashMap<Vector<Integer>,Integer> map = new HashMap<>();
       int count =0;
       for(int i =0;i<matrix.length;i++){
           Vector<Integer> row = new Vector<>();
           for(int j=0;j<matrix[0].length;j++){
                row.add(matrix[i][j]);
           }

            map.put(row,map.getOrDefault(row,0)+1);
       }
        for(int i =0;i<matrix[0].length;i++){
            Vector<Integer> column = new Vector<>();
            for(int j=0;j<matrix.length;j++){
                column.add(matrix[j][i]);
            }
            if(map.containsKey(column)){
                count+=map.get(column);
            }
        }
        return count;

    }


}
