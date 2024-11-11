package LeetCode.Intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        System.out.println(Arrays.deepToString(merge(intervals)));

    }

    private static int[][] merge(int[][] intervals) {
        if(intervals.length<=1){
            return intervals;

        }
        //Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> result = new ArrayList<>();
        for(int i = 0; i<intervals.length; i++){
            System.out.println("i: "+i);
            int start = intervals[i][0];
            int end = intervals[i][1];
            while(i+1<intervals.length && intervals[i+1][0]<=end){
                end =Math.max(end,intervals[i+1][1]);
                i++;

            }
            result.add(new int[]{start,end});

        }
        return result.toArray(new int[result.size()][]);


    }


}
